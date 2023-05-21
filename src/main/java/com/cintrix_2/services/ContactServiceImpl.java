package com.cintrix_2.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cintrix_2.entities.Contact;
import com.cintrix_2.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	private ContactRepository contactRepo;

	public ContactServiceImpl(ContactRepository contactRepo) {
		this.contactRepo = contactRepo;
	}

	@Override
	public void saveContact(Contact c) {
		
		contactRepo.save(c);
	}

	@Override
	public List<Contact> findAllContacts() {
		
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact findContactById(long id) {
		
		Contact contact = contactRepo.findById(id).get();
		return contact;
	}

	@Override
	public void deleteContact(long id) {
		
		contactRepo.deleteById(id);
	}
	
	
}
