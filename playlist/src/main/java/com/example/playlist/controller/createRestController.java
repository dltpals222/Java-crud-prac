package com.example.playlist.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.playlist.model.BaseUser;

@RestController
@RequestMapping(value = "/api")
public class createRestController {

  @PostMapping(value = "/userInfo")
  public RedirectView postMethod(BaseUser baseUser) {

    // BaseUser 객체의 속성 출력 확인용 코드
    System.out.println("name: " + baseUser.getName());
    System.out.println("number: " + baseUser.getNumber());
    System.out.println("id: " + baseUser.getId());
    System.out.println("deposit: " + baseUser.getDeposit());
    System.out.println("score: " + baseUser.getScore());

    // 이전페이지로 리디렉션 로직
    RedirectView redirectView = new RedirectView();
    redirectView.setUrl("http://localhost:8080/");
    return redirectView;
}
}
