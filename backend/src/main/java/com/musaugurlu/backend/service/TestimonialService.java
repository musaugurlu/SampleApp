package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Testimonial;

public interface TestimonialService {
    List<Testimonial> findAll();

    Testimonial save(Testimonial testimonial);
}
