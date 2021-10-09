package com.musaugurlu.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Header {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String paragraph;

    public Header() {
    }

    public Header(String title, String paragraph) {
        this.title = title;
        this.paragraph = paragraph;
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

    public String getParagraph() {
        return this.paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

}
