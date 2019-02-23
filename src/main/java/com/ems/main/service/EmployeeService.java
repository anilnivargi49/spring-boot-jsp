package com.ems.main.service;

import java.util.List;

import com.ems.main.dto.EmployeeDTO;

public interface EmployeeService {

	public void createOrUpdateEmployee(EmployeeDTO empDTO);
	
	public List<EmployeeDTO> getAllEmployee();
	
	public void deleteEmployee(Long id);
	
	public EmployeeDTO editEmployee(Long id);
	
}
