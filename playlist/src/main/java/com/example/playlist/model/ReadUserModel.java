package com.example.playlist.model;

public class ReadUserModel extends User {
  //* 인스턴스 변수
  private Integer no;

  //* 기본생성자
  public ReadUserModel(){
    super();
  }

  //* 생성자
  public ReadUserModel(String name, Integer number, String id, Long deposit, Integer score, Integer no) {
    super(name, number, id, deposit, score);
    this.no = no;
  }

  //* getters and setters
  //? no
  public Integer getNo () {
    return no;
  }

  public void setNo (Integer no) {
    this.no = no;
  }

}
