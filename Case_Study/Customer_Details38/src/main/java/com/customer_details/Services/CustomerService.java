package com.customer_details.Services;

import java.util.List;

import com.customer_details.Models.Customers;
public interface CustomerService {
	
	//For Customer Details
	public List<Customers> getAllCustomers();
	
	public Customers getCustomerById(int id);
	
	public void setCustomers(Customers customer);
	
	public Customers updateCustomerById(Customers customer);
	
	public void deleteCustomerById(int id);

}
