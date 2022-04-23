package com.studentmanagementsystem.studentmanagementsystem.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity {
  @CreatedDate
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_date", nullable = false)
  private Date createdDate;

  @LastModifiedDate
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "updated_date", nullable = false)
  private Date updateDate;

  @Column(name = "updated_by")
  private String updatedBy;

  @PrePersist
  public void onPrePersist() {
    this.createdDate = new Date();
    this.updateDate = new Date();
  }

  @PreUpdate
  public void onPreUpdate() {
    this.updateDate = new Date();
  }
}
