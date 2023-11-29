package employee;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: employee/Employee.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "employee.EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<employee.EmployeeOuterClass.EmployeeRequest,
      employee.EmployeeOuterClass.Employee> getGetEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployee",
      requestType = employee.EmployeeOuterClass.EmployeeRequest.class,
      responseType = employee.EmployeeOuterClass.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<employee.EmployeeOuterClass.EmployeeRequest,
      employee.EmployeeOuterClass.Employee> getGetEmployeeMethod() {
    io.grpc.MethodDescriptor<employee.EmployeeOuterClass.EmployeeRequest, employee.EmployeeOuterClass.Employee> getGetEmployeeMethod;
    if ((getGetEmployeeMethod = EmployeeServiceGrpc.getGetEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeeMethod = EmployeeServiceGrpc.getGetEmployeeMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeeMethod = getGetEmployeeMethod =
              io.grpc.MethodDescriptor.<employee.EmployeeOuterClass.EmployeeRequest, employee.EmployeeOuterClass.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.EmployeeOuterClass.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.EmployeeOuterClass.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployee"))
              .build();
        }
      }
    }
    return getGetEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<employee.EmployeeOuterClass.Employee,
      employee.EmployeeOuterClass.saveEmployeeResponse> getAddEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addEmployee",
      requestType = employee.EmployeeOuterClass.Employee.class,
      responseType = employee.EmployeeOuterClass.saveEmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<employee.EmployeeOuterClass.Employee,
      employee.EmployeeOuterClass.saveEmployeeResponse> getAddEmployeeMethod() {
    io.grpc.MethodDescriptor<employee.EmployeeOuterClass.Employee, employee.EmployeeOuterClass.saveEmployeeResponse> getAddEmployeeMethod;
    if ((getAddEmployeeMethod = EmployeeServiceGrpc.getAddEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getAddEmployeeMethod = EmployeeServiceGrpc.getAddEmployeeMethod) == null) {
          EmployeeServiceGrpc.getAddEmployeeMethod = getAddEmployeeMethod =
              io.grpc.MethodDescriptor.<employee.EmployeeOuterClass.Employee, employee.EmployeeOuterClass.saveEmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.EmployeeOuterClass.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.EmployeeOuterClass.saveEmployeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("addEmployee"))
              .build();
        }
      }
    }
    return getAddEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<employee.EmployeeOuterClass.EmployeeRequest,
      employee.EmployeeOuterClass.deleteEmployeeStatus> getDeleteEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEmployee",
      requestType = employee.EmployeeOuterClass.EmployeeRequest.class,
      responseType = employee.EmployeeOuterClass.deleteEmployeeStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<employee.EmployeeOuterClass.EmployeeRequest,
      employee.EmployeeOuterClass.deleteEmployeeStatus> getDeleteEmployeeMethod() {
    io.grpc.MethodDescriptor<employee.EmployeeOuterClass.EmployeeRequest, employee.EmployeeOuterClass.deleteEmployeeStatus> getDeleteEmployeeMethod;
    if ((getDeleteEmployeeMethod = EmployeeServiceGrpc.getDeleteEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getDeleteEmployeeMethod = EmployeeServiceGrpc.getDeleteEmployeeMethod) == null) {
          EmployeeServiceGrpc.getDeleteEmployeeMethod = getDeleteEmployeeMethod =
              io.grpc.MethodDescriptor.<employee.EmployeeOuterClass.EmployeeRequest, employee.EmployeeOuterClass.deleteEmployeeStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.EmployeeOuterClass.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.EmployeeOuterClass.deleteEmployeeStatus.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("deleteEmployee"))
              .build();
        }
      }
    }
    return getDeleteEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<employee.EmployeeOuterClass.Employee,
      employee.EmployeeOuterClass.Employee> getUpdateEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateEmployee",
      requestType = employee.EmployeeOuterClass.Employee.class,
      responseType = employee.EmployeeOuterClass.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<employee.EmployeeOuterClass.Employee,
      employee.EmployeeOuterClass.Employee> getUpdateEmployeeMethod() {
    io.grpc.MethodDescriptor<employee.EmployeeOuterClass.Employee, employee.EmployeeOuterClass.Employee> getUpdateEmployeeMethod;
    if ((getUpdateEmployeeMethod = EmployeeServiceGrpc.getUpdateEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getUpdateEmployeeMethod = EmployeeServiceGrpc.getUpdateEmployeeMethod) == null) {
          EmployeeServiceGrpc.getUpdateEmployeeMethod = getUpdateEmployeeMethod =
              io.grpc.MethodDescriptor.<employee.EmployeeOuterClass.Employee, employee.EmployeeOuterClass.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.EmployeeOuterClass.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.EmployeeOuterClass.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("updateEmployee"))
              .build();
        }
      }
    }
    return getUpdateEmployeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub>() {
        @java.lang.Override
        public EmployeeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceStub(channel, callOptions);
        }
      };
    return EmployeeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub>() {
        @java.lang.Override
        public EmployeeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceBlockingStub(channel, callOptions);
        }
      };
    return EmployeeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub>() {
        @java.lang.Override
        public EmployeeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceFutureStub(channel, callOptions);
        }
      };
    return EmployeeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getEmployee(employee.EmployeeOuterClass.EmployeeRequest request,
        io.grpc.stub.StreamObserver<employee.EmployeeOuterClass.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeMethod(), responseObserver);
    }

    /**
     */
    default void addEmployee(employee.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<employee.EmployeeOuterClass.saveEmployeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddEmployeeMethod(), responseObserver);
    }

    /**
     */
    default void deleteEmployee(employee.EmployeeOuterClass.EmployeeRequest request,
        io.grpc.stub.StreamObserver<employee.EmployeeOuterClass.deleteEmployeeStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmployeeMethod(), responseObserver);
    }

    /**
     */
    default void updateEmployee(employee.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<employee.EmployeeOuterClass.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmployeeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmployeeService.
   */
  public static abstract class EmployeeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmployeeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EmployeeServiceStub> {
    private EmployeeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEmployee(employee.EmployeeOuterClass.EmployeeRequest request,
        io.grpc.stub.StreamObserver<employee.EmployeeOuterClass.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addEmployee(employee.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<employee.EmployeeOuterClass.saveEmployeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEmployee(employee.EmployeeOuterClass.EmployeeRequest request,
        io.grpc.stub.StreamObserver<employee.EmployeeOuterClass.deleteEmployeeStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmployee(employee.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<employee.EmployeeOuterClass.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmployeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public employee.EmployeeOuterClass.Employee getEmployee(employee.EmployeeOuterClass.EmployeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public employee.EmployeeOuterClass.saveEmployeeResponse addEmployee(employee.EmployeeOuterClass.Employee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public employee.EmployeeOuterClass.deleteEmployeeStatus deleteEmployee(employee.EmployeeOuterClass.EmployeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public employee.EmployeeOuterClass.Employee updateEmployee(employee.EmployeeOuterClass.Employee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<employee.EmployeeOuterClass.Employee> getEmployee(
        employee.EmployeeOuterClass.EmployeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<employee.EmployeeOuterClass.saveEmployeeResponse> addEmployee(
        employee.EmployeeOuterClass.Employee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<employee.EmployeeOuterClass.deleteEmployeeStatus> deleteEmployee(
        employee.EmployeeOuterClass.EmployeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<employee.EmployeeOuterClass.Employee> updateEmployee(
        employee.EmployeeOuterClass.Employee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE = 0;
  private static final int METHODID_ADD_EMPLOYEE = 1;
  private static final int METHODID_DELETE_EMPLOYEE = 2;
  private static final int METHODID_UPDATE_EMPLOYEE = 3;

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
        case METHODID_GET_EMPLOYEE:
          serviceImpl.getEmployee((employee.EmployeeOuterClass.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<employee.EmployeeOuterClass.Employee>) responseObserver);
          break;
        case METHODID_ADD_EMPLOYEE:
          serviceImpl.addEmployee((employee.EmployeeOuterClass.Employee) request,
              (io.grpc.stub.StreamObserver<employee.EmployeeOuterClass.saveEmployeeResponse>) responseObserver);
          break;
        case METHODID_DELETE_EMPLOYEE:
          serviceImpl.deleteEmployee((employee.EmployeeOuterClass.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<employee.EmployeeOuterClass.deleteEmployeeStatus>) responseObserver);
          break;
        case METHODID_UPDATE_EMPLOYEE:
          serviceImpl.updateEmployee((employee.EmployeeOuterClass.Employee) request,
              (io.grpc.stub.StreamObserver<employee.EmployeeOuterClass.Employee>) responseObserver);
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
          getGetEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              employee.EmployeeOuterClass.EmployeeRequest,
              employee.EmployeeOuterClass.Employee>(
                service, METHODID_GET_EMPLOYEE)))
        .addMethod(
          getAddEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              employee.EmployeeOuterClass.Employee,
              employee.EmployeeOuterClass.saveEmployeeResponse>(
                service, METHODID_ADD_EMPLOYEE)))
        .addMethod(
          getDeleteEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              employee.EmployeeOuterClass.EmployeeRequest,
              employee.EmployeeOuterClass.deleteEmployeeStatus>(
                service, METHODID_DELETE_EMPLOYEE)))
        .addMethod(
          getUpdateEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              employee.EmployeeOuterClass.Employee,
              employee.EmployeeOuterClass.Employee>(
                service, METHODID_UPDATE_EMPLOYEE)))
        .build();
  }

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return employee.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EmployeeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getGetEmployeeMethod())
              .addMethod(getAddEmployeeMethod())
              .addMethod(getDeleteEmployeeMethod())
              .addMethod(getUpdateEmployeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
