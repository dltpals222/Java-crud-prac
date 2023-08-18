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
    // NullPointerException 에러처리를 위한 try catch
    try{
      int lengthName = baseUser.getName().length;

    // BaseUser 객체의 속성 출력 확인용 코드 + null값이 아닐 경우 콘솔에 찍어주기
      for (int i = 0; i < lengthName; i++) {
        if (baseUser.getName()[i] != null && baseUser.getName()[i] != "") {
            System.out.println("name: " + baseUser.getName()[i]);
        }
        
        if (baseUser.getNumber()[i] != null) {
            System.out.println("number: " + baseUser.getNumber()[i]);
        }

        if (baseUser.getId()[i] != null && baseUser.getId()[i] != "") {
            System.out.println("id: " + baseUser.getId()[i]);
        }

        if (baseUser.getDeposit()[i] != null) {
            System.out.println("deposit: " + baseUser.getDeposit()[i]);
        }

        if (baseUser.getScore()[i] != null) {
            System.out.println("score: " + baseUser.getScore()[i]);
        }
      }
    } catch (NullPointerException e) {
      System.out.println("baseUser의 이름 배열이 없습니다.");
    }

    // 이전페이지로 리디렉션 로직
    RedirectView redirectView = new RedirectView();
    redirectView.setUrl("http://localhost:8080/");
    return redirectView;
}
}
