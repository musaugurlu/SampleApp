package com.musaugurlu.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Service {
    @Id
    @GeneratedValue
    private int id;
    private String icon;
    private String name;
    private String text;

    public Service() {
    }

    public Service(String icon, String name, String text) {
        this.icon = icon;
        this.name = name;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
