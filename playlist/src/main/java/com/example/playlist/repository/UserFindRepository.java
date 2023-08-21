package com.example.playlist.repository;

import java.util.List;

import com.example.playlist.model.User;

public interface UserFindRepository {
  List<User> findAll();
}
