package org.example.convert;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example.convert
 * @Date: 2021/10/6 22:48
 */
@FacesConverter(value = "/mottoConvert")
public class MyConvert implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        s += "\n标识转换过了";
        return s;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return null;
    }
}
