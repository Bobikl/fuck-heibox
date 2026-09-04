package io.flutter.plugin.common;

import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class MethodChannel {
    private static final String TAG = "MethodChannel#";
    private final MethodCodec codec;
    private final BinaryMessenger messenger;
    private final String name;
    private final BinaryMessenger.TaskQueue taskQueue;

    public final class IncomingMethodCallHandler implements BinaryMessenger.BinaryMessageHandler {
        private final MethodCallHandler handler;

        IncomingMethodCallHandler(MethodCallHandler methodCallHandler) {
            this.handler = methodCallHandler;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        @i1
        public void onMessage(ByteBuffer byteBuffer, final BinaryMessenger.BinaryReply binaryReply) {
            try {
                this.handler.onMethodCall(MethodChannel.this.codec.decodeMethodCall(byteBuffer), new Result() { // from class: io.flutter.plugin.common.MethodChannel.IncomingMethodCallHandler.1
                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void error(String str, String str2, Object obj) {
                        binaryReply.reply(MethodChannel.this.codec.encodeErrorEnvelope(str, str2, obj));
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void notImplemented() {
                        binaryReply.reply(null);
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void success(Object obj) {
                        binaryReply.reply(MethodChannel.this.codec.encodeSuccessEnvelope(obj));
                    }
                });
            } catch (RuntimeException e10) {
                Log.e(MethodChannel.TAG + MethodChannel.this.name, "Failed to handle method call", e10);
                binaryReply.reply(MethodChannel.this.codec.encodeErrorEnvelopeWithStacktrace("error", e10.getMessage(), null, Log.getStackTraceString(e10)));
            }
        }
    }

    public final class IncomingResultHandler implements BinaryMessenger.BinaryReply {
        private final Result callback;

        IncomingResultHandler(Result result) {
            this.callback = result;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        @i1
        public void reply(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.callback.notImplemented();
                } else {
                    try {
                        this.callback.success(MethodChannel.this.codec.decodeEnvelope(byteBuffer));
                    } catch (FlutterException e10) {
                        this.callback.error(e10.code, e10.getMessage(), e10.details);
                    }
                }
            } catch (RuntimeException e11) {
                Log.e(MethodChannel.TAG + MethodChannel.this.name, "Failed to handle method call result", e11);
            }
        }
    }

    public interface MethodCallHandler {
        @i1
        void onMethodCall(@n0 MethodCall methodCall, @n0 Result result);
    }

    public interface Result {
        void error(@n0 String str, @p0 String str2, @p0 Object obj);

        void notImplemented();

        void success(@p0 Object obj);
    }

    public MethodChannel(@n0 BinaryMessenger binaryMessenger, @n0 String str) {
        this(binaryMessenger, str, StandardMethodCodec.INSTANCE);
    }

    public MethodChannel(@n0 BinaryMessenger binaryMessenger, @n0 String str, @n0 MethodCodec methodCodec) {
        this(binaryMessenger, str, methodCodec, null);
    }

    public MethodChannel(@n0 BinaryMessenger binaryMessenger, @n0 String str, @n0 MethodCodec methodCodec, @p0 BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = methodCodec;
        this.taskQueue = taskQueue;
    }

    @i1
    public void invokeMethod(@n0 String str, @p0 Object obj) {
        invokeMethod(str, obj, null);
    }

    @i1
    public void invokeMethod(@n0 String str, @p0 Object obj, @p0 Result result) {
        this.messenger.send(this.name, this.codec.encodeMethodCall(new MethodCall(str, obj)), result == null ? null : new IncomingResultHandler(result));
    }

    public void resizeChannelBuffer(int i10) {
        BasicMessageChannel.resizeChannelBuffer(this.messenger, this.name, i10);
    }

    @i1
    public void setMethodCallHandler(@p0 MethodCallHandler methodCallHandler) {
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, methodCallHandler != null ? new IncomingMethodCallHandler(methodCallHandler) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, methodCallHandler != null ? new IncomingMethodCallHandler(methodCallHandler) : null);
        }
    }

    public void setWarnsOnChannelOverflow(boolean z10) {
        BasicMessageChannel.setWarnsOnChannelOverflow(this.messenger, this.name, z10);
    }
}
