package oh;

import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;
import kotlin.u0;
import sh.f;
import xh.h;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "CollectionsJDK8Kt")
public final class c {
    @u0(version = "1.2")
    @f
    private static final <K, V> V a(Map<? extends K, ? extends V> map, K k10, V v10) {
        f0.p(map, "<this>");
        return (V) map.getOrDefault(k10, v10);
    }

    @u0(version = "1.2")
    @f
    private static final <K, V> boolean b(Map<? extends K, ? extends V> map, K k10, V v10) {
        f0.p(map, "<this>");
        return w0.k(map).remove(k10, v10);
    }
}
