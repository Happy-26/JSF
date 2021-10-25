package com.niit.entity;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("myconverter")
public class MyConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String age) {
		// TODO Auto-generated method stub
		int number = Integer.parseInt(age);
		if (number <= 0 || number > 100) {
			FacesMessage message = new FacesMessage();
			message.setSummary("Œﬁ–ßƒÍ¡‰£°");
			throw new ConverterException(message);
		} else {

			return age;
		}
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		return arg2.toString();
	}

}
