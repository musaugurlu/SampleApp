package com.musaugurlu.backend.repository;

import com.musaugurlu.backend.model.Testimonial;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestimonialRepository extends JpaRepository<Testimonial, Integer> {
    
}
