package com.spring.example.springbootdemo.services;

import com.spring.example.springbootdemo.dto.EmployeeDTO;
import com.spring.example.springbootdemo.entity.EmployeeEntity;
import com.spring.example.springbootdemo.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDTO getEmployeeById(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
        return new EmployeeDTO(employeeEntity.getId(), employeeEntity.getName(), employeeEntity.getDateOfJoining(), employeeEntity.isActive());
    }

    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) {

    }
}
