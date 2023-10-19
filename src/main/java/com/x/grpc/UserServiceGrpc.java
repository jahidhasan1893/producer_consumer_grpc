package com.x.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.x.grpc.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.x.grpc.User.RegisterRequest,
      com.x.grpc.User.RegisterResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = com.x.grpc.User.RegisterRequest.class,
      responseType = com.x.grpc.User.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.x.grpc.User.RegisterRequest,
      com.x.grpc.User.RegisterResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.x.grpc.User.RegisterRequest, com.x.grpc.User.RegisterResponse> getRegisterMethod;
    if ((getRegisterMethod = UserServiceGrpc.getRegisterMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegisterMethod = UserServiceGrpc.getRegisterMethod) == null) {
          UserServiceGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<com.x.grpc.User.RegisterRequest, com.x.grpc.User.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.x.grpc.UserService", "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.x.grpc.User.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.x.grpc.User.RegisterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.x.grpc.User.LoginRequest,
      com.x.grpc.User.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = com.x.grpc.User.LoginRequest.class,
      responseType = com.x.grpc.User.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.x.grpc.User.LoginRequest,
      com.x.grpc.User.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.x.grpc.User.LoginRequest, com.x.grpc.User.LoginResponse> getLoginMethod;
    if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
          UserServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.x.grpc.User.LoginRequest, com.x.grpc.User.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.x.grpc.UserService", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.x.grpc.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.x.grpc.User.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.x.grpc.User.SetProfileRequest,
      com.x.grpc.User.SetProfileResponse> getSetProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetProfile",
      requestType = com.x.grpc.User.SetProfileRequest.class,
      responseType = com.x.grpc.User.SetProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.x.grpc.User.SetProfileRequest,
      com.x.grpc.User.SetProfileResponse> getSetProfileMethod() {
    io.grpc.MethodDescriptor<com.x.grpc.User.SetProfileRequest, com.x.grpc.User.SetProfileResponse> getSetProfileMethod;
    if ((getSetProfileMethod = UserServiceGrpc.getSetProfileMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSetProfileMethod = UserServiceGrpc.getSetProfileMethod) == null) {
          UserServiceGrpc.getSetProfileMethod = getSetProfileMethod = 
              io.grpc.MethodDescriptor.<com.x.grpc.User.SetProfileRequest, com.x.grpc.User.SetProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.x.grpc.UserService", "SetProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.x.grpc.User.SetProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.x.grpc.User.SetProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SetProfile"))
                  .build();
          }
        }
     }
     return getSetProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.x.grpc.User.ViewProfileRequest,
      com.x.grpc.User.ViewProfileResponse> getViewProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProfile",
      requestType = com.x.grpc.User.ViewProfileRequest.class,
      responseType = com.x.grpc.User.ViewProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.x.grpc.User.ViewProfileRequest,
      com.x.grpc.User.ViewProfileResponse> getViewProfileMethod() {
    io.grpc.MethodDescriptor<com.x.grpc.User.ViewProfileRequest, com.x.grpc.User.ViewProfileResponse> getViewProfileMethod;
    if ((getViewProfileMethod = UserServiceGrpc.getViewProfileMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getViewProfileMethod = UserServiceGrpc.getViewProfileMethod) == null) {
          UserServiceGrpc.getViewProfileMethod = getViewProfileMethod = 
              io.grpc.MethodDescriptor.<com.x.grpc.User.ViewProfileRequest, com.x.grpc.User.ViewProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.x.grpc.UserService", "ViewProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.x.grpc.User.ViewProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.x.grpc.User.ViewProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ViewProfile"))
                  .build();
          }
        }
     }
     return getViewProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.x.grpc.User.UpdateProfileRequest,
      com.x.grpc.User.UpdateProfileResponse> getUpdateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProfile",
      requestType = com.x.grpc.User.UpdateProfileRequest.class,
      responseType = com.x.grpc.User.UpdateProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.x.grpc.User.UpdateProfileRequest,
      com.x.grpc.User.UpdateProfileResponse> getUpdateProfileMethod() {
    io.grpc.MethodDescriptor<com.x.grpc.User.UpdateProfileRequest, com.x.grpc.User.UpdateProfileResponse> getUpdateProfileMethod;
    if ((getUpdateProfileMethod = UserServiceGrpc.getUpdateProfileMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateProfileMethod = UserServiceGrpc.getUpdateProfileMethod) == null) {
          UserServiceGrpc.getUpdateProfileMethod = getUpdateProfileMethod = 
              io.grpc.MethodDescriptor.<com.x.grpc.User.UpdateProfileRequest, com.x.grpc.User.UpdateProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.x.grpc.UserService", "UpdateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.x.grpc.User.UpdateProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.x.grpc.User.UpdateProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateProfile"))
                  .build();
          }
        }
     }
     return getUpdateProfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(com.x.grpc.User.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.x.grpc.User.RegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void login(com.x.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.x.grpc.User.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void setProfile(com.x.grpc.User.SetProfileRequest request,
        io.grpc.stub.StreamObserver<com.x.grpc.User.SetProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetProfileMethod(), responseObserver);
    }

    /**
     */
    public void viewProfile(com.x.grpc.User.ViewProfileRequest request,
        io.grpc.stub.StreamObserver<com.x.grpc.User.ViewProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getViewProfileMethod(), responseObserver);
    }

    /**
     */
    public void updateProfile(com.x.grpc.User.UpdateProfileRequest request,
        io.grpc.stub.StreamObserver<com.x.grpc.User.UpdateProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProfileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.x.grpc.User.RegisterRequest,
                com.x.grpc.User.RegisterResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.x.grpc.User.LoginRequest,
                com.x.grpc.User.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getSetProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.x.grpc.User.SetProfileRequest,
                com.x.grpc.User.SetProfileResponse>(
                  this, METHODID_SET_PROFILE)))
          .addMethod(
            getViewProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.x.grpc.User.ViewProfileRequest,
                com.x.grpc.User.ViewProfileResponse>(
                  this, METHODID_VIEW_PROFILE)))
          .addMethod(
            getUpdateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.x.grpc.User.UpdateProfileRequest,
                com.x.grpc.User.UpdateProfileResponse>(
                  this, METHODID_UPDATE_PROFILE)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void register(com.x.grpc.User.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.x.grpc.User.RegisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(com.x.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.x.grpc.User.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setProfile(com.x.grpc.User.SetProfileRequest request,
        io.grpc.stub.StreamObserver<com.x.grpc.User.SetProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewProfile(com.x.grpc.User.ViewProfileRequest request,
        io.grpc.stub.StreamObserver<com.x.grpc.User.ViewProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProfile(com.x.grpc.User.UpdateProfileRequest request,
        io.grpc.stub.StreamObserver<com.x.grpc.User.UpdateProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.x.grpc.User.RegisterResponse register(com.x.grpc.User.RegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.x.grpc.User.LoginResponse login(com.x.grpc.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.x.grpc.User.SetProfileResponse setProfile(com.x.grpc.User.SetProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.x.grpc.User.ViewProfileResponse viewProfile(com.x.grpc.User.ViewProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getViewProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.x.grpc.User.UpdateProfileResponse updateProfile(com.x.grpc.User.UpdateProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.x.grpc.User.RegisterResponse> register(
        com.x.grpc.User.RegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.x.grpc.User.LoginResponse> login(
        com.x.grpc.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.x.grpc.User.SetProfileResponse> setProfile(
        com.x.grpc.User.SetProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.x.grpc.User.ViewProfileResponse> viewProfile(
        com.x.grpc.User.ViewProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getViewProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.x.grpc.User.UpdateProfileResponse> updateProfile(
        com.x.grpc.User.UpdateProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_SET_PROFILE = 2;
  private static final int METHODID_VIEW_PROFILE = 3;
  private static final int METHODID_UPDATE_PROFILE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.x.grpc.User.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.x.grpc.User.RegisterResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.x.grpc.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.x.grpc.User.LoginResponse>) responseObserver);
          break;
        case METHODID_SET_PROFILE:
          serviceImpl.setProfile((com.x.grpc.User.SetProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.x.grpc.User.SetProfileResponse>) responseObserver);
          break;
        case METHODID_VIEW_PROFILE:
          serviceImpl.viewProfile((com.x.grpc.User.ViewProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.x.grpc.User.ViewProfileResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROFILE:
          serviceImpl.updateProfile((com.x.grpc.User.UpdateProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.x.grpc.User.UpdateProfileResponse>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.x.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getLoginMethod())
              .addMethod(getSetProfileMethod())
              .addMethod(getViewProfileMethod())
              .addMethod(getUpdateProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
