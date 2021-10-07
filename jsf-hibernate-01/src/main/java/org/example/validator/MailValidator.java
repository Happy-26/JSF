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
 * @Date: 2021/9/29 19:38
 */
@FacesValidator(value = "mailValidator")
public class MailValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        if (o != null) {
            if (o.toString().length() != 0) {
                FacesMessage facesMessage = new FacesMessage();
                String regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9]+(\\.[0-9a-zA-Z]+)*\\.[a-zA-Z0-9]{2,6}$";
                if (Pattern.matches(regex, o.toString())) {
                    facesMessage.setSummary("验证成功");
                } else {
                    facesMessage.setSummary("验证失败，格式非法");
                    facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
                    throw new ValidatorException(facesMessage);
                }
            }
        }
    }
}
