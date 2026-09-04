package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.n0;
import androidx.webkit.j0;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* JADX INFO: compiled from: WebMessageListenerAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class o implements WebMessageListenerBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j0.c f28384a;

    public o(@n0 j0.c cVar) {
        this.f28384a = cVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @n0
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(@n0 WebView webView, @n0 InvocationHandler invocationHandler, @n0 Uri uri, boolean z10, @n0 InvocationHandler invocationHandler2) {
        this.f28384a.a(webView, m.b((WebMessageBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebMessageBoundaryInterface.class, invocationHandler)), uri, z10, d.b(invocationHandler2));
    }
}
