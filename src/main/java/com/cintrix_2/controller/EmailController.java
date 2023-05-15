package com.cintrix_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cintrix_2.payload.EmailData;
import com.cintrix_2.util.EmailService;

@Controller
public class EmailController {
	
	private EmailService emailService;
	
	public EmailController(EmailService emailService) {
		this.emailService = emailService;
	}

	@GetMapping("/sendEmail")
	public String getEmailId(@RequestParam("email") String email, Model model) {
		
		model.addAttribute("email", email);
		
		return "composeEmail";
	}
	
	@PostMapping("/triggerEmail")
	public String sendEmail(EmailData emailData, Model model) {
		
		emailService.sendSimpleMail(emailData.getEmail(), emailData.getSubject(), emailData.getContent());
		
		model.addAttribute("msg", "Email Sent Successfully!");
		
		return "composeEmail";
	}
}
