package team.niit.service;

import team.niit.entity.StudentEntity;

public interface StudentService {
    /**
     * 登录接口
     * @param student 传入的要登陆学生实体，含有账号和密码两个属性
     * @return  返回登录的学生信息，为空或为一个带有所有属性的StudentEntity
     */
    StudentEntity login(StudentEntity student);

    /**
     * 重置密码
     * @param password
     * @param phone
     * @return
     */
    boolean retrievePassword(String password, String phone) ;


}
