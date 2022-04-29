package com.studentmanagementsystem.studentmanagementsystem.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "teacher")
public class Teacher extends User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;


}
