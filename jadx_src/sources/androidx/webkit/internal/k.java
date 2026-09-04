package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.webkit.TracingController;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* JADX INFO: compiled from: TracingControllerImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class k extends androidx.webkit.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TracingController f28379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TracingControllerBoundaryInterface f28380b;

    @SuppressLint({"NewApi"})
    public k() {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            this.f28379a = TracingController.getInstance();
            this.f28380b = null;
        } else {
            if (!webViewFeatureInternal.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            this.f28379a = null;
            this.f28380b = u.d().getTracingController();
        }
    }

    private TracingControllerBoundaryInterface e() {
        if (this.f28380b == null) {
            this.f28380b = u.d().getTracingController();
        }
        return this.f28380b;
    }

    @w0(28)
    private TracingController f() {
        if (this.f28379a == null) {
            this.f28379a = TracingController.getInstance();
        }
        return this.f28379a;
    }

    @Override // androidx.webkit.j
    @SuppressLint({"NewApi"})
    public boolean b() {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            return f().isTracing();
        }
        if (webViewFeatureInternal.isSupportedByWebView()) {
            return e().isTracing();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.webkit.TracingConfig$Builder] */
    @Override // androidx.webkit.j
    @SuppressLint({"NewApi"})
    public void c(@n0 androidx.webkit.i iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("Tracing config must be non null");
        }
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            f().start(new Object() { // from class: android.webkit.TracingConfig$Builder
                static {
                    throw new NoClassDefFoundError();
                }

                public native /* synthetic */ TracingConfig$Builder addCategories(Collection<String> collection);

                public native /* synthetic */ TracingConfig$Builder addCategories(int... iArr);

                public native /* synthetic */ TracingConfig build();

                public native /* synthetic */ TracingConfig$Builder setTracingMode(int i10);
            }.addCategories(iVar.b()).addCategories(iVar.a()).setTracingMode(iVar.c()).build());
        } else {
            if (!webViewFeatureInternal.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            e().start(iVar.b(), iVar.a(), iVar.c());
        }
    }

    @Override // androidx.webkit.j
    @SuppressLint({"NewApi"})
    public boolean d(OutputStream outputStream, Executor executor) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            return f().stop(outputStream, executor);
        }
        if (webViewFeatureInternal.isSupportedByWebView()) {
            return e().stop(outputStream, executor);
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
