package team.niit.dao.impl;

import team.niit.dao.AdminDAO;
import team.niit.entity.StudentEntity;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.dao.impl
 * @Date: 2021/10/26 20:12
 * Explain:
 */
public class AdminDAOImpl implements AdminDAO {
    @Override
    public boolean insertStudent(StudentEntity student) {
        return false;
    }

    @Override
    public StudentEntity updateStudent(StudentEntity student) {
        return null;
    }

    @Override
    public boolean deleteStudentById(String id) {
        return false;
    }

    @Override
    public StudentEntity insertSelectedCourse(String oldCourseId, String newCourseId, String studentId) {
        return null;
    }
}
