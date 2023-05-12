package com.cintrix_2.services;

import org.springframework.stereotype.Service;

import com.cintrix_2.entities.Lead;
import com.cintrix_2.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	private LeadRepository leadRepo;

	public LeadServiceImpl(LeadRepository leadRepo) {
		this.leadRepo = leadRepo;
	}

	@Override
	public void saveLead(Lead l) {
		
		leadRepo.save(l);
	}
	
	
}
