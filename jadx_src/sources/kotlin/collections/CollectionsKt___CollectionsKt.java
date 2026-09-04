package kotlin.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.b2;
import kotlin.e2;
import kotlin.n1;
import kotlin.r1;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: _Collections.kt */
/* JADX INFO: loaded from: classes5.dex */
public class CollectionsKt___CollectionsKt extends z {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements kotlin.sequences.m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f124534a;

        public a(Iterable iterable) {
            this.f124534a = iterable;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<T> iterator() {
            return this.f124534a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* JADX INFO: compiled from: _Collections.kt */
    public static final class b<K, T> implements d0<T, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable<T> f124535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<T, K> f124536b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Iterable<? extends T> iterable, yh.l<? super T, ? extends K> lVar) {
            this.f124535a = iterable;
            this.f124536b = lVar;
        }

        @Override // kotlin.collections.d0
        public K a(T t10) {
            return this.f124536b.invoke(t10);
        }

        @Override // kotlin.collections.d0
        @dl.d
        public Iterator<T> b() {
            return this.f124535a.iterator();
        }
    }

    @dl.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M A1(@dl.d Iterable<? extends T> iterable, @dl.d M destination, @dl.d yh.l<? super T, ? extends K> keySelector, @dl.d yh.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (T t10 : iterable) {
            destination.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @dl.e
    public static final <T> T A2(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <T, R extends Comparable<? super R>> T A3(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @dl.d
    public static final <T> List<T> A4(@dl.d Collection<? extends T> collection, @dl.d kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        x.o0(arrayList, elements);
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfLong")
    @sh.f
    private static final <T> long A5(Iterable<? extends T> iterable, yh.l<? super T, Long> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += selector.invoke(it.next()).longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M B1(@dl.d Iterable<? extends T> iterable, @dl.d M destination, @dl.d yh.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(it.next());
            destination.put(pairInvoke.e(), pairInvoke.f());
        }
        return destination;
    }

    @dl.e
    public static final <T> T B2(@dl.d List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T B3(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @dl.d
    public static final <T> List<T> B4(@dl.d Collection<? extends T> collection, @dl.d T[] elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        x.p0(arrayList, elements);
        return arrayList;
    }

    @xh.h(name = "sumOfShort")
    public static final int B5(@dl.d Iterable<Short> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    public static final <K, V> Map<K, V> C1(@dl.d Iterable<? extends K> iterable, @dl.d yh.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(t.Y(iterable, 10)), 16));
        for (K k10 : iterable) {
            linkedHashMap.put(k10, valueSelector.invoke(k10));
        }
        return linkedHashMap;
    }

    @dl.d
    public static final <T, R> List<R> C2(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            x.n0(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> double C3(Iterable<? extends T> iterable, yh.l<? super T, Double> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @sh.f
    private static final <T> List<T> C4(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return v4(iterable, t10);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfUInt")
    @sh.f
    private static final <T> int C5(Iterable<? extends T> iterable, yh.l<? super T, n1> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iH = n1.h(0);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            iH = n1.h(iH + selector.invoke(it.next()).q0());
        }
        return iH;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M D1(@dl.d Iterable<? extends K> iterable, @dl.d M destination, @dl.d yh.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        for (K k10 : iterable) {
            destination.put(k10, valueSelector.invoke(k10));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterable")
    @sh.f
    private static final <T, R> List<R> D2(Iterable<? extends T> iterable, yh.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            x.n0(arrayList, transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> float D3(Iterable<? extends T> iterable, yh.l<? super T, Float> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    @sh.f
    private static final <T> List<T> D4(Collection<? extends T> collection, T t10) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        return z4(collection, t10);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfULong")
    @sh.f
    private static final <T> long D5(Iterable<? extends T> iterable, yh.l<? super T, r1> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jH = r1.h(0L);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            jH = r1.h(jH + selector.invoke(it.next()).q0());
        }
        return jH;
    }

    @xh.h(name = "averageOfByte")
    public static final double E1(@dl.d Iterable<Byte> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double dByteValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dByteValue += (double) it.next().byteValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterableTo")
    @sh.f
    private static final <T, R, C extends Collection<? super R>> C E2(Iterable<? extends T> iterable, C destination, yh.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            x.n0(destination, transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R extends Comparable<? super R>> R E3(Iterable<? extends T> iterable, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.3")
    @sh.f
    private static final <T> T E4(Collection<? extends T> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        return (T) F4(collection, Random.f125033b);
    }

    @dl.d
    public static final <T> List<T> E5(@dl.d Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return Q5(iterable);
            }
            if (i10 == 1) {
                return s.k(u2(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return CollectionsKt__CollectionsKt.Q(arrayList);
    }

    @xh.h(name = "averageOfDouble")
    public static final double F1(@dl.d Iterable<Double> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedSequence")
    @sh.f
    private static final <T, R> List<R> F2(Iterable<? extends T> iterable, yh.p<? super Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            x.o0(arrayList, transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R extends Comparable<? super R>> R F3(Iterable<? extends T> iterable, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.3")
    public static final <T> T F4(@dl.d Collection<? extends T> collection, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) b2(collection, random.m(collection.size()));
    }

    @dl.d
    public static final <T> List<T> F5(@dl.d List<? extends T> list, int i10) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int size = list.size();
        if (i10 >= size) {
            return Q5(list);
        }
        if (i10 == 1) {
            return s.k(k3(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    @xh.h(name = "averageOfFloat")
    public static final double G1(@dl.d Iterable<Float> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedSequenceTo")
    @sh.f
    private static final <T, R, C extends Collection<? super R>> C G2(Iterable<? extends T> iterable, C destination, yh.p<? super Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            x.o0(destination, transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> Double G3(Iterable<? extends T> iterable, yh.l<? super T, Double> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <T> T G4(Collection<? extends T> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        return (T) H4(collection, Random.f125033b);
    }

    @dl.d
    public static final <T> List<T> G5(@dl.d List<? extends T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsKt.E();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return CollectionsKt__CollectionsKt.E();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return Q5(list);
    }

    @xh.h(name = "averageOfInt")
    public static final double H1(@dl.d Iterable<Integer> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double dIntValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dIntValue += (double) it.next().intValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i10);
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    @kotlin.l0
    @xh.h(name = "flatMapSequence")
    public static final <T, R> List<R> H2(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            x.o0(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> Float H3(Iterable<? extends T> iterable, yh.l<? super T, Float> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final <T> T H4(@dl.d Collection<? extends T> collection, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) b2(collection, random.m(collection.size()));
    }

    @dl.d
    public static final <T> List<T> H5(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!predicate.invoke(t10).booleanValue()) {
                break;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }

    @xh.h(name = "averageOfLong")
    public static final double I1(@dl.d Iterable<Long> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double dLongValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i10);
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    @kotlin.l0
    @xh.h(name = "flatMapSequenceTo")
    public static final <T, R, C extends Collection<? super R>> C I2(@dl.d Iterable<? extends T> iterable, @dl.d C destination, @dl.d yh.l<? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            x.o0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R> R I3(Iterable<? extends T> iterable, Comparator<? super R> comparator, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <S, T extends S> S I4(@dl.d Iterable<? extends T> iterable, @dl.d yh.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    @dl.d
    public static final boolean[] I5(@dl.d Collection<Boolean> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = it.next().booleanValue();
            i10++;
        }
        return zArr;
    }

    @xh.h(name = "averageOfShort")
    public static final double J1(@dl.d Iterable<Short> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double dShortValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dShortValue += (double) it.next().shortValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i10);
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C J2(@dl.d Iterable<? extends T> iterable, @dl.d C destination, @dl.d yh.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            x.n0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R> R J3(Iterable<? extends T> iterable, Comparator<? super R> comparator, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <S, T extends S> S J4(@dl.d Iterable<? extends T> iterable, @dl.d yh.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            next = operation.invoke(Integer.valueOf(i10), next, it.next());
            i10 = i11;
        }
        return next;
    }

    @dl.d
    public static final byte[] J5(@dl.d Collection<Byte> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = it.next().byteValue();
            i10++;
        }
        return bArr;
    }

    @kotlin.u0(version = "1.2")
    @dl.d
    public static final <T> List<List<T>> K1(@dl.d Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return Y5(iterable, i10, i10, true);
    }

    public static final <T, R> R K2(@dl.d Iterable<? extends T> iterable, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r10 = operation.invoke(r10, it.next());
        }
        return r10;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <T extends Comparable<? super T>> T K3(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <S, T extends S> S K4(@dl.d Iterable<? extends T> iterable, @dl.d yh.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            next = operation.invoke(Integer.valueOf(i10), next, it.next());
            i10 = i11;
        }
        return next;
    }

    @dl.d
    public static final char[] K5(@dl.d Collection<Character> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            cArr[i10] = it.next().charValue();
            i10++;
        }
        return cArr;
    }

    @kotlin.u0(version = "1.2")
    @dl.d
    public static final <T, R> List<R> L1(@dl.d Iterable<? extends T> iterable, int i10, @dl.d yh.l<? super List<? extends T>, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        return Z5(iterable, i10, i10, true, transform);
    }

    public static final <T, R> R L2(@dl.d Iterable<? extends T> iterable, R r10, @dl.d yh.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            r10 = operation.invoke(Integer.valueOf(i10), r10, t10);
            i10 = i11;
        }
        return r10;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Double L3(@dl.d Iterable<Double> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final <S, T extends S> S L4(@dl.d Iterable<? extends T> iterable, @dl.d yh.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    @dl.d
    public static final <T, C extends Collection<? super T>> C L5(@dl.d Iterable<? extends T> iterable, @dl.d C destination) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @sh.f
    private static final <T> T M1(List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        return list.get(0);
    }

    public static final <T, R> R M2(@dl.d List<? extends T> list, R r10, @dl.d yh.p<? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r10 = operation.invoke(listIterator.previous(), r10);
            }
        }
        return r10;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Float M3(@dl.d Iterable<Float> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final <S, T extends S> S M4(@dl.d List<? extends T> list, @dl.d yh.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @dl.d
    public static final double[] M5(@dl.d Collection<Double> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr[i10] = it.next().doubleValue();
            i10++;
        }
        return dArr;
    }

    @sh.f
    private static final <T> T N1(List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        return list.get(1);
    }

    public static final <T, R> R N2(@dl.d List<? extends T> list, R r10, @dl.d yh.q<? super Integer, ? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r10 = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r10);
            }
        }
        return r10;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final double N3(@dl.d Iterable<Double> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    public static final <S, T extends S> S N4(@dl.d List<? extends T> list, @dl.d yh.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @dl.d
    public static final float[] N5(@dl.d Collection<Float> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = it.next().floatValue();
            i10++;
        }
        return fArr;
    }

    @sh.f
    private static final <T> T O1(List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        return list.get(2);
    }

    @sh.e
    public static final <T> void O2(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, b2> action) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final float O3(@dl.d Iterable<Float> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <S, T extends S> S O4(@dl.d List<? extends T> list, @dl.d yh.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @dl.d
    public static final <T> HashSet<T> O5(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return (HashSet) L5(iterable, new HashSet(r0.j(t.Y(iterable, 12))));
    }

    @sh.f
    private static final <T> T P1(List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        return list.get(3);
    }

    public static final <T> void P2(@dl.d Iterable<? extends T> iterable, @dl.d yh.p<? super Integer, ? super T, b2> action) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            action.invoke(Integer.valueOf(i10), t10);
            i10 = i11;
        }
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @dl.d
    @xh.h(name = "maxOrThrow")
    public static final <T extends Comparable<? super T>> T P3(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final <S, T extends S> S P4(@dl.d List<? extends T> list, @dl.d yh.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @dl.d
    public static final int[] P5(@dl.d Collection<Integer> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    @sh.f
    private static final <T> T Q1(List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        return list.get(4);
    }

    @sh.f
    private static final <T> T Q2(List<? extends T> list, int i10, yh.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > CollectionsKt__CollectionsKt.G(list)) ? defaultValue.invoke(Integer.valueOf(i10)) : list.get(i10);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <T> T Q3(@dl.d Iterable<? extends T> iterable, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T> Iterable<T> Q4(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + lg.a.f131414g);
            }
        }
        return iterable;
    }

    @dl.d
    public static final <T> List<T> Q5(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return CollectionsKt__CollectionsKt.Q(S5(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (size != 1) {
            return T5(collection);
        }
        return s.k(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> boolean R1(@dl.d Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t10);
        }
        return X2(iterable, t10) >= 0;
    }

    @dl.e
    public static final <T> T R2(@dl.d List<? extends T> list, int i10) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (i10 < 0 || i10 > CollectionsKt__CollectionsKt.G(list)) {
            return null;
        }
        return list.get(i10);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    public static final <T> T R3(@dl.d Iterable<? extends T> iterable, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T> List<T> R4(@dl.d List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + lg.a.f131414g);
            }
        }
        return list;
    }

    @dl.d
    public static final long[] R5(@dl.d Collection<Long> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public static final <T> int S1(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        int i10 = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.V();
            }
        }
        return i10;
    }

    @dl.d
    public static final <T, K> Map<K, List<T>> S2(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : iterable) {
            K kInvoke = keySelector.invoke(t10);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t10);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <T, R extends Comparable<? super R>> T S3(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @dl.d
    public static final <T> List<T> S4(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return Q5(iterable);
        }
        List<T> listS5 = S5(iterable);
        z.m1(listS5);
        return listS5;
    }

    @dl.d
    public static final <T> List<T> S5(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return iterable instanceof Collection ? T5((Collection) iterable) : (List) L5(iterable, new ArrayList());
    }

    public static final <T> int T1(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue() && (i10 = i10 + 1) < 0) {
                CollectionsKt__CollectionsKt.V();
            }
        }
        return i10;
    }

    @dl.d
    public static final <T, K, V> Map<K, List<V>> T2(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends K> keySelector, @dl.d yh.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : iterable) {
            K kInvoke = keySelector.invoke(t10);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T T3(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <T, R> List<R> T4(@dl.d Iterable<? extends T> iterable, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iY = t.Y(iterable, 9);
        if (iY == 0) {
            return s.k(r10);
        }
        ArrayList arrayList = new ArrayList(iY + 1);
        arrayList.add(r10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r10 = operation.invoke(r10, it.next());
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.d
    public static final <T> List<T> T5(@dl.d Collection<? extends T> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        return new ArrayList(collection);
    }

    @sh.f
    private static final <T> int U1(Collection<? extends T> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        return collection.size();
    }

    @dl.d
    public static final <T, K, M extends Map<? super K, List<T>>> M U2(@dl.d Iterable<? extends T> iterable, @dl.d M destination, @dl.d yh.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (T t10 : iterable) {
            K kInvoke = keySelector.invoke(t10);
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t10);
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> double U3(Iterable<? extends T> iterable, yh.l<? super T, Double> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <T, R> List<R> U4(@dl.d Iterable<? extends T> iterable, R r10, @dl.d yh.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iY = t.Y(iterable, 9);
        if (iY == 0) {
            return s.k(r10);
        }
        ArrayList arrayList = new ArrayList(iY + 1);
        arrayList.add(r10);
        int i10 = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, it.next());
            arrayList.add(r10);
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final <T> Set<T> U5(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) L5(iterable, new LinkedHashSet());
    }

    @dl.d
    public static final <T> List<T> V1(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return Q5(U5(iterable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T, K, V, M extends Map<? super K, List<V>>> M V2(@dl.d Iterable<? extends T> iterable, @dl.d M destination, @dl.d yh.l<? super T, ? extends K> keySelector, @dl.d yh.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (T t10 : iterable) {
            K kInvoke = keySelector.invoke(t10);
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(t10));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> float V3(Iterable<? extends T> iterable, yh.l<? super T, Float> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final <S, T extends S> List<S> V4(@dl.d Iterable<? extends T> iterable, @dl.d yh.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.E();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(t.Y(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    @dl.d
    public static final <T> Set<T> V5(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return d1.r((Set) L5(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d1.k();
        }
        if (size != 1) {
            return (Set) L5(iterable, new LinkedHashSet(r0.j(collection.size())));
        }
        return c1.f(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    @dl.d
    public static final <T, K> List<T> W1(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (hashSet.add(selector.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <T, K> d0<T, K> W2(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        return new b(iterable, keySelector);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R extends Comparable<? super R>> R W3(Iterable<? extends T> iterable, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <S, T extends S> List<S> W4(@dl.d Iterable<? extends T> iterable, @dl.d yh.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.E();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(t.Y(iterable, 10));
        arrayList.add(next);
        int i10 = 1;
        while (it.hasNext()) {
            next = operation.invoke(Integer.valueOf(i10), next, it.next());
            arrayList.add(next);
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final short[] W5(@dl.d Collection<Short> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            sArr[i10] = it.next().shortValue();
            i10++;
        }
        return sArr;
    }

    @dl.d
    public static final <T> List<T> X1(@dl.d Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return Q5(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i10;
            if (size <= 0) {
                return CollectionsKt__CollectionsKt.E();
            }
            if (size == 1) {
                return s.k(i3(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i10 < size2) {
                        arrayList.add(((List) iterable).get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        for (T t10 : iterable) {
            if (i11 >= i10) {
                arrayList.add(t10);
            } else {
                i11++;
            }
        }
        return CollectionsKt__CollectionsKt.Q(arrayList);
    }

    public static final <T> int X2(@dl.d Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            if (kotlin.jvm.internal.f0.g(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R extends Comparable<? super R>> R X3(Iterable<? extends T> iterable, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final <T, R> List<R> X4(@dl.d Iterable<? extends T> iterable, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iY = t.Y(iterable, 9);
        if (iY == 0) {
            return s.k(r10);
        }
        ArrayList arrayList = new ArrayList(iY + 1);
        arrayList.add(r10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r10 = operation.invoke(r10, it.next());
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.d
    public static final <T> Set<T> X5(@dl.d Iterable<? extends T> iterable, @dl.d Iterable<? extends T> other) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<T> setU5 = U5(iterable);
        x.n0(setU5, other);
        return setU5;
    }

    @dl.d
    public static final <T> List<T> Y1(@dl.d List<? extends T> list, int i10) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (i10 >= 0) {
            return E5(list, fi.u.u(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> int Y2(@dl.d List<? extends T> list, T t10) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        return list.indexOf(t10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> Double Y3(Iterable<? extends T> iterable, yh.l<? super T, Double> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final <T, R> List<R> Y4(@dl.d Iterable<? extends T> iterable, R r10, @dl.d yh.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iY = t.Y(iterable, 9);
        if (iY == 0) {
            return s.k(r10);
        }
        ArrayList arrayList = new ArrayList(iY + 1);
        arrayList.add(r10);
        int i10 = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, it.next());
            arrayList.add(r10);
            i10++;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.2")
    @dl.d
    public static final <T> List<List<T>> Y5(@dl.d Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        int iB;
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        SlidingWindowKt.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = SlidingWindowKt.b(iterable.iterator(), i10, i11, z10, false);
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < size) || ((iB = fi.u.B(i10, size - i12)) < i10 && !z10)) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iB);
            for (int i13 = 0; i13 < iB; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    @dl.d
    public static final <T> List<T> Z1(@dl.d List<? extends T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                    return E5(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    public static final <T> int Z2(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        for (T t10 : iterable) {
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            if (predicate.invoke(t10).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> Float Z3(Iterable<? extends T> iterable, yh.l<? super T, Float> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.3")
    public static final <T> void Z4(@dl.d List<T> list, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        for (int iG = CollectionsKt__CollectionsKt.G(list); iG > 0; iG--) {
            int iM = random.m(iG + 1);
            list.set(iM, list.set(iG, list.get(iM)));
        }
    }

    @kotlin.u0(version = "1.2")
    @dl.d
    public static final <T, R> List<R> Z5(@dl.d Iterable<? extends T> iterable, int i10, int i11, boolean z10, @dl.d yh.l<? super List<? extends T>, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        SlidingWindowKt.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = SlidingWindowKt.b(iterable.iterator(), i10, i11, z10, true);
            while (itB.hasNext()) {
                arrayList.add(transform.invoke((List) itB.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        v0 v0Var = new v0(list);
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < size)) {
                break;
            }
            int iB = fi.u.B(i10, size - i12);
            if (!z10 && iB < i10) {
                break;
            }
            v0Var.a(i12, iB + i12);
            arrayList2.add(transform.invoke(v0Var));
            i12 += i11;
        }
        return arrayList2;
    }

    @dl.d
    public static final <T> List<T> a2(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (T t10 : iterable) {
            if (z10) {
                arrayList.add(t10);
            } else if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
                z10 = true;
            }
        }
        return arrayList;
    }

    public static final <T> int a3(@dl.d List<? extends T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R> R a4(Iterable<? extends T> iterable, Comparator<? super R> comparator, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <T> T a5(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) c5((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static /* synthetic */ List a6(Iterable iterable, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return Y5(iterable, i10, i11, z10);
    }

    public static final <T> T b2(@dl.d Iterable<? extends T> iterable, final int i10) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) d2(iterable, i10, new yh.l<Integer, T>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final T a(int i11) {
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i10 + lg.a.f131414g);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        });
    }

    public static final <T> int b3(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = -1;
        int i11 = 0;
        for (T t10 : iterable) {
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            if (predicate.invoke(t10).booleanValue()) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R> R b4(Iterable<? extends T> iterable, Comparator<? super R> comparator, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <T> T b5(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ List b6(Iterable iterable, int i10, int i11, boolean z10, yh.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return Z5(iterable, i10, i11, z10, lVar);
    }

    @sh.f
    private static final <T> T c2(List<? extends T> list, int i10) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        return list.get(i10);
    }

    public static final <T> int c3(@dl.d List<? extends T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (predicate.invoke(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <T extends Comparable<? super T>> T c4(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> T c5(@dl.d List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @dl.d
    public static final <T> Iterable<h0<T>> c6(@dl.d final Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return new i0(new yh.a<Iterator<? extends T>>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<T> invoke() {
                return iterable.iterator();
            }
        });
    }

    public static final <T> T d2(@dl.d Iterable<? extends T> iterable, int i10, @dl.d yh.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i10 < 0 || i10 > CollectionsKt__CollectionsKt.G(list)) ? defaultValue.invoke(Integer.valueOf(i10)) : (T) list.get(i10);
        }
        if (i10 < 0) {
            return defaultValue.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (T t10 : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return defaultValue.invoke(Integer.valueOf(i10));
    }

    @dl.d
    public static final <T> Set<T> d3(@dl.d Iterable<? extends T> iterable, @dl.d Iterable<? extends T> other) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<T> setU5 = U5(iterable);
        x.O0(setU5, other);
        return setU5;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Double d4(@dl.d Iterable<Double> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @dl.e
    public static final <T> T d5(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @dl.d
    public static final <T, R> List<Pair<T, R>> d6(@dl.d Iterable<? extends T> iterable, @dl.d Iterable<? extends R> other) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(t.Y(iterable, 10), t.Y(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(kotlin.c1.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    @sh.f
    private static final <T> T e2(List<? extends T> list, int i10, yh.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > CollectionsKt__CollectionsKt.G(list)) ? defaultValue.invoke(Integer.valueOf(i10)) : list.get(i10);
    }

    @dl.d
    public static final <T, A extends Appendable> A e3(@dl.d Iterable<? extends T> iterable, @dl.d A buffer, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super T, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            kotlin.text.n.b(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Float e4(@dl.d Iterable<Float> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @dl.e
    public static final <T> T e5(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        boolean z10 = false;
        T t10 = null;
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                if (z10) {
                    return null;
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        return null;
    }

    @dl.d
    public static final <T, R, V> List<V> e6(@dl.d Iterable<? extends T> iterable, @dl.d Iterable<? extends R> other, @dl.d yh.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(t.Y(iterable, 10), t.Y(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(transform.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    @dl.e
    public static final <T> T f2(@dl.d Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) R2((List) iterable, i10);
        }
        if (i10 < 0) {
            return null;
        }
        int i11 = 0;
        for (T t10 : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return null;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final double f4(@dl.d Iterable<Double> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @dl.e
    public static final <T> T f5(@dl.d List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @dl.d
    public static final <T, R> List<Pair<T, R>> f6(@dl.d Iterable<? extends T> iterable, @dl.d R[] other) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(iterable, 10), length));
        int i10 = 0;
        for (T t10 : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(kotlin.c1.a(t10, other[i10]));
            i10++;
        }
        return arrayList;
    }

    @sh.f
    private static final <T> T g2(List<? extends T> list, int i10) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        return (T) R2(list, i10);
    }

    @dl.d
    public static final <T> String g3(@dl.d Iterable<? extends T> iterable, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        String string = ((StringBuilder) e3(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.f0.o(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final float g4(@dl.d Iterable<Float> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @dl.d
    public static final <T> List<T> g5(@dl.d List<? extends T> list, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : Q5(list.subList(indices.D().intValue(), indices.e().intValue() + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T, R, V> List<V> g6(@dl.d Iterable<? extends T> iterable, @dl.d R[] other, @dl.d yh.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(iterable, 10), length));
        int i10 = 0;
        for (T t10 : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(t10, other[i10]));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final <T> List<T> h2(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String h3(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return g3(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @dl.d
    @xh.h(name = "minOrThrow")
    public static final <T extends Comparable<? super T>> T h4(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @dl.d
    public static final <T> List<T> h5(@dl.d List<? extends T> list, @dl.d Iterable<Integer> indices) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.2")
    @dl.d
    public static final <T> List<Pair<T, T>> h6(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(kotlin.c1.a(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @dl.d
    public static final <T> List<T> i2(@dl.d Iterable<? extends T> iterable, @dl.d yh.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            if (predicate.invoke(Integer.valueOf(i10), t10).booleanValue()) {
                arrayList.add(t10);
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static final <T> T i3(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) k3((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <T> T i4(@dl.d Iterable<? extends T> iterable, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T, R extends Comparable<? super R>> void i5(@dl.d List<T> list, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (list.size() > 1) {
            w.m0(list, new kotlin.comparisons.g.a(selector));
        }
    }

    @kotlin.u0(version = "1.2")
    @dl.d
    public static final <T, R> List<R> i6(@dl.d Iterable<? extends T> iterable, @dl.d yh.p<? super T, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList();
        a.a.a.a.d.p.d.c.d next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(transform.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @dl.d
    public static final <T, C extends Collection<? super T>> C j2(@dl.d Iterable<? extends T> iterable, @dl.d C destination, @dl.d yh.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            if (predicate.invoke(Integer.valueOf(i10), t10).booleanValue()) {
                destination.add(t10);
            }
            i10 = i11;
        }
        return destination;
    }

    public static final <T> T j3(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    public static final <T> T j4(@dl.d Iterable<? extends T> iterable, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T, R extends Comparable<? super R>> void j5(@dl.d List<T> list, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (list.size() > 1) {
            w.m0(list, new kotlin.comparisons.g.c(selector));
        }
    }

    public static final /* synthetic */ <R> List<R> k2(Iterable<?> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            kotlin.jvm.internal.f0.y(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T k3(@dl.d List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(CollectionsKt__CollectionsKt.G(list));
    }

    @dl.d
    public static final <T> List<T> k4(@dl.d Iterable<? extends T> iterable, @dl.d Iterable<? extends T> elements) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        Collection collectionQ0 = x.q0(elements);
        if (collectionQ0.isEmpty()) {
            return Q5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!collectionQ0.contains(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T extends Comparable<? super T>> void k5(@dl.d List<T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        w.m0(list, kotlin.comparisons.g.x());
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C l2(Iterable<?> iterable, C destination) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (Object obj : iterable) {
            kotlin.jvm.internal.f0.y(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    public static final <T> T l3(@dl.d List<? extends T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @dl.d
    public static final <T> List<T> l4(@dl.d Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList(t.Y(iterable, 10));
        boolean z10 = false;
        for (T t11 : iterable) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.f0.g(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <T extends Comparable<? super T>> List<T> l5(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listS5 = S5(iterable);
            w.j0(listS5);
            return listS5;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Q5(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        m.v4((Comparable[]) array);
        return m.t(array);
    }

    @dl.d
    public static final <T> List<T> m2(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> int m3(@dl.d Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t10);
        }
        int i10 = -1;
        int i11 = 0;
        for (T t11 : iterable) {
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            if (kotlin.jvm.internal.f0.g(t10, t11)) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    @dl.d
    public static final <T> List<T> m4(@dl.d Iterable<? extends T> iterable, @dl.d kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        List listC3 = SequencesKt___SequencesKt.c3(elements);
        if (listC3.isEmpty()) {
            return Q5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!listC3.contains(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <T, R extends Comparable<? super R>> List<T> m5(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return p5(iterable, new kotlin.comparisons.g.a(selector));
    }

    @dl.d
    public static final <T> List<T> n2(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return (List) o2(iterable, new ArrayList());
    }

    public static final <T> int n3(@dl.d List<? extends T> list, T t10) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        return list.lastIndexOf(t10);
    }

    @dl.d
    public static final <T> List<T> n4(@dl.d Iterable<? extends T> iterable, @dl.d T[] elements) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (elements.length == 0) {
            return Q5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!ArraysKt___ArraysKt.T8(elements, t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <T, R extends Comparable<? super R>> List<T> n5(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return p5(iterable, new kotlin.comparisons.g.c(selector));
    }

    @dl.d
    public static final <C extends Collection<? super T>, T> C o2(@dl.d Iterable<? extends T> iterable, @dl.d C destination) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @dl.e
    public static final <T> T o3(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @sh.f
    private static final <T> List<T> o4(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return l4(iterable, t10);
    }

    @dl.d
    public static final <T extends Comparable<? super T>> List<T> o5(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return p5(iterable, kotlin.comparisons.g.x());
    }

    @dl.d
    public static final <T, C extends Collection<? super T>> C p2(@dl.d Iterable<? extends T> iterable, @dl.d C destination, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : iterable) {
            if (!predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @dl.e
    public static final <T> T p3(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        T t10 = null;
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                t10 = t11;
            }
        }
        return t10;
    }

    public static final <T> boolean p4(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T> List<T> p5(@dl.d Iterable<? extends T> iterable, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listS5 = S5(iterable);
            w.m0(listS5, comparator);
            return listS5;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Q5(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        m.I4(array, comparator);
        return m.t(array);
    }

    @dl.d
    public static final <T, C extends Collection<? super T>> C q2(@dl.d Iterable<? extends T> iterable, @dl.d C destination, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @dl.e
    public static final <T> T q3(@dl.d List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> boolean q4(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final <T> Set<T> q5(@dl.d Iterable<? extends T> iterable, @dl.d Iterable<? extends T> other) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<T> setU5 = U5(iterable);
        x.E0(setU5, other);
        return setU5;
    }

    public static final <T> boolean r1(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @sh.f
    private static final <T> T r2(Iterable<? extends T> iterable, yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @dl.e
    public static final <T> T r3(@dl.d List<? extends T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <T, C extends Iterable<? extends T>> C r4(@dl.d C c10, @dl.d yh.l<? super T, b2> action) {
        kotlin.jvm.internal.f0.p(c10, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        Iterator<T> it = c10.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return c10;
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final <T> int r5(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Integer> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += selector.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    public static final <T> boolean s1(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    @sh.f
    private static final <T> T s2(Iterable<? extends T> iterable, yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        T t10 = null;
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                t10 = t11;
            }
        }
        return t10;
    }

    @dl.d
    public static final <T, R> List<R> s3(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(t.Y(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <T, C extends Iterable<? extends T>> C s4(@dl.d C c10, @dl.d yh.p<? super Integer, ? super T, b2> action) {
        kotlin.jvm.internal.f0.p(c10, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int i10 = 0;
        for (T t10 : c10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            action.invoke(Integer.valueOf(i10), t10);
            i10 = i11;
        }
        return c10;
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final <T> double s5(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Double> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += selector.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    public static final <T> boolean t1(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @sh.f
    private static final <T> T t2(List<? extends T> list, yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    @dl.d
    public static final <T, R> List<R> t3(@dl.d Iterable<? extends T> iterable, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(t.Y(iterable, 10));
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            arrayList.add(transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return arrayList;
    }

    @dl.d
    public static final <T> Pair<List<T>, List<T>> t4(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            } else {
                arrayList2.add(t10);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @xh.h(name = "sumOfByte")
    public static final int t5(@dl.d Iterable<Byte> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @sh.f
    private static final <T> Iterable<T> u1(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return iterable;
    }

    public static final <T> T u2(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) w2((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @dl.d
    public static final <T, R> List<R> u3(@dl.d Iterable<? extends T> iterable, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            R rInvoke = transform.invoke(Integer.valueOf(i10), t10);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i10 = i11;
        }
        return arrayList;
    }

    @dl.d
    public static final <T> List<T> u4(@dl.d Iterable<? extends T> iterable, @dl.d Iterable<? extends T> elements) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (iterable instanceof Collection) {
            return y4((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        x.n0(arrayList, iterable);
        x.n0(arrayList, elements);
        return arrayList;
    }

    @xh.h(name = "sumOfDouble")
    public static final double u5(@dl.d Iterable<Double> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final <T> kotlin.sequences.m<T> v1(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return new a(iterable);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T v2(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C v3(@dl.d Iterable<? extends T> iterable, @dl.d C destination, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            R rInvoke = transform.invoke(Integer.valueOf(i10), t10);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i10 = i11;
        }
        return destination;
    }

    @dl.d
    public static final <T> List<T> v4(@dl.d Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return z4((Collection) iterable, t10);
        }
        ArrayList arrayList = new ArrayList();
        x.n0(arrayList, iterable);
        arrayList.add(t10);
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfDouble")
    @sh.f
    private static final <T> double v5(Iterable<? extends T> iterable, yh.l<? super T, Double> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += selector.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final <T, K, V> Map<K, V> w1(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(t.Y(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(it.next());
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    public static final <T> T w2(@dl.d List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C w3(@dl.d Iterable<? extends T> iterable, @dl.d C destination, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            destination.add(transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    @dl.d
    public static final <T> List<T> w4(@dl.d Iterable<? extends T> iterable, @dl.d kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        ArrayList arrayList = new ArrayList();
        x.n0(arrayList, iterable);
        x.o0(arrayList, elements);
        return arrayList;
    }

    @xh.h(name = "sumOfFloat")
    public static final float w5(@dl.d Iterable<Float> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    @dl.d
    public static final <T, K> Map<K, T> x1(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(t.Y(iterable, 10)), 16));
        for (T t10 : iterable) {
            linkedHashMap.put(keySelector.invoke(t10), t10);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.f
    private static final <T, R> R x2(Iterable<? extends T> iterable, yh.l<? super T, ? extends R> transform) {
        R rInvoke;
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                if (rInvoke != null) {
                    return rInvoke;
                }
                throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
            }
        }
        rInvoke = null;
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @dl.d
    public static final <T, R> List<R> x3(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <T> List<T> x4(@dl.d Iterable<? extends T> iterable, @dl.d T[] elements) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (iterable instanceof Collection) {
            return B4((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        x.n0(arrayList, iterable);
        x.p0(arrayList, elements);
        return arrayList;
    }

    @xh.h(name = "sumOfInt")
    public static final int x5(@dl.d Iterable<Integer> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final <T, K, V> Map<K, V> y1(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, ? extends K> keySelector, @dl.d yh.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(t.Y(iterable, 10)), 16));
        for (T t10 : iterable) {
            linkedHashMap.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.f
    private static final <T, R> R y2(Iterable<? extends T> iterable, yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C y3(@dl.d Iterable<? extends T> iterable, @dl.d C destination, @dl.d yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @dl.d
    public static final <T> List<T> y4(@dl.d Collection<? extends T> collection, @dl.d Iterable<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            x.n0(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfInt")
    @sh.f
    private static final <T> int y5(Iterable<? extends T> iterable, yh.l<? super T, Integer> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += selector.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final <T, K, M extends Map<? super K, ? super T>> M z1(@dl.d Iterable<? extends T> iterable, @dl.d M destination, @dl.d yh.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (T t10 : iterable) {
            destination.put(keySelector.invoke(t10), t10);
        }
        return destination;
    }

    @dl.e
    public static final <T> T z2(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C z3(@dl.d Iterable<? extends T> iterable, @dl.d C destination, @dl.d yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    @dl.d
    public static final <T> List<T> z4(@dl.d Collection<? extends T> collection, T t10) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    @xh.h(name = "sumOfLong")
    public static final long z5(@dl.d Iterable<Long> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }
}
