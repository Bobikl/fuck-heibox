package androidx.webkit;

import android.annotation.SuppressLint;
import android.webkit.WebResourceRequest;
import androidx.annotation.n0;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.r;

/* JADX INFO: compiled from: WebResourceRequestCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public class o {
    private o() {
    }

    private static r a(WebResourceRequest webResourceRequest) {
        return androidx.webkit.internal.u.c().j(webResourceRequest);
    }

    @SuppressLint({"NewApi"})
    public static boolean b(@n0 WebResourceRequest webResourceRequest) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.WEB_RESOURCE_REQUEST_IS_REDIRECT;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            return webResourceRequest.isRedirect();
        }
        if (webViewFeatureInternal.isSupportedByWebView()) {
            return a(webResourceRequest).a();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
