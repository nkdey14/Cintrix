package com.cintrix_2.services;

import java.util.List;

import com.cintrix_2.entities.Lead;

public interface LeadService {

	void saveLead(Lead l);

	List<Lead> findAllLeads();

	Lead findLeadById(long id);

	void deleteLead(long id);

	Lead findLeadByMobile(long mobile);

}
