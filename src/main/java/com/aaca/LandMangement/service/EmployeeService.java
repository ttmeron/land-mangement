package com.aaca.LandMangement.service;

import com.aaca.LandMangement.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();

    Employee getEmployee(Long empId);

    Employee createEmployee(Employee employee);
}
