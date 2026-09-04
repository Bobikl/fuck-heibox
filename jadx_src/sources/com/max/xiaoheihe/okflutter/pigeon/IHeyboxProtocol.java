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
public class IHeyboxProtocol {
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

    public static class FlutterProtocol {
        public static ChangeQuickRedirect changeQuickRedirect;

        @n0
        private final BinaryMessenger binaryMessenger;
        private final String messageChannelSuffix;

        public FlutterProtocol(@n0 BinaryMessenger binaryMessenger) {
            this(binaryMessenger, "");
        }

        public FlutterProtocol(@n0 BinaryMessenger binaryMessenger, @n0 String str) {
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
            return FlutterProtocolCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$execute$0(NullableResult nullableResult, String str, Object obj) {
            if (PatchProxy.proxy(new Object[]{nullableResult, str, obj}, null, changeQuickRedirect, true, 47973, new Class[]{NullableResult.class, String.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof List)) {
                nullableResult.error(IHeyboxProtocol.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                nullableResult.error(new FlutterError((String) list.get(0), (String) list.get(1), (String) list.get(2)));
            } else {
                nullableResult.success((ProtocolResponse) list.get(0));
            }
        }

        public void execute(@n0 String str, @n0 final NullableResult<ProtocolResponse> nullableResult) {
            if (PatchProxy.proxy(new Object[]{str, nullableResult}, this, changeQuickRedirect, false, 47972, new Class[]{String.class, NullableResult.class}, Void.TYPE).isSupported) {
                return;
            }
            final String str2 = "dev.flutter.pigeon.heybox_okflutter.FlutterProtocol.execute" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Collections.singletonList(str)), new BasicMessageChannel.Reply() { // from class: com.max.xiaoheihe.okflutter.pigeon.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    IHeyboxProtocol.FlutterProtocol.lambda$execute$0(nullableResult, str2, obj);
                }
            });
        }
    }

    public static class FlutterProtocolCodec extends StandardMessageCodec {
        public static final FlutterProtocolCodec INSTANCE = new FlutterProtocolCodec();
        public static ChangeQuickRedirect changeQuickRedirect;

