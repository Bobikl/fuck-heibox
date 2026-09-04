package androidx.webkit.internal;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;

/* JADX INFO: compiled from: WebMessageAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class m implements WebMessageBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.webkit.k f28382a;

    public m(@n0 androidx.webkit.k kVar) {
        this.f28382a = kVar;
    }

    @n0
    private static androidx.webkit.l[] a(InvocationHandler[] invocationHandlerArr) {
        androidx.webkit.l[] lVarArr = new androidx.webkit.l[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            lVarArr[i10] = new p(invocationHandlerArr[i10]);
        }
        return lVarArr;
    }

    @n0
    public static androidx.webkit.k b(@n0 WebMessageBoundaryInterface webMessageBoundaryInterface) {
        return new androidx.webkit.k(webMessageBoundaryInterface.getData(), a(webMessageBoundaryInterface.getPorts()));
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @p0
    public String getData() {
        return this.f28382a.a();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @p0
    public InvocationHandler[] getPorts() {
        androidx.webkit.l[] lVarArrB = this.f28382a.b();
        if (lVarArrB == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[lVarArrB.length];
        for (int i10 = 0; i10 < lVarArrB.length; i10++) {
            invocationHandlerArr[i10] = lVarArrB[i10].c();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @n0
    public String[] getSupportedFeatures() {
        return new String[0];
    }
}
