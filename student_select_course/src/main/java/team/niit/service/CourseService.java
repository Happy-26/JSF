package team.niit.service;

import team.niit.entity.CourseEntity;

public interface CourseService {

    /**
     * 添加课程
     * @param courseEntity 要添加的课程实体
     * @return 成功与否
     */
    boolean addCourse(CourseEntity courseEntity);

    /**
     * 修改课程
     * @param courseEntity 要修改的课程实体
     * @return 成功与否
     */
    boolean modifyCourse(CourseEntity courseEntity);

    /**
     * 删除课程
     * @param id 课程编号
     * @return 成功与否
     */
    boolean deleteCourseById(String id);
}
