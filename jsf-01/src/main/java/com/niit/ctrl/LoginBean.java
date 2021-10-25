package com.niit.ctrl;

import com.niit.entity.User;

public class LoginBean {
	private User user = new User();
	private String tip;

	public String login() {
		tip = "学生姓名：" + user.getUsername() + "；" + "学号：" + user.getCardid() + "；" + "性别：" + user.getSex() + "；" + "年龄："
				+ user.getAge() + "；";
		return null;
	}

	public LoginBean() {

	}

	public LoginBean(User user, String tip) {
		this.user = user;
		this.tip = tip;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
