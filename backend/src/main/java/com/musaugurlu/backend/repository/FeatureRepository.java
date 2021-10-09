package com.musaugurlu.backend.repository;

import com.musaugurlu.backend.model.Feature;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<Feature, Integer> {
    
}
