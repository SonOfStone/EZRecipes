package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repository.RestrictionRepository;

@Service("restrictionService")
public class RestrictionServiceImpl implements RestrictionService {
	private RestrictionRepository restrictionRepository;

	@Autowired
	public RestrictionServiceImpl(RestrictionRepository restrictionRepository) {

		this.restrictionRepository = restrictionRepository;
	}
	public void setRestrictionRepo(RestrictionRepository restrictionRepository) {
		this.restrictionRepository=restrictionRepository;
	}

}
