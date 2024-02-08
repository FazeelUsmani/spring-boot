package com.dailycodebuffer.springboot.repository;

import com.dailycodebuffer.springboot.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {

}
