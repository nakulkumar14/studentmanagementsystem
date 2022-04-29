package com.studentmanagementsystem.studentmanagementsystem.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
@Table(name = "subject")
@Entity
public class Subject extends BaseEntity{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name", nullable = false)
  private String name;

  @ManyToOne
  @JoinColumn(name = "standard_class_id", nullable = false)
  private StandardClass standardClass;
}
