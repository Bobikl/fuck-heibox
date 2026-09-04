package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.webkit.l0;
import androidx.webkit.m0;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* JADX INFO: compiled from: WebViewRenderProcessClientAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class y implements WebViewRendererClientBoundaryInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f28401c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f28402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0 f28403b;

    /* JADX INFO: compiled from: WebViewRenderProcessClientAdapter.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f28404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f28405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l0 f28406d;

        a(m0 m0Var, WebView webView, l0 l0Var) {
            this.f28404b = m0Var;
            this.f28405c = webView;
            this.f28406d = l0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28404b.b(this.f28405c, this.f28406d);
        }
    }

    /* JADX INFO: compiled from: WebViewRenderProcessClientAdapter.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f28408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f28409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l0 f28410d;

        b(m0 m0Var, WebView webView, l0 l0Var) {
            this.f28408b = m0Var;
            this.f28409c = webView;
            this.f28410d = l0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28408b.a(this.f28409c, this.f28410d);
        }
    }

    @SuppressLint({"LambdaLast"})
    public y(@p0 Executor executor, @p0 m0 m0Var) {
        this.f28402a = executor;
        this.f28403b = m0Var;
    }

    @p0
    public m0 a() {
        return this.f28403b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @n0
    public final String[] getSupportedFeatures() {
        return f28401c;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(@n0 WebView webView, @n0 InvocationHandler invocationHandler) {
        a0 a0VarC = a0.c(invocationHandler);
        m0 m0Var = this.f28403b;
        Executor executor = this.f28402a;
        if (executor == null) {
            m0Var.a(webView, a0VarC);
        } else {
            executor.execute(new b(m0Var, webView, a0VarC));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(@n0 WebView webView, @n0 InvocationHandler invocationHandler) {
        a0 a0VarC = a0.c(invocationHandler);
        m0 m0Var = this.f28403b;
        Executor executor = this.f28402a;
        if (executor == null) {
            m0Var.b(webView, a0VarC);
        } else {
            executor.execute(new a(m0Var, webView, a0VarC));
        }
    }
}
