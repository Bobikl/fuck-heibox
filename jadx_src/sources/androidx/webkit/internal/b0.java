package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: WebkitToCompatConverter.java */
/* JADX INFO: loaded from: classes6.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f28364a;

    public b0(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f28364a = webkitToCompatConverterBoundaryInterface;
    }

    @n0
    @w0(27)
    public SafeBrowsingResponse a(@n0 InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f28364a.convertSafeBrowsingResponse(invocationHandler);
    }

    @n0
    public InvocationHandler b(@n0 SafeBrowsingResponse safeBrowsingResponse) {
        return this.f28364a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    @n0
    @w0(24)
    public ServiceWorkerWebSettings c(@n0 InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.f28364a.convertServiceWorkerSettings(invocationHandler);
    }

    @n0
    public InvocationHandler d(@n0 ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f28364a.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    @n0
    public s e(WebSettings webSettings) {
        return new s((WebSettingsBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebSettingsBoundaryInterface.class, this.f28364a.convertSettings(webSettings)));
    }

    @n0
    @w0(23)
    public WebMessagePort f(@n0 InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f28364a.convertWebMessagePort(invocationHandler);
    }

    @n0
    public InvocationHandler g(@n0 WebMessagePort webMessagePort) {
        return this.f28364a.convertWebMessagePort(webMessagePort);
    }

    @n0
    @w0(23)
    public WebResourceError h(@n0 InvocationHandler invocationHandler) {
        return (WebResourceError) this.f28364a.convertWebResourceError(invocationHandler);
    }

    @n0
    public InvocationHandler i(@n0 WebResourceError webResourceError) {
        return this.f28364a.convertWebResourceError(webResourceError);
    }

    @n0
    public r j(WebResourceRequest webResourceRequest) {
        return new r((WebResourceRequestBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebResourceRequestBoundaryInterface.class, this.f28364a.convertWebResourceRequest(webResourceRequest)));
    }
}
