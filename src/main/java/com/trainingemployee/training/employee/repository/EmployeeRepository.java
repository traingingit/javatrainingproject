package com.trainingemployee.training.employee.repository;

import com.trainingemployee.training.employee.model.Employee;
import com.trainingemployee.training.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
