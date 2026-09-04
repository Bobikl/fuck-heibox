package androidx.webkit.internal;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.n0;
import androidx.annotation.p0;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;

/* JADX INFO: compiled from: ServiceWorkerClientAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class h implements ServiceWorkerClientBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.webkit.f f28373a;

    public h(@n0 androidx.webkit.f fVar) {
        this.f28373a = fVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @n0
    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    @p0
    public WebResourceResponse shouldInterceptRequest(@n0 WebResourceRequest webResourceRequest) {
        return this.f28373a.a(webResourceRequest);
    }
}
