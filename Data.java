package com.codewithmohit.interview_q_api_food.model;

;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

@SerializedName("restaurantDetail")
@Expose
private RestaurantDetail restaurantDetail;
@SerializedName("itemsCount")
@Expose
private String itemsCount;
@SerializedName("totalBill")
@Expose
private String totalBill;
@SerializedName("totalBillDine")
@Expose
private String totalBillDine;

public RestaurantDetail getRestaurantDetail() {
return restaurantDetail;
}

public void setRestaurantDetail(RestaurantDetail restaurantDetail) {
this.restaurantDetail = restaurantDetail;
}

public String getItemsCount() {
return itemsCount;
}

public void setItemsCount(String itemsCount) {
this.itemsCount = itemsCount;
}

public String getTotalBill() {
return totalBill;
}

public void setTotalBill(String totalBill) {
this.totalBill = totalBill;
}

public String getTotalBillDine() {
return totalBillDine;
}

public void setTotalBillDine(String totalBillDine) {
this.totalBillDine = totalBillDine;
}

}