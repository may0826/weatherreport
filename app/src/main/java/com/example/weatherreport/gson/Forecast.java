package com.example.weatherreport.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 狒狒 on 2020/12/3.
 */
public class Forecast {
    public String date;
    //预测的后两天日期
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}

