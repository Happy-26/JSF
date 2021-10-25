package com.niit.entity;

public class User {
	private Integer Id;
	private String username;
	private String cardid;
	private String sex;
	private String age;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCardid() {
		return cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public User(String username, String cardid, String sex, String age) {
		super();
		this.username = username;
		this.cardid = cardid;
		this.sex = sex;
		this.age = age;
	}

	public User() {
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
