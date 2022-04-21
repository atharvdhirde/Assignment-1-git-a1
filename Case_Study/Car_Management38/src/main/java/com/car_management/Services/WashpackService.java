package com.car_management.Services;

import java.util.List;


import com.car_management.Models.Washpack;

public interface WashpackService {
	public List<Washpack> getAllWashPack();
	public Washpack addNewWashPack(Washpack pack);

    public Washpack findByName(String name);

    public Washpack updateWashPackByName(Washpack pack);
    
    public void deleteById(int id);
    
//    public WashPack updateById(WashPack pack);
    
    public Washpack getWashPackByid(int id);
    public Washpack updateWashPack(Washpack washpacks);

}

