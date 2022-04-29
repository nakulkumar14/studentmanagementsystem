package com.studentmanagementsystem.studentmanagementsystem.controller;

import com.studentmanagementsystem.studentmanagementsystem.entity.StandardClass;
import com.studentmanagementsystem.studentmanagementsystem.service.StandardClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StandardClassController {
  @Autowired
  private StandardClassService standardClassService;

  @GetMapping("/standard/{id}")
  public StandardClass getStandardClass(@PathVariable("id") Integer id) {
    return standardClassService.getStandardClass(id);
  }

  @GetMapping("/standard")
  public List<StandardClass> getStandardClasses() {
    return standardClassService.getStandardClasses();
  }
}
