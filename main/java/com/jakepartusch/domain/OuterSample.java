// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/jakepartusch/domain/PersonProto.proto

package com.jakepartusch.domain;

public final class OuterSample {
  private OuterSample() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_PersonProto_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PersonProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)com/jakepartusch/domain/PersonProto.pr" +
      "oto\"2\n\013PersonProto\022\021\n\tfirstName\030\001 \001(\t\022\020\n" +
      "\010lastName\030\002 \001(\tB(\n\027com.jakepartusch.doma" +
      "inB\013OuterSampleP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_PersonProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PersonProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PersonProto_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}