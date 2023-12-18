package org.finley.inshur.services;

import org.finley.inshur.exceptions.OpenWeatherApiErrorException;
import org.finley.inshur.models.Forecast;
import org.finley.inshur.models.Location;
import org.finley.inshur.models.ThreeHourForecastWindow;
import org.finley.inshur.models.weather_models.*;
import org.finley.inshur.repositories.OpenWeatherRepository;
import org.json.JSONObject;

import java.util.ArrayList;

public class OpenWeatherService {
    private OpenWeatherRepository openWeatherRepository;

    public OpenWeatherService(OpenWeatherRepository openWeatherRepository) {
        this.openWeatherRepository = openWeatherRepository;
    }

    public Forecast getForecastForCount(String locationParam, int countParam) throws OpenWeatherApiErrorException {
        var openApiResponse = openWeatherRepository.getForecastForCount(locationParam, countParam);

        var openApiJson = new JSONObject(openApiResponse.getBody());

        if (openApiResponse.isSuccess()) {

            ArrayList<ThreeHourForecastWindow> threeHourWindowsList = new ArrayList<>();

            openApiJson.getJSONArray("list").forEach(item -> {
                var threeHourJson = (JSONObject) item;
                var threeHourObj = new ThreeHourForecastWindow(getGeneral(threeHourJson), getWeatherList(threeHourJson), getWind(threeHourJson), getCloud(threeHourJson), getRain(threeHourJson));
                threeHourWindowsList.add(threeHourObj);
            });

            var locationObj = openApiJson.getJSONObject("city");
            var latLonObj = locationObj.getJSONObject("coord");
            Location location = new Location(locationObj.getString("name"), latLonObj.getDouble("lat"), latLonObj.getDouble("lon"));

            return new Forecast(location, threeHourWindowsList);
        } else {
            throw new OpenWeatherApiErrorException(openApiJson.getString("message"), openApiJson.getString("cod"));
        }
    }

    private Cloud getCloud(JSONObject openApiJson) {
        var cloudJson = openApiJson.getJSONObject("clouds");
        return new Cloud(
                cloudJson.getDouble("all")
        );
    }

    private General getGeneral(JSONObject openApiJson) {
        var mainJson = openApiJson.getJSONObject("main");
        return new General(
                mainJson.getDouble("temp"),
                mainJson.getDouble("feels_like"),
                mainJson.getInt("humidity"),
                mainJson.getInt("pressure")
        );
    }

    private Precipitation getRain(JSONObject openApiJson) {
        double rain = 0.0;
        double snow = 0.0;
        if (openApiJson.has("rain")) {
            var rainJson = openApiJson.getJSONObject("rain");
            rain = rainJson.getDouble("3h");
        }
        if (openApiJson.has("snow")) {
            var snowJson = openApiJson.getJSONObject("snow");
            snow = snowJson.getDouble("3h");
        }
        return new Precipitation(rain, snow);
    }

    private ArrayList<Weather> getWeatherList(JSONObject openApiJson) {
        ArrayList<Weather> weatherList = new ArrayList<>();
        var weatherJsonArr = openApiJson.getJSONArray("weather");
        weatherJsonArr.forEach(item -> {
            var weatherJson = (JSONObject) item;
            weatherList.add(new Weather(
                    weatherJson.getString("main"),
                    weatherJson.getString("description")
            ));
        });

        return weatherList;
    }

    private Wind getWind(JSONObject openApiJson) {
        var windJson = openApiJson.getJSONObject("wind");
        return new Wind(
                windJson.getDouble("speed"),
                windJson.getDouble("gust"),
                windJson.getInt("deg")
        );
    }


}
