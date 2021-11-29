package com.altimetrik.employee.employeedemo.repository;

import com.altimetrik.employee.employeedemo.model.Project;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Modifying
    @Query("delete from Project p where p.projectId=:projectId")
    void deleteProjectById(@Param("projectId") Long projectId);


}
