package org.example.endPoint;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.facade.facadeImpl.ProjectFacade;
import proto.ProjectOuterClass;
import proto.ProjectServiceGrpc;

@GrpcService
public class ProjectEndPoint extends ProjectServiceGrpc.ProjectServiceImplBase {
    private final ProjectFacade facade;

    public ProjectEndPoint(ProjectFacade facade) {
        this.facade = facade;
    }

    @Override
    public void getProject(ProjectOuterClass.ProjectRequest request, StreamObserver<ProjectOuterClass.Project> responseObserver) {
        super.getProject(request, responseObserver);
    }

    @Override
    public void addProject(ProjectOuterClass.Project request, StreamObserver<ProjectOuterClass.Project> responseObserver) {
        super.addProject(request, responseObserver);
        facade.saveProject(request);
        responseObserver.onNext(request);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteProject(ProjectOuterClass.ProjectRequest request, StreamObserver<ProjectOuterClass.deleteDataResponse> responseObserver) {
        super.deleteProject(request, responseObserver);
    }

    @Override
    public void updateProject(ProjectOuterClass.Project request, StreamObserver<ProjectOuterClass.Project> responseObserver) {
        super.updateProject(request, responseObserver);
    }
}
