package com.example.playlist.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.playlist.model.BaseUser;

@Repository
public class BaseUserDAO {
  private final JdbcTemplate jdbcTemplate;

  public BaseUserDAO(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public int[] insert(BaseUser baseUser) {
    List<Object[]> parameters = new ArrayList<>();

    for(int i = 0; i < baseUser.getName().length; i++) {
    String name = baseUser.getName()[i];
    Integer number = baseUser.getNumber()[i];
    String id = baseUser.getId()[i];
    Long deposit = baseUser.getDeposit()[i];
    Integer score = baseUser.getScore()[i];

    parameters.add(new Object[] {name, number,id, deposit, score});
    }
    //쿼리문 작성
    String sqlInsert = "INSERT INTO exampleCrud (name, number, id, deposit, score) VALUES (?,?,?,?,?)";
    int[] rowsAffected = jdbcTemplate.batchUpdate(sqlInsert, parameters);

    return rowsAffected;
  }

}
