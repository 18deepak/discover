package com.api;

import javax.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;

@XmlRootElement(name="Employee")
public class Employee {
	private int id;
	private int salary;
	private String name;
	private String designtion;
	public Employee(int id, int salary, String name, String designtion) {
		
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.designtion = designtion;
	}
	

	public Employee() {
		
	}


	@XmlAttribute
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@XmlAttribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getDesn() {
		return designtion;
	}
	public void setDesn(String desn) {
		this.designtion = desn;
	}
	@Override
	public String toString() {
		return "name "+name+"\n"+"designtion "+designtion+"\n"+"id "+id+"\n"+"salary "+salary+"\n";
		
	}

}

