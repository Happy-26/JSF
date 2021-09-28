package org.example;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Pattern;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example
 * @Date: 2021/9/28 17:20
 */
public class MyEmailValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        FacesMessage facesMessage = new FacesMessage();
        String regex = "\\d*@qq.com";
        if (Pattern.matches(regex, o.toString())) {
            facesMessage.setSummary("输入合法");
        } else {
            facesMessage.setSummary("格式错误");
            facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(facesMessage);
        }
    }
}
