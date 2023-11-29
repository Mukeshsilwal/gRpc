package org.example.endPoint;


import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.facade.facadeImpl.DepartmentFacadeImpl;
import proto.DepartmentOuterClass;
import proto.DepartmentServiceGrpc;


@GrpcService
public class DepartmentEndPoint extends DepartmentServiceGrpc.DepartmentServiceImplBase{
    private final DepartmentFacadeImpl facade;

    public DepartmentEndPoint(DepartmentFacadeImpl facade) {
        this.facade = facade;
    }

    @Override
    public void getDepartment(DepartmentOuterClass.DepartmentRequest request, StreamObserver<DepartmentOuterClass.DepartmentResponse> responseObserver) {
        super.getDepartment(request, responseObserver);
    }

    @Override
    public void addDepartment(DepartmentOuterClass.Department request, StreamObserver<DepartmentOuterClass.Department> responseObserver) {
        super.addDepartment(request, responseObserver);
        facade.saveDepartment(request);
        responseObserver.onNext(request);
        responseObserver.onCompleted();

    }

    @Override
    public void deleteDepartment(DepartmentOuterClass.DepartmentRequest request, StreamObserver<DepartmentOuterClass.deleteDataStatus> responseObserver) {
        super.deleteDepartment(request, responseObserver);
    }

    @Override
    public void updateDepartment(DepartmentOuterClass.Department request, StreamObserver<DepartmentOuterClass.DepartmentResponse> responseObserver) {
        super.updateDepartment(request, responseObserver);
    }
}
