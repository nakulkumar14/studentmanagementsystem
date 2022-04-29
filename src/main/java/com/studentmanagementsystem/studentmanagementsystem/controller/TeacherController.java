package com.studentmanagementsystem.studentmanagementsystem.controller;

import com.studentmanagementsystem.studentmanagementsystem.entity.Teacher;
import com.studentmanagementsystem.studentmanagementsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
  @Autowired
  private TeacherService teacherService;

  @GetMapping("/teacher")
  public List<Teacher> getTeachers() {
    return teacherService.findAll();
  }

  @GetMapping("/teacher/{id}")
  public Teacher getTeacher(@PathVariable("id") Long id) {
    return teacherService.getById(id);
  }

  @PostMapping("/teacher")
  public Teacher saveTeacher(@RequestBody Teacher teacher) {
    return teacherService.save(teacher);
  }

  @PatchMapping("/teacher/{id}")
  public Teacher updateTeacher(@PathVariable("id") Long id, @RequestBody Teacher teacher) {
    return teacherService.update(id, teacher);
  }

  @DeleteMapping("/teacher/{id}")
  public void deleteTeacher(@PathVariable("id") Long id) {
    teacherService.delete(id);
  }
}
