package com.studentmanagementsystem.studentmanagementsystem.service;

import com.studentmanagementsystem.studentmanagementsystem.entity.Subject;
import com.studentmanagementsystem.studentmanagementsystem.exceptions.RecordNotFoundException;
import com.studentmanagementsystem.studentmanagementsystem.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
  @Autowired
  private SubjectRepository subjectRepository;

  public Subject findByName(String name) {
    return subjectRepository.findByName(name)
        .orElseThrow(RecordNotFoundException::new);
  }

  public List<Subject> getSubjects() {
    return subjectRepository.findAll();
  }
}
