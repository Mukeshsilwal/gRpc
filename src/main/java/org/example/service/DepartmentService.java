package org.example.service;

import org.example.entity.Department;

public interface DepartmentService {
    void saveDepartment(Department department);
    Department getDepartment(int id);
    Department updateDepartment(Department department);
    void deleteDepartment(int id);
}
