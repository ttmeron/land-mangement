package com.aaca.LandMangement.controller;


import com.aaca.LandMangement.model.Address;
import com.aaca.LandMangement.model.Employee;
import com.aaca.LandMangement.model.Land;
import com.aaca.LandMangement.service.EmployeeService;
import com.aaca.LandMangement.service.LandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/LandMangement")
@Validated
public class LandController {
@Autowired
    LandService landService;
@Autowired
EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return employeeService.getAllEmployee();
    }
    @PostMapping("employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        employeeService.createEmployee(employee);
        System.out.println(employee.getFirsName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getTitle());
        System.out.println(employee.getHiredDate());
        return employee;
    }
    @GetMapping("/employee/{empId}")
    public Employee getEmployeeById (@PathVariable Long empId){
        return employeeService.getEmployee(empId);

    }
    @GetMapping("/lands")

    public List<Land> getLands() {
        return landService.getAllLand();

    }
    @GetMapping("/land")

    public Land getLand() {
        Land land = new Land();
        land.setArea(356);
        land.setLandType("A");
        land.setxCoordinate(4633388);
        land.setYCoordinate(9633388);
        Address address = new Address();
        address.setBulidingNmumber(893);
        address.setStreetName("Falcon");
        address.setCity("Anaheim");
        address.setState("CA");
        address.setZipcode(92804);
        land.setAddress(address);
   return land;
    }

    @PostMapping("/land")
    public Land createLand(@Valid @RequestBody Land land) {
        landService.createLand(land);
        System.out.println(land.getLandType());
        System.out.println(land.getArea());
        System.out.println(land.getxCoordinate());
        System.out.println(land.getYCoordinate());
        return land;
    }
    @GetMapping("/land/{landId}")
    public Land getLandById (@PathVariable Long landId){
        return landService.getLand(landId);

    }



}
