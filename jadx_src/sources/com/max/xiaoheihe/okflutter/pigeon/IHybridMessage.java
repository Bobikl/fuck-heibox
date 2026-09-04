package com.max.xiaoheihe.okflutter.pigeon;

import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class IHybridMessage {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface CanIgnoreReturnValue {
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@n0 String str, @p0 String str2, @p0 Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public static class FlutterMessageHandler {
        public static ChangeQuickRedirect changeQuickRedirect;

        @n0
        private final BinaryMessenger binaryMessenger;
        private final String messageChannelSuffix;

        public FlutterMessageHandler(@n0 BinaryMessenger binaryMessenger) {
            this(binaryMessenger, "");
        }

        public FlutterMessageHandler(@n0 BinaryMessenger binaryMessenger, @n0 String str) {
            String str2;
            this.binaryMessenger = binaryMessenger;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            this.messageChannelSuffix = str2;
        }

        @n0
        static MessageCodec<Object> getCodec() {
            return FlutterMessageHandlerCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$handleHostMessage$0(NullableResult nullableResult, String str, Object obj) {
            if (PatchProxy.proxy(new Object[]{nullableResult, str, obj}, null, changeQuickRedirect, true, 47988, new Class[]{NullableResult.class, String.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof List)) {
                nullableResult.error(IHybridMessage.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                nullableResult.error(new FlutterError((String) list.get(0), (String) list.get(1), (String) list.get(2)));
            } else {
                nullableResult.success((HybridMessageResponse) list.get(0));
            }
        }

        public void handleHostMessage(@p0 HybridMessageInfo hybridMessageInfo, @n0 final NullableResult<HybridMessageResponse> nullableResult) {
            if (PatchProxy.proxy(new Object[]{hybridMessageInfo, nullableResult}, this, changeQuickRedirect, false, 47987, new Class[]{HybridMessageInfo.class, NullableResult.class}, Void.TYPE).isSupported) {
                return;
            }
            final String str = "dev.flutter.pigeon.heybox_okflutter.FlutterMessageHandler.handleHostMessage" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(hybridMessageInfo)), new BasicMessageChannel.Reply() { // from class: com.max.xiaoheihe.okflutter.pigeon.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    IHybridMessage.FlutterMessageHandler.lambda$handleHostMessage$0(nullableResult, str, obj);
                }
            });
        }
    }

    public static class FlutterMessageHandlerCodec extends StandardMessageCodec {
        public static final FlutterMessageHandlerCodec INSTANCE = new FlutterMessageHandlerCodec();
        public static ChangeQuickRedirect changeQuickRedirect;

        private FlutterMessageHandlerCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, @n0 ByteBuffer byteBuffer) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(b10), byteBuffer}, this, changeQuickRedirect, false, 47989, new Class[]{Byte.TYPE, ByteBuffer.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (b10 != -128) {
                return b10 != -127 ? super.readValueOfType(b10, byteBuffer) : HybridMessageResponse.fromList((ArrayList) readValue(byteBuffer));
            }
            return HybridMessageInfo.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@n0 ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (PatchProxy.proxy(new Object[]{byteArrayOutputStream, obj}, this, changeQuickRedirect, false, 47990, new Class[]{ByteArrayOutputStream.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (obj instanceof HybridMessageInfo) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((HybridMessageInfo) obj).toList());
            } else if (!(obj instanceof HybridMessageResponse)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((HybridMessageResponse) obj).toList());
            }
        }
    }

    public interface HostMessageHandler {

        /* JADX INFO: renamed from: com.max.xiaoheihe.okflutter.pigeon.IHybridMessage$HostMessageHandler$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            @n0
            public static MessageCodec<Object> a() {
                return HostMessageHandlerCodec.INSTANCE;
            }

            public static /* synthetic */ void b(HostMessageHandler hostMessageHandler, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                hostMessageHandler.handleFlutterMessage((HybridMessageInfo) ((ArrayList) obj).get(0), new NullableResult<HybridMessageResponse>() { // from class: com.max.xiaoheihe.okflutter.pigeon.IHybridMessage.HostMessageHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridMessage.NullableResult
                    public void error(Throwable th2) {
                        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 47992, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        reply.reply(IHybridMessage.wrapError(th2));
                    }

                    /* JADX INFO: renamed from: success, reason: avoid collision after fix types in other method */
                    public void success2(HybridMessageResponse hybridMessageResponse) {
                        if (PatchProxy.proxy(new Object[]{hybridMessageResponse}, this, changeQuickRedirect, false, 47991, new Class[]{HybridMessageResponse.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        arrayList.add(0, hybridMessageResponse);
                        reply.reply(arrayList);
                    }

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridMessage.NullableResult
                    public /* bridge */ /* synthetic */ void success(HybridMessageResponse hybridMessageResponse) {
                        if (PatchProxy.proxy(new Object[]{hybridMessageResponse}, this, changeQuickRedirect, false, 47993, new Class[]{Object.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        success2(hybridMessageResponse);
                    }
                });
            }

            public static void c(@n0 BinaryMessenger binaryMessenger, @p0 HostMessageHandler hostMessageHandler) {
                d(binaryMessenger, "", hostMessageHandler);
            }

            public static void d(@n0 BinaryMessenger binaryMessenger, @n0 String str, @p0 final HostMessageHandler hostMessageHandler) {
                String str2;
                if (str.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "." + str;
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HostMessageHandler.handleFlutterMessage" + str2, a());
                if (hostMessageHandler != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.e
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            IHybridMessage.HostMessageHandler.CC.b(hostMessageHandler, obj, reply);
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
            }
        }

        void handleFlutterMessage(@p0 HybridMessageInfo hybridMessageInfo, @n0 NullableResult<HybridMessageResponse> nullableResult);
    }

    public static class HostMessageHandlerCodec extends StandardMessageCodec {
        public static final HostMessageHandlerCodec INSTANCE = new HostMessageHandlerCodec();
        public static ChangeQuickRedirect changeQuickRedirect;

        private HostMessageHandlerCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, @n0 ByteBuffer byteBuffer) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(b10), byteBuffer}, this, changeQuickRedirect, false, 47994, new Class[]{Byte.TYPE, ByteBuffer.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (b10 != -128) {
                return b10 != -127 ? super.readValueOfType(b10, byteBuffer) : HybridMessageResponse.fromList((ArrayList) readValue(byteBuffer));
            }
            return HybridMessageInfo.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@n0 ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (PatchProxy.proxy(new Object[]{byteArrayOutputStream, obj}, this, changeQuickRedirect, false, 47995, new Class[]{ByteArrayOutputStream.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (obj instanceof HybridMessageInfo) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((HybridMessageInfo) obj).toList());
            } else if (!(obj instanceof HybridMessageResponse)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((HybridMessageResponse) obj).toList());
            }
        }
    }

    public static final class HybridMessageInfo {
        public static ChangeQuickRedirect changeQuickRedirect;

        @p0
        private String name;

        @p0
        private Map<String, String> params;

        public static final class Builder {
            public static ChangeQuickRedirect changeQuickRedirect;

            @p0
            private String name;

            @p0
            private Map<String, String> params;

            @n0
            public HybridMessageInfo build() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47998, new Class[0], HybridMessageInfo.class);
                if (patchProxyResultProxy.isSupported) {
                    return (HybridMessageInfo) patchProxyResultProxy.result;
                }
                HybridMessageInfo hybridMessageInfo = new HybridMessageInfo();
                hybridMessageInfo.setName(this.name);
                hybridMessageInfo.setParams(this.params);
                return hybridMessageInfo;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setName(@p0 String str) {
                this.name = str;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setParams(@p0 Map<String, String> map) {
                this.params = map;
                return this;
            }
        }

        @n0
        static HybridMessageInfo fromList(@n0 ArrayList<Object> arrayList) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 47997, new Class[]{ArrayList.class}, HybridMessageInfo.class);
            if (patchProxyResultProxy.isSupported) {
                return (HybridMessageInfo) patchProxyResultProxy.result;
            }
            HybridMessageInfo hybridMessageInfo = new HybridMessageInfo();
            hybridMessageInfo.setName((String) arrayList.get(0));
            hybridMessageInfo.setParams((Map) arrayList.get(1));
            return hybridMessageInfo;
        }

        @p0
        public String getName() {
            return this.name;
        }

        @p0
        public Map<String, String> getParams() {
            return this.params;
        }

        public void setName(@p0 String str) {
            this.name = str;
        }

        public void setParams(@p0 Map<String, String> map) {
            this.params = map;
        }

        @n0
        ArrayList<Object> toList() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47996, new Class[0], ArrayList.class);
            if (patchProxyResultProxy.isSupported) {
                return (ArrayList) patchProxyResultProxy.result;
            }
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.name);
            arrayList.add(this.params);
            return arrayList;
        }
    }

    public static final class HybridMessageResponse {
        public static ChangeQuickRedirect changeQuickRedirect;

        @p0
        private String result;

        public static final class Builder {
            public static ChangeQuickRedirect changeQuickRedirect;

            @p0
            private String result;

            @n0
            public HybridMessageResponse build() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48001, new Class[0], HybridMessageResponse.class);
                if (patchProxyResultProxy.isSupported) {
                    return (HybridMessageResponse) patchProxyResultProxy.result;
                }
                HybridMessageResponse hybridMessageResponse = new HybridMessageResponse();
                hybridMessageResponse.setResult(this.result);
                return hybridMessageResponse;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setResult(@p0 String str) {
                this.result = str;
                return this;
            }
        }

        @n0
        static HybridMessageResponse fromList(@n0 ArrayList<Object> arrayList) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 48000, new Class[]{ArrayList.class}, HybridMessageResponse.class);
            if (patchProxyResultProxy.isSupported) {
                return (HybridMessageResponse) patchProxyResultProxy.result;
            }
            HybridMessageResponse hybridMessageResponse = new HybridMessageResponse();
            hybridMessageResponse.setResult((String) arrayList.get(0));
            return hybridMessageResponse;
        }

        @p0
        public String getResult() {
            return this.result;
        }

        public void setResult(@p0 String str) {
            this.result = str;
        }

        @n0
        ArrayList<Object> toList() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47999, new Class[0], ArrayList.class);
            if (patchProxyResultProxy.isSupported) {
                return (ArrayList) patchProxyResultProxy.result;
            }
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.result);
            return arrayList;
        }
    }

    public interface NullableResult<T> {
        void error(@n0 Throwable th2);

        void success(@p0 T t10);
    }

    public interface Result<T> {
        void error(@n0 Throwable th2);

        void success(@n0 T t10);
    }

    public interface VoidResult {
        void error(@n0 Throwable th2);

        void success();
    }

    @n0
    public static FlutterError createConnectionError(@n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47986, new Class[]{String.class}, FlutterError.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterError) patchProxyResultProxy.result;
        }
        return new FlutterError("channel-error", "Unable to establish connection on channel: " + str + ".", "");
    }

    @n0
    public static ArrayList<Object> wrapError(@n0 Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, null, changeQuickRedirect, true, 47985, new Class[]{Throwable.class}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th2 instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th2;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th2.toString());
            arrayList.add(th2.getClass().getSimpleName());
            arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        }
        return arrayList;
    }
}
