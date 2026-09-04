package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.webkit.WebResourceError;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* JADX INFO: compiled from: WebResourceErrorImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class q extends androidx.webkit.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebResourceError f28391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f28392b;

    public q(@n0 WebResourceError webResourceError) {
        this.f28391a = webResourceError;
    }

    public q(@n0 InvocationHandler invocationHandler) {
        this.f28392b = (WebResourceErrorBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface c() {
        if (this.f28392b == null) {
            this.f28392b = (WebResourceErrorBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebResourceErrorBoundaryInterface.class, u.c().i(this.f28391a));
        }
        return this.f28392b;
    }

    @w0(23)
    private WebResourceError d() {
        if (this.f28391a == null) {
            this.f28391a = u.c().h(Proxy.getInvocationHandler(this.f28392b));
        }
        return this.f28391a;
    }

    @Override // androidx.webkit.m
    @n0
    @SuppressLint({"NewApi"})
    public CharSequence a() {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        if (feature.isSupportedByFramework()) {
            return d().getDescription();
        }
        if (feature.isSupportedByWebView()) {
            return c().getDescription();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.m
    @SuppressLint({"NewApi"})
    public int b() {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("WEB_RESOURCE_ERROR_GET_CODE");
        if (feature.isSupportedByFramework()) {
            return d().getErrorCode();
        }
        if (feature.isSupportedByWebView()) {
            return c().getErrorCode();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
