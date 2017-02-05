package com.justine.auxilium.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Vehicle extends RealmObject {
    public Vehicle() {

    }

    @PrimaryKey
    private long Id;

    private String ownerName, contactNumber, remarks;
    private String imageURL;
    private boolean isSold;
    private long price;

    private String registerNumber, manufacturer, modelName, color, fuel;
    private int yearOfManufacture, capacity;
    private long kilometersUsed;

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

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setKilometersUsed(long kilometersUsed) {
        this.kilometersUsed = kilometersUsed;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public long getKilometersUsed() {
        return kilometersUsed;
    }


    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
