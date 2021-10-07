package org.example.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
@FacesValidator(value = "validatorId")
public class LoginValidator implements Validator {

    @Override
    public void validate(FacesContext fc, UIComponent ui, Object o) throws ValidatorException {

        if (!o.toString().equals("1234")){
            FacesMessage msg = new FacesMessage();
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            msg.setSummary("账号错误");
            throw new ValidatorException(msg);
        }
    }
}
