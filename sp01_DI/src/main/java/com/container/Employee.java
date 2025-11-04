package com.container;

import java.util.Date;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class Employee {
	
	private int employeeId;
	private String firstName;
	private String email;
	private long salary;
	private Date hireDate;
	public static EmployeeBuilder builder() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
}
