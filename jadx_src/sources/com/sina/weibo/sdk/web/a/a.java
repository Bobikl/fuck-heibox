package com.sina.weibo.sdk.web.a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.b.e;
import com.sina.weibo.sdk.common.UiError;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends b {
    public a(Activity activity, com.sina.weibo.sdk.web.a aVar, com.sina.weibo.sdk.web.b.b bVar) {
        super(activity, aVar, bVar);
    }

    private boolean l(String str) {
        Bundle bundleG;
        AuthInfo authInfoA = this.aA.u().a();
        return (authInfoA == null || !str.startsWith(authInfoA.getRedirectUrl()) || (bundleG = e.g(str)) == null || TextUtils.isEmpty(bundleG.getString("access_token"))) ? false : true;
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        AuthInfo authInfoA = this.aA.u().a();
        if (authInfoA == null || !str.startsWith(authInfoA.getRedirectUrl())) {
            return;
        }
        String strR = this.aA.u().r();
        if (!TextUtils.isEmpty(strR)) {
            WbAuthListener wbAuthListenerA = this.ax.a(strR);
            this.aB = wbAuthListenerA;
            if (wbAuthListenerA != null) {
                Bundle bundleG = e.g(str);
                if (bundleG != null) {
                    String string = bundleG.getString("error");
                    String string2 = bundleG.getString("error_code");
                    String string3 = bundleG.getString("error_description");
                    if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
                        Oauth2AccessToken accessToken = Oauth2AccessToken.parseAccessToken(bundleG);
                        AccessTokenHelper.writeAccessToken(this.ay, accessToken);
                        this.aB.onComplete(accessToken);
                    } else {
                        this.aB.onError(new UiError(-1, string2, string3));
                    }
                } else {
                    this.aB.onError(new UiError(-1, "bundle is null", "parse url error"));
                }
                this.ax.b(strR);
            }
        }
        com.sina.weibo.sdk.web.a aVar = this.az;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final void q() {
        super.q();
        String strR = this.aA.u().r();
        if (!TextUtils.isEmpty(strR)) {
            WbAuthListener wbAuthListenerA = this.ax.a(strR);
            this.aB = wbAuthListenerA;
            if (wbAuthListenerA != null) {
                wbAuthListenerA.onCancel();
            }
            this.ax.b(strR);
        }
        com.sina.weibo.sdk.web.a aVar = this.az;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final boolean s() {
        q();
        return true;
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return l(webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return l(str);
    }
}
