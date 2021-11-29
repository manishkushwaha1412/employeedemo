package com.altimetrik.employee.employeedemo.controller;

import com.altimetrik.employee.employeedemo.dto.EmployeeVO;
import com.altimetrik.employee.employeedemo.repository.DepartmentRepository;
import com.altimetrik.employee.employeedemo.repository.EmployeeRepository;
import com.altimetrik.employee.employeedemo.repository.ProjectRepository;
import com.altimetrik.employee.employeedemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/employees/projects")
    public ResponseEntity<List<EmployeeVO>> findAllEmployees(){

        try{
            List<EmployeeVO> employeeVOS = employeeService.findAllEmployee();
            if(employeeVOS!= null && !employeeVOS.isEmpty()){
                return new ResponseEntity<>(employeeVOS, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch(Exception exception){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/employees/{employeeCode}/projects")
    public ResponseEntity<EmployeeVO> findEmployeeByCode(@PathVariable("employeeCode") String employeeCode){
        EmployeeVO employeeVO = employeeService.findEmployeeByCode(employeeCode);
        return new ResponseEntity<>(employeeVO, HttpStatus.OK);
    }

    @DeleteMapping("/employees/{employeeCode}/projects/{projectCode}")
    public ResponseEntity<String> deleteProjectFromEmployee(@PathVariable("employeeCode") String employeeCode, @PathVariable("projectCode") String projectCode){

        String message = employeeService.deleteProjectFromEmployee(employeeCode, projectCode);
        return new ResponseEntity<>(message, HttpStatus.OK);

    }

}
