package department;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: department/Department.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DepartmentServiceGrpc {

  private DepartmentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "department.DepartmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<department.DepartmentOuterClass.DepartmentRequest,
      department.DepartmentOuterClass.Department> getGetDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDepartment",
      requestType = department.DepartmentOuterClass.DepartmentRequest.class,
      responseType = department.DepartmentOuterClass.Department.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<department.DepartmentOuterClass.DepartmentRequest,
      department.DepartmentOuterClass.Department> getGetDepartmentMethod() {
    io.grpc.MethodDescriptor<department.DepartmentOuterClass.DepartmentRequest, department.DepartmentOuterClass.Department> getGetDepartmentMethod;
    if ((getGetDepartmentMethod = DepartmentServiceGrpc.getGetDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getGetDepartmentMethod = DepartmentServiceGrpc.getGetDepartmentMethod) == null) {
          DepartmentServiceGrpc.getGetDepartmentMethod = getGetDepartmentMethod =
              io.grpc.MethodDescriptor.<department.DepartmentOuterClass.DepartmentRequest, department.DepartmentOuterClass.Department>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  department.DepartmentOuterClass.DepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  department.DepartmentOuterClass.Department.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("getDepartment"))
              .build();
        }
      }
    }
    return getGetDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<department.DepartmentOuterClass.Department,
      department.DepartmentOuterClass.saveDataStatus> getAddDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addDepartment",
      requestType = department.DepartmentOuterClass.Department.class,
      responseType = department.DepartmentOuterClass.saveDataStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<department.DepartmentOuterClass.Department,
      department.DepartmentOuterClass.saveDataStatus> getAddDepartmentMethod() {
    io.grpc.MethodDescriptor<department.DepartmentOuterClass.Department, department.DepartmentOuterClass.saveDataStatus> getAddDepartmentMethod;
    if ((getAddDepartmentMethod = DepartmentServiceGrpc.getAddDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getAddDepartmentMethod = DepartmentServiceGrpc.getAddDepartmentMethod) == null) {
          DepartmentServiceGrpc.getAddDepartmentMethod = getAddDepartmentMethod =
              io.grpc.MethodDescriptor.<department.DepartmentOuterClass.Department, department.DepartmentOuterClass.saveDataStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  department.DepartmentOuterClass.Department.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  department.DepartmentOuterClass.saveDataStatus.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("addDepartment"))
              .build();
        }
      }
    }
    return getAddDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<department.DepartmentOuterClass.DepartmentRequest,
      department.DepartmentOuterClass.deleteDataStatus> getDeleteDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteDepartment",
      requestType = department.DepartmentOuterClass.DepartmentRequest.class,
      responseType = department.DepartmentOuterClass.deleteDataStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<department.DepartmentOuterClass.DepartmentRequest,
      department.DepartmentOuterClass.deleteDataStatus> getDeleteDepartmentMethod() {
    io.grpc.MethodDescriptor<department.DepartmentOuterClass.DepartmentRequest, department.DepartmentOuterClass.deleteDataStatus> getDeleteDepartmentMethod;
    if ((getDeleteDepartmentMethod = DepartmentServiceGrpc.getDeleteDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getDeleteDepartmentMethod = DepartmentServiceGrpc.getDeleteDepartmentMethod) == null) {
          DepartmentServiceGrpc.getDeleteDepartmentMethod = getDeleteDepartmentMethod =
              io.grpc.MethodDescriptor.<department.DepartmentOuterClass.DepartmentRequest, department.DepartmentOuterClass.deleteDataStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  department.DepartmentOuterClass.DepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  department.DepartmentOuterClass.deleteDataStatus.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("deleteDepartment"))
              .build();
        }
      }
    }
    return getDeleteDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<department.DepartmentOuterClass.Department,
      department.DepartmentOuterClass.Department> getUpdateDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateDepartment",
      requestType = department.DepartmentOuterClass.Department.class,
      responseType = department.DepartmentOuterClass.Department.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<department.DepartmentOuterClass.Department,
      department.DepartmentOuterClass.Department> getUpdateDepartmentMethod() {
    io.grpc.MethodDescriptor<department.DepartmentOuterClass.Department, department.DepartmentOuterClass.Department> getUpdateDepartmentMethod;
    if ((getUpdateDepartmentMethod = DepartmentServiceGrpc.getUpdateDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getUpdateDepartmentMethod = DepartmentServiceGrpc.getUpdateDepartmentMethod) == null) {
          DepartmentServiceGrpc.getUpdateDepartmentMethod = getUpdateDepartmentMethod =
              io.grpc.MethodDescriptor.<department.DepartmentOuterClass.Department, department.DepartmentOuterClass.Department>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  department.DepartmentOuterClass.Department.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  department.DepartmentOuterClass.Department.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("updateDepartment"))
              .build();
        }
      }
    }
    return getUpdateDepartmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DepartmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceStub>() {
        @java.lang.Override
        public DepartmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepartmentServiceStub(channel, callOptions);
        }
      };
    return DepartmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DepartmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceBlockingStub>() {
        @java.lang.Override
        public DepartmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepartmentServiceBlockingStub(channel, callOptions);
        }
      };
    return DepartmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DepartmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceFutureStub>() {
        @java.lang.Override
        public DepartmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepartmentServiceFutureStub(channel, callOptions);
        }
      };
    return DepartmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getDepartment(department.DepartmentOuterClass.DepartmentRequest request,
        io.grpc.stub.StreamObserver<department.DepartmentOuterClass.Department> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDepartmentMethod(), responseObserver);
    }

    /**
     */
    default void addDepartment(department.DepartmentOuterClass.Department request,
        io.grpc.stub.StreamObserver<department.DepartmentOuterClass.saveDataStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDepartmentMethod(), responseObserver);
    }

    /**
     */
    default void deleteDepartment(department.DepartmentOuterClass.DepartmentRequest request,
        io.grpc.stub.StreamObserver<department.DepartmentOuterClass.deleteDataStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDepartmentMethod(), responseObserver);
    }

    /**
     */
    default void updateDepartment(department.DepartmentOuterClass.Department request,
        io.grpc.stub.StreamObserver<department.DepartmentOuterClass.Department> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDepartmentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DepartmentService.
   */
  public static abstract class DepartmentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DepartmentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DepartmentService.
   */
  public static final class DepartmentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DepartmentServiceStub> {
    private DepartmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepartmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDepartment(department.DepartmentOuterClass.DepartmentRequest request,
        io.grpc.stub.StreamObserver<department.DepartmentOuterClass.Department> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addDepartment(department.DepartmentOuterClass.Department request,
        io.grpc.stub.StreamObserver<department.DepartmentOuterClass.saveDataStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDepartment(department.DepartmentOuterClass.DepartmentRequest request,
        io.grpc.stub.StreamObserver<department.DepartmentOuterClass.deleteDataStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDepartment(department.DepartmentOuterClass.Department request,
        io.grpc.stub.StreamObserver<department.DepartmentOuterClass.Department> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDepartmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DepartmentService.
   */
  public static final class DepartmentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DepartmentServiceBlockingStub> {
    private DepartmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepartmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public department.DepartmentOuterClass.Department getDepartment(department.DepartmentOuterClass.DepartmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public department.DepartmentOuterClass.saveDataStatus addDepartment(department.DepartmentOuterClass.Department request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public department.DepartmentOuterClass.deleteDataStatus deleteDepartment(department.DepartmentOuterClass.DepartmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public department.DepartmentOuterClass.Department updateDepartment(department.DepartmentOuterClass.Department request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDepartmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DepartmentService.
   */
  public static final class DepartmentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DepartmentServiceFutureStub> {
    private DepartmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepartmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<department.DepartmentOuterClass.Department> getDepartment(
        department.DepartmentOuterClass.DepartmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<department.DepartmentOuterClass.saveDataStatus> addDepartment(
        department.DepartmentOuterClass.Department request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<department.DepartmentOuterClass.deleteDataStatus> deleteDepartment(
        department.DepartmentOuterClass.DepartmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<department.DepartmentOuterClass.Department> updateDepartment(
        department.DepartmentOuterClass.Department request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDepartmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEPARTMENT = 0;
  private static final int METHODID_ADD_DEPARTMENT = 1;
  private static final int METHODID_DELETE_DEPARTMENT = 2;
  private static final int METHODID_UPDATE_DEPARTMENT = 3;

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
        case METHODID_GET_DEPARTMENT:
          serviceImpl.getDepartment((department.DepartmentOuterClass.DepartmentRequest) request,
              (io.grpc.stub.StreamObserver<department.DepartmentOuterClass.Department>) responseObserver);
          break;
        case METHODID_ADD_DEPARTMENT:
          serviceImpl.addDepartment((department.DepartmentOuterClass.Department) request,
              (io.grpc.stub.StreamObserver<department.DepartmentOuterClass.saveDataStatus>) responseObserver);
          break;
        case METHODID_DELETE_DEPARTMENT:
          serviceImpl.deleteDepartment((department.DepartmentOuterClass.DepartmentRequest) request,
              (io.grpc.stub.StreamObserver<department.DepartmentOuterClass.deleteDataStatus>) responseObserver);
          break;
        case METHODID_UPDATE_DEPARTMENT:
          serviceImpl.updateDepartment((department.DepartmentOuterClass.Department) request,
              (io.grpc.stub.StreamObserver<department.DepartmentOuterClass.Department>) responseObserver);
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
          getGetDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              department.DepartmentOuterClass.DepartmentRequest,
              department.DepartmentOuterClass.Department>(
                service, METHODID_GET_DEPARTMENT)))
        .addMethod(
          getAddDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              department.DepartmentOuterClass.Department,
              department.DepartmentOuterClass.saveDataStatus>(
                service, METHODID_ADD_DEPARTMENT)))
        .addMethod(
          getDeleteDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              department.DepartmentOuterClass.DepartmentRequest,
              department.DepartmentOuterClass.deleteDataStatus>(
                service, METHODID_DELETE_DEPARTMENT)))
        .addMethod(
          getUpdateDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              department.DepartmentOuterClass.Department,
              department.DepartmentOuterClass.Department>(
                service, METHODID_UPDATE_DEPARTMENT)))
        .build();
  }

  private static abstract class DepartmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DepartmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return department.DepartmentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DepartmentService");
    }
  }

  private static final class DepartmentServiceFileDescriptorSupplier
      extends DepartmentServiceBaseDescriptorSupplier {
    DepartmentServiceFileDescriptorSupplier() {}
  }

  private static final class DepartmentServiceMethodDescriptorSupplier
      extends DepartmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DepartmentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DepartmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DepartmentServiceFileDescriptorSupplier())
              .addMethod(getGetDepartmentMethod())
              .addMethod(getAddDepartmentMethod())
              .addMethod(getDeleteDepartmentMethod())
              .addMethod(getUpdateDepartmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
