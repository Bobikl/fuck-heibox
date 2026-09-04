package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;

/* JADX INFO: compiled from: ResolutionAnchorProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final c0<j> f127574a = new c0<>("ResolutionAnchorProvider");

    @dl.e
    public static final d0 a(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        j jVar = (j) d0Var.a0(f127574a);
        if (jVar != null) {
            return jVar.a(d0Var);
        }
        return null;
    }
}
