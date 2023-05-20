package com.cintrix_2.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cintrix_2.entities.Contact;
import com.cintrix_2.entities.Lead;
import com.cintrix_2.services.ContactService;
import com.cintrix_2.services.LeadService;

@Controller
public class ContactController {

	private ContactService contactService;

	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}
	
	@GetMapping("/listAllContacts")
	public String getAllLeadDetails(Model model) {
		
		List<Contact> contacts = contactService.findAllContacts();
		
		model.addAttribute("contacts", contacts);
		
		return "listContacts";
	}
	
	@GetMapping("/contactInfoPage")
	public String getContactInfo(@RequestParam("id") long id, Model model) {
		
		Contact contact = contactService.findContactById(id);
		
		model.addAttribute("contact", contact);
		
		return "contactInfo";
	}
}
