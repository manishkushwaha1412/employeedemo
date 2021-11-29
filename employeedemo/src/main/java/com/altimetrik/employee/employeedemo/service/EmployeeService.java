package com.altimetrik.employee.employeedemo.service;

import com.altimetrik.employee.employeedemo.dto.EmployeeVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    List<EmployeeVO> findAllEmployee();

    EmployeeVO findEmployeeByCode(String employeeCode);

    String deleteProjectFromEmployee(String employeeCode, String projectCode);

}
