package org.example.convert;

import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import java.io.UnsupportedEncodingException;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example
 * @Date: 2021/9/29 16:50
 */
@FacesConverter(value = "encodingConvert")
public class MyEncodingConvert implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        String newstr = "";
        if (s == null) {
            s = "";
        }
        byte[] byte1 = null;
        try {
            byte1 = s.getBytes("ISO-8859-1");
            newstr = new String(byte1, "UTF-8");
            UIInput input = (UIInput) uiComponent;//
            input.setSubmittedValue(newstr);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return newstr;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return o.toString();
    }
}
