package com.codewithmohit.interview_q_api_food.model;

;

import android.os.Parcel;
import android.os.Parcelable;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoodItem implements Parcelable {

@SerializedName("id")
@Expose
private String id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("deliveryPrice")
@Expose
private String deliveryPrice;
@SerializedName("dineInPrice")
@Expose
private String dineInPrice;
@SerializedName("description")
@Expose
private String description;
@SerializedName("image")
@Expose
private String image;
@SerializedName("availabilityStatus")
@Expose
private String availabilityStatus;
@SerializedName("addOnsList")
@Expose
private ArrayList<Object> addOnsList = null;

    protected FoodItem(Parcel in) {
        id = in.readString();
        name = in.readString();
        deliveryPrice = in.readString();
        dineInPrice = in.readString();
        description = in.readString();
        image = in.readString();
        availabilityStatus = in.readString();
    }

    public static final Creator<FoodItem> CREATOR = new Creator<FoodItem>() {
        @Override
        public FoodItem createFromParcel(Parcel in) {
            return new FoodItem(in);
        }

        @Override
        public FoodItem[] newArray(int size) {
            return new FoodItem[size];
        }
    };

    public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getDeliveryPrice() {
return deliveryPrice;
}

public void setDeliveryPrice(String deliveryPrice) {
this.deliveryPrice = deliveryPrice;
}

public String getDineInPrice() {
return dineInPrice;
}

public void setDineInPrice(String dineInPrice) {
this.dineInPrice = dineInPrice;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

public String getAvailabilityStatus() {
return availabilityStatus;
}

public void setAvailabilityStatus(String availabilityStatus) {
this.availabilityStatus = availabilityStatus;
}

public ArrayList<Object> getAddOnsList() {
return addOnsList;
}

public void setAddOnsList(ArrayList<Object> addOnsList) {
this.addOnsList = addOnsList;
}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel,int i) {
        parcel.writeString(id);
        parcel.writeString(name);
        parcel.writeString(deliveryPrice);
        parcel.writeString(dineInPrice);
        parcel.writeString(description);
        parcel.writeString(image);
        parcel.writeString(availabilityStatus);
    }
}