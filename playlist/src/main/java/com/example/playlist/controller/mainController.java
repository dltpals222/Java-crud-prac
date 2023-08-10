package com.example.playlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
  
  @GetMapping(value = "/")
  public String index() {
    return "index";
  }
  
  @GetMapping(value = "/pages/userInfo")
  public String management(Model Model) {
    String[] ulList = new String[] {"checkbox","no","name","number","id","deposit","score"};
    Model.addAttribute("ulData", ulList);
    return "userManagement";
  }
}
