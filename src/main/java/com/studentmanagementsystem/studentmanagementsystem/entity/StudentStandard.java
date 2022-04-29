package com.studentmanagementsystem.studentmanagementsystem.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@Table(name = "student_standard")
@Entity
public class StudentStandard extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "student_id")
  private Student student;

  @ManyToOne
  @JoinColumn(name = "standard_id")
  private Standard standard;

  @Temporal(TemporalType.DATE)
  @Column(name = "fromDate", nullable = false)
  private Date fromDate;

  @Temporal(TemporalType.DATE)
  @Column(name = "toDate", nullable = false)
  private Date toDate;
}

