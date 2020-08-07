package com.aaca.LandMangement.controller;


import com.aaca.LandMangement.entities.Address;
import com.aaca.LandMangement.entities.Employee;
import com.aaca.LandMangement.entities.Land;
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
    public List<Employee> getEmployees() {
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
    public Employee getEmployeeById(@PathVariable Long empId) {
        return employeeService.getEmployee(empId);

    }

    @GetMapping("/lands")

    public List<Land> getLands() {
        return landService.getAllLand();

    }

    @GetMapping("/land")

    public Land getLand() {
//
//        Adland.setYCoordinate(9633388);
//        Address address = new Address();
//        address.setBulidingNmumber(893);
//        address.setStreetName("Falcon");
//        address.setCity("Anaheim");
//        address.setState("CA");
//        address.setZipcode(92804);
//        land.setAddress(address);
        Address address = Address
                .builder()
                .bulidingNmumber(233)
                .city("anaheim")
                .zipcode(92804)
                .streetName("Falcon")
                .state("Ca").build();
        Land land = Land.builder()
                .area(356).landType("A")
                .xCoordinate(4444)
                .YCoordinate(5555)
                .address(address)
                .build();


        return land;
    }

    @PostMapping("/land")
    public Land createLand(@Valid @RequestBody Land land) {
        landService.createLand(land);
        System.out.println(land.getLandType());
        System.out.println(land.getArea());
        System.out.println(land.getXCoordinate());
        System.out.println(land.getYCoordinate());
        return land;
    }

    @GetMapping("/land/{landId}")
    public Land getLandById(@PathVariable Long landId) {
        return landService.getLand(landId);

    }


}
