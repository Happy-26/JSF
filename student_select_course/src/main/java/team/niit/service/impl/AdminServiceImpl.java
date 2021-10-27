package team.niit.service.impl;

import team.niit.entity.StudentEntity;
import team.niit.service.AdminService;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.service.impl
 * @Date: 2021/10/26 19:54
 */
public class AdminServiceImpl implements AdminService {
    @Override
    public boolean addStudent(StudentEntity student) {
        return false;
    }

    @Override
    public StudentEntity modifyStudent(StudentEntity student) {
        return null;
    }

    @Override
    public boolean deleteStudentById(String id) {
        return false;
    }

    @Override
    public StudentEntity modifySelectedCourse(String oldCourseId, String newCourseId, String studentId) {
        return null;
    }
}
