package com.studentmanagementsystem.studentmanagementsystem.controller;

import com.studentmanagementsystem.studentmanagementsystem.model.StudentDTO;
import com.studentmanagementsystem.studentmanagementsystem.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class StudentController {

  @Autowired
  private StudentService studentService;

  @GetMapping("/student")
  public List<StudentDTO> getStudents() {
    log.info("get all students");
    return studentService.getStudents();
  }

  @GetMapping("/student/{id}")
  public StudentDTO getStudent(@PathVariable("id") Long id) {
    return studentService.getStudent(id);
  }

  @PostMapping("/student")
  public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO) {
    log.info("save student");
    return studentService.saveStudent(studentDTO);
  }

  @PatchMapping("/student/{id}")
  public StudentDTO updateStudent(@PathVariable("id") Long id, @RequestBody StudentDTO studentDTO) {
    return studentService.updateStudent(id, studentDTO);
  }

  @DeleteMapping("/student/{id}")
  public void deleteStudent(@PathVariable("id") Long id) {
    studentService.deleteStudent(id);
  }
}
