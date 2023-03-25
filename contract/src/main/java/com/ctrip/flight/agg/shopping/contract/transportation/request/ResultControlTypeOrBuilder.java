// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.request.proto

package com.ctrip.flight.agg.shopping.contract.transportation.request;

public interface ResultControlTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.request.ResultControlType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 是否需要推荐位产品
   * </pre>
   *
   * <code>bool NeedRecommendation = 1;</code>
   */
  boolean getNeedRecommendation();

  /**
   * <pre>
   * 偏好(出票)航司
   * </pre>
   *
   * <code>repeated string ValidatingCarrier = 2;</code>
   */
  java.util.List<java.lang.String>
      getValidatingCarrierList();
  /**
   * <pre>
   * 偏好(出票)航司
   * </pre>
   *
   * <code>repeated string ValidatingCarrier = 2;</code>
   */
  int getValidatingCarrierCount();
  /**
   * <pre>
   * 偏好(出票)航司
   * </pre>
   *
   * <code>repeated string ValidatingCarrier = 2;</code>
   */
  java.lang.String getValidatingCarrier(int index);
  /**
   * <pre>
   * 偏好(出票)航司
   * </pre>
   *
   * <code>repeated string ValidatingCarrier = 2;</code>
   */
  com.google.protobuf.ByteString
      getValidatingCarrierBytes(int index);

  /**
   * <pre>
   * 是否根据PaxRequest中的乘客类型做严格匹配。请求国内时有效。 默认false：严格匹配。
   * </pre>
   *
   * <code>bool NonMatchRequestAgeType = 3;</code>
   */
  boolean getNonMatchRequestAgeType();

  /**
   * <pre>
   * 0:不进行行程拆分，1：按Journey拆分行程返回offer
   * </pre>
   *
   * <code>int32 SeparateJourneyType = 4;</code>
   */
  int getSeparateJourneyType();
}
