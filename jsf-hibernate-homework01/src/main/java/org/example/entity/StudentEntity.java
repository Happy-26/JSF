package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.team.niit.entity
 * @Date: 2021/10/15 21:58
 * explain:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "student")
public class StudentEntity {
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

    public StudentEntity(String name, String password, String gender, String birth, String email,
                       String profession, String motto) {
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.birth = birth;
        this.email = email;
        this.profession = profession;
        this.motto = motto;
    }

}
