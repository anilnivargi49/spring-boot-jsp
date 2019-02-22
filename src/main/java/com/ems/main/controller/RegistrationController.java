package com.ems.main.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ems.main.dto.EmployeeDTO;
import com.ems.main.model.Employee;
import com.ems.main.repository.EmployeeRepository;

@Controller
public class RegistrationController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/registration")
	public String reg(Map<String, Object> model) {
		model.put("employee", new EmployeeDTO());
		return "Registration";
	}
	
	@PostMapping("/home")
	public String createEmployee(@ModelAttribute("employee") EmployeeDTO empDto) {
		
		Employee emp = convertDtoToModel(empDto);
		emp = employeeRepository.save(emp);
		return "redirect:/list";	
	}
	
	@GetMapping("/list")
	public String listOfEmployee(Model model) {
		List<Employee> list = employeeRepository.findAll();
		List<EmployeeDTO> employeeList = list.stream()
	            .map(EmployeeDTO::new)
	            .collect(Collectors.toCollection(ArrayList::new));
		model.addAttribute("empList", employeeList);
		return "employeeList";
	}
	
	@PostMapping("/delete")
	public String deleteEmployee(@RequestParam("id") String id) {
		
		employeeRepository.deleteById(Long.parseLong(id));
		return "redirect:/list";		
	}
	
	@GetMapping("/edit")
	public String editEmployee(@RequestParam("id") String id, Map<String, Object> model) {
		Employee emp = employeeRepository.getOne(Long.parseLong(id));
		EmployeeDTO empDTO = convertModelToDTO(emp);
		model.put("employee", empDTO);
		return "Registration";
	}
	
	private Employee convertDtoToModel(EmployeeDTO empDto) {
		Employee emp = new Employee();
		if (empDto.getId() != null) {
			emp.setId(empDto.getId());
		}
		emp.setAge(empDto.getAge());
		emp.setBloodGp(empDto.getBloodGp());
		emp.setEmailId(empDto.getEmailId());
		emp.setEmpId(empDto.getEmpId());
		emp.setFirstName(empDto.getFirstName());
		emp.setLastName(empDto.getLastName());
		emp.setMobileNo(empDto.getMobileNo());
		emp.setPersonalEmail(empDto.getPersonalEmail());
		emp.setUserName(empDto.getUserName());
		return emp;
	}
	
	private EmployeeDTO convertModelToDTO(Employee emp) {
		EmployeeDTO empDTO = new EmployeeDTO();
		empDTO.setId(emp.getId());
		empDTO.setAge(emp.getAge());
		empDTO.setBloodGp(emp.getBloodGp());
		empDTO.setEmailId(emp.getEmailId());
		empDTO.setEmpId(emp.getEmpId());
		empDTO.setFirstName(emp.getFirstName());
		empDTO.setLastName(emp.getLastName());
		empDTO.setMobileNo(emp.getMobileNo());
		empDTO.setPersonalEmail(emp.getPersonalEmail());
		empDTO.setUserName(emp.getUserName());
		return empDTO;
	}
	
}
