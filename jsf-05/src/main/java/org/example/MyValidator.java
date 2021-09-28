package org.example;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example
 * @Date: 2021/9/28 9:05
 */
@FacesValidator(value = "MyValidator")
public class MyValidator implements Validator {
    /**
     * 验证逻辑
     *      1. ==
     *      2. "xxx".equals(value);
     *      3. xxx.compareTo(value);
     *      4. 正则
     *
     * 不符合规则渲染提示
     *      FacesMessage fm = mew FacesMessage();
     *      fm.setSummary("摘要");
     *      fm.setSeverity(FacesMessage.Severity_ERROR);
     *      throw new ValidatorException(fm);
     *
     * @param facesContext
     * @param uiComponent
     * @param o
     * @throws ValidatorException
     */
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        FacesMessage facesMessage = new FacesMessage();
        if ("张三".equals(o.toString())) {
            facesMessage.setSummary("验证成功");
        } else {
            facesMessage.setSummary("验证失败");
            facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(facesMessage);
        }
    }
}
