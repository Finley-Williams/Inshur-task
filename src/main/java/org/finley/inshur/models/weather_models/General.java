package org.finley.inshur.models.weather_models;

import org.json.JSONObject;

public class General {
    private final double temp;
    private final double feelsLike;
    private final int humidity;
    private final int pressure;

    public General(double temp, double feelsLike, int humidity, int pressure) {
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public JSONObject toJsonObj() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("temp", temp);
        jsonObject.put("feelsLike", feelsLike);
        jsonObject.put("humidity", humidity);
        jsonObject.put("pressure", pressure);
        return jsonObject;
    }

}
