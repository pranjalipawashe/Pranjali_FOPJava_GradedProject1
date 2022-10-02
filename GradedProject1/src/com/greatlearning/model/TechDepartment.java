package com.greatlearning.model;

public class TechDepartment extends SuperDepartment{
	public String departmentName() {
		return "Tech Department";
	}
	public String getTodaysWork() {
		return  "Complete coding of Module 1";
	}
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	public String getTechStackInformation() {
		return "Core Java";
	}

	public TechDepartment(){
		System.out.println("Welcome To " + departmentName() );
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
	}
}
