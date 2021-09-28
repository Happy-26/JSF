package org.example.service.impl;

import org.example.dao.StudentDAO;
import org.example.dao.impl.StudentDAOImpl;
import org.example.pojo.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.service.impl
 * @Date: 2021/9/28 20:37
 */
@Service("studentService")
@ManagedBean(name = "studentService")
@SessionScoped
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public boolean insertStudent(Student student) {
        System.out.println(student);
        return studentDAO.insertStudent(student);
    }

    @Override
    public Student selectStudentById(Integer id) {
        return studentDAO.selectStudentById(id);
    }

    @Override
    @Transactional
    public List<Student> selectAllStudents() {
        return studentDAO.selectAllStudents();
    }

    @Override
    public boolean deleteStudentById() {
        return studentDAO.deleteStudentById();
    }

    public StudentDAO getStudentDAO() {
        return studentDAO;
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
}
