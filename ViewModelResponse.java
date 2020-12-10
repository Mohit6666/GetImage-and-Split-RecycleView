package com.codewithmohit.interview_q_api_food.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.codewithmohit.interview_q_api_food.model.FoodItem;
import com.codewithmohit.interview_q_api_food.model.GetResponse;
import com.codewithmohit.interview_q_api_food.web.ApiClient;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ViewModelResponse extends ViewModel {

    private MutableLiveData<ArrayList<FoodItem>> mutableLiveData;



    public LiveData<ArrayList<FoodItem>> getviewmodelmethod() {
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<ArrayList<FoodItem>>();
//            liststring=new  String[]

            responsemethod();
        }
        return mutableLiveData;
    }
    public  void responsemethod(){
    ApiClient.ApiClient().getresponcelist().enqueue(new Callback<GetResponse>() {
        @Override
        public void onResponse(Call<GetResponse> call,Response<GetResponse> response) {
            if (response.isSuccessful()) {


            ArrayList<FoodItem> list = (ArrayList<FoodItem>) response.body().getData().getRestaurantDetail().getFoodItems();
                mutableLiveData.setValue(list);

//            String imageget = response.body().getData().getRestaurantDetail().getImage();
//            String[] imagevalue = imageget.split(",");
//            String name = response.body().getData().getRestaurantDetail().getName();
//            String cousiness = response.body().getData().getRestaurantDetail().getCousines();


        }


        }

        @Override
        public void onFailure(Call<GetResponse> call,Throwable t) {

        }
    });

}
}
