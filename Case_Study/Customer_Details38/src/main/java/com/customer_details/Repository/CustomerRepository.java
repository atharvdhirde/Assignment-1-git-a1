package com.customer_details.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.customer_details.Models.Customers;



@Repository
public interface CustomerRepository extends MongoRepository<Customers,Integer>{
	
	public Customers findBycustomerId(int id);
	
//	public Customers findByCustomerName(String name);
	

}
