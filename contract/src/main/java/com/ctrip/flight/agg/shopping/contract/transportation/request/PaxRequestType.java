// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.request.proto

package com.ctrip.flight.agg.shopping.contract.transportation.request;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType}
 */
public  final class PaxRequestType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType)
    PaxRequestTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaxRequestType.newBuilder() to construct.
  private PaxRequestType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaxRequestType() {
    ageType_ = 0;
    count_ = 0;
    nationality_ = "";
    paxDetail_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PaxRequestType(
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
          case 8: {

            ageType_ = input.readInt32();
            break;
          }
          case 16: {

            count_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nationality_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              paxDetail_ = new java.util.ArrayList<com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType>();
              mutable_bitField0_ |= 0x00000008;
            }
            paxDetail_.add(
                input.readMessage(com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        paxDetail_ = java.util.Collections.unmodifiableList(paxDetail_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_PaxRequestType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_PaxRequestType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType.class, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType.Builder.class);
  }

  private int bitField0_;
  public static final int AGETYPE_FIELD_NUMBER = 1;
  private int ageType_;
  /**
   * <pre>
   * 乘客类型。1: Adult; 2: Child; 4: Infant;
   * </pre>
   *
   * <code>int32 AgeType = 1;</code>
   */
  public int getAgeType() {
    return ageType_;
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <pre>
   * 乘客人数
   * </pre>
   *
   * <code>int32 Count = 2;</code>
   */
  public int getCount() {
    return count_;
  }

  public static final int NATIONALITY_FIELD_NUMBER = 3;
  private volatile java.lang.Object nationality_;
  /**
   * <pre>
   * 国籍
   * </pre>
   *
   * <code>string Nationality = 3;</code>
   */
  public java.lang.String getNationality() {
    java.lang.Object ref = nationality_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nationality_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 国籍
   * </pre>
   *
   * <code>string Nationality = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNationalityBytes() {
    java.lang.Object ref = nationality_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nationality_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAXDETAIL_FIELD_NUMBER = 4;
  private java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType> paxDetail_;
  /**
   * <pre>
   * 乘机人明细
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
   */
  public java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType> getPaxDetailList() {
    return paxDetail_;
  }
  /**
   * <pre>
   * 乘机人明细
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
   */
  public java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailTypeOrBuilder> 
      getPaxDetailOrBuilderList() {
    return paxDetail_;
  }
  /**
   * <pre>
   * 乘机人明细
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
   */
  public int getPaxDetailCount() {
    return paxDetail_.size();
  }
  /**
   * <pre>
   * 乘机人明细
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType getPaxDetail(int index) {
    return paxDetail_.get(index);
  }
  /**
   * <pre>
   * 乘机人明细
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailTypeOrBuilder getPaxDetailOrBuilder(
      int index) {
    return paxDetail_.get(index);
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
    if (ageType_ != 0) {
      output.writeInt32(1, ageType_);
    }
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    if (!getNationalityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nationality_);
    }
    for (int i = 0; i < paxDetail_.size(); i++) {
      output.writeMessage(4, paxDetail_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ageType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, ageType_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
    }
    if (!getNationalityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nationality_);
    }
    for (int i = 0; i < paxDetail_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, paxDetail_.get(i));
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType other = (com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType) obj;

    boolean result = true;
    result = result && (getAgeType()
        == other.getAgeType());
    result = result && (getCount()
        == other.getCount());
    result = result && getNationality()
        .equals(other.getNationality());
    result = result && getPaxDetailList()
        .equals(other.getPaxDetailList());
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
    hash = (37 * hash) + AGETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getAgeType();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (37 * hash) + NATIONALITY_FIELD_NUMBER;
    hash = (53 * hash) + getNationality().hashCode();
    if (getPaxDetailCount() > 0) {
      hash = (37 * hash) + PAXDETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getPaxDetailList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType)
      com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_PaxRequestType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_PaxRequestType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType.class, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType.newBuilder()
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
        getPaxDetailFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ageType_ = 0;

      count_ = 0;

      nationality_ = "";

      if (paxDetailBuilder_ == null) {
        paxDetail_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        paxDetailBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_PaxRequestType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType result = new com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.ageType_ = ageType_;
      result.count_ = count_;
      result.nationality_ = nationality_;
      if (paxDetailBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          paxDetail_ = java.util.Collections.unmodifiableList(paxDetail_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.paxDetail_ = paxDetail_;
      } else {
        result.paxDetail_ = paxDetailBuilder_.build();
      }
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType.getDefaultInstance()) return this;
      if (other.getAgeType() != 0) {
        setAgeType(other.getAgeType());
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (!other.getNationality().isEmpty()) {
        nationality_ = other.nationality_;
        onChanged();
      }
      if (paxDetailBuilder_ == null) {
        if (!other.paxDetail_.isEmpty()) {
          if (paxDetail_.isEmpty()) {
            paxDetail_ = other.paxDetail_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensurePaxDetailIsMutable();
            paxDetail_.addAll(other.paxDetail_);
          }
          onChanged();
        }
      } else {
        if (!other.paxDetail_.isEmpty()) {
          if (paxDetailBuilder_.isEmpty()) {
            paxDetailBuilder_.dispose();
            paxDetailBuilder_ = null;
            paxDetail_ = other.paxDetail_;
            bitField0_ = (bitField0_ & ~0x00000008);
            paxDetailBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPaxDetailFieldBuilder() : null;
          } else {
            paxDetailBuilder_.addAllMessages(other.paxDetail_);
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
      com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int ageType_ ;
    /**
     * <pre>
     * 乘客类型。1: Adult; 2: Child; 4: Infant;
     * </pre>
     *
     * <code>int32 AgeType = 1;</code>
     */
    public int getAgeType() {
      return ageType_;
    }
    /**
     * <pre>
     * 乘客类型。1: Adult; 2: Child; 4: Infant;
     * </pre>
     *
     * <code>int32 AgeType = 1;</code>
     */
    public Builder setAgeType(int value) {
      
      ageType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 乘客类型。1: Adult; 2: Child; 4: Infant;
     * </pre>
     *
     * <code>int32 AgeType = 1;</code>
     */
    public Builder clearAgeType() {
      
      ageType_ = 0;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <pre>
     * 乘客人数
     * </pre>
     *
     * <code>int32 Count = 2;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <pre>
     * 乘客人数
     * </pre>
     *
     * <code>int32 Count = 2;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 乘客人数
     * </pre>
     *
     * <code>int32 Count = 2;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object nationality_ = "";
    /**
     * <pre>
     * 国籍
     * </pre>
     *
     * <code>string Nationality = 3;</code>
     */
    public java.lang.String getNationality() {
      java.lang.Object ref = nationality_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nationality_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 国籍
     * </pre>
     *
     * <code>string Nationality = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNationalityBytes() {
      java.lang.Object ref = nationality_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nationality_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 国籍
     * </pre>
     *
     * <code>string Nationality = 3;</code>
     */
    public Builder setNationality(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nationality_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 国籍
     * </pre>
     *
     * <code>string Nationality = 3;</code>
     */
    public Builder clearNationality() {
      
      nationality_ = getDefaultInstance().getNationality();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 国籍
     * </pre>
     *
     * <code>string Nationality = 3;</code>
     */
    public Builder setNationalityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nationality_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType> paxDetail_ =
      java.util.Collections.emptyList();
    private void ensurePaxDetailIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        paxDetail_ = new java.util.ArrayList<com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType>(paxDetail_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailTypeOrBuilder> paxDetailBuilder_;

    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType> getPaxDetailList() {
      if (paxDetailBuilder_ == null) {
        return java.util.Collections.unmodifiableList(paxDetail_);
      } else {
        return paxDetailBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public int getPaxDetailCount() {
      if (paxDetailBuilder_ == null) {
        return paxDetail_.size();
      } else {
        return paxDetailBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType getPaxDetail(int index) {
      if (paxDetailBuilder_ == null) {
        return paxDetail_.get(index);
      } else {
        return paxDetailBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public Builder setPaxDetail(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType value) {
      if (paxDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaxDetailIsMutable();
        paxDetail_.set(index, value);
        onChanged();
      } else {
        paxDetailBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public Builder setPaxDetail(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.Builder builderForValue) {
      if (paxDetailBuilder_ == null) {
        ensurePaxDetailIsMutable();
        paxDetail_.set(index, builderForValue.build());
        onChanged();
      } else {
        paxDetailBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public Builder addPaxDetail(com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType value) {
      if (paxDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaxDetailIsMutable();
        paxDetail_.add(value);
        onChanged();
      } else {
        paxDetailBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public Builder addPaxDetail(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType value) {
      if (paxDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaxDetailIsMutable();
        paxDetail_.add(index, value);
        onChanged();
      } else {
        paxDetailBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public Builder addPaxDetail(
        com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.Builder builderForValue) {
      if (paxDetailBuilder_ == null) {
        ensurePaxDetailIsMutable();
        paxDetail_.add(builderForValue.build());
        onChanged();
      } else {
        paxDetailBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public Builder addPaxDetail(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.Builder builderForValue) {
      if (paxDetailBuilder_ == null) {
        ensurePaxDetailIsMutable();
        paxDetail_.add(index, builderForValue.build());
        onChanged();
      } else {
        paxDetailBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public Builder addAllPaxDetail(
        java.lang.Iterable<? extends com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType> values) {
      if (paxDetailBuilder_ == null) {
        ensurePaxDetailIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paxDetail_);
        onChanged();
      } else {
        paxDetailBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public Builder clearPaxDetail() {
      if (paxDetailBuilder_ == null) {
        paxDetail_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        paxDetailBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public Builder removePaxDetail(int index) {
      if (paxDetailBuilder_ == null) {
        ensurePaxDetailIsMutable();
        paxDetail_.remove(index);
        onChanged();
      } else {
        paxDetailBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.Builder getPaxDetailBuilder(
        int index) {
      return getPaxDetailFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailTypeOrBuilder getPaxDetailOrBuilder(
        int index) {
      if (paxDetailBuilder_ == null) {
        return paxDetail_.get(index);  } else {
        return paxDetailBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailTypeOrBuilder> 
         getPaxDetailOrBuilderList() {
      if (paxDetailBuilder_ != null) {
        return paxDetailBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(paxDetail_);
      }
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.Builder addPaxDetailBuilder() {
      return getPaxDetailFieldBuilder().addBuilder(
          com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.getDefaultInstance());
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.Builder addPaxDetailBuilder(
        int index) {
      return getPaxDetailFieldBuilder().addBuilder(
          index, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.getDefaultInstance());
    }
    /**
     * <pre>
     * 乘机人明细
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType PaxDetail = 4;</code>
     */
    public java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.Builder> 
         getPaxDetailBuilderList() {
      return getPaxDetailFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailTypeOrBuilder> 
        getPaxDetailFieldBuilder() {
      if (paxDetailBuilder_ == null) {
        paxDetailBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.request.PaxDetailTypeOrBuilder>(
                paxDetail_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        paxDetail_ = null;
      }
      return paxDetailBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaxRequestType>
      PARSER = new com.google.protobuf.AbstractParser<PaxRequestType>() {
    @java.lang.Override
    public PaxRequestType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PaxRequestType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaxRequestType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaxRequestType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

