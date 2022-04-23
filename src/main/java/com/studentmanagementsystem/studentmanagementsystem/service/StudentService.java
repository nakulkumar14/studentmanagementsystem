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
public class StudentService {

  @Autowired
  private StudentRepository studentRepository;

  public List<StudentDTO> getStudents() {
    List<Student> students = studentRepository.findAll();
    return StudentTransformer.toDTO(students);
  }

  public StudentDTO getStudent(Long id) {
    Optional<Student> optionalStudent = studentRepository.findById(id);
    Student student = optionalStudent.orElseThrow(RecordNotFoundException::new);
    return StudentTransformer.toDTO(student);
  }

  public void deleteStudent(Long id) {
    studentRepository.deleteById(id);
  }

  public StudentDTO saveStudent(StudentDTO studentDTO) {
    Student student = StudentTransformer.toEntity(studentDTO);
    Student savedStudent = studentRepository.save(student);
    return StudentTransformer.toDTO(savedStudent);
  }

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
}
