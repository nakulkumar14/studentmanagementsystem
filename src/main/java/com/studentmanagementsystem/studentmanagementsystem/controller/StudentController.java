package com.studentmanagementsystem.studentmanagementsystem.controller;

import com.studentmanagementsystem.studentmanagementsystem.entity.Student;
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
  public List<Student> getStudents() {
    return studentService.findAll();
  }

  @GetMapping("/student/{id}")
  public Student getStudent(@PathVariable("id") Long id) {
    return studentService.getById(id);
  }

  @PostMapping("/student")
  public Student saveStudent(@RequestBody Student student) {
    return studentService.save(student);
  }

  @PatchMapping("/student/{id}")
  public StudentDTO updateStudent(@PathVariable("id") Long id, @RequestBody StudentDTO studentDTO) {
    return studentService.updateStudent(id, studentDTO);
  }

  @DeleteMapping("/student/{id}")
  public void deleteStudent(@PathVariable("id") Long id) {
    studentService.delete(id);
  }
}
