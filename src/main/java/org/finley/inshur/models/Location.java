package org.finley.inshur.models;

import org.json.JSONObject;

public class Location {

    private final String location;
    private final double lat;
    private final double lon;

    public Location(String location, double lat, double lon) {
        this.location = location;
        this.lat = lat;
        this.lon = lon;
    }

    public JSONObject toJsonObj() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("location", location);
        jsonObject.put("lat", lat);
        jsonObject.put("lon", lon);
        return jsonObject;
    }
}
