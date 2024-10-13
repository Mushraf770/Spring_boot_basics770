package com.spring.example.springbootdemo.controllers;

//Operations
//GET / employees
//POST /employees
//DELETE /employees/{id}

import com.spring.example.springbootdemo.dto.EmployeeDTO;
import com.spring.example.springbootdemo.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/employees/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long employeeId) {

        return employeeService.getEmployeeById(employeeId);
        //return new EmployeeDTO(employeeId, "Mushraf", LocalDate.of(2024, 1, 7), true);
    }


    @PostMapping(path = "/employees")
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO) {
        //return "Hello "+sortBy + " " + limit;
        return employeeService.createNewEmployee(employeeDTO);
    }
}
