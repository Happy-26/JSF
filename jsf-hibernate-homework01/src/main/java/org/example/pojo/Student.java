package org.example.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.dao.StudentDAO;
import org.example.dao.impl.StudentDAOImpl;

import org.example.pojo.Student;
import org.example.util.SessionFactoryUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.pojo
 * @Date: 2021/9/27 21:53
 */

@Data
@NoArgsConstructor
@Entity(name = "student")
@ManagedBean(name = "student")
@SessionScoped
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String password;

    private String gender;

    private String birth;

    private String email;

    private String profession;

    private String motto;

    public Student(String name, String password, String gender, String birth, String email,
                   String profession, String motto) {
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.birth = birth;
        this.email = email;
        this.profession = profession;
        this.motto = motto;
    }

    public String save() {
        StudentDAO studentDAO = new StudentDAOImpl();
        studentDAO.insetStudent(this);
        return "info";
    }

    public String login() {
        StudentDAO studentDAO = new StudentDAOImpl();
        Student student = studentDAO.login(this);

        if (student != null) {
            System.out.println(student);
            this.id = student.getId();
            this.name = student.getName();
            this.password = student.getPassword();
            this.gender = student.getGender();
            this.email = student.getEmail();
            this.birth = student.getBirth();
            this.profession = student.getProfession();
            this.motto = student.getMotto();
            return "info";
        }

        return "login";
    }

    public String register() {
        this.id = null;
        this.name = null;
        this.password = null;
        this.gender = null;
        this.email = null;
        this.birth = null;
        this.profession = null;
        this.motto = null;
        return "register";
    }

    public List<Student> selectAllStudents() {
        StudentDAO studentDAO = new StudentDAOImpl();

        return studentDAO.queryAll();
    }
}
