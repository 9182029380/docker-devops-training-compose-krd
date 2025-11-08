package com.cts.EmployeeInfo.model;

import jakarta.persistence.*;

@Entity
@Table(name="emp")
public class Employee {
    @Id
    public int id;  //pk
    public String empid;
    public String empName;
    public String email;
    public String phonenumber;
    public String  location;
    public String  managerName;
    public String hrName;
    public double   salary;

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String empid, String empName, String email, String phonenumber, String location, String managerName, String hrName, double salary) {
        this.id = id;
        this.empid = empid;
        this.empName = empName;
        this.email = email;
        this.phonenumber = phonenumber;
        this.location = location;
        this.managerName = managerName;
        this.hrName = hrName;
        this.salary = salary;
    }
}
