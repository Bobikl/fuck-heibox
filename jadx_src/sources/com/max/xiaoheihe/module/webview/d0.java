package com.max.xiaoheihe.module.webview;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.max.hbmmkv.MMKVManager;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.bbs.LocalHtmlObj;
import com.max.xiaoheihe.module.webview.component.LinkWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Stack;
import org.apache.tools.ant.taskdefs.v7;

/* JADX INFO: compiled from: WebViewManager.java */
/* JADX INFO: loaded from: classes12.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f94670a = "web_link.html";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile d0 f94673d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f94674e = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f94676g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f94671b = "https://" + lb.a.f131051u1 + "/bbs/link/html";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Integer f94672c = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Stack<LinkWebView> f94675f = new Stack<>();

    /* JADX INFO: compiled from: WebViewManager.java */
    public class a implements MessageQueue.IdleHandler {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47197, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (d0.f94675f.size() < 2) {
                d0.f94675f.push(d0.b(d0.this));
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: WebViewManager.java */
    public class b implements kh.o<String, io.reactivex.z<Result<LocalHtmlObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public io.reactivex.z<Result<LocalHtmlObj>> a(String str) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47198, new Class[]{String.class}, io.reactivex.z.class);
            return patchProxyResultProxy.isSupported ? (io.reactivex.z) patchProxyResultProxy.result : com.max.xiaoheihe.network.i.a().b2(d0.f94671b, str);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [io.reactivex.z<com.max.hbutils.bean.Result<com.max.xiaoheihe.bean.bbs.LocalHtmlObj>>, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ io.reactivex.z<Result<LocalHtmlObj>> apply(String str) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47199, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
        }
    }

    /* JADX INFO: compiled from: WebViewManager.java */
    public class c implements kh.o<File, String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public String a(File file) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 47200, new Class[]{File.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbutils.utils.s.b(file);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.lang.String] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ String apply(File file) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 47201, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(file);
        }
    }

    /* JADX INFO: compiled from: WebViewManager.java */
    public class d implements kh.o<Result<LocalHtmlObj>, File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f94680b;

        d(File file) {
            this.f94680b = file;
        }

        public File a(Result<LocalHtmlObj> result) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 47202, new Class[]{Result.class}, File.class);
            if (patchProxyResultProxy.isSupported) {
                return (File) patchProxyResultProxy.result;
            }
            String local_html = result.getResult().getLocal_html();
            if (com.max.hbcommon.utils.c.u(local_html)) {
                return this.f94680b;
            }
            if (this.f94680b.exists() && !this.f94680b.delete()) {
                throw new IOException("Failed to save local html");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(this.f94680b);
            fileOutputStream.write(local_html.getBytes("UTF-8"));
            fileOutputStream.close();
            return this.f94680b;
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ File apply(Result<LocalHtmlObj> result) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 47203, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(result);
        }
    }

    /* JADX INFO: compiled from: WebViewManager.java */
    public static class e extends com.max.hbcommon.network.d<File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<LinkWebView> f94682b;

        public e(LinkWebView linkWebView) {
            this.f94682b = new WeakReference<>(linkWebView);
        }

        public void onNext(File file) {
            if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 47204, new Class[]{File.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(file);
            if (file != null) {
                String unused = d0.f94676g = v7.f135919a + file.getAbsolutePath();
                LinkWebView linkWebView = this.f94682b.get();
                if (linkWebView != null) {
                    d0.m(linkWebView, d0.d());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47205, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((File) obj);
        }
    }

    /* JADX INFO: compiled from: WebViewManager.java */
    public static class f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f94683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g f94684b;

        /* JADX INFO: compiled from: WebViewManager.java */
        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47215, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                f.b(f.this);
            }
        }

        /* JADX INFO: compiled from: WebViewManager.java */
        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f94686b;

            b(String str) {
                this.f94686b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47216, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                f.c(f.this, this.f94686b);
            }
        }

        public f(WebView webView, g gVar) {
            this.f94683a = webView;
            this.f94684b = gVar;
        }

        static /* synthetic */ void b(f fVar) {
            if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, 47213, new Class[]{f.class}, Void.TYPE).isSupported) {
                return;
            }
            fVar.f();
        }

        static /* synthetic */ void c(f fVar, String str) {
            if (PatchProxy.proxy(new Object[]{fVar, str}, null, changeQuickRedirect, true, 47214, new Class[]{f.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            fVar.e(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47212, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            g(str);
        }

        private void e(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47209, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            Log.d("LocalJsBridge", "onDelegateRequest  callback: " + this.f94684b);
            g gVar = this.f94684b;
            if (gVar != null) {
                gVar.b(str);
            }
        }

        private void f() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47208, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f94683a.setTag(R.id.rb_0, d0.f94672c);
            this.f94683a.setTag(R.id.webview_allow_ev_js, Boolean.TRUE);
            g gVar = this.f94684b;
            if (gVar != null) {
                gVar.a();
            }
        }

        private void g(String str) {
            g gVar;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47211, new Class[]{String.class}, Void.TYPE).isSupported || (gVar = this.f94684b) == null) {
                return;
            }
            gVar.c(str);
        }

        @JavascriptInterface
        public void allowEvaluateJS(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47206, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.W("JavascriptInterface allowEvaluateJS");
            if (com.max.xiaoheihe.utils.d.P0()) {
                f();
            } else {
                new Handler(Looper.getMainLooper()).post(new a());
            }
        }

        @JavascriptInterface
        public void emitClientLinkFunction(final String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47210, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.xiaoheihe.utils.d.P0()) {
                g(str);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.max.xiaoheihe.module.webview.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f94692b.d(str);
                    }
                });
            }
        }

        public void h(g gVar) {
            this.f94684b = gVar;
        }

        @JavascriptInterface
        public void request(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47207, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            Log.d("LocalJsBridge", "request: " + str);
            if (com.max.xiaoheihe.utils.d.P0()) {
                e(str);
            } else {
                new Handler(Looper.getMainLooper()).post(new b(str));
            }
        }
    }

    /* JADX INFO: compiled from: WebViewManager.java */
    public interface g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f94688a = "story_mode_like";

        void a();

        void b(String str);

        void c(String str);
    }

    /* JADX INFO: compiled from: WebViewManager.java */
    public static class h extends WebViewClient {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: WebViewManager.java */
        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SslErrorHandler f94689a;

            a(SslErrorHandler sslErrorHandler) {
                this.f94689a = sslErrorHandler;
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 47220, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f94689a.proceed();
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 47219, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f94689a.cancel();
                dialog.dismiss();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (PatchProxy.proxy(new Object[]{webView, sslErrorHandler, sslError}, this, changeQuickRedirect, false, 47217, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = webView.getContext() instanceof Activity ? (Activity) webView.getContext() : null;
            if (activity == null || activity.isFinishing()) {
                return;
            }
            com.max.xiaoheihe.view.l.D(activity, activity.getString(R.string.prompt), activity.getString(R.string.ssl_error_hint), activity.getString(R.string.confirm), activity.getString(R.string.cancel), new a(sslErrorHandler));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 47218, new Class[]{WebView.class, String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            com.max.xiaoheihe.base.router.b.l0(webView.getContext(), str, webView, null, null);
            return true;
        }
    }

    private d0() {
    }

    static /* synthetic */ LinkWebView b(d0 d0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{d0Var}, null, changeQuickRedirect, true, 47195, new Class[]{d0.class}, LinkWebView.class);
        return patchProxyResultProxy.isSupported ? (LinkWebView) patchProxyResultProxy.result : d0Var.f();
    }

    static /* synthetic */ String d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47196, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : h();
    }

    private LinkWebView f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47186, new Class[0], LinkWebView.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinkWebView) patchProxyResultProxy.result;
        }
        LinkWebView linkWebView = new LinkWebView(new MutableContextWrapper(HeyBoxApplication.C().getApplicationContext()));
        k(linkWebView, false);
        if (f94676g == null) {
            o(linkWebView);
        } else {
            m(linkWebView, h());
        }
        return linkWebView;
    }

    public static d0 g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47184, new Class[0], d0.class);
        if (patchProxyResultProxy.isSupported) {
            return (d0) patchProxyResultProxy.result;
        }
        if (f94673d == null) {
            synchronized (d0.class) {
                if (f94673d == null) {
                    f94673d = new d0();
                }
            }
        }
        return f94673d;
    }

    private static String h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47194, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!MMKVManager.f71329a.d("webview", ad.c.f1222b, false, false)) {
            com.max.heybox.hblog.g.W("[WebViewLinkLoader] get file path");
            return f94676g;
        }
        String strE = com.max.xiaoheihe.utils.l0.e(f94676g);
        com.max.heybox.hblog.g.W("[WebViewLinkLoader] get full path: " + strE);
        return strE;
    }

    public static void j(WebView webView) {
        if (PatchProxy.proxy(new Object[]{webView}, null, changeQuickRedirect, true, 47188, new Class[]{WebView.class}, Void.TYPE).isSupported) {
            return;
        }
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setSupportZoom(true);
        settings.setTextZoom(100);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setBuiltInZoomControls(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setMixedContentMode(0);
    }

    public static void k(LinkWebView linkWebView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{linkWebView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 47187, new Class[]{LinkWebView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        linkWebView.setWebViewClient(new h());
        WebSettings settings = linkWebView.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setTextZoom(100);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setMixedContentMode(0);
        f fVar = new f(linkWebView, null);
        linkWebView.addJavascriptInterface(fVar, "local_obj");
        linkWebView.setTag(R.id.rb_2, fVar);
        l(linkWebView, z10);
    }

    public static void l(WebView webView, boolean z10) {
        int i10 = 2;
        if (PatchProxy.proxy(new Object[]{webView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 47190, new Class[]{WebView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            WebSettings settings = webView.getSettings();
            if (settings == null) {
                Log.d("initWebviewDarkMode", "settings is null");
                return;
            }
            if (Build.VERSION.SDK_INT < 29 || !androidx.webkit.k0.a("FORCE_DARK")) {
                return;
            }
            if (!z10) {
                try {
                    androidx.webkit.w.i(settings, 1);
                } catch (Throwable th2) {
                    com.max.heybox.hblog.g.G("setForceDarkStrategy " + th2.getMessage());
                }
            }
            if (!com.max.hbutils.utils.u.b(webView.getContext())) {
                i10 = 0;
            }
            androidx.webkit.w.h(settings, i10);
        } catch (Throwable th3) {
            com.max.heybox.hblog.g.G("initWebviewDarkMode " + th3.getMessage());
        }
    }

    public static void m(WebView webView, String str) {
        if (PatchProxy.proxy(new Object[]{webView, str}, null, changeQuickRedirect, true, 47192, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        webView.loadUrl(str);
    }

    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47193, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Stack<LinkWebView> stack = f94675f;
        if (stack != null) {
            stack.clear();
        }
        f94676g = null;
    }

    public LinkWebView i(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47189, new Class[]{Context.class}, LinkWebView.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinkWebView) patchProxyResultProxy.result;
        }
        Stack<LinkWebView> stack = f94675f;
        if (stack == null || stack.isEmpty()) {
            LinkWebView linkWebViewF = f();
            ((MutableContextWrapper) linkWebViewF.getContext()).setBaseContext(context);
            return linkWebViewF;
        }
        LinkWebView linkWebViewPop = stack.pop();
        ((MutableContextWrapper) linkWebViewPop.getContext()).setBaseContext(context);
        return linkWebViewPop;
    }

    public void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47185, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Looper.myQueue().addIdleHandler(new a());
    }

    public void o(LinkWebView linkWebView) {
        if (PatchProxy.proxy(new Object[]{linkWebView}, this, changeQuickRedirect, false, 47191, new Class[]{LinkWebView.class}, Void.TYPE).isSupported) {
            return;
        }
        File file = new File(com.max.xiaoheihe.utils.d.S("web_link"));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file.getAbsoluteFile(), f94670a);
        (file2.exists() ? io.reactivex.z.l3(file2).z3(new c()).k2(new b()) : com.max.xiaoheihe.network.i.a().b2(f94671b, null)).z3(new d(file2)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new e(linkWebView));
    }
}
