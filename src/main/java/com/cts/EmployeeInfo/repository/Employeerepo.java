package com.cts.EmployeeInfo.repository;

import com.cts.EmployeeInfo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import java.util.Optional;

@Repository
public interface Employeerepo extends JpaRepository<Employee,Integer> {


    Optional<Employee> findByEmpid(String empid);

    Employee findByPhonenumber(String phone);
}
