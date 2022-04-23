package com.studentmanagementsystem.studentmanagementsystem.controller;

import com.studentmanagementsystem.studentmanagementsystem.model.StudentDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
  @GetMapping("/student")
  public List<StudentDTO> getStudents() {
    return null;
  }

  @GetMapping("/student/{id}")
  public StudentDTO getStudent(@PathVariable("id") Long id) {
    return null;
  }

  @PostMapping("/student")
  public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO) {
    return null;
  }

  @PatchMapping("/student/{id}")
  public StudentDTO saveStudent(@PathVariable("id") Long id, @RequestBody StudentDTO studentDTO) {
    return null;
  }

  @DeleteMapping("/student/{id}")
  public void deleteStudent(@PathVariable("id") Long id) {

  }
}
