package com.example.playlist.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.playlist.model.User;

@Repository
public class BaseUserDAO {
  private final JdbcTemplate jdbcTemplate;

  public BaseUserDAO(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  // create에서 사용될 메소드
  public int[] insert(List<User> users) {
    List<Object[]> parameters = new ArrayList<>();

    for(User user : users) {
    String name = user.getName();
    Integer number = user.getNumber();
    String id = user.getId();
    Long deposit = user.getDeposit();
    Integer score = user.getScore();

    parameters.add(new Object[] {name, number,id, deposit, score});
    }
    //쿼리문 작성
    String sqlInsert = "INSERT INTO exampleCrud (name, number, id, deposit, score) VALUES (?,?,?,?,?)";
    int[] rowsAffected = jdbcTemplate.batchUpdate(sqlInsert, parameters);

    return rowsAffected;
  }

}
