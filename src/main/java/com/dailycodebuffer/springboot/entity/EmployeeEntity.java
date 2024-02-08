package com.dailycodebuffer.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Employee_table")
public class EmployeeEntity {

    @Id
    private String employeeId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String department;

}
