package com.studentmanagementsystem.studentmanagementsystem.service;

import com.studentmanagementsystem.studentmanagementsystem.entity.Student;
import com.studentmanagementsystem.studentmanagementsystem.exceptions.RecordNotFoundException;
import com.studentmanagementsystem.studentmanagementsystem.model.StudentDTO;
import com.studentmanagementsystem.studentmanagementsystem.repository.StudentRepository;
import com.studentmanagementsystem.studentmanagementsystem.transformer.StudentTransformer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentService implements BaseService<Student>{

  @Autowired
  private StudentRepository studentRepository;

  public StudentDTO updateStudent(Long id, StudentDTO studentDTO) {
    Optional<Student> optionalStudent = studentRepository.findById(id);
    if (optionalStudent.isPresent()) {
      Student existingStudent = optionalStudent.get();
      Student student = StudentTransformer.toEntity(studentDTO);
      student.setCreatedDate(existingStudent.getCreatedDate());
      student.setId(existingStudent.getId());
      Student savedStudent = studentRepository.save(student);
      return StudentTransformer.toDTO(savedStudent);
    } else {
      throw new RecordNotFoundException();
    }
  }

  @Override
  public List<Student> findAll() {
    return studentRepository.findAll();
  }

  @Override
  public Student getById(Long id) {
    return studentRepository.findById(id).orElseThrow(RecordNotFoundException::new);
  }

  @Override
  public Student save(Student student) {
    return studentRepository.save(student);
  }

  @Override
  public Student update(Long id, Student student) {
    return null;
  }

  @Override
  public void delete(Long id) {
    studentRepository.deleteById(id);
  }
}
