package com.customer_details.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.customer_details.Models.ReviewAndRating;

public interface ReviewAndRatingRepository  extends MongoRepository<ReviewAndRating,Integer>{

}
