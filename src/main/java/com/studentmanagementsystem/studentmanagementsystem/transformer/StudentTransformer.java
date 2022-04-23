package com.studentmanagementsystem.studentmanagementsystem.transformer;

import com.studentmanagementsystem.studentmanagementsystem.entity.Student;
import com.studentmanagementsystem.studentmanagementsystem.model.StudentDTO;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class StudentTransformer {
  public static StudentDTO toDTO(Student student) {
    StudentDTO studentDTO = new StudentDTO();
    studentDTO.setId(student.getId());
    studentDTO.setFirstName(student.getFirstName());
    studentDTO.setMiddleName(student.getMiddleName());
    studentDTO.setLastName(student.getLastName());
    studentDTO.setGender(student.getGender());
    studentDTO.setCreatedDate(student.getCreatedDate());
    studentDTO.setUpdateDate(student.getUpdateDate());
    studentDTO.setUpdatedBy(student.getUpdatedBy());
    return studentDTO;
  }

  public static List<StudentDTO> toDTO(List<Student> students) {
    List<StudentDTO> studentDTOS = new ArrayList<>();
    students.forEach(student -> studentDTOS.add(toDTO(student)));
    return studentDTOS;
  }

  public static Student toEntity(StudentDTO studentDTO) {
    Student student = new Student();
    student.setFirstName(studentDTO.getFirstName());
    student.setMiddleName(studentDTO.getMiddleName());
    student.setLastName(studentDTO.getLastName());
    student.setGender(studentDTO.getGender());
    student.setUpdatedBy(studentDTO.getUpdatedBy());
    return student;
  }
}
