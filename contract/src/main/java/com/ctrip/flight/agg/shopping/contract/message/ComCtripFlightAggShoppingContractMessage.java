// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.message.proto

package com.ctrip.flight.agg.shopping.contract.message;

public final class ComCtripFlightAggShoppingContractMessage {
  private ComCtripFlightAggShoppingContractMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_message_ErrorResultType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_message_ErrorResultType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_message_DetailErrorType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_message_DetailErrorType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_message_RequestHeaderType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_message_RequestHeaderType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_message_ResponseHeaderType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_message_ResponseHeaderType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_message_MessageHeaderType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_message_MessageHeaderType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4com.ctrip.flight.agg.shopping.contract" +
      ".message.proto\022.com.ctrip.flight.agg.sho" +
      "pping.contract.message\"\215\001\n\017ErrorResultTy" +
      "pe\022\021\n\tErrorCode\030\001 \001(\005\022\021\n\tErrorDesc\030\002 \001(\t" +
      "\022T\n\013DetailError\030\003 \003(\0132?.com.ctrip.flight" +
      ".agg.shopping.contract.message.DetailErr" +
      "orType\"0\n\017DetailErrorType\022\014\n\004Code\030\001 \001(\005\022" +
      "\017\n\007Message\030\002 \001(\t\"\226\001\n\021RequestHeaderType\022X" +
      "\n\rMessageHeader\030\001 \001(\0132A.com.ctrip.flight" +
      ".agg.shopping.contract.message.MessageHe" +
      "aderType\022\024\n\014LoggingLevel\030\002 \001(\005\022\021\n\tDiagIn" +
      "put\030\003 \001(\t\"\250\001\n\022ResponseHeaderType\022X\n\rMess" +
      "ageHeader\030\001 \001(\0132A.com.ctrip.flight.agg.s" +
      "hopping.contract.message.MessageHeaderTy" +
      "pe\022\020\n\010ServerIP\030\002 \001(\t\022\022\n\nReturnCode\030\003 \001(\005" +
      "\022\022\n\nDiagOutput\030\004 \001(\t\"\277\002\n\021MessageHeaderTy" +
      "pe\022\017\n\007Channel\030\001 \001(\t\022\024\n\014SubChannelID\030\002 \001(" +
      "\005\022\025\n\rTransactionID\030\003 \001(\t\022\021\n\tRequestID\030\004 " +
      "\001(\t\022\020\n\010ClientIP\030\005 \001(\t\022\020\n\010DeviceID\030\006 \001(\t\022" +
      "\026\n\016DevicePlatform\030\007 \001(\t\022\021\n\tSessionID\030\010 \001" +
      "(\t\022\025\n\rClientVersion\030\t \001(\t\022\022\n\nDeviceType\030" +
      "\n \001(\t\022\024\n\014PlatformType\030\013 \001(\t\022\035\n\025DevicePla" +
      "tformVersion\030\014 \001(\t\022\020\n\010ClientID\030\r \001(\t\022\013\n\003" +
      "AID\030\017 \001(\t\022\013\n\003SID\030\020 \001(\tB2\n.com.ctrip.flig" +
      "ht.agg.shopping.contract.messageP\001b\006prot" +
      "o3"
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
    internal_static_com_ctrip_flight_agg_shopping_contract_message_ErrorResultType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ctrip_flight_agg_shopping_contract_message_ErrorResultType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_message_ErrorResultType_descriptor,
        new java.lang.String[] { "ErrorCode", "ErrorDesc", "DetailError", });
    internal_static_com_ctrip_flight_agg_shopping_contract_message_DetailErrorType_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ctrip_flight_agg_shopping_contract_message_DetailErrorType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_message_DetailErrorType_descriptor,
        new java.lang.String[] { "Code", "Message", });
    internal_static_com_ctrip_flight_agg_shopping_contract_message_RequestHeaderType_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_ctrip_flight_agg_shopping_contract_message_RequestHeaderType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_message_RequestHeaderType_descriptor,
        new java.lang.String[] { "MessageHeader", "LoggingLevel", "DiagInput", });
    internal_static_com_ctrip_flight_agg_shopping_contract_message_ResponseHeaderType_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_ctrip_flight_agg_shopping_contract_message_ResponseHeaderType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_message_ResponseHeaderType_descriptor,
        new java.lang.String[] { "MessageHeader", "ServerIP", "ReturnCode", "DiagOutput", });
    internal_static_com_ctrip_flight_agg_shopping_contract_message_MessageHeaderType_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_ctrip_flight_agg_shopping_contract_message_MessageHeaderType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_message_MessageHeaderType_descriptor,
        new java.lang.String[] { "Channel", "SubChannelID", "TransactionID", "RequestID", "ClientIP", "DeviceID", "DevicePlatform", "SessionID", "ClientVersion", "DeviceType", "PlatformType", "DevicePlatformVersion", "ClientID", "AID", "SID", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
