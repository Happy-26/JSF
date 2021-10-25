package org.example.service.impl;

import org.example.dao.StudentDAO;
import org.example.dao.impl.StudentDAOImpl;
import org.example.entity.StudentEntity;
import org.example.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentDAO studentDAO = new StudentDAOImpl();
    @Override
    public boolean save(StudentEntity studentEntity) {
        return studentDAO.insetStudent(studentEntity);

    }

    @Override
    public StudentEntity login(StudentEntity studentEntity) {
        return studentDAO.login(studentEntity);
    }

    @Override
    public List<StudentEntity> selectAllStudents() {
        return studentDAO.queryAll();
    }

    @Override
    public boolean isExit(String name) {
        return studentDAO.isExit(name);
    }
}
