package com.example.android.tourapp;

import android.content.Context;

public class Tour {

    private String mCityName;
    private int imageID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    private String mDetails;

    public Tour(int imageResID, String cityName, String details) {
        mCityName = cityName;
        mDetails = details;
        imageID = imageResID;
    }

    public String getCityName() { return mCityName;}

    public String getDetails() { return mDetails;}

    public int getImageResourceId() { return imageID;}

    public boolean hasImage() { return imageID != NO_IMAGE_PROVIDED;}
}
