package com.revature.repository;

import com.revature.model.Restriction;

public interface RestrictionRepository {
	Restriction getRestrictionsByUserId(int id);
}
