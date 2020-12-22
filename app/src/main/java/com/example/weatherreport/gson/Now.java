package com.example.weatherreport.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 狒狒 on 2020/12/3.
 */
public class Now {
    //现在的温度
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
