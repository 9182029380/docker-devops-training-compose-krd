package com.cts.EmployeeInfo.service;

import com.cts.EmployeeInfo.model.Employee;
import com.cts.EmployeeInfo.repository.Employeerepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private Employeerepo repo;

    public Employee create(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getallemployees() {
        return repo.findAll();
    }

    public Employee getByEmpid(String empid)  {
        return repo.findByEmpid(empid).orElseThrow(()->new EntityNotFoundException("Employee not found with id: "+empid));
    }

    public Employee getByPhone(String phone) {
        return repo.findByPhonenumber(phone);
    }

    public Employee updateByEmpid(String empid, Employee emp) {
        Employee existingEmployee = repo.findByEmpid(empid).orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + empid));
        existingEmployee.setEmail(emp.getEmail());
        existingEmployee.setLocation(emp.getLocation());
        existingEmployee.setPhonenumber(emp.getPhonenumber());
        existingEmployee.setSalary(emp.getSalary());
        existingEmployee.setHrName(emp.getHrName());
        existingEmployee.setManagerName(emp.getManagerName());
        return repo.save(existingEmployee);


    }

    public void deleteByEmpid(String empid) {
        Employee existingEmployee = repo.findByEmpid(empid).orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + empid));
        repo.delete(existingEmployee);
    }
}
