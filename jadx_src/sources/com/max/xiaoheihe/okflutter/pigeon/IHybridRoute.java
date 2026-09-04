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
public class IHybridRoute {
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

    public static class FlutterRouterMethod {
        public static ChangeQuickRedirect changeQuickRedirect;

        @n0
        private final BinaryMessenger binaryMessenger;
        private final String messageChannelSuffix;

        public FlutterRouterMethod(@n0 BinaryMessenger binaryMessenger) {
            this(binaryMessenger, "");
        }

        public FlutterRouterMethod(@n0 BinaryMessenger binaryMessenger, @n0 String str) {
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
            return FlutterRouterMethodCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$getRouteEntryPointList$1(NullableResult nullableResult, String str, Object obj) {
            if (PatchProxy.proxy(new Object[]{nullableResult, str, obj}, null, changeQuickRedirect, true, 48032, new Class[]{NullableResult.class, String.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof List)) {
                nullableResult.error(IHybridRoute.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                nullableResult.error(new FlutterError((String) list.get(0), (String) list.get(1), (String) list.get(2)));
            } else {
                nullableResult.success((List) list.get(0));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$getRoutePathList$0(NullableResult nullableResult, String str, Object obj) {
            if (PatchProxy.proxy(new Object[]{nullableResult, str, obj}, null, changeQuickRedirect, true, 48033, new Class[]{NullableResult.class, String.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof List)) {
                nullableResult.error(IHybridRoute.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                nullableResult.error(new FlutterError((String) list.get(0), (String) list.get(1), (String) list.get(2)));
            } else {
                nullableResult.success((List) list.get(0));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onNativeResult$2(VoidResult voidResult, String str, Object obj) {
            if (PatchProxy.proxy(new Object[]{voidResult, str, obj}, null, changeQuickRedirect, true, 48031, new Class[]{VoidResult.class, String.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof List)) {
                voidResult.error(IHybridRoute.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), (String) list.get(2)));
            } else {
                voidResult.success();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$requestHostExit$3(VoidResult voidResult, String str, Object obj) {
            if (PatchProxy.proxy(new Object[]{voidResult, str, obj}, null, changeQuickRedirect, true, 48030, new Class[]{VoidResult.class, String.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof List)) {
                voidResult.error(IHybridRoute.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), (String) list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public void getRouteEntryPointList(@n0 final NullableResult<List<String>> nullableResult) {
            if (PatchProxy.proxy(new Object[]{nullableResult}, this, changeQuickRedirect, false, 48027, new Class[]{NullableResult.class}, Void.TYPE).isSupported) {
                return;
            }
            final String str = "dev.flutter.pigeon.heybox_okflutter.FlutterRouterMethod.getRouteEntryPointList" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(null, new BasicMessageChannel.Reply() { // from class: com.max.xiaoheihe.okflutter.pigeon.i
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    IHybridRoute.FlutterRouterMethod.lambda$getRouteEntryPointList$1(nullableResult, str, obj);
                }
            });
        }

        public void getRoutePathList(@n0 final NullableResult<List<String>> nullableResult) {
            if (PatchProxy.proxy(new Object[]{nullableResult}, this, changeQuickRedirect, false, 48026, new Class[]{NullableResult.class}, Void.TYPE).isSupported) {
                return;
            }
            final String str = "dev.flutter.pigeon.heybox_okflutter.FlutterRouterMethod.getRoutePathList" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(null, new BasicMessageChannel.Reply() { // from class: com.max.xiaoheihe.okflutter.pigeon.l
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    IHybridRoute.FlutterRouterMethod.lambda$getRoutePathList$0(nullableResult, str, obj);
                }
            });
        }

        public void onNativeResult(@p0 HybridRouteInfo hybridRouteInfo, @n0 final VoidResult voidResult) {
            if (PatchProxy.proxy(new Object[]{hybridRouteInfo, voidResult}, this, changeQuickRedirect, false, 48028, new Class[]{HybridRouteInfo.class, VoidResult.class}, Void.TYPE).isSupported) {
                return;
            }
            final String str = "dev.flutter.pigeon.heybox_okflutter.FlutterRouterMethod.onNativeResult" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(hybridRouteInfo)), new BasicMessageChannel.Reply() { // from class: com.max.xiaoheihe.okflutter.pigeon.k
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    IHybridRoute.FlutterRouterMethod.lambda$onNativeResult$2(voidResult, str, obj);
                }
            });
        }

        public void requestHostExit(@n0 final VoidResult voidResult) {
            if (PatchProxy.proxy(new Object[]{voidResult}, this, changeQuickRedirect, false, 48029, new Class[]{VoidResult.class}, Void.TYPE).isSupported) {
                return;
            }
            final String str = "dev.flutter.pigeon.heybox_okflutter.FlutterRouterMethod.requestHostExit" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(null, new BasicMessageChannel.Reply() { // from class: com.max.xiaoheihe.okflutter.pigeon.j
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    IHybridRoute.FlutterRouterMethod.lambda$requestHostExit$3(voidResult, str, obj);
                }
            });
        }
    }

    public static class FlutterRouterMethodCodec extends StandardMessageCodec {
        public static final FlutterRouterMethodCodec INSTANCE = new FlutterRouterMethodCodec();
        public static ChangeQuickRedirect changeQuickRedirect;

        private FlutterRouterMethodCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, @n0 ByteBuffer byteBuffer) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(b10), byteBuffer}, this, changeQuickRedirect, false, 48034, new Class[]{Byte.TYPE, ByteBuffer.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            return b10 != -128 ? super.readValueOfType(b10, byteBuffer) : HybridRouteInfo.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@n0 ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (PatchProxy.proxy(new Object[]{byteArrayOutputStream, obj}, this, changeQuickRedirect, false, 48035, new Class[]{ByteArrayOutputStream.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof HybridRouteInfo)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((HybridRouteInfo) obj).toList());
            }
        }
    }

    public interface HostRouterMethod {
        void bringToFront(@n0 String str, @n0 String str2);

        void disablePopGesture(@n0 String str);

        void enablePopGesture(@n0 String str);

        void pop(@p0 HybridRouteInfo hybridRouteInfo);

        void push(@p0 HybridRouteInfo hybridRouteInfo);
    }

    public static class HostRouterMethodCodec extends StandardMessageCodec {
        public static final HostRouterMethodCodec INSTANCE = new HostRouterMethodCodec();
        public static ChangeQuickRedirect changeQuickRedirect;

        private HostRouterMethodCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, @n0 ByteBuffer byteBuffer) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(b10), byteBuffer}, this, changeQuickRedirect, false, 48036, new Class[]{Byte.TYPE, ByteBuffer.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            return b10 != -128 ? super.readValueOfType(b10, byteBuffer) : HybridRouteInfo.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@n0 ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (PatchProxy.proxy(new Object[]{byteArrayOutputStream, obj}, this, changeQuickRedirect, false, 48037, new Class[]{ByteArrayOutputStream.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof HybridRouteInfo)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((HybridRouteInfo) obj).toList());
            }
        }
    }

    public static final class HybridRouteInfo {
        public static ChangeQuickRedirect changeQuickRedirect;

        @p0
        private String paramJson;

        @p0
        private String url;

        public static final class Builder {
            public static ChangeQuickRedirect changeQuickRedirect;

            @p0
            private String paramJson;

            @p0
            private String url;

            @n0
            public HybridRouteInfo build() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48040, new Class[0], HybridRouteInfo.class);
                if (patchProxyResultProxy.isSupported) {
                    return (HybridRouteInfo) patchProxyResultProxy.result;
                }
                HybridRouteInfo hybridRouteInfo = new HybridRouteInfo();
                hybridRouteInfo.setUrl(this.url);
                hybridRouteInfo.setParamJson(this.paramJson);
                return hybridRouteInfo;
            }

            @CanIgnoreReturnValue
            @n0
            public Builder setParamJson(@p0 String str) {
                this.paramJson = str;
                return this;
            }

            @CanIgnoreReturnValue
            @n0
            public Builder setUrl(@p0 String str) {
                this.url = str;
                return this;
            }
        }

        @n0
        static HybridRouteInfo fromList(@n0 ArrayList<Object> arrayList) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 48039, new Class[]{ArrayList.class}, HybridRouteInfo.class);
            if (patchProxyResultProxy.isSupported) {
                return (HybridRouteInfo) patchProxyResultProxy.result;
            }
            HybridRouteInfo hybridRouteInfo = new HybridRouteInfo();
            hybridRouteInfo.setUrl((String) arrayList.get(0));
            hybridRouteInfo.setParamJson((String) arrayList.get(1));
            return hybridRouteInfo;
        }

        @p0
        public String getParamJson() {
            return this.paramJson;
        }

        @p0
        public String getUrl() {
            return this.url;
        }

        public void setParamJson(@p0 String str) {
            this.paramJson = str;
        }

        public void setUrl(@p0 String str) {
            this.url = str;
        }

        @n0
        ArrayList<Object> toList() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48038, new Class[0], ArrayList.class);
            if (patchProxyResultProxy.isSupported) {
                return (ArrayList) patchProxyResultProxy.result;
            }
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.url);
            arrayList.add(this.paramJson);
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48025, new Class[]{String.class}, FlutterError.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterError) patchProxyResultProxy.result;
        }
        return new FlutterError("channel-error", "Unable to establish connection on channel: " + str + ".", "");
    }

    @n0
    public static ArrayList<Object> wrapError(@n0 Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, null, changeQuickRedirect, true, 48024, new Class[]{Throwable.class}, ArrayList.class);
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
