package com.alipay.mobile.android.verify.bridge;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.squareup.otto.Subscribe;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class BridgeWebView extends WebView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<JsResult> f39331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<JsPromptResult> f39332c;

    public BridgeWebView(Context context) {
        super(context);
        a();
    }

    public BridgeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public BridgeWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    private void a() {
        b();
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setWebChromeClient(new c());
        setWebViewClient(new e());
        b.a().register(this);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setSupportMultipleWindows(false);
        settings.setDefaultFixedFontSize(16);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e10) {
            com.alipay.mobile.android.verify.logger.f.k("BridgeWebView").k(e10, "set js enable got error during customSettings", new Object[0]);
        }
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setGeolocationEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setUserAgentString(settings.getUserAgentString() + " AlipayVerifySDK/2.0.2 ZOLOZ_PKG_TYPE/FIN_CLOUD");
        WebView.setWebContentsDebuggingEnabled(false);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
        try {
            WeakReference<JsResult> weakReference = this.f39331b;
            if (weakReference != null) {
                weakReference.get().cancel();
            }
        } catch (Exception unused) {
            com.alipay.mobile.android.verify.logger.f.k("BridgeWebView").c("cancel js result got error", new Object[0]);
        }
        try {
            WeakReference<JsPromptResult> weakReference2 = this.f39332c;
            if (weakReference2 != null) {
                weakReference2.get().cancel();
            }
        } catch (Exception unused2) {
            com.alipay.mobile.android.verify.logger.f.k("BridgeWebView").c("cancel js prompt result got error", new Object[0]);
        }
        b.a().unregister(this);
    }

    @Subscribe
    public void onJsPromptResult(JsPromptResult jsPromptResult) {
        this.f39332c = new WeakReference<>(jsPromptResult);
    }

    @Subscribe
    public void onJsResult(JsResult jsResult) {
        this.f39331b = new WeakReference<>(jsResult);
    }
}
