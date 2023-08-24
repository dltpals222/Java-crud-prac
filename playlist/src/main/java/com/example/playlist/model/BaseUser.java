package com.example.playlist.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BaseUser {
  //* 인스턴스 변수
  private String[] name;
  private Integer[] number;
  private String[] id;
  private Long[] deposit;
  private Integer[] score;

  //* 생성자 
  public BaseUser(String[] name, Integer[] number, String[] id, Long[] deposit, Integer[] score) {
    this.name = name;
    this.number = number;
    this.id = id;
    this.deposit = deposit;
    this.score = score;
  }

  //* getters and setters
  //? name
  public String[] getName() {
    return name;
  }

  public void setName(String[] name) {
    this.name = name;
  }

  //? number
  public Integer[] getNumber() {
    return number;
  }

  public void setNumber(Integer[] number) {
    this.number = number;
  }

  //? id
  public String[] getId() {
    return id;
  }

  public void setId(String[] id) {
    this.id = id;
  }

  //? deposit
  public Long[] getDeposit() {
    return deposit;
  }

  public void setDeposit(Long[] deposit) {
    this.deposit = deposit;
  }

  //? score
  public Integer[] getScore() {
    return score;
  }

  public void setScore(Integer[] score){
    this.score = score;
  }

  // null값 및 빈 문자열 제거
  public void removeEmptyValues() {
    // name = Arrays.stream(name).filter(v -> v != null && !v.trim().isEmpty()).toArray(String[]::new);
    // id = Arrays.stream(id).filter(v -> v != null && !v.trim().isEmpty()).toArray(String[]::new);

    // number = Arrays.stream(number).filter(Objects::nonNull).toArray(Integer[]::new);
    // deposit = Arrays.stream(deposit).filter(Objects::nonNull).toArray(Long[]::new);
    // score = Arrays.stream(score).filter(Objects::nonNull).toArray(Integer[]::new);

    if (name != null) {
      name = Arrays.stream(name).filter(v -> v != null && !v.trim().isEmpty()).toArray(String[]::new);
    }
  
    if (id != null) {
      id = Arrays.stream(id).filter(v -> v != null && !v.trim().isEmpty()).toArray(String[]::new);
    }
  
    if (number != null) {
      number = Arrays.stream(number).filter(Objects::nonNull).toArray(Integer[]::new);
    }
  
    if (deposit != null) {
      deposit = Arrays.stream(deposit).filter(Objects::nonNull).toArray(Long[]::new);
    }
  
    if (score != null) {
      score = Arrays.stream(score).filter(Objects::nonNull).toArray(Integer[]::new);
    }
  }

    public List<User> convertToUserList(){
    List<User> users = new ArrayList<>();

    if(this.getName() != null){

      for(int i = 0; i < this.getName().length; i++){
        User user = new User();
        user.setName(this.name[i]);
        user.setNumber(this.number[i]);
        user.setId(this.id[i]);
        user.setDeposit(this.deposit[i]);
        user.setScore(this.score[i]);
        
        users.add(user);
      }
    }

    return users;
  }
}
