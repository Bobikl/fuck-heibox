package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b2;
import kotlin.e2;

/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: classes5.dex */
public class s0 extends r0 {
    @dl.d
    public static final <K, V> Map<K, V> A(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @sh.f
    private static final <K, V> void A0(Map<K, V> map, K k10, V v10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        map.put(k10, v10);
    }

    @dl.d
    public static final <K, V> Map<K, V> B(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super K, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @dl.d
    public static final <K, V> Map<K, V> B0(@dl.d Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return k0(C0(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return z();
        }
        if (size != 1) {
            return C0(iterable, new LinkedHashMap(r0.j(collection.size())));
        }
        return r0.k(iterable instanceof List ? (Pair<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    @dl.d
    public static final <K, V> Map<K, V> C(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M C0(@dl.d Iterable<? extends Pair<? extends K, ? extends V>> iterable, @dl.d M destination) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        w0(destination, iterable);
        return destination;
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M D(@dl.d Map<? extends K, ? extends V> map, @dl.d M destination, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <K, V> Map<K, V> D0(@dl.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? J0(map) : r0.o(map);
        }
        return z();
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M E(@dl.d Map<? extends K, ? extends V> map, @dl.d M destination, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M E0(@dl.d Map<? extends K, ? extends V> map, @dl.d M destination) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        destination.putAll(map);
        return destination;
    }

    @dl.d
    public static final <K, V> Map<K, V> F(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super V, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @dl.d
    public static final <K, V> Map<K, V> F0(@dl.d kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> mVar) {
        kotlin.jvm.internal.f0.p(mVar, "<this>");
        return k0(G0(mVar, new LinkedHashMap()));
    }

    @sh.f
    private static final <K, V> V G(Map<? extends K, ? extends V> map, K k10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map.get(k10);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M G0(@dl.d kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> mVar, @dl.d M destination) {
        kotlin.jvm.internal.f0.p(mVar, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        x0(destination, mVar);
        return destination;
    }

    @sh.f
    private static final <K, V> V H(Map<K, ? extends V> map, K k10, yh.a<? extends V> defaultValue) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        V v10 = map.get(k10);
        return v10 == null ? defaultValue.invoke() : v10;
    }

    @dl.d
    public static final <K, V> Map<K, V> H0(@dl.d Pair<? extends K, ? extends V>[] pairArr) {
        kotlin.jvm.internal.f0.p(pairArr, "<this>");
        int length = pairArr.length;
        if (length != 0) {
            return length != 1 ? I0(pairArr, new LinkedHashMap(r0.j(pairArr.length))) : r0.k(pairArr[0]);
        }
        return z();
    }

    public static final <K, V> V I(@dl.d Map<K, ? extends V> map, K k10, @dl.d yh.a<? extends V> defaultValue) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        V v10 = map.get(k10);
        return (v10 != null || map.containsKey(k10)) ? v10 : defaultValue.invoke();
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M I0(@dl.d Pair<? extends K, ? extends V>[] pairArr, @dl.d M destination) {
        kotlin.jvm.internal.f0.p(pairArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        y0(destination, pairArr);
        return destination;
    }

    public static final <K, V> V J(@dl.d Map<K, V> map, K k10, @dl.d yh.a<? extends V> defaultValue) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        V v10 = map.get(k10);
        if (v10 != null) {
            return v10;
        }
        V vInvoke = defaultValue.invoke();
        map.put(k10, vInvoke);
        return vInvoke;
    }

    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <K, V> Map<K, V> J0(@dl.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return new LinkedHashMap(map);
    }

    @kotlin.u0(version = "1.1")
    public static final <K, V> V K(@dl.d Map<K, ? extends V> map, K k10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return (V) q0.a(map, k10);
    }

    @sh.f
    private static final <K, V> Pair<K, V> K0(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.f0.p(entry, "<this>");
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    @kotlin.u0(version = "1.1")
    @sh.f
    private static final <K, V> HashMap<K, V> L() {
        return new HashMap<>();
    }

    @dl.d
    public static final <K, V> HashMap<K, V> M(@dl.d Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        HashMap<K, V> map = new HashMap<>(r0.j(pairs.length));
        y0(map, pairs);
        return map;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lyh/a<+TR;>;)TR; */
    @kotlin.u0(version = "1.3")
    @sh.f
    private static final Object N(Map map, yh.a defaultValue) {
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return map.isEmpty() ? defaultValue.invoke() : map;
    }

    @sh.f
    private static final <K, V> boolean O(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return !map.isEmpty();
    }

    @kotlin.u0(version = "1.3")
    @sh.f
    private static final <K, V> boolean P(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @sh.f
    private static final <K, V> Iterator<Map.Entry<K, V>> Q(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @kotlin.u0(version = "1.1")
    @sh.f
    private static final <K, V> LinkedHashMap<K, V> R() {
        return new LinkedHashMap<>();
    }

    @dl.d
    public static final <K, V> LinkedHashMap<K, V> S(@dl.d Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        return (LinkedHashMap) I0(pairs, new LinkedHashMap(r0.j(pairs.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, R> Map<R, V> T(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r0.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(transform.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, R, M extends Map<? super R, ? super V>> M U(@dl.d Map<? extends K, ? extends V> map, @dl.d M destination, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(transform.invoke(entry), entry.getValue());
        }
        return destination;
    }

    @sh.f
    private static final <K, V> Map<K, V> V() {
        return z();
    }

    @dl.d
    public static final <K, V> Map<K, V> W(@dl.d Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        return pairs.length > 0 ? I0(pairs, new LinkedHashMap(r0.j(pairs.length))) : z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, R> Map<K, R> X(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r0.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), transform.invoke(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, R, M extends Map<? super K, ? super R>> M Y(@dl.d Map<? extends K, ? extends V> map, @dl.d M destination, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(entry.getKey(), transform.invoke(entry));
        }
        return destination;
    }

    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <K, V> Map<K, V> Z(@dl.d Map<? extends K, ? extends V> map, @dl.d Iterable<? extends K> keys) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(keys, "keys");
        Map mapJ0 = J0(map);
        x.E0(mapJ0.keySet(), keys);
        return k0(mapJ0);
    }

    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <K, V> Map<K, V> a0(@dl.d Map<? extends K, ? extends V> map, K k10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        Map mapJ0 = J0(map);
        mapJ0.remove(k10);
        return k0(mapJ0);
    }

    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <K, V> Map<K, V> b0(@dl.d Map<? extends K, ? extends V> map, @dl.d kotlin.sequences.m<? extends K> keys) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(keys, "keys");
        Map mapJ0 = J0(map);
        x.G0(mapJ0.keySet(), keys);
        return k0(mapJ0);
    }

    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <K, V> Map<K, V> c0(@dl.d Map<? extends K, ? extends V> map, @dl.d K[] keys) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(keys, "keys");
        Map mapJ0 = J0(map);
        x.H0(mapJ0.keySet(), keys);
        return k0(mapJ0);
    }

    @kotlin.u0(version = "1.1")
    @sh.f
    private static final <K, V> void d0(Map<K, V> map, Iterable<? extends K> keys) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(keys, "keys");
        x.E0(map.keySet(), keys);
    }

    @kotlin.u0(version = "1.1")
    @sh.f
    private static final <K, V> void e0(Map<K, V> map, K k10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        map.remove(k10);
    }

    @kotlin.u0(version = "1.1")
    @sh.f
    private static final <K, V> void f0(Map<K, V> map, kotlin.sequences.m<? extends K> keys) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(keys, "keys");
        x.G0(map.keySet(), keys);
    }

    @kotlin.u0(version = "1.1")
    @sh.f
    private static final <K, V> void g0(Map<K, V> map, K[] keys) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(keys, "keys");
        x.H0(map.keySet(), keys);
    }

    @xh.h(name = "mutableIterator")
    @sh.f
    private static final <K, V> Iterator<Map.Entry<K, V>> h0(Map<K, V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @kotlin.u0(version = "1.1")
    @sh.f
    private static final <K, V> Map<K, V> i0() {
        return new LinkedHashMap();
    }

    @dl.d
    public static final <K, V> Map<K, V> j0(@dl.d Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r0.j(pairs.length));
        y0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V> Map<K, V> k0(@dl.d Map<K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : r0.o(map);
        }
        return z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @sh.f
    private static final <K, V> Map<K, V> l0(Map<K, ? extends V> map) {
        return map == 0 ? z() : map;
    }

    @dl.d
    public static final <K, V> Map<K, V> m0(@dl.d Map<? extends K, ? extends V> map, @dl.d Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        if (map.isEmpty()) {
            return B0(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @dl.d
    public static final <K, V> Map<K, V> n0(@dl.d Map<? extends K, ? extends V> map, @dl.d Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @dl.d
    public static final <K, V> Map<K, V> o0(@dl.d Map<? extends K, ? extends V> map, @dl.d Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(pair, "pair");
        if (map.isEmpty()) {
            return r0.k(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.e(), pair.f());
        return linkedHashMap;
    }

    @dl.d
    public static final <K, V> Map<K, V> p0(@dl.d Map<? extends K, ? extends V> map, @dl.d kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        x0(linkedHashMap, pairs);
        return k0(linkedHashMap);
    }

    @dl.d
    public static final <K, V> Map<K, V> q0(@dl.d Map<? extends K, ? extends V> map, @dl.d Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        if (map.isEmpty()) {
            return H0(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @sh.f
    private static final <K, V> void r0(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        w0(map, pairs);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <K, V> Map<K, V> s(int i10, @kotlin.b yh.l<? super Map<K, V>, b2> builderAction) {
        kotlin.jvm.internal.f0.p(builderAction, "builderAction");
        Map mapH = r0.h(i10);
        builderAction.invoke(mapH);
        return r0.d(mapH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @sh.f
    private static final <K, V> void s0(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(map2, "map");
        map.putAll(map2);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <K, V> Map<K, V> t(@kotlin.b yh.l<? super Map<K, V>, b2> builderAction) {
        kotlin.jvm.internal.f0.p(builderAction, "builderAction");
        Map mapG = r0.g();
        builderAction.invoke(mapG);
        return r0.d(mapG);
    }

    @sh.f
    private static final <K, V> void t0(Map<? super K, ? super V> map, Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(pair, "pair");
        map.put(pair.e(), pair.f());
    }

    @sh.f
    private static final <K, V> K u(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.f0.p(entry, "<this>");
        return entry.getKey();
    }

    @sh.f
    private static final <K, V> void u0(Map<? super K, ? super V> map, kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        x0(map, pairs);
    }

    @sh.f
    private static final <K, V> V v(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.f0.p(entry, "<this>");
        return entry.getValue();
    }

    @sh.f
    private static final <K, V> void v0(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        y0(map, pairs);
    }

    @sh.f
    private static final <K, V> boolean w(Map<? extends K, ? extends V> map, K k10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map.containsKey(k10);
    }

    public static final <K, V> void w0(@dl.d Map<? super K, ? super V> map, @dl.d Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.a(), pair.b());
        }
    }

    @sh.f
    private static final <K> boolean x(Map<? extends K, ?> map, K k10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map.containsKey(k10);
    }

    public static final <K, V> void x0(@dl.d Map<? super K, ? super V> map, @dl.d kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.a(), pair.b());
        }
    }

    @sh.f
    private static final <K, V> boolean y(Map<K, ? extends V> map, V v10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map.containsValue(v10);
    }

    public static final <K, V> void y0(@dl.d Map<? super K, ? super V> map, @dl.d Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.a(), pair.b());
        }
    }

    @dl.d
    public static final <K, V> Map<K, V> z() {
        EmptyMap emptyMap = EmptyMap.f124540b;
        kotlin.jvm.internal.f0.n(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    @sh.f
    private static final <K, V> V z0(Map<? extends K, V> map, K k10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return (V) kotlin.jvm.internal.w0.k(map).remove(k10);
    }
}
