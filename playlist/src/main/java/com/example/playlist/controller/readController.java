package com.example.playlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.playlist.model.User;
import com.example.playlist.service.UserFindService;

@Controller
@RequestMapping(value = "/pages")
public class readController {

  @Autowired
  private UserFindService userFindService;

  @GetMapping(value = "/userInfo")
  public ModelAndView findAllUsers(Model model){
    ModelAndView view = new ModelAndView();
    List<User> users = userFindService.findAllUsers();
    model.addAttribute("users", users);
    view.setViewName("users");
    return view;
  }
}
