package com.cintrix_2.services;

import java.util.List;

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

	@Override
	public List<Lead> findAllLeads() {
		
		List<Lead> leads = leadRepo.findAll();
		
		return leads;
		
	}

	@Override
	public Lead findLeadById(long id) {
		
		Lead lead = leadRepo.findById(id).get();
		
		return lead;
		
	}
	
	
}
