import cn.hutool.core.date.DateTime;
import cn.hutool.crypto.SecureUtil;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import team.niit.entity.AdminEntity;
import team.niit.entity.CourseEntity;
import team.niit.entity.NotificationEntity;
import team.niit.entity.StudentEntity;
import team.niit.util.SessionFactoryUtil;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: PACKAGE_NAME
 * @Date: 2021/10/26 20:33
 * Explain:
 */
public class InitDate {
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
    public void initAdmin() {
        String password = SecureUtil.md5("123456"); // e10adc3949ba59abbe56e057f20f883e
        AdminEntity adminEntity = new AdminEntity("191001", "高贾杨", password, "15291728842");
        Transaction transaction = session.beginTransaction();
        session.save(adminEntity);
        transaction.commit();
        session.close();
    }

    @Test
    public void initStudents() {
        Transaction transaction = session.beginTransaction();
        StudentEntity student1 = new StudentEntity("12019242319","高瑞", "女","不详","e10adc3949ba59abbe56e057f20f883e", "软件工程", "1班");
        StudentEntity student2 = new StudentEntity("12019242340","贾倩倩", "女","不详","e10adc3949ba59abbe56e057f20f883e", "软件工程", "1班");
        StudentEntity student3 = new StudentEntity("12019242307","杨依衡", "男","不详","e10adc3949ba59abbe56e057f20f883e", "软件工程", "1班");
        StudentEntity student4 = new StudentEntity("12019242313","杨欢乐", "男","2001/02/04","e10adc3949ba59abbe56e057f20f883e", "软件工程", "1班");

        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(student4);
        transaction.commit();
    }

    @Test
    public void initCourse() {
        Transaction transaction = session.beginTransaction();
        CourseEntity courseEntity1 = new CourseEntity("8010145", "软件工程", "刘立波", "理工科", 100);
        CourseEntity courseEntity2 = new CourseEntity("8010146", "Java开发", "周波", "理工科", 100);
        CourseEntity courseEntity3 = new CourseEntity("8010147", "Spring", "许凡", "理工科", 100);
        CourseEntity courseEntity4 = new CourseEntity("8010148", "计算机网络", "杨翔", "理工科", 100);
        CourseEntity courseEntity5 = new CourseEntity("8010149", "单片机", "葛永琪", "理工科", 100);
        session.save(courseEntity1);
        session.save(courseEntity2);
        session.save(courseEntity3);
        session.save(courseEntity4);
        session.save(courseEntity5);
        transaction.commit();
    }

    @Test
    public void initStudentCourse() {
        Transaction transaction = session.beginTransaction();
        try {
            String hql = "insert into student_course (student_id, course_id, no) values (?0, ?1, ?2)";

            SQLQuery query = session.createSQLQuery(hql);
            query.setParameter(0, "12019242313");
            query.setParameter(1, "8010145");
            query.setParameter(2, 1);
            int result = query.executeUpdate();
            System.out.println(result);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Test
    public void initNotification() {
        NotificationEntity notificationEntity = new NotificationEntity();
        notificationEntity.setTitle("关于信息工程学院2021-2022学年度上半年选课通知");
        notificationEntity.setContent("明天下午选课哦");
        notificationEntity.setTime(new DateTime().toString());
        notificationEntity.setMajor("信息工程学院");
        Transaction transaction = session.beginTransaction();
        session.save(notificationEntity);
        transaction.commit();
        session.close();
    }

}
