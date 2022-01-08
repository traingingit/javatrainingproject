package com.trainingemployee.training.employee.controller;

import com.trainingemployee.training.employee.model.Employee;
import com.trainingemployee.training.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployee()
    {
        return employeeService.getEmployee();
    }

    @PostMapping("/addemp")
    public String addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/updateemp")
    public String updateEmployee(@RequestBody Employee employee)
    {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/deleteemp")
    public String deleteEmployee(@RequestBody Employee employee)
    {
        return employeeService.deleteEmployee(employee.getId());
    }
}
