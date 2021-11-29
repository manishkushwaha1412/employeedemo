package com.altimetrik.employee.employeedemo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ProjectVO {
    @JsonIgnore
    private Long projectId;
    @JsonIgnore
    private Long departmentId;
    private String projectCode;
    private String projectName;
    private String departmentCode;
    private String departmentName;

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "ProjectVO{" +
                "projectCode='" + projectCode + '\'' +
                ", projectName='" + projectName + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
