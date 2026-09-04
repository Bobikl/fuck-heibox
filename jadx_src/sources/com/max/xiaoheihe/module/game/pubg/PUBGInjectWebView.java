package com.max.xiaoheihe.module.game.pubg;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Map;
import z5.g;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGInjectWebView extends WebView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static PUBGInjectWebView f88124e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f88125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f88126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f88127d;

    public class a extends WebViewClient {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 38305, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("PUBGInjectWebView", "onPageFinished" + str);
            if (!PUBGInjectWebView.this.f88125b && !com.max.hbcommon.utils.c.u(PUBGInjectWebView.this.f88126c)) {
                webView.loadUrl("javascript:if(document.documentElement.innerHTML.match('" + PUBGInjectWebView.this.f88127d + "')){window.local_obj.setFlag();" + PUBGInjectWebView.this.f88126c + g.f141884d);
            }
            super.onPageFinished(webView, str);
        }
    }

    public final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @JavascriptInterface
        public void setFlag() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38306, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("PUBGInjectWebView", "setFlag==");
            PUBGInjectWebView.this.f88125b = true;
        }
    }

    public class c {
        public static ChangeQuickRedirect changeQuickRedirect;

        public c() {
        }

        @JavascriptInterface
        public void reportdata(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38307, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("PUBGInjectWebView", "reportdata==" + str);
            com.max.xiaoheihe.base.router.b.k0(HeyBoxApplication.C(), str);
        }
    }

    private PUBGInjectWebView(Context context) {
        super(context);
        e();
    }

    private void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38303, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getSettings().setJavaScriptEnabled(true);
        WebView.setWebContentsDebuggingEnabled(true);
        addJavascriptInterface(new b(), "local_obj");
        addJavascriptInterface(new c(), "AndroidWebView");
        setWebViewClient(new a());
    }

    public static synchronized PUBGInjectWebView getInstance() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 38302, new Class[0], PUBGInjectWebView.class);
        if (patchProxyResultProxy.isSupported) {
            return (PUBGInjectWebView) patchProxyResultProxy.result;
        }
        if (f88124e == null) {
            f88124e = new PUBGInjectWebView(HeyBoxApplication.C());
        }
        return f88124e;
    }

    public void f(String str, String str2, String str3, Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, map}, this, changeQuickRedirect, false, 38304, new Class[]{String.class, String.class, String.class, Map.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f88125b = false;
        this.f88127d = str2;
        this.f88126c = str3;
        com.max.hbcommon.utils.d.b("PUBGInjectWebView", "mMatchStr==" + this.f88127d + "\nmJs==" + this.f88126c);
        loadUrl(str, map);
    }
}
