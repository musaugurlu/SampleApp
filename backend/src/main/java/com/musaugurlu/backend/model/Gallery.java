package com.musaugurlu.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Gallery {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String largeImage;
    private String smallImage;

    public Gallery() {
    }

    public Gallery(String title, String largeImage, String smallImage) {
        this.title = title;
        this.largeImage = largeImage;
        this.smallImage = smallImage;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLargeImage() {
        return this.largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public String getSmallImage() {
        return this.smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }
}
