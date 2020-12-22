package com.example.weatherreport.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 狒狒 on 2020/12/3.
 */
public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
