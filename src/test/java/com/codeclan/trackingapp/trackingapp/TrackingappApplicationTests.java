package com.codeclan.trackingapp.trackingapp;

import com.codeclan.trackingapp.trackingapp.models.Department;
import com.codeclan.trackingapp.trackingapp.models.Employee;
import com.codeclan.trackingapp.trackingapp.repositories.DepartmentRepository;
import com.codeclan.trackingapp.trackingapp.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrackingappApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}
	@Test
	public void createEmployeeandDepartment(){
		Department department = new Department("BestDepartmentEver");
		departmentRepository.save(department);
		Employee employee = new Employee("Jon", "Zarecki", 928374, department);
		employeeRepository.save(employee);
	}

}
