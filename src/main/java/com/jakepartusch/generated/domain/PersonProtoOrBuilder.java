// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/jakepartusch/domain/PersonProto.proto

package com.jakepartusch.generated.domain;

public interface PersonProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PersonProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string firstName = 1;</code>
   */
  java.lang.String getFirstName();
  /**
   * <code>string firstName = 1;</code>
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string lastName = 2;</code>
   */
  java.lang.String getLastName();
  /**
   * <code>string lastName = 2;</code>
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string emailAddress = 3;</code>
   */
  java.lang.String getEmailAddress();
  /**
   * <code>string emailAddress = 3;</code>
   */
  com.google.protobuf.ByteString
      getEmailAddressBytes();

  /**
   * <code>string homeAddress = 4;</code>
   */
  java.lang.String getHomeAddress();
  /**
   * <code>string homeAddress = 4;</code>
   */
  com.google.protobuf.ByteString
      getHomeAddressBytes();

  /**
   * <code>repeated .PersonProto.PhoneNumber phoneNumbers = 5;</code>
   */
  java.util.List<com.jakepartusch.generated.domain.PersonProto.PhoneNumber> 
      getPhoneNumbersList();
  /**
   * <code>repeated .PersonProto.PhoneNumber phoneNumbers = 5;</code>
   */
  com.jakepartusch.generated.domain.PersonProto.PhoneNumber getPhoneNumbers(int index);
  /**
   * <code>repeated .PersonProto.PhoneNumber phoneNumbers = 5;</code>
   */
  int getPhoneNumbersCount();
  /**
   * <code>repeated .PersonProto.PhoneNumber phoneNumbers = 5;</code>
   */
  java.util.List<? extends com.jakepartusch.generated.domain.PersonProto.PhoneNumberOrBuilder> 
      getPhoneNumbersOrBuilderList();
  /**
   * <code>repeated .PersonProto.PhoneNumber phoneNumbers = 5;</code>
   */
  com.jakepartusch.generated.domain.PersonProto.PhoneNumberOrBuilder getPhoneNumbersOrBuilder(
      int index);
}
