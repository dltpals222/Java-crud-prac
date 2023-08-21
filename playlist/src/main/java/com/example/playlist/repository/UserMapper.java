package com.example.playlist.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.playlist.model.User;

public class UserMapper implements RowMapper<User>{

  @Override
  public User mapRow(ResultSet resultSet, int rowNum) throws SQLException{
    //객체 생성
    User user = new User();

    // User
    user.setName(resultSet.getString("name"));
    user.setNumber(resultSet.getInt("number"));
    user.setId(resultSet.getString("id"));
    user.setDeposit(resultSet.getLong("deposit"));
    user.setScore(resultSet.getInt("score"));

    // 반환
    return user;
  }
}
