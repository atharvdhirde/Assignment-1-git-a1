package com.washerdetails.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washerdetails.Models.Washer;
import com.washerdetails.Repository.WasherRepository;

@Service
public class WasherServiceImpl implements WasherService{
  
	@Autowired
	private WasherRepository washerRepository;
	
	@Override
	public List<Washer> getAllWasher() {
		
		return washerRepository.findAll();
	}

	@Override
	public Washer getWasherById(int id) {
		
		return washerRepository.findBywasherId(id);
	}

	@Override
	public void setWasher(Washer washer) {
		washerRepository.save(washer);		
	}

	@Override
	public Washer updateWasherById(Washer washer) {
	
		return washerRepository.save(washer);
	}

	@Override
	public void deleteWasherById(int id) {
		washerRepository.deleteById(id);
		
	}

	

}
