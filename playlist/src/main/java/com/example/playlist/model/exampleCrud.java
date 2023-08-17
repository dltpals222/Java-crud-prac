package com.example.playlist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class exampleCrud {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int no;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private int number;

  @Column(nullable = false)
  private String id;

  @Column(nullable = false)
  private Long deposit;

  @Column(nullable = false)
  private int score;


}
