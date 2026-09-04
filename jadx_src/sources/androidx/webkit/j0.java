package androidx.webkit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.RestrictTo;
import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: compiled from: WebViewCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f28414a = Uri.parse(androidx.webkit.b.f28327e);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f28415b = Uri.parse("");

    /* JADX INFO: compiled from: WebViewCompat.java */
    public class a extends WebView.VisualStateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f28416a;

        a(b bVar) {
            this.f28416a = bVar;
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j10) {
            this.f28416a.onComplete(j10);
        }
    }

    /* JADX INFO: compiled from: WebViewCompat.java */
    public interface b {
        @i1
        void onComplete(long j10);
    }

    /* JADX INFO: compiled from: WebViewCompat.java */
    public interface c {
        @i1
        void a(@n0 WebView webView, @n0 k kVar, @n0 Uri uri, boolean z10, @n0 androidx.webkit.a aVar);
    }

    private j0() {
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static e a(@n0 WebView webView, @n0 String str, @n0 Set<String> set) {
        if (WebViewFeatureInternal.getFeature("DOCUMENT_START_SCRIPT").isSupportedByWebView()) {
            return j(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void b(@n0 WebView webView, @n0 String str, @n0 Set<String> set, @n0 c cVar) {
        if (!WebViewFeatureInternal.getFeature("WEB_MESSAGE_LISTENER").isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        j(webView).b(str, (String[]) set.toArray(new String[0]), cVar);
    }

    private static void c(WebView webView) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, new Object[0]);
                return;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        }
        if (webView.getWebViewLooper() == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webView.getWebViewLooper() + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    private static WebViewProviderBoundaryInterface d(WebView webView) {
        return g().createWebView(webView);
    }

    @n0
    @SuppressLint({"NewApi"})
    public static l[] e(@n0 WebView webView) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("CREATE_WEB_MESSAGE_CHANNEL");
        if (feature.isSupportedByFramework()) {
            return androidx.webkit.internal.p.l(webView.createWebMessageChannel());
        }
        if (feature.isSupportedByWebView()) {
            return j(webView).c();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @p0
    public static PackageInfo f(@n0 Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return WebView.getCurrentWebViewPackage();
        }
        try {
            PackageInfo packageInfoH = h();
            return packageInfoH != null ? packageInfoH : i(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static androidx.webkit.internal.w g() {
        return androidx.webkit.internal.u.d();
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo h() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo i(Context context) {
        try {
            String str = Build.VERSION.SDK_INT <= 23 ? (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]) : (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static androidx.webkit.internal.v j(WebView webView) {
        return new androidx.webkit.internal.v(d(webView));
    }

    @n0
    @SuppressLint({"NewApi"})
    public static Uri k() {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("SAFE_BROWSING_PRIVACY_POLICY_URL");
        if (feature.isSupportedByFramework()) {
            return WebView.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (feature.isSupportedByWebView()) {
            return g().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    @p0
    public static WebChromeClient l(@n0 WebView webView) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("GET_WEB_CHROME_CLIENT");
        if (feature.isSupportedByFramework()) {
            return webView.getWebChromeClient();
        }
        if (feature.isSupportedByWebView()) {
            return j(webView).d();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @n0
    @SuppressLint({"NewApi"})
    public static WebViewClient m(@n0 WebView webView) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("GET_WEB_VIEW_CLIENT");
        if (feature.isSupportedByFramework()) {
            return webView.getWebViewClient();
        }
        if (feature.isSupportedByWebView()) {
            return j(webView).e();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    @p0
    public static l0 n(@n0 WebView webView) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("GET_WEB_VIEW_RENDERER");
        if (!feature.isSupportedByFramework()) {
            if (feature.isSupportedByWebView()) {
                return j(webView).f();
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebViewRenderProcess webViewRenderProcess = webView.getWebViewRenderProcess();
        if (webViewRenderProcess != null) {
            return androidx.webkit.internal.a0.b(webViewRenderProcess);
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    @p0
    public static m0 o(@n0 WebView webView) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        if (!feature.isSupportedByFramework()) {
            if (feature.isSupportedByWebView()) {
                return j(webView).g();
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebViewRenderProcessClient webViewRenderProcessClient = webView.getWebViewRenderProcessClient();
        if (webViewRenderProcessClient == null || !(webViewRenderProcessClient instanceof androidx.webkit.internal.z)) {
            return null;
        }
        return ((androidx.webkit.internal.z) webViewRenderProcessClient).a();
    }

    public static boolean p() {
        if (WebViewFeatureInternal.getFeature(k0.L).isSupportedByWebView()) {
            return g().getStatics().isMultiProcessEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void q(@n0 WebView webView, long j10, @n0 b bVar) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("VISUAL_STATE_CALLBACK");
        if (feature.isSupportedByFramework()) {
            webView.postVisualStateCallback(j10, new a(bVar));
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            c(webView);
            j(webView).h(j10, bVar);
        }
    }

    @SuppressLint({"NewApi"})
    public static void r(@n0 WebView webView, @n0 k kVar, @n0 Uri uri) {
        if (f28414a.equals(uri)) {
            uri = f28415b;
        }
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("POST_WEB_MESSAGE");
        if (feature.isSupportedByFramework()) {
            webView.postWebMessage(androidx.webkit.internal.p.g(kVar), uri);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            j(webView).i(kVar, uri);
        }
    }

    public static void s(@n0 WebView webView, @n0 String str) {
        if (!WebViewFeatureInternal.getFeature("WEB_MESSAGE_LISTENER").isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        j(webView).j(str);
    }

    @SuppressLint({"NewApi"})
    public static void t(@n0 List<String> list, @p0 ValueCallback<Boolean> valueCallback) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("SAFE_BROWSING_WHITELIST");
        if (feature.isSupportedByFramework()) {
            WebView.setSafeBrowsingWhitelist(list, valueCallback);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            g().getStatics().setSafeBrowsingWhitelist(list, valueCallback);
        }
    }

    @SuppressLint({"NewApi"})
    public static void u(@n0 WebView webView, @p0 m0 m0Var) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        if (feature.isSupportedByFramework()) {
            webView.setWebViewRenderProcessClient(m0Var != null ? new androidx.webkit.internal.z(m0Var) : null);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            j(webView).k(null, m0Var);
        }
    }

    @SuppressLint({"LambdaLast", "NewApi"})
    public static void v(@n0 WebView webView, @n0 Executor executor, @n0 m0 m0Var) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        if (feature.isSupportedByFramework()) {
            webView.setWebViewRenderProcessClient(executor, m0Var != null ? new androidx.webkit.internal.z(m0Var) : null);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            j(webView).k(executor, m0Var);
        }
    }

    @SuppressLint({"NewApi"})
    public static void w(@n0 Context context, @p0 ValueCallback<Boolean> valueCallback) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("START_SAFE_BROWSING");
        if (feature.isSupportedByFramework()) {
            WebView.startSafeBrowsing(context, valueCallback);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            g().getStatics().initSafeBrowsing(context, valueCallback);
        }
    }
}
