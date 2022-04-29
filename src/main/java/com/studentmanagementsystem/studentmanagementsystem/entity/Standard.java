package com.studentmanagementsystem.studentmanagementsystem.entity;

import com.studentmanagementsystem.studentmanagementsystem.enums.Section;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Builder
@Table(name = "standard")
@Entity
public class Standard extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Enumerated(EnumType.STRING)
  @Column(name = "section", nullable = false)
  private Section section;

  @OneToMany(mappedBy = "standard")
  private List<Subject> subjects;

  @OneToMany(mappedBy = "standard")
  private Set<StudentStandard> studentStandards;
}
