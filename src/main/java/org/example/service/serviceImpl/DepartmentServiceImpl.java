package org.example.service.serviceImpl;

import org.example.entity.Department;
import org.example.repo.DepartmentQuery;
import org.example.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentQuery query;

    public DepartmentServiceImpl(DepartmentQuery query) {
        this.query = query;
    }

    @Override
    public void saveDepartment(Department department) {
        query.saveData(department);

    }

    @Override
    public Department getDepartment(int id) {
        return null;
    }

    @Override
    public Department updateDepartment(Department department) {
        return null;
    }

    @Override
    public void deleteDepartment(int id) {

    }
}
