package com.car_management.Models;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="Rating")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
	
	
	@NotEmpty(message = "Pack cannot be null, Please enter the pack !")
	private String washrating;
	
	private String washcomment;
	
	
	
	
	public Rating(String washrating, String washcomment) {
		super();
		this.washrating = washrating;
		this.washcomment = washcomment;
	}
	
	@Override
	public String toString() {
		return "Rating[washrating=" + washrating + ",washcomment=" + washcomment + "]";
	}
	
	

}
