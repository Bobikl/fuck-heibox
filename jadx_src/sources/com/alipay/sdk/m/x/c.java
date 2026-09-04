package com.alipay.sdk.m.x;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f39529d = "v1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39530e = "v2";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f39531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39532c;

    public c(Activity activity, String str) {
        super(activity);
        this.f39531b = activity;
        this.f39532c = str;
    }

    public static void j(WebView webView) {
        if (webView != null) {
            try {
                webView.resumeTimers();
            } catch (Throwable unused) {
            }
        }
    }

    public abstract void k(String str);

    public void l(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        CookieSyncManager.createInstance(this.f39531b.getApplicationContext()).sync();
        CookieManager.getInstance().setCookie(str, str2);
        CookieSyncManager.getInstance().sync();
    }

    public boolean m() {
        return f39529d.equals(this.f39532c);
    }

    public abstract boolean n();

    public abstract void o();
}
