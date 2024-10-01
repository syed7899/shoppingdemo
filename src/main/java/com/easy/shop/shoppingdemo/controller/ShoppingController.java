package com.easy.shop.shoppingdemo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {

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
