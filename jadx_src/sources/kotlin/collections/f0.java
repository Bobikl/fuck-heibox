package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: GroupingJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class f0 {
    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <T, K> Map<K, Integer> a(@dl.d d0<T, ? extends K> d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = d0Var.b();
        while (itB.hasNext()) {
            K kA = d0Var.a(itB.next());
            Object intRef = linkedHashMap.get(kA);
            if (intRef == null && !linkedHashMap.containsKey(kA)) {
                intRef = new Ref.IntRef();
            }
            Ref.IntRef intRef2 = (Ref.IntRef) intRef;
            intRef2.f124889b++;
            linkedHashMap.put(kA, intRef2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.jvm.internal.f0.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            kotlin.jvm.internal.w0.m(entry).setValue(Integer.valueOf(((Ref.IntRef) entry.getValue()).f124889b));
        }
        return kotlin.jvm.internal.w0.k(linkedHashMap);
    }

    @kotlin.r0
    @sh.f
    private static final <K, V, R> Map<K, R> b(Map<K, V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> f10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(f10, "f");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.jvm.internal.f0.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            kotlin.jvm.internal.w0.m(entry).setValue(f10.invoke(entry));
        }
        return kotlin.jvm.internal.w0.k(map);
    }
}
