package com.example.playlist.model;

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
}
