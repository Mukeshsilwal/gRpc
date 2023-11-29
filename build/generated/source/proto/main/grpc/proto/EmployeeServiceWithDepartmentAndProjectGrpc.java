package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: Employee.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmployeeServiceWithDepartmentAndProjectGrpc {

  private EmployeeServiceWithDepartmentAndProjectGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.EmployeeServiceWithDepartmentAndProject";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject,
      proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject> getSetEmployeeAndDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setEmployeeAndDepartment",
      requestType = proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject.class,
      responseType = proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject,
      proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject> getSetEmployeeAndDepartmentMethod() {
    io.grpc.MethodDescriptor<proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject, proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject> getSetEmployeeAndDepartmentMethod;
    if ((getSetEmployeeAndDepartmentMethod = EmployeeServiceWithDepartmentAndProjectGrpc.getSetEmployeeAndDepartmentMethod) == null) {
      synchronized (EmployeeServiceWithDepartmentAndProjectGrpc.class) {
        if ((getSetEmployeeAndDepartmentMethod = EmployeeServiceWithDepartmentAndProjectGrpc.getSetEmployeeAndDepartmentMethod) == null) {
          EmployeeServiceWithDepartmentAndProjectGrpc.getSetEmployeeAndDepartmentMethod = getSetEmployeeAndDepartmentMethod =
              io.grpc.MethodDescriptor.<proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject, proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setEmployeeAndDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceWithDepartmentAndProjectMethodDescriptorSupplier("setEmployeeAndDepartment"))
              .build();
        }
      }
    }
    return getSetEmployeeAndDepartmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceWithDepartmentAndProjectStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceWithDepartmentAndProjectStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceWithDepartmentAndProjectStub>() {
        @java.lang.Override
        public EmployeeServiceWithDepartmentAndProjectStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceWithDepartmentAndProjectStub(channel, callOptions);
        }
      };
    return EmployeeServiceWithDepartmentAndProjectStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceWithDepartmentAndProjectBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceWithDepartmentAndProjectBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceWithDepartmentAndProjectBlockingStub>() {
        @java.lang.Override
        public EmployeeServiceWithDepartmentAndProjectBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceWithDepartmentAndProjectBlockingStub(channel, callOptions);
        }
      };
    return EmployeeServiceWithDepartmentAndProjectBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceWithDepartmentAndProjectFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceWithDepartmentAndProjectFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceWithDepartmentAndProjectFutureStub>() {
        @java.lang.Override
        public EmployeeServiceWithDepartmentAndProjectFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceWithDepartmentAndProjectFutureStub(channel, callOptions);
        }
      };
    return EmployeeServiceWithDepartmentAndProjectFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void setEmployeeAndDepartment(proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject request,
        io.grpc.stub.StreamObserver<proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetEmployeeAndDepartmentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmployeeServiceWithDepartmentAndProject.
   */
  public static abstract class EmployeeServiceWithDepartmentAndProjectImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmployeeServiceWithDepartmentAndProjectGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmployeeServiceWithDepartmentAndProject.
   */
  public static final class EmployeeServiceWithDepartmentAndProjectStub
      extends io.grpc.stub.AbstractAsyncStub<EmployeeServiceWithDepartmentAndProjectStub> {
    private EmployeeServiceWithDepartmentAndProjectStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceWithDepartmentAndProjectStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceWithDepartmentAndProjectStub(channel, callOptions);
    }

    /**
     */
    public void setEmployeeAndDepartment(proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject request,
        io.grpc.stub.StreamObserver<proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetEmployeeAndDepartmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmployeeServiceWithDepartmentAndProject.
   */
  public static final class EmployeeServiceWithDepartmentAndProjectBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmployeeServiceWithDepartmentAndProjectBlockingStub> {
    private EmployeeServiceWithDepartmentAndProjectBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceWithDepartmentAndProjectBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceWithDepartmentAndProjectBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject setEmployeeAndDepartment(proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetEmployeeAndDepartmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmployeeServiceWithDepartmentAndProject.
   */
  public static final class EmployeeServiceWithDepartmentAndProjectFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmployeeServiceWithDepartmentAndProjectFutureStub> {
    private EmployeeServiceWithDepartmentAndProjectFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceWithDepartmentAndProjectFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceWithDepartmentAndProjectFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject> setEmployeeAndDepartment(
        proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetEmployeeAndDepartmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_EMPLOYEE_AND_DEPARTMENT = 0;

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
        case METHODID_SET_EMPLOYEE_AND_DEPARTMENT:
          serviceImpl.setEmployeeAndDepartment((proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject) request,
              (io.grpc.stub.StreamObserver<proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject>) responseObserver);
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
          getSetEmployeeAndDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject,
              proto.EmployeeOuterClass.saveEmployeeWithDepartmentAndProject>(
                service, METHODID_SET_EMPLOYEE_AND_DEPARTMENT)))
        .build();
  }

  private static abstract class EmployeeServiceWithDepartmentAndProjectBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceWithDepartmentAndProjectBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeServiceWithDepartmentAndProject");
    }
  }

  private static final class EmployeeServiceWithDepartmentAndProjectFileDescriptorSupplier
      extends EmployeeServiceWithDepartmentAndProjectBaseDescriptorSupplier {
    EmployeeServiceWithDepartmentAndProjectFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceWithDepartmentAndProjectMethodDescriptorSupplier
      extends EmployeeServiceWithDepartmentAndProjectBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EmployeeServiceWithDepartmentAndProjectMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EmployeeServiceWithDepartmentAndProjectGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceWithDepartmentAndProjectFileDescriptorSupplier())
              .addMethod(getSetEmployeeAndDepartmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
