package org.finley.inshur.models.weather_models;

import org.json.JSONObject;

public class Wind {
    private final double windSpeedAvg;
    private final double maxGust;
    private final int direction;

    public Wind(double windSpeedAvg, double maxGust, int direction) {
        this.windSpeedAvg = windSpeedAvg;
        this.maxGust = maxGust;
        this.direction = direction;
    }

    public JSONObject toJsonObj() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("windSpeedAvg", windSpeedAvg);
        jsonObject.put("maxGust", maxGust);
        jsonObject.put("direction", direction);
        return jsonObject;
    }


}
