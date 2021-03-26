package com.employee.management.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.system.service.EmployeeService;
import com.employee.management.system.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employee")
@RestController

public class EmployeeController {

	@Autowired
    private EmployeeService employeeService;

	@PutMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee){
      return employeeService.addEmployee(employee);
    }

    @GetMapping("/getEmployee")
    public Employee getEmployee(int id){
        System.out.println(id);
        return employeeService.getEmployee(id);

    }

    @PatchMapping("/updateEmployee")
    public String updateEmployee( @RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

}
