package com.example.weatherreport.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 狒狒 on 2020/12/3.
 */
public class County extends DataSupport {
    private int id;
    private String countyName;//县的名字
    private String weatherId;//县所对应的天气id

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    private int cityId;//当前县所对市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

