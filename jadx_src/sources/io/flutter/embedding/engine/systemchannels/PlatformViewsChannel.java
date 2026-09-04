package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.exoplayer2.text.ttml.d;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class PlatformViewsChannel {
    private static final String TAG = "PlatformViewsChannel";
    private final MethodChannel channel;
    private PlatformViewsHandler handler;
    private final MethodChannel.MethodCallHandler parsingHandler;

    /* JADX INFO: renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$1, reason: invalid class name */
    public class AnonymousClass1 implements MethodChannel.MethodCallHandler {
        AnonymousClass1() {
        }

        private void clearFocus(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
            try {
                PlatformViewsChannel.this.handler.clearFocus(((Integer) methodCall.arguments()).intValue());
                result.success(null);
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void create(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
            Map map = (Map) methodCall.arguments();
            boolean z10 = true;
            boolean z11 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z11) {
                    PlatformViewsChannel.this.handler.createForPlatformViewLayer(new PlatformViewCreationRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)).intValue(), PlatformViewCreationRequest.RequestedDisplayMode.HYBRID_ONLY, byteBufferWrap));
                    result.success(null);
                    return;
                }
                if (!map.containsKey("hybridFallback") || !((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z10 = false;
                }
                long jCreateForTextureLayer = PlatformViewsChannel.this.handler.createForTextureLayer(new PlatformViewCreationRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey(d.f49793l0) ? ((Double) map.get(d.f49793l0)).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)).intValue(), z10 ? PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK : PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBufferWrap));
                if (jCreateForTextureLayer != -2) {
                    result.success(Long.valueOf(jCreateForTextureLayer));
                } else {
                    if (!z10) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                    result.success(null);
                }
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void dispose(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
            try {
                PlatformViewsChannel.this.handler.dispose(((Integer) ((Map) methodCall.arguments()).get("id")).intValue());
                result.success(null);
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$resize$0(MethodChannel.Result result, PlatformViewBufferSize platformViewBufferSize) {
            if (platformViewBufferSize == null) {
                result.error("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(platformViewBufferSize.width));
            map.put("height", Double.valueOf(platformViewBufferSize.height));
            result.success(map);
        }

        private void offset(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
            Map map = (Map) methodCall.arguments();
            try {
                PlatformViewsChannel.this.handler.offset(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get(d.f49793l0)).doubleValue());
                result.success(null);
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void resize(@n0 MethodCall methodCall, @n0 final MethodChannel.Result result) {
            Map map = (Map) methodCall.arguments();
            try {
                PlatformViewsChannel.this.handler.resize(new PlatformViewResizeRequest(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new PlatformViewBufferResized() { // from class: io.flutter.embedding.engine.systemchannels.c
                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized
                    public final void run(PlatformViewsChannel.PlatformViewBufferSize platformViewBufferSize) {
                        PlatformViewsChannel.AnonymousClass1.lambda$resize$0(result, platformViewBufferSize);
                    }
                });
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void setDirection(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
            Map map = (Map) methodCall.arguments();
            try {
                PlatformViewsChannel.this.handler.setDirection(((Integer) map.get("id")).intValue(), ((Integer) map.get(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)).intValue());
                result.success(null);
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void synchronizeToNativeViewHierarchy(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
            try {
                PlatformViewsChannel.this.handler.synchronizeToNativeViewHierarchy(((Boolean) methodCall.arguments()).booleanValue());
                result.success(null);
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void touch(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
            MethodChannel.Result result2;
            List list = (List) methodCall.arguments();
            try {
                PlatformViewsChannel.this.handler.onTouch(new PlatformViewTouch(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                result2 = result;
                try {
                    result2.success(null);
                } catch (IllegalStateException e10) {
                    e = e10;
                    result2.error("error", PlatformViewsChannel.detailedExceptionString(e), null);
                }
            } catch (IllegalStateException e11) {
                e = e11;
                result2 = result;
            }
        }

        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
            if (PlatformViewsChannel.this.handler == null) {
            }
            Log.v(PlatformViewsChannel.TAG, "Received '" + methodCall.method + "' message.");
            String str = methodCall.method;
            str.hashCode();
            switch (str) {
                case "create":
                    create(methodCall, result);
                    break;
                case "offset":
                    offset(methodCall, result);
                    break;
                case "resize":
                    resize(methodCall, result);
                    break;
                case "clearFocus":
                    clearFocus(methodCall, result);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    synchronizeToNativeViewHierarchy(methodCall, result);
                    break;
                case "touch":
                    touch(methodCall, result);
                    break;
                case "setDirection":
                    setDirection(methodCall, result);
                    break;
                case "dispose":
                    dispose(methodCall, result);
                    break;
                default:
                    result.notImplemented();
                    break;
            }
        }
    }

    public interface PlatformViewBufferResized {
        void run(@p0 PlatformViewBufferSize platformViewBufferSize);
    }

    public static class PlatformViewBufferSize {
        public final int height;
        public final int width;

        public PlatformViewBufferSize(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }
    }

    public static class PlatformViewCreationRequest {
        public final int direction;
        public final RequestedDisplayMode displayMode;
        public final double logicalHeight;
        public final double logicalLeft;
        public final double logicalTop;
        public final double logicalWidth;

        @p0
        public final ByteBuffer params;
        public final int viewId;

        @n0
        public final String viewType;

        public enum RequestedDisplayMode {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public PlatformViewCreationRequest(int i10, @n0 String str, double d10, double d11, double d12, double d13, int i11, RequestedDisplayMode requestedDisplayMode, @p0 ByteBuffer byteBuffer) {
            this.viewId = i10;
            this.viewType = str;
            this.logicalTop = d10;
            this.logicalLeft = d11;
            this.logicalWidth = d12;
            this.logicalHeight = d13;
            this.direction = i11;
            this.displayMode = requestedDisplayMode;
            this.params = byteBuffer;
        }

        public PlatformViewCreationRequest(int i10, @n0 String str, double d10, double d11, double d12, double d13, int i11, @p0 ByteBuffer byteBuffer) {
            this(i10, str, d10, d11, d12, d13, i11, RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBuffer);
        }
    }

    public static class PlatformViewResizeRequest {
        public final double newLogicalHeight;
        public final double newLogicalWidth;
        public final int viewId;

        public PlatformViewResizeRequest(int i10, double d10, double d11) {
            this.viewId = i10;
            this.newLogicalWidth = d10;
            this.newLogicalHeight = d11;
        }
    }

    public static class PlatformViewTouch {
        public final int action;
        public final int buttonState;
        public final int deviceId;

        @n0
        public final Number downTime;
        public final int edgeFlags;

        @n0
        public final Number eventTime;
        public final int flags;
        public final int metaState;
        public final long motionEventId;
        public final int pointerCount;

        @n0
        public final Object rawPointerCoords;

        @n0
        public final Object rawPointerPropertiesList;
        public final int source;
        public final int viewId;
        public final float xPrecision;
        public final float yPrecision;

        public PlatformViewTouch(int i10, @n0 Number number, @n0 Number number2, int i11, int i12, @n0 Object obj, @n0 Object obj2, int i13, int i14, float f10, float f11, int i15, int i16, int i17, int i18, long j10) {
            this.viewId = i10;
            this.downTime = number;
            this.eventTime = number2;
            this.action = i11;
            this.pointerCount = i12;
            this.rawPointerPropertiesList = obj;
            this.rawPointerCoords = obj2;
            this.metaState = i13;
            this.buttonState = i14;
            this.xPrecision = f10;
            this.yPrecision = f11;
            this.deviceId = i15;
            this.edgeFlags = i16;
            this.source = i17;
            this.flags = i18;
            this.motionEventId = j10;
        }
    }

    public interface PlatformViewsHandler {
        public static final long NON_TEXTURE_FALLBACK = -2;

        void clearFocus(int i10);

        void createForPlatformViewLayer(@n0 PlatformViewCreationRequest platformViewCreationRequest);

        long createForTextureLayer(@n0 PlatformViewCreationRequest platformViewCreationRequest);

        void dispose(int i10);

        void offset(int i10, double d10, double d11);

        void onTouch(@n0 PlatformViewTouch platformViewTouch);

        void resize(@n0 PlatformViewResizeRequest platformViewResizeRequest, @n0 PlatformViewBufferResized platformViewBufferResized);

        void setDirection(int i10, int i11);

        void synchronizeToNativeViewHierarchy(boolean z10);
    }

    public PlatformViewsChannel(@n0 DartExecutor dartExecutor) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.parsingHandler = anonymousClass1;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform_views", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(anonymousClass1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String detailedExceptionString(Exception exc) {
        return Log.getStackTraceString(exc);
    }

    public void invokeViewFocused(int i10) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            return;
        }
        methodChannel.invokeMethod("viewFocused", Integer.valueOf(i10));
    }

    public void setPlatformViewsHandler(@p0 PlatformViewsHandler platformViewsHandler) {
        this.handler = platformViewsHandler;
    }
}
