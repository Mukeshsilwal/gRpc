package org.example.service.serviceImpl;

import org.example.entity.Employee;
import org.example.repo.EmployeeQuery;
import org.example.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeQuery query;

    public EmployeeServiceImpl(EmployeeQuery query) {
        this.query = query;
    }


    @Override
    public void saveEmployee(Employee employee) {
        query.saveData(employee);

    }

    @Override
    public Employee getEmployee(int id) {
        return query.getEmployee(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return query.updateData(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        query.deleteData(id);

    }
}
