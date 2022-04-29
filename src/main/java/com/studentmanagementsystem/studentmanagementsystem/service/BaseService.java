package com.studentmanagementsystem.studentmanagementsystem.service;

import java.util.List;

public interface BaseService<T> {

  List<T> findAll();

  T getById(Long id);

  T save(T t);

  T update(Long id, T t);

  void delete(Long id);
}
