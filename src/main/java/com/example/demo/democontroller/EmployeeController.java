package com.example.demo.democontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeRepository;
import com.example.demo.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository empRepo;;

	@PostMapping("/addEmployee")
	ResponseEntity<String> addEmployee(@RequestBody  Employee employee) {
		Employee e = empRepo.save(employee);
		return new ResponseEntity<>("Added Successfully", HttpStatus.CREATED);
	}

}
