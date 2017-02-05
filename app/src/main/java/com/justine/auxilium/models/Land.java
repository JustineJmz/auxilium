package com.justine.auxilium.models;

import android.widget.LinearLayout;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Land extends RealmObject {

    public Land(){
    }
    @PrimaryKey
    private long Id;

    private String ownerName, contactNumber, remarks;
    private String imageURL;
    private boolean isSold;
    private long price;

    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getRemarks() {
        return remarks;
    }


    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }
}
