package com.cintrix_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cintrix_2.entities.Contact;
import com.cintrix_2.entities.Lead;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
