package com.example.playlist.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.playlist.model.tagModel;

@Controller
public class mainController {
  
  @GetMapping(value = "/")
  public String index() {
    return "index";
  }
  
  @GetMapping(value = "/pages/userInfo")
  public String management(Model Model) {
    String[] ulList = new String[] {"checkbox","no","name","number","id","deposit","score"};
    String[] divName = new String[] {"","No","이름","번호","아이디","총 입금액","현스코어"};
    List<Integer> loop = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());

    tagModel tagModel = new tagModel(ulList, divName);
    
    Model.addAttribute("loop", loop);
    Model.addAttribute("tagModel", tagModel);
    return "userManagement";
  }
}
