package com.niit.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name = "sexBean")
@RequestScoped

public class SexBean {
	private List<SelectItem> sexList = new ArrayList<SelectItem>(
			Arrays.asList(new SelectItem("--ÄÐ--"), new SelectItem("--Å®--")));

	public SexBean() {
		super();
	}

	public List<SelectItem> getSexList() {
		return sexList;
	}

	public void setSexList(List<SelectItem> sexList) {
		this.sexList = sexList;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
