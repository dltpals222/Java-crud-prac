package com.example.playlist.model;

public class tagModel {
  //* 인스턴스 변수
  private String[] ulList;
  private String[] divName;

  //* 생성자
  public tagModel(String[] ulList, String[] divName){
    this.ulList = ulList;
    this.divName = divName;
  }

  //* getters and setters
  //? ulList
  public String[] getUlList () {
    return ulList;
  }

  public void setUlList (String[] ulList) {
    this.ulList = ulList;
  }

  //? divName
  public String[] getDivName () {
    return divName;
  }
  public void setDivName (String[] divName) {
    this.divName = divName;
  }
}
