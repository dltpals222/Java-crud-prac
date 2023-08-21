package com.example.playlist.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.playlist.model.ReadUserModel;

@Repository
public class UserFindRepositoryImpl implements UserFindRepository{
  
  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public List<ReadUserModel> findAll() {
    String sql = "SELECT * FROM exampleCrud";
    UserMapper userMapper = new UserMapper();

    return jdbcTemplate.query(sql, userMapper);
  }
}
