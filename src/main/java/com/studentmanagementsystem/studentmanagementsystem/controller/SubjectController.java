package com.studentmanagementsystem.studentmanagementsystem.controller;

import com.studentmanagementsystem.studentmanagementsystem.entity.Subject;
import com.studentmanagementsystem.studentmanagementsystem.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {
  @Autowired
  private SubjectService subjectService;

  @GetMapping("/subject/{name}")
  public Subject findByName(@PathVariable("name") String name) {
    return subjectService.findByName(name);
  }

  @GetMapping("/subject")
  public List<Subject> getSubjects() {
    return subjectService.getSubjects();
  }
}
