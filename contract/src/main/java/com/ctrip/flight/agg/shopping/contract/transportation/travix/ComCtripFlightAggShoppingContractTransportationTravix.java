// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.travix.proto

package com.ctrip.flight.agg.shopping.contract.transportation.travix;

public final class ComCtripFlightAggShoppingContractTransportationTravix {
  private ComCtripFlightAggShoppingContractTransportationTravix() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_TravixAdaptedOptionType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_TravixAdaptedOptionType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_JourneyOptionType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_JourneyOptionType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_TravixExclusiveOptionType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_TravixExclusiveOptionType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBcom.ctrip.flight.agg.shopping.contract" +
      ".transportation.travix.proto\022<com.ctrip." +
      "flight.agg.shopping.contract.transportat" +
      "ion.travix\"\250\001\n\027TravixAdaptedOptionType\022\023" +
      "\n\013TrafficType\030\001 \001(\t\022\020\n\010HaulType\030\002 \001(\t\022f\n" +
      "\rJourneyOption\030\003 \003(\0132O.com.ctrip.flight." +
      "agg.shopping.contract.transportation.tra" +
      "vix.JourneyOptionType\"?\n\021JourneyOptionTy" +
      "pe\022\024\n\014DepartRegion\030\001 \001(\t\022\024\n\014ArriveRegion" +
      "\030\002 \001(\t\"\225\001\n\031TravixExclusiveOptionType\022\016\n\006" +
      "RefNum\030\001 \001(\005\022\020\n\010Provider\030\002 \001(\t\022\026\n\016GdsAcc" +
      "ountCode\030\003 \001(\t\022\023\n\013PointOfSale\030\004 \001(\t\022\024\n\014C" +
      "onsolidator\030\005 \001(\t\022\023\n\013ContentType\030\006 \001(\tB@" +
      "\n<com.ctrip.flight.agg.shopping.contract" +
      ".transportation.travixP\001b\006proto3"
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
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_TravixAdaptedOptionType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_TravixAdaptedOptionType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_TravixAdaptedOptionType_descriptor,
        new java.lang.String[] { "TrafficType", "HaulType", "JourneyOption", });
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_JourneyOptionType_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_JourneyOptionType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_JourneyOptionType_descriptor,
        new java.lang.String[] { "DepartRegion", "ArriveRegion", });
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_TravixExclusiveOptionType_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_TravixExclusiveOptionType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_TravixExclusiveOptionType_descriptor,
        new java.lang.String[] { "RefNum", "Provider", "GdsAccountCode", "PointOfSale", "Consolidator", "ContentType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
