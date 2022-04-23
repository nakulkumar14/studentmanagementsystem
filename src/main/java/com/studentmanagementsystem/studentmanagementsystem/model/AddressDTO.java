package com.studentmanagementsystem.studentmanagementsystem.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDTO extends BaseDTO {
  private Long id;
  private String addressLine1;
  private String addressLine2;
  private String city;
  private String state;
  private int pincode;
}
