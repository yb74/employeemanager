package com.younescorp.employeemanager.repo;

import com.younescorp.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// We extends the class JpaRepository which is a library to make crud operations and this class takes the model class and its id type (Long) as parameters
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Optional<Employee> findEmployeeById(Long id); // Spring understand the language because we respected the naming convention on the query
}
