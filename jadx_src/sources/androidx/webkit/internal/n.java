package androidx.webkit.internal;

import androidx.annotation.n0;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* JADX INFO: compiled from: WebMessageCallbackAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class n implements WebMessageCallbackBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    androidx.webkit.l.a f28383a;

    public n(@n0 androidx.webkit.l.a aVar) {
        this.f28383a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @n0
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        this.f28383a.a(new p(invocationHandler), m.b((WebMessageBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebMessageBoundaryInterface.class, invocationHandler2)));
    }
}
