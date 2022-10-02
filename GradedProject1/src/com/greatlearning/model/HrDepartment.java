package com.greatlearning.model;

public class HrDepartment extends SuperDepartment{
	public String departmentName() {
		return "HR Department";
	}
	public String getTodaysWork() {
		return  "Fill today's timesheet and mark your attendance";
	}
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team Lunch";
	}

	public HrDepartment(){
		System.out.println("Welcome To " + departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println();
	}
}
