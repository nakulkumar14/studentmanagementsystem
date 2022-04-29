package com.studentmanagementsystem.studentmanagementsystem.service;

import com.studentmanagementsystem.studentmanagementsystem.entity.Teacher;
import com.studentmanagementsystem.studentmanagementsystem.exceptions.RecordNotFoundException;
import com.studentmanagementsystem.studentmanagementsystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements BaseService<Teacher> {

  @Autowired
  private TeacherRepository teacherRepository;

  @Override
  public List<Teacher> findAll() {
    return teacherRepository.findAll();
  }

  @Override
  public Teacher getById(Long id) {
    return teacherRepository.findById(id)
        .orElseThrow(RecordNotFoundException::new);
  }

  @Override
  public Teacher save(Teacher teacher) {
    return teacherRepository.save(teacher);
  }

  @Override
  public Teacher update(Long id, Teacher teacher) {
    return null;
  }

  @Override
  public void delete(Long id) {
    Teacher teacher = teacherRepository.findById(id)
        .orElseThrow(RecordNotFoundException::new);
    teacherRepository.delete(teacher);
  }
}
