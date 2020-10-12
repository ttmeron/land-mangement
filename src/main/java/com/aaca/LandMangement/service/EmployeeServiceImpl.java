package com.aaca.LandMangement.service;

import com.aaca.LandMangement.entities.Employee;
import com.aaca.LandMangement.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployee(Long empId)
    {

        return employeeRepository.findById(empId).get();
    }
    @Override
    public Employee createEmployee(Employee employee){

        return employeeRepository.save(employee);
    }
    @Override
    public List<Employee> getAllEmployees(){


        return employeeRepository.findAll();
    }


}
