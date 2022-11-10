package com.example.springboot_zaur_data_rest.dao;


import com.example.springboot_zaur_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
