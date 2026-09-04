package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.webkit.m0;

/* JADX INFO: compiled from: WebViewRenderProcessClientFrameworkAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(29)
public class z extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m0 f28412a;

    public z(@n0 m0 m0Var) {
        this.f28412a = m0Var;
    }

    @p0
    public m0 a() {
        return this.f28412a;
    }

    public void onRenderProcessResponsive(@n0 WebView webView, @p0 WebViewRenderProcess webViewRenderProcess) {
        this.f28412a.a(webView, a0.b(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(@n0 WebView webView, @p0 WebViewRenderProcess webViewRenderProcess) {
        this.f28412a.b(webView, a0.b(webViewRenderProcess));
    }
}
