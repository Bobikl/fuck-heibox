package androidx.webkit;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: WebSettingsCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f28445a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f28446b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f28447c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f28448d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f28449e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f28450f = 2;

    /* JADX INFO: compiled from: WebSettingsCompat.java */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    /* JADX INFO: compiled from: WebSettingsCompat.java */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    /* JADX INFO: compiled from: WebSettingsCompat.java */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface c {
    }

    private w() {
    }

    private static androidx.webkit.internal.s a(WebSettings webSettings) {
        return androidx.webkit.internal.u.c().e(webSettings);
    }

    @SuppressLint({"NewApi"})
    public static int b(@n0 WebSettings webSettings) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("DISABLED_ACTION_MODE_MENU_ITEMS");
        if (feature.isSupportedByFramework()) {
            return webSettings.getDisabledActionModeMenuItems();
        }
        if (feature.isSupportedByWebView()) {
            return a(webSettings).a();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    public static int c(@n0 WebSettings webSettings) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("FORCE_DARK");
        if (feature.isSupportedByFramework()) {
            return webSettings.getForceDark();
        }
        if (feature.isSupportedByWebView()) {
            return a(webSettings).b();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    public static int d(@n0 WebSettings webSettings) {
        if (WebViewFeatureInternal.getFeature(k0.N).isSupportedByWebView()) {
            return a(webSettings).b();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    public static boolean e(@n0 WebSettings webSettings) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("OFF_SCREEN_PRERASTER");
        if (feature.isSupportedByFramework()) {
            return webSettings.getOffscreenPreRaster();
        }
        if (feature.isSupportedByWebView()) {
            return a(webSettings).d();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    public static boolean f(@n0 WebSettings webSettings) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("SAFE_BROWSING_ENABLE");
        if (feature.isSupportedByFramework()) {
            return webSettings.getSafeBrowsingEnabled();
        }
        if (feature.isSupportedByWebView()) {
            return a(webSettings).e();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    public static void g(@n0 WebSettings webSettings, int i10) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("DISABLED_ACTION_MODE_MENU_ITEMS");
        if (feature.isSupportedByFramework()) {
            webSettings.setDisabledActionModeMenuItems(i10);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a(webSettings).f(i10);
        }
    }

    @SuppressLint({"NewApi"})
    public static void h(@n0 WebSettings webSettings, int i10) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("FORCE_DARK");
        if (feature.isSupportedByFramework()) {
            webSettings.setForceDark(i10);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a(webSettings).g(i10);
        }
    }

    @SuppressLint({"NewApi"})
    public static void i(@n0 WebSettings webSettings, int i10) {
        if (!WebViewFeatureInternal.getFeature(k0.N).isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        a(webSettings).h(i10);
    }

    @SuppressLint({"NewApi"})
    public static void j(@n0 WebSettings webSettings, boolean z10) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("OFF_SCREEN_PRERASTER");
        if (feature.isSupportedByFramework()) {
            webSettings.setOffscreenPreRaster(z10);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a(webSettings).i(z10);
        }
    }

    @SuppressLint({"NewApi"})
    public static void k(@n0 WebSettings webSettings, boolean z10) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("SAFE_BROWSING_ENABLE");
        if (feature.isSupportedByFramework()) {
            webSettings.setSafeBrowsingEnabled(z10);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a(webSettings).j(z10);
        }
    }

    @SuppressLint({"NewApi"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void l(@n0 WebSettings webSettings, boolean z10) {
        if (!WebViewFeatureInternal.getFeature("SUPPRESS_ERROR_PAGE").isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        a(webSettings).k(z10);
    }

    @SuppressLint({"NewApi"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean m(@n0 WebSettings webSettings) {
        if (WebViewFeatureInternal.getFeature("SUPPRESS_ERROR_PAGE").isSupportedByWebView()) {
            return a(webSettings).l();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
