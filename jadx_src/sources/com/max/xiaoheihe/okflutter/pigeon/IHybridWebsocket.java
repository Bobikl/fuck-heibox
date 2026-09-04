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

/* JADX INFO: loaded from: classes13.dex */
public class IHybridWebsocket {
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

    public static class FlutterWebsocket {
        public static ChangeQuickRedirect changeQuickRedirect;

        @n0
        private final BinaryMessenger binaryMessenger;
        private final String messageChannelSuffix;

        public FlutterWebsocket(@n0 BinaryMessenger binaryMessenger) {
            this(binaryMessenger, "");
        }

        public FlutterWebsocket(@n0 BinaryMessenger binaryMessenger, @n0 String str) {
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
            return FlutterWebsocketCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$handleMessage$1(Result result, String str, Object obj) {
            if (PatchProxy.proxy(new Object[]{result, str, obj}, null, changeQuickRedirect, true, 48066, new Class[]{Result.class, String.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof List)) {
                result.error(IHybridWebsocket.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                result.error(new FlutterError((String) list.get(0), (String) list.get(1), (String) list.get(2)));
            } else if (list.get(0) == null) {
                result.error(new FlutterError("null-error", "Flutter api returned null value for non-null return value.", ""));
            } else {
                result.success((HybridWebsocketResult) list.get(0));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onClose$0(VoidResult voidResult, String str, Object obj) {
            if (PatchProxy.proxy(new Object[]{voidResult, str, obj}, null, changeQuickRedirect, true, 48067, new Class[]{VoidResult.class, String.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof List)) {
                voidResult.error(IHybridWebsocket.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), (String) list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public void handleMessage(@n0 String str, @n0 final Result<HybridWebsocketResult> result) {
            if (PatchProxy.proxy(new Object[]{str, result}, this, changeQuickRedirect, false, 48065, new Class[]{String.class, Result.class}, Void.TYPE).isSupported) {
                return;
            }
            final String str2 = "dev.flutter.pigeon.heybox_okflutter.FlutterWebsocket.handleMessage" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Collections.singletonList(str)), new BasicMessageChannel.Reply() { // from class: com.max.xiaoheihe.okflutter.pigeon.w
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    IHybridWebsocket.FlutterWebsocket.lambda$handleMessage$1(result, str2, obj);
                }
            });
        }

        public void onClose(@n0 final VoidResult voidResult) {
            if (PatchProxy.proxy(new Object[]{voidResult}, this, changeQuickRedirect, false, 48064, new Class[]{VoidResult.class}, Void.TYPE).isSupported) {
                return;
            }
            final String str = "dev.flutter.pigeon.heybox_okflutter.FlutterWebsocket.onClose" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(null, new BasicMessageChannel.Reply() { // from class: com.max.xiaoheihe.okflutter.pigeon.v
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    IHybridWebsocket.FlutterWebsocket.lambda$onClose$0(voidResult, str, obj);
                }
            });
        }
    }

    public static class FlutterWebsocketCodec extends StandardMessageCodec {
        public static final FlutterWebsocketCodec INSTANCE = new FlutterWebsocketCodec();
        public static ChangeQuickRedirect changeQuickRedirect;

        private FlutterWebsocketCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, @n0 ByteBuffer byteBuffer) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(b10), byteBuffer}, this, changeQuickRedirect, false, 48068, new Class[]{Byte.TYPE, ByteBuffer.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            return b10 != -128 ? super.readValueOfType(b10, byteBuffer) : HybridWebsocketResult.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@n0 ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (PatchProxy.proxy(new Object[]{byteArrayOutputStream, obj}, this, changeQuickRedirect, false, 48069, new Class[]{ByteArrayOutputStream.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof HybridWebsocketResult)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((HybridWebsocketResult) obj).toList());
            }
        }
    }

    public interface HybridWebsocket {

        /* JADX INFO: renamed from: com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket$HybridWebsocket$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            @n0
            public static MessageCodec<Object> a() {
                return HybridWebsocketCodec.INSTANCE;
            }

            public static /* synthetic */ void b(HybridWebsocket hybridWebsocket, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, hybridWebsocket.checkStatus());
                } catch (Throwable th2) {
                    arrayList = IHybridWebsocket.wrapError(th2);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void c(HybridWebsocket hybridWebsocket, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                hybridWebsocket.push((String) arrayList2.get(0), (Boolean) arrayList2.get(1), new NullableResult<HybridWebsocketResponse>() { // from class: com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.HybridWebsocket.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.NullableResult
                    public void error(Throwable th2) {
                        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 48071, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        reply.reply(IHybridWebsocket.wrapError(th2));
                    }

                    /* JADX INFO: renamed from: success, reason: avoid collision after fix types in other method */
                    public void success2(HybridWebsocketResponse hybridWebsocketResponse) {
                        if (PatchProxy.proxy(new Object[]{hybridWebsocketResponse}, this, changeQuickRedirect, false, 48070, new Class[]{HybridWebsocketResponse.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        arrayList.add(0, hybridWebsocketResponse);
                        reply.reply(arrayList);
                    }

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.NullableResult
                    public /* bridge */ /* synthetic */ void success(HybridWebsocketResponse hybridWebsocketResponse) {
                        if (PatchProxy.proxy(new Object[]{hybridWebsocketResponse}, this, changeQuickRedirect, false, 48072, new Class[]{Object.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        success2(hybridWebsocketResponse);
                    }
                });
            }

            public static /* synthetic */ void d(HybridWebsocket hybridWebsocket, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                hybridWebsocket.pushForResult(number == null ? null : Long.valueOf(number.longValue()), (String) arrayList2.get(1), (Boolean) arrayList2.get(2), new Result<HybridWebsocketResponse>() { // from class: com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.HybridWebsocket.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.Result
                    public void error(Throwable th2) {
                        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 48074, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        reply.reply(IHybridWebsocket.wrapError(th2));
                    }

                    /* JADX INFO: renamed from: success, reason: avoid collision after fix types in other method */
                    public void success2(HybridWebsocketResponse hybridWebsocketResponse) {
                        if (PatchProxy.proxy(new Object[]{hybridWebsocketResponse}, this, changeQuickRedirect, false, 48073, new Class[]{HybridWebsocketResponse.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        arrayList.add(0, hybridWebsocketResponse);
                        reply.reply(arrayList);
                    }

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.Result
                    public /* bridge */ /* synthetic */ void success(HybridWebsocketResponse hybridWebsocketResponse) {
                        if (PatchProxy.proxy(new Object[]{hybridWebsocketResponse}, this, changeQuickRedirect, false, 48075, new Class[]{Object.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        success2(hybridWebsocketResponse);
                    }
                });
            }

            public static void e(@n0 BinaryMessenger binaryMessenger, @p0 HybridWebsocket hybridWebsocket) {
                f(binaryMessenger, "", hybridWebsocket);
            }

            public static void f(@n0 BinaryMessenger binaryMessenger, @n0 String str, @p0 final HybridWebsocket hybridWebsocket) {
                String str2;
                if (str.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "." + str;
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HybridWebsocket.checkStatus" + str2, a());
                if (hybridWebsocket != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.x
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            IHybridWebsocket.HybridWebsocket.CC.b(hybridWebsocket, obj, reply);
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HybridWebsocket.push" + str2, a());
                if (hybridWebsocket != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.y
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            IHybridWebsocket.HybridWebsocket.CC.c(hybridWebsocket, obj, reply);
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HybridWebsocket.pushForResult" + str2, a());
                if (hybridWebsocket != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.z
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            IHybridWebsocket.HybridWebsocket.CC.d(hybridWebsocket, obj, reply);
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
            }
        }

        @n0
        HybridWebsocketResponse checkStatus();

        void push(@n0 String str, @n0 Boolean bool, @n0 NullableResult<HybridWebsocketResponse> nullableResult);

        void pushForResult(@n0 Long l10, @n0 String str, @n0 Boolean bool, @n0 Result<HybridWebsocketResponse> result);
    }

    public static class HybridWebsocketCodec extends StandardMessageCodec {
        public static final HybridWebsocketCodec INSTANCE = new HybridWebsocketCodec();
        public static ChangeQuickRedirect changeQuickRedirect;

        private HybridWebsocketCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, @n0 ByteBuffer byteBuffer) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(b10), byteBuffer}, this, changeQuickRedirect, false, 48076, new Class[]{Byte.TYPE, ByteBuffer.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (b10 != -128 && b10 != -127) {
                return super.readValueOfType(b10, byteBuffer);
            }
            return HybridWebsocketResponse.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@n0 ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (PatchProxy.proxy(new Object[]{byteArrayOutputStream, obj}, this, changeQuickRedirect, false, 48077, new Class[]{ByteArrayOutputStream.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            boolean z10 = obj instanceof HybridWebsocketResponse;
            if (z10) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((HybridWebsocketResponse) obj).toList());
            } else if (!z10) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((HybridWebsocketResponse) obj).toList());
            }
        }
    }

    public static final class HybridWebsocketResponse {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @p0
        private Long f94853id;

        @p0
        private String result;

        @n0
        private HybridWebsocketStatus status;

        public static final class Builder {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @p0
            private Long f94854id;

            @p0
            private String result;

            @p0
            private HybridWebsocketStatus status;

            @n0
            public HybridWebsocketResponse build() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48081, new Class[0], HybridWebsocketResponse.class);
                if (patchProxyResultProxy.isSupported) {
                    return (HybridWebsocketResponse) patchProxyResultProxy.result;
                }
                HybridWebsocketResponse hybridWebsocketResponse = new HybridWebsocketResponse();
                hybridWebsocketResponse.setStatus(this.status);
                hybridWebsocketResponse.setId(this.f94854id);
                hybridWebsocketResponse.setResult(this.result);
                return hybridWebsocketResponse;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setId(@p0 Long l10) {
                this.f94854id = l10;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setResult(@p0 String str) {
                this.result = str;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setStatus(@n0 HybridWebsocketStatus hybridWebsocketStatus) {
                this.status = hybridWebsocketStatus;
                return this;
            }
        }

        HybridWebsocketResponse() {
        }

        @n0
        static HybridWebsocketResponse fromList(@n0 ArrayList<Object> arrayList) {
            Long lValueOf;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 48080, new Class[]{ArrayList.class}, HybridWebsocketResponse.class);
            if (patchProxyResultProxy.isSupported) {
                return (HybridWebsocketResponse) patchProxyResultProxy.result;
            }
            HybridWebsocketResponse hybridWebsocketResponse = new HybridWebsocketResponse();
            hybridWebsocketResponse.setStatus(HybridWebsocketStatus.valuesCustom()[((Integer) arrayList.get(0)).intValue()]);
            Object obj = arrayList.get(1);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            hybridWebsocketResponse.setId(lValueOf);
            hybridWebsocketResponse.setResult((String) arrayList.get(2));
            return hybridWebsocketResponse;
        }

        @p0
        public Long getId() {
            return this.f94853id;
        }

        @p0
        public String getResult() {
            return this.result;
        }

        @n0
        public HybridWebsocketStatus getStatus() {
            return this.status;
        }

        public void setId(@p0 Long l10) {
            this.f94853id = l10;
        }

        public void setResult(@p0 String str) {
            this.result = str;
        }

        public void setStatus(@n0 HybridWebsocketStatus hybridWebsocketStatus) {
            if (PatchProxy.proxy(new Object[]{hybridWebsocketStatus}, this, changeQuickRedirect, false, 48078, new Class[]{HybridWebsocketStatus.class}, Void.TYPE).isSupported) {
                return;
            }
            if (hybridWebsocketStatus == null) {
                throw new IllegalStateException("Nonnull field \"status\" is null.");
            }
            this.status = hybridWebsocketStatus;
        }

        @n0
        ArrayList<Object> toList() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48079, new Class[0], ArrayList.class);
            if (patchProxyResultProxy.isSupported) {
                return (ArrayList) patchProxyResultProxy.result;
            }
            ArrayList<Object> arrayList = new ArrayList<>(3);
            HybridWebsocketStatus hybridWebsocketStatus = this.status;
            arrayList.add(hybridWebsocketStatus == null ? null : Integer.valueOf(hybridWebsocketStatus.index));
            arrayList.add(this.f94853id);
            arrayList.add(this.result);
            return arrayList;
        }
    }

    public static final class HybridWebsocketResult {
        public static ChangeQuickRedirect changeQuickRedirect;

        @n0
        private Long resultCode;

        public static final class Builder {
            public static ChangeQuickRedirect changeQuickRedirect;

            @p0
            private Long resultCode;

            @n0
            public HybridWebsocketResult build() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48085, new Class[0], HybridWebsocketResult.class);
                if (patchProxyResultProxy.isSupported) {
                    return (HybridWebsocketResult) patchProxyResultProxy.result;
                }
                HybridWebsocketResult hybridWebsocketResult = new HybridWebsocketResult();
                hybridWebsocketResult.setResultCode(this.resultCode);
                return hybridWebsocketResult;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setResultCode(@n0 Long l10) {
                this.resultCode = l10;
                return this;
            }
        }

        HybridWebsocketResult() {
        }

        @n0
        static HybridWebsocketResult fromList(@n0 ArrayList<Object> arrayList) {
            Long lValueOf;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 48084, new Class[]{ArrayList.class}, HybridWebsocketResult.class);
            if (patchProxyResultProxy.isSupported) {
                return (HybridWebsocketResult) patchProxyResultProxy.result;
            }
            HybridWebsocketResult hybridWebsocketResult = new HybridWebsocketResult();
            Object obj = arrayList.get(0);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            hybridWebsocketResult.setResultCode(lValueOf);
            return hybridWebsocketResult;
        }

        @n0
        public Long getResultCode() {
            return this.resultCode;
        }

        public void setResultCode(@n0 Long l10) {
            if (PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, 48082, new Class[]{Long.class}, Void.TYPE).isSupported) {
                return;
            }
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"resultCode\" is null.");
            }
            this.resultCode = l10;
        }

        @n0
        ArrayList<Object> toList() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48083, new Class[0], ArrayList.class);
            if (patchProxyResultProxy.isSupported) {
                return (ArrayList) patchProxyResultProxy.result;
            }
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.resultCode);
            return arrayList;
        }
    }

    public enum HybridWebsocketStatus {
        OK(0),
        FAILED(1),
        CANCELED(2);

        public static ChangeQuickRedirect changeQuickRedirect;
        final int index;

        HybridWebsocketStatus(int i10) {
            this.index = i10;
        }

        public static HybridWebsocketStatus valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48087, new Class[]{String.class}, HybridWebsocketStatus.class);
            return patchProxyResultProxy.isSupported ? (HybridWebsocketStatus) patchProxyResultProxy.result : (HybridWebsocketStatus) Enum.valueOf(HybridWebsocketStatus.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static HybridWebsocketStatus[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48086, new Class[0], HybridWebsocketStatus[].class);
            return patchProxyResultProxy.isSupported ? (HybridWebsocketStatus[]) patchProxyResultProxy.result : (HybridWebsocketStatus[]) values().clone();
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48063, new Class[]{String.class}, FlutterError.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterError) patchProxyResultProxy.result;
        }
        return new FlutterError("channel-error", "Unable to establish connection on channel: " + str + ".", "");
    }

    @n0
    public static ArrayList<Object> wrapError(@n0 Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, null, changeQuickRedirect, true, 48062, new Class[]{Throwable.class}, ArrayList.class);
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
