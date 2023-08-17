package com.example.playlist.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.playlist.model.BaseUser;

@RestController
@RequestMapping(value = "/api")
public class createRestController {
  @PostMapping(value = "/userInfo")
  public String postMethod(@RequestBody BaseUser baseUser) {
    return "OK";

}
}
