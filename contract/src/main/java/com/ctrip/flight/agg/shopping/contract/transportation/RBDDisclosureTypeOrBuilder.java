// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface RBDDisclosureTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.RBDDisclosureType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 舱位名称
   * </pre>
   *
   * <code>string Name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * 舱位名称
   * </pre>
   *
   * <code>string Name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 舱位简称
   * </pre>
   *
   * <code>string ShortName = 2;</code>
   */
  java.lang.String getShortName();
  /**
   * <pre>
   * 舱位简称
   * </pre>
   *
   * <code>string ShortName = 2;</code>
   */
  com.google.protobuf.ByteString
      getShortNameBytes();

  /**
   * <pre>
   * 舱位描述
   * </pre>
   *
   * <code>string Description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * 舱位描述
   * </pre>
   *
   * <code>string Description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * 特舱ID
   * </pre>
   *
   * <code>int64 SpecialClassTypeID = 4;</code>
   */
  long getSpecialClassTypeID();

  /**
   * <pre>
   * 单独标签
   * </pre>
   *
   * <code>string ExtraTabName = 5;</code>
   */
  java.lang.String getExtraTabName();
  /**
   * <pre>
   * 单独标签
   * </pre>
   *
   * <code>string ExtraTabName = 5;</code>
   */
  com.google.protobuf.ByteString
      getExtraTabNameBytes();

  /**
   * <pre>
   * 特舱溢价等级(品牌顺序)
   * </pre>
   *
   * <code>string BrandOrder = 6;</code>
   */
  java.lang.String getBrandOrder();
  /**
   * <pre>
   * 特舱溢价等级(品牌顺序)
   * </pre>
   *
   * <code>string BrandOrder = 6;</code>
   */
  com.google.protobuf.ByteString
      getBrandOrderBytes();

  /**
   * <pre>
   *特殊舱位可享受服务信息，格式 优先值机，优先安检，优先安检
   *1:优先升舱,2:优先值机,3:优先安检,4:优先登机,
   *5:头等舱服务休息室,6:商务舱服务休息室,7:经济舱服务休息室,8:里程累积,9:前排座位,10:餐食服务
   * </pre>
   *
   * <code>repeated string AvailableServices = 7;</code>
   */
  java.util.List<java.lang.String>
      getAvailableServicesList();
  /**
   * <pre>
   *特殊舱位可享受服务信息，格式 优先值机，优先安检，优先安检
   *1:优先升舱,2:优先值机,3:优先安检,4:优先登机,
   *5:头等舱服务休息室,6:商务舱服务休息室,7:经济舱服务休息室,8:里程累积,9:前排座位,10:餐食服务
   * </pre>
   *
   * <code>repeated string AvailableServices = 7;</code>
   */
  int getAvailableServicesCount();
  /**
   * <pre>
   *特殊舱位可享受服务信息，格式 优先值机，优先安检，优先安检
   *1:优先升舱,2:优先值机,3:优先安检,4:优先登机,
   *5:头等舱服务休息室,6:商务舱服务休息室,7:经济舱服务休息室,8:里程累积,9:前排座位,10:餐食服务
   * </pre>
   *
   * <code>repeated string AvailableServices = 7;</code>
   */
  java.lang.String getAvailableServices(int index);
  /**
   * <pre>
   *特殊舱位可享受服务信息，格式 优先值机，优先安检，优先安检
   *1:优先升舱,2:优先值机,3:优先安检,4:优先登机,
   *5:头等舱服务休息室,6:商务舱服务休息室,7:经济舱服务休息室,8:里程累积,9:前排座位,10:餐食服务
   * </pre>
   *
   * <code>repeated string AvailableServices = 7;</code>
   */
  com.google.protobuf.ByteString
      getAvailableServicesBytes(int index);

  /**
   * <pre>
   * 地面服务等级
   * </pre>
   *
   * <code>string GroundServiceLevel = 8;</code>
   */
  java.lang.String getGroundServiceLevel();
  /**
   * <pre>
   * 地面服务等级
   * </pre>
   *
   * <code>string GroundServiceLevel = 8;</code>
   */
  com.google.protobuf.ByteString
      getGroundServiceLevelBytes();

  /**
   * <pre>
   * 空中服务等级
   * </pre>
   *
   * <code>string AirServiceLevel = 9;</code>
   */
  java.lang.String getAirServiceLevel();
  /**
   * <pre>
   * 空中服务等级
   * </pre>
   *
   * <code>string AirServiceLevel = 9;</code>
   */
  com.google.protobuf.ByteString
      getAirServiceLevelBytes();
}
