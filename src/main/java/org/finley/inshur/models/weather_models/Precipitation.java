package org.finley.inshur.models.weather_models;

import org.json.JSONObject;

public class Precipitation {
    private final double rain;
    private final double snow;

    public Precipitation(double rain, double snow) {
        this.rain = rain;
        this.snow = snow;
    }

    public JSONObject toJsonObj() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rain", rain);
        jsonObject.put("snow", snow);
        return jsonObject;
    }
}
