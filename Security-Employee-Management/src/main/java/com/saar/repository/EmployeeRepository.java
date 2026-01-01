package com.saar.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.saar.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
