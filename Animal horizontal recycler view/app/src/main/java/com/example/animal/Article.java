package com.example.animal;

import java.util.jar.Attributes;

public class Article {
    private  int imageid;
    private String type;
    private String name;

    public Article(int imageid, String type, String name) {
        this.imageid = imageid;
        this.type = type;
        this.name = name;
    }

    public int getImageid() {
        return imageid;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
