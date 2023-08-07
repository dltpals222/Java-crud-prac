package com.example.playlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
  
  @GetMapping(value = "example")
  public String index() {
    return "index";
  }
}
