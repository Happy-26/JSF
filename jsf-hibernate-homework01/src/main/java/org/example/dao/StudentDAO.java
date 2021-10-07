package org.example.dao;

import org.example.pojo.Student;

import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.dao
 * @Date: 2021/10/1 10:57
 */
public interface StudentDAO {
    /**
     * 注册方法
     * @param student 前端传入的数值
     * @return 是否插入成功
     */
    boolean insetStudent(Student student);


    Student login(Student student);

    List<Student> queryAll();

}
