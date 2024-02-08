package com.dailycodebuffer.springboot.service;

import com.dailycodebuffer.springboot.error.EmployeeNotFoundException;
import com.dailycodebuffer.springboot.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public Employee getEmployeeById(String id) {
//        for (Employee employee: employeeList) {
//            log.info("employee ", employee);
//            if (employee.getEmployeeId() == id) {
//                return employee;
//            }
//        }

        return employeeList
                .stream()
                .filter(employee -> employee.getEmployeeId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException(
                        "Employee not found with Id " + id));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeList;
    }

    @Override
    public Employee save(Employee employee) {

        if (employee.getEmployeeId() == null || employee.getEmployeeId().isEmpty()) {
            employee.setEmployeeId(UUID.randomUUID().toString());
        }

        employeeList.add(employee);
        return employee;
    }
}
