package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.annotation.n0;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: IncompatibleApkWebViewProviderFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f28365a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28366b = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily";

    @Override // androidx.webkit.internal.w
    @n0
    public String[] a() {
        return f28365a;
    }

    @Override // androidx.webkit.internal.w
    @n0
    public WebViewProviderBoundaryInterface createWebView(@n0 WebView webView) {
        throw new UnsupportedOperationException(f28366b);
    }

    @Override // androidx.webkit.internal.w
    @n0
    public ProxyControllerBoundaryInterface getProxyController() {
        throw new UnsupportedOperationException(f28366b);
    }

    @Override // androidx.webkit.internal.w
    @n0
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        throw new UnsupportedOperationException(f28366b);
    }

    @Override // androidx.webkit.internal.w
    @n0
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException(f28366b);
    }

    @Override // androidx.webkit.internal.w
    @n0
    public TracingControllerBoundaryInterface getTracingController() {
        throw new UnsupportedOperationException(f28366b);
    }

    @Override // androidx.webkit.internal.w
    @n0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException(f28366b);
    }
}
