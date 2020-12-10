package com.codewithmohit.interview_q_api_food.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codewithmohit.interview_q_api_food.FoodDetail;
import com.codewithmohit.interview_q_api_food.MainActivity;
import com.codewithmohit.interview_q_api_food.R;
import com.codewithmohit.interview_q_api_food.model.FoodItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.Viewholder> {

    public Context context;
    ArrayList<FoodItem> foodItemArrayList;

    public RecyclerView_Adapter(MainActivity mainActivity,ArrayList<FoodItem> foodItems) {
        this.context = mainActivity;
        this.foodItemArrayList = foodItems;
    }

    @NonNull
    @Override
    public RecyclerView_Adapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent,int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.recyclerview_list, parent, false);
        Viewholder viewHolder = new Viewholder(listItem);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView_Adapter.Viewholder holder,int position) {
        holder.price.setText("$"+foodItemArrayList.get(position).getDineInPrice());
        holder.name.setText(foodItemArrayList.get(position).getName());
        String imageUrl="https://quickeats.co.uk/uploads/foodItems/"+foodItemArrayList.get(position).getImage();
        Picasso.get().load(imageUrl).resize(300,200).into(holder.imageIV);


        holder.imageIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


        Intent intent=new Intent(context,FoodDetail.class);
        intent.putExtra("pos",position);
        intent.putParcelableArrayListExtra("abb",foodItemArrayList);
        context.startActivity(intent);
            }
        });


        holder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"ADDED",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return foodItemArrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView imageIV;
        TextView name;
        TextView price;
        TextView add;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageIV=(ImageView)itemView.findViewById(R.id.imageviewIV);
            name=(TextView) itemView.findViewById(R.id.nameTV);
            price=(TextView)itemView.findViewById(R.id.priceTV);
            add=(TextView)itemView.findViewById(R.id.addTV);
        }
    }


    }