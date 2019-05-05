package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Items;
import com.example.demo.service.ItemsService;

@Controller
@RequestMapping("/inventory")
public class ItemsController {
  
	@Autowired
	ItemsService its;
	
	@RequestMapping(value= {"/all","/"})
	public String getAll(Model model) {
		List<Items> items = its.getAll();
		model.addAttribute("items", items);
		model.addAttribute("heading", "Item Inventory");
		return "itemsView";
	}
}
