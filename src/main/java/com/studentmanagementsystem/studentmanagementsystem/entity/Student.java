package com.studentmanagementsystem.studentmanagementsystem.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

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

  @OneToMany(mappedBy = "student")
  private Set<StudentStandard> studentStandards;
}
