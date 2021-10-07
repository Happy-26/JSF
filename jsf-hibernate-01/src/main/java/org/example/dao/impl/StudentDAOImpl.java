package org.example.dao.impl;

import org.example.dao.StudentDAO;
import org.example.pojo.Student;
import org.example.util.SessionFactoryUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.dao.impl
 * @Date: 2021/9/28 20:38
 */

@Repository
public class StudentDAOImpl implements StudentDAO {
    @Override
    public boolean insertStudent(Student student) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(student);
            transaction.commit();
            return true;
        } catch (Exception a) {
            return false;
        }
    }

    @Override
    public Student selectStudentById(Integer id) {
        return null;
    }

    @Override
    public List<Student> selectAllStudents() {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM org.example.pojo.Student");
        return query.list();
    }

    @Override
    public boolean deleteStudentById() {
        return false;
    }

    @Override
    public Student login(Student student) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM org.example.pojo.Student");
        List<Student> studentList = query.list();
        for (Student s: studentList) {
            if (s.getPassword().equals(student.getPassword()) && s.getName().equals(student.getName()))
                return s;
        }
        return null;
    }
}
