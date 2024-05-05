package com.gl.gradedproject.employeemanagementsystem.repository;

import com.gl.gradedproject.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> getEmployeesByFirstName(String firstName);
}
