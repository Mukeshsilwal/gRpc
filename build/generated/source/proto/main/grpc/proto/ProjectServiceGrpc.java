package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: Project.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProjectServiceGrpc {

  private ProjectServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.ProjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.ProjectOuterClass.ProjectRequest,
      proto.ProjectOuterClass.Project> getGetProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProject",
      requestType = proto.ProjectOuterClass.ProjectRequest.class,
      responseType = proto.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ProjectOuterClass.ProjectRequest,
      proto.ProjectOuterClass.Project> getGetProjectMethod() {
    io.grpc.MethodDescriptor<proto.ProjectOuterClass.ProjectRequest, proto.ProjectOuterClass.Project> getGetProjectMethod;
    if ((getGetProjectMethod = ProjectServiceGrpc.getGetProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetProjectMethod = ProjectServiceGrpc.getGetProjectMethod) == null) {
          ProjectServiceGrpc.getGetProjectMethod = getGetProjectMethod =
              io.grpc.MethodDescriptor.<proto.ProjectOuterClass.ProjectRequest, proto.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ProjectOuterClass.ProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("getProject"))
              .build();
        }
      }
    }
    return getGetProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ProjectOuterClass.Project,
      proto.ProjectOuterClass.Project> getAddProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addProject",
      requestType = proto.ProjectOuterClass.Project.class,
      responseType = proto.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ProjectOuterClass.Project,
      proto.ProjectOuterClass.Project> getAddProjectMethod() {
    io.grpc.MethodDescriptor<proto.ProjectOuterClass.Project, proto.ProjectOuterClass.Project> getAddProjectMethod;
    if ((getAddProjectMethod = ProjectServiceGrpc.getAddProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getAddProjectMethod = ProjectServiceGrpc.getAddProjectMethod) == null) {
          ProjectServiceGrpc.getAddProjectMethod = getAddProjectMethod =
              io.grpc.MethodDescriptor.<proto.ProjectOuterClass.Project, proto.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ProjectOuterClass.Project.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("addProject"))
              .build();
        }
      }
    }
    return getAddProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ProjectOuterClass.ProjectRequest,
      proto.ProjectOuterClass.deleteDataResponse> getDeleteProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteProject",
      requestType = proto.ProjectOuterClass.ProjectRequest.class,
      responseType = proto.ProjectOuterClass.deleteDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ProjectOuterClass.ProjectRequest,
      proto.ProjectOuterClass.deleteDataResponse> getDeleteProjectMethod() {
    io.grpc.MethodDescriptor<proto.ProjectOuterClass.ProjectRequest, proto.ProjectOuterClass.deleteDataResponse> getDeleteProjectMethod;
    if ((getDeleteProjectMethod = ProjectServiceGrpc.getDeleteProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getDeleteProjectMethod = ProjectServiceGrpc.getDeleteProjectMethod) == null) {
          ProjectServiceGrpc.getDeleteProjectMethod = getDeleteProjectMethod =
              io.grpc.MethodDescriptor.<proto.ProjectOuterClass.ProjectRequest, proto.ProjectOuterClass.deleteDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ProjectOuterClass.ProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ProjectOuterClass.deleteDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("deleteProject"))
              .build();
        }
      }
    }
    return getDeleteProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ProjectOuterClass.Project,
      proto.ProjectOuterClass.Project> getUpdateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProject",
      requestType = proto.ProjectOuterClass.Project.class,
      responseType = proto.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ProjectOuterClass.Project,
      proto.ProjectOuterClass.Project> getUpdateProjectMethod() {
    io.grpc.MethodDescriptor<proto.ProjectOuterClass.Project, proto.ProjectOuterClass.Project> getUpdateProjectMethod;
    if ((getUpdateProjectMethod = ProjectServiceGrpc.getUpdateProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectMethod = ProjectServiceGrpc.getUpdateProjectMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectMethod = getUpdateProjectMethod =
              io.grpc.MethodDescriptor.<proto.ProjectOuterClass.Project, proto.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ProjectOuterClass.Project.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("updateProject"))
              .build();
        }
      }
    }
    return getUpdateProjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceStub>() {
        @java.lang.Override
        public ProjectServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceStub(channel, callOptions);
        }
      };
    return ProjectServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingStub>() {
        @java.lang.Override
        public ProjectServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceBlockingStub(channel, callOptions);
        }
      };
    return ProjectServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceFutureStub>() {
        @java.lang.Override
        public ProjectServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceFutureStub(channel, callOptions);
        }
      };
    return ProjectServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getProject(proto.ProjectOuterClass.ProjectRequest request,
        io.grpc.stub.StreamObserver<proto.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectMethod(), responseObserver);
    }

    /**
     */
    default void addProject(proto.ProjectOuterClass.Project request,
        io.grpc.stub.StreamObserver<proto.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProjectMethod(), responseObserver);
    }

    /**
     */
    default void deleteProject(proto.ProjectOuterClass.ProjectRequest request,
        io.grpc.stub.StreamObserver<proto.ProjectOuterClass.deleteDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProjectMethod(), responseObserver);
    }

    /**
     */
    default void updateProject(proto.ProjectOuterClass.Project request,
        io.grpc.stub.StreamObserver<proto.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProjectService.
   */
  public static abstract class ProjectServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProjectServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProjectService.
   */
  public static final class ProjectServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProjectServiceStub> {
    private ProjectServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProject(proto.ProjectOuterClass.ProjectRequest request,
        io.grpc.stub.StreamObserver<proto.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProject(proto.ProjectOuterClass.Project request,
        io.grpc.stub.StreamObserver<proto.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProject(proto.ProjectOuterClass.ProjectRequest request,
        io.grpc.stub.StreamObserver<proto.ProjectOuterClass.deleteDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProject(proto.ProjectOuterClass.Project request,
        io.grpc.stub.StreamObserver<proto.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProjectService.
   */
  public static final class ProjectServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProjectServiceBlockingStub> {
    private ProjectServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.ProjectOuterClass.Project getProject(proto.ProjectOuterClass.ProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.ProjectOuterClass.Project addProject(proto.ProjectOuterClass.Project request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.ProjectOuterClass.deleteDataResponse deleteProject(proto.ProjectOuterClass.ProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.ProjectOuterClass.Project updateProject(proto.ProjectOuterClass.Project request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProjectMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProjectService.
   */
  public static final class ProjectServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProjectServiceFutureStub> {
    private ProjectServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ProjectOuterClass.Project> getProject(
        proto.ProjectOuterClass.ProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ProjectOuterClass.Project> addProject(
        proto.ProjectOuterClass.Project request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ProjectOuterClass.deleteDataResponse> deleteProject(
        proto.ProjectOuterClass.ProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ProjectOuterClass.Project> updateProject(
        proto.ProjectOuterClass.Project request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROJECT = 0;
  private static final int METHODID_ADD_PROJECT = 1;
  private static final int METHODID_DELETE_PROJECT = 2;
  private static final int METHODID_UPDATE_PROJECT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROJECT:
          serviceImpl.getProject((proto.ProjectOuterClass.ProjectRequest) request,
              (io.grpc.stub.StreamObserver<proto.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_ADD_PROJECT:
          serviceImpl.addProject((proto.ProjectOuterClass.Project) request,
              (io.grpc.stub.StreamObserver<proto.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_DELETE_PROJECT:
          serviceImpl.deleteProject((proto.ProjectOuterClass.ProjectRequest) request,
              (io.grpc.stub.StreamObserver<proto.ProjectOuterClass.deleteDataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT:
          serviceImpl.updateProject((proto.ProjectOuterClass.Project) request,
              (io.grpc.stub.StreamObserver<proto.ProjectOuterClass.Project>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.ProjectOuterClass.ProjectRequest,
              proto.ProjectOuterClass.Project>(
                service, METHODID_GET_PROJECT)))
        .addMethod(
          getAddProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.ProjectOuterClass.Project,
              proto.ProjectOuterClass.Project>(
                service, METHODID_ADD_PROJECT)))
        .addMethod(
          getDeleteProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.ProjectOuterClass.ProjectRequest,
              proto.ProjectOuterClass.deleteDataResponse>(
                service, METHODID_DELETE_PROJECT)))
        .addMethod(
          getUpdateProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.ProjectOuterClass.Project,
              proto.ProjectOuterClass.Project>(
                service, METHODID_UPDATE_PROJECT)))
        .build();
  }

  private static abstract class ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ProjectOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectService");
    }
  }

  private static final class ProjectServiceFileDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier {
    ProjectServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectServiceMethodDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProjectServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectServiceFileDescriptorSupplier())
              .addMethod(getGetProjectMethod())
              .addMethod(getAddProjectMethod())
              .addMethod(getDeleteProjectMethod())
              .addMethod(getUpdateProjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
