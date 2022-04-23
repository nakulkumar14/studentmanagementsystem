package com.studentmanagementsystem.studentmanagementsystem.transformer;

import com.studentmanagementsystem.studentmanagementsystem.entity.Address;
import com.studentmanagementsystem.studentmanagementsystem.entity.Student;
import com.studentmanagementsystem.studentmanagementsystem.model.AddressDTO;
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

    studentDTO.setAddressDTO(getAddressDTO(student.getAddress()));
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

    student.setAddress(getAddress(studentDTO.getAddressDTO()));
    return student;
  }

  private static Address getAddress(AddressDTO addressDTO) {
    Address address = new Address();
    address.setAddressLine1(addressDTO.getAddressLine1());
    address.setAddressLine2(addressDTO.getAddressLine2());
    address.setCity(addressDTO.getCity());
    address.setState(addressDTO.getState());
    address.setPincode(addressDTO.getPincode());
    address.setCreatedDate(addressDTO.getCreatedDate());
    address.setUpdateDate(addressDTO.getUpdateDate());
    address.setUpdatedBy(addressDTO.getUpdatedBy());
    return address;
  }

  private static AddressDTO getAddressDTO(Address address) {
    AddressDTO addressDTO = new AddressDTO();
    addressDTO.setId(address.getId());
    addressDTO.setAddressLine1(address.getAddressLine1());
    addressDTO.setAddressLine2(address.getAddressLine2());
    addressDTO.setCity(address.getCity());
    addressDTO.setState(address.getState());
    addressDTO.setPincode(address.getPincode());
    addressDTO.setCreatedDate(address.getCreatedDate());
    addressDTO.setUpdateDate(address.getUpdateDate());
    addressDTO.setUpdatedBy(address.getUpdatedBy());
    return addressDTO;
  }
}
