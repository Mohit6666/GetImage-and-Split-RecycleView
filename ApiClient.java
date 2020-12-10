package com.codewithmohit.interview_q_api_food.web;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    static Interface interfaceobjct;

    public static Interface ApiClient() {

        if (interfaceobjct == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(logging);


            Retrofit retrofit = new Retrofit.Builder().baseUrl("http://quickeats.co.uk/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
            interfaceobjct = retrofit.create(Interface.class);


        }
        return interfaceobjct;
    }
}

