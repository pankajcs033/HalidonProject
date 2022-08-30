package com.example.myproject;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

import io.helidon.config.Config;

public interface EmployeeRepository {
	static EmployeeRepository create(String driverType, Config config) {
		switch(driverType) {
		case "Array":
		default:
			return new EmployeeRepositoryImpl();
		}
	}
	
	List<Employee> getAll();
	
	List<Employee> getByDepartment(String department);
	
	void save(Employee employee);
	
	void deleteById(String id);
	
	Optional<Employee> getById(String id);
}
