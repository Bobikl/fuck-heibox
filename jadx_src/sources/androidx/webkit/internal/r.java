package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

/* JADX INFO: compiled from: WebResourceRequestAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebResourceRequestBoundaryInterface f28393a;

    public r(WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.f28393a = webResourceRequestBoundaryInterface;
    }

    public boolean a() {
        return this.f28393a.isRedirect();
    }
}
