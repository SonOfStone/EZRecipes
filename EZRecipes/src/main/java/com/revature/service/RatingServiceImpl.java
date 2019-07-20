package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repository.RatingRepository;

@Service("ratingService")
public class RatingServiceImpl implements RatingService {
	private RatingRepository ratingRepository;

	@Autowired
	public RatingServiceImpl(RatingRepository ratingRepository) {

		this.ratingRepository = ratingRepository;
	}
	public void setRatingRepo(RatingRepository ratingRepository) {
		this.ratingRepository=ratingRepository;
	}

}
