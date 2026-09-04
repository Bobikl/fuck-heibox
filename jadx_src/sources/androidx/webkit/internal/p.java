package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* JADX INFO: compiled from: WebMessagePortImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class p extends androidx.webkit.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebMessagePort f28385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebMessagePortBoundaryInterface f28386b;

    /* JADX INFO: compiled from: WebMessagePortImpl.java */
    public class a extends WebMessagePort.WebMessageCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.webkit.l.a f28387a;

        a(androidx.webkit.l.a aVar) {
            this.f28387a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f28387a.a(new p(webMessagePort), p.i(webMessage));
        }
    }

    /* JADX INFO: compiled from: WebMessagePortImpl.java */
    public class b extends WebMessagePort.WebMessageCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.webkit.l.a f28389a;

        b(androidx.webkit.l.a aVar) {
            this.f28389a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f28389a.a(new p(webMessagePort), p.i(webMessage));
        }
    }

    public p(WebMessagePort webMessagePort) {
        this.f28385a = webMessagePort;
    }

    public p(InvocationHandler invocationHandler) {
        this.f28386b = (WebMessagePortBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    @n0
    @w0(23)
    public static WebMessage g(androidx.webkit.k kVar) {
        return new WebMessage(kVar.a(), h(kVar.b()));
    }

    @w0(23)
    @p0
    public static WebMessagePort[] h(androidx.webkit.l[] lVarArr) {
        if (lVarArr == null) {
            return null;
        }
        int length = lVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i10 = 0; i10 < length; i10++) {
            webMessagePortArr[i10] = lVarArr[i10].b();
        }
        return webMessagePortArr;
    }

    @n0
    @w0(23)
    public static androidx.webkit.k i(WebMessage webMessage) {
        return new androidx.webkit.k(webMessage.getData(), l(webMessage.getPorts()));
    }

    private WebMessagePortBoundaryInterface j() {
        if (this.f28386b == null) {
            this.f28386b = (WebMessagePortBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebMessagePortBoundaryInterface.class, u.c().g(this.f28385a));
        }
        return this.f28386b;
    }

    @w0(23)
    private WebMessagePort k() {
        if (this.f28385a == null) {
            this.f28385a = u.c().f(Proxy.getInvocationHandler(this.f28386b));
        }
        return this.f28385a;
    }

    @p0
    public static androidx.webkit.l[] l(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        androidx.webkit.l[] lVarArr = new androidx.webkit.l[webMessagePortArr.length];
        for (int i10 = 0; i10 < webMessagePortArr.length; i10++) {
            lVarArr[i10] = new p(webMessagePortArr[i10]);
        }
        return lVarArr;
    }

    @Override // androidx.webkit.l
    @SuppressLint({"NewApi"})
    public void a() {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("WEB_MESSAGE_PORT_CLOSE");
        if (feature.isSupportedByFramework()) {
            k().close();
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            j().close();
        }
    }

    @Override // androidx.webkit.l
    @w0(23)
    public WebMessagePort b() {
        return k();
    }

    @Override // androidx.webkit.l
    public InvocationHandler c() {
        return Proxy.getInvocationHandler(j());
    }

    @Override // androidx.webkit.l
    @SuppressLint({"NewApi"})
    public void d(@n0 androidx.webkit.k kVar) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("WEB_MESSAGE_PORT_POST_MESSAGE");
        if (feature.isSupportedByFramework()) {
            k().postMessage(g(kVar));
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            j().postMessage(org.chromium.support_lib_boundary.util.a.d(new m(kVar)));
        }
    }

    @Override // androidx.webkit.l
    @SuppressLint({"NewApi"})
    public void e(Handler handler, @n0 androidx.webkit.l.a aVar) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("CREATE_WEB_MESSAGE_CHANNEL");
        if (feature.isSupportedByFramework()) {
            k().setWebMessageCallback(new b(aVar), handler);
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            j().setWebMessageCallback(org.chromium.support_lib_boundary.util.a.d(new n(aVar)), handler);
        }
    }

    @Override // androidx.webkit.l
    @SuppressLint({"NewApi"})
    public void f(@n0 androidx.webkit.l.a aVar) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        if (feature.isSupportedByFramework()) {
            k().setWebMessageCallback(new a(aVar));
        } else {
            if (!feature.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            j().setWebMessageCallback(org.chromium.support_lib_boundary.util.a.d(new n(aVar)));
        }
    }
}
