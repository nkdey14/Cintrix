package com.cintrix_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cintrix_2.entities.Lead;
import com.cintrix_2.services.LeadService;

@Controller
public class LeadController {

	private LeadService leadService;

	public LeadController(LeadService leadService) {
		this.leadService = leadService;
	}
	
	// http://localhost:8083/Cintrix/viewNewLeadPage
	
	@RequestMapping("/viewNewLeadPage")
	public String showNewLeadPage() {
		
		return "newLead";
	}
	
	@RequestMapping("/saveLead")
	public String saveLeadDetails(@ModelAttribute("lead") Lead l, ModelMap model) {
		
		leadService.saveLead(l);
		model.addAttribute("Lead saved successfully!", "msg");
		return "newLead";
	}
}
