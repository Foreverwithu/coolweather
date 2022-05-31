package com.example.qweathertest.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond_txt")
    public More more;


    public class More{
        @SerializedName("txt")
        public String info;
    }


}
