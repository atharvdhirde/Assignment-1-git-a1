package com.customer_details.Services;

import java.util.List;


import com.customer_details.Models.ReviewAndRating;


public interface ReviewAndRatingService {
	
	 public List<ReviewAndRating> giveRatingAndReview();
	 
	 public void addRating(ReviewAndRating rating);
}
