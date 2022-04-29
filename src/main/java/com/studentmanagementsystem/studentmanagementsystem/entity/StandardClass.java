package com.studentmanagementsystem.studentmanagementsystem.entity;

import com.studentmanagementsystem.studentmanagementsystem.enums.Section;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Table(name = "standard_class")
@Entity
public class StandardClass extends BaseEntity{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Enumerated(EnumType.STRING)
  @Column(name = "section", nullable = false)
  private Section section;

  @OneToMany(mappedBy = "standardClass")
  private List<Subject> subjects;
}
