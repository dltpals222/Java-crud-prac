package com.example.playlist.model;

public class ReadUserModel extends BaseUser {
  //* 인스턴스 변수
  private int no;
  private String ulId;

  //* 생성자
  public ReadUserModel(String name, int number, String id, Long deposit, int score,String ulId, int no) {
    super(name, number, id, deposit, score);
    this.no = no;
    this.ulId = ulId;
  }

  //* getters and setters
  //? no
  public int getNo () {
    return no;
  }

  public void setNo (int no) {
    this.no = no;
  }

  //? ulId
  public String getUlId () {
    return ulId;
  }

  public void setUlId (String ulId) {
    this.ulId = ulId;
  }
}
