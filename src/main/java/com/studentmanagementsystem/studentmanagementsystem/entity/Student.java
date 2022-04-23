package com.studentmanagementsystem.studentmanagementsystem.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "student")
public class Student extends User{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
}
