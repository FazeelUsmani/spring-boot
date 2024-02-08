package com.dailycodebuffer.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
//@JsonIgnoreProperties({"department"})
public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String emailId;
//    @JsonIgnore
    private String department;

}
