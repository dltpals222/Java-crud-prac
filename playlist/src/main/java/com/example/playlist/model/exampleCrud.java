package com.example.playlist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class exampleCrud {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer no;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private Integer number;

  @Column(nullable = false)
  private String id;

  @Column(nullable = false)
  private Long deposit;

  @Column(nullable = false)
  private Integer score;


}
