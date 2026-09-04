package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.webkit.ServiceWorkerWebSettings;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;

/* JADX INFO: compiled from: ServiceWorkerWebSettingsImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class j extends androidx.webkit.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ServiceWorkerWebSettings f28377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ServiceWorkerWebSettingsBoundaryInterface f28378b;

    public j(@n0 ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f28377a = serviceWorkerWebSettings;
    }

    public j(@n0 InvocationHandler invocationHandler) {
        this.f28378b = (ServiceWorkerWebSettingsBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }

    private ServiceWorkerWebSettingsBoundaryInterface i() {
        if (this.f28378b == null) {
            this.f28378b = (ServiceWorkerWebSettingsBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(ServiceWorkerWebSettingsBoundaryInterface.class, u.c().d(this.f28377a));
        }
        return this.f28378b;
    }

    @w0(24)
    private ServiceWorkerWebSettings j() {
        if (this.f28377a == null) {
            this.f28377a = u.c().c(Proxy.getInvocationHandler(this.f28378b));
        }
        return this.f28377a;
    }

    @Override // androidx.webkit.h
    @SuppressLint({"NewApi"})
    public boolean a() {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            return j().getAllowContentAccess();
        }
        if (webViewFeatureInternal.isSupportedByWebView()) {
            return i().getAllowContentAccess();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.h
    @SuppressLint({"NewApi"})
    public boolean b() {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            return j().getAllowFileAccess();
        }
        if (webViewFeatureInternal.isSupportedByWebView()) {
            return i().getAllowFileAccess();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.h
    @SuppressLint({"NewApi"})
    public boolean c() {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            return j().getBlockNetworkLoads();
        }
        if (webViewFeatureInternal.isSupportedByWebView()) {
            return i().getBlockNetworkLoads();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.h
    @SuppressLint({"NewApi"})
    public int d() {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            return j().getCacheMode();
        }
        if (webViewFeatureInternal.isSupportedByWebView()) {
            return i().getCacheMode();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.h
    @SuppressLint({"NewApi"})
    public void e(boolean z10) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            j().setAllowContentAccess(z10);
        } else {
            if (!webViewFeatureInternal.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            i().setAllowContentAccess(z10);
        }
    }

    @Override // androidx.webkit.h
    @SuppressLint({"NewApi"})
    public void f(boolean z10) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            j().setAllowFileAccess(z10);
        } else {
            if (!webViewFeatureInternal.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            i().setAllowFileAccess(z10);
        }
    }

    @Override // androidx.webkit.h
    @SuppressLint({"NewApi"})
    public void g(boolean z10) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            j().setBlockNetworkLoads(z10);
        } else {
            if (!webViewFeatureInternal.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            i().setBlockNetworkLoads(z10);
        }
    }

    @Override // androidx.webkit.h
    @SuppressLint({"NewApi"})
    public void h(int i10) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            j().setCacheMode(i10);
        } else {
            if (!webViewFeatureInternal.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            i().setCacheMode(i10);
        }
    }
}
