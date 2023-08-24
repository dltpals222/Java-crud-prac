package com.example.playlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.playlist.model.ReadUserModel;
import com.example.playlist.repository.BaseUserDAO;
import com.example.playlist.repository.UserFindRepository;

@Service
public class UserFindService {
  
  @Autowired
  private UserFindRepository userFindRepository;

  @Autowired
  private BaseUserDAO baseUserDAO;
  
  public List<ReadUserModel> findAllUsers() {
    return userFindRepository.findAll();
  }

  public List<ReadUserModel> findByNoList(List<Integer> noList) {
    return baseUserDAO.findByNoList(noList);
  }
}
