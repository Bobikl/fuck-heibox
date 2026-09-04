package com.huawei.secure.android.common.webview;

import android.util.Log;
import android.webkit.WebView;
import com.huawei.secure.android.common.util.d;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public class SafeGetUrl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f63111c = "SafeGetUrl";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f63112d = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebView f63114b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f63115a;

        a(CountDownLatch countDownLatch) {
            this.f63115a = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            SafeGetUrl safeGetUrl = SafeGetUrl.this;
            safeGetUrl.setUrl(safeGetUrl.f63114b.getUrl());
            this.f63115a.countDown();
        }
    }

    public SafeGetUrl() {
    }

    public SafeGetUrl(WebView webView) {
        this.f63114b = webView;
    }

    public String getUrlMethod() {
        if (this.f63114b == null) {
            return "";
        }
        if (com.huawei.secure.android.common.util.c.a()) {
            return this.f63114b.getUrl();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        d.a(new a(countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            Log.e(f63111c, "getUrlMethod: InterruptedException " + e10.getMessage(), e10);
        }
        return this.f63113a;
    }

    public WebView getWebView() {
        return this.f63114b;
    }

    public void setUrl(String str) {
        this.f63113a = str;
    }

    public void setWebView(WebView webView) {
        this.f63114b = webView;
    }
}
