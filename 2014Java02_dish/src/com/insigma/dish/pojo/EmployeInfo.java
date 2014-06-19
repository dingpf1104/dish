package com.insigma.dish.pojo;

/**
 * @author dingpf
 *
 */
public class EmployeInfo {
	private Integer employeID;
	private String name;
	private int age;
	private String pwd;
	private Integer purviewID;
	
	public EmployeInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeInfo(Integer employeID, String name, int age, String pwd,
			Integer purviewID) {
		super();
		this.employeID = employeID;
		this.name = name;
		this.age = age;
		this.pwd = pwd;
		this.purviewID = purviewID;
	}
	@Override
	public String toString() {
		return name;
	}
	public Integer getEmployeID() {
		return employeID;
	}
	public void setEmployeID(Integer employeID) {
		this.employeID = employeID;
	}
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getPurviewID() {
		return purviewID;
	}
	public void setPurviewID(Integer purviewID) {
		this.purviewID = purviewID;
	}
	
}
