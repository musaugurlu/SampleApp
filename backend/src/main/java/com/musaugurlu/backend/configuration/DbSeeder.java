package com.musaugurlu.backend.configuration;

import java.util.ArrayList;
import java.util.List;

import com.musaugurlu.backend.model.About;
import com.musaugurlu.backend.model.AboutWhy;
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {

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

    private void seedAbout() {
        if (aboutService.findAll().size() == 0) {
            About about = new About();
            about.setParagraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
            List<AboutWhy> why = new ArrayList<>();

            why.add(new AboutWhy("Why", "Lorem ipsum dolor"));
            why.add(new AboutWhy("Why", "Tempor incididunt"));
            why.add(new AboutWhy("Why", "Lorem ipsum dolor"));
            why.add(new AboutWhy("Why", "Incididunt ut labore"));
            why.add(new AboutWhy("Why2", "Aliquip ex ea commodo"));
            why.add(new AboutWhy("Why2", "Lorem ipsum dolor"));
            why.add(new AboutWhy("Why2", "Exercitation ullamco"));
            why.add(new AboutWhy("Why2", "Lorem ipsum dolor"));
            
            about.setReasons(why);

            aboutService.save(about);
        }
    }

    private void seedContact() {
        if (contactService.findAll().size() == 0) {
            Contact contact = new Contact();
            contact.setAddress("4321 California St, San Francisco, CA 12345 ");
            contact.setPhone("+1 123 456 1234");
            contact.setEmail("info@musaugurlu.com");
            contact.setFacebook("https://fb.com");
            contact.setTwitter("https://twitter.com");
            contact.setYoutube("https://youtube.com");
    
            contactService.save(contact);
        }
    }

    private void seedFeature() {
        if(featureService.findAll().size() == 0) {
            Feature feature1 = new Feature();
            feature1.setIcon("fa fa-comments-o");
            feature1.setTitle("Lorem ipsum");
            feature1.setText("Lorem ipsum dolor sit amet placerat facilisis felis mi in tempus eleifend pellentesque natoque etiam.");
            
            Feature feature2 = new Feature();
            feature2.setIcon("fa fa-bullhorn");
            feature2.setTitle("Lorem ipsum");
            feature2.setText("Lorem ipsum dolor sit amet placerat facilisis felis mi in tempus eleifend pellentesque natoque etiam.");
            
            Feature feature3 = new Feature();
            feature3.setIcon("fa fa-group");
            feature3.setTitle("Lorem ipsum");
            feature3.setText("Lorem ipsum dolor sit amet placerat facilisis felis mi in tempus eleifend pellentesque natoque etiam.");
            
            Feature feature4 = new Feature();
            feature4.setIcon("fa fa-magic");
            feature4.setTitle("Lorem ipsum");
            feature4.setText("Lorem ipsum dolor sit amet placerat facilisis felis mi in tempus eleifend pellentesque natoque etiam.");

            featureService.save(feature1);
            featureService.save(feature2);
            featureService.save(feature3);
            featureService.save(feature4);
        }
    }

    private void seedGallery() {
        if(galleryService.findAll().size() == 0) {
            Gallery gallery1 = new Gallery("Project Title", "img/portfolio/01-large.jpg", "img/portfolio/01-small.jpg");
            Gallery gallery2 = new Gallery("Project Title", "img/portfolio/02-large.jpg", "img/portfolio/02-small.jpg");
            Gallery gallery3 = new Gallery("Project Title", "img/portfolio/03-large.jpg", "img/portfolio/03-small.jpg");
            Gallery gallery4 = new Gallery("Project Title", "img/portfolio/04-large.jpg", "img/portfolio/04-small.jpg");
            Gallery gallery5 = new Gallery("Project Title", "img/portfolio/05-large.jpg", "img/portfolio/05-small.jpg");
            Gallery gallery6 = new Gallery("Project Title", "img/portfolio/06-large.jpg", "img/portfolio/06-small.jpg");
            Gallery gallery7 = new Gallery("Project Title", "img/portfolio/07-large.jpg", "img/portfolio/07-small.jpg");
            Gallery gallery8 = new Gallery("Project Title", "img/portfolio/08-large.jpg", "img/portfolio/08-small.jpg");
            Gallery gallery9 = new Gallery("Project Title", "img/portfolio/09-large.jpg", "img/portfolio/09-small.jpg");

            galleryService.save(gallery1);
            galleryService.save(gallery2);
            galleryService.save(gallery3);
            galleryService.save(gallery4);
            galleryService.save(gallery5);
            galleryService.save(gallery6);
            galleryService.save(gallery7);
            galleryService.save(gallery8);
            galleryService.save(gallery9);
        }
    }

    private void seedHeader() {
        if(headerService.findAll().size() == 0) {
            Header header = new Header(
                "We are a Landing Page",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sed commodo nibh ante facilisis bibendum."
            );

            headerService.save(header);
        }
    }

    private void seedService() {
        if(serviceService.findAll().size() == 0) {
            Service service1 = new Service(
                "fa fa-wordpress",
                "Lorem ipsum dolor",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at."
            );
            Service service2 = new Service(
                "fa fa-cart-arrow-down",
                "Lorem ipsum dolor",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at."
            );
            Service service3 = new Service(
                "fa fa-cloud-download",
                "Lorem ipsum dolor",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at."
            );
            Service service4 = new Service(
                "fa fa-language",
                "Lorem ipsum dolor",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at."
            );
            Service service5 = new Service(
                "fa fa-plane",
                "Lorem ipsum dolor",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at."
            );
            Service service6 = new Service(
                "fa fa-pie-chart",
                "Lorem ipsum dolor",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at."
            );

            serviceService.save(service1);
            serviceService.save(service2);
            serviceService.save(service3);
            serviceService.save(service4);
            serviceService.save(service5);
            serviceService.save(service6);
        }
    }

    private void seedTeam() {
        if(teamService.findAll().size() == 0) {
            Team team1 = new Team("John Doe", "img/team/01.jpg", "Director");
            Team team2 = new Team("Mike Doe", "img/team/02.jpg", "Senior Designer");
            Team team3 = new Team("Jane Doe", "img/team/03.jpg", "Senior Designer");
            Team team4 = new Team("Karen Doe", "img/team/04.jpg", "Project Manager");

            teamService.save(team1);
            teamService.save(team2);
            teamService.save(team3);
            teamService.save(team4);
        }
    }

    private void seedTestimonial() {
        if(testimonialService.findAll().size() == 0) {
            Testimonial testimonial1 = new Testimonial("John Doe", "img/testimonials/01.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.");
            Testimonial testimonial2 = new Testimonial("Jane Doe", "img/testimonials/02.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.");
            Testimonial testimonial3 = new Testimonial("Jonathan Doe", "img/testimonials/03.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.");
            Testimonial testimonial4 = new Testimonial("Joe Doe", "img/testimonials/04.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.");
            Testimonial testimonial5 = new Testimonial("Jordan Doe", "img/testimonials/05.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.");
            Testimonial testimonial6 = new Testimonial("Janny Doe", "img/testimonials/06.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.");
            
            testimonialService.save(testimonial1);
            testimonialService.save(testimonial2);
            testimonialService.save(testimonial3);
            testimonialService.save(testimonial4);
            testimonialService.save(testimonial5);
            testimonialService.save(testimonial6);
        }
    }
 
    @Override
    public void run(String... args) throws Exception {
        seedAbout();
        seedContact();
        seedFeature();
        seedGallery();
        seedHeader();
        seedService();
        seedTeam();
        seedTestimonial();
    }
    
}
