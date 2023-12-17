package com.vismee.springrestcrud.dao;

import com.vismee.springrestcrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO
{
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
