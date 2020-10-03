package com.aaca.LandMangement.controller;


import com.aaca.LandMangement.entities.Address;
import com.aaca.LandMangement.entities.Employee;
import com.aaca.LandMangement.entities.HomeOwner;
import com.aaca.LandMangement.entities.Land;
import com.aaca.LandMangement.repo.HomeOwnerRepository;
import com.aaca.LandMangement.repo.LandRepository;
import com.aaca.LandMangement.service.EmployeeService;
import com.aaca.LandMangement.service.HomeOwnerService;
import com.aaca.LandMangement.service.LandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/LandManagement")
@Validated
public class LandController {

    @Autowired
    @Qualifier("LandServiceImpl")
    LandService landService;
    @Autowired
    HomeOwnerRepository homeOwnerRepository;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    LandRepository landRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employeesNames")
    public List<String> getEmployeesNames() {
        List<Employee> listOfEmployee = employeeService.getAllEmployees();
        List<String> names = null;
        names = listOfEmployee.stream()
         .map(s->s.getFirsName())
         .collect(Collectors.toList()) ;
        return names;
    }
    @GetMapping("/employeesTitle")
    public List<String> getListOfEmployeeTitle(){
        List<Employee> listOfTitle = employeeService.getAllEmployees();
        List<String>  Titles = null;
        Titles = listOfTitle.stream()
                .map(s->s.getTitle())
                .sorted()
                .filter(s -> s.startsWith("Developer"))
                .collect(Collectors.toList());
        return Titles;

    }

    @GetMapping("/employee")
    public Employee employee() {
        Employee employee = Employee.builder()
                .firsName("meron")
                .lastName("tekle")
                .title("Devloper")
                .hiredDate(new Date())
                .build();
//        Employee employee = new Employee();
//        employee.setEmpId(111);
//        employee.setFirsName("Meron");
//        employee.setLastName("Tekle");
//        employee.setTitle("devloper");
//        employee.setHiredDate(new Date());

        return employee;
    }

    @PostMapping("/employee")
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

    @GetMapping("/homeOwner")
    public List<String> getFirstName(){
       List<HomeOwner> homeOwnerList = homeOwnerRepository.findAll();
      return homeOwnerList.stream()
               .map(s->s.getFName())
               .map(s->s.toUpperCase())
               .collect(Collectors.toList());

    }
    @GetMapping("/landsArea")

    public List<Integer> getLandsArea() {
        List<Land> landAreaList = landRepository.findAll();
         return landAreaList.stream()
                .map(l->l.getArea())
                 .sorted()
                .collect(Collectors.toList());

    }
    @GetMapping("/lands")

    public List<Land> getLands() {
        List<Land> landList = landRepository.findAll();
         return landList.stream()
                .sorted((s1,s2)-> ((Integer) s1.getXCoordinate()).compareTo(s2.getXCoordinate()))
                .collect(Collectors.toList());

    }

    @GetMapping("/land")

//    public Land getLand() {
//
//        Adland.setYCoordinate(9633388);
//        Address address = new Address();
//        address.setBulidingNmumber(893);
//        address.setStreetName("Falcon");
//        address.setCity("Anaheim");
//        address.setState("CA");
//        address.setZipcode(92804);
//        land.setAddress(address);
//        Address address = Address
//                .builder()
//                .bulidingNmumber(233)
//                .city("anaheim")
//                .zipcode(92804)
//                .streetName("Falcon")
//                .state("Ca").build();
//        Land land = Land.builder()
//                .area(356).landType("A")
//                .xCoordinate(4444)
//                .YCoordinate(5555);
//               .address(address)
//                .build();


//        return land;
//    }

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
