package com.altimetrik.employee.employeedemo.repository;

import com.altimetrik.employee.employeedemo.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
