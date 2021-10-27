package team.niit.service.impl;

import team.niit.dao.StudentDAO;
import team.niit.dao.impl.StudentDAOImpl;
import team.niit.entity.CourseEntity;
import team.niit.entity.StudentEntity;
import team.niit.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    public boolean modifyPassword(String id, String oldPassword, String newPassword) {
        return false;
    }

    @Override
    public StudentEntity login(StudentEntity student) {
        return null;
    }

    @Override
    public boolean retrievePassword(String id, String password, String phone) {
        return false;
    }

    @Override
    public StudentEntity queryStudentById(String id) {
        return null;
    }

    @Override
    public StudentEntity modifyStudentById(String id, StudentEntity student) {
        return null;
    }

    @Override
    public boolean selectCourse(String courseId, String studentId) {
        return false;
    }

    @Override
    public boolean dropCourse(String courseId, String studentId) {
        return false;
    }

    @Override
    public  CourseEntity[][] queryAllCourse(String id) {
        return studentDAO.selectAllCourse(id);
    }

    @Override
    public List<CourseEntity> querySelectedCourse(String id) {
        return null;
    }

    @Override
    public List<CourseEntity> queryCanBeSelectedCourse() {
        return null;
    }
}
