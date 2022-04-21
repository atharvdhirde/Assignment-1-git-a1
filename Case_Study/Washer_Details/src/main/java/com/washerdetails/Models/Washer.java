package com.washerdetails.Models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="washer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Washer {
	
	@Id
	private int washerId;
	@NotEmpty(message="provide username !")
	private String username;
	@NotEmpty(message="provide password !")
	private String password;
	@Email(message = "Provide a valid E-mail Address ! ")
	private String washerEmail;
	@NotEmpty(message = "Name cannot be null, Please enter your name !")
	private String washerName;
	@NotEmpty(message = "Address cannot be null !")
	private String washerAddress;
	
	private double washerContactNo;
	
	
	
	public int getWasherId() {
		return washerId;
	}
	public void setWasherId(int washerId) {
		this.washerId = washerId;
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
	public String getWasherEmail() {
		return washerEmail;
	}
	public void setWasherEmail(String washerEmail) {
		this.washerEmail = washerEmail;
	}
	public String getWasherName() {
		return washerName;
	}
	public void setWasherName(String washerName) {
		this.washerName = washerName;
	}
	public String getWasherAddress() {
		return washerAddress;
	}
	public void setWasherAddress(String washerAddress) {
		this.washerAddress = washerAddress;
	}
	public double getWasherContactNo() {
		return washerContactNo;
	}
	public void setWasherContactNo(double washerContactNo) {
		this.washerContactNo = washerContactNo;
	}
	public Washer(int washerId,String username,String password, String washerEmail, String washerName, String washerAddress,
			double washerContactNo) {
		super();
		this.washerId = washerId;
		this.username=username;
		this.password=password;
		this.washerEmail = washerEmail;
		this.washerName = washerName;
		this.washerAddress = washerAddress;
		this.washerContactNo = washerContactNo;
	}
	public Washer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Washer [washerId=" + washerId + ",username=" + username + ",password=" + password + ", washerEmail=" + washerEmail + ", washerName="
				+washerName + ", washerAddress=" + washerAddress + ", washerContactNo=" + washerContactNo +"]";
	}
	
	

}
