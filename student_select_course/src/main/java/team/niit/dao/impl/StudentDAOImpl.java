package team.niit.dao.impl;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.Query;
import team.niit.dao.StudentDAO;
import team.niit.entity.CourseEntity;
import team.niit.entity.StudentEntity;
import team.niit.util.SessionFactoryUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.dao.impl
 * @Date: 2021/10/26 20:07
 * Explain:
 */
public class StudentDAOImpl implements StudentDAO {
    @Override
    public boolean updatePassword(String id, String oldPassword, String newPassword) {
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
    public StudentEntity selectStudentById(String id) {
        return null;
    }

    @Override
    public StudentEntity updateStudentById(String id, StudentEntity student) {
        return null;
    }

    @Override
    public boolean selectCourse(String courseId, String studentId) {
        return false;
    }

    @Override
    public boolean deleteCourse(String courseId, String studentId) {
        return false;
    }

    @Override
    public CourseEntity[][] selectAllCourse(String id) {
        CourseEntity[][] courseEntities = new CourseEntity[5][7];
        Session session = SessionFactoryUtil.getSessionFactory().openSession();

        // is null表示为专业课
        String selectCourseIdList = "select course_id from student_course where student_id = ?0";
        SQLQuery queryCourseIdList = session.createSQLQuery(selectCourseIdList);
        queryCourseIdList.setParameter(0, "12019242313");
        List<String> courseIdList = queryCourseIdList.list();
        List<CourseEntity> courseList = new ArrayList<>();

        String selectCourseList = "from team.niit.entity.CourseEntity course where course.id = ?0";
        for (String courseId : courseIdList) {
            Query queryCourseList = session.createQuery(selectCourseList);
            queryCourseList.setParameter(0 , courseId);
            courseList.add((CourseEntity) queryCourseList.list().get(0));
        }

        String sql = "select no from course_time where course_id = ?";
        for (CourseEntity courseEntity : courseList) {
            SQLQuery sqlQuery = session.createSQLQuery(sql);
            sqlQuery.setParameter(1, courseEntity.getId());
            int no = (Integer) sqlQuery.list().get(0);
            courseEntity.setNo(no);
            int i = no % 5; // 23 % 5 = 3;
            int j = no / 5; // 23 / 5 = 4;
            courseEntities[i][j] = courseEntity;
        }

        return courseEntities;
    }

    @Override
    public List<CourseEntity> selectSelectedCourse(String id) {
        return null;
    }

    @Override
    public List<CourseEntity> selectCanBeSelectedCourse() {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();

        // is null表示为专业课
        String hql = "from team.niit.entity.CourseEntity course where course.major like ?0 or major is null";
        Query query = session.createQuery(hql);
        query.setParameter(0, "软件工程");
        List<CourseEntity> courseEntityList = query.list();
        String sql = "select no from course_time where course_id = ?";
        for (CourseEntity courseEntity : courseEntityList) {
            SQLQuery sqlQuery = session.createSQLQuery(sql);
            sqlQuery.setParameter(1, courseEntity.getId());
            int no = (Integer) sqlQuery.list().get(0);
            courseEntity.setNo(no);
        }

        return null;
    }
}
