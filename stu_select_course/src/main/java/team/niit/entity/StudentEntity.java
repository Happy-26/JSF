package team.niit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: stu_select_course
 * @Package_name: team.niit.bean
 * @Date: 2021/10/25 23:53
 * explain: 学生实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "student")
public class StudentEntity {
    /**
     * 学生编号，也是登录账号，由管理员输入
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 学生性别
     */
    private String gender;

    /**
     * 学生生日
     */
    private String birth;

    /**
     * 学生密码
     */
    private String password;

    /**
     * 学生专业
     */
    private String major;

    /**
     * 学生班级
     */
    private String classes;


    /**
     * 学生课程列表
     */
    @ManyToMany
    private List<CourseEntity> courseEntityList;

}
