package org.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.dao.StudentDAO;
import org.example.dao.impl.StudentDAOImpl;
import org.example.entity.StudentEntity;
import org.example.service.StudentService;
import org.example.service.impl.StudentServiceImpl;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.pojo
 * @Date: 2021/9/27 21:53
 */


// 重命名解决和上一个模块的冲突问题，清缓存没用，那就只能换名字了 =_=!
// com.sun.faces.mgbean.BeanManager.addBean JSF1074：名为 'student' 的受管 team.niit.bean 已注册。
// 将现有受管 team.niit.bean 类类型 org.example.team.niit.bean.StudentBean 替换为 org.example.pojo.Student。
@ManagedBean(name = "std")
@SessionScoped
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentBean {
    private StudentEntity studentEntity = new StudentEntity();
    private List<StudentEntity> studentEntityList = new ArrayList<>();

    StudentService studentService = new StudentServiceImpl();
    public String save() {
        if(studentService.save(this.studentEntity))
            return "login";
        else
            return "register";
    }

    public String login() {
        this.studentEntity = studentService.login(this.studentEntity);
        if (this.studentEntity != null) {
            return "info";
        } else {
            return "login";
        }

    }

    public String clearValue() {
        // 重新new 一个对象，使其值都变为空，解决页面加载后有默认值的问题
        this.studentEntity = new StudentEntity();
        return "register";
    }

    public void selectAllStudents() {
        StudentDAO studentDAO = new StudentDAOImpl();
        this.studentEntityList = studentDAO.queryAll();
    }

    // 初始化时加载
    @PostConstruct
    public void init() {
        this.studentEntity = new StudentEntity();
        selectAllStudents();
    }

    public void validateName(FacesContext facesContext, UIComponent uiComponent, Object o) {
        System.out.println(123);
        boolean flag = studentService.isExit(o.toString());
        if (flag) {
            throw new ValidatorException(new FacesMessage());
        }
    }
}
