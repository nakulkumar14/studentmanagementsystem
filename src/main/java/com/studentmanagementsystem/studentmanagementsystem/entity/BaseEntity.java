package com.studentmanagementsystem.studentmanagementsystem.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity {
  @Column(name = "created_date")
  private Date createdDate;

  @Column(name = "updated_date")
  private Date updateDate;

  @Column(name = "updated_by")
  private String updatedBy;
}
