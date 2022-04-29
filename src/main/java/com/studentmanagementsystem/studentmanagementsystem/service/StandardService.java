package com.studentmanagementsystem.studentmanagementsystem.service;

import com.studentmanagementsystem.studentmanagementsystem.entity.Standard;
import com.studentmanagementsystem.studentmanagementsystem.exceptions.RecordNotFoundException;
import com.studentmanagementsystem.studentmanagementsystem.repository.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandardService {
  @Autowired
  private StandardRepository standardRepository;

  public Standard getStandard(Integer id) {
    return standardRepository.findById(id)
        .orElseThrow(RecordNotFoundException::new);
  }

  public List<Standard> getStandards() {
    return standardRepository.findAll();
  }
}
