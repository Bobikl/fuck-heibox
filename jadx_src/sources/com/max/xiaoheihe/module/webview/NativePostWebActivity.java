package com.max.xiaoheihe.module.webview;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.network.ApiException;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebCallbackObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: NativePostWebActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class NativePostWebActivity extends BaseActivity {
    public static final int P = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private String L;

    @dl.e
    private WebView M;
    private int N;

    @dl.d
    private final c O = new c(this);

    /* JADX INFO: compiled from: NativePostWebActivity.kt */
    public final class a implements d0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final NativePostWebActivity f94241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final WeakReference<NativePostWebActivity> f94242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ NativePostWebActivity f94243d;

        public a(@dl.d NativePostWebActivity nativePostWebActivity, NativePostWebActivity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            this.f94243d = nativePostWebActivity;
            this.f94241b = activity;
            this.f94242c = new WeakReference<>(activity);
        }

        @Override // com.max.xiaoheihe.module.webview.d0.g
        public void a() {
            NativePostWebActivity nativePostWebActivity;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46967, new Class[0], Void.TYPE).isSupported || (nativePostWebActivity = this.f94242c.get()) == null) {
                return;
            }
            NativePostWebActivity.O1(nativePostWebActivity);
        }

        @Override // com.max.xiaoheihe.module.webview.d0.g
        public void b(@dl.d String json) {
            if (PatchProxy.proxy(new Object[]{json}, this, changeQuickRedirect, false, 46968, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(json, "json");
            NativePostWebActivity nativePostWebActivity = this.f94242c.get();
            if (nativePostWebActivity != null) {
                Object objA = com.max.hbutils.utils.k.a(json, WebCallbackObj.class);
                kotlin.jvm.internal.f0.o(objA, "deserialize(json, WebCallbackObj::class.java)");
                NativePostWebActivity.T1(nativePostWebActivity, (WebCallbackObj) objA);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.d0.g
        public void c(@dl.e String str) {
        }

        @dl.d
        public final NativePostWebActivity d() {
            return this.f94241b;
        }
    }

    /* JADX INFO: compiled from: NativePostWebActivity.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class b extends d0.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f94244b = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final NativePostWebActivity f94245a;

        public b(@dl.d NativePostWebActivity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            this.f94245a = activity;
        }

        @dl.d
        public final NativePostWebActivity a() {
            return this.f94245a;
        }

        @Override // android.webkit.WebViewClient
        @dl.e
        public WebResourceResponse shouldInterceptRequest(@dl.e WebView webView, @dl.d WebResourceRequest webResourceRequest) {
            WebResourceResponse webResourceResponseD;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, webResourceRequest}, this, changeQuickRedirect, false, 46969, new Class[]{WebView.class, WebResourceRequest.class}, WebResourceResponse.class);
            if (patchProxyResultProxy.isSupported) {
                return (WebResourceResponse) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(webResourceRequest, "webResourceRequest");
            if (y.j(webResourceRequest.getUrl())) {
                com.max.hbcommon.utils.d.b("zzzzwebpost", "try intercept");
                try {
                    if (y.i(webResourceRequest.getUrl()) && (webResourceResponseD = y.d(webView, y.f(webResourceRequest.getUrl()))) != null) {
                        return webResourceResponseD;
                    }
                } catch (Throwable unused) {
                }
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // com.max.xiaoheihe.module.webview.d0.h, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@dl.e WebView webView, @dl.e String str) {
            return true;
        }
    }

    /* JADX INFO: compiled from: NativePostWebActivity.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class c extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f94246c = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final NativePostWebActivity f94247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final WeakReference<NativePostWebActivity> f94248b;

        public c(@dl.d NativePostWebActivity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            this.f94247a = activity;
            this.f94248b = new WeakReference<>(activity);
        }

        @dl.d
        public final NativePostWebActivity a() {
            return this.f94247a;
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 46970, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(msg, "msg");
            super.handleMessage(msg);
            NativePostWebActivity nativePostWebActivity = this.f94248b.get();
            if (nativePostWebActivity == null || msg.what != 4) {
                return;
            }
            NativePostWebActivity.Q1(nativePostWebActivity);
        }
    }

    /* JADX INFO: compiled from: NativePostWebActivity.kt */
    public static final class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94250c;

        d(String str) {
            this.f94250c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46971, new Class[0], Void.TYPE).isSupported && NativePostWebActivity.this.isActive()) {
                WebView webView = NativePostWebActivity.this.M;
                kotlin.jvm.internal.f0.m(webView);
                webView.evaluateJavascript(this.f94250c, null);
            }
        }
    }

    /* JADX INFO: compiled from: NativePostWebActivity.kt */
    public static final class e<T, R> implements kh.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e<T, R> f94251b = new e<>();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public final String a(@dl.d okhttp3.d0 responseBody) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{responseBody}, this, changeQuickRedirect, false, 46972, new Class[]{okhttp3.d0.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(responseBody, "responseBody");
            return responseBody.string();
        }

        @Override // kh.o
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46973, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((okhttp3.d0) obj);
        }
    }

    /* JADX INFO: compiled from: NativePostWebActivity.kt */
    public static final class f extends com.max.hbcommon.network.d<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void a(@dl.d String s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 46975, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
            if (NativePostWebActivity.this.isActive()) {
                super.onNext(s10);
                WebView webView = NativePostWebActivity.this.M;
                if (webView != null) {
                    webView.setTag(R.id.rb_1, s10);
                }
                NativePostWebActivity.O1(NativePostWebActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46974, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (NativePostWebActivity.this.isActive()) {
                super.onError(e10);
                if (NativePostWebActivity.this.h1() != 0) {
                    NativePostWebActivity.R1(NativePostWebActivity.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46976, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((String) obj);
        }
    }

    /* JADX INFO: compiled from: NativePostWebActivity.kt */
    public static final class g extends com.max.hbcommon.network.d<JsonObject> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94254c;

        g(String str) {
            this.f94254c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46977, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (NativePostWebActivity.this.isActive()) {
                super.onError(e10);
                if (!(e10 instanceof ApiException)) {
                    super.onError(e10);
                    return;
                }
                WebCallbackObj webCallbackObj = new WebCallbackObj();
                webCallbackObj.setId(this.f94254c);
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("status", ((ApiException) e10).d());
                jsonObject.addProperty("msg", e10.getMessage());
                webCallbackObj.setContent(jsonObject);
                NativePostWebActivity.M1(NativePostWebActivity.this, "httpCallback(" + com.max.hbutils.utils.k.p(webCallbackObj) + ");");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("httpCallback==");
                sb2.append(com.max.hbutils.utils.k.p(webCallbackObj));
                com.max.hbcommon.utils.d.b("zzzzwebpost", sb2.toString());
                if (kotlin.jvm.internal.f0.g(z5.f.f141859j, e10.getMessage())) {
                    return;
                }
                super.onError(e10);
            }
        }

        public void onNext(@dl.d JsonObject result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46978, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (NativePostWebActivity.this.isActive()) {
                super.onNext(result);
                WebCallbackObj webCallbackObj = new WebCallbackObj();
                webCallbackObj.setId(this.f94254c);
                webCallbackObj.setContent(result);
                NativePostWebActivity.M1(NativePostWebActivity.this, "httpCallback(" + com.max.hbutils.utils.k.p(webCallbackObj) + ");");
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46979, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((JsonObject) obj);
        }
    }

    public static final /* synthetic */ void M1(NativePostWebActivity nativePostWebActivity, String str) {
        if (PatchProxy.proxy(new Object[]{nativePostWebActivity, str}, null, changeQuickRedirect, true, 46964, new Class[]{NativePostWebActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostWebActivity.V1(str);
    }

    public static final /* synthetic */ void O1(NativePostWebActivity nativePostWebActivity) {
        if (PatchProxy.proxy(new Object[]{nativePostWebActivity}, null, changeQuickRedirect, true, 46963, new Class[]{NativePostWebActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostWebActivity.e2();
    }

    public static final /* synthetic */ void Q1(NativePostWebActivity nativePostWebActivity) {
        if (PatchProxy.proxy(new Object[]{nativePostWebActivity}, null, changeQuickRedirect, true, 46966, new Class[]{NativePostWebActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostWebActivity.f2();
    }

    public static final /* synthetic */ void R1(NativePostWebActivity nativePostWebActivity) {
        if (PatchProxy.proxy(new Object[]{nativePostWebActivity}, null, changeQuickRedirect, true, 46962, new Class[]{NativePostWebActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostWebActivity.C1();
    }

    public static final /* synthetic */ void T1(NativePostWebActivity nativePostWebActivity, WebCallbackObj webCallbackObj) {
        if (PatchProxy.proxy(new Object[]{nativePostWebActivity, webCallbackObj}, null, changeQuickRedirect, true, 46965, new Class[]{NativePostWebActivity.class, WebCallbackObj.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostWebActivity.h2(webCallbackObj);
    }

    private final void V1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46959, new Class[]{String.class}, Void.TYPE).isSupported || !isActive() || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        this.f66601b.runOnUiThread(new d(str));
    }

    private final String W1(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46957, new Class[]{Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = com.max.hbcommon.network.b.c() + lb.a.W2;
        HashMap map = new HashMap();
        map.put("link_id", this.L);
        if (z10) {
            map.put("return_json", "1");
        }
        return com.max.xiaoheihe.utils.l0.f(str, map);
    }

    private final String X1(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46956, new Class[]{Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strE = com.max.xiaoheihe.utils.l0.e(com.max.hbcommon.network.b.c() + lb.a.W2);
        HashMap map = new HashMap();
        map.put("link_id", this.L);
        if (z10) {
            map.put("return_json", "1");
        }
        String url = com.max.xiaoheihe.utils.l0.f(strE, map);
        kotlin.jvm.internal.f0.o(url, "url");
        return url;
    }

    private final void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46953, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.a0();
        this.f66616q.setTitle("文章");
    }

    private final void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46951, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebView webView = this.M;
        kotlin.jvm.internal.f0.m(webView);
        WebSettings settings = webView.getSettings();
        kotlin.jvm.internal.f0.o(settings, "mWebView!!.settings");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setSupportZoom(true);
        settings.setTextZoom(100);
        int i10 = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setMixedContentMode(0);
        if (i10 >= 29) {
            settings.setForceDark(com.max.hbutils.utils.u.b(this.f66601b) ? 2 : 0);
        }
        d0.f fVar = new d0.f(this.M, null);
        fVar.h(new a(this, this));
        WebView webView2 = this.M;
        if (webView2 != null) {
            webView2.addJavascriptInterface(fVar, "local_obj");
        }
        WebView webView3 = this.M;
        if (webView3 != null) {
            webView3.setTag(R.id.rb_2, fVar);
        }
        WebView webView4 = this.M;
        if (webView4 != null) {
            webView4.setWebViewClient(new b(this));
        }
        WebView webView5 = this.M;
        if (webView5 != null) {
            webView5.loadUrl("file:///android_asset/limitted_visitor_web_link.html");
        }
    }

    private final void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46952, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L = getIntent().getStringExtra("link_id");
    }

    private final void b2() {
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46960, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebView webView = this.M;
        Object tag = webView != null ? webView.getTag(R.id.rb_0) : null;
        Integer num = d0.f94672c;
        if (kotlin.jvm.internal.f0.g(num, tag) || (i10 = this.N) >= 3) {
            if (h1() != 0) {
                C1();
            }
        } else {
            this.N = i10 + 1;
            WebView webView2 = this.M;
            if (webView2 != null) {
                webView2.setTag(R.id.rb_0, num);
            }
            c2();
        }
    }

    @SuppressLint({"AutoDispose"})
    private final void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46954, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().a(new HashMap(16), W1(true), new HashMap(16)).z3(e.f94251b).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private final void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46955, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebView webView = this.M;
        Object tag = webView != null ? webView.getTag(R.id.rb_0) : null;
        WebView webView2 = this.M;
        Object tag2 = webView2 != null ? webView2.getTag(R.id.rb_1) : null;
        if (!kotlin.jvm.internal.f0.g(d0.f94672c, tag) || !(tag2 instanceof String)) {
            if (tag2 instanceof String) {
                this.O.removeMessages(4);
                this.O.sendEmptyMessageDelayed(4, 3000L);
                return;
            }
            return;
        }
        JsonObject jsonObject = (JsonObject) com.max.hbutils.utils.k.a((String) tag2, JsonObject.class);
        WebCallbackObj webCallbackObj = new WebCallbackObj();
        webCallbackObj.setUrl(X1(false));
        webCallbackObj.setContent(jsonObject);
        V1("linkCallback(" + com.max.hbutils.utils.k.p(webCallbackObj) + ");");
        this.O.removeMessages(4);
        this.O.sendEmptyMessageDelayed(4, 3000L);
    }

    private final void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46961, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b2();
    }

    private final void h2(WebCallbackObj webCallbackObj) {
        if (PatchProxy.proxy(new Object[]{webCallbackObj}, this, changeQuickRedirect, false, 46958, new Class[]{WebCallbackObj.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        io.reactivex.z<JsonObject> zVarU7 = null;
        String url = webCallbackObj.getUrl();
        String id2 = webCallbackObj.getId();
        if (kotlin.text.u.L1("get", webCallbackObj.getMethods(), true)) {
            zVarU7 = com.max.xiaoheihe.network.i.a().F1(map, url, webCallbackObj.getData());
        } else if (kotlin.text.u.L1(ad.e.f1248a, webCallbackObj.getMethods(), true)) {
            zVarU7 = com.max.xiaoheihe.network.i.a().u7(map, url, webCallbackObj.getData());
        }
        if (zVarU7 == null) {
            return;
        }
        V((io.reactivex.disposables.b) zVarU7.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g(id2)));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46950, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_native_webview);
        a2();
        Y1();
        this.M = (WebView) findViewById(R.id.ptr_webview);
        Z1();
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) findViewById(R.id.srl);
        smartRefreshLayout.b0(false);
        smartRefreshLayout.i0(false);
        c2();
    }
}
