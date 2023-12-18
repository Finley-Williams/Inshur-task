package org.finley.inshur.models;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class Forecast {

    private final Location location;
    private final List<ThreeHourForecastWindow> threeHourForecastWindowList;

    public Forecast(Location location, List<ThreeHourForecastWindow> threeHourForecastWindow) {
        this.location = location;
        this.threeHourForecastWindowList = threeHourForecastWindow;
    }

    public String toJsonString() {
        JSONObject responseJson = new JSONObject();
        responseJson.put("location", location.toJsonObj());

        JSONArray timeWindowsArr = new JSONArray();
        threeHourForecastWindowList.forEach(item -> timeWindowsArr.put(item.toJsonObj()));
        responseJson.put("timeWindows", timeWindowsArr);
        return responseJson.toString();
    }
}
