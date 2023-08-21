package com.example.playlist.model;

// 유저 정보를 저장하고 관리하기 위한 클래스
public class User {
  private String name;
  private Integer number;
  private String id;
  private Long deposit;
  private Integer score;

  //* 기본생성자
  public User(){}

  //* 생성자
  public User(String name, Integer number, String id, Long deposit, Integer score){
    this.name = name;
    this.number = number;
    this.id = id;
    this.deposit = deposit;
    this.score = score;
  }
  //* getters and setters
  //? name
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //? number
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  //? id
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  //? deposit
  public Long getDeposit() {
    return deposit;
  }

  public void setDeposit(Long deposit) {
    this.deposit = deposit;
  }

  //? score
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score){
    this.score = score;
  }
}
