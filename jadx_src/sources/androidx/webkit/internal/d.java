package androidx.webkit.internal;

import androidx.annotation.n0;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: compiled from: JavaScriptReplyProxyImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends androidx.webkit.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JsReplyProxyBoundaryInterface f28367a;

    /* JADX INFO: compiled from: JavaScriptReplyProxyImpl.java */
    public class a implements Callable<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsReplyProxyBoundaryInterface f28368b;

        a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f28368b = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new d(this.f28368b);
        }
    }

    public d(@n0 JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f28367a = jsReplyProxyBoundaryInterface;
    }

    @n0
    public static d b(@n0 InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (d) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }

    @Override // androidx.webkit.a
    public void a(@n0 String str) {
        if (!WebViewFeatureInternal.getFeature("WEB_MESSAGE_LISTENER").isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.f28367a.postMessage(str);
    }
}
