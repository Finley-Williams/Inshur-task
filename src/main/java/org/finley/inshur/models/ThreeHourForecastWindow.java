package org.finley.inshur.models;

import org.finley.inshur.models.weather_models.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class ThreeHourForecastWindow {
 private final General general;
 private final List<Weather> weatherList;
 private final Wind wind;
 private final Cloud cloud;
 private final Precipitation precipitation;

    public ThreeHourForecastWindow(General general, List<Weather> weatherList, Wind wind, Cloud clouds, Precipitation precipitation) {
        this.general = general;
        this.weatherList = weatherList;
        this.wind = wind;
        this.cloud = clouds;
        this.precipitation = precipitation;
    }

    private JSONArray weatherListToJsonArr(){
        JSONArray jsonArray = new JSONArray();
        weatherList.forEach(item -> jsonArray.put(item.toJsonObj()));
        return jsonArray;
    }

    public JSONObject toJsonObj() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("generalDetails", general.toJsonObj());
        jsonObject.put("windDetails", wind.toJsonObj());
        jsonObject.put("weatherDetails", weatherListToJsonArr());
        jsonObject.put("cloudDetails", cloud.toJsonObj());
        jsonObject.put("precipitationDetails", precipitation.toJsonObj());
        return jsonObject;
    }
}
