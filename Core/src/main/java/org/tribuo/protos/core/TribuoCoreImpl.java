// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-impl.proto

package org.tribuo.protos.core;

public final class TribuoCoreImpl {
  private TribuoCoreImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_HashedFeatureMapProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_HashedFeatureMapProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_ImmutableFeatureMapProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_ImmutableFeatureMapProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_MutableFeatureMapProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_MutableFeatureMapProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_RealInfoProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_RealInfoProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_RealIDInfoProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_RealIDInfoProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_CategoricalInfoProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_CategoricalInfoProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_CategoricalIDInfoProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_CategoricalIDInfoProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_MessageDigestHasherProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_MessageDigestHasherProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_ModHashCodeHasherProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_ModHashCodeHasherProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_SimpleTransformProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_SimpleTransformProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_MeanStdDevTransformerProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_MeanStdDevTransformerProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_LinearScalingTransformerProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_LinearScalingTransformerProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_IDFTransformerProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_IDFTransformerProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_BinningTransformerProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_BinningTransformerProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_core_TestCountTransformerProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_core_TestCountTransformerProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026tribuo-core-impl.proto\022\013tribuo.core\032\021t" +
      "ribuo-core.proto\032\021olcut_proto.proto\"o\n\025H" +
      "ashedFeatureMapProto\022(\n\006hasher\030\001 \001(\0132\030.t" +
      "ribuo.core.HasherProto\022,\n\004info\030\002 \003(\0132\036.t" +
      "ribuo.core.VariableInfoProto\"H\n\030Immutabl" +
      "eFeatureMapProto\022,\n\004info\030\001 \003(\0132\036.tribuo." +
      "core.VariableInfoProto\"h\n\026MutableFeature" +
      "MapProto\022 \n\030convert_high_cardinality\030\001 \001" +
      "(\010\022,\n\004info\030\002 \003(\0132\036.tribuo.core.VariableI" +
      "nfoProto\"h\n\rRealInfoProto\022\014\n\004name\030\001 \001(\t\022" +
      "\r\n\005count\030\002 \001(\005\022\013\n\003max\030\n \001(\001\022\013\n\003min\030\013 \001(\001" +
      "\022\014\n\004mean\030\014 \001(\001\022\022\n\nsumSquares\030\r \001(\001\"v\n\017Re" +
      "alIDInfoProto\022\014\n\004name\030\001 \001(\t\022\r\n\005count\030\002 \001" +
      "(\005\022\n\n\002id\030\003 \001(\005\022\013\n\003max\030\n \001(\001\022\013\n\003min\030\013 \001(\001" +
      "\022\014\n\004mean\030\014 \001(\001\022\022\n\nsumSquares\030\r \001(\001\"\177\n\024Ca" +
      "tegoricalInfoProto\022\014\n\004name\030\001 \001(\t\022\r\n\005coun" +
      "t\030\002 \001(\005\022\013\n\003key\030\n \003(\001\022\r\n\005value\030\013 \003(\003\022\026\n\016o" +
      "bserved_value\030\014 \001(\001\022\026\n\016observed_count\030\r " +
      "\001(\003\"\215\001\n\026CategoricalIDInfoProto\022\014\n\004name\030\001" +
      " \001(\t\022\r\n\005count\030\002 \001(\005\022\n\n\002id\030\003 \001(\005\022\013\n\003key\030\n" +
      " \003(\001\022\r\n\005value\030\013 \003(\003\022\026\n\016observed_value\030\014 " +
      "\001(\001\022\026\n\016observed_count\030\r \001(\003\"-\n\030MessageDi" +
      "gestHasherProto\022\021\n\thash_type\030\001 \001(\t\"+\n\026Mo" +
      "dHashCodeHasherProto\022\021\n\tdimension\030\001 \001(\005\"" +
      "Q\n\024SimpleTransformProto\022\n\n\002op\030\001 \001(\t\022\025\n\rf" +
      "irst_operand\030\002 \001(\001\022\026\n\016second_operand\030\003 \001" +
      "(\001\"t\n\032MeanStdDevTransformerProto\022\024\n\014obse" +
      "rvedMean\030\001 \001(\001\022\026\n\016observedStdDev\030\002 \001(\001\022\022" +
      "\n\ntargetMean\030\003 \001(\001\022\024\n\014targetStdDev\030\004 \001(\001" +
      "\"o\n\035LinearScalingTransformerProto\022\023\n\013obs" +
      "ervedMin\030\001 \001(\001\022\023\n\013observedMax\030\002 \001(\001\022\021\n\tt" +
      "argetMin\030\003 \001(\001\022\021\n\ttargetMax\030\004 \001(\001\",\n\023IDF" +
      "TransformerProto\022\n\n\002df\030\001 \001(\001\022\t\n\001N\030\002 \001(\001\"" +
      "M\n\027BinningTransformerProto\022\024\n\014binning_ty" +
      "pe\030\001 \001(\t\022\014\n\004bins\030\002 \003(\001\022\016\n\006values\030\003 \003(\001\"m" +
      "\n\031TestCountTransformerProto\022\r\n\005count\030\001 \001" +
      "(\005\022\023\n\013sparseCount\030\002 \001(\005\022\024\n\014countMapKeys\030" +
      "\003 \003(\001\022\026\n\016countMapValues\030\004 \003(\003B\032\n\026org.tri" +
      "buo.protos.coreP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tribuo.protos.core.TribuoCore.getDescriptor(),
          com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.getDescriptor(),
        });
    internal_static_tribuo_core_HashedFeatureMapProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tribuo_core_HashedFeatureMapProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_HashedFeatureMapProto_descriptor,
        new java.lang.String[] { "Hasher", "Info", });
    internal_static_tribuo_core_ImmutableFeatureMapProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tribuo_core_ImmutableFeatureMapProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_ImmutableFeatureMapProto_descriptor,
        new java.lang.String[] { "Info", });
    internal_static_tribuo_core_MutableFeatureMapProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tribuo_core_MutableFeatureMapProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_MutableFeatureMapProto_descriptor,
        new java.lang.String[] { "ConvertHighCardinality", "Info", });
    internal_static_tribuo_core_RealInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tribuo_core_RealInfoProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_RealInfoProto_descriptor,
        new java.lang.String[] { "Name", "Count", "Max", "Min", "Mean", "SumSquares", });
    internal_static_tribuo_core_RealIDInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tribuo_core_RealIDInfoProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_RealIDInfoProto_descriptor,
        new java.lang.String[] { "Name", "Count", "Id", "Max", "Min", "Mean", "SumSquares", });
    internal_static_tribuo_core_CategoricalInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tribuo_core_CategoricalInfoProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_CategoricalInfoProto_descriptor,
        new java.lang.String[] { "Name", "Count", "Key", "Value", "ObservedValue", "ObservedCount", });
    internal_static_tribuo_core_CategoricalIDInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tribuo_core_CategoricalIDInfoProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_CategoricalIDInfoProto_descriptor,
        new java.lang.String[] { "Name", "Count", "Id", "Key", "Value", "ObservedValue", "ObservedCount", });
    internal_static_tribuo_core_MessageDigestHasherProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tribuo_core_MessageDigestHasherProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_MessageDigestHasherProto_descriptor,
        new java.lang.String[] { "HashType", });
    internal_static_tribuo_core_ModHashCodeHasherProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tribuo_core_ModHashCodeHasherProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_ModHashCodeHasherProto_descriptor,
        new java.lang.String[] { "Dimension", });
    internal_static_tribuo_core_SimpleTransformProto_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tribuo_core_SimpleTransformProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_SimpleTransformProto_descriptor,
        new java.lang.String[] { "Op", "FirstOperand", "SecondOperand", });
    internal_static_tribuo_core_MeanStdDevTransformerProto_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_tribuo_core_MeanStdDevTransformerProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_MeanStdDevTransformerProto_descriptor,
        new java.lang.String[] { "ObservedMean", "ObservedStdDev", "TargetMean", "TargetStdDev", });
    internal_static_tribuo_core_LinearScalingTransformerProto_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_tribuo_core_LinearScalingTransformerProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_LinearScalingTransformerProto_descriptor,
        new java.lang.String[] { "ObservedMin", "ObservedMax", "TargetMin", "TargetMax", });
    internal_static_tribuo_core_IDFTransformerProto_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_tribuo_core_IDFTransformerProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_IDFTransformerProto_descriptor,
        new java.lang.String[] { "Df", "N", });
    internal_static_tribuo_core_BinningTransformerProto_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_tribuo_core_BinningTransformerProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_BinningTransformerProto_descriptor,
        new java.lang.String[] { "BinningType", "Bins", "Values", });
    internal_static_tribuo_core_TestCountTransformerProto_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_tribuo_core_TestCountTransformerProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_core_TestCountTransformerProto_descriptor,
        new java.lang.String[] { "Count", "SparseCount", "CountMapKeys", "CountMapValues", });
    org.tribuo.protos.core.TribuoCore.getDescriptor();
    com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
