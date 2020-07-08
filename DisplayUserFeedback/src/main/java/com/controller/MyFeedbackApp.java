package com.controller;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.service.FeedbackService;

@RestController
public class MyFeedbackApp {

    @Autowired
    private FeedbackService service;  
    
    
    @PostMapping("/add-feedback")
    public String userFeedback(@RequestParam (value = "name", defaultValue = "Anonymous")String name,@RequestParam ("email") String email,
    		@RequestParam("browser") String browser , @RequestParam("experience") String experience, 
    		@RequestParam ("category") String feedbackCategory , @RequestParam ("message") String message)
    {
    	boolean data = service.addFeedback(name, email, browser, experience, feedbackCategory, message);
        if (data)
        	return "Yay!! your feedback was submitted successfully.";
        else
        	return "AN ERROR OCCURRED!!!";
            
    }
    
}