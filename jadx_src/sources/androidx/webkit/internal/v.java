package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.webkit.j0;
import androidx.webkit.l0;
import androidx.webkit.m0;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: compiled from: WebViewProviderAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WebViewProviderBoundaryInterface f28399a;

    public v(@n0 WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f28399a = webViewProviderBoundaryInterface;
    }

    @n0
    public g a(@n0 String str, @n0 String[] strArr) {
        return g.b(this.f28399a.addDocumentStartJavascript(str, strArr));
    }

    public void b(@n0 String str, @n0 String[] strArr, @n0 j0.c cVar) {
        this.f28399a.addWebMessageListener(str, strArr, org.chromium.support_lib_boundary.util.a.d(new o(cVar)));
    }

    @n0
    public androidx.webkit.l[] c() {
        InvocationHandler[] invocationHandlerArrCreateWebMessageChannel = this.f28399a.createWebMessageChannel();
        androidx.webkit.l[] lVarArr = new androidx.webkit.l[invocationHandlerArrCreateWebMessageChannel.length];
        for (int i10 = 0; i10 < invocationHandlerArrCreateWebMessageChannel.length; i10++) {
            lVarArr[i10] = new p(invocationHandlerArrCreateWebMessageChannel[i10]);
        }
        return lVarArr;
    }

    @p0
    public WebChromeClient d() {
        return this.f28399a.getWebChromeClient();
    }

    @n0
    public WebViewClient e() {
        return this.f28399a.getWebViewClient();
    }

    @p0
    public l0 f() {
        return a0.c(this.f28399a.getWebViewRenderer());
    }

    @p0
    public m0 g() {
        InvocationHandler webViewRendererClient = this.f28399a.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((y) org.chromium.support_lib_boundary.util.a.g(webViewRendererClient)).a();
    }

    public void h(long j10, @n0 j0.b bVar) {
        this.f28399a.insertVisualStateCallback(j10, org.chromium.support_lib_boundary.util.a.d(new l(bVar)));
    }

    public void i(@n0 androidx.webkit.k kVar, @n0 Uri uri) {
        this.f28399a.postMessageToMainFrame(org.chromium.support_lib_boundary.util.a.d(new m(kVar)), uri);
    }

    public void j(@n0 String str) {
        this.f28399a.removeWebMessageListener(str);
    }

    @SuppressLint({"LambdaLast"})
    public void k(@p0 Executor executor, @p0 m0 m0Var) {
        this.f28399a.setWebViewRendererClient(m0Var != null ? org.chromium.support_lib_boundary.util.a.d(new y(executor, m0Var)) : null);
    }
}
