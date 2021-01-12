package com.example.multipleviewtypes;

public class PersonalityModel {
    public static final int ITEM_TYPE_PERSONALITY = 0;
    public static final int ITEM_TYPE_LOCATION = 5;


    private int imageId;
    private String personalityName;
    private String LocationName;
    private int viewType;


    public PersonalityModel(int imageId, String personalityName, String locationName, int viewType) {


        this.imageId = imageId;
        this.personalityName = personalityName;
        this.LocationName = locationName;
        this.viewType = viewType;
    }


    public int getImageId() {
        return imageId;
    }

    public String getPersonalityName() {
        return personalityName;
    }

    public String getLocationName() {
        return LocationName;
    }

    public int getViewType() {
        return viewType;
    }


}
