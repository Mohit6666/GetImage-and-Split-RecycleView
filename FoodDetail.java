package com.codewithmohit.interview_q_api_food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.codewithmohit.interview_q_api_food.model.FoodItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class FoodDetail extends AppCompatActivity {
    ArrayList<FoodItem> detaillist;
    TextView namee;
    TextView pricee;
    ImageView im;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        namee=(TextView)findViewById(R.id.namefoodTV);
        pricee=(TextView)findViewById(R.id.pricefoodTV);
        im=(ImageView)findViewById(R.id.imageviewIV);
        Intent intent=getIntent();
        int pos =intent.getIntExtra("pos",0);
        detaillist=intent.getParcelableArrayListExtra("abb");
        namee.setText(detaillist.get(pos).getName());
        pricee.setText("$ "+detaillist.get(pos).getDeliveryPrice());

        String image="https://quickeats.co.uk/uploads/foodItems/"+detaillist.get(pos).getImage();
        Picasso.get().load(image).resize(600,400).into(im);



    }
}
