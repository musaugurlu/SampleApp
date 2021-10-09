package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Feature;

public interface FeatureService {
    List<Feature> findAll();

    Feature save(Feature feature);
}
