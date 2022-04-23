package com.studentmanagementsystem.studentmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "address")
@NoArgsConstructor
public class Address extends BaseEntity{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "address_line1", nullable = false)
  private String addressLine1;

  @Column(name = "address_line2")
  private String addressLine2;

  @Column(name = "city", nullable = false)
  private String city;

  @Column(name = "state", nullable = false)
  private String state;

  @Column(name = "pincode", nullable = false)
  private int pincode;
}
