package com.washerdetails.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.washerdetails.Models.Washer;

@Repository
public interface WasherRepository extends MongoRepository<Washer,Integer>{
	
	public Washer findBywasherId(int id);

}