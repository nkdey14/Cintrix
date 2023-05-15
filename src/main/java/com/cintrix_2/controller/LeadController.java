package com.cintrix_2.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cintrix_2.entities.Lead;
import com.cintrix_2.services.LeadService;

@Controller
public class LeadController {

	private LeadService leadService;

	public LeadController(LeadService leadService) {
		this.leadService = leadService;
	}
	
	// http://localhost:8083/Cintrix/listAllLeads
	
	@RequestMapping("/viewNewLeadPage")
	public String showNewLeadPage() {
		
		return "newLead";
	}
	
	@PostMapping("/saveLead")
	public String saveLeadDetails(@ModelAttribute("lead") Lead l, ModelMap model) {
		
		leadService.saveLead(l);
		
		model.addAttribute("msg", "Lead saved successfully!");
		
		model.addAttribute("lead", l);
		
		return "leadInfo";
	}
	
	@GetMapping("/listAllLeads")
	public String getAllLeadDetails(Model model) {
		
		List<Lead> leads = leadService.findAllLeads();
		
		model.addAttribute("leads", leads);
		
		return "listLeads";
	}
	
	@GetMapping("/leadInfoPage")
	public String getLeadInfo(@RequestParam("id") long id, Model model) {
		
		Lead lead = leadService.findLeadById(id);
		
		model.addAttribute("lead", lead);
		
		return "leadInfo";
	}
}
