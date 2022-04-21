package com.car_management.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.car_management.Models.Washpack;
import com.car_management.Repository.WashpackRepository;




@Service
public class WashpackServiceImpl implements WashpackService{
  
	@Autowired
	private WashpackRepository washpackRepository;
	
	
	 @Override
	    public Washpack addNewWashPack(Washpack pack) {
	        Washpack washpacks = new Washpack() ;
	        washpacks.setId(pack.getId());
	        washpacks.setCarwashpack(pack.getCarwashpack());
	        washpacks.setAmount(pack.getAmount());
	        washpackRepository.save(washpacks);
	        return washpacks;
	    }
	
	 @Override
	    public Washpack findByName(String name) {
	        return washpackRepository.findAll().stream().filter(p -> p.getCarwashpack()
	                .contains(name)).findAny().orElse(null);
	    }
	 
	 @Override
		public Washpack updateWashPackByName(Washpack pack) {
		
			return washpackRepository.save(pack);
		}
	 
	
	 @Override
		public List<Washpack> getAllWashPack() {
			return  washpackRepository.findAll();
		}
	 
	 @Override
		public void deleteById(int id) {
			Washpack washpack=new Washpack();
			washpackRepository.deleteById(id);						
		}
	 
	 @Override
		public Washpack getWashPackByid(int id) {
			// TODO Auto-generated method stub
			return washpackRepository.findByid(id);	
		}

		@Override
	    public Washpack updateWashPack(Washpack washpacks) {
	        return washpackRepository.save(washpacks);
	    }
	 
}

