package androidx.webkit.internal;

import androidx.annotation.n0;
import androidx.webkit.k0;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

/* JADX INFO: compiled from: ProxyControllerImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends androidx.webkit.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ProxyControllerBoundaryInterface f28369a;

    private ProxyControllerBoundaryInterface d() {
        if (this.f28369a == null) {
            this.f28369a = u.d().getProxyController();
        }
        return this.f28369a;
    }

    @Override // androidx.webkit.c
    public void a(@n0 Executor executor, @n0 Runnable runnable) {
        if (!WebViewFeatureInternal.getFeature(k0.J).isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        d().clearProxyOverride(runnable, executor);
    }

    @Override // androidx.webkit.c
    public void c(@n0 androidx.webkit.b bVar, @n0 Executor executor, @n0 Runnable runnable) {
        if (!WebViewFeatureInternal.getFeature(k0.J).isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        List<androidx.webkit.b.C0226b> listB = bVar.b();
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, listB.size(), 2);
        for (int i10 = 0; i10 < listB.size(); i10++) {
            strArr[i10][0] = listB.get(0).a();
            strArr[i10][1] = listB.get(0).b();
        }
        d().setProxyOverride(strArr, (String[]) bVar.a().toArray(new String[0]), runnable, executor);
    }
}
