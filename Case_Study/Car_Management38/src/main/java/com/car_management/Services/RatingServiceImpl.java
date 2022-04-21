package com.car_management.Services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car_management.Models.Rating;
import com.car_management.Repository.RatingRepository;



@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepository  ratingRepository ;

	@Override
	public List<Rating> giveRating() {
		
		return ratingRepository.findAll();
	}

	@Override
	public void addRating(Rating rating) {
		System.out.println(rating);
		ratingRepository.save(rating);
		
		
	}

}
