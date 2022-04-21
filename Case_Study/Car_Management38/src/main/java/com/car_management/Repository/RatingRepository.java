package com.car_management.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.car_management.Models.Rating;





@Repository
public interface RatingRepository extends MongoRepository<Rating,String>{
	
	

}