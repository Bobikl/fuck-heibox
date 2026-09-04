package com.huawei.secure.android.common.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.secure.android.common.util.LogsUtil;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SafeWebView extends WebView {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f63117f = "SafeWebView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f63119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String[] f63120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f63121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WebViewLoadCallBack f63122e;

    public static class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SslErrorHandler f63123a;

        b(SslErrorHandler sslErrorHandler) {
            this.f63123a = sslErrorHandler;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f63123a.cancel();
        }
    }

    public static class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SslErrorHandler f63124a;

        c(SslErrorHandler sslErrorHandler) {
            this.f63124a = sslErrorHandler;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f63124a.proceed();
        }
    }

    public final class d extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WebViewClient f63125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f63126b;

        private d(WebViewClient webViewClient, boolean z10) {
            this.f63125a = webViewClient;
            this.f63126b = z10;
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z10);
            } else {
                super.doUpdateVisitedHistory(webView, str, z10);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                super.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            } else {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null && !this.f63126b) {
                webViewClient.onPageStarted(webView, str, bitmap);
            } else if (SafeWebView.this.isWhiteListUrl(str)) {
                super.onPageStarted(webView, str, bitmap);
            } else {
                SafeWebView.this.onCheckError(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i10, str, str2);
            } else {
                super.onReceivedError(webView, i10, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } else {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(12)
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewClient webViewClient = this.f63125a;
            return webViewClient != null ? webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
            } else {
                super.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f10, float f11) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f10, f11);
            } else {
                super.onScaleChanged(webView, f10, f11);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onTooManyRedirects(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onTooManyRedirects(webView, message, message2);
            } else {
                super.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f63125a;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f63125a;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(11)
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient = this.f63125a;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, str) : super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f63125a;
            return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f63125a;
            return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest) : super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient = this.f63125a;
            return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public SafeWebView(Context context) {
        super(context);
        a();
    }

    public SafeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public SafeWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    @TargetApi(21)
    public SafeWebView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private void a() {
        SafeWebSettings.initWebviewAndSettings(this);
        setWebViewClient(null);
    }

    private boolean a(String str) {
        return URLUtil.isHttpUrl(str);
    }

    public String getDefaultErrorPage() {
        return this.f63118a;
    }

    public WebViewLoadCallBack getWebViewLoadCallBack() {
        return this.f63122e;
    }

    @TargetApi(9)
    @Deprecated
    public String[] getWhitelist() {
        String[] strArr = this.f63119b;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String[] getWhitelistNotMatchSubDomain() {
        String[] strArr = this.f63120c;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public String[] getWhitelistNotMathcSubDomain() {
        String[] strArr = this.f63120c;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public String[] getWhitelistWithPath() {
        String[] strArr = this.f63121d;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public boolean isWhiteListUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            LogsUtil.e(f63117f, "url is null");
            return false;
        }
        if (!URLUtil.isNetworkUrl(str)) {
            return true;
        }
        String[] whitelistWithPath = getWhitelistWithPath();
        String[] whitelistNotMatchSubDomain = getWhitelistNotMatchSubDomain();
        String[] whitelist = getWhitelist();
        if (whitelistWithPath == null || whitelistWithPath.length == 0) {
            return (whitelistNotMatchSubDomain == null || whitelistNotMatchSubDomain.length == 0) ? UriUtil.isUrlHostInWhitelist(str, whitelist) : UriUtil.isUrlHostSameWhitelist(str, whitelistNotMatchSubDomain);
        }
        return UriUtil.isUrlHostAndPathInWhitelist(str, whitelistWithPath);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!a(str)) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            return;
        }
        Log.e(f63117f, "loadDataWithBaseURL: http url , not safe");
        if (!TextUtils.isEmpty(this.f63118a)) {
            super.loadDataWithBaseURL(this.f63118a, str2, str3, str4, str5);
        } else if (getWebViewLoadCallBack() != null) {
            Log.e(f63117f, "WebViewLoadCallBack");
            getWebViewLoadCallBack().onCheckError(str, WebViewLoadCallBack.ErrorCode.HTTP_URL);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (!isWhiteListUrl(str)) {
            Log.e(f63117f, "loadUrl: url is not in white list");
            return;
        }
        if (!a(str)) {
            super.loadUrl(str);
            return;
        }
        Log.e(f63117f, "loadUrl: http url , not safe");
        if (!TextUtils.isEmpty(this.f63118a)) {
            super.loadUrl(this.f63118a);
        } else if (getWebViewLoadCallBack() != null) {
            Log.e(f63117f, "WebViewLoadCallBack");
            getWebViewLoadCallBack().onCheckError(str, WebViewLoadCallBack.ErrorCode.HTTP_URL);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (!isWhiteListUrl(str)) {
            Log.e(f63117f, "loadUrl: url is not in white list");
            return;
        }
        if (!a(str)) {
            super.loadUrl(str, map);
            return;
        }
        Log.e(f63117f, "loadUrl: http url , not safe");
        if (!TextUtils.isEmpty(this.f63118a)) {
            super.loadUrl(this.f63118a, map);
        } else if (getWebViewLoadCallBack() != null) {
            Log.e(f63117f, "WebViewLoadCallBack");
            getWebViewLoadCallBack().onCheckError(str, WebViewLoadCallBack.ErrorCode.HTTP_URL);
        }
    }

    public final void onCheckError(WebView webView, String str) {
        LogsUtil.e(f63117f, "onCheckError url is not in white list ", str);
        webView.stopLoading();
        String defaultErrorPage = getDefaultErrorPage();
        if (!TextUtils.isEmpty(defaultErrorPage)) {
            webView.loadUrl(defaultErrorPage);
        } else if (getWebViewLoadCallBack() != null) {
            Log.e(f63117f, "onPageStarted WebViewLoadCallBack");
            getWebViewLoadCallBack().onCheckError(str, WebViewLoadCallBack.ErrorCode.URL_NOT_IN_WHITE_LIST);
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        if (!isWhiteListUrl(str)) {
            Log.e(f63117f, "postUrl: url is not in white list");
            return;
        }
        if (!a(str)) {
            super.postUrl(str, bArr);
            return;
        }
        Log.e(f63117f, "postUrl: http url , not safe");
        if (!TextUtils.isEmpty(this.f63118a)) {
            super.postUrl(this.f63118a, bArr);
        } else if (getWebViewLoadCallBack() != null) {
            Log.e(f63117f, "WebViewLoadCallBack");
            getWebViewLoadCallBack().onCheckError(str, WebViewLoadCallBack.ErrorCode.HTTP_URL);
        }
    }

    public void setDefaultErrorPage(String str) {
        this.f63118a = str;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new d(webViewClient, true));
    }

    public void setWebViewClient(WebViewClient webViewClient, boolean z10) {
        super.setWebViewClient(new d(webViewClient, z10));
    }

    public void setWebViewLoadCallBack(WebViewLoadCallBack webViewLoadCallBack) {
        this.f63122e = webViewLoadCallBack;
    }

    @TargetApi(9)
    @Deprecated
    public void setWhitelist(String[] strArr) {
        this.f63119b = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void setWhitelistNotMatchSubDomain(String[] strArr) {
        this.f63120c = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public void setWhitelistNotMathcSubDomain(String[] strArr) {
        this.f63120c = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public void setWhitelistWithPath(String[] strArr) {
        this.f63121d = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    protected final void showNoticeWhenSSLErrorOccurred(String str, String str2, String str3, String str4, SslErrorHandler sslErrorHandler) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        c cVar = new c(sslErrorHandler);
        b bVar = new b(sslErrorHandler);
        builder.setMessage(str2);
        builder.setPositiveButton(str3, cVar);
        builder.setNegativeButton(str4, bVar);
        builder.create().show();
    }
}
