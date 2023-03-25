// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

public interface OfferTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 行段详细信息，顺序与TransportRef一一对应
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType TransportFareMapping = 1;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType> 
      getTransportFareMappingList();
  /**
   * <pre>
   * 行段详细信息，顺序与TransportRef一一对应
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType TransportFareMapping = 1;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType getTransportFareMapping(int index);
  /**
   * <pre>
   * 行段详细信息，顺序与TransportRef一一对应
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType TransportFareMapping = 1;</code>
   */
  int getTransportFareMappingCount();
  /**
   * <pre>
   * 行段详细信息，顺序与TransportRef一一对应
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType TransportFareMapping = 1;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingTypeOrBuilder> 
      getTransportFareMappingOrBuilderList();
  /**
   * <pre>
   * 行段详细信息，顺序与TransportRef一一对应
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType TransportFareMapping = 1;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingTypeOrBuilder getTransportFareMappingOrBuilder(
      int index);

  /**
   * <pre>
   * 产品详情列表，含价格等重要信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.ProductDetailType ProductDetail = 2;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.response.ProductDetailType> 
      getProductDetailList();
  /**
   * <pre>
   * 产品详情列表，含价格等重要信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.ProductDetailType ProductDetail = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.ProductDetailType getProductDetail(int index);
  /**
   * <pre>
   * 产品详情列表，含价格等重要信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.ProductDetailType ProductDetail = 2;</code>
   */
  int getProductDetailCount();
  /**
   * <pre>
   * 产品详情列表，含价格等重要信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.ProductDetailType ProductDetail = 2;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.response.ProductDetailTypeOrBuilder> 
      getProductDetailOrBuilderList();
  /**
   * <pre>
   * 产品详情列表，含价格等重要信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.ProductDetailType ProductDetail = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.ProductDetailTypeOrBuilder getProductDetailOrBuilder(
      int index);

  /**
   * <pre>
   * 服务内部为每一个offer生成一个字符串类型的token，内容为加密字符串，反查时需要回传，不保证唯一性！
   * </pre>
   *
   * <code>string OfferToken = 3;</code>
   */
  java.lang.String getOfferToken();
  /**
   * <pre>
   * 服务内部为每一个offer生成一个字符串类型的token，内容为加密字符串，反查时需要回传，不保证唯一性！
   * </pre>
   *
   * <code>string OfferToken = 3;</code>
   */
  com.google.protobuf.ByteString
      getOfferTokenBytes();

  /**
   * <pre>
   * 产品组合类型, 包括了单程直飞的部分信息
   * </pre>
   *
   * <code>repeated string ProductCombinationType = 4;</code>
   */
  java.util.List<java.lang.String>
      getProductCombinationTypeList();
  /**
   * <pre>
   * 产品组合类型, 包括了单程直飞的部分信息
   * </pre>
   *
   * <code>repeated string ProductCombinationType = 4;</code>
   */
  int getProductCombinationTypeCount();
  /**
   * <pre>
   * 产品组合类型, 包括了单程直飞的部分信息
   * </pre>
   *
   * <code>repeated string ProductCombinationType = 4;</code>
   */
  java.lang.String getProductCombinationType(int index);
  /**
   * <pre>
   * 产品组合类型, 包括了单程直飞的部分信息
   * </pre>
   *
   * <code>repeated string ProductCombinationType = 4;</code>
   */
  com.google.protobuf.ByteString
      getProductCombinationTypeBytes(int index);

  /**
   * <pre>
   * 绑定在Offer维度的辅营信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.OfferPackageType OfferPackage = 5;</code>
   */
  boolean hasOfferPackage();
  /**
   * <pre>
   * 绑定在Offer维度的辅营信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.OfferPackageType OfferPackage = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.OfferPackageType getOfferPackage();
  /**
   * <pre>
   * 绑定在Offer维度的辅营信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.OfferPackageType OfferPackage = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.OfferPackageTypeOrBuilder getOfferPackageOrBuilder();

  /**
   * <pre>
   * 行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType BaggageRef = 6;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType> 
      getBaggageRefList();
  /**
   * <pre>
   * 行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType BaggageRef = 6;</code>
   */
  com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType getBaggageRef(int index);
  /**
   * <pre>
   * 行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType BaggageRef = 6;</code>
   */
  int getBaggageRefCount();
  /**
   * <pre>
   * 行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType BaggageRef = 6;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefTypeOrBuilder> 
      getBaggageRefOrBuilderList();
  /**
   * <pre>
   * 行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType BaggageRef = 6;</code>
   */
  com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefTypeOrBuilder getBaggageRefOrBuilder(
      int index);

  /**
   * <pre>
   * 增值行李：区分打包和加购方式，且每种方式可能有不同的规格
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.BaggageAncillaryType BaggageAncillary = 7;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.BaggageAncillaryType> 
      getBaggageAncillaryList();
  /**
   * <pre>
   * 增值行李：区分打包和加购方式，且每种方式可能有不同的规格
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.BaggageAncillaryType BaggageAncillary = 7;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.BaggageAncillaryType getBaggageAncillary(int index);
  /**
   * <pre>
   * 增值行李：区分打包和加购方式，且每种方式可能有不同的规格
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.BaggageAncillaryType BaggageAncillary = 7;</code>
   */
  int getBaggageAncillaryCount();
  /**
   * <pre>
   * 增值行李：区分打包和加购方式，且每种方式可能有不同的规格
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.BaggageAncillaryType BaggageAncillary = 7;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.BaggageAncillaryTypeOrBuilder> 
      getBaggageAncillaryOrBuilderList();
  /**
   * <pre>
   * 增值行李：区分打包和加购方式，且每种方式可能有不同的规格
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.BaggageAncillaryType BaggageAncillary = 7;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.BaggageAncillaryTypeOrBuilder getBaggageAncillaryOrBuilder(
      int index);

  /**
   * <pre>
   * 国际机票价格属性ID集合
   * </pre>
   *
   * <code>repeated int32 PriceAttributeID = 8;</code>
   */
  java.util.List<java.lang.Integer> getPriceAttributeIDList();
  /**
   * <pre>
   * 国际机票价格属性ID集合
   * </pre>
   *
   * <code>repeated int32 PriceAttributeID = 8;</code>
   */
  int getPriceAttributeIDCount();
  /**
   * <pre>
   * 国际机票价格属性ID集合
   * </pre>
   *
   * <code>repeated int32 PriceAttributeID = 8;</code>
   */
  int getPriceAttributeID(int index);

  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType> 
      getTagList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType getTag(int index);
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  int getTagCount();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder> 
      getTagOrBuilderList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder getTagOrBuilder(
      int index);

  /**
   * <pre>
   * 推荐类运价类型, 默认0：普通运价； 1: 推荐类运价； 2:普通运价+推荐类(既是普通又是推荐类，与前端展示有关)
   * </pre>
   *
   * <code>int32 RecommendedType = 10;</code>
   */
  int getRecommendedType();

  /**
   * <pre>
   * 机酒Token，调机酒服务时使用
   * </pre>
   *
   * <code>string TransportHotelToken = 11;</code>
   */
  java.lang.String getTransportHotelToken();
  /**
   * <pre>
   * 机酒Token，调机酒服务时使用
   * </pre>
   *
   * <code>string TransportHotelToken = 11;</code>
   */
  com.google.protobuf.ByteString
      getTransportHotelTokenBytes();

  /**
   * <pre>
   * 优先级, 数值越小优先级越高
   * </pre>
   *
   * <code>double Priority = 12;</code>
   */
  double getPriority();

  /**
   * <pre>
   * 与行程有关的相关信息。List中元素的数量最多和行程数一样
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType JourneyAttachment = 13;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType> 
      getJourneyAttachmentList();
  /**
   * <pre>
   * 与行程有关的相关信息。List中元素的数量最多和行程数一样
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType JourneyAttachment = 13;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType getJourneyAttachment(int index);
  /**
   * <pre>
   * 与行程有关的相关信息。List中元素的数量最多和行程数一样
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType JourneyAttachment = 13;</code>
   */
  int getJourneyAttachmentCount();
  /**
   * <pre>
   * 与行程有关的相关信息。List中元素的数量最多和行程数一样
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType JourneyAttachment = 13;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentTypeOrBuilder> 
      getJourneyAttachmentOrBuilderList();
  /**
   * <pre>
   * 与行程有关的相关信息。List中元素的数量最多和行程数一样
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType JourneyAttachment = 13;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentTypeOrBuilder getJourneyAttachmentOrBuilder(
      int index);

  /**
   * <pre>
   * 运价索引 每次查询唯一
   * </pre>
   *
   * <code>int32 OfferID = 14;</code>
   */
  int getOfferID();

  /**
   * <pre>
   * 引用的offerId。暂时用于标识儿童标准价offer隶属于哪个Offer下
   * </pre>
   *
   * <code>int32 ChildStandardOfferRef = 15;</code>
   */
  int getChildStandardOfferRef();

  /**
   * <pre>
   * Upsell促销信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.UpsellProductType UpsellProduct = 16;</code>
   */
  boolean hasUpsellProduct();
  /**
   * <pre>
   * Upsell促销信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.UpsellProductType UpsellProduct = 16;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.UpsellProductType getUpsellProduct();
  /**
   * <pre>
   * Upsell促销信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.UpsellProductType UpsellProduct = 16;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.UpsellProductTypeOrBuilder getUpsellProductOrBuilder();

  /**
   * <pre>
   * 可展示的运价金额 已确认目前没人用,直接删除
   * DisplayedOfferAmountType DisplayedOfferAmount = 17 [deprecated = true];
   * 产品组合关系
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType ProductComposition = 17;</code>
   */
  boolean hasProductComposition();
  /**
   * <pre>
   * 可展示的运价金额 已确认目前没人用,直接删除
   * DisplayedOfferAmountType DisplayedOfferAmount = 17 [deprecated = true];
   * 产品组合关系
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType ProductComposition = 17;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType getProductComposition();
  /**
   * <pre>
   * 可展示的运价金额 已确认目前没人用,直接删除
   * DisplayedOfferAmountType DisplayedOfferAmount = 17 [deprecated = true];
   * 产品组合关系
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType ProductComposition = 17;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionTypeOrBuilder getProductCompositionOrBuilder();

  /**
   * <pre>
   * 比价信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.OfferComparisonType OfferComparison = 18;</code>
   */
  boolean hasOfferComparison();
  /**
   * <pre>
   * 比价信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.OfferComparisonType OfferComparison = 18;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.OfferComparisonType getOfferComparison();
  /**
   * <pre>
   * 比价信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.OfferComparisonType OfferComparison = 18;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.OfferComparisonTypeOrBuilder getOfferComparisonOrBuilder();
}
