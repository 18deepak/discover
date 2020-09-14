package com.api;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value= {
		"name",
		"designation",
		"id",
		"salary"
		
})
public class Person {
private String name,designation;
private int id,salary;
public Person(String name, String designation, int id, int salary) {
	super();
	this.name = name;
	this.designation = designation;
	this.id = id;
	this.salary = salary;
}
public Person() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "name "+name+"\n"+"designation "+designation+"\n"+"id "+id+"\n"+"salary "+salary+"\n";
	
}

}
