package com.musaugurlu.backend.controller;

import java.util.List;

import com.musaugurlu.backend.model.About;
import com.musaugurlu.backend.model.Contact;
import com.musaugurlu.backend.model.Feature;
import com.musaugurlu.backend.model.Gallery;
import com.musaugurlu.backend.model.Header;
import com.musaugurlu.backend.model.Service;
import com.musaugurlu.backend.model.Team;
import com.musaugurlu.backend.model.Testimonial;
import com.musaugurlu.backend.service.AboutService;
import com.musaugurlu.backend.service.ContactService;
import com.musaugurlu.backend.service.FeatureService;
import com.musaugurlu.backend.service.GalleryService;
import com.musaugurlu.backend.service.HeaderService;
import com.musaugurlu.backend.service.ServiceService;
import com.musaugurlu.backend.service.TeamService;
import com.musaugurlu.backend.service.TestimonialService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @Autowired
    AboutService aboutService;

    @Autowired
    ContactService contactService;

    @Autowired
    FeatureService featureService;

    @Autowired
    GalleryService galleryService;

    @Autowired
    HeaderService headerService;

    @Autowired
    ServiceService serviceService;

    @Autowired
    TeamService teamService;

    @Autowired
    TestimonialService testimonialService;

    @GetMapping
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/api/about")
    public List<About> getAbout() {
        return aboutService.findAll();
    }

    @GetMapping("/api/contact")
    public List<Contact> getContact() {
        return contactService.findAll();
    }

    @GetMapping("/api/feature")
    public List<Feature> getFeature() {
        return featureService.findAll();
    }

    @GetMapping("/api/gallery")
    public List<Gallery> getGallery() {
        return galleryService.findAll();
    }

    @GetMapping("/api/header")
    public List<Header> getHeader() {
        return headerService.findAll();
    }

    @GetMapping("/api/service")
    public List<Service> getService() {
        return serviceService.findAll();
    }

    @GetMapping("/api/team")
    public List<Team> getTeam() {
        return teamService.findAll();
    }

    @GetMapping("/api/testimonial")
    public List<Testimonial> getTestimonial() {
        return testimonialService.findAll();
    }

}
