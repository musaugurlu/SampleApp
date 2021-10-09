package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Testimonial;
import com.musaugurlu.backend.repository.TestimonialRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestimonialServiceImpl implements TestimonialService {

    @Autowired
    TestimonialRepository testimonialRepository;

    @Override
    public List<Testimonial> findAll() {
        return testimonialRepository.findAll();
    }

    @Override
    public Testimonial save(Testimonial testimonial) {
        return testimonialRepository.saveAndFlush(testimonial);
    }
    
}
