package org.example.facade.facadeImpl;

import employee.EmployeeOuterClass;
import org.example.entity.Employee;
import org.example.facade.EmployeeFacade;
import org.example.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployeeFacadeImpl implements EmployeeFacade {
    private final EmployeeService employeeService;
    private final ModelMapper modelMapper;

    public EmployeeFacadeImpl(EmployeeService employeeService, ModelMapper modelMapper) {
        this.employeeService = employeeService;
        this.modelMapper = modelMapper;
    }

    @Override
    public void saveEmployee(EmployeeOuterClass.Employee employee) {
        Employee employee1=toEmployee(employee);
        employeeService.saveEmployee(employee1);
    }

    @Override
    public EmployeeOuterClass.Employee getEmployee(EmployeeOuterClass.EmployeeRequest request) {
        int id= request.getId();
        Employee employee=employeeService.getEmployee(id);
        return toOuterClass(employee);
    }

    @Override
    public EmployeeOuterClass.Employee updateEmployee(EmployeeOuterClass.Employee employee) {
        return null;
    }

    @Override
    public void deleteEmployee(EmployeeOuterClass.EmployeeRequest request) {

    }
    public Employee toEmployee(EmployeeOuterClass.Employee employee){
        return modelMapper.map(employee,Employee.class);
    }
    public EmployeeOuterClass.Employee toOuterClass(Employee employee){
        return modelMapper.map(employee, EmployeeOuterClass.Employee.class);
    }


}
