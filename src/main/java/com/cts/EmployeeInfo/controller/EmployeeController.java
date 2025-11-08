package com.cts.EmployeeInfo.controller;

import com.cts.EmployeeInfo.model.Employee;
import com.cts.EmployeeInfo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/cts")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public Employee createemployee(@RequestBody Employee emp){
        return service.create(emp);
    }
    @GetMapping
    public List<Employee> getallemployees(){
        return service.getallemployees();
    }
    @GetMapping("/{empid}")
    public Employee getByEmpid(@PathVariable String empid){
        return  service.getByEmpid(empid);

    }
    //get with phonenumber
    @GetMapping("/phone/{phone}")
    public Employee getByPhone(@PathVariable String phone){
        return service.getByPhone(phone);
    }
    @PutMapping("/{empid}")
    public Employee updateByEmpid(@PathVariable String empid,@RequestBody Employee emp){
        return service.updateByEmpid(empid,emp);
    }
    @DeleteMapping("/{empid}")
    public void deleteByEmpid(@PathVariable String empid){
        service.deleteByEmpid(empid);
    }

}
