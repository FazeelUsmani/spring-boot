package com.dailycodebuffer.springboot.service;

import com.dailycodebuffer.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee getEmployeeById(String id);

    List<Employee> getAllEmployees();
    Employee save(Employee employee);

}
