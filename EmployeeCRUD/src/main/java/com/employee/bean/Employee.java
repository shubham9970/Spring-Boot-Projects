package com.employee.bean;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int idEmployee;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
    private String role;
    private Date joiningDAte;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int idEmployee, String firstName, String lastName,
			String email, double salary, String role, Date joiningDAte) {
		super();
		this.idEmployee = idEmployee;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.role = role;
		this.joiningDAte = joiningDAte;
	}
	@Override
	public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email
				+ ", salary=" + salary + ", role=" + role + ", joiningDAte="
				+ joiningDAte + "]";
	}
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getJoiningDAte() {
		return joiningDAte;
	}
	public void setJoiningDAte(Date joiningDAte) {
		this.joiningDAte = joiningDAte;
	}

    
}