// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chatroom.proto

public final class Chatroom {
  private Chatroom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JoinRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JoinRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChatMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016chatroom.proto\032\033google/protobuf/empty." +
      "proto\032\037google/protobuf/timestamp.proto\"\036" +
      "\n\013JoinRequest\022\017\n\007room_id\030\001 \001(\t\"\203\001\n\013ChatM" +
      "essage\022\017\n\007user_id\030\001 \001(\t\022\017\n\007content\030\002 \001(\t" +
      "\022\017\n\007room_id\030\003 \001(\t\022\022\n\nmessage_id\030\004 \001(\t\022-\n" +
      "\ttimestamp\030\005 \001(\0132\032.google.protobuf.Times" +
      "tamp2b\n\010ChatRoom\022(\n\010JoinChat\022\014.JoinReque" +
      "st\032\014.ChatMessage0\001\022,\n\004Send\022\014.ChatMessage" +
      "\032\026.google.protobuf.EmptyB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_JoinRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JoinRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JoinRequest_descriptor,
        new java.lang.String[] { "RoomId", });
    internal_static_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChatMessage_descriptor,
        new java.lang.String[] { "UserId", "Content", "RoomId", "MessageId", "Timestamp", });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
