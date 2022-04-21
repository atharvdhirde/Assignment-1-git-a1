package com.customer_details.Models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="Customers")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customers {
	
	//@Id
	private int customerId;
	@NotEmpty(message="provide username !")
	private String username;
	@NotEmpty(message="provide password !")
	private String password;
	@Email(message = "Provide a valid E-mail Address ! ")
	private String customerEmail;
	@NotEmpty(message = "Name cannot be null, Please enter your name !")
	private String customerName;
	@NotEmpty(message = "Please provide the address for the washer partner to reach your destination.")
	private String customerAddress;
	
	private double customerContactNo;
	
	private String role;
	
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public double getCustomerContactNo() {
		return customerContactNo;
	}
	public void setCustomerContactNo(double customerContactNo) {
		this.customerContactNo = customerContactNo;
	}
	
	
	public Customers(int customerId,String username,String password, String customerEmail, String customerName, String customerAddress,
			double customerContactNo,String role) {
		super();
		this.customerId = customerId;
		this.username=username;
		this.password=password;
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerContactNo = customerContactNo;
		this.role=role;
	}
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ",username=" + username + ",password=" + password + ", customerEmail=" + customerEmail + ", customerName="
				+ customerName + ", customerAddress=" + customerAddress + ", customerContactNo=" + customerContactNo +", role="+  role +"]";
	}
	
	//work

	
}
