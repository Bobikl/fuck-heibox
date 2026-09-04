package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.webkit.WebViewRenderProcess;
import androidx.annotation.n0;
import androidx.webkit.l0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* JADX INFO: compiled from: WebViewRenderProcessImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class a0 extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static WeakHashMap<WebViewRenderProcess, a0> f28359c = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebViewRendererBoundaryInterface f28360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<WebViewRenderProcess> f28361b;

    /* JADX INFO: compiled from: WebViewRenderProcessImpl.java */
    public class a implements Callable<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebViewRendererBoundaryInterface f28362b;

        a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.f28362b = webViewRendererBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new a0(this.f28362b);
        }
    }

    public a0(@n0 WebViewRenderProcess webViewRenderProcess) {
        this.f28361b = new WeakReference<>(webViewRenderProcess);
    }

    public a0(@n0 WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f28360a = webViewRendererBoundaryInterface;
    }

    @n0
    public static a0 b(@n0 WebViewRenderProcess webViewRenderProcess) {
        a0 a0Var = f28359c.get(webViewRenderProcess);
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(webViewRenderProcess);
        f28359c.put(webViewRenderProcess, a0Var2);
        return a0Var2;
    }

    @n0
    public static a0 c(@n0 InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (a0) webViewRendererBoundaryInterface.getOrCreatePeer(new a(webViewRendererBoundaryInterface));
    }

    @Override // androidx.webkit.l0
    @SuppressLint({"NewApi"})
    public boolean a() {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("WEB_VIEW_RENDERER_TERMINATE");
        if (!feature.isSupportedByFramework()) {
            if (feature.isSupportedByWebView()) {
                return this.f28360a.terminate();
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebViewRenderProcess webViewRenderProcess = this.f28361b.get();
        if (webViewRenderProcess != null) {
            return webViewRenderProcess.terminate();
        }
        return false;
    }
}
