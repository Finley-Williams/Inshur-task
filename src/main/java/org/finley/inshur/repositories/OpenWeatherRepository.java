package org.finley.inshur.repositories;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.finley.inshur.services.ApiKeyService;

public class OpenWeatherRepository {

    private static final String FORECAST_ENDPOINT = "/data/2.5/forecast";
    private final String host;
    private ApiKeyService apiKeyService;

    public OpenWeatherRepository(String host, ApiKeyService apiKeyService) {
        this.host = host;
        this.apiKeyService = apiKeyService;
    }

    public HttpResponse<String> getForecastForCount(String location, Integer count) {
        var endpoint = host + FORECAST_ENDPOINT;
        var response = Unirest.get(endpoint)
                .queryString("q", location)
                .queryString("cnt", count)
                .queryString("appid", apiKeyService.getApiKey())
                .queryString("units", "metrics");
        return response.asString();
    }
}
