package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Items;

@Service
public class ItemsService{
	
	public List<Items> getAll(){

		ArrayList<Items> items = new ArrayList<Items>();
		items.add(new Items(1,"Bike",99.99,10));
		items.add(new Items(2,"Treadmill",99.99,5));
		items.add(new Items(1,"Elliptical",250.00,7));
		return items;
	}

}
