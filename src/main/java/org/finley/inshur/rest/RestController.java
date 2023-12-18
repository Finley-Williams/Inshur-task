package org.finley.inshur.rest;

import io.javalin.Javalin;
import io.javalin.http.Context;
import org.finley.inshur.exceptions.OpenWeatherApiErrorException;
import org.finley.inshur.models.Forecast;
import org.finley.inshur.services.HourToThreeHourWindowService;
import org.finley.inshur.services.OpenWeatherService;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;

public class RestController {

    private final OpenWeatherService openWeatherService;
    private final HourToThreeHourWindowService hourToThreeHourWindowService;

    public RestController(Javalin app, OpenWeatherService openWeatherService, HourToThreeHourWindowService hourToThreeHourWindowService) {
        this.openWeatherService = openWeatherService;
        this.hourToThreeHourWindowService = hourToThreeHourWindowService;

        app.get("getLocationWeather", this::getLocationWeather);

    }

    private void getLocationWeather(Context ctx) {
        var req = ctx.req;
        try {
            Forecast forecastObj = openWeatherService.getForecastForCount(
                    req.getParameter("location"),
                    hourToThreeHourWindowService.convertHoursToThreeHourWindows(Integer.parseInt(req.getParameter("hours")))
            );
            ctx.status(200);
            ctx.contentType("application/json");
            ctx.result(forecastObj.toJsonString());
        } catch (OpenWeatherApiErrorException e) {
            handleOpenApiException(e, ctx);
        } catch (NumberFormatException e) {
            handleNumberException(req, ctx);
        }
    }

    private void handleOpenApiException(OpenWeatherApiErrorException e, Context ctx){
        ctx.status(Integer.parseInt(e.getStatusCode()));
        var errorJson = new JSONObject();
        errorJson.put("message", e.getMessage());
        ctx.contentType("application/json");
        ctx.result(errorJson.toString());
    }

    private void handleNumberException(HttpServletRequest req, Context ctx){
        ctx.status(400);
        var errorJson = new JSONObject();
        errorJson.put("message", req.getParameter("hours") + " is not a number");
        ctx.contentType("application/json");
        ctx.result(errorJson.toString());
    }
}
