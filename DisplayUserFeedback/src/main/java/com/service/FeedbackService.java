package com.service;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepos;
import com.entity.Feedback;

@Service
public class FeedbackService {

	@Autowired
	private MyRepos repos;
	private static Feedback feedback ;
    private static int feedbackCount = 0;
    
    public Feedback retrieveFeedback() {
        return feedback;
    }
	
	public boolean addFeedback(String name, String email, String browser, String experience,
             String feedbackCategory, String message) {
        feedback = new Feedback(++feedbackCount ,new Date(), name, email, browser, experience,  feedbackCategory ,message  );
        System.out.println(feedback);
        repos.save(feedback);
        return true;
    }

}
