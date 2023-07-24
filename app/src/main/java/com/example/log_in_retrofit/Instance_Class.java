package com.example.log_in_retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Instance_Class
{
    public static API_interface callAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://ashmitashop.000webhostapp.com/AshmitaShop/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(API_interface.class);
    }
}
