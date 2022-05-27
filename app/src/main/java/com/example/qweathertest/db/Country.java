package com.example.qweathertest.db;

import org.litepal.crud.LitePalSupport;

public class Country extends LitePalSupport {


    private int id;
    private String countyName;//县城名字
    private String weatherId;//当前先驱的天气id
    private int cityId;//当前县所属的城市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;

    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
