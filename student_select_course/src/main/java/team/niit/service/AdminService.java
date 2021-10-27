package team.niit.service;

import team.niit.entity.StudentEntity;

public interface AdminService {
    /**
     * 添加学生
     * @param student 要添加的学生实体
     * @return 成功与否
     */
    boolean addStudent(StudentEntity student);

    /**
     * 修改学生信息
     * @param student 要修改的学生实体
     * @return 成功与否
     */
    StudentEntity modifyStudent(StudentEntity student);

    /**
     * 删除学生
     * @param id 学号
     * @return 成功与否
     */
    boolean deleteStudentById(String id);

    /**
     * 修改学生选课信息
     * @param oldCourseId 旧课程编号
     * @param newCourseId 新课程编号
     * @param studentId 学生编号
     * @return 修改后的学生实体
     */
    StudentEntity modifySelectedCourse(String oldCourseId, String newCourseId, String studentId);

    /**
     * 管理员直接给学生添加课程可以调用studentService的相应方法
     */
}
