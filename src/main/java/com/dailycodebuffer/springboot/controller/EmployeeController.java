package com.dailycodebuffer.springboot.controller;

import com.dailycodebuffer.springboot.model.Employee;
import com.dailycodebuffer.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return this.employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return this.employeeService.getAllEmployees();
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable String id) {
        return this.employeeService.deleteEmployeeById(id);
    }


}
