package com.example.playlist.repository;

import java.util.List;

import com.example.playlist.model.ReadUserModel;

public interface UserFindRepository {
  List<ReadUserModel> findAll();
}
