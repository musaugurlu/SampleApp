package com.musaugurlu.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Testimonial {
    @Id
    @GeneratedValue
    private int id;
    private String text;
    private String img;
    private String name;

    public Testimonial() {
    }

    public Testimonial(String name, String img, String text) {
        this.name = name;
        this.img = img;
        this.text = text;
    }

    public int getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
