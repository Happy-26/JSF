package org.example.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Pattern;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.validator
 * @Date: 2021/10/6 22:55
 */
@FacesValidator(value = "birthValidator")
public class BirthValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        FacesMessage facesMessage = new FacesMessage();

        String regex = "\\d{4}(\\-|/|\\.)\\d{1,2}(\\-|/|\\.)\\d{1,2}$";
        if (Pattern.matches(regex, o.toString())) {
            facesMessage.setSummary("验证成功");
        } else {
            facesMessage.setSummary("验证失败，格式非法");
            facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(facesMessage);
        }
    }
}
