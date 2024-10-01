package com.easy.shop.shoppingdemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {
	
	
	public Map<String,Integer> getPriceList(){
		Map map= new HashMap<>();
		map.put("Refrdigerator", 25000);
		map.put("Phone", 15000);
		map.put("Television", 22000);
		map.put("Laptop", 35000);
		map.put("ipad", 15000);
		return map;
	}

  @GetMapping("/products")
  public List<String> getProducts(){
    ArrayList<String> al = new ArrayList<>();
    al.add("Refrdigerator");
    al.add("Phone");
    al.add("Television");
    al.add("Laptop");
    al.add("ipad");
    return al;
  }

}
