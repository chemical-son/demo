package com.example.demo.using_dataJDBC.repositories;

import com.example.demo.using_dataJDBC.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VV_EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findByNameContainsIgnoreCase(String name);

}
