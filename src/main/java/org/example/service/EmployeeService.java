package org.example.service;

import org.example.entity.Employee;

public interface EmployeeService {
    void saveEmployee(Employee employee);
    Employee getEmployee(int employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
