package com.washerdetails.Services;

import java.util.List;

import com.washerdetails.Models.Washer;

public interface WasherService {
	
	//For Washer Details
		public List<Washer> getAllWasher();
		
		public Washer getWasherById(int id);
		
		public void setWasher(Washer washer);
		
		public Washer updateWasherById(Washer washer);
		
		public void deleteWasherById(int id);

}
