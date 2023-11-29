package org.example.endPoint;


import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.facade.facadeImpl.EmployeeFacadeImpl;
import proto.EmployeeOuterClass;
import proto.EmployeeServiceGrpc;

@GrpcService
public class EmployeeEndPoint extends EmployeeServiceGrpc.EmployeeServiceImplBase {
    private final EmployeeFacadeImpl facade;

    public EmployeeEndPoint(EmployeeFacadeImpl facade) {
        this.facade = facade;
    }

    @Override
    public void getEmployee(EmployeeOuterClass.EmployeeRequest request, StreamObserver<EmployeeOuterClass.Employee> responseObserver) {
        super.getEmployee(request, responseObserver);
         EmployeeOuterClass.Employee employee =facade.getEmployee(request);
         responseObserver.onNext(employee);
         responseObserver.onCompleted();

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
        facade.deleteEmployee(request);
        EmployeeOuterClass.deleteEmployeeStatus status= EmployeeOuterClass.deleteEmployeeStatus.newBuilder().setStatus("Employee has been removed").build();
        responseObserver.onNext(status);
        responseObserver.onCompleted();
    }

    @Override
    public void updateEmployee(EmployeeOuterClass.Employee request, StreamObserver<EmployeeOuterClass.Employee> responseObserver) {
        super.updateEmployee(request, responseObserver);
        EmployeeOuterClass.Employee employee=facade.updateEmployee(request);
        responseObserver.onNext(employee);
        responseObserver.onCompleted();
    }
}
