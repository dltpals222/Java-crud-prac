package com.example.playlist.model;

public class ExampleUser {
  //* 인스턴스 변수
  private String name;
  private int number;
  private String id;
  private Long deposit;
  private int score;

  //* 생성자 
  public ExampleUser(String name, int number, String id, Long deposit, int score) {
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
  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
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
  public int getScore() {
    return score;
  }

  public void setScore(int score){
    this.score = score;
  }
}
