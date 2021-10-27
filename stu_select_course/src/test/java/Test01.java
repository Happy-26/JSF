import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
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
 * @Date: 2021/10/12 13:08
 * explain:
 */
public class Test01 {

    @Test
    public void test01(){
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<CourseEntity> courseEntityList = new ArrayList<>();
        StudentEntity student = new StudentEntity();
        student.setName("张三");

        CourseEntity courseEntity1 = new CourseEntity();
        courseEntity1.setName("hibernate");
        courseEntity1.setNo(4);

        CourseEntity courseEntity2 = new CourseEntity();
        courseEntity2.setName("spring");
        courseEntity2.setNo(6);

        CourseEntity courseEntity3 = new CourseEntity();
        courseEntity3.setName("jsf");
        courseEntity3.setNo(13);

        courseEntityList.add(courseEntity1);
        courseEntityList.add(courseEntity2);
        courseEntityList.add(courseEntity3);

        session.save(courseEntity1);
        session.save(courseEntity2);
        session.save(courseEntity3);
        session.save(student);

        transaction.commit();
    }

    @Test
    public void test02() {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        String hql = "from course";

        //创建Query对象
        Query query = session.createQuery(hql);
        List list = query.list();
        list.forEach(System.out::println);
    }

    @Test
    public void test04 (){
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        String sql = "select * from course where id in (select courseList_id from  student_course where studentList_id = 3)";

        //创建Query对象
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(CourseEntity.class);
        List<CourseEntity> courseEntityList = query.list();
        courseEntityList.forEach(System.out::println);
    }


    @Test
    public void test06 () {
        CourseEntity[][] cours = new CourseEntity[7][5];

        Session session = SessionFactoryUtil.getSessionFactory().openSession();

        List<Integer> id1 = new ArrayList<>();
        id1.add(7);
        id1.add(8);
        id1.add(9);
        id1.add(10);
        id1.add(11);
        id1.add(12);
        id1.add(13);
        id1.add(14);
        id1.add(15);
        id1.add(16);
        id1.add(17);
        id1.add(18);
        id1.add(19);
        id1.add(20);
        id1.add(21);
        id1.add(22);
        id1.add(23);
        id1.add(24);
        id1.add(25);
        id1.add(26);
        id1.add(27);
        id1.add(28);
        id1.add(29);

        Criteria name = session.createCriteria(CourseEntity.class).add(Restrictions.in("id", id1));
        List<CourseEntity> courseEntityList = name.list();


        for (CourseEntity courseEntity : courseEntityList) {
            int i = courseEntity.getNo() / 5; // 23 / 5 = 4;
            int j = courseEntity.getNo() % 5; // 23 % 5 = 3;
            cours[i][j] = courseEntity;
        }

        System.out.println(cours);
    }

    @Test
    public void test08 () {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Criteria studentCourses = session.createCriteria(CourseEntity.class).add(Restrictions.in("studentList_id", 3));
        List<CourseEntity> studentCourseEntityList = studentCourses.list();
        Criteria name = session.createCriteria(CourseEntity.class).add(Restrictions.in("id", studentCourseEntityList));
        List<CourseEntity> courseEntityList = name.list();
    }

    // 条件查询
    @Test
    public void test09() {
        // 开启会话
        Session session = SessionFactoryUtil.getSessionFactory().openSession();

        // 创建条件查询
        Criteria criteria = session.createCriteria(StudentEntity.class);

        // 设置查询条件
        Criterion criterion = Restrictions.eq("id", 3);


        // 添加查询条件,可以加多个条件
        criteria.add(criterion);
        // 排序
        criteria.addOrder(Order.desc("id"));

        List<StudentEntity> studentList = criteria.list();
        List<CourseEntity> courseEntityList = null;
//        for (StudentEntity student : studentList) {
//            courseEntityList = student.getCourseEntityList();
//        }

        courseEntityList.forEach(System.out::println);
    }
}
