package kotlin;

/* JADX INFO: compiled from: PropertyReferenceDelegates.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q0 {
    @u0(version = "1.4")
    @sh.f
    private static final <V> V a(kotlin.reflect.o<? extends V> oVar, Object obj, kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.f0.p(oVar, "<this>");
        kotlin.jvm.internal.f0.p(property, "property");
        return oVar.get();
    }

    @u0(version = "1.4")
    @sh.f
    private static final <T, V> V b(kotlin.reflect.p<T, ? extends V> pVar, T t10, kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.f0.p(pVar, "<this>");
        kotlin.jvm.internal.f0.p(property, "property");
        return pVar.get(t10);
    }

    @u0(version = "1.4")
    @sh.f
    private static final <V> void c(kotlin.reflect.k<V> kVar, Object obj, kotlin.reflect.n<?> property, V v10) {
        kotlin.jvm.internal.f0.p(kVar, "<this>");
        kotlin.jvm.internal.f0.p(property, "property");
        kVar.set(v10);
    }

    @u0(version = "1.4")
    @sh.f
    private static final <T, V> void d(kotlin.reflect.l<T, V> lVar, T t10, kotlin.reflect.n<?> property, V v10) {
        kotlin.jvm.internal.f0.p(lVar, "<this>");
        kotlin.jvm.internal.f0.p(property, "property");
        lVar.Y0(t10, v10);
    }
}
