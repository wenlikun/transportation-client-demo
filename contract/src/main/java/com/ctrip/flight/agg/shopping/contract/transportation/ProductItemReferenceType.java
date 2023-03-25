// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * <pre>
 * 一种产品的索引组合信息
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType}
 */
public  final class ProductItemReferenceType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType)
    ProductItemReferenceTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductItemReferenceType.newBuilder() to construct.
  private ProductItemReferenceType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductItemReferenceType() {
    productRef_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    type_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductItemReferenceType(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              productRef_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            productRef_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        productRef_ = productRef_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductItemReferenceType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductItemReferenceType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType.class, com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType.Builder.class);
  }

  private int bitField0_;
  public static final int PRODUCTREF_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList productRef_;
  /**
   * <pre>
   * Ref列表
   * </pre>
   *
   * <code>repeated string ProductRef = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getProductRefList() {
    return productRef_;
  }
  /**
   * <pre>
   * Ref列表
   * </pre>
   *
   * <code>repeated string ProductRef = 1;</code>
   */
  public int getProductRefCount() {
    return productRef_.size();
  }
  /**
   * <pre>
   * Ref列表
   * </pre>
   *
   * <code>repeated string ProductRef = 1;</code>
   */
  public java.lang.String getProductRef(int index) {
    return productRef_.get(index);
  }
  /**
   * <pre>
   * Ref列表
   * </pre>
   *
   * <code>repeated string ProductRef = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProductRefBytes(int index) {
    return productRef_.getByteString(index);
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   * 类型
   * 取值：RefundServicePackage：退票服务包，PackedBaggage：打包行李
   * </pre>
   *
   * <code>string Type = 2;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 类型
   * 取值：RefundServicePackage：退票服务包，PackedBaggage：打包行李
   * </pre>
   *
   * <code>string Type = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < productRef_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, productRef_.getRaw(i));
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < productRef_.size(); i++) {
        dataSize += computeStringSizeNoTag(productRef_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getProductRefList().size();
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType other = (com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType) obj;

    boolean result = true;
    result = result && getProductRefList()
        .equals(other.getProductRefList());
    result = result && getType()
        .equals(other.getType());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getProductRefCount() > 0) {
      hash = (37 * hash) + PRODUCTREF_FIELD_NUMBER;
      hash = (53 * hash) + getProductRefList().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 一种产品的索引组合信息
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType)
      com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductItemReferenceType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductItemReferenceType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType.class, com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      productRef_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductItemReferenceType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType result = new com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        productRef_ = productRef_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.productRef_ = productRef_;
      result.type_ = type_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType.getDefaultInstance()) return this;
      if (!other.productRef_.isEmpty()) {
        if (productRef_.isEmpty()) {
          productRef_ = other.productRef_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureProductRefIsMutable();
          productRef_.addAll(other.productRef_);
        }
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList productRef_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureProductRefIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        productRef_ = new com.google.protobuf.LazyStringArrayList(productRef_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Ref列表
     * </pre>
     *
     * <code>repeated string ProductRef = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getProductRefList() {
      return productRef_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Ref列表
     * </pre>
     *
     * <code>repeated string ProductRef = 1;</code>
     */
    public int getProductRefCount() {
      return productRef_.size();
    }
    /**
     * <pre>
     * Ref列表
     * </pre>
     *
     * <code>repeated string ProductRef = 1;</code>
     */
    public java.lang.String getProductRef(int index) {
      return productRef_.get(index);
    }
    /**
     * <pre>
     * Ref列表
     * </pre>
     *
     * <code>repeated string ProductRef = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProductRefBytes(int index) {
      return productRef_.getByteString(index);
    }
    /**
     * <pre>
     * Ref列表
     * </pre>
     *
     * <code>repeated string ProductRef = 1;</code>
     */
    public Builder setProductRef(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProductRefIsMutable();
      productRef_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ref列表
     * </pre>
     *
     * <code>repeated string ProductRef = 1;</code>
     */
    public Builder addProductRef(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProductRefIsMutable();
      productRef_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ref列表
     * </pre>
     *
     * <code>repeated string ProductRef = 1;</code>
     */
    public Builder addAllProductRef(
        java.lang.Iterable<java.lang.String> values) {
      ensureProductRefIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, productRef_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ref列表
     * </pre>
     *
     * <code>repeated string ProductRef = 1;</code>
     */
    public Builder clearProductRef() {
      productRef_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ref列表
     * </pre>
     *
     * <code>repeated string ProductRef = 1;</code>
     */
    public Builder addProductRefBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureProductRefIsMutable();
      productRef_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * 类型
     * 取值：RefundServicePackage：退票服务包，PackedBaggage：打包行李
     * </pre>
     *
     * <code>string Type = 2;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 类型
     * 取值：RefundServicePackage：退票服务包，PackedBaggage：打包行李
     * </pre>
     *
     * <code>string Type = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 类型
     * 取值：RefundServicePackage：退票服务包，PackedBaggage：打包行李
     * </pre>
     *
     * <code>string Type = 2;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 类型
     * 取值：RefundServicePackage：退票服务包，PackedBaggage：打包行李
     * </pre>
     *
     * <code>string Type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 类型
     * 取值：RefundServicePackage：退票服务包，PackedBaggage：打包行李
     * </pre>
     *
     * <code>string Type = 2;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductItemReferenceType>
      PARSER = new com.google.protobuf.AbstractParser<ProductItemReferenceType>() {
    @java.lang.Override
    public ProductItemReferenceType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductItemReferenceType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductItemReferenceType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductItemReferenceType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

