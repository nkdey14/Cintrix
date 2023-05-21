package com.cintrix_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cintrix_2.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

	Lead findByMobile(long mobile);

}
