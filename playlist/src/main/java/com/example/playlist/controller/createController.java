package com.example.playlist.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.playlist.model.tagModel;

@Controller
public class createController {
  @GetMapping(value= "/pages/create")
  public String createPage(Model model) {
    String[] ulList = new String[] {"name","number","id","deposit","score"};
    String[] divName = new String[] {"이름","번호","아이디","총 입금액","현스코어"};
    List<Integer> loop = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

    tagModel tagModel = new tagModel(ulList, divName);

    model.addAttribute("loop", loop);
    model.addAttribute("tagModel", tagModel);
    return "create";
  }
}
