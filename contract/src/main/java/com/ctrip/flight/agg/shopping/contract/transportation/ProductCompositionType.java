// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * <pre>
 * 产品组合关系
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType}
 */
public  final class ProductCompositionType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType)
    ProductCompositionTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductCompositionType.newBuilder() to construct.
  private ProductCompositionType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductCompositionType() {
    compositionPlanDefinition_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductCompositionType(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              compositionPlanDefinition_ = new java.util.ArrayList<com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType>();
              mutable_bitField0_ |= 0x00000001;
            }
            compositionPlanDefinition_.add(
                input.readMessage(com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.parser(), extensionRegistry));
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
        compositionPlanDefinition_ = java.util.Collections.unmodifiableList(compositionPlanDefinition_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductCompositionType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductCompositionType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType.class, com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType.Builder.class);
  }

  public static final int COMPOSITIONPLANDEFINITION_FIELD_NUMBER = 1;
  private java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType> compositionPlanDefinition_;
  /**
   * <pre>
   * 组合方案列表，一个元素就是一种组合方案
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
   */
  public java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType> getCompositionPlanDefinitionList() {
    return compositionPlanDefinition_;
  }
  /**
   * <pre>
   * 组合方案列表，一个元素就是一种组合方案
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
   */
  public java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionTypeOrBuilder> 
      getCompositionPlanDefinitionOrBuilderList() {
    return compositionPlanDefinition_;
  }
  /**
   * <pre>
   * 组合方案列表，一个元素就是一种组合方案
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
   */
  public int getCompositionPlanDefinitionCount() {
    return compositionPlanDefinition_.size();
  }
  /**
   * <pre>
   * 组合方案列表，一个元素就是一种组合方案
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType getCompositionPlanDefinition(int index) {
    return compositionPlanDefinition_.get(index);
  }
  /**
   * <pre>
   * 组合方案列表，一个元素就是一种组合方案
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionTypeOrBuilder getCompositionPlanDefinitionOrBuilder(
      int index) {
    return compositionPlanDefinition_.get(index);
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
    for (int i = 0; i < compositionPlanDefinition_.size(); i++) {
      output.writeMessage(1, compositionPlanDefinition_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < compositionPlanDefinition_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, compositionPlanDefinition_.get(i));
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType other = (com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType) obj;

    boolean result = true;
    result = result && getCompositionPlanDefinitionList()
        .equals(other.getCompositionPlanDefinitionList());
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
    if (getCompositionPlanDefinitionCount() > 0) {
      hash = (37 * hash) + COMPOSITIONPLANDEFINITION_FIELD_NUMBER;
      hash = (53 * hash) + getCompositionPlanDefinitionList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType prototype) {
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
   * 产品组合关系
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType)
      com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductCompositionType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductCompositionType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType.class, com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType.newBuilder()
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
        getCompositionPlanDefinitionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (compositionPlanDefinitionBuilder_ == null) {
        compositionPlanDefinition_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        compositionPlanDefinitionBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductCompositionType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType result = new com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType(this);
      int from_bitField0_ = bitField0_;
      if (compositionPlanDefinitionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          compositionPlanDefinition_ = java.util.Collections.unmodifiableList(compositionPlanDefinition_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.compositionPlanDefinition_ = compositionPlanDefinition_;
      } else {
        result.compositionPlanDefinition_ = compositionPlanDefinitionBuilder_.build();
      }
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType.getDefaultInstance()) return this;
      if (compositionPlanDefinitionBuilder_ == null) {
        if (!other.compositionPlanDefinition_.isEmpty()) {
          if (compositionPlanDefinition_.isEmpty()) {
            compositionPlanDefinition_ = other.compositionPlanDefinition_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCompositionPlanDefinitionIsMutable();
            compositionPlanDefinition_.addAll(other.compositionPlanDefinition_);
          }
          onChanged();
        }
      } else {
        if (!other.compositionPlanDefinition_.isEmpty()) {
          if (compositionPlanDefinitionBuilder_.isEmpty()) {
            compositionPlanDefinitionBuilder_.dispose();
            compositionPlanDefinitionBuilder_ = null;
            compositionPlanDefinition_ = other.compositionPlanDefinition_;
            bitField0_ = (bitField0_ & ~0x00000001);
            compositionPlanDefinitionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCompositionPlanDefinitionFieldBuilder() : null;
          } else {
            compositionPlanDefinitionBuilder_.addAllMessages(other.compositionPlanDefinition_);
          }
        }
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
      com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType> compositionPlanDefinition_ =
      java.util.Collections.emptyList();
    private void ensureCompositionPlanDefinitionIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        compositionPlanDefinition_ = new java.util.ArrayList<com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType>(compositionPlanDefinition_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType, com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionTypeOrBuilder> compositionPlanDefinitionBuilder_;

    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType> getCompositionPlanDefinitionList() {
      if (compositionPlanDefinitionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(compositionPlanDefinition_);
      } else {
        return compositionPlanDefinitionBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public int getCompositionPlanDefinitionCount() {
      if (compositionPlanDefinitionBuilder_ == null) {
        return compositionPlanDefinition_.size();
      } else {
        return compositionPlanDefinitionBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType getCompositionPlanDefinition(int index) {
      if (compositionPlanDefinitionBuilder_ == null) {
        return compositionPlanDefinition_.get(index);
      } else {
        return compositionPlanDefinitionBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public Builder setCompositionPlanDefinition(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType value) {
      if (compositionPlanDefinitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompositionPlanDefinitionIsMutable();
        compositionPlanDefinition_.set(index, value);
        onChanged();
      } else {
        compositionPlanDefinitionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public Builder setCompositionPlanDefinition(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.Builder builderForValue) {
      if (compositionPlanDefinitionBuilder_ == null) {
        ensureCompositionPlanDefinitionIsMutable();
        compositionPlanDefinition_.set(index, builderForValue.build());
        onChanged();
      } else {
        compositionPlanDefinitionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public Builder addCompositionPlanDefinition(com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType value) {
      if (compositionPlanDefinitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompositionPlanDefinitionIsMutable();
        compositionPlanDefinition_.add(value);
        onChanged();
      } else {
        compositionPlanDefinitionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public Builder addCompositionPlanDefinition(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType value) {
      if (compositionPlanDefinitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompositionPlanDefinitionIsMutable();
        compositionPlanDefinition_.add(index, value);
        onChanged();
      } else {
        compositionPlanDefinitionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public Builder addCompositionPlanDefinition(
        com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.Builder builderForValue) {
      if (compositionPlanDefinitionBuilder_ == null) {
        ensureCompositionPlanDefinitionIsMutable();
        compositionPlanDefinition_.add(builderForValue.build());
        onChanged();
      } else {
        compositionPlanDefinitionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public Builder addCompositionPlanDefinition(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.Builder builderForValue) {
      if (compositionPlanDefinitionBuilder_ == null) {
        ensureCompositionPlanDefinitionIsMutable();
        compositionPlanDefinition_.add(index, builderForValue.build());
        onChanged();
      } else {
        compositionPlanDefinitionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public Builder addAllCompositionPlanDefinition(
        java.lang.Iterable<? extends com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType> values) {
      if (compositionPlanDefinitionBuilder_ == null) {
        ensureCompositionPlanDefinitionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, compositionPlanDefinition_);
        onChanged();
      } else {
        compositionPlanDefinitionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public Builder clearCompositionPlanDefinition() {
      if (compositionPlanDefinitionBuilder_ == null) {
        compositionPlanDefinition_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        compositionPlanDefinitionBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public Builder removeCompositionPlanDefinition(int index) {
      if (compositionPlanDefinitionBuilder_ == null) {
        ensureCompositionPlanDefinitionIsMutable();
        compositionPlanDefinition_.remove(index);
        onChanged();
      } else {
        compositionPlanDefinitionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.Builder getCompositionPlanDefinitionBuilder(
        int index) {
      return getCompositionPlanDefinitionFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionTypeOrBuilder getCompositionPlanDefinitionOrBuilder(
        int index) {
      if (compositionPlanDefinitionBuilder_ == null) {
        return compositionPlanDefinition_.get(index);  } else {
        return compositionPlanDefinitionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionTypeOrBuilder> 
         getCompositionPlanDefinitionOrBuilderList() {
      if (compositionPlanDefinitionBuilder_ != null) {
        return compositionPlanDefinitionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(compositionPlanDefinition_);
      }
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.Builder addCompositionPlanDefinitionBuilder() {
      return getCompositionPlanDefinitionFieldBuilder().addBuilder(
          com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.getDefaultInstance());
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.Builder addCompositionPlanDefinitionBuilder(
        int index) {
      return getCompositionPlanDefinitionFieldBuilder().addBuilder(
          index, com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.getDefaultInstance());
    }
    /**
     * <pre>
     * 组合方案列表，一个元素就是一种组合方案
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType CompositionPlanDefinition = 1;</code>
     */
    public java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.Builder> 
         getCompositionPlanDefinitionBuilderList() {
      return getCompositionPlanDefinitionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType, com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionTypeOrBuilder> 
        getCompositionPlanDefinitionFieldBuilder() {
      if (compositionPlanDefinitionBuilder_ == null) {
        compositionPlanDefinitionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType, com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.CompositionPlanDefinitionTypeOrBuilder>(
                compositionPlanDefinition_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        compositionPlanDefinition_ = null;
      }
      return compositionPlanDefinitionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductCompositionType>
      PARSER = new com.google.protobuf.AbstractParser<ProductCompositionType>() {
    @java.lang.Override
    public ProductCompositionType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductCompositionType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductCompositionType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductCompositionType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.ProductCompositionType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

