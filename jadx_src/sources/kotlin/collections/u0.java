package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.b2;

/* JADX INFO: compiled from: _Maps.kt */
/* JADX INFO: loaded from: classes5.dex */
public class u0 extends t0 {
    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V> Float A1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V, R> R B1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V, R> R C1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = (Object) rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <K, V> Map.Entry<K, V> D1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.i4(map.entrySet(), comparator);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    @sh.f
    private static final <K, V> Map.Entry<K, V> E1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.j4(map.entrySet(), comparator);
    }

    public static final <K, V> boolean F1(@dl.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map.isEmpty();
    }

    public static final <K, V> boolean G1(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <K, V, M extends Map<? extends K, ? extends V>> M H1(@dl.d M m10, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, b2> action) {
        kotlin.jvm.internal.f0.p(m10, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        Iterator<Map.Entry<K, V>> it = m10.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return m10;
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <K, V, M extends Map<? extends K, ? extends V>> M I1(@dl.d M m10, @dl.d yh.p<? super Integer, ? super Map.Entry<? extends K, ? extends V>, b2> action) {
        kotlin.jvm.internal.f0.p(m10, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        Iterator<T> it = m10.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a.a.a.a.d.p.d.c.d dVar = (Object) it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            action.invoke(Integer.valueOf(i10), dVar);
            i10 = i11;
        }
        return m10;
    }

    @dl.d
    public static final <K, V> List<Pair<K, V>> J1(@dl.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        if (map.size() == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.E();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return s.k(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V> boolean P0(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean Q0(@dl.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return !map.isEmpty();
    }

    public static final <K, V> boolean R0(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @sh.f
    private static final <K, V> Iterable<Map.Entry<K, V>> S0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map.entrySet();
    }

    @dl.d
    public static final <K, V> kotlin.sequences.m<Map.Entry<K, V>> T0(@dl.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return CollectionsKt___CollectionsKt.v1(map.entrySet());
    }

    @sh.f
    private static final <K, V> int U0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map.size();
    }

    public static final <K, V> int V0(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.f
    private static final <K, V, R> R W0(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        R rInvoke;
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                if (rInvoke != null) {
                    return rInvoke;
                }
                throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
            }
        }
        rInvoke = null;
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.f
    private static final <K, V, R> R X0(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @dl.d
    public static final <K, V, R> List<R> Y0(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            x.n0(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    @kotlin.l0
    @xh.h(name = "flatMapSequence")
    public static final <K, V, R> List<R> Z0(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            x.o0(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    @kotlin.l0
    @xh.h(name = "flatMapSequenceTo")
    public static final <K, V, R, C extends Collection<? super R>> C a1(@dl.d Map<? extends K, ? extends V> map, @dl.d C destination, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            x.o0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @dl.d
    public static final <K, V, R, C extends Collection<? super R>> C b1(@dl.d Map<? extends K, ? extends V> map, @dl.d C destination, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            x.n0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @sh.e
    public static final <K, V> void c1(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, b2> action) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    @dl.d
    public static final <K, V, R> List<R> d1(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    @dl.d
    public static final <K, V, R> List<R> e1(@dl.d Map<? extends K, ? extends V> map, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <K, V, R, C extends Collection<? super R>> C f1(@dl.d Map<? extends K, ? extends V> map, @dl.d C destination, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @dl.d
    public static final <K, V, R, C extends Collection<? super R>> C g1(@dl.d Map<? extends K, ? extends V> map, @dl.d C destination, @dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> h1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
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

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    @sh.f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> i1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = selector.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V> double j1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V> float k1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V, R extends Comparable<? super R>> R l1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V, R extends Comparable<? super R>> R m1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V> Double n1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V> Float o1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V, R> R p1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V, R> R q1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = (Object) rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <K, V> Map.Entry<K, V> r1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.Q3(map.entrySet(), comparator);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    @sh.f
    private static final <K, V> Map.Entry<K, V> s1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.R3(map.entrySet(), comparator);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> t1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
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

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minByOrThrow")
    @sh.f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> u1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = selector.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V> double v1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V> float w1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V, R extends Comparable<? super R>> R x1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V, R extends Comparable<? super R>> R y1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <K, V> Double z1(Map<? extends K, ? extends V> map, yh.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }
}
