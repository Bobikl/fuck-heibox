package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes5.dex */
public class q0 {
    @kotlin.r0
    @xh.h(name = "getOrImplicitDefaultNullable")
    public static final <K, V> V a(@dl.d Map<K, ? extends V> map, K k10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        if (map instanceof n0) {
            return (V) ((n0) map).S(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }

    @dl.d
    public static final <K, V> Map<K, V> b(@dl.d Map<K, ? extends V> map, @dl.d yh.l<? super K, ? extends V> defaultValue) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return map instanceof n0 ? b(((n0) map).q(), defaultValue) : new o0(map, defaultValue);
    }

    @dl.d
    @xh.h(name = "withDefaultMutable")
    public static final <K, V> Map<K, V> c(@dl.d Map<K, V> map, @dl.d yh.l<? super K, ? extends V> defaultValue) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return map instanceof w0 ? c(((w0) map).q(), defaultValue) : new x0(map, defaultValue);
    }
}
