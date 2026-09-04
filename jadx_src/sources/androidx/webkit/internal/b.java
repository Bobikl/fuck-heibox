package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: FrameworkServiceWorkerClient.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(24)
public class b extends ServiceWorkerClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.webkit.f f28363a;

    public b(@n0 androidx.webkit.f fVar) {
        this.f28363a = fVar;
    }

    @p0
    public WebResourceResponse shouldInterceptRequest(@n0 WebResourceRequest webResourceRequest) {
        return this.f28363a.a(webResourceRequest);
    }
}
