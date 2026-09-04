package com.max.xiaoheihe.module.webview;

import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: WebViewJsBridgeManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class c0 {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f94583e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f94584f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final String f94585g = "window.WebViewJavascriptBridge._handleMessageFromNative";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final String f94586h = "loadingFinished";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final String f94587i = "onGetScreenshotCompleted";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f94588j = "JsBridgeCallbackOnGetShareImgCallback";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f94589k = "JsBridgeCallbackGetSelectedPackageIds";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private HashMap<String, com.max.xiaoheihe.utils.l0.i> f94590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private WeakReference<com.max.hbcommon.base.f> f94591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final AtomicInteger f94592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final HashMap<String, String> f94593d;

    /* JADX INFO: compiled from: WebViewJsBridgeManager.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.e
        @xh.m
        public final String a(@dl.e JsonObject jsonObject) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, 47183, new Class[]{JsonObject.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            if (jsonObject == null) {
                return null;
            }
            return "window.WebViewJavascriptBridge._handleMessageFromNative('" + jsonObject + "')";
        }
    }

    public c0(@dl.d com.max.hbcommon.base.f baseView, @dl.d HashMap<String, com.max.xiaoheihe.utils.l0.i> callBackMap) {
        kotlin.jvm.internal.f0.p(baseView, "baseView");
        kotlin.jvm.internal.f0.p(callBackMap, "callBackMap");
        this.f94590a = callBackMap;
        this.f94591b = new WeakReference<>(baseView);
        this.f94592c = new AtomicInteger(0);
        this.f94593d = new HashMap<>();
    }

    @dl.e
    @xh.m
    public static final String a(@dl.e JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonObject}, null, changeQuickRedirect, true, 47182, new Class[]{JsonObject.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f94583e.a(jsonObject);
    }

    private final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47181, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f94592c.incrementAndGet();
    }

    @dl.d
    public final synchronized JsonObject b(@dl.d String handlerName, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{handlerName, str}, this, changeQuickRedirect, false, 47179, new Class[]{String.class, String.class}, JsonObject.class);
        if (patchProxyResultProxy.isSupported) {
            return (JsonObject) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(handlerName, "handlerName");
        String strValueOf = String.valueOf(this.f94592c.get());
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("handlerName", handlerName);
        jsonObject.addProperty("responseId", strValueOf);
        if (!(str == null || kotlin.text.u.V1(str))) {
            this.f94593d.put(strValueOf, str);
        }
        e();
        return jsonObject;
    }

    @dl.d
    public final synchronized JsonObject c(@dl.d String handlerName, @dl.e String str, @dl.d com.max.xiaoheihe.utils.l0.i callback) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{handlerName, str, callback}, this, changeQuickRedirect, false, 47180, new Class[]{String.class, String.class, com.max.xiaoheihe.utils.l0.i.class}, JsonObject.class);
        if (patchProxyResultProxy.isSupported) {
            return (JsonObject) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(handlerName, "handlerName");
        kotlin.jvm.internal.f0.p(callback, "callback");
        String strValueOf = String.valueOf(this.f94592c.get());
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("handlerName", handlerName);
        jsonObject.addProperty("responseId", strValueOf);
        String str2 = str + strValueOf;
        this.f94590a.put(str2, callback);
        this.f94593d.put(strValueOf, str2);
        e();
        return jsonObject;
    }

    public final void d(@dl.e String str) {
        com.max.xiaoheihe.utils.l0.i iVar;
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47178, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        aVar.M("hbBridge " + str);
        com.max.hbcommon.base.f fVar = this.f94591b.get();
        if (fVar == null || !fVar.isActive() || str == null) {
            return;
        }
        String strE = com.max.hbutils.utils.k.e(str, "responseId");
        String strE2 = com.max.hbutils.utils.k.e(str, "responseData");
        String errorCode = com.max.hbutils.utils.k.e(str, "error");
        kotlin.jvm.internal.f0.o(errorCode, "errorCode");
        if (!(errorCode.length() > 0)) {
            String str3 = this.f94593d.get(strE);
            if (str3 == null || (iVar = this.f94590a.get(str3)) == null) {
                return;
            }
            if (iVar.b()) {
                this.f94593d.remove(strE);
                this.f94590a.remove(str3);
            }
            iVar.a(strE2);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(errorCode);
        sb2.append(' ');
        if (kotlin.jvm.internal.f0.g(errorCode, "-1")) {
            str2 = "该方法没有注册";
        } else {
            str2 = kotlin.jvm.internal.f0.g(errorCode, "1") ? "入参错误" : "未知错误";
        }
        sb2.append(str2);
        aVar.v("hbBridge HBJSBridgeErrorCode " + sb2.toString());
    }
}
