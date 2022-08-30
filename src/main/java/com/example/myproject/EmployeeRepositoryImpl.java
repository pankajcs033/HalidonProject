package com.example.myproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EmployeeRepositoryImpl implements EmployeeRepository{

	private List<Employee> eList = new ArrayList<>();
	
	{
		Employee e1 = new Employee("101", "A", "A", "male", "IT", "A@gmail.com");
		Employee e2 = new Employee("102", "B", "B", "male", "Sales", "B@gmail.com");
		Employee e3 = new Employee("103", "C", "C", "male", "Sales", "C@gmail.com");
		Employee e4 = new Employee("104", "D", "D", "male", "Management", "D@gmail.com");
		Employee e5 = new Employee("105", "E", "E", "male", "IT", "E@gmail.com");
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e4);
		eList.add(e5);
	}
	
	
	@Override
	public List<Employee> getAll() {
		return eList;
	}

	@Override
	public List<Employee> getByDepartment(String department) {
        List<Employee> matchList = eList.stream()
        		.filter((e) -> (e.getDepartment().contains(department)))
                .collect(Collectors.toList());
        return matchList;
	}

	@Override
	public void save(Employee employee) {
		Employee nextEmployee = new Employee(employee.getEid(),
											employee.getFirstName(),
											employee.getLastName(),
											employee.getGender(),
											employee.getDepartment(),
											employee.getEmail());
		eList.add(nextEmployee);
	}


	@Override
	public void deleteById(String id) {
		System.out.println("hello");
		eList.removeIf(e -> e.getEid().equals(id));
		System.out.println(eList);
	}

	@Override
	public Optional<Employee> getById(String id) {
		return (eList.stream()
				.filter(e -> e.getEid().equals(id))
				.findFirst());
	}

}
