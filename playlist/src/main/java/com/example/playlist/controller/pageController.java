package com.example.playlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.playlist.model.ReadUserModel;
import com.example.playlist.model.tagModel;
import com.example.playlist.service.UserFindService;

@Controller
@RequestMapping(value = "/pages")
public class readController {
  @Autowired
  private UserFindService userFindService;

    @GetMapping(value = "/userInfo")
  public ModelAndView management(Model model) {
    // 경로 설정
    ModelAndView view = new ModelAndView();
    view.setViewName("userManagement");

    // 표 만들기 위한 정보
    String[] ulList = new String[] {"checkbox","no","name","number","id","deposit","score"};
    String[] divName = new String[] {"","No","이름","번호","아이디","총 입금액","현스코어"};
    tagModel tagModel = new tagModel(ulList, divName);
    model.addAttribute("tagModel", tagModel);

    // read 데이터
    List<ReadUserModel> readUsers = userFindService.findAllUsers();
    System.out.println("readUsers의 사이즈 " + readUsers.size());
    model.addAttribute("users", readUsers);
    model.addAttribute("usersSize", readUsers.size());
    return view;
  }  

    @GetMapping(value = "/pages/update")
  public ModelAndView update(Model model) {
    // 경로설정
    ModelAndView view = new ModelAndView();
    view.setViewName("update");

        // 표 만들기 위한 정보
    String[] ulList = new String[] {"checkbox","no","name","number","id","deposit","score"};
    String[] divName = new String[] {"","No","이름","번호","아이디","총 입금액","현스코어"};
    tagModel tagModel = new tagModel(ulList, divName);
    model.addAttribute("tagModel", tagModel);
    return view;
  }
}