package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example
 * @Date: 2021/9/28 8:36
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ManagedBean(name = "user")
@SessionScoped
public class User {
    private String password;
    private String username;
    private Integer age;
    private Double salary;

    // 验证方法
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        FacesMessage facesMessage = new FacesMessage();
        facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
        facesMessage.setSummary("测试bean中验证器");
        throw new ValidatorException(facesMessage);
    }
}
