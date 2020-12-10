package com.codewithmohit.interview_q_api_food.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;


import com.codewithmohit.interview_q_api_food.MainActivity;
import com.codewithmohit.interview_q_api_food.R;
import com.codewithmohit.interview_q_api_food.model.FoodItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class View_pager_Adapter extends PagerAdapter {
String[] imageArraylist;

    Context mContext;
    LayoutInflater mLayoutInflater;

    public View_pager_Adapter(MainActivity mainActivity,String[] imagevalue) {
        this.imageArraylist = imagevalue;
        this.mContext=mainActivity;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imageArraylist.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.view_pager_, container, false);


        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageviewpagerIV);
        String image =("https://quickeats.co.uk/uploads/restaurants/"+imageArraylist[position]);
        Picasso.get().load(image).resize(1000,700).into(imageView);

//        imageView.setImageURI((imageArraylist[position]));

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}















//    public Context mContext;
//
//    public View_pager_Adapter(MainActivity mainActivity) {
//
//        mContext=mainActivity;
//
//    }
//
//    @Override
//    public Object instantiateItem(ViewGroup collection,int position) {
////        CustomPagerEnum customPagerEnum = CustomPagerEnum.values()[position];
////        LayoutInflater inflater = LayoutInflater.from(mContext);
////        ViewGroup layout = (ViewGroup) inflater.inflate(MainActivity.getLayoutResId(), collection, false);
////        collection.addView(layout);
////        return layout;
//        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
//        View listItem= layoutInflater.inflate(R.layout.view_pager_adapter_list, collection, false);
//    collection.addView(listItem);
//    return listItem;
//    }
//
//    @Override
//    public void destroyItem(ViewGroup collection, int position, Object view) {
//        collection.removeView((View) view);
//    }
//
//    @Override
//    public int getCount() {
//        return 0;
//    }
//
//    @Override
//    public boolean isViewFromObject(View view, Object object) {
//        return view == object;
//    }
//
//    @Override
//    public CharSequence getPageTitle(int position) {
//    }
//
//}
//}
