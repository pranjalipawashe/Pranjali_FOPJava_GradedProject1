package com.greatlearing.orgdepartments.driver;

import com.greatlearning.orgdepartments.model.AdminDepartment;
import com.greatlearning.orgdepartments.model.HrDepartment;
import com.greatlearning.orgdepartments.model.TechDepartment;

public class Main {

	public static void main(String[] args ) {
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		System.out.println("Welcome To " + admin.departmentName());
     	System.out.println(admin.getTodaysWork());
     	System.out.println(admin.getWorkDeadline());  
	    System.out.println(admin.isTodayAHoliday());
    	System.out.println();
    	
		System.out.println("Welcome To " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome To " + tech.departmentName() );
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
			
	}
}
