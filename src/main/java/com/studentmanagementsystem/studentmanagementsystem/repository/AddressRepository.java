package com.studentmanagementsystem.studentmanagementsystem.repository;

import com.studentmanagementsystem.studentmanagementsystem.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
