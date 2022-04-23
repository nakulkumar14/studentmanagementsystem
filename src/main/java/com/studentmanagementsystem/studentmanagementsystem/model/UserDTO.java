package com.studentmanagementsystem.studentmanagementsystem.model;

import com.studentmanagementsystem.studentmanagementsystem.enums.Gender;
import lombok.Data;

@Data
public abstract class UserDTO extends BaseDTO {
  protected String firstName;
  protected String middleName;
  protected String lastName;
  protected Gender gender;
}
