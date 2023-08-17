package com.example.playlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.playlist.model.exampleCrud;


public interface Example1Repository extends JpaRepository<exampleCrud, Long>{
  
}
