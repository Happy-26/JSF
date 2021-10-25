package org.example.service;

import org.example.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    boolean save(StudentEntity studentEntity) ;
    StudentEntity login(StudentEntity studentEntity);
    List<StudentEntity> selectAllStudents();

    boolean isExit(String name);
}
