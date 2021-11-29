package com.altimetrik.employee.employeedemo.repository;

import com.altimetrik.employee.employeedemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByEmployeeCode(String employeeCode);


}
