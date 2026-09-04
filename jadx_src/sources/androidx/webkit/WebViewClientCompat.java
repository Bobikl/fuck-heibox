package androidx.webkit;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RestrictTo;
import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.w0;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f28324a = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    @w0(21)
    @i1
    public void a(@n0 WebView webView, @n0 WebResourceRequest webResourceRequest, @n0 m mVar) {
        if (k0.a("WEB_RESOURCE_ERROR_GET_CODE") && k0.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, mVar.b(), mVar.a().toString(), webResourceRequest.getUrl().toString());
        }
    }

    @i1
    public void b(@n0 WebView webView, @n0 WebResourceRequest webResourceRequest, int i10, @n0 d dVar) {
        if (!k0.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        dVar.c(true);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String[] getSupportedFeatures() {
        return f28324a;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @i1
    public void onPageCommitVisible(@n0 WebView webView, @n0 String str) {
    }

    @Override // android.webkit.WebViewClient
    @w0(23)
    public final void onReceivedError(@n0 WebView webView, @n0 WebResourceRequest webResourceRequest, @n0 WebResourceError webResourceError) {
        a(webView, webResourceRequest, new androidx.webkit.internal.q(webResourceError));
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @w0(21)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void onReceivedError(@n0 WebView webView, @n0 WebResourceRequest webResourceRequest, @n0 InvocationHandler invocationHandler) {
        a(webView, webResourceRequest, new androidx.webkit.internal.q(invocationHandler));
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @i1
    public void onReceivedHttpError(@n0 WebView webView, @n0 WebResourceRequest webResourceRequest, @n0 WebResourceResponse webResourceResponse) {
    }

    @Override // android.webkit.WebViewClient
    @w0(27)
    public final void onSafeBrowsingHit(@n0 WebView webView, @n0 WebResourceRequest webResourceRequest, int i10, @n0 SafeBrowsingResponse safeBrowsingResponse) {
        b(webView, webResourceRequest, i10, new androidx.webkit.internal.f(safeBrowsingResponse));
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void onSafeBrowsingHit(@n0 WebView webView, @n0 WebResourceRequest webResourceRequest, int i10, @n0 InvocationHandler invocationHandler) {
        b(webView, webResourceRequest, i10, new androidx.webkit.internal.f(invocationHandler));
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @w0(21)
    @i1
    public boolean shouldOverrideUrlLoading(@n0 WebView webView, @n0 WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
