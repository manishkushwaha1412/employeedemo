package com.altimetrik.employee.employeedemo.service;

import com.altimetrik.employee.employeedemo.dto.EmployeeVO;
import com.altimetrik.employee.employeedemo.dto.ProjectVO;
import com.altimetrik.employee.employeedemo.exception.RecordNotFoundException;
import com.altimetrik.employee.employeedemo.model.Employee;
import com.altimetrik.employee.employeedemo.repository.DepartmentRepository;
import com.altimetrik.employee.employeedemo.repository.EmployeeRepository;
import com.altimetrik.employee.employeedemo.repository.ProjectRepository;
import com.altimetrik.employee.employeedemo.util.ConverterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public List<EmployeeVO> findAllEmployee() {
        List<Employee> employees = employeeRepository.findAll();
        if(employees.isEmpty()){
            throw new RecordNotFoundException("Employee Not Found !!");
        }
        return ConverterUtil.convertToVOs(employees);
    }

    @Override
    public EmployeeVO findEmployeeByCode(String employeeCode) {
        Employee employee = employeeRepository.findByEmployeeCode(employeeCode);
        if(employee == null){
            throw new RecordNotFoundException("Employee Not Found for code - "+employeeCode);
        }
        EmployeeVO employeeVO = ConverterUtil.convertToVO(employee);
        if(employeeVO.getProjects() == null || employeeVO.getProjects().isEmpty()){
            throw new RecordNotFoundException("Employee Not Found for code - "+employeeCode);
        }
        return employeeVO;
    }

    @Override
    @Transactional
    public String deleteProjectFromEmployee(String employeeCode, String projectCode) {
        EmployeeVO employeeVO = findEmployeeByCode(employeeCode);
        List<ProjectVO> projectVOS = employeeVO.getProjects().stream().filter(p->p.getProjectCode().equalsIgnoreCase(projectCode)).collect(Collectors.toList());
        Set<Long> projectIds = new HashSet<>();
        projectVOS.forEach(delete->{
            projectIds.add(delete.getProjectId());
        });

        projectIds.forEach(dProject-> projectRepository.deleteProjectById(dProject));

        return "Deleted Successfully!!";

    }
}
