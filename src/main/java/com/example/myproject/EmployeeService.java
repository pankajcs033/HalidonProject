package com.example.myproject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

import io.helidon.config.Config;
import io.helidon.webserver.Routing;
import io.helidon.webserver.Routing.Rules;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;


import io.helidon.webserver.Service;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/employees")
public class EmployeeService {
	
	private final EmployeeRepository employees = new EmployeeRepositoryImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAll(){
		return (List<Employee>) employees.getAll();
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> addEmployee(Employee emp){
		employees.save(emp);
		return (List<Employee>) employees.getAll();
	}

	@GET
	@Path("/department/{department}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getByDepartment(@PathParam("department") String department){
		return employees.getByDepartment(department);
	}

	@DELETE
	@Path("/remove/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> deleteById(@PathParam("id") String id){
		employees.deleteById(id);
		return (List<Employee>) employees.getAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Optional<Employee> getById(@PathParam("id") String id){
		return employees.getById(id);
	}	
}
