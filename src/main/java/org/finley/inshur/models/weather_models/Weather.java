package org.finley.inshur.models.weather_models;

import org.json.JSONObject;

public class Weather {
    private final String predominatingWeather;
    private final String description;

    public Weather(String predominatingWeather, String description) {
        this.predominatingWeather = predominatingWeather;
        this.description = description;
    }

    public JSONObject toJsonObj() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("predominatingWeather", predominatingWeather);
        jsonObject.put("description", description);
        return jsonObject;
    }
}
