package org.example.endPoint;

import employee.EmployeeOuterClass;
import employee.EmployeeServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.facade.EmployeeFacade;

@GrpcService
public class EmployeeEndPoint extends EmployeeServiceGrpc.EmployeeServiceImplBase {
    private final EmployeeFacade facade;

    public EmployeeEndPoint(EmployeeFacade facade) {
        this.facade = facade;
    }

    @Override
    public void getEmployee(EmployeeOuterClass.EmployeeRequest request, StreamObserver<EmployeeOuterClass.Employee> responseObserver) {
        super.getEmployee(request, responseObserver);

    }

    @Override
    public void addEmployee(EmployeeOuterClass.Employee request, StreamObserver<EmployeeOuterClass.saveEmployeeResponse> responseObserver) {
        super.addEmployee(request, responseObserver);
        facade.saveEmployee(request);
        EmployeeOuterClass.saveEmployeeResponse response= EmployeeOuterClass.saveEmployeeResponse.newBuilder().setStatus("Employee saved successfully").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteEmployee(EmployeeOuterClass.EmployeeRequest request, StreamObserver<EmployeeOuterClass.deleteEmployeeStatus> responseObserver) {
        super.deleteEmployee(request, responseObserver);
    }

    @Override
    public void updateEmployee(EmployeeOuterClass.Employee request, StreamObserver<EmployeeOuterClass.Employee> responseObserver) {
        super.updateEmployee(request, responseObserver);
    }
}
