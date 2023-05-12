package com.cintrix_2.controller;

import org.springframework.stereotype.Controller;

import com.cintrix_2.services.LeadService;

@Controller
public class LeadController {

	private LeadService leadService;

	public LeadController(LeadService leadService) {
		this.leadService = leadService;
	}
	
	
}
