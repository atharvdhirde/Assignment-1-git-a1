package com.customer_details.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer_details.Models.Customers;
import com.customer_details.Repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
  
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customers> getAllCustomers() {
		
		return customerRepository.findAll();
	}

	@Override
	public Customers getCustomerById(int id) {
		
		return customerRepository.findBycustomerId(id);
	}

	@Override
	public void setCustomers(Customers customer) {
		customerRepository.save(customer);		
	}

	@Override
	public Customers updateCustomerById(Customers customer) {
	
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomerById(int id) {
		customerRepository.deleteById(id);
		
	}

	

}
