// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-impl.proto

package org.tribuo.protos.core;

/**
 * <pre>
 *CategoricalInfo proto
 * </pre>
 *
 * Protobuf type {@code tribuo.core.CategoricalInfoProto}
 */
public final class CategoricalInfoProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tribuo.core.CategoricalInfoProto)
    CategoricalInfoProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CategoricalInfoProto.newBuilder() to construct.
  private CategoricalInfoProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CategoricalInfoProto() {
    name_ = "";
    key_ = emptyDoubleList();
    value_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CategoricalInfoProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CategoricalInfoProto(
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

            name_ = s;
            break;
          }
          case 16: {

            count_ = input.readInt32();
            break;
          }
          case 81: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              key_ = newDoubleList();
              mutable_bitField0_ |= 0x00000001;
            }
            key_.addDouble(input.readDouble());
            break;
          }
          case 82: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              key_ = newDoubleList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              key_.addDouble(input.readDouble());
            }
            input.popLimit(limit);
            break;
          }
          case 88: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              value_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            value_.addLong(input.readInt64());
            break;
          }
          case 90: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              value_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              value_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 97: {

            observedValue_ = input.readDouble();
            break;
          }
          case 104: {

            observedCount_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        key_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        value_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_CategoricalInfoProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_CategoricalInfoProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tribuo.protos.core.CategoricalInfoProto.class, org.tribuo.protos.core.CategoricalInfoProto.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <code>int32 count = 2;</code>
   * @return The count.
   */
  @java.lang.Override
  public int getCount() {
    return count_;
  }

  public static final int KEY_FIELD_NUMBER = 10;
  private com.google.protobuf.Internal.DoubleList key_;
  /**
   * <code>repeated double key = 10;</code>
   * @return A list containing the key.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double>
      getKeyList() {
    return key_;
  }
  /**
   * <code>repeated double key = 10;</code>
   * @return The count of key.
   */
  public int getKeyCount() {
    return key_.size();
  }
  /**
   * <code>repeated double key = 10;</code>
   * @param index The index of the element to return.
   * @return The key at the given index.
   */
  public double getKey(int index) {
    return key_.getDouble(index);
  }
  private int keyMemoizedSerializedSize = -1;

  public static final int VALUE_FIELD_NUMBER = 11;
  private com.google.protobuf.Internal.LongList value_;
  /**
   * <code>repeated int64 value = 11;</code>
   * @return A list containing the value.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getValueList() {
    return value_;
  }
  /**
   * <code>repeated int64 value = 11;</code>
   * @return The count of value.
   */
  public int getValueCount() {
    return value_.size();
  }
  /**
   * <code>repeated int64 value = 11;</code>
   * @param index The index of the element to return.
   * @return The value at the given index.
   */
  public long getValue(int index) {
    return value_.getLong(index);
  }
  private int valueMemoizedSerializedSize = -1;

  public static final int OBSERVED_VALUE_FIELD_NUMBER = 12;
  private double observedValue_;
  /**
   * <code>double observed_value = 12;</code>
   * @return The observedValue.
   */
  @java.lang.Override
  public double getObservedValue() {
    return observedValue_;
  }

  public static final int OBSERVED_COUNT_FIELD_NUMBER = 13;
  private long observedCount_;
  /**
   * <code>int64 observed_count = 13;</code>
   * @return The observedCount.
   */
  @java.lang.Override
  public long getObservedCount() {
    return observedCount_;
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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    if (getKeyList().size() > 0) {
      output.writeUInt32NoTag(82);
      output.writeUInt32NoTag(keyMemoizedSerializedSize);
    }
    for (int i = 0; i < key_.size(); i++) {
      output.writeDoubleNoTag(key_.getDouble(i));
    }
    if (getValueList().size() > 0) {
      output.writeUInt32NoTag(90);
      output.writeUInt32NoTag(valueMemoizedSerializedSize);
    }
    for (int i = 0; i < value_.size(); i++) {
      output.writeInt64NoTag(value_.getLong(i));
    }
    if (java.lang.Double.doubleToRawLongBits(observedValue_) != 0) {
      output.writeDouble(12, observedValue_);
    }
    if (observedCount_ != 0L) {
      output.writeInt64(13, observedCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
    }
    {
      int dataSize = 0;
      dataSize = 8 * getKeyList().size();
      size += dataSize;
      if (!getKeyList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      keyMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < value_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(value_.getLong(i));
      }
      size += dataSize;
      if (!getValueList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      valueMemoizedSerializedSize = dataSize;
    }
    if (java.lang.Double.doubleToRawLongBits(observedValue_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(12, observedValue_);
    }
    if (observedCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(13, observedCount_);
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
    if (!(obj instanceof org.tribuo.protos.core.CategoricalInfoProto)) {
      return super.equals(obj);
    }
    org.tribuo.protos.core.CategoricalInfoProto other = (org.tribuo.protos.core.CategoricalInfoProto) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getCount()
        != other.getCount()) return false;
    if (!getKeyList()
        .equals(other.getKeyList())) return false;
    if (!getValueList()
        .equals(other.getValueList())) return false;
    if (java.lang.Double.doubleToLongBits(getObservedValue())
        != java.lang.Double.doubleToLongBits(
            other.getObservedValue())) return false;
    if (getObservedCount()
        != other.getObservedCount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    if (getKeyCount() > 0) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKeyList().hashCode();
    }
    if (getValueCount() > 0) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValueList().hashCode();
    }
    hash = (37 * hash) + OBSERVED_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getObservedValue()));
    hash = (37 * hash) + OBSERVED_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getObservedCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tribuo.protos.core.CategoricalInfoProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.protos.core.CategoricalInfoProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.protos.core.CategoricalInfoProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.protos.core.CategoricalInfoProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.protos.core.CategoricalInfoProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.protos.core.CategoricalInfoProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.protos.core.CategoricalInfoProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.protos.core.CategoricalInfoProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.protos.core.CategoricalInfoProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tribuo.protos.core.CategoricalInfoProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.protos.core.CategoricalInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.protos.core.CategoricalInfoProto parseFrom(
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
  public static Builder newBuilder(org.tribuo.protos.core.CategoricalInfoProto prototype) {
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
   *CategoricalInfo proto
   * </pre>
   *
   * Protobuf type {@code tribuo.core.CategoricalInfoProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tribuo.core.CategoricalInfoProto)
      org.tribuo.protos.core.CategoricalInfoProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_CategoricalInfoProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_CategoricalInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tribuo.protos.core.CategoricalInfoProto.class, org.tribuo.protos.core.CategoricalInfoProto.Builder.class);
    }

    // Construct using org.tribuo.protos.core.CategoricalInfoProto.newBuilder()
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
      name_ = "";

      count_ = 0;

      key_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      observedValue_ = 0D;

      observedCount_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_CategoricalInfoProto_descriptor;
    }

    @java.lang.Override
    public org.tribuo.protos.core.CategoricalInfoProto getDefaultInstanceForType() {
      return org.tribuo.protos.core.CategoricalInfoProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tribuo.protos.core.CategoricalInfoProto build() {
      org.tribuo.protos.core.CategoricalInfoProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tribuo.protos.core.CategoricalInfoProto buildPartial() {
      org.tribuo.protos.core.CategoricalInfoProto result = new org.tribuo.protos.core.CategoricalInfoProto(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.count_ = count_;
      if (((bitField0_ & 0x00000001) != 0)) {
        key_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.key_ = key_;
      if (((bitField0_ & 0x00000002) != 0)) {
        value_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.value_ = value_;
      result.observedValue_ = observedValue_;
      result.observedCount_ = observedCount_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tribuo.protos.core.CategoricalInfoProto) {
        return mergeFrom((org.tribuo.protos.core.CategoricalInfoProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tribuo.protos.core.CategoricalInfoProto other) {
      if (other == org.tribuo.protos.core.CategoricalInfoProto.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (!other.key_.isEmpty()) {
        if (key_.isEmpty()) {
          key_ = other.key_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureKeyIsMutable();
          key_.addAll(other.key_);
        }
        onChanged();
      }
      if (!other.value_.isEmpty()) {
        if (value_.isEmpty()) {
          value_ = other.value_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureValueIsMutable();
          value_.addAll(other.value_);
        }
        onChanged();
      }
      if (other.getObservedValue() != 0D) {
        setObservedValue(other.getObservedValue());
      }
      if (other.getObservedCount() != 0L) {
        setObservedCount(other.getObservedCount());
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
      org.tribuo.protos.core.CategoricalInfoProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tribuo.protos.core.CategoricalInfoProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <code>int32 count = 2;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 2;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.DoubleList key_ = emptyDoubleList();
    private void ensureKeyIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        key_ = mutableCopy(key_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated double key = 10;</code>
     * @return A list containing the key.
     */
    public java.util.List<java.lang.Double>
        getKeyList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(key_) : key_;
    }
    /**
     * <code>repeated double key = 10;</code>
     * @return The count of key.
     */
    public int getKeyCount() {
      return key_.size();
    }
    /**
     * <code>repeated double key = 10;</code>
     * @param index The index of the element to return.
     * @return The key at the given index.
     */
    public double getKey(int index) {
      return key_.getDouble(index);
    }
    /**
     * <code>repeated double key = 10;</code>
     * @param index The index to set the value at.
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        int index, double value) {
      ensureKeyIsMutable();
      key_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double key = 10;</code>
     * @param value The key to add.
     * @return This builder for chaining.
     */
    public Builder addKey(double value) {
      ensureKeyIsMutable();
      key_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double key = 10;</code>
     * @param values The key to add.
     * @return This builder for chaining.
     */
    public Builder addAllKey(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureKeyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, key_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double key = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList value_ = emptyLongList();
    private void ensureValueIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        value_ = mutableCopy(value_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int64 value = 11;</code>
     * @return A list containing the value.
     */
    public java.util.List<java.lang.Long>
        getValueList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(value_) : value_;
    }
    /**
     * <code>repeated int64 value = 11;</code>
     * @return The count of value.
     */
    public int getValueCount() {
      return value_.size();
    }
    /**
     * <code>repeated int64 value = 11;</code>
     * @param index The index of the element to return.
     * @return The value at the given index.
     */
    public long getValue(int index) {
      return value_.getLong(index);
    }
    /**
     * <code>repeated int64 value = 11;</code>
     * @param index The index to set the value at.
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        int index, long value) {
      ensureValueIsMutable();
      value_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 value = 11;</code>
     * @param value The value to add.
     * @return This builder for chaining.
     */
    public Builder addValue(long value) {
      ensureValueIsMutable();
      value_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 value = 11;</code>
     * @param values The value to add.
     * @return This builder for chaining.
     */
    public Builder addAllValue(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureValueIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, value_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 value = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private double observedValue_ ;
    /**
     * <code>double observed_value = 12;</code>
     * @return The observedValue.
     */
    @java.lang.Override
    public double getObservedValue() {
      return observedValue_;
    }
    /**
     * <code>double observed_value = 12;</code>
     * @param value The observedValue to set.
     * @return This builder for chaining.
     */
    public Builder setObservedValue(double value) {
      
      observedValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double observed_value = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearObservedValue() {
      
      observedValue_ = 0D;
      onChanged();
      return this;
    }

    private long observedCount_ ;
    /**
     * <code>int64 observed_count = 13;</code>
     * @return The observedCount.
     */
    @java.lang.Override
    public long getObservedCount() {
      return observedCount_;
    }
    /**
     * <code>int64 observed_count = 13;</code>
     * @param value The observedCount to set.
     * @return This builder for chaining.
     */
    public Builder setObservedCount(long value) {
      
      observedCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 observed_count = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearObservedCount() {
      
      observedCount_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tribuo.core.CategoricalInfoProto)
  }

  // @@protoc_insertion_point(class_scope:tribuo.core.CategoricalInfoProto)
  private static final org.tribuo.protos.core.CategoricalInfoProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tribuo.protos.core.CategoricalInfoProto();
  }

  public static org.tribuo.protos.core.CategoricalInfoProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CategoricalInfoProto>
      PARSER = new com.google.protobuf.AbstractParser<CategoricalInfoProto>() {
    @java.lang.Override
    public CategoricalInfoProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CategoricalInfoProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CategoricalInfoProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CategoricalInfoProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tribuo.protos.core.CategoricalInfoProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

