package com.studentmanagementsystem.studentmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity {
  @Column(name = "created_date")
  private Date createdDate;

  @Column(name = "updated_date")
  private Date updateDate;

  @Column(name = "updated_by")
  private String updatedBy;
}
