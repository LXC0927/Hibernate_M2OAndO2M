package com.test.bean;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer sid;
	private String sname;
	private Class class1;

	// Constructors

	public Class getClass1() {
		return class1;
	}

	public void setClass1(Class class1) {
		this.class1 = class1;
	}

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String sname) {
		this.sname = sname;
	}

	/** full constructor */
	public Student(String sname, Class class1) {
		this.sname = sname;
		this.class1 = class1;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}