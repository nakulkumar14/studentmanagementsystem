package com.studentmanagementsystem.studentmanagementsystem.entity;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity {
  private Date createdDate;
  private Date updateDate;
  private String updatedBy;
}
