package org.example.facade.facadeImpl;


import org.example.entity.Employee;
import org.example.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import proto.EmployeeOuterClass;

@Service
public class EmployeeFacadeImpl{
    private final EmployeeService employeeService;
    private final ModelMapper modelMapper;

    public EmployeeFacadeImpl(EmployeeService employeeService, ModelMapper modelMapper) {
        this.employeeService = employeeService;
        this.modelMapper = modelMapper;
    }


    public void saveEmployee(EmployeeOuterClass.Employee employee) {
        Employee employee1=toEmployee(employee);
        employeeService.saveEmployee(employee1);
    }


    public EmployeeOuterClass.Employee getEmployee(EmployeeOuterClass.EmployeeRequest request) {
        int id=request.getId();
        Employee employee1=employeeService.getEmployee(id);
        if(employee1!=null){
            return toOuterClass(employee1);
        }
        else{
            throw new RuntimeException("Employee not found");
        }
    }


    public EmployeeOuterClass.Employee updateEmployee(EmployeeOuterClass.Employee employee) {
        Employee employee1=toEmployee(employee);
        Employee employee2=employeeService.updateEmployee(employee1);
        return toOuterClass(employee2);
    }


    public void deleteEmployee(EmployeeOuterClass.EmployeeRequest request) {
        int id= request.getId();
        employeeService.deleteEmployee(id);

    }
    public Employee toEmployee(EmployeeOuterClass.Employee employee){
        return modelMapper.map(employee,Employee.class);
    }
    public EmployeeOuterClass.Employee toOuterClass(Employee employee){
        return modelMapper.map(employee, EmployeeOuterClass.Employee.class);
    }


}
