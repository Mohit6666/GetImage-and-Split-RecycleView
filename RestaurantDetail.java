package com.codewithmohit.interview_q_api_food.model;

;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RestaurantDetail {

@SerializedName("token")
@Expose
private String token;
@SerializedName("name")
@Expose
private String name;
@SerializedName("minBillingPrice")
@Expose
private String minBillingPrice;
@SerializedName("address1")
@Expose
private String address1;
@SerializedName("address2")
@Expose
private String address2;
@SerializedName("image")
@Expose
private String image;
@SerializedName("subCategoryId")
@Expose
private String subCategoryId;
@SerializedName("timeslot")
@Expose
private String timeslot;
@SerializedName("rating")
@Expose
private String rating;
@SerializedName("reviewCount")
@Expose
private String reviewCount;
@SerializedName("cousines")
@Expose
private String cousines;
@SerializedName("foodItems")
@Expose
private List<FoodItem> foodItems = null;

public String getToken() {
return token;
}

public void setToken(String token) {
this.token = token;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getMinBillingPrice() {
return minBillingPrice;
}

public void setMinBillingPrice(String minBillingPrice) {
this.minBillingPrice = minBillingPrice;
}

public String getAddress1() {
return address1;
}

public void setAddress1(String address1) {
this.address1 = address1;
}

public String getAddress2() {
return address2;
}

public void setAddress2(String address2) {
this.address2 = address2;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

public String getSubCategoryId() {
return subCategoryId;
}

public void setSubCategoryId(String subCategoryId) {
this.subCategoryId = subCategoryId;
}

public String getTimeslot() {
return timeslot;
}

public void setTimeslot(String timeslot) {
this.timeslot = timeslot;
}

public String getRating() {
return rating;
}

public void setRating(String rating) {
this.rating = rating;
}

public String getReviewCount() {
return reviewCount;
}

public void setReviewCount(String reviewCount) {
this.reviewCount = reviewCount;
}

public String getCousines() {
return cousines;
}

public void setCousines(String cousines) {
this.cousines = cousines;
}

public List<FoodItem> getFoodItems() {
return foodItems;
}

public void setFoodItems(List<FoodItem> foodItems) {
this.foodItems = foodItems;
}

}