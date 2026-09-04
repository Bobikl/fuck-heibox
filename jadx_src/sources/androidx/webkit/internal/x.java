package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.annotation.n0;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: WebViewProviderFactoryAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WebViewProviderFactoryBoundaryInterface f28400a;

    public x(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f28400a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // androidx.webkit.internal.w
    public String[] a() {
        return this.f28400a.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.w
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebViewProviderBoundaryInterface.class, this.f28400a.createWebView(webView));
    }

    @Override // androidx.webkit.internal.w
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(ProxyControllerBoundaryInterface.class, this.f28400a.getProxyController());
    }

    @Override // androidx.webkit.internal.w
    @n0
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(ServiceWorkerControllerBoundaryInterface.class, this.f28400a.getServiceWorkerController());
    }

    @Override // androidx.webkit.internal.w
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(StaticsBoundaryInterface.class, this.f28400a.getStatics());
    }

    @Override // androidx.webkit.internal.w
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(TracingControllerBoundaryInterface.class, this.f28400a.getTracingController());
    }

    @Override // androidx.webkit.internal.w
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f28400a.getWebkitToCompatConverter());
    }
}
