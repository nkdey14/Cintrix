package com.cintrix_2.services;

import java.util.List;

import com.cintrix_2.entities.Contact;

public interface ContactService {

	void saveContact(Contact c);

	List<Contact> findAllContacts();

	Contact findContactById(long id);

}
