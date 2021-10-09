package com.musaugurlu.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AboutWhy {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String reason;
    
    public AboutWhy() {
    }

    public AboutWhy(String name, String reason) {
        this.name = name;
        this.reason= reason;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
