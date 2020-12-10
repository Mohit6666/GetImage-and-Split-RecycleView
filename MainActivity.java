package com.codewithmohit.interview_q_api_food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.codewithmohit.interview_q_api_food.adapter.RecyclerView_Adapter;
import com.codewithmohit.interview_q_api_food.adapter.View_pager_Adapter;
import com.codewithmohit.interview_q_api_food.model.FoodItem;
import com.codewithmohit.interview_q_api_food.model.GetResponse;
import com.codewithmohit.interview_q_api_food.viewmodel.ViewModelResponse;
import com.codewithmohit.interview_q_api_food.web.ApiClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView=findViewById(R.id.recyclerviewRV);
        ViewPager viewpagerVP=findViewById(R.id.viewpagerVP);
        TextView resturantnameTV=findViewById(R.id.resturantnameTV);
        TextView resturantadresssTV=findViewById(R.id.resturantadresssTV);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        int numberOfColumns = 2;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));


        ViewModelResponse viewModelobj= new  ViewModelProvider(this).get(ViewModelResponse.class);
        viewModelobj.responsemethod();

        viewModelobj.getviewmodelmethod().observe(this,new Observer<ArrayList<FoodItem>>() {
            @Override
            public void onChanged(ArrayList<FoodItem> foodItems) {
                recyclerView.setAdapter(new RecyclerView_Adapter(MainActivity.this,foodItems));
}
        });

        ApiClient.ApiClient().getresponcelist().enqueue(new Callback<GetResponse>() {
            @Override
            public void onResponse(Call<GetResponse> call,Response<GetResponse> response) {


                String name = response.body().getData().getRestaurantDetail().getName();
                String cousiness = response.body().getData().getRestaurantDetail().getCousines();
                String imageget = response.body().getData().getRestaurantDetail().getImage();
                String[] imagevalue = imageget.split(",");
                resturantnameTV.setText(name);
                resturantadresssTV.setText(cousiness);

                viewpagerVP.setAdapter(new View_pager_Adapter(MainActivity.this,imagevalue));




            }

            @Override
            public void onFailure(Call<GetResponse> call,Throwable t) {

            }
        });


    }
}
