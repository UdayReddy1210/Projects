package com.ibm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.Bean.EmployeeBean;

@Component
public class EmployeeImpl implements Employee{
	
	List<EmployeeBean> employee = new ArrayList<EmployeeBean>();
	@Override
	public void createEmployee() {
		EmployeeBean bean = new EmployeeBean();
		bean.setEmployeeId(101);
		bean.setEmployeeName("Uday");
		bean.setAddress("Jbls");
		bean.setLocation("Hyderabad");
		
		EmployeeBean bean1 = new EmployeeBean();
		bean1.setEmployeeId(102);
		bean1.setEmployeeName("Rohan");
		bean1.setAddress("Alaska");
		bean1.setLocation("United States");
		
		employee.add(bean);
		employee.add(bean1);
	}
	@Override
	public void listEmployee() {
		System.out.println("Employee list:");
		System.out.println(employee);
		for(EmployeeBean emp: employee) {
			System.out.println("Details:"+emp.getEmployeeId()+" "+emp.getEmployeeName()+ " "
					+emp.getAddress()+" "+emp.getLocation());
		}
	}
	
}
