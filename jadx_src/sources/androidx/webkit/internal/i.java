package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.webkit.ServiceWorkerController;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* JADX INFO: compiled from: ServiceWorkerControllerImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends androidx.webkit.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ServiceWorkerController f28374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ServiceWorkerControllerBoundaryInterface f28375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.webkit.h f28376c;

    @SuppressLint({"NewApi"})
    public i() {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            ServiceWorkerController serviceWorkerController = ServiceWorkerController.getInstance();
            this.f28374a = serviceWorkerController;
            this.f28375b = null;
            this.f28376c = new j(serviceWorkerController.getServiceWorkerWebSettings());
            return;
        }
        if (!webViewFeatureInternal.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.f28374a = null;
        ServiceWorkerControllerBoundaryInterface serviceWorkerController2 = u.d().getServiceWorkerController();
        this.f28375b = serviceWorkerController2;
        this.f28376c = new j(serviceWorkerController2.getServiceWorkerWebSettings());
    }

    private ServiceWorkerControllerBoundaryInterface d() {
        if (this.f28375b == null) {
            this.f28375b = u.d().getServiceWorkerController();
        }
        return this.f28375b;
    }

    @w0(24)
    private ServiceWorkerController e() {
        if (this.f28374a == null) {
            this.f28374a = ServiceWorkerController.getInstance();
        }
        return this.f28374a;
    }

    @Override // androidx.webkit.g
    @n0
    public androidx.webkit.h b() {
        return this.f28376c;
    }

    @Override // androidx.webkit.g
    @SuppressLint({"NewApi"})
    public void c(@p0 androidx.webkit.f fVar) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            e().setServiceWorkerClient(new b(fVar));
        } else {
            if (!webViewFeatureInternal.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            d().setServiceWorkerClient(org.chromium.support_lib_boundary.util.a.d(new h(fVar)));
        }
    }
}
