package com.studentmanagementsystem.studentmanagementsystem.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
@NoArgsConstructor
public class Student extends User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "roll_no", nullable = false)
  private Long rollNo;
}
