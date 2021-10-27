import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import team.niit.entity.CourseEntity;
import team.niit.entity.StudentEntity;
import team.niit.util.SessionFactoryUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: PACKAGE_NAME
 * @Date: 2021/10/26 21:42
 * Explain:
 */
public class QueryTest {
    Session session;

    @Before
    public void setUp() throws Exception {
        session = SessionFactoryUtil.getSessionFactory().openSession();
    }

    @After
    public void tearDown() throws Exception {
        session.close();
    }

    @Test
    public void queryStudentTest() {
        //开启事物
        Transaction transaction = session.beginTransaction();
        //编写HQL:
        String hql = "from team.niit.entity.StudentEntity stu where stu.id = ?0";

        //创建Query对象
        Query query = session.createQuery(hql);
        query.setParameter(0, "12019242313");

        //执行查询，获得结果，多列查询，使用了Object接受结果
        List<StudentEntity> studentEntityList = query.list();
        // 遍历
        for (StudentEntity student : studentEntityList) {
            System.out.println(student.toString());
        }
    }

    @Test
    public void curriculum() {
        CourseEntity[][] courseEntities = new CourseEntity[5][7];
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
            int i = no % 5; // 23 % 5 = 3;
            int j = no / 5; // 23 / 5 = 4;
            courseEntities[i][j] = courseEntity;
        }
        System.out.println(courseEntities);
    }

    @Test
    public void test03() {
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
        System.out.println(courseEntities);
    }
}
