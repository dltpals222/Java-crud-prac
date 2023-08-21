package com.example.playlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.playlist.model.ReadUserModel;
import com.example.playlist.service.UserFindService;

@Controller
@RequestMapping(value = "/api")
public class readController {

  @Autowired
  private UserFindService userFindService;

  @GetMapping(value = "/readInfo")
  public ModelAndView findAllUsers(Model model){
    ModelAndView view = new ModelAndView();
    List<ReadUserModel> users = userFindService.findAllUsers();
    System.out.println(users);
    model.addAttribute("users", users);
    view.setViewName("userManagement");
    return view;
  }
}
