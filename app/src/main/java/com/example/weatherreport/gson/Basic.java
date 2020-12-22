package com.example.weatherreport.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 狒狒 on 2020/12/3.
 */
//由于有些字段不太适合直接用来作为Java字段命名，所以这里使用注解的方式来
// 让json字段之间建立映射关系，相当于为原json字段取了一个别名
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
