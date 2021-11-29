package com.altimetrik.employee.employeedemo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class EmployeeVO {

    @JsonIgnore
    private Long employeeId;
    private String employeeCode;
    private String employeeName;
    private List<ProjectVO> projects;

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

    public List<ProjectVO> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectVO> projects) {
        this.projects = projects;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "EmployeeVO{" +
                "employeeCode='" + employeeCode + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", projects=" + projects +
                '}';
    }
}
