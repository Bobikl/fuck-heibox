package com.max.xiaoheihe.module.webview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.NavBarCfgObj;
import com.max.xiaoheihe.bean.WebCfgObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes12.dex */
public class NativeWebActionActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private String M;
    private String N = "nativaweb";
    private WebView O;

    public class a extends WebViewClient {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f94255a = 0;

        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 46985, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 46987, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageFinished(webView, str);
            com.max.hbcommon.utils.d.b("nativeweb", "onPageFinished:" + str + ", ");
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{webView, str, bitmap}, this, changeQuickRedirect, false, 46986, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            com.max.hbcommon.utils.d.b(NativeWebActionActivity.this.N, "onPageStarted:" + str);
            this.f94255a = Math.max(this.f94255a, 1);
        }

        @Override // android.webkit.WebViewClient
        @androidx.annotation.p0
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, webResourceRequest}, this, changeQuickRedirect, false, 46984, new Class[]{WebView.class, WebResourceRequest.class}, WebResourceResponse.class);
            return patchProxyResultProxy.isSupported ? (WebResourceResponse) patchProxyResultProxy.result : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebProtocolObj webProtocolObjE0;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 46988, new Class[]{WebView.class, String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            com.max.hbcommon.utils.d.b(NativeWebActionActivity.this.N, "shouldOverrideUrlLoading  " + str);
            if (!str.startsWith("heybox") || (webProtocolObjE0 = com.max.xiaoheihe.utils.l0.e0(str)) == null || !"openWindow".equals(webProtocolObjE0.getProtocol_type())) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            Intent intent = new Intent(((BaseActivity) NativeWebActionActivity.this).f66601b, (Class<?>) NativeWebActionActivity.class);
            WebCfgObj webview = webProtocolObjE0.getWebview();
            if (webview != null && !com.max.hbcommon.utils.c.u(webview.getUrl())) {
                intent.putExtra("pageurl", webview.getUrl());
            }
            NavBarCfgObj navBarCfgObj = (NavBarCfgObj) webProtocolObjE0.objectOf("navigation_bar", NavBarCfgObj.class);
            if (navBarCfgObj != null && navBarCfgObj.getTitle() != null) {
                intent.putExtra("title", navBarCfgObj.getTitle());
            }
            com.max.xiaoheihe.utils.d.G1(((BaseActivity) NativeWebActionActivity.this).f66601b, intent);
            return true;
        }
    }

    private void Q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46982, new Class[0], Void.TYPE).isSupported || getIntent() == null) {
            return;
        }
        this.L = getIntent().getStringExtra("pageurl");
        this.M = getIntent().getStringExtra("title");
    }

    private void R1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46983, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.a0();
        this.f66616q.setTitle(this.M);
    }

    private void T1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46981, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebSettings settings = this.O.getSettings();
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
        if (this.L.endsWith(".apk")) {
            com.max.xiaoheihe.utils.l0.y0(this.f66601b, this.L);
        }
        this.L = com.max.xiaoheihe.utils.l0.e(this.L);
        this.O.setWebViewClient(new a());
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46980, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_native_webview);
        Q1();
        R1();
        this.O = (WebView) findViewById(R.id.ptr_webview);
        T1();
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) findViewById(R.id.srl);
        smartRefreshLayout.b0(false);
        smartRefreshLayout.i0(false);
        WebView webView = this.O;
        String str = this.L;
        webView.loadUrl(str, com.max.xiaoheihe.utils.l0.p(str));
    }
}
