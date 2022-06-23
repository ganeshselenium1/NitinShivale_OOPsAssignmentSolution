package com.nitin.main;

import com.nitin.dept.AdminDepartment;
import com.nitin.dept.HrDepartment;
import com.nitin.dept.SuperDepartment;
import com.nitin.dept.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperDepartment admin=new AdminDepartment();
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("\n-------------------------------------\n");
		SuperDepartment hr=new HrDepartment();
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(((HrDepartment) hr).doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("\n-------------------------------------\n");
		SuperDepartment tech=new TechDepartment();
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(((TechDepartment)tech).getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println("\n-------------------------------------\n");

	}

}
