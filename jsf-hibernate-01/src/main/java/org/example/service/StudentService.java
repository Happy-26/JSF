package org.example.service;

import org.example.pojo.Student;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.service
 * @Date: 2021/9/28 20:28
 */
public interface StudentService {
    String insertStudent(Student student);

    Student selectStudentById(Integer id);

    List<Student> selectAllStudents();

    String deleteStudentById();

    String login(Student student);
}
