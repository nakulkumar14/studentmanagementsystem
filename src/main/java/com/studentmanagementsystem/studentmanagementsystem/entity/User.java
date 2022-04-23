package com.studentmanagementsystem.studentmanagementsystem.entity;

import com.studentmanagementsystem.studentmanagementsystem.enums.Gender;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public class User extends BaseEntity{
  @Column(name = "firstname", nullable = false)
  private String firstName;

  @Column(name = "middlename")
  private String middleName;

  @Column(name = "lastname", nullable = false)
  private String lastName;

  @Enumerated(EnumType.STRING)
  @Column(name = "gender", nullable = false)
  private Gender gender;

  @Temporal(TemporalType.DATE)
  @Column(name = "dob", nullable = false)
  private Date dob;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "address_id", referencedColumnName = "id")
  private Address address;
}
