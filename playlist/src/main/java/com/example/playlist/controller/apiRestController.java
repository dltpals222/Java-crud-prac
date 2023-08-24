package com.example.playlist.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.playlist.model.BaseUser;
import com.example.playlist.model.User;
import com.example.playlist.repository.BaseUserDAO;

@RestController
@RequestMapping(value = "/api")
public class apiRestController {

  private final BaseUserDAO baseUserDAO;

  public apiRestController(BaseUserDAO baseUserDAO) {
    this.baseUserDAO = baseUserDAO;
  }

  @PostMapping(value = "/userInfo")
  public RedirectView postMethod(BaseUser baseUser) {

    // null및 빈 문자열 제거
    baseUser.removeEmptyValues();
    List<User> users = baseUser.convertToUserList();
    int[] rowsAffected = baseUserDAO.insert(users);

    System.out.println("저장된 행 개수 : " + Arrays.stream(rowsAffected).sum());

    // 이전페이지로 리디렉션 로직
    RedirectView redirectView = new RedirectView();
    redirectView.setUrl("http://localhost:8080/");
    return redirectView;
  }
}
