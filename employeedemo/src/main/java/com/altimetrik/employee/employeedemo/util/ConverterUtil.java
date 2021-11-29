package com.altimetrik.employee.employeedemo.util;

import com.altimetrik.employee.employeedemo.dto.EmployeeVO;
import com.altimetrik.employee.employeedemo.dto.ProjectVO;
import com.altimetrik.employee.employeedemo.model.Department;
import com.altimetrik.employee.employeedemo.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConverterUtil {

    public static EmployeeVO convertToVO(Employee employee){
        EmployeeVO employeeVO = new EmployeeVO();
        employeeVO.setEmployeeCode(employee.getEmployeeCode());
        employeeVO.setEmployeeName(employee.getEmployeeName());
        employeeVO.setEmployeeId(employee.getEmployeeId());
        List<Department> departments = employee.getDepartments();
        List<ProjectVO> projectVOS = new ArrayList<>();
        departments.forEach(d-> d.getProjects().forEach(p->{
            ProjectVO projectVO = new ProjectVO();
            projectVO.setDepartmentId(d.getDepartmentId());
            projectVO.setProjectId(p.getProjectId());
            projectVO.setDepartmentCode(d.getDepartmentCode());
            projectVO.setDepartmentName(d.getDepartmentName());
            projectVO.setProjectCode(p.getProjectCode());
            projectVO.setProjectName(p.getProjectName());
            projectVOS.add(projectVO);
        }));
        employeeVO.setProjects(projectVOS);
        return employeeVO;
    }

    public static List<EmployeeVO> convertToVOs(List<Employee> employees){
       return employees.stream().map(ConverterUtil::convertToVO).collect(Collectors.toList());
    }

}
