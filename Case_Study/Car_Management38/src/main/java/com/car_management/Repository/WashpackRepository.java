package com.car_management.Repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.car_management.Models.Washpack;



@Repository
public interface WashpackRepository extends MongoRepository<Washpack,Integer>{
	
	public Washpack findByid(int id);
 
}
