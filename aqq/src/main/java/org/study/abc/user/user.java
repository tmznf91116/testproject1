package org.study.abc.user;

public class user {

	private String  name;
	private int		age;
	private String  admin;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", age=" + age + ", admin=" + admin + "]";
	}
	
	
}
