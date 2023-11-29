package org.example.facade.facadeImpl;


import org.example.entity.Department;
import org.example.service.DepartmentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import proto.DepartmentOuterClass;


@Service
public class DepartmentFacadeImpl{
    private final DepartmentService service;
    private final ModelMapper mapper;

    public DepartmentFacadeImpl(DepartmentService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }


    public void saveDepartment(DepartmentOuterClass.Department department) {
        Department department1=toDepartment(department);
        service.saveDepartment(department1);
    }


    public DepartmentOuterClass.Department updateDepartment(DepartmentOuterClass.Department department) {
        return null;
    }


    public void deleteDepartment(DepartmentOuterClass.DepartmentRequest request) {

    }


    public DepartmentOuterClass.Department getDepartment(DepartmentOuterClass.DepartmentRequest request) {
        return null;
    }
    public Department toDepartment(DepartmentOuterClass.Department department){
        return mapper.map(department,Department.class);
    }
    public DepartmentOuterClass.Department toOuterClass(Department department){
        return mapper.map(department, DepartmentOuterClass.Department.class);
    }
}
