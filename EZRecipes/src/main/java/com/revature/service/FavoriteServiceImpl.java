package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repository.FavoriteRepository;

@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {
	private FavoriteRepository favoriteRepository;

	@Autowired
	public FavoriteServiceImpl(FavoriteRepository favoriteRepository) {
		this.favoriteRepository = favoriteRepository;
	}
	public void setFavoriteRepo(FavoriteRepository favoriteRepository) {
		this.favoriteRepository=favoriteRepository;
	}
}
