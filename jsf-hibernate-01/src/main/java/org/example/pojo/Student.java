package org.example.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.pojo
 * @Date: 2021/9/27 21:53
 */
@Entity(name = "student")
@ManagedBean(name = "student")
@ApplicationScoped
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String password;

    private boolean gender;

    private String birth;

    private String email;

    private String profession;

    private String motto;

}
