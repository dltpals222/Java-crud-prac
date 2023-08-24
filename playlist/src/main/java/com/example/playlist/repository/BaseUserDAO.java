package com.example.playlist.repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.playlist.model.ReadUserModel;
import com.example.playlist.model.User;

@Repository
public class BaseUserDAO {

  //* JdbcTemplate
  private final JdbcTemplate jdbcTemplate;
  
  //*NamedParameterJdbcTemplate
  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
  
  // @Autowired 키워드 사용하려 했으나 불필요하여 삭제
  public BaseUserDAO(DataSource dataSource){
    this.jdbcTemplate = new JdbcTemplate(dataSource);
    this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
  }

  //? create에서 사용될 메소드
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

  //? update에 사용될 체크된 리스트 불러오는 메소드
  public List<ReadUserModel> findByNoList(List<String> noList){
    String sqlSelect = "SELECT * FROM exampleCrud WHERE no IN (:noList)";
    MapSqlParameterSource parameters = new MapSqlParameterSource();
    parameters.addValue("noList",noList);
    List<ReadUserModel> foundUsers = namedParameterJdbcTemplate.query(sqlSelect, parameters, new RowMapper<ReadUserModel>() {
      @Override
      public ReadUserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        ReadUserModel readUserModel = new ReadUserModel();
        readUserModel.setName(rs.getString("name"));
        readUserModel.setNumber(rs.getInt("number"));
        readUserModel.setId(rs.getString("id"));
        readUserModel.setDeposit(rs.getLong("deposit"));
        readUserModel.setScore(rs.getInt("score"));
        readUserModel.setNo(rs.getInt("no"));

        return readUserModel;
        
      }
    
    });
    return foundUsers;
  }

  //? update 쿼리 및 수정하기 위한 메소드
  public int updateByNo(String no, User updatedUser){
    String sqlUpdate = "UPDATE examplecrud SET name = ?, number = ?, id = ?, deposit = ?, score = ? WHERE no = ?";
    Object[] params = {
      updatedUser.getName(),
      updatedUser.getNumber(),
      updatedUser.getId(),
      updatedUser.getDeposit(),
      updatedUser.getScore(),
      no
    };
    
    int rowsAffected = jdbcTemplate.update(sqlUpdate, params);
    return rowsAffected;
    
  }

}
