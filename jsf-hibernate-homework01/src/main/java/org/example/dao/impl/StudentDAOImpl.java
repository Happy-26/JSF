package org.example.dao.impl;

import org.example.dao.StudentDAO;
import org.example.pojo.Student;
import org.example.util.SessionFactoryUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.dao.impl
 * @Date: 2021/10/1 11:00
 */
public class StudentDAOImpl implements StudentDAO {
    @Override
    public boolean insetStudent(Student student) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println(student);
        try {
            session.save(student);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Student login(Student student) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Criteria name = session.createCriteria(Student.class).add(Restrictions.like("name", student.getName()));
        List<Student> list = name.list();
        if (list.size() == 1) {
            if(list.get(0).getPassword().equals(student.getPassword())) {
                return list.get(0);
            }
        }
        return null;
    }

    @Override
    public List<Student> queryAll() {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Criteria c = session.createCriteria(Student.class);

        List<Student> list = c.list();
        return c.list();
    }
}
