package org.example.service;

import org.example.pojo.Student;

import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.service
 * @Date: 2021/9/28 20:28
 */
public interface StudentService {
    boolean insertStudent(Student student);

    Student selectStudentById(Integer id);

    List<Student> selectAllStudents();

    boolean deleteStudentById();
}
