package com.example.playlist.model;

// 배열의 길이를 맞추기 위한 클래스 생성
public class User {
  private String name;
  private Integer number;
  private String id;
  private Long deposit;
  private Integer score;

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
