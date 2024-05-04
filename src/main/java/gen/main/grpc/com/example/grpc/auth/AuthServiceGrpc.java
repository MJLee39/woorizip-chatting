package com.example.grpc.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final String SERVICE_NAME = "auth.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.auth.AuthReq,
      com.example.grpc.auth.AuthResp> getAuthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Auth",
      requestType = com.example.grpc.auth.AuthReq.class,
      responseType = com.example.grpc.auth.AuthResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.auth.AuthReq,
      com.example.grpc.auth.AuthResp> getAuthMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.auth.AuthReq, com.example.grpc.auth.AuthResp> getAuthMethod;
    if ((getAuthMethod = AuthServiceGrpc.getAuthMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAuthMethod = AuthServiceGrpc.getAuthMethod) == null) {
          AuthServiceGrpc.getAuthMethod = getAuthMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.auth.AuthReq, com.example.grpc.auth.AuthResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Auth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.auth.AuthReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.auth.AuthResp.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("Auth"))
              .build();
        }
      }
    }
    return getAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.auth.AuthCheckReq,
      com.example.grpc.auth.AuthCheckResp> getAuthCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthCheck",
      requestType = com.example.grpc.auth.AuthCheckReq.class,
      responseType = com.example.grpc.auth.AuthCheckResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.auth.AuthCheckReq,
      com.example.grpc.auth.AuthCheckResp> getAuthCheckMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.auth.AuthCheckReq, com.example.grpc.auth.AuthCheckResp> getAuthCheckMethod;
    if ((getAuthCheckMethod = AuthServiceGrpc.getAuthCheckMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAuthCheckMethod = AuthServiceGrpc.getAuthCheckMethod) == null) {
          AuthServiceGrpc.getAuthCheckMethod = getAuthCheckMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.auth.AuthCheckReq, com.example.grpc.auth.AuthCheckResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.auth.AuthCheckReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.auth.AuthCheckResp.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("AuthCheck"))
              .build();
        }
      }
    }
    return getAuthCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.auth.AuthRefreshReq,
      com.example.grpc.auth.AuthRefreshResp> getAuthRefreshMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthRefresh",
      requestType = com.example.grpc.auth.AuthRefreshReq.class,
      responseType = com.example.grpc.auth.AuthRefreshResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.auth.AuthRefreshReq,
      com.example.grpc.auth.AuthRefreshResp> getAuthRefreshMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.auth.AuthRefreshReq, com.example.grpc.auth.AuthRefreshResp> getAuthRefreshMethod;
    if ((getAuthRefreshMethod = AuthServiceGrpc.getAuthRefreshMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAuthRefreshMethod = AuthServiceGrpc.getAuthRefreshMethod) == null) {
          AuthServiceGrpc.getAuthRefreshMethod = getAuthRefreshMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.auth.AuthRefreshReq, com.example.grpc.auth.AuthRefreshResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthRefresh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.auth.AuthRefreshReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.auth.AuthRefreshResp.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("AuthRefresh"))
              .build();
        }
      }
    }
    return getAuthRefreshMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.auth.AuthLogoutReq,
      com.example.grpc.auth.AuthLogoutResp> getAuthLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthLogout",
      requestType = com.example.grpc.auth.AuthLogoutReq.class,
      responseType = com.example.grpc.auth.AuthLogoutResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.auth.AuthLogoutReq,
      com.example.grpc.auth.AuthLogoutResp> getAuthLogoutMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.auth.AuthLogoutReq, com.example.grpc.auth.AuthLogoutResp> getAuthLogoutMethod;
    if ((getAuthLogoutMethod = AuthServiceGrpc.getAuthLogoutMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAuthLogoutMethod = AuthServiceGrpc.getAuthLogoutMethod) == null) {
          AuthServiceGrpc.getAuthLogoutMethod = getAuthLogoutMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.auth.AuthLogoutReq, com.example.grpc.auth.AuthLogoutResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthLogout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.auth.AuthLogoutReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.auth.AuthLogoutResp.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("AuthLogout"))
              .build();
        }
      }
    }
    return getAuthLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void auth(com.example.grpc.auth.AuthReq request,
        io.grpc.stub.StreamObserver<com.example.grpc.auth.AuthResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthMethod(), responseObserver);
    }

    /**
     */
    public void authCheck(com.example.grpc.auth.AuthCheckReq request,
        io.grpc.stub.StreamObserver<com.example.grpc.auth.AuthCheckResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthCheckMethod(), responseObserver);
    }

    /**
     */
    public void authRefresh(com.example.grpc.auth.AuthRefreshReq request,
        io.grpc.stub.StreamObserver<com.example.grpc.auth.AuthRefreshResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthRefreshMethod(), responseObserver);
    }

    /**
     */
    public void authLogout(com.example.grpc.auth.AuthLogoutReq request,
        io.grpc.stub.StreamObserver<com.example.grpc.auth.AuthLogoutResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.auth.AuthReq,
                com.example.grpc.auth.AuthResp>(
                  this, METHODID_AUTH)))
          .addMethod(
            getAuthCheckMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.auth.AuthCheckReq,
                com.example.grpc.auth.AuthCheckResp>(
                  this, METHODID_AUTH_CHECK)))
          .addMethod(
            getAuthRefreshMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.auth.AuthRefreshReq,
                com.example.grpc.auth.AuthRefreshResp>(
                  this, METHODID_AUTH_REFRESH)))
          .addMethod(
            getAuthLogoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.auth.AuthLogoutReq,
                com.example.grpc.auth.AuthLogoutResp>(
                  this, METHODID_AUTH_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class AuthServiceStub extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void auth(com.example.grpc.auth.AuthReq request,
        io.grpc.stub.StreamObserver<com.example.grpc.auth.AuthResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authCheck(com.example.grpc.auth.AuthCheckReq request,
        io.grpc.stub.StreamObserver<com.example.grpc.auth.AuthCheckResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authRefresh(com.example.grpc.auth.AuthRefreshReq request,
        io.grpc.stub.StreamObserver<com.example.grpc.auth.AuthRefreshResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthRefreshMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authLogout(com.example.grpc.auth.AuthLogoutReq request,
        io.grpc.stub.StreamObserver<com.example.grpc.auth.AuthLogoutResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.auth.AuthResp auth(com.example.grpc.auth.AuthReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.auth.AuthCheckResp authCheck(com.example.grpc.auth.AuthCheckReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.auth.AuthRefreshResp authRefresh(com.example.grpc.auth.AuthRefreshReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthRefreshMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.auth.AuthLogoutResp authLogout(com.example.grpc.auth.AuthLogoutReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.auth.AuthResp> auth(
        com.example.grpc.auth.AuthReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.auth.AuthCheckResp> authCheck(
        com.example.grpc.auth.AuthCheckReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.auth.AuthRefreshResp> authRefresh(
        com.example.grpc.auth.AuthRefreshReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthRefreshMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.auth.AuthLogoutResp> authLogout(
        com.example.grpc.auth.AuthLogoutReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTH = 0;
  private static final int METHODID_AUTH_CHECK = 1;
  private static final int METHODID_AUTH_REFRESH = 2;
  private static final int METHODID_AUTH_LOGOUT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTH:
          serviceImpl.auth((com.example.grpc.auth.AuthReq) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.auth.AuthResp>) responseObserver);
          break;
        case METHODID_AUTH_CHECK:
          serviceImpl.authCheck((com.example.grpc.auth.AuthCheckReq) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.auth.AuthCheckResp>) responseObserver);
          break;
        case METHODID_AUTH_REFRESH:
          serviceImpl.authRefresh((com.example.grpc.auth.AuthRefreshReq) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.auth.AuthRefreshResp>) responseObserver);
          break;
        case METHODID_AUTH_LOGOUT:
          serviceImpl.authLogout((com.example.grpc.auth.AuthLogoutReq) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.auth.AuthLogoutResp>) responseObserver);
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

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.auth.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getAuthMethod())
              .addMethod(getAuthCheckMethod())
              .addMethod(getAuthRefreshMethod())
              .addMethod(getAuthLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
