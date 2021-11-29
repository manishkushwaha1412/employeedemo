package com.altimetrik.employee.employeedemo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    @Column(name = "EMPLOYEE_CODE")
    private String employeeCode;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "EMPLOYEE_ID")
    private List<Department> departments = new ArrayList<>();

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Employee() {
    }

    public Employee(String employeeCode, String employeeName) {
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeCode='" + employeeCode + '\'' +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
