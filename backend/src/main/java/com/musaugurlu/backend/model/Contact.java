package com.musaugurlu.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {
    @Id
    @GeneratedValue
    private int id;
    private String address;
    private String phone;
    private String email;
    private String facebook;
    private String twitter;
    private String youtube;

    public Contact() {
    }

    public int getId() {
        return this.id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return this.facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return this.twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getYoutube() {
        return this.youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

}
