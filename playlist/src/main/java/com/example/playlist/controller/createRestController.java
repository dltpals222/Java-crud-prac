package com.example.playlist.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.playlist.model.BaseUser;
import com.example.playlist.repository.BaseUserDAO;

@RestController
@RequestMapping(value = "/api")
public class createRestController {

  private final BaseUserDAO baseUserDAO;

  public createRestController(BaseUserDAO baseUserDAO) {
    this.baseUserDAO = baseUserDAO;
  }

  @PostMapping(value = "/userInfo")
  public RedirectView postMethod(BaseUser baseUser) {

    baseUser.removeEmptyValues();
    int[] rowsAffected = baseUserDAO.insert(baseUser);

    System.out.println("저장된 행 개수 : " + Arrays.stream(rowsAffected).sum());

    // 이전페이지로 리디렉션 로직
    RedirectView redirectView = new RedirectView();
    redirectView.setUrl("http://localhost:8080/");
    return redirectView;
}
}
