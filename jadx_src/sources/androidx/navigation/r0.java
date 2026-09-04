package androidx.navigation;

/* JADX INFO: compiled from: NavigatorProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class r0 {
    @dl.d
    public static final <T extends Navigator<? extends NavDestination>> T a(@dl.d q0 q0Var, @dl.d String name) {
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(name, "name");
        return (T) q0Var.f(name);
    }

    @dl.d
    public static final <T extends Navigator<? extends NavDestination>> T b(@dl.d q0 q0Var, @dl.d kotlin.reflect.d<T> clazz) {
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(clazz, "clazz");
        return (T) q0Var.e(xh.a.e(clazz));
    }

    public static final void c(@dl.d q0 q0Var, @dl.d Navigator<? extends NavDestination> navigator) {
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(navigator, "navigator");
        q0Var.b(navigator);
    }

    @dl.e
    public static final Navigator<? extends NavDestination> d(@dl.d q0 q0Var, @dl.d String name, @dl.d Navigator<? extends NavDestination> navigator) {
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(navigator, "navigator");
        return q0Var.c(name, navigator);
    }
}
