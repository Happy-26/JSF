package org.example;

import org.example.pojo.Student;
import org.example.util.SessionFactoryUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example
 * @Date: 2021/9/27 22:24
 */
public class MyTest01 {

    @Test
    public void test01() {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Student s = new Student();
        s.setName("张三");
        s.setAddress("中国宁夏");
        session.save(s);
        transaction.commit();
        session.close();
    }

    @Test
    public void test02() {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM org.example.pojo.Student");
        List<Student> studentList = query.list();
        studentList.forEach(System.out::println);
    }
}
