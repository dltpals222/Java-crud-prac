package com.example.playlist.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.playlist.model.ReadUserModel;


public class UserMapper implements RowMapper<ReadUserModel>{

  @Override
  public ReadUserModel mapRow(ResultSet resultSet, int rowNum) throws SQLException{
    //객체 생성
    ReadUserModel user = new ReadUserModel();

    // User
    user.setNo(resultSet.getInt("no"));
    user.setName(resultSet.getString("name"));
    user.setNumber(resultSet.getInt("number"));
    user.setId(resultSet.getString("id"));
    user.setDeposit(resultSet.getLong("deposit"));
    user.setScore(resultSet.getInt("score"));

    // 반환
    return user;
  }
}
