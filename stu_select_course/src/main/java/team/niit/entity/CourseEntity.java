package team.niit.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 课程序号，在一天中的第几节
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
     * 课程可选人数
     */
    private Integer quota;

    /**
     * 选课学生
     */
    @ManyToMany(mappedBy = "courseEntityList")
    private List<StudentEntity> studentList;

    // 重写 CourseEntity 的toString()方法，不输出studentList，避免无线套娃
    @Override
    public String toString() {
        return "CourseEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", no=" + no +
                ", teacher='" + teacher + '\'' +
                ", category='" + category + '\'' +
                ", quota=" + quota +
                '}';
    }
}
