package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: Department.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DepartmentServiceGrpc {

  private DepartmentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.DepartmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.DepartmentOuterClass.DepartmentRequest,
      proto.DepartmentOuterClass.DepartmentResponse> getGetDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDepartment",
      requestType = proto.DepartmentOuterClass.DepartmentRequest.class,
      responseType = proto.DepartmentOuterClass.DepartmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.DepartmentOuterClass.DepartmentRequest,
      proto.DepartmentOuterClass.DepartmentResponse> getGetDepartmentMethod() {
    io.grpc.MethodDescriptor<proto.DepartmentOuterClass.DepartmentRequest, proto.DepartmentOuterClass.DepartmentResponse> getGetDepartmentMethod;
    if ((getGetDepartmentMethod = DepartmentServiceGrpc.getGetDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getGetDepartmentMethod = DepartmentServiceGrpc.getGetDepartmentMethod) == null) {
          DepartmentServiceGrpc.getGetDepartmentMethod = getGetDepartmentMethod =
              io.grpc.MethodDescriptor.<proto.DepartmentOuterClass.DepartmentRequest, proto.DepartmentOuterClass.DepartmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DepartmentOuterClass.DepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DepartmentOuterClass.DepartmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("getDepartment"))
              .build();
        }
      }
    }
    return getGetDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.DepartmentOuterClass.Department,
      proto.DepartmentOuterClass.Department> getAddDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addDepartment",
      requestType = proto.DepartmentOuterClass.Department.class,
      responseType = proto.DepartmentOuterClass.Department.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.DepartmentOuterClass.Department,
      proto.DepartmentOuterClass.Department> getAddDepartmentMethod() {
    io.grpc.MethodDescriptor<proto.DepartmentOuterClass.Department, proto.DepartmentOuterClass.Department> getAddDepartmentMethod;
    if ((getAddDepartmentMethod = DepartmentServiceGrpc.getAddDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getAddDepartmentMethod = DepartmentServiceGrpc.getAddDepartmentMethod) == null) {
          DepartmentServiceGrpc.getAddDepartmentMethod = getAddDepartmentMethod =
              io.grpc.MethodDescriptor.<proto.DepartmentOuterClass.Department, proto.DepartmentOuterClass.Department>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DepartmentOuterClass.Department.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DepartmentOuterClass.Department.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("addDepartment"))
              .build();
        }
      }
    }
    return getAddDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.DepartmentOuterClass.DepartmentRequest,
      proto.DepartmentOuterClass.deleteDataStatus> getDeleteDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteDepartment",
      requestType = proto.DepartmentOuterClass.DepartmentRequest.class,
      responseType = proto.DepartmentOuterClass.deleteDataStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.DepartmentOuterClass.DepartmentRequest,
      proto.DepartmentOuterClass.deleteDataStatus> getDeleteDepartmentMethod() {
    io.grpc.MethodDescriptor<proto.DepartmentOuterClass.DepartmentRequest, proto.DepartmentOuterClass.deleteDataStatus> getDeleteDepartmentMethod;
    if ((getDeleteDepartmentMethod = DepartmentServiceGrpc.getDeleteDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getDeleteDepartmentMethod = DepartmentServiceGrpc.getDeleteDepartmentMethod) == null) {
          DepartmentServiceGrpc.getDeleteDepartmentMethod = getDeleteDepartmentMethod =
              io.grpc.MethodDescriptor.<proto.DepartmentOuterClass.DepartmentRequest, proto.DepartmentOuterClass.deleteDataStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DepartmentOuterClass.DepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DepartmentOuterClass.deleteDataStatus.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("deleteDepartment"))
              .build();
        }
      }
    }
    return getDeleteDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.DepartmentOuterClass.Department,
      proto.DepartmentOuterClass.DepartmentResponse> getUpdateDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateDepartment",
      requestType = proto.DepartmentOuterClass.Department.class,
      responseType = proto.DepartmentOuterClass.DepartmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.DepartmentOuterClass.Department,
      proto.DepartmentOuterClass.DepartmentResponse> getUpdateDepartmentMethod() {
    io.grpc.MethodDescriptor<proto.DepartmentOuterClass.Department, proto.DepartmentOuterClass.DepartmentResponse> getUpdateDepartmentMethod;
    if ((getUpdateDepartmentMethod = DepartmentServiceGrpc.getUpdateDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getUpdateDepartmentMethod = DepartmentServiceGrpc.getUpdateDepartmentMethod) == null) {
          DepartmentServiceGrpc.getUpdateDepartmentMethod = getUpdateDepartmentMethod =
              io.grpc.MethodDescriptor.<proto.DepartmentOuterClass.Department, proto.DepartmentOuterClass.DepartmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DepartmentOuterClass.Department.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DepartmentOuterClass.DepartmentResponse.getDefaultInstance()))
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
    default void getDepartment(proto.DepartmentOuterClass.DepartmentRequest request,
        io.grpc.stub.StreamObserver<proto.DepartmentOuterClass.DepartmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDepartmentMethod(), responseObserver);
    }

    /**
     */
    default void addDepartment(proto.DepartmentOuterClass.Department request,
        io.grpc.stub.StreamObserver<proto.DepartmentOuterClass.Department> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDepartmentMethod(), responseObserver);
    }

    /**
     */
    default void deleteDepartment(proto.DepartmentOuterClass.DepartmentRequest request,
        io.grpc.stub.StreamObserver<proto.DepartmentOuterClass.deleteDataStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDepartmentMethod(), responseObserver);
    }

    /**
     */
    default void updateDepartment(proto.DepartmentOuterClass.Department request,
        io.grpc.stub.StreamObserver<proto.DepartmentOuterClass.DepartmentResponse> responseObserver) {
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
    public void getDepartment(proto.DepartmentOuterClass.DepartmentRequest request,
        io.grpc.stub.StreamObserver<proto.DepartmentOuterClass.DepartmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addDepartment(proto.DepartmentOuterClass.Department request,
        io.grpc.stub.StreamObserver<proto.DepartmentOuterClass.Department> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDepartment(proto.DepartmentOuterClass.DepartmentRequest request,
        io.grpc.stub.StreamObserver<proto.DepartmentOuterClass.deleteDataStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDepartment(proto.DepartmentOuterClass.Department request,
        io.grpc.stub.StreamObserver<proto.DepartmentOuterClass.DepartmentResponse> responseObserver) {
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
    public proto.DepartmentOuterClass.DepartmentResponse getDepartment(proto.DepartmentOuterClass.DepartmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.DepartmentOuterClass.Department addDepartment(proto.DepartmentOuterClass.Department request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.DepartmentOuterClass.deleteDataStatus deleteDepartment(proto.DepartmentOuterClass.DepartmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.DepartmentOuterClass.DepartmentResponse updateDepartment(proto.DepartmentOuterClass.Department request) {
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
    public com.google.common.util.concurrent.ListenableFuture<proto.DepartmentOuterClass.DepartmentResponse> getDepartment(
        proto.DepartmentOuterClass.DepartmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.DepartmentOuterClass.Department> addDepartment(
        proto.DepartmentOuterClass.Department request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.DepartmentOuterClass.deleteDataStatus> deleteDepartment(
        proto.DepartmentOuterClass.DepartmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.DepartmentOuterClass.DepartmentResponse> updateDepartment(
        proto.DepartmentOuterClass.Department request) {
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
          serviceImpl.getDepartment((proto.DepartmentOuterClass.DepartmentRequest) request,
              (io.grpc.stub.StreamObserver<proto.DepartmentOuterClass.DepartmentResponse>) responseObserver);
          break;
        case METHODID_ADD_DEPARTMENT:
          serviceImpl.addDepartment((proto.DepartmentOuterClass.Department) request,
              (io.grpc.stub.StreamObserver<proto.DepartmentOuterClass.Department>) responseObserver);
          break;
        case METHODID_DELETE_DEPARTMENT:
          serviceImpl.deleteDepartment((proto.DepartmentOuterClass.DepartmentRequest) request,
              (io.grpc.stub.StreamObserver<proto.DepartmentOuterClass.deleteDataStatus>) responseObserver);
          break;
        case METHODID_UPDATE_DEPARTMENT:
          serviceImpl.updateDepartment((proto.DepartmentOuterClass.Department) request,
              (io.grpc.stub.StreamObserver<proto.DepartmentOuterClass.DepartmentResponse>) responseObserver);
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
              proto.DepartmentOuterClass.DepartmentRequest,
              proto.DepartmentOuterClass.DepartmentResponse>(
                service, METHODID_GET_DEPARTMENT)))
        .addMethod(
          getAddDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.DepartmentOuterClass.Department,
              proto.DepartmentOuterClass.Department>(
                service, METHODID_ADD_DEPARTMENT)))
        .addMethod(
          getDeleteDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.DepartmentOuterClass.DepartmentRequest,
              proto.DepartmentOuterClass.deleteDataStatus>(
                service, METHODID_DELETE_DEPARTMENT)))
        .addMethod(
          getUpdateDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.DepartmentOuterClass.Department,
              proto.DepartmentOuterClass.DepartmentResponse>(
                service, METHODID_UPDATE_DEPARTMENT)))
        .build();
  }

  private static abstract class DepartmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DepartmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.DepartmentOuterClass.getDescriptor();
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
