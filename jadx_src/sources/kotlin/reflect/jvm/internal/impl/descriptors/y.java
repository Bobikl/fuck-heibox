package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.b2;

/* JADX INFO: compiled from: InvalidModuleException.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final c0<z> f125947a = new c0<>("InvalidModuleNotifier");

    public static final void a(@dl.d d0 d0Var) {
        b2 b2Var;
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        z zVar = (z) d0Var.a0(f125947a);
        if (zVar != null) {
            zVar.a(d0Var);
            b2Var = b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var != null) {
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + d0Var);
    }
}
