package kotlin.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: _MapsJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public class t0 extends s0 {
    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    @sh.f
    private static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> L0(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = selector.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    @sh.f
    private static final /* synthetic */ <K, V> Map.Entry<K, V> M0(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.Q3(map.entrySet(), comparator);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> N0(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = selector.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Map.Entry O0(Map map, Comparator comparator) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.i4(map.entrySet(), comparator);
    }
}
