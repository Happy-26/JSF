package team.niit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: HAPPY
 * @Project_name: stu_select_course
 * @Package_name: team.niit.bean
 * @Date: 2021/10/25 23:53
 * explain: 课程实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "course")
public class CourseEntity {
    /**
     * 课程编号
     */
    @Id
    private String id;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 课程序号，在一天中的第几节，数据库中course表不存储该属性，
     * student_course存储该属性的值
     */
    private Integer no;

    /**
     * 任课教师
     */
    private String teacher;

    /**
     * 课程类别
     */
    private String category;

    /**
     * 学生专业
     */
    private String major;

    /**
     * 课程可选人数
     */
    private Integer quota;

    public CourseEntity(String id, String name, String teacher, String category, Integer quota) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.category = category;
        this.quota = quota;
    }
}
