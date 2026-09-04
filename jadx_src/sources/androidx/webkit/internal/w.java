package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.annotation.n0;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: WebViewProviderFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public interface w {
    String[] a();

    WebViewProviderBoundaryInterface createWebView(WebView webView);

    ProxyControllerBoundaryInterface getProxyController();

    @n0
    ServiceWorkerControllerBoundaryInterface getServiceWorkerController();

    StaticsBoundaryInterface getStatics();

    TracingControllerBoundaryInterface getTracingController();

    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}
