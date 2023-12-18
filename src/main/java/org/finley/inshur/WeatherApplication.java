package org.finley.inshur;

import io.javalin.Javalin;
import org.finley.inshur.rest.RestController;
import org.finley.inshur.repositories.OpenWeatherRepository;
import org.finley.inshur.services.ApiKeyService;
import org.finley.inshur.services.HourToThreeHourWindowService;
import org.finley.inshur.services.OpenWeatherService;

public class WeatherApplication {

    private static final String WEATHER_API_ENDPOINT = "https://api.openweathermap.org";

    private Javalin app;
    private final HourToThreeHourWindowService hourToThreeHourWindowService = new HourToThreeHourWindowService();
    private final ApiKeyService apiKeyService = new ApiKeyService();

    public static void main(String[] args) {
        WeatherApplication weatherApplication = new WeatherApplication();
        weatherApplication.run();
    }

    public void run() {
        OpenWeatherRepository openWeatherRepository = new OpenWeatherRepository(WEATHER_API_ENDPOINT, apiKeyService);
        OpenWeatherService openWeatherService = new OpenWeatherService(openWeatherRepository);
        app = Javalin.create().start(5000);
        new RestController(app, openWeatherService, hourToThreeHourWindowService);
    }

    public void start() {
        OpenWeatherRepository openWeatherRepository = new OpenWeatherRepository("http://localhost:666", apiKeyService);
        OpenWeatherService openWeatherService = new OpenWeatherService(openWeatherRepository);
        app = Javalin.create().start(5000);
        new RestController(app, openWeatherService, hourToThreeHourWindowService);
    }

    public void stop() {
        app.stop();
        System.exit(1);
    }
}
