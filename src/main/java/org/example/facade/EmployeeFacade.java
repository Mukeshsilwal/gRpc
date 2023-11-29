package org.example.facade;

import employee.EmployeeOuterClass;

public interface EmployeeFacade {
    void saveEmployee(EmployeeOuterClass.Employee employee);
    EmployeeOuterClass.Employee getEmployee(EmployeeOuterClass.EmployeeRequest request);
    EmployeeOuterClass.Employee updateEmployee(EmployeeOuterClass.Employee employee);
    void deleteEmployee(EmployeeOuterClass.EmployeeRequest request);

}
