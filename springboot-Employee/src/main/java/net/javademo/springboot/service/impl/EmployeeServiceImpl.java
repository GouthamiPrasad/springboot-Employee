package net.javademo.springboot.service.impl;

//import java.util.List;
//import java.util.Optional;

import org.springframework.stereotype.Service;

//import net.javademo.springboot.exception.ResourceNotFoundException;
import net.javademo.springboot.model.Employee;
import net.javademo.springboot.repository.EmployeeRepository;
import net.javademo.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
}

