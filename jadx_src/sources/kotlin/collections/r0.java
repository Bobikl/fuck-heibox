package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: compiled from: MapsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class r0 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f124638a = 1073741824;

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    public static final <K, V> Map<K, V> d(@dl.d Map<K, V> builder) {
        kotlin.jvm.internal.f0.p(builder, "builder");
        return ((MapBuilder) builder).j();
    }

    @kotlin.u0(version = "1.3")
    @kotlin.r0
    @sh.f
    private static final <K, V> Map<K, V> e(int i10, yh.l<? super Map<K, V>, b2> builderAction) {
        kotlin.jvm.internal.f0.p(builderAction, "builderAction");
        Map mapH = h(i10);
        builderAction.invoke(mapH);
        return d(mapH);
    }

    @kotlin.u0(version = "1.3")
    @kotlin.r0
    @sh.f
    private static final <K, V> Map<K, V> f(yh.l<? super Map<K, V>, b2> builderAction) {
        kotlin.jvm.internal.f0.p(builderAction, "builderAction");
        Map mapG = g();
        builderAction.invoke(mapG);
        return d(mapG);
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    public static final <K, V> Map<K, V> g() {
        return new MapBuilder();
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    public static final <K, V> Map<K, V> h(int i10) {
        return new MapBuilder(i10);
    }

    public static final <K, V> V i(@dl.d ConcurrentMap<K, V> concurrentMap, K k10, @dl.d yh.a<? extends V> defaultValue) {
        kotlin.jvm.internal.f0.p(concurrentMap, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        V v10 = concurrentMap.get(k10);
        if (v10 != null) {
            return v10;
        }
        V vInvoke = defaultValue.invoke();
        V vPutIfAbsent = concurrentMap.putIfAbsent(k10, vInvoke);
        return vPutIfAbsent == null ? vInvoke : vPutIfAbsent;
    }

    @kotlin.r0
    public static final int j(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @dl.d
    public static final <K, V> Map<K, V> k(@dl.d Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.f0.p(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.e(), pair.f());
        kotlin.jvm.internal.f0.o(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        return mapSingletonMap;
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <K, V> SortedMap<K, V> l(@dl.d Comparator<? super K> comparator, @dl.d Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        s0.y0(treeMap, pairs);
        return treeMap;
    }

    @dl.d
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m(@dl.d Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        TreeMap treeMap = new TreeMap();
        s0.y0(treeMap, pairs);
        return treeMap;
    }

    @sh.f
    private static final Properties n(Map<String, String> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @dl.d
    public static final <K, V> Map<K, V> o(@dl.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.f0.o(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }

    @sh.f
    private static final <K, V> Map<K, V> p(Map<K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return o(map);
    }

    @dl.d
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> q(@dl.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return new TreeMap(map);
    }

    @dl.d
    public static final <K, V> SortedMap<K, V> r(@dl.d Map<? extends K, ? extends V> map, @dl.d Comparator<? super K> comparator) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
