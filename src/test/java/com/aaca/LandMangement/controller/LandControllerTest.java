package com.aaca.LandMangement.controller;

import com.aaca.LandMangement.entities.Employee;
import com.aaca.LandMangement.entities.Land;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.*;
import static scala.reflect.internal.ClassfileConstants.land;

class LandControllerTest {

    @Test
    void getEmployees() {
        List<Employee> employeeList;
        employeeList = asList(new Employee(1, "Baby", "Girma", "Doctor", new Date(2020 - 02 - 04)),
                new Employee(2, "Mekidi", "Tadesse", "Servour", new Date(2018 - 03 - 04)));
        System.out.println(employeeList);

    }

    @Test
    void createLand() {
    }
}
