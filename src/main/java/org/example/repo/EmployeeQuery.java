package org.example.repo;

import org.example.entity.Employee;

public interface EmployeeQuery {
     void saveData(Employee employee);
     void deleteData(int id);
     Employee updateData(Employee employee);
     Employee getEmployee(int id);
}
