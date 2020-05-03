package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    List<Employee> findByLastnameContaining(String arg);

    @Query
    List<Employee> findByLastname(@Param("lastname") String lastname);

    @Query
    List<Employee> findByLastnameSample(@Param("sample") String sample);
}
