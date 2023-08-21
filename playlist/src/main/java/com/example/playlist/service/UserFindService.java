package com.example.playlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.playlist.model.User;
import com.example.playlist.repository.UserFindRepository;

@Service
public class UserFindService {
  
  @Autowired
  private UserFindRepository userFindRepository;

  public List<User> findAllUsers() {
    return userFindRepository.findAll();
  }
}
