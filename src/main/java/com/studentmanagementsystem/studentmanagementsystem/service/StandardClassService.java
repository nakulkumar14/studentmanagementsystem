package com.studentmanagementsystem.studentmanagementsystem.service;

import com.studentmanagementsystem.studentmanagementsystem.entity.StandardClass;
import com.studentmanagementsystem.studentmanagementsystem.exceptions.RecordNotFoundException;
import com.studentmanagementsystem.studentmanagementsystem.repository.StandardClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandardClassService {
  @Autowired
  private StandardClassRepository standardClassRepository;

  public StandardClass getStandardClass(Integer id) {
    return standardClassRepository.findById(id)
        .orElseThrow(RecordNotFoundException::new);
  }

  public List<StandardClass> getStandardClasses() {
    return standardClassRepository.findAll();
  }
}
