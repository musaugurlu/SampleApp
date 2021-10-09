package com.musaugurlu.backend.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class About {
    @Id
    @GeneratedValue
    private int id;
    
    @Column(length = 3000)
    private String paragraph;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<AboutWhy> reasons;

    public About() {
    }
    
    public int getId() {
        return this.id;
    }

    public String getParagraph() {
        return this.paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public List<AboutWhy> getReasons() {
        return this.reasons;
    }

    public void setReasons(List<AboutWhy> reasons) {
        this.reasons = reasons;
    }

}
