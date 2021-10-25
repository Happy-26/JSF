package team.niit.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.niit.entity.CourseEntity;
import team.niit.entity.StudentEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import team.niit.util.SessionFactoryUtil;

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
    private StudentEntity studentEntity = new StudentEntity();
    private List<StudentEntity> studentEntityList;

    public CourseEntity[][] curriculum() {
        CourseEntity[][] courseEntities = new CourseEntity[5][7];
        Session session = SessionFactoryUtil.getSessionFactory().openSession();

        Criteria selectStudentEntity = session.createCriteria(StudentEntity.class).add(Restrictions.in("id", 1));
        List<StudentEntity> StudentEntityList = selectStudentEntity.list();
        List<CourseEntity> courseEntityList = StudentEntityList.get(0).getCourseEntityList();

        // i 为数组的行——天， 值取 0 - 6
        // j 为数组的列——课程时间，值去 0 - 4
        for (CourseEntity courseEntity : courseEntityList) {
            int i = courseEntity.getNo() % 5; // 23 % 5 = 3;
            int j = courseEntity.getNo() / 5; // 23 / 5 = 4;
            courseEntities[i][j] = courseEntity;
        }

        return courseEntities;
    }

    public List<String> classNumber () {
        List<String> a = new ArrayList<>();
        a.add("第一节");
        a.add("第二节");
        a.add("第三节");
        a.add("第四节");
        a.add("第五节");
        return a;
    }

}
