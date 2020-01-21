package com.codeclan.example.Company;

import com.codeclan.example.Company.models.Department;
import com.codeclan.example.Company.models.Employee;
import com.codeclan.example.Company.models.Project;
import com.codeclan.example.Company.repositories.DepartmentRepository;
import com.codeclan.example.Company.repositories.EmployeeRepository;
import com.codeclan.example.Company.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanyApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRepository projectRepository;



	@Test
	void contextLoads() {

	}


	@Test
	public void createEmployeeProjectDepartment(){
		Employee employee = new Employee("Davie", "Boyle", 2403);
		Employee employee1 = new Employee("Nelson", "Catrin", 999);
		employeeRepository.save(employee);
		employeeRepository.save(employee1);
		Project project = new Project("CRM Update", 4);
		Project project1 = new Project("Kanban Training", 4);
		projectRepository.save(project);
		projectRepository.save(project1);
		Department department = new Department("Developer");
	}


}
