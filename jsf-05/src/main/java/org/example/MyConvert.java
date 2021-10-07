package org.example;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example
 * @Date: 2021/9/27 20:13
 */
// 别名
@FacesConverter(value = "myConvert1")
public class MyConvert implements Converter {

    /**
     * 输入转换
     *
     * @param facesContext 上下文对象，用来获取页面对象结构
     * @param uiComponent 哪个组件
     * @param s 传入的值
     * @return
     */
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        String result = s.trim();
        StringBuffer sb = new StringBuffer();
        if (result.length() != 8) {
            // 用于显示提示信息
            FacesMessage facesMessage = new FacesMessage();
            facesMessage.setSummary("无效数据，请输入长度为8的字符");
            // 严重等级
            facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(facesMessage);
        } else {
            String s1 = result.substring(0, 4);
            String s2 = result.substring(4, 8);

            sb.append(s1);
            sb.append(" ^_^ ");
            sb.append(s2);
            sb.reverse();
        }
        return sb;
    }

    /**
     * 输出转换
     *
     * @param facesContext
     * @param uiComponent
     * @param o
     * @return
     */
    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {

        return o.toString();
    }
}
