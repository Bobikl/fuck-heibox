package io.flutter.plugin.common;

import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class BasicMessageChannel<T> {
    public static final String CHANNEL_BUFFERS_CHANNEL = "dev.flutter/channel-buffers";
    private static final String TAG = "BasicMessageChannel#";

    @n0
    private final MessageCodec<T> codec;

    @n0
    private final BinaryMessenger messenger;

    @n0
    private final String name;

    @p0
    private final BinaryMessenger.TaskQueue taskQueue;

    public final class IncomingMessageHandler implements BinaryMessenger.BinaryMessageHandler {
        private final MessageHandler<T> handler;

        private IncomingMessageHandler(MessageHandler<T> messageHandler) {
            this.handler = messageHandler;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        public void onMessage(@p0 ByteBuffer byteBuffer, @n0 final BinaryMessenger.BinaryReply binaryReply) {
            try {
                this.handler.onMessage((T) BasicMessageChannel.this.codec.decodeMessage(byteBuffer), new Reply<T>() { // from class: io.flutter.plugin.common.BasicMessageChannel.IncomingMessageHandler.1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                    public void reply(T t10) {
                        binaryReply.reply(BasicMessageChannel.this.codec.encodeMessage(t10));
                    }
                });
            } catch (RuntimeException e10) {
                Log.e(BasicMessageChannel.TAG + BasicMessageChannel.this.name, "Failed to handle message", e10);
                binaryReply.reply(null);
            }
        }
    }

    public final class IncomingReplyHandler implements BinaryMessenger.BinaryReply {
        private final Reply<T> callback;

        private IncomingReplyHandler(Reply<T> reply) {
            this.callback = reply;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        public void reply(@p0 ByteBuffer byteBuffer) {
            try {
                this.callback.reply((T) BasicMessageChannel.this.codec.decodeMessage(byteBuffer));
            } catch (RuntimeException e10) {
                Log.e(BasicMessageChannel.TAG + BasicMessageChannel.this.name, "Failed to handle message reply", e10);
            }
        }
    }

    public interface MessageHandler<T> {
        void onMessage(@p0 T t10, @n0 Reply<T> reply);
    }

    public interface Reply<T> {
        void reply(@p0 T t10);
    }

    public BasicMessageChannel(@n0 BinaryMessenger binaryMessenger, @n0 String str, @n0 MessageCodec<T> messageCodec) {
        this(binaryMessenger, str, messageCodec, null);
    }

    public BasicMessageChannel(@n0 BinaryMessenger binaryMessenger, @n0 String str, @n0 MessageCodec<T> messageCodec, BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = messageCodec;
        this.taskQueue = taskQueue;
    }

    private static ByteBuffer packetFromEncodedMessage(ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iRemaining);
        byteBufferAllocateDirect.put(bArr);
        return byteBufferAllocateDirect;
    }

    public static void resizeChannelBuffer(@n0 BinaryMessenger binaryMessenger, @n0 String str, int i10) {
        binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall("resize", Arrays.asList(str, Integer.valueOf(i10))))));
    }

    public static void setWarnsOnChannelOverflow(@n0 BinaryMessenger binaryMessenger, @n0 String str, boolean z10) {
        binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall("overflow", Arrays.asList(str, Boolean.valueOf(!z10))))));
    }

    public void resizeChannelBuffer(int i10) {
        resizeChannelBuffer(this.messenger, this.name, i10);
    }

    public void send(@p0 T t10) {
        send(t10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @i1
    public void send(@p0 T t10, @p0 Reply<T> reply) {
        this.messenger.send(this.name, this.codec.encodeMessage(t10), reply != null ? new IncomingReplyHandler(reply) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.flutter.plugin.common.BinaryMessenger] */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.plugin.common.BasicMessageChannel$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.flutter.plugin.common.BinaryMessenger$BinaryMessageHandler] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @i1
    public void setMessageHandler(@p0 MessageHandler<T> messageHandler) {
        ?? r10 = 0;
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, messageHandler != null ? new IncomingMessageHandler(messageHandler) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, messageHandler != null ? new IncomingMessageHandler(messageHandler) : 0);
        }
    }

    public void setWarnsOnChannelOverflow(boolean z10) {
        setWarnsOnChannelOverflow(this.messenger, this.name, z10);
    }
}
