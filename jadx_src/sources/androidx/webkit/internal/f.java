package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.webkit.SafeBrowsingResponse;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* JADX INFO: compiled from: SafeBrowsingResponseImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class f extends androidx.webkit.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SafeBrowsingResponse f28370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f28371b;

    public f(@n0 SafeBrowsingResponse safeBrowsingResponse) {
        this.f28370a = safeBrowsingResponse;
    }

    public f(@n0 InvocationHandler invocationHandler) {
        this.f28371b = (SafeBrowsingResponseBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface d() {
        if (this.f28371b == null) {
            this.f28371b = (SafeBrowsingResponseBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(SafeBrowsingResponseBoundaryInterface.class, u.c().b(this.f28370a));
        }
        return this.f28371b;
    }

    @w0(27)
    private SafeBrowsingResponse e() {
        if (this.f28370a == null) {
            this.f28370a = u.c().a(Proxy.getInvocationHandler(this.f28371b));
        }
        return this.f28370a;
    }

    @Override // androidx.webkit.d
    @SuppressLint({"NewApi"})
    public void a(boolean z10) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        if (feature.isSupportedByFramework()) {
            e().backToSafety(z10);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            d().backToSafety(z10);
        }
    }

    @Override // androidx.webkit.d
    @SuppressLint({"NewApi"})
    public void b(boolean z10) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("SAFE_BROWSING_RESPONSE_PROCEED");
        if (feature.isSupportedByFramework()) {
            e().proceed(z10);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            d().proceed(z10);
        }
    }

    @Override // androidx.webkit.d
    @SuppressLint({"NewApi"})
    public void c(boolean z10) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        if (feature.isSupportedByFramework()) {
            e().showInterstitial(z10);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            d().showInterstitial(z10);
        }
    }
}
