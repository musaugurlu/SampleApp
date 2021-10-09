package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Feature;
import com.musaugurlu.backend.repository.FeatureRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeatureServiceImpl implements FeatureService {

    @Autowired
    FeatureRepository featureRepository;

    @Override
    public List<Feature> findAll() {
        return featureRepository.findAll();
    }

    @Override
    public Feature save(Feature feature) {
        return featureRepository.save(feature);
    }
    
}
