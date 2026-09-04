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
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class IHybridNetwork {
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

    public interface HybridNetwork {

        /* JADX INFO: renamed from: com.max.xiaoheihe.okflutter.pigeon.IHybridNetwork$HybridNetwork$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            @n0
            public static MessageCodec<Object> a() {
                return HybridNetworkCodec.INSTANCE;
            }

            public static /* synthetic */ void b(HybridNetwork hybridNetwork, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                hybridNetwork.request(RequestType.valuesCustom()[((Integer) arrayList2.get(0)).intValue()], (String) arrayList2.get(1), (Map) arrayList2.get(2), (Map) arrayList2.get(3), (Map) arrayList2.get(4), (Boolean) arrayList2.get(5), (Boolean) arrayList2.get(6), (Boolean) arrayList2.get(7), new Result<HybridResponse>() { // from class: com.max.xiaoheihe.okflutter.pigeon.IHybridNetwork.HybridNetwork.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridNetwork.Result
                    public void error(Throwable th2) {
                        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 48004, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        reply.reply(IHybridNetwork.wrapError(th2));
                    }

                    /* JADX INFO: renamed from: success, reason: avoid collision after fix types in other method */
                    public void success2(HybridResponse hybridResponse) {
                        if (PatchProxy.proxy(new Object[]{hybridResponse}, this, changeQuickRedirect, false, 48003, new Class[]{HybridResponse.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        arrayList.add(0, hybridResponse);
                        reply.reply(arrayList);
                    }

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridNetwork.Result
                    public /* bridge */ /* synthetic */ void success(HybridResponse hybridResponse) {
                        if (PatchProxy.proxy(new Object[]{hybridResponse}, this, changeQuickRedirect, false, 48005, new Class[]{Object.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        success2(hybridResponse);
                    }
                });
            }

            public static void c(@n0 BinaryMessenger binaryMessenger, @p0 HybridNetwork hybridNetwork) {
                d(binaryMessenger, "", hybridNetwork);
            }

            public static void d(@n0 BinaryMessenger binaryMessenger, @n0 String str, @p0 final HybridNetwork hybridNetwork) {
                String str2;
                if (str.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "." + str;
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HybridNetwork.request" + str2, a());
                if (hybridNetwork != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.f
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            IHybridNetwork.HybridNetwork.CC.b(hybridNetwork, obj, reply);
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
            }
        }

        void request(@n0 RequestType requestType, @n0 String str, @n0 Map<String, Object> map, @n0 Map<String, Object> map2, @n0 Map<String, Object> map3, @n0 Boolean bool, @n0 Boolean bool2, @n0 Boolean bool3, @n0 Result<HybridResponse> result);
    }

    public static class HybridNetworkCodec extends StandardMessageCodec {
        public static final HybridNetworkCodec INSTANCE = new HybridNetworkCodec();
        public static ChangeQuickRedirect changeQuickRedirect;

        private HybridNetworkCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, @n0 ByteBuffer byteBuffer) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(b10), byteBuffer}, this, changeQuickRedirect, false, 48006, new Class[]{Byte.TYPE, ByteBuffer.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            return b10 != -128 ? super.readValueOfType(b10, byteBuffer) : HybridResponse.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@n0 ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (PatchProxy.proxy(new Object[]{byteArrayOutputStream, obj}, this, changeQuickRedirect, false, 48007, new Class[]{ByteArrayOutputStream.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof HybridResponse)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((HybridResponse) obj).toList());
            }
        }
    }

    public static final class HybridResponse {
        public static ChangeQuickRedirect changeQuickRedirect;

        @p0
        private String body;

        @p0
        private String message;

        @n0
        private RequestType requestType;

        @n0
        private ResponseType responseType;

        @n0
        private ResponseStatus status;

        public static final class Builder {
            public static ChangeQuickRedirect changeQuickRedirect;

            @p0
            private String body;

            @p0
            private String message;

            @p0
            private RequestType requestType;

            @p0
            private ResponseType responseType;

            @p0
            private ResponseStatus status;

            @n0
            public HybridResponse build() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48013, new Class[0], HybridResponse.class);
                if (patchProxyResultProxy.isSupported) {
                    return (HybridResponse) patchProxyResultProxy.result;
                }
                HybridResponse hybridResponse = new HybridResponse();
                hybridResponse.setRequestType(this.requestType);
                hybridResponse.setResponseType(this.responseType);
                hybridResponse.setStatus(this.status);
                hybridResponse.setMessage(this.message);
                hybridResponse.setBody(this.body);
                return hybridResponse;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setBody(@p0 String str) {
                this.body = str;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setMessage(@p0 String str) {
                this.message = str;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setRequestType(@n0 RequestType requestType) {
                this.requestType = requestType;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setResponseType(@n0 ResponseType responseType) {
                this.responseType = responseType;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setStatus(@n0 ResponseStatus responseStatus) {
                this.status = responseStatus;
                return this;
            }
        }

        HybridResponse() {
        }

        @n0
        static HybridResponse fromList(@n0 ArrayList<Object> arrayList) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 48012, new Class[]{ArrayList.class}, HybridResponse.class);
            if (patchProxyResultProxy.isSupported) {
                return (HybridResponse) patchProxyResultProxy.result;
            }
            HybridResponse hybridResponse = new HybridResponse();
            hybridResponse.setRequestType(RequestType.valuesCustom()[((Integer) arrayList.get(0)).intValue()]);
            hybridResponse.setResponseType(ResponseType.valuesCustom()[((Integer) arrayList.get(1)).intValue()]);
            hybridResponse.setStatus(ResponseStatus.valuesCustom()[((Integer) arrayList.get(2)).intValue()]);
            hybridResponse.setMessage((String) arrayList.get(3));
            hybridResponse.setBody((String) arrayList.get(4));
            return hybridResponse;
        }

        @p0
        public String getBody() {
            return this.body;
        }

        @p0
        public String getMessage() {
            return this.message;
        }

        @n0
        public RequestType getRequestType() {
            return this.requestType;
        }

        @n0
        public ResponseType getResponseType() {
            return this.responseType;
        }

        @n0
        public ResponseStatus getStatus() {
            return this.status;
        }

        public void setBody(@p0 String str) {
            this.body = str;
        }

        public void setMessage(@p0 String str) {
            this.message = str;
        }

        public void setRequestType(@n0 RequestType requestType) {
            if (PatchProxy.proxy(new Object[]{requestType}, this, changeQuickRedirect, false, 48008, new Class[]{RequestType.class}, Void.TYPE).isSupported) {
                return;
            }
            if (requestType == null) {
                throw new IllegalStateException("Nonnull field \"requestType\" is null.");
            }
            this.requestType = requestType;
        }

        public void setResponseType(@n0 ResponseType responseType) {
            if (PatchProxy.proxy(new Object[]{responseType}, this, changeQuickRedirect, false, 48009, new Class[]{ResponseType.class}, Void.TYPE).isSupported) {
                return;
            }
            if (responseType == null) {
                throw new IllegalStateException("Nonnull field \"responseType\" is null.");
            }
            this.responseType = responseType;
        }

        public void setStatus(@n0 ResponseStatus responseStatus) {
            if (PatchProxy.proxy(new Object[]{responseStatus}, this, changeQuickRedirect, false, 48010, new Class[]{ResponseStatus.class}, Void.TYPE).isSupported) {
                return;
            }
            if (responseStatus == null) {
                throw new IllegalStateException("Nonnull field \"status\" is null.");
            }
            this.status = responseStatus;
        }

        @n0
        ArrayList<Object> toList() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48011, new Class[0], ArrayList.class);
            if (patchProxyResultProxy.isSupported) {
                return (ArrayList) patchProxyResultProxy.result;
            }
            ArrayList<Object> arrayList = new ArrayList<>(5);
            RequestType requestType = this.requestType;
            arrayList.add(requestType == null ? null : Integer.valueOf(requestType.index));
            ResponseType responseType = this.responseType;
            arrayList.add(responseType == null ? null : Integer.valueOf(responseType.index));
            ResponseStatus responseStatus = this.status;
            arrayList.add(responseStatus != null ? Integer.valueOf(responseStatus.index) : null);
            arrayList.add(this.message);
            arrayList.add(this.body);
            return arrayList;
        }
    }

    public interface NullableResult<T> {
        void error(@n0 Throwable th2);

        void success(@p0 T t10);
    }

    public enum RequestType {
        GET(0),
        POST(1);

        public static ChangeQuickRedirect changeQuickRedirect;
        final int index;

        RequestType(int i10) {
            this.index = i10;
        }

        public static RequestType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48015, new Class[]{String.class}, RequestType.class);
            return patchProxyResultProxy.isSupported ? (RequestType) patchProxyResultProxy.result : (RequestType) Enum.valueOf(RequestType.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static RequestType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48014, new Class[0], RequestType[].class);
            return patchProxyResultProxy.isSupported ? (RequestType[]) patchProxyResultProxy.result : (RequestType[]) values().clone();
        }
    }

    public enum ResponseStatus {
        OK(0),
        FAILED(1),
        CANCELED(2);

        public static ChangeQuickRedirect changeQuickRedirect;
        final int index;

        ResponseStatus(int i10) {
            this.index = i10;
        }

        public static ResponseStatus valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48017, new Class[]{String.class}, ResponseStatus.class);
            return patchProxyResultProxy.isSupported ? (ResponseStatus) patchProxyResultProxy.result : (ResponseStatus) Enum.valueOf(ResponseStatus.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ResponseStatus[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48016, new Class[0], ResponseStatus[].class);
            return patchProxyResultProxy.isSupported ? (ResponseStatus[]) patchProxyResultProxy.result : (ResponseStatus[]) values().clone();
        }
    }

    public enum ResponseType {
        FILE(0),
        DATA(1);

        public static ChangeQuickRedirect changeQuickRedirect;
        final int index;

        ResponseType(int i10) {
            this.index = i10;
        }

        public static ResponseType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48019, new Class[]{String.class}, ResponseType.class);
            return patchProxyResultProxy.isSupported ? (ResponseType) patchProxyResultProxy.result : (ResponseType) Enum.valueOf(ResponseType.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ResponseType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48018, new Class[0], ResponseType[].class);
            return patchProxyResultProxy.isSupported ? (ResponseType[]) patchProxyResultProxy.result : (ResponseType[]) values().clone();
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
    public static ArrayList<Object> wrapError(@n0 Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, null, changeQuickRedirect, true, 48002, new Class[]{Throwable.class}, ArrayList.class);
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
