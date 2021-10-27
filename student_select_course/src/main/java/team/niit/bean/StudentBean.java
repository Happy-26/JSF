package team.niit.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.niit.entity.CourseEntity;
import team.niit.entity.StudentEntity;
import team.niit.service.StudentService;
import team.niit.service.impl.StudentServiceImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: stu_select_course
 * @Package_name: team.niit.bean
 * @Date: 2021/10/21 15:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ManagedBean(name = "student")
@SessionScoped
public class StudentBean {
    private String newPassword;
    private StudentEntity studentEntity = new StudentEntity();
    private List<StudentEntity> studentEntityList;

    StudentService studentService = new StudentServiceImpl();

    // 将学生的课表进行查询封装
    public CourseEntity[][] curriculum() {

        return studentService.queryAllCourse("12019242313");
    }

    // 课表旁边的节数列
    public List<String> classNumber () {
        List<String> a = new ArrayList<>();
        a.add("第一节");
        a.add("第二节");
        a.add("第三节");
        a.add("第四节");
        a.add("第五节");
        return a;
    }

    /**
     * 101：修改密码,旧密码使用studentEntity的属性，新密码使用
     * @return 返回成功与否
     */
    public boolean modifyPassword() {
        studentService.modifyPassword(studentEntity.getId(), studentEntity.getPassword(), newPassword);
        return false;
    }

    /**
     * 102：登录接口
     */
    public StudentEntity login() {
        return null;
    }

    /**
     * 103：重置密码
     */
    public boolean retrievePassword() {
        return false;
    }

    /**
     * 104：查看个人信息
     */
    public StudentEntity studentInfo() {
        return null;
    }

    /**
     * 105：修改个人信息
     */
    public StudentEntity modifyStudentById() {
        return null;
    }

    /**
     * 106: 退出登录
     * @return
     */
    public String logOut () {
        return null;
    }
}
