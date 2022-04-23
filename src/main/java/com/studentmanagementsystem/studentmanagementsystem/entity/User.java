package com.studentmanagementsystem.studentmanagementsystem.entity;

import com.studentmanagementsystem.studentmanagementsystem.enums.Gender;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class User extends BaseEntity{
  @Column(name = "firstname", nullable = false)
  private String firstName;

  @Column(name = "middlename")
  private String middleName;

  @Column(name = "lastname", nullable = false)
  private String lastName;

  @Enumerated(EnumType.STRING)
  @Column(name = "gender")
  private Gender gender;
}
