package com.studentmanagementsystem.studentmanagementsystem.model;

import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseDTO {
  protected Date createdDate;
  protected Date updateDate;
  protected String updatedBy;
}
