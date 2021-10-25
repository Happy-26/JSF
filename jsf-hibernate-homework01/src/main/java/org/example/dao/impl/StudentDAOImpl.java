package org.example.dao.impl;

import org.example.dao.StudentDAO;
import org.example.entity.StudentEntity;
import org.example.util.SessionFactoryUtil;
import org.hibernate.Criteria;
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
    public boolean insetStudent(StudentEntity student) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(student);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public StudentEntity login(StudentEntity student) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Criteria name = session.createCriteria(StudentEntity.class).add(Restrictions.like("name", student.getName()));
        List<StudentEntity> list = name.list();
        if (list.size() == 1) {
            if(list.get(0).getPassword().equals(student.getPassword())) {
                return list.get(0);
            }
        }
        return null;
    }

    @Override
    public List<StudentEntity> queryAll() {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Criteria c = session.createCriteria(StudentEntity.class);

        List<StudentEntity> list = c.list();
        return c.list();
    }

    @Override
    public boolean isExit(String name) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Criteria c = session.createCriteria(StudentEntity.class).add(Restrictions.like("name", name));

        List<StudentEntity> list = c.list();
        if (list != null) {
            return true;
        }
        return false;
    }
}