        private FlutterProtocolCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, @n0 ByteBuffer byteBuffer) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(b10), byteBuffer}, this, changeQuickRedirect, false, 47974, new Class[]{Byte.TYPE, ByteBuffer.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            return b10 != -128 ? super.readValueOfType(b10, byteBuffer) : ProtocolResponse.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@n0 ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (PatchProxy.proxy(new Object[]{byteArrayOutputStream, obj}, this, changeQuickRedirect, false, 47975, new Class[]{ByteArrayOutputStream.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof ProtocolResponse)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((ProtocolResponse) obj).toList());
            }
        }
    }

    public interface HeyboxProtocol {

        /* JADX INFO: renamed from: com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol$HeyboxProtocol$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            @n0
            public static MessageCodec<Object> a() {
                return HeyboxProtocolCodec.INSTANCE;
            }

            public static /* synthetic */ void b(HeyboxProtocol heyboxProtocol, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                heyboxProtocol.execute((String) ((ArrayList) obj).get(0), new NullableResult<ProtocolResponse>() { // from class: com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol.HeyboxProtocol.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol.NullableResult
                    public void error(Throwable th2) {
                        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 47977, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        reply.reply(IHeyboxProtocol.wrapError(th2));
                    }

                    /* JADX INFO: renamed from: success, reason: avoid collision after fix types in other method */
                    public void success2(ProtocolResponse protocolResponse) {
                        if (PatchProxy.proxy(new Object[]{protocolResponse}, this, changeQuickRedirect, false, 47976, new Class[]{ProtocolResponse.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        arrayList.add(0, protocolResponse);
                        reply.reply(arrayList);
                    }

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol.NullableResult
                    public /* bridge */ /* synthetic */ void success(ProtocolResponse protocolResponse) {
                        if (PatchProxy.proxy(new Object[]{protocolResponse}, this, changeQuickRedirect, false, 47978, new Class[]{Object.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        success2(protocolResponse);
                    }
                });
            }

            public static void c(@n0 BinaryMessenger binaryMessenger, @p0 HeyboxProtocol heyboxProtocol) {
                d(binaryMessenger, "", heyboxProtocol);
            }

            public static void d(@n0 BinaryMessenger binaryMessenger, @n0 String str, @p0 final HeyboxProtocol heyboxProtocol) {
                String str2;
                if (str.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "." + str;
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HeyboxProtocol.execute" + str2, a());
                if (heyboxProtocol != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.c
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            IHeyboxProtocol.HeyboxProtocol.CC.b(heyboxProtocol, obj, reply);
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
            }
        }

        void execute(@n0 String str, @n0 NullableResult<ProtocolResponse> nullableResult);
    }

    public static class HeyboxProtocolCodec extends StandardMessageCodec {
        public static final HeyboxProtocolCodec INSTANCE = new HeyboxProtocolCodec();
        public static ChangeQuickRedirect changeQuickRedirect;

        private HeyboxProtocolCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, @n0 ByteBuffer byteBuffer) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(b10), byteBuffer}, this, changeQuickRedirect, false, 47979, new Class[]{Byte.TYPE, ByteBuffer.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            return b10 != -128 ? super.readValueOfType(b10, byteBuffer) : ProtocolResponse.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@n0 ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (PatchProxy.proxy(new Object[]{byteArrayOutputStream, obj}, this, changeQuickRedirect, false, 47980, new Class[]{ByteArrayOutputStream.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof ProtocolResponse)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((ProtocolResponse) obj).toList());
            }
        }
    }

    public interface NullableResult<T> {
        void error(@n0 Throwable th2);

        void success(@p0 T t10);
    }

    public static final class ProtocolResponse {
        public static ChangeQuickRedirect changeQuickRedirect;

        @p0
        private String result;

        @n0
        private Long resultCode;

        public static final class Builder {
            public static ChangeQuickRedirect changeQuickRedirect;

            @p0
            private String result;

            @p0
            private Long resultCode;

            @n0
            public ProtocolResponse build() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47984, new Class[0], ProtocolResponse.class);
                if (patchProxyResultProxy.isSupported) {
                    return (ProtocolResponse) patchProxyResultProxy.result;
                }
                ProtocolResponse protocolResponse = new ProtocolResponse();
                protocolResponse.setResult(this.result);
                protocolResponse.setResultCode(this.resultCode);
                return protocolResponse;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setResult(@p0 String str) {
                this.result = str;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setResultCode(@n0 Long l10) {
                this.resultCode = l10;
                return this;
            }
        }

        ProtocolResponse() {
        }

        @n0
        static ProtocolResponse fromList(@n0 ArrayList<Object> arrayList) {
            Long lValueOf;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 47983, new Class[]{ArrayList.class}, ProtocolResponse.class);
            if (patchProxyResultProxy.isSupported) {
                return (ProtocolResponse) patchProxyResultProxy.result;
            }
            ProtocolResponse protocolResponse = new ProtocolResponse();
            protocolResponse.setResult((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            protocolResponse.setResultCode(lValueOf);
            return protocolResponse;
        }

        @p0
        public String getResult() {
            return this.result;
        }

        @n0
        public Long getResultCode() {
            return this.resultCode;
        }

        public void setResult(@p0 String str) {
            this.result = str;
        }

        public void setResultCode(@n0 Long l10) {
            if (PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, 47981, new Class[]{Long.class}, Void.TYPE).isSupported) {
                return;
            }
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"resultCode\" is null.");
            }
            this.resultCode = l10;
        }

        @n0
        ArrayList<Object> toList() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47982, new Class[0], ArrayList.class);
            if (patchProxyResultProxy.isSupported) {
                return (ArrayList) patchProxyResultProxy.result;
            }
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.result);
            arrayList.add(this.resultCode);
            return arrayList;
        }
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47971, new Class[]{String.class}, FlutterError.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterError) patchProxyResultProxy.result;
        }
        return new FlutterError("channel-error", "Unable to establish connection on channel: " + str + ".", "");
    }

    @n0
    public static ArrayList<Object> wrapError(@n0 Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, null, changeQuickRedirect, true, 47970, new Class[]{Throwable.class}, ArrayList.class);
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
