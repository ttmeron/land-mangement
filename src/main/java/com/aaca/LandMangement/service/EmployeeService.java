package com.aaca.LandMangement.service;

import com.aaca.LandMangement.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public Employee getEmployee(Long empId);

    public Employee createEmployee(Employee employee);
}
