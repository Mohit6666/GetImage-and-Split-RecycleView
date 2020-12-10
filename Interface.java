package com.codewithmohit.interview_q_api_food.web;

import com.codewithmohit.interview_q_api_food.model.GetResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface {
    @GET("apiTest.php")
    Call<GetResponse> getresponcelist();
    // http://quickeats.co.uk/apiTest.php

}
