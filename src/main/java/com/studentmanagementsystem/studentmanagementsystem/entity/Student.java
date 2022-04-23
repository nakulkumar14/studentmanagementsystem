package com.studentmanagementsystem.studentmanagementsystem.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
@NoArgsConstructor
public class Student extends User{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
}
