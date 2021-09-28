package org.example.dao;

import org.example.pojo.Student;

import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.dao
 * @Date: 2021/9/28 20:28
 */
public interface StudentDAO {
    boolean insertStudent(Student student);

    Student selectStudentById(Integer id);

    List<Student> selectAllStudents();

    boolean deleteStudentById();
}
