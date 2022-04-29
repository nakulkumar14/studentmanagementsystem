package com.studentmanagementsystem.studentmanagementsystem.controller;

import com.studentmanagementsystem.studentmanagementsystem.entity.Standard;
import com.studentmanagementsystem.studentmanagementsystem.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StandardController {
  @Autowired
  private StandardService standardService;

  @GetMapping("/standard/{id}")
  public Standard getStandard(@PathVariable("id") Integer id) {
    return standardService.getStandard(id);
  }

  @GetMapping("/standard")
  public List<Standard> getStandards() {
    return standardService.getStandards();
  }
}
