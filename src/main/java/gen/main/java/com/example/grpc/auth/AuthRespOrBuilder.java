// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.example.grpc.auth;

public interface AuthRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:auth.AuthResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string access_token = 1;</code>
   * @return The accessToken.
   */
  java.lang.String getAccessToken();
  /**
   * <code>string access_token = 1;</code>
   * @return The bytes for accessToken.
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();

  /**
   * <code>string refresh_token = 2;</code>
   * @return The refreshToken.
   */
  java.lang.String getRefreshToken();
  /**
   * <code>string refresh_token = 2;</code>
   * @return The bytes for refreshToken.
   */
  com.google.protobuf.ByteString
      getRefreshTokenBytes();

  /**
   * <code>string error = 3;</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 3;</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
