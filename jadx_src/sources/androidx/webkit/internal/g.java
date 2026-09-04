package androidx.webkit.internal;

import androidx.annotation.n0;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptReferenceBoundaryInterface;

/* JADX INFO: compiled from: ScriptReferenceImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class g extends androidx.webkit.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScriptReferenceBoundaryInterface f28372a;

    private g(@n0 ScriptReferenceBoundaryInterface scriptReferenceBoundaryInterface) {
        this.f28372a = scriptReferenceBoundaryInterface;
    }

    @n0
    public static g b(@n0 InvocationHandler invocationHandler) {
        return new g((ScriptReferenceBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(ScriptReferenceBoundaryInterface.class, invocationHandler));
    }

    @Override // androidx.webkit.e
    public void a() {
        this.f28372a.remove();
    }
}
