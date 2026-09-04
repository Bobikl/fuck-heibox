package com.alipay.sdk.m.x;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public class d extends com.alipay.sdk.m.x.c implements com.alipay.sdk.m.x.e.f, com.alipay.sdk.m.x.e.g, com.alipay.sdk.m.x.e.h {
    public static final String A = "exit";
    public static final String B = "action";
    public static final String C = "pushWindow";
    public static final String D = "h5JsFuncCallback";
    public static final String E = "sdkInfo";
    public static final String F = "canUseTaoLogin";
    public static final String G = "taoLogin";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f39533m = "sdk_result_code:";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f39534n = "alipayjsbridge://";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f39535o = "onBack";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f39536p = "setTitle";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f39537q = "onRefresh";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f39538r = "showBackButton";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f39539s = "onExit";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f39540t = "onLoadJs";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f39541u = "callNativeFunc";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f39542v = "back";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f39543w = "title";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f39544x = "refresh";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f39545y = "backButton";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f39546z = "refreshButton";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f39548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f39549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x5.a f39550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f39551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.alipay.sdk.m.x.e f39552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c6.c f39553l;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f39531b.finish();
        }
    }

    public class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.alipay.sdk.m.x.e f39555a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.alipay.sdk.m.x.e eVar) {
            super(null);
            this.f39555a = eVar;
        }

        @Override // com.alipay.sdk.m.x.d.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f39555a.c();
            d.this.f39549h = false;
        }
    }

    public class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.alipay.sdk.m.x.e f39557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f39558b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.alipay.sdk.m.x.e eVar, String str) {
            super(null);
            this.f39557a = eVar;
            this.f39558b = str;
        }

        @Override // com.alipay.sdk.m.x.d.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d.this.removeView(this.f39557a);
            d.this.f39552k.f(this.f39558b);
            d.this.f39549h = false;
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.d$d, reason: collision with other inner class name */
    public class RunnableC0299d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f39560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f39561c;

        /* JADX INFO: renamed from: com.alipay.sdk.m.x.d$d$a */
        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                RunnableC0299d.this.f39561c.cancel();
                h5.a.i(d.this.f39550i, h5.b.f119111k, h5.b.A, "2");
                f5.b.c(f5.b.a());
                RunnableC0299d.this.f39560b.finish();
            }
        }

        public RunnableC0299d(Activity activity, SslErrorHandler sslErrorHandler) {
            this.f39560b = activity;
            this.f39561c = sslErrorHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            c6.b.b(this.f39560b, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。", "确定", new a(), null, null);
        }
    }

    public static abstract class e implements Animation.AnimationListener {
        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<com.alipay.sdk.m.x.e> f39564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f39566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final JSONObject f39567d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f39568e = false;

        public f(com.alipay.sdk.m.x.e eVar, String str, String str2, JSONObject jSONObject) {
            this.f39564a = new WeakReference<>(eVar);
            this.f39565b = str;
            this.f39566c = str2;
            this.f39567d = jSONObject;
        }

        public static String a(String str) {
            return TextUtils.isEmpty(str) ? "" : str.replace("'", "");
        }

        public void b(JSONObject jSONObject) {
            com.alipay.sdk.m.x.e eVar;
            if (this.f39568e || (eVar = (com.alipay.sdk.m.x.e) l.f(this.f39564a)) == null) {
                return;
            }
            this.f39568e = true;
            eVar.f(String.format("javascript:window.AlipayJSBridge.callBackFromNativeFunc('%s','%s');", a(this.f39566c), a(jSONObject.toString())));
        }
    }

    public static class g implements f5.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f39569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39570b;

        public g(f fVar, String str) {
            this.f39569a = fVar;
            this.f39570b = str;
        }

        @Override // f5.c.a
        public void a(boolean z10, JSONObject jSONObject, String str) {
            try {
                this.f39569a.b(new JSONObject().put("success", z10).put("random", this.f39570b).put("code", jSONObject).put("status", str));
            } catch (JSONException unused) {
            }
        }
    }

    public d(Activity activity, x5.a aVar, String str) {
        super(activity, str);
        this.f39547f = true;
        this.f39548g = "GET";
        this.f39549h = false;
        this.f39552k = null;
        this.f39553l = new c6.c();
        this.f39550i = aVar;
        A();
    }

    private synchronized boolean A() {
        try {
            com.alipay.sdk.m.x.e eVar = new com.alipay.sdk.m.x.e(this.f39531b, this.f39550i, new com.alipay.sdk.m.x.e.C0301e(!m(), !m()));
            this.f39552k = eVar;
            eVar.setChromeProxy(this);
            this.f39552k.setWebClientProxy(this);
            this.f39552k.setWebEventProxy(this);
            addView(this.f39552k);
        } catch (Exception unused) {
            return false;
        }
        return true;
    }

    private void B() {
        com.alipay.sdk.m.x.e eVar = this.f39552k;
        if (eVar != null) {
            eVar.getWebView().loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
        }
    }

    private synchronized void C() {
        WebView webView = this.f39552k.getWebView();
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            c6.c cVar = this.f39553l;
            if (cVar == null || cVar.c()) {
                s(false);
            } else {
                y();
            }
        }
    }

    private synchronized void q(String str, String str2, String str3) {
        com.alipay.sdk.m.x.e eVar = this.f39552k;
        if (eVar == null) {
            return;
        }
        JSONObject jSONObjectC0 = l.c0(str3);
        f fVar = new f(eVar, str, str2, jSONObjectC0);
        Context context = eVar.getContext();
        try {
            switch (fVar.f39565b) {
                case "title":
                    if (jSONObjectC0.has("title")) {
                        eVar.getTitle().setText(jSONObjectC0.optString("title", ""));
                        break;
                    }
                    break;
                case "refresh":
                    eVar.getWebView().reload();
                    break;
                case "back":
                    C();
                    break;
                case "exit":
                    f5.b.c(jSONObjectC0.optString("result", null));
                    s(jSONObjectC0.optBoolean("success", false));
                    break;
                case "backButton":
                    eVar.getBackButton().setVisibility(jSONObjectC0.optBoolean("show", true) ? 0 : 4);
                    break;
                case "refreshButton":
                    eVar.getRefreshButton().setVisibility(jSONObjectC0.optBoolean("show", true) ? 0 : 4);
                    break;
                case "pushWindow":
                    w(jSONObjectC0.optString("url"), jSONObjectC0.optString("title", ""));
                    break;
                case "sdkInfo":
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sdk_version", "15.8.11");
                    jSONObject.put("app_name", this.f39550i.h());
                    jSONObject.put("app_version", this.f39550i.m());
                    fVar.b(jSONObject);
                    break;
                case "canUseTaoLogin":
                    String url = eVar.getUrl();
                    if (l.A(this.f39550i, url)) {
                        JSONObject jSONObject2 = new JSONObject();
                        boolean zC = f5.c.c(this.f39550i, context);
                        jSONObject2.put("enabled", zC);
                        h5.a.d(this.f39550i, h5.b.f119113l, h5.b.f119130t0, String.valueOf(zC));
                        fVar.b(jSONObject2);
                        break;
                    } else {
                        h5.a.i(this.f39550i, h5.b.f119113l, "jsUrlErr", url);
                        break;
                    }
                    break;
                case "taoLogin":
                    String url2 = eVar.getUrl();
                    if (l.A(this.f39550i, url2)) {
                        String strOptString = jSONObjectC0.optString("random");
                        JSONObject jSONObjectOptJSONObject = jSONObjectC0.optJSONObject(com.tekartik.sqflite.b.f98586e);
                        if (!TextUtils.isEmpty("random") && jSONObjectOptJSONObject != null) {
                            String strOptString2 = jSONObjectOptJSONObject.optString("url");
                            String strOptString3 = jSONObjectOptJSONObject.optString("action");
                            if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && (context instanceof Activity)) {
                                f5.c.b(this.f39550i, (Activity) context, 1010, strOptString2, strOptString3, new g(fVar, strOptString));
                            }
                        }
                        break;
                    } else {
                        h5.a.i(this.f39550i, h5.b.f119113l, "jsUrlErr", url2);
                        break;
                    }
                    break;
            }
        } catch (Throwable th2) {
            h5.a.f(this.f39550i, h5.b.f119113l, "jInfoErr", th2, str);
        }
    }

    private synchronized void s(boolean z10) {
        f5.b.d(z10);
        this.f39531b.finish();
    }

    private synchronized void v(String str) {
        Map<String, String> mapI = l.I(this.f39550i, str);
        if (str.startsWith(f39541u)) {
            q(mapI.get("func"), mapI.get("cbId"), mapI.get("data"));
        } else if (str.startsWith(f39535o)) {
            C();
        } else if (str.startsWith(f39536p) && mapI.containsKey("title")) {
            this.f39552k.getTitle().setText(mapI.get("title"));
        } else if (str.startsWith(f39537q)) {
            this.f39552k.getWebView().reload();
        } else if (str.startsWith("showBackButton") && mapI.containsKey("bshow")) {
            this.f39552k.getBackButton().setVisibility(TextUtils.equals("true", mapI.get("bshow")) ? 0 : 4);
        } else if (str.startsWith(f39539s)) {
            f5.b.c(mapI.get("result"));
            s(TextUtils.equals("true", mapI.get("bsucc")));
        } else if (str.startsWith(f39540t)) {
            this.f39552k.f("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
        }
    }

    private synchronized boolean w(String str, String str2) {
        com.alipay.sdk.m.x.e eVar = this.f39552k;
        try {
            com.alipay.sdk.m.x.e eVar2 = new com.alipay.sdk.m.x.e(this.f39531b, this.f39550i, new com.alipay.sdk.m.x.e.C0301e(!m(), !m()));
            this.f39552k = eVar2;
            eVar2.setChromeProxy(this);
            this.f39552k.setWebClientProxy(this);
            this.f39552k.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.f39552k.getTitle().setText(str2);
            }
            this.f39549h = true;
            this.f39553l.b(eVar);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new c(eVar, str));
            this.f39552k.setAnimation(translateAnimation);
            addView(this.f39552k);
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }

    private synchronized boolean y() {
        if (this.f39553l.c()) {
            this.f39531b.finish();
        } else {
            this.f39549h = true;
            com.alipay.sdk.m.x.e eVar = this.f39552k;
            this.f39552k = this.f39553l.d();
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new b(eVar));
            eVar.setAnimation(translateAnimation);
            removeView(eVar);
            addView(this.f39552k);
        }
        return true;
    }

    private synchronized void z() {
        Activity activity = this.f39531b;
        com.alipay.sdk.m.x.e eVar = this.f39552k;
        if (activity != null && eVar != null) {
            if (this.f39547f) {
                activity.finish();
            } else {
                eVar.f("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
            }
        }
    }

    @Override // com.alipay.sdk.m.x.e.f
    public synchronized boolean a(com.alipay.sdk.m.x.e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str2.startsWith("<head>") && str2.contains(f39533m)) {
            this.f39531b.runOnUiThread(new a());
        }
        jsPromptResult.cancel();
        return true;
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean b(com.alipay.sdk.m.x.e eVar, String str) {
        h5.a.d(this.f39550i, h5.b.f119113l, "h5ldd", SystemClock.elapsedRealtime() + "|" + l.f0(str));
        B();
        eVar.getRefreshButton().setVisibility(0);
        return true;
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean c(com.alipay.sdk.m.x.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Activity activity = this.f39531b;
        if (activity == null) {
            return true;
        }
        if (l.B(this.f39550i, str, activity)) {
            return true;
        }
        if (str.startsWith(f39534n)) {
            v(str.substring(17));
        } else if (TextUtils.equals(str, j5.a.f124265p)) {
            s(false);
        } else if (str.startsWith("http://") || str.startsWith("https://")) {
            this.f39552k.f(str);
        } else {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                activity.startActivity(intent);
            } catch (Throwable th2) {
                h5.a.g(this.f39550i, h5.b.f119113l, th2);
            }
        }
        return true;
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean d(com.alipay.sdk.m.x.e eVar, String str) {
        h5.a.d(this.f39550i, h5.b.f119113l, "h5ld", SystemClock.elapsedRealtime() + "|" + l.f0(str));
        if (!TextUtils.isEmpty(str) && !str.endsWith(".apk")) {
            B();
        }
        return false;
    }

    @Override // com.alipay.sdk.m.x.e.f
    public synchronized void e(com.alipay.sdk.m.x.e eVar, String str) {
        if (!str.startsWith("http") && !eVar.getUrl().endsWith(str)) {
            this.f39552k.getTitle().setText(str);
        }
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean f(com.alipay.sdk.m.x.e eVar, int i10, String str, String str2) {
        this.f39551j = true;
        h5.a.i(this.f39550i, h5.b.f119111k, h5.b.f119139y, "onReceivedError:" + i10 + "|" + str2);
        eVar.getRefreshButton().setVisibility(0);
        return false;
    }

    @Override // com.alipay.sdk.m.x.e.h
    public synchronized void g(com.alipay.sdk.m.x.e eVar) {
        eVar.getWebView().reload();
        eVar.getRefreshButton().setVisibility(4);
    }

    @Override // com.alipay.sdk.m.x.e.h
    public synchronized void h(com.alipay.sdk.m.x.e eVar) {
        z();
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean i(com.alipay.sdk.m.x.e eVar, SslErrorHandler sslErrorHandler, SslError sslError) {
        Activity activity = this.f39531b;
        if (activity == null) {
            return true;
        }
        h5.a.i(this.f39550i, h5.b.f119111k, h5.b.f119141z, "2-" + sslError);
        activity.runOnUiThread(new RunnableC0299d(activity, sslErrorHandler));
        return true;
    }

    @Override // com.alipay.sdk.m.x.c
    public synchronized void k(String str) {
        if ("POST".equals(this.f39548g)) {
            this.f39552k.g(str, null);
        } else {
            this.f39552k.f(str);
        }
        com.alipay.sdk.m.x.c.j(this.f39552k.getWebView());
    }

    @Override // com.alipay.sdk.m.x.c
    public synchronized boolean n() {
        Activity activity = this.f39531b;
        if (activity == null) {
            return true;
        }
        if (!m()) {
            if (!this.f39549h) {
                z();
            }
            return true;
        }
        com.alipay.sdk.m.x.e eVar = this.f39552k;
        if (eVar != null && eVar.getWebView() != null) {
            if (!eVar.getWebView().canGoBack()) {
                f5.b.c(f5.b.a());
                activity.finish();
            } else if (x()) {
                com.alipay.sdk.m.j.c cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.NETWORK_ERROR.b());
                f5.b.c(f5.b.b(cVarB.b(), cVarB.a(), ""));
                activity.finish();
            }
            return true;
        }
        activity.finish();
        return true;
    }

    @Override // com.alipay.sdk.m.x.c
    public synchronized void o() {
        this.f39552k.c();
        this.f39553l.a();
    }

    @Override // android.view.ViewGroup
    public synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f39549h ? true : super.onInterceptTouchEvent(motionEvent);
    }

    public synchronized void r(String str, String str2, boolean z10) {
        this.f39548g = str2;
        this.f39552k.getTitle().setText(str);
        this.f39547f = z10;
    }

    public boolean x() {
        return this.f39551j;
    }
}
