package team.niit.dao;

import team.niit.entity.CourseEntity;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.dao
 * @Date: 2021/10/26 20:08
 * Explain: 命名越靠近数据库就越接近专业术语
 */
public interface CourseDAO {
    /**
     * 添加课程
     * @param courseEntity 要添加的课程实体
     * @return 成功与否
     */
    boolean insertCourse(CourseEntity courseEntity);

    /**
     * 修改课程
     * @param courseEntity 要修改的课程实体
     * @return 成功与否
     */
    boolean updateCourse(CourseEntity courseEntity);

    /**
     * 删除课程
     * @param id 课程编号
     * @return 成功与否
     */
    boolean deleteCourseById(String id);
}
