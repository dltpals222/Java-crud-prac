package com.example.playlist.model;

import java.util.Arrays;
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

  public void removeEmptyValues() {
    name = Arrays.stream(name).filter(v -> v != null && !v.trim().isEmpty()).toArray(String[]::new);
    id = Arrays.stream(id).filter(v -> v != null && !v.trim().isEmpty()).toArray(String[]::new);

    number = Arrays.stream(number).filter(Objects::nonNull).toArray(Integer[]::new);
    deposit = Arrays.stream(deposit).filter(Objects::nonNull).toArray(Long[]::new);
    score = Arrays.stream(score).filter(Objects::nonNull).toArray(Integer[]::new);
  }

  public void validateAndPrintErrors() {
    if (name == null || name.length == 0) {
        System.out.println("이름 값이 빠져있습니다.");
    }
    if (number == null || number.length == 0) {
        System.out.println("번호 값이 빠져있습니다.");
    }
    if (id == null || id.length == 0) {
        System.out.println("ID 값이 빠져있습니다.");
    }
    if (deposit == null || deposit.length == 0) {
        System.out.println("총 입금액 값이 빠져있습니다.");
    }
    if (score == null || score.length == 0) {
        System.out.println("현스코어 값이 빠져있습니다.");
    }
}
}
