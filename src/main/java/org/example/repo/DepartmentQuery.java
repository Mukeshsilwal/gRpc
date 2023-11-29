package org.example.repo;

import org.example.entity.Department;

public interface DepartmentQuery {
    void saveData(Department department);
    Department updateData(Department department);
    Department getDepartment(int id);
    void deleteData(int id);
}
