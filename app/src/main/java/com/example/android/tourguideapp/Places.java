package com.example.android.tourguideapp;

/**
 * Created by sarahaldowihy on 8/6/2017 AD.
 */

public class Places {
    private int placeName;
    private int information ;
    private int imageResource ;

    public Places(int placeName, int information, int imageResource) {
        this.placeName = placeName;
        this.information = information;
        this.imageResource = imageResource;
    }

    public int getPlaceName() {
        return placeName;
    }

    public int getInformation() {
        return information;
    }

    public int getImageResource() {
        return imageResource;
    }
}
