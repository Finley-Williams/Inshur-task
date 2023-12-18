package org.finley.inshur.models.weather_models;

import org.json.JSONObject;

public class Cloud {
    private final double cloud;

    public Cloud(double cloud) {
        this.cloud = cloud;
    }

    public JSONObject toJsonObj() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("cloud", cloud);
        return jsonObject;
    }
}
