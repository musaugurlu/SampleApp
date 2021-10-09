package com.musaugurlu.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Feature {
    @Id
    @GeneratedValue
    private int id;
    private String icon;
    private String title;
    private String text;

    public Feature() {
    }

    public Feature(String icon, String title, String text) {
        this.icon = icon;
        this.title = title;
        this.text = text;
    }

    public int getId() {
        return this.id;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
