package com.cintrix_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cintrix_2.entities.Contact;
import com.cintrix_2.entities.Lead;
import com.cintrix_2.services.ContactService;
import com.cintrix_2.services.LeadService;

@Controller
public class LeadController {

	private LeadService leadService;

	public LeadController(LeadService leadService) {
		this.leadService = leadService;
	}
	
	@Autowired
	private ContactService contactService;
	
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
	
	@GetMapping("/editLead")
	public String getLeadDetails(@RequestParam("id") long id, Model model) {
		
		Lead lead = leadService.findLeadById(id);
		
		model.addAttribute("lead", lead);
		
		return "updateLead";
	}
	
	@PostMapping("/updateLead")
	public String updateLeadInfo(@ModelAttribute("lead") Lead l, Model model) {
		
		leadService.saveLead(l);
		
		model.addAttribute("msg", "Lead details updated successfully!");
		
		List<Lead> leads = leadService.findAllLeads();
		
		model.addAttribute("leads", leads);
		
		return "listLeads";
	}
	
	@GetMapping("/removeLead")
	public String removeLeadDetails(@RequestParam("id") long id, Model model) {
		
		leadService.deleteLead(id);
		
		model.addAttribute("msg", "Lead details removed successfully!");
		
		List<Lead> leads = leadService.findAllLeads();
		
		model.addAttribute("leads", leads);
		
		return "listLeads";
	}
	
	@GetMapping("/convertLead")
	public String convertLeadToContact(@RequestParam("id") long id, Model model) {
		
		Lead lead = leadService.findLeadById(id);
		
		Contact c = new Contact();
		
		c.setFirstName(lead.getFirstName());
		c.setLastName(lead.getLastName());
		c.setGender(lead.getGender());
		c.setEmail(lead.getEmail());
		c.setMobile(lead.getMobile());
		c.setCity(lead.getCity());
		c.setSource(lead.getSource());
		
		contactService.saveContact(c);
		
		leadService.deleteLead(id);
		
		List<Contact> contacts = contactService.findAllContacts();
		
		model.addAttribute("contacts", contacts);
		
		model.addAttribute("msg", "Contact saved successfully!");
		
		return "listContacts";
	}
	
	@GetMapping("/showSearchLeadPage")
	public String viewSearchLead() {
		
		return "searchLead";
	}
	
	@PostMapping("/fetchLeadDetails")
	public String showLeadDetails(@RequestParam("mobile") long mobile, Model model) {
		
		Lead lead = leadService.findLeadByMobile(mobile);
		
		if(lead != null) {
			
			model.addAttribute("lead", lead);
			
			return "leadInfo";
			
		} else {
			
			model.addAttribute("msg", "No Record Found!");
			
			return "searchLead";
		}
	}
}
