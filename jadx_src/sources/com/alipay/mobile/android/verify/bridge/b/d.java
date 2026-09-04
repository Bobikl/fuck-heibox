package com.alipay.mobile.android.verify.bridge.b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.alipay.mobile.android.verify.bridge.j;
import com.squareup.otto.Subscribe;

/* JADX INFO: compiled from: ScriptLoaderPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements j4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f39345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39346c = false;

    public d(WebView webView) {
        this.f39345b = webView;
    }

    private void a() {
        j.c(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        if (this.f39346c) {
            com.alipay.mobile.android.verify.logger.f.k("ScriptLoaderPlugin").g("script already loaded");
            return;
        }
        String strB = j.b(this.f39345b.getContext().getApplicationContext());
        this.f39346c = !TextUtils.isEmpty(strB);
        com.alipay.mobile.android.verify.logger.f.k("ScriptLoaderPlugin").a("script load result %s", Boolean.valueOf(this.f39346c));
        new Handler(Looper.getMainLooper()).post(new f(this, strB));
    }

    private void f() {
        this.f39346c = false;
    }

    @Override // j4.c
    @Subscribe
    public void handle(j4.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("ScriptLoaderPlugin").a("null or empty action", new Object[0]);
            return;
        }
        if (j4.b.f124240b.equalsIgnoreCase(aVar.f124238c)) {
            f();
        } else if (j4.b.f124241c.equalsIgnoreCase(aVar.f124238c)) {
            a();
        } else if (j4.b.f124239a.equalsIgnoreCase(aVar.f124238c)) {
            a();
        }
    }
}
