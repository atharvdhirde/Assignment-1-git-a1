package com.car_management.Models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="washpack1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Washpack {
	
	@Id
	private int id;
	private String carwashpack;
	private double amount;
	private String desc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarwashpack() {
		return carwashpack;
	}

	public void setCarwashpack(String carwashpack) {
		this.carwashpack = carwashpack;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Washpack(int id, String carwashpack, double amount,String desc) {
		super();
		this.id = id;
		this.carwashpack = carwashpack;
		this.amount = amount;
		this.desc=desc;
	}
	
	public Washpack() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Washpack [id=" + id + ", carwashpack=" + carwashpack + ", amount=" + amount + ", desc=" + desc + "]";
	}
	
	
	

	
	


}
