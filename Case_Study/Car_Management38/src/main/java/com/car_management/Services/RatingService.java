package com.car_management.Services;

import java.util.List;

import com.car_management.Models.Rating;


public interface RatingService {
	
	 public List<Rating> giveRating();
	 
	 public void addRating(Rating rating);
}
