package team.niit.service;

import team.niit.entity.CourseEntity;
import team.niit.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    /**
     * 修改密码
     * @param id 学号
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     * @return 返回成功与否
     */
    boolean modifyPassword(String id, String oldPassword, String newPassword) ;

    /**
     * 登录接口
     * @param student 传入的要登陆学生实体，含有账号和密码两个属性
     * @return  返回登录的学生信息，为空或为一个带有所有属性的StudentEntity
     */
    StudentEntity login(StudentEntity student);

    /**
     * 重置密码
     * @param id 学号
     * @param password 新密码
     * @param phone 手机号
     * @return 返回成功与否
     */
    boolean retrievePassword(String id, String password, String phone);

    /**
     * 按id查询学生
     * @param id 学生id
     * @return 返回查找到的学生
     */
    StudentEntity queryStudentById(String id);

    /**
     * 根据id修改学生
     * @param id 学号
     * @param student 学生实体，包含要修改的值
     * @return 返回修改后的学生
     */
    StudentEntity modifyStudentById(String id, StudentEntity student);

    /**
     * 学生选课
     * @param courseId 课程id
     * @param studentId 学号
     * @return 成功与否
     */
    boolean selectCourse(String courseId, String studentId);

    /**
     * 学生退课
     * @param courseId  课程id
     * @param studentId 学号
     * @return 成功与否
     */
    boolean dropCourse(String courseId, String studentId);

    /**
     * 查询所有课程（课表）
     * @param id 学号
     * @return 返回课程集合
     */
    CourseEntity[][] queryAllCourse(String id);

    /**
     * 查询所有选的课程
     * @param id 学号
     * @return 返回课程集合
     */
    List<CourseEntity> querySelectedCourse(String id);

    /**
     * 查询所有可选课程
     * @return 返回课程集合
     */
    List<CourseEntity> queryCanBeSelectedCourse();
}
