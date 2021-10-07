package org.example;

import org.example.pojo.Student;
import org.example.util.SessionFactoryUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.List;
import java.util.regex.Pattern;

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
        s.setPassword("123456");
        s.setGender(true);
        s.setBirth("2001-02-01");
        s.setEmail("488127311@qq.com");
        s.setProfession("IT");
        s.setMotto("把开源的变成自己的，把自己的变成祖传的");

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

    @Test
    public  void test03(){
        String regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9]+(\\.[0-9a-zA-Z]+)*\\.[a-zA-Z0-9]{2,6}$";
        System.out.println(Pattern.matches(regex, "488127311@qq.com"));
    }
}
