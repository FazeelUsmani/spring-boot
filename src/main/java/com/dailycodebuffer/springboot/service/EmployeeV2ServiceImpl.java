package com.dailycodebuffer.springboot.service;

import com.dailycodebuffer.springboot.entity.EmployeeEntity;
import com.dailycodebuffer.springboot.error.EmployeeNotFoundException;
import com.dailycodebuffer.springboot.model.Employee;
import com.dailycodebuffer.springboot.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeV2ServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeById(String id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee save(Employee employee) {

        if (employee.getEmployeeId() == null || employee.getEmployeeId().isEmpty()) {
            employee.setEmployeeId(UUID.randomUUID().toString());
        }

        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, entity);
        employeeRepository.save(entity);
        return employee;
    }

    @Override
    public String deleteEmployeeById(String id) {
       return "null";
    }

}
