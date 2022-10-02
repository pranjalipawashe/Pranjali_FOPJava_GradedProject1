package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
  	  return "Admin Department";
    }
    public String getTodaysWork() {
  	  return  "Complete your documents submission";
    }
    public String getWorkDeadline(){
  	  return "Complete by EOD";
    }
    public AdminDepartment(){
    	System.out.println("Welcome To " + departmentName());
     	System.out.println(getTodaysWork());
     	System.out.println(getWorkDeadline());  
	    System.out.println(isTodayAHoliday());
    	System.out.println();
    }
}
