package kotlin.collections.unsigned;

import com.meituan.robust.Constants;
import dl.d;
import dl.e;
import fi.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h0;
import kotlin.collections.h1;
import kotlin.collections.i0;
import kotlin.collections.k0;
import kotlin.collections.m;
import kotlin.collections.r0;
import kotlin.collections.t;
import kotlin.collections.x;
import kotlin.collections.z;
import kotlin.e2;
import kotlin.j1;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.k1;
import kotlin.l0;
import kotlin.n1;
import kotlin.o1;
import kotlin.q;
import kotlin.r1;
import kotlin.random.Random;
import kotlin.s;
import kotlin.s1;
import kotlin.u0;
import kotlin.x1;
import kotlin.y1;
import org.apache.tools.ant.util.s0;
import sh.f;
import xh.h;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: _UArrays.kt */
/* JADX INFO: loaded from: classes5.dex */
public class UArraysKt___UArraysKt extends b {
    @u0(version = "1.3")
    @s
    @f
    private static final long A0(long[] component1) {
        f0.p(component1, "$this$component1");
        return s1.s(component1, 0);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte[] A1(byte[] copyOf, int i10) {
        f0.p(copyOf, "$this$copyOf");
        byte[] bArrCopyOf = Arrays.copyOf(copyOf, i10);
        f0.o(bArrCopyOf, "copyOf(this, newSize)");
        return k1.g(bArrCopyOf);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<r1> A2(long[] filterIndexed, p<? super Integer, ? super r1, Boolean> predicate) {
        f0.p(filterIndexed, "$this$filterIndexed");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = s1.v(filterIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            long jS = s1.s(filterIndexed, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), r1.b(jS)).booleanValue()) {
                arrayList.add(r1.b(jS));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R, C extends Collection<? super R>> C A3(byte[] flatMapIndexedTo, C destination, p<? super Integer, ? super j1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMapIndexedTo, "$this$flatMapIndexedTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = k1.v(flatMapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), j1.b(k1.s(flatMapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @e
    public static final n1 A4(@d int[] getOrNull, int i10) {
        f0.p(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 > ArraysKt___ArraysKt.Ve(getOrNull)) {
            return null;
        }
        return n1.b(o1.s(getOrNull, i10));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> List<R> A5(int[] map, l<? super n1, ? extends R> transform) {
        f0.p(map, "$this$map");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(o1.v(map));
        int iV = o1.v(map);
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(transform.invoke(n1.b(o1.s(map, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R A6(short[] maxOfWithOrNull, Comparator<? super R> comparator, l<? super x1, ? extends R> selector) {
        f0.p(maxOfWithOrNull, "$this$maxOfWithOrNull");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (y1.y(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(x1.b(y1.s(maxOfWithOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(x1.b(y1.s(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R A7(short[] minOfWith, Comparator<? super R> comparator, l<? super x1, ? extends R> selector) {
        f0.p(minOfWith, "$this$minOfWith");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (y1.y(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(x1.b(y1.s(minOfWith, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(minOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(x1.b(y1.s(minOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte A8(byte[] random) {
        f0.p(random, "$this$random");
        return D8(random, Random.f125033b);
    }

    @u0(version = "1.4")
    @s
    @f
    private static final void A9(int[] reverse, int i10, int i11) {
        f0.p(reverse, "$this$reverse");
        ArraysKt___ArraysKt.zr(reverse, i10, i11);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final j1 Aa(byte[] singleOrNull, l<? super j1, Boolean> predicate) {
        f0.p(singleOrNull, "$this$singleOrNull");
        f0.p(predicate, "predicate");
        int iV = k1.v(singleOrNull);
        boolean z10 = false;
        j1 j1VarB = null;
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(singleOrNull, i10);
            if (predicate.invoke(j1.b(bS)).booleanValue()) {
                if (z10) {
                    return null;
                }
                j1VarB = j1.b(bS);
                z10 = true;
            }
        }
        if (z10) {
            return j1VarB;
        }
        return null;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final long[] Ab(@d long[] sortedArrayDescending) {
        f0.p(sortedArrayDescending, "$this$sortedArrayDescending");
        if (s1.y(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        f0.o(jArrCopyOf, "copyOf(this, size)");
        long[] jArrG = s1.g(jArrCopyOf);
        nb(jArrG);
        return jArrG;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<n1> Ac(int[] takeLastWhile, l<? super n1, Boolean> predicate) {
        f0.p(takeLastWhile, "$this$takeLastWhile");
        f0.p(predicate, "predicate");
        for (int iVe = ArraysKt___ArraysKt.Ve(takeLastWhile); -1 < iVe; iVe--) {
            if (!predicate.invoke(n1.b(o1.s(takeLastWhile, iVe))).booleanValue()) {
                return Q1(takeLastWhile, iVe + 1);
            }
        }
        return CollectionsKt___CollectionsKt.Q5(o1.b(takeLastWhile));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short B0(short[] component1) {
        f0.p(component1, "$this$component1");
        return y1.s(component1, 0);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long[] B1(long[] copyOf) {
        f0.p(copyOf, "$this$copyOf");
        long[] jArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        f0.o(jArrCopyOf, "copyOf(this, size)");
        return s1.g(jArrCopyOf);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<x1> B2(short[] filterIndexed, p<? super Integer, ? super x1, Boolean> predicate) {
        f0.p(filterIndexed, "$this$filterIndexed");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = y1.v(filterIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            short s10 = y1.s(filterIndexed, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), x1.b(s10)).booleanValue()) {
                arrayList.add(x1.b(s10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R, C extends Collection<? super R>> C B3(long[] flatMapIndexedTo, C destination, p<? super Integer, ? super r1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMapIndexedTo, "$this$flatMapIndexedTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = s1.v(flatMapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), r1.b(s1.s(flatMapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @e
    public static final r1 B4(@d long[] getOrNull, int i10) {
        f0.p(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 > ArraysKt___ArraysKt.We(getOrNull)) {
            return null;
        }
        return r1.b(s1.s(getOrNull, i10));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> List<R> B5(short[] map, l<? super x1, ? extends R> transform) {
        f0.p(map, "$this$map");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(y1.v(map));
        int iV = y1.v(map);
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(transform.invoke(x1.b(y1.s(map, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R B6(int[] maxOfWithOrNull, Comparator<? super R> comparator, l<? super n1, ? extends R> selector) {
        f0.p(maxOfWithOrNull, "$this$maxOfWithOrNull");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (o1.y(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(n1.b(o1.s(maxOfWithOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(n1.b(o1.s(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R B7(int[] minOfWith, Comparator<? super R> comparator, l<? super n1, ? extends R> selector) {
        f0.p(minOfWith, "$this$minOfWith");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (o1.y(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(n1.b(o1.s(minOfWith, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(minOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(n1.b(o1.s(minOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @s
    public static final long B8(@d long[] random, @d Random random2) {
        f0.p(random, "$this$random");
        f0.p(random2, "random");
        if (s1.y(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return s1.s(random, random2.m(s1.v(random)));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final void B9(short[] reverse) {
        f0.p(reverse, "$this$reverse");
        ArraysKt___ArraysKt.Er(reverse);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final r1 Ba(long[] singleOrNull, l<? super r1, Boolean> predicate) {
        f0.p(singleOrNull, "$this$singleOrNull");
        f0.p(predicate, "predicate");
        int iV = s1.v(singleOrNull);
        boolean z10 = false;
        r1 r1VarB = null;
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(singleOrNull, i10);
            if (predicate.invoke(r1.b(jS)).booleanValue()) {
                if (z10) {
                    return null;
                }
                r1VarB = r1.b(jS);
                z10 = true;
            }
        }
        if (z10) {
            return r1VarB;
        }
        return null;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final short[] Bb(@d short[] sortedArrayDescending) {
        f0.p(sortedArrayDescending, "$this$sortedArrayDescending");
        if (y1.y(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        f0.o(sArrCopyOf, "copyOf(this, size)");
        short[] sArrG = y1.g(sArrCopyOf);
        pb(sArrG);
        return sArrG;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<x1> Bc(short[] takeLastWhile, l<? super x1, Boolean> predicate) {
        f0.p(takeLastWhile, "$this$takeLastWhile");
        f0.p(predicate, "predicate");
        for (int iYe = ArraysKt___ArraysKt.Ye(takeLastWhile); -1 < iYe; iYe--) {
            if (!predicate.invoke(x1.b(y1.s(takeLastWhile, iYe))).booleanValue()) {
                return P1(takeLastWhile, iYe + 1);
            }
        }
        return CollectionsKt___CollectionsKt.Q5(y1.b(takeLastWhile));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int C0(int[] component2) {
        f0.p(component2, "$this$component2");
        return o1.s(component2, 1);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short[] C1(short[] copyOf, int i10) {
        f0.p(copyOf, "$this$copyOf");
        short[] sArrCopyOf = Arrays.copyOf(copyOf, i10);
        f0.o(sArrCopyOf, "copyOf(this, newSize)");
        return y1.g(sArrCopyOf);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <C extends Collection<? super n1>> C C2(int[] filterIndexedTo, C destination, p<? super Integer, ? super n1, Boolean> predicate) {
        f0.p(filterIndexedTo, "$this$filterIndexedTo");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int iV = o1.v(filterIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            int iS = o1.s(filterIndexedTo, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), n1.b(iS)).booleanValue()) {
                destination.add(n1.b(iS));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, C extends Collection<? super R>> C C3(long[] flatMapTo, C destination, l<? super r1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMapTo, "$this$flatMapTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = s1.v(flatMapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            x.n0(destination, transform.invoke(r1.b(s1.s(flatMapTo, i10))));
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <K, V> Map<K, List<V>> C4(long[] groupBy, l<? super r1, ? extends K> keySelector, l<? super r1, ? extends V> valueTransform) {
        f0.p(groupBy, "$this$groupBy");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = s1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(groupBy, i10);
            K kInvoke = keySelector.invoke(r1.b(jS));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(r1.b(jS)));
        }
        return linkedHashMap;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> List<R> C5(byte[] mapIndexed, p<? super Integer, ? super j1, ? extends R> transform) {
        f0.p(mapIndexed, "$this$mapIndexed");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(k1.v(mapIndexed));
        int iV = k1.v(mapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), j1.b(k1.s(mapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final n1 C6(@d int[] maxOrNull) {
        f0.p(maxOrNull, "$this$maxOrNull");
        if (o1.y(maxOrNull)) {
            return null;
        }
        int iS = o1.s(maxOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(maxOrNull)).iterator();
        while (it.hasNext()) {
            int iS2 = o1.s(maxOrNull, it.nextInt());
            if (Integer.compare(iS ^ Integer.MIN_VALUE, iS2 ^ Integer.MIN_VALUE) < 0) {
                iS = iS2;
            }
        }
        return n1.b(iS);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R C7(long[] minOfWithOrNull, Comparator<? super R> comparator, l<? super r1, ? extends R> selector) {
        f0.p(minOfWithOrNull, "$this$minOfWithOrNull");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (s1.y(minOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(r1.b(s1.s(minOfWithOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(r1.b(s1.s(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long C8(long[] random) {
        f0.p(random, "$this$random");
        return B8(random, Random.f125033b);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<n1> C9(@d int[] reversed) {
        f0.p(reversed, "$this$reversed");
        if (o1.y(reversed)) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<n1> listT5 = CollectionsKt___CollectionsKt.T5(o1.b(reversed));
        z.m1(listT5);
        return listT5;
    }

    @u0(version = "1.3")
    @s
    @e
    public static final r1 Ca(@d long[] singleOrNull) {
        f0.p(singleOrNull, "$this$singleOrNull");
        if (s1.v(singleOrNull) == 1) {
            return r1.b(s1.s(singleOrNull, 0));
        }
        return null;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<n1> Cb(@d int[] sortedDescending) {
        f0.p(sortedDescending, "$this$sortedDescending");
        int[] iArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        f0.o(iArrCopyOf, "copyOf(this, size)");
        int[] iArrG = o1.g(iArrCopyOf);
        Wa(iArrG);
        return C9(iArrG);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<j1> Cc(byte[] takeWhile, l<? super j1, Boolean> predicate) {
        f0.p(takeWhile, "$this$takeWhile");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = k1.v(takeWhile);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(takeWhile, i10);
            if (!predicate.invoke(j1.b(bS)).booleanValue()) {
                break;
            }
            arrayList.add(j1.b(bS));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte D0(byte[] component2) {
        f0.p(component2, "$this$component2");
        return k1.s(component2, 1);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int[] D1(int[] copyOf, int i10) {
        f0.p(copyOf, "$this$copyOf");
        int[] iArrCopyOf = Arrays.copyOf(copyOf, i10);
        f0.o(iArrCopyOf, "copyOf(this, newSize)");
        return o1.g(iArrCopyOf);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <C extends Collection<? super x1>> C D2(short[] filterIndexedTo, C destination, p<? super Integer, ? super x1, Boolean> predicate) {
        f0.p(filterIndexedTo, "$this$filterIndexedTo");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int iV = y1.v(filterIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            short s10 = y1.s(filterIndexedTo, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), x1.b(s10)).booleanValue()) {
                destination.add(x1.b(s10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, C extends Collection<? super R>> C D3(short[] flatMapTo, C destination, l<? super x1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMapTo, "$this$flatMapTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = y1.v(flatMapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            x.n0(destination, transform.invoke(x1.b(y1.s(flatMapTo, i10))));
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <K, V> Map<K, List<V>> D4(short[] groupBy, l<? super x1, ? extends K> keySelector, l<? super x1, ? extends V> valueTransform) {
        f0.p(groupBy, "$this$groupBy");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = y1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(groupBy, i10);
            K kInvoke = keySelector.invoke(x1.b(s10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(x1.b(s10)));
        }
        return linkedHashMap;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> List<R> D5(int[] mapIndexed, p<? super Integer, ? super n1, ? extends R> transform) {
        f0.p(mapIndexed, "$this$mapIndexed");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(o1.v(mapIndexed));
        int iV = o1.v(mapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), n1.b(o1.s(mapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final j1 D6(@d byte[] maxOrNull) {
        f0.p(maxOrNull, "$this$maxOrNull");
        if (k1.y(maxOrNull)) {
            return null;
        }
        byte bS = k1.s(maxOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(maxOrNull)).iterator();
        while (it.hasNext()) {
            byte bS2 = k1.s(maxOrNull, it.nextInt());
            if (f0.t(bS & 255, bS2 & 255) < 0) {
                bS = bS2;
            }
        }
        return j1.b(bS);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R D7(byte[] minOfWithOrNull, Comparator<? super R> comparator, l<? super j1, ? extends R> selector) {
        f0.p(minOfWithOrNull, "$this$minOfWithOrNull");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (k1.y(minOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(j1.b(k1.s(minOfWithOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(j1.b(k1.s(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @s
    public static final byte D8(@d byte[] random, @d Random random2) {
        f0.p(random, "$this$random");
        f0.p(random2, "random");
        if (k1.y(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return k1.s(random, random2.m(k1.v(random)));
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<j1> D9(@d byte[] reversed) {
        f0.p(reversed, "$this$reversed");
        if (k1.y(reversed)) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<j1> listT5 = CollectionsKt___CollectionsKt.T5(k1.b(reversed));
        z.m1(listT5);
        return listT5;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final n1 Da(int[] singleOrNull, l<? super n1, Boolean> predicate) {
        f0.p(singleOrNull, "$this$singleOrNull");
        f0.p(predicate, "predicate");
        int iV = o1.v(singleOrNull);
        boolean z10 = false;
        n1 n1VarB = null;
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(singleOrNull, i10);
            if (predicate.invoke(n1.b(iS)).booleanValue()) {
                if (z10) {
                    return null;
                }
                n1VarB = n1.b(iS);
                z10 = true;
            }
        }
        if (z10) {
            return n1VarB;
        }
        return null;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<j1> Db(@d byte[] sortedDescending) {
        f0.p(sortedDescending, "$this$sortedDescending");
        byte[] bArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        f0.o(bArrCopyOf, "copyOf(this, size)");
        byte[] bArrG = k1.g(bArrCopyOf);
        db(bArrG);
        return D9(bArrG);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<r1> Dc(long[] takeWhile, l<? super r1, Boolean> predicate) {
        f0.p(takeWhile, "$this$takeWhile");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = s1.v(takeWhile);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(takeWhile, i10);
            if (!predicate.invoke(r1.b(jS)).booleanValue()) {
                break;
            }
            arrayList.add(r1.b(jS));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long E0(long[] component2) {
        f0.p(component2, "$this$component2");
        return s1.s(component2, 1);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long[] E1(long[] copyOf, int i10) {
        f0.p(copyOf, "$this$copyOf");
        long[] jArrCopyOf = Arrays.copyOf(copyOf, i10);
        f0.o(jArrCopyOf, "copyOf(this, newSize)");
        return s1.g(jArrCopyOf);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <C extends Collection<? super j1>> C E2(byte[] filterIndexedTo, C destination, p<? super Integer, ? super j1, Boolean> predicate) {
        f0.p(filterIndexedTo, "$this$filterIndexedTo");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int iV = k1.v(filterIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            byte bS = k1.s(filterIndexedTo, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), j1.b(bS)).booleanValue()) {
                destination.add(j1.b(bS));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, C extends Collection<? super R>> C E3(int[] flatMapTo, C destination, l<? super n1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMapTo, "$this$flatMapTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = o1.v(flatMapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            x.n0(destination, transform.invoke(n1.b(o1.s(flatMapTo, i10))));
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <K> Map<K, List<j1>> E4(byte[] groupBy, l<? super j1, ? extends K> keySelector) {
        f0.p(groupBy, "$this$groupBy");
        f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = k1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(groupBy, i10);
            K kInvoke = keySelector.invoke(j1.b(bS));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(j1.b(bS));
        }
        return linkedHashMap;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> List<R> E5(long[] mapIndexed, p<? super Integer, ? super r1, ? extends R> transform) {
        f0.p(mapIndexed, "$this$mapIndexed");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(s1.v(mapIndexed));
        int iV = s1.v(mapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), r1.b(s1.s(mapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final r1 E6(@d long[] maxOrNull) {
        f0.p(maxOrNull, "$this$maxOrNull");
        if (s1.y(maxOrNull)) {
            return null;
        }
        long jS = s1.s(maxOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(maxOrNull)).iterator();
        while (it.hasNext()) {
            long jS2 = s1.s(maxOrNull, it.nextInt());
            if (Long.compare(jS ^ Long.MIN_VALUE, jS2 ^ Long.MIN_VALUE) < 0) {
                jS = jS2;
            }
        }
        return r1.b(jS);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R E7(short[] minOfWithOrNull, Comparator<? super R> comparator, l<? super x1, ? extends R> selector) {
        f0.p(minOfWithOrNull, "$this$minOfWithOrNull");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (y1.y(minOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(x1.b(y1.s(minOfWithOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(x1.b(y1.s(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short E8(short[] random) {
        f0.p(random, "$this$random");
        return F8(random, Random.f125033b);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<r1> E9(@d long[] reversed) {
        f0.p(reversed, "$this$reversed");
        if (s1.y(reversed)) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<r1> listT5 = CollectionsKt___CollectionsKt.T5(s1.b(reversed));
        z.m1(listT5);
        return listT5;
    }

    @u0(version = "1.3")
    @s
    @e
    public static final x1 Ea(@d short[] singleOrNull) {
        f0.p(singleOrNull, "$this$singleOrNull");
        if (y1.v(singleOrNull) == 1) {
            return x1.b(y1.s(singleOrNull, 0));
        }
        return null;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<r1> Eb(@d long[] sortedDescending) {
        f0.p(sortedDescending, "$this$sortedDescending");
        long[] jArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        f0.o(jArrCopyOf, "copyOf(this, size)");
        long[] jArrG = s1.g(jArrCopyOf);
        eb(jArrG);
        return E9(jArrG);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<n1> Ec(int[] takeWhile, l<? super n1, Boolean> predicate) {
        f0.p(takeWhile, "$this$takeWhile");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = o1.v(takeWhile);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(takeWhile, i10);
            if (!predicate.invoke(n1.b(iS)).booleanValue()) {
                break;
            }
            arrayList.add(n1.b(iS));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short F0(short[] component2) {
        f0.p(component2, "$this$component2");
        return y1.s(component2, 1);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short[] F1(short[] copyOf) {
        f0.p(copyOf, "$this$copyOf");
        short[] sArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        f0.o(sArrCopyOf, "copyOf(this, size)");
        return y1.g(sArrCopyOf);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <C extends Collection<? super r1>> C F2(long[] filterIndexedTo, C destination, p<? super Integer, ? super r1, Boolean> predicate) {
        f0.p(filterIndexedTo, "$this$filterIndexedTo");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int iV = s1.v(filterIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            long jS = s1.s(filterIndexedTo, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), r1.b(jS)).booleanValue()) {
                destination.add(r1.b(jS));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, C extends Collection<? super R>> C F3(byte[] flatMapTo, C destination, l<? super j1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMapTo, "$this$flatMapTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = k1.v(flatMapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            x.n0(destination, transform.invoke(j1.b(k1.s(flatMapTo, i10))));
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <K, V> Map<K, List<V>> F4(int[] groupBy, l<? super n1, ? extends K> keySelector, l<? super n1, ? extends V> valueTransform) {
        f0.p(groupBy, "$this$groupBy");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = o1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(groupBy, i10);
            K kInvoke = keySelector.invoke(n1.b(iS));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(n1.b(iS)));
        }
        return linkedHashMap;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> List<R> F5(short[] mapIndexed, p<? super Integer, ? super x1, ? extends R> transform) {
        f0.p(mapIndexed, "$this$mapIndexed");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(y1.v(mapIndexed));
        int iV = y1.v(mapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), x1.b(y1.s(mapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final x1 F6(@d short[] maxOrNull) {
        f0.p(maxOrNull, "$this$maxOrNull");
        if (y1.y(maxOrNull)) {
            return null;
        }
        short s10 = y1.s(maxOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(maxOrNull)).iterator();
        while (it.hasNext()) {
            short s11 = y1.s(maxOrNull, it.nextInt());
            if (f0.t(s10 & x1.f128661e, 65535 & s11) < 0) {
                s10 = s11;
            }
        }
        return x1.b(s10);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R F7(int[] minOfWithOrNull, Comparator<? super R> comparator, l<? super n1, ? extends R> selector) {
        f0.p(minOfWithOrNull, "$this$minOfWithOrNull");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (o1.y(minOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(n1.b(o1.s(minOfWithOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(n1.b(o1.s(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @s
    public static final short F8(@d short[] random, @d Random random2) {
        f0.p(random, "$this$random");
        f0.p(random2, "random");
        if (y1.y(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return y1.s(random, random2.m(y1.v(random)));
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<x1> F9(@d short[] reversed) {
        f0.p(reversed, "$this$reversed");
        if (y1.y(reversed)) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<x1> listT5 = CollectionsKt___CollectionsKt.T5(y1.b(reversed));
        z.m1(listT5);
        return listT5;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final x1 Fa(short[] singleOrNull, l<? super x1, Boolean> predicate) {
        f0.p(singleOrNull, "$this$singleOrNull");
        f0.p(predicate, "predicate");
        int iV = y1.v(singleOrNull);
        boolean z10 = false;
        x1 x1VarB = null;
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(singleOrNull, i10);
            if (predicate.invoke(x1.b(s10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                x1VarB = x1.b(s10);
                z10 = true;
            }
        }
        if (z10) {
            return x1VarB;
        }
        return null;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<x1> Fb(@d short[] sortedDescending) {
        f0.p(sortedDescending, "$this$sortedDescending");
        short[] sArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        f0.o(sArrCopyOf, "copyOf(this, size)");
        short[] sArrG = y1.g(sArrCopyOf);
        hb(sArrG);
        return F9(sArrG);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<x1> Fc(short[] takeWhile, l<? super x1, Boolean> predicate) {
        f0.p(takeWhile, "$this$takeWhile");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = y1.v(takeWhile);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(takeWhile, i10);
            if (!predicate.invoke(x1.b(s10)).booleanValue()) {
                break;
            }
            arrayList.add(x1.b(s10));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int G0(int[] component3) {
        f0.p(component3, "$this$component3");
        return o1.s(component3, 2);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long[] G1(long[] copyOfRange, int i10, int i11) {
        f0.p(copyOfRange, "$this$copyOfRange");
        return s1.g(m.L1(copyOfRange, i10, i11));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<j1> G2(byte[] filterNot, l<? super j1, Boolean> predicate) {
        f0.p(filterNot, "$this$filterNot");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = k1.v(filterNot);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(filterNot, i10);
            if (!predicate.invoke(j1.b(bS)).booleanValue()) {
                arrayList.add(j1.b(bS));
            }
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R G3(long[] fold, R r10, p<? super R, ? super r1, ? extends R> operation) {
        f0.p(fold, "$this$fold");
        f0.p(operation, "operation");
        int iV = s1.v(fold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, r1.b(s1.s(fold, i10)));
        }
        return r10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <K> Map<K, List<r1>> G4(long[] groupBy, l<? super r1, ? extends K> keySelector) {
        f0.p(groupBy, "$this$groupBy");
        f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = s1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(groupBy, i10);
            K kInvoke = keySelector.invoke(r1.b(jS));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(r1.b(jS));
        }
        return linkedHashMap;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, C extends Collection<? super R>> C G5(int[] mapIndexedTo, C destination, p<? super Integer, ? super n1, ? extends R> transform) {
        f0.p(mapIndexedTo, "$this$mapIndexedTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = o1.v(mapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            destination.add(transform.invoke(Integer.valueOf(i11), n1.b(o1.s(mapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "maxOrThrow-U")
    public static final byte G6(@d byte[] max) {
        f0.p(max, "$this$max");
        if (k1.y(max)) {
            throw new NoSuchElementException();
        }
        byte bS = k1.s(max, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(max)).iterator();
        while (it.hasNext()) {
            byte bS2 = k1.s(max, it.nextInt());
            if (f0.t(bS & 255, bS2 & 255) < 0) {
                bS = bS2;
            }
        }
        return bS;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final n1 G7(@d int[] minOrNull) {
        f0.p(minOrNull, "$this$minOrNull");
        if (o1.y(minOrNull)) {
            return null;
        }
        int iS = o1.s(minOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(minOrNull)).iterator();
        while (it.hasNext()) {
            int iS2 = o1.s(minOrNull, it.nextInt());
            if (Integer.compare(iS ^ Integer.MIN_VALUE, iS2 ^ Integer.MIN_VALUE) > 0) {
                iS = iS2;
            }
        }
        return n1.b(iS);
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final n1 G8(int[] randomOrNull) {
        f0.p(randomOrNull, "$this$randomOrNull");
        return H8(randomOrNull, Random.f125033b);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int[] G9(int[] reversedArray) {
        f0.p(reversedArray, "$this$reversedArray");
        return o1.g(ArraysKt___ArraysKt.Vr(reversedArray));
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<r1> Ga(@d long[] slice, @d Iterable<Integer> indices) {
        f0.p(slice, "$this$slice");
        f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(r1.b(s1.s(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int Gb(int[] sum) {
        f0.p(sum, "$this$sum");
        return n1.h(ArraysKt___ArraysKt.Bw(sum));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte[] Gc(byte[] toByteArray) {
        f0.p(toByteArray, "$this$toByteArray");
        byte[] bArrCopyOf = Arrays.copyOf(toByteArray, toByteArray.length);
        f0.o(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte H0(byte[] component3) {
        f0.p(component3, "$this$component3");
        return k1.s(component3, 2);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte[] H1(byte[] copyOfRange, int i10, int i11) {
        f0.p(copyOfRange, "$this$copyOfRange");
        return k1.g(m.G1(copyOfRange, i10, i11));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<r1> H2(long[] filterNot, l<? super r1, Boolean> predicate) {
        f0.p(filterNot, "$this$filterNot");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = s1.v(filterNot);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(filterNot, i10);
            if (!predicate.invoke(r1.b(jS)).booleanValue()) {
                arrayList.add(r1.b(jS));
            }
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R H3(byte[] fold, R r10, p<? super R, ? super j1, ? extends R> operation) {
        f0.p(fold, "$this$fold");
        f0.p(operation, "operation");
        int iV = k1.v(fold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, j1.b(k1.s(fold, i10)));
        }
        return r10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <K, V> Map<K, List<V>> H4(byte[] groupBy, l<? super j1, ? extends K> keySelector, l<? super j1, ? extends V> valueTransform) {
        f0.p(groupBy, "$this$groupBy");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = k1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(groupBy, i10);
            K kInvoke = keySelector.invoke(j1.b(bS));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(j1.b(bS)));
        }
        return linkedHashMap;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, C extends Collection<? super R>> C H5(short[] mapIndexedTo, C destination, p<? super Integer, ? super x1, ? extends R> transform) {
        f0.p(mapIndexedTo, "$this$mapIndexedTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = y1.v(mapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            destination.add(transform.invoke(Integer.valueOf(i11), x1.b(y1.s(mapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "maxOrThrow-U")
    public static final int H6(@d int[] max) {
        f0.p(max, "$this$max");
        if (o1.y(max)) {
            throw new NoSuchElementException();
        }
        int iS = o1.s(max, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(max)).iterator();
        while (it.hasNext()) {
            int iS2 = o1.s(max, it.nextInt());
            if (Integer.compare(iS ^ Integer.MIN_VALUE, iS2 ^ Integer.MIN_VALUE) < 0) {
                iS = iS2;
            }
        }
        return iS;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final j1 H7(@d byte[] minOrNull) {
        f0.p(minOrNull, "$this$minOrNull");
        if (k1.y(minOrNull)) {
            return null;
        }
        byte bS = k1.s(minOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(minOrNull)).iterator();
        while (it.hasNext()) {
            byte bS2 = k1.s(minOrNull, it.nextInt());
            if (f0.t(bS & 255, bS2 & 255) > 0) {
                bS = bS2;
            }
        }
        return j1.b(bS);
    }

    @u0(version = "1.4")
    @s
    @e
    @e2(markerClass = {q.class})
    public static final n1 H8(@d int[] randomOrNull, @d Random random) {
        f0.p(randomOrNull, "$this$randomOrNull");
        f0.p(random, "random");
        if (o1.y(randomOrNull)) {
            return null;
        }
        return n1.b(o1.s(randomOrNull, random.m(o1.v(randomOrNull))));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte[] H9(byte[] reversedArray) {
        f0.p(reversedArray, "$this$reversedArray");
        return k1.g(ArraysKt___ArraysKt.Rr(reversedArray));
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<n1> Ha(@d int[] slice, @d Iterable<Integer> indices) {
        f0.p(slice, "$this$slice");
        f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(n1.b(o1.s(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int Hb(byte[] sum) {
        f0.p(sum, "$this$sum");
        int iH = n1.h(0);
        int iV = k1.v(sum);
        for (int i10 = 0; i10 < iV; i10++) {
            iH = n1.h(iH + n1.h(k1.s(sum, i10) & 255));
        }
        return iH;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int[] Hc(int[] toIntArray) {
        f0.p(toIntArray, "$this$toIntArray");
        int[] iArrCopyOf = Arrays.copyOf(toIntArray, toIntArray.length);
        f0.o(iArrCopyOf, "copyOf(this, size)");
        return iArrCopyOf;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long I0(long[] component3) {
        f0.p(component3, "$this$component3");
        return s1.s(component3, 2);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short[] I1(short[] copyOfRange, int i10, int i11) {
        f0.p(copyOfRange, "$this$copyOfRange");
        return y1.g(m.N1(copyOfRange, i10, i11));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<n1> I2(int[] filterNot, l<? super n1, Boolean> predicate) {
        f0.p(filterNot, "$this$filterNot");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = o1.v(filterNot);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(filterNot, i10);
            if (!predicate.invoke(n1.b(iS)).booleanValue()) {
                arrayList.add(n1.b(iS));
            }
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R I3(int[] fold, R r10, p<? super R, ? super n1, ? extends R> operation) {
        f0.p(fold, "$this$fold");
        f0.p(operation, "operation");
        int iV = o1.v(fold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, n1.b(o1.s(fold, i10)));
        }
        return r10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <K> Map<K, List<n1>> I4(int[] groupBy, l<? super n1, ? extends K> keySelector) {
        f0.p(groupBy, "$this$groupBy");
        f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = o1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(groupBy, i10);
            K kInvoke = keySelector.invoke(n1.b(iS));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(n1.b(iS));
        }
        return linkedHashMap;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, C extends Collection<? super R>> C I5(byte[] mapIndexedTo, C destination, p<? super Integer, ? super j1, ? extends R> transform) {
        f0.p(mapIndexedTo, "$this$mapIndexedTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = k1.v(mapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            destination.add(transform.invoke(Integer.valueOf(i11), j1.b(k1.s(mapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "maxOrThrow-U")
    public static final long I6(@d long[] max) {
        f0.p(max, "$this$max");
        if (s1.y(max)) {
            throw new NoSuchElementException();
        }
        long jS = s1.s(max, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(max)).iterator();
        while (it.hasNext()) {
            long jS2 = s1.s(max, it.nextInt());
            if (Long.compare(jS ^ Long.MIN_VALUE, jS2 ^ Long.MIN_VALUE) < 0) {
                jS = jS2;
            }
        }
        return jS;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final r1 I7(@d long[] minOrNull) {
        f0.p(minOrNull, "$this$minOrNull");
        if (s1.y(minOrNull)) {
            return null;
        }
        long jS = s1.s(minOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(minOrNull)).iterator();
        while (it.hasNext()) {
            long jS2 = s1.s(minOrNull, it.nextInt());
            if (Long.compare(jS ^ Long.MIN_VALUE, jS2 ^ Long.MIN_VALUE) > 0) {
                jS = jS2;
            }
        }
        return r1.b(jS);
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final j1 I8(byte[] randomOrNull) {
        f0.p(randomOrNull, "$this$randomOrNull");
        return L8(randomOrNull, Random.f125033b);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long[] I9(long[] reversedArray) {
        f0.p(reversedArray, "$this$reversedArray");
        return s1.g(ArraysKt___ArraysKt.Wr(reversedArray));
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<x1> Ia(@d short[] slice, @d Iterable<Integer> indices) {
        f0.p(slice, "$this$slice");
        f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(x1.b(y1.s(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long Ib(long[] sum) {
        f0.p(sum, "$this$sum");
        return r1.h(ArraysKt___ArraysKt.Dw(sum));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long[] Ic(long[] toLongArray) {
        f0.p(toLongArray, "$this$toLongArray");
        long[] jArrCopyOf = Arrays.copyOf(toLongArray, toLongArray.length);
        f0.o(jArrCopyOf, "copyOf(this, size)");
        return jArrCopyOf;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short J0(short[] component3) {
        f0.p(component3, "$this$component3");
        return y1.s(component3, 2);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int[] J1(int[] copyOfRange, int i10, int i11) {
        f0.p(copyOfRange, "$this$copyOfRange");
        return o1.g(m.K1(copyOfRange, i10, i11));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<x1> J2(short[] filterNot, l<? super x1, Boolean> predicate) {
        f0.p(filterNot, "$this$filterNot");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = y1.v(filterNot);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(filterNot, i10);
            if (!predicate.invoke(x1.b(s10)).booleanValue()) {
                arrayList.add(x1.b(s10));
            }
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R J3(short[] fold, R r10, p<? super R, ? super x1, ? extends R> operation) {
        f0.p(fold, "$this$fold");
        f0.p(operation, "operation");
        int iV = y1.v(fold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, x1.b(y1.s(fold, i10)));
        }
        return r10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <K> Map<K, List<x1>> J4(short[] groupBy, l<? super x1, ? extends K> keySelector) {
        f0.p(groupBy, "$this$groupBy");
        f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iV = y1.v(groupBy);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(groupBy, i10);
            K kInvoke = keySelector.invoke(x1.b(s10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(x1.b(s10));
        }
        return linkedHashMap;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, C extends Collection<? super R>> C J5(long[] mapIndexedTo, C destination, p<? super Integer, ? super r1, ? extends R> transform) {
        f0.p(mapIndexedTo, "$this$mapIndexedTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = s1.v(mapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            destination.add(transform.invoke(Integer.valueOf(i11), r1.b(s1.s(mapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "maxOrThrow-U")
    public static final short J6(@d short[] max) {
        f0.p(max, "$this$max");
        if (y1.y(max)) {
            throw new NoSuchElementException();
        }
        short s10 = y1.s(max, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(max)).iterator();
        while (it.hasNext()) {
            short s11 = y1.s(max, it.nextInt());
            if (f0.t(s10 & x1.f128661e, 65535 & s11) < 0) {
                s10 = s11;
            }
        }
        return s10;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final x1 J7(@d short[] minOrNull) {
        f0.p(minOrNull, "$this$minOrNull");
        if (y1.y(minOrNull)) {
            return null;
        }
        short s10 = y1.s(minOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(minOrNull)).iterator();
        while (it.hasNext()) {
            short s11 = y1.s(minOrNull, it.nextInt());
            if (f0.t(s10 & x1.f128661e, 65535 & s11) > 0) {
                s10 = s11;
            }
        }
        return x1.b(s10);
    }

    @u0(version = "1.4")
    @s
    @e
    @e2(markerClass = {q.class})
    public static final r1 J8(@d long[] randomOrNull, @d Random random) {
        f0.p(randomOrNull, "$this$randomOrNull");
        f0.p(random, "random");
        if (s1.y(randomOrNull)) {
            return null;
        }
        return r1.b(s1.s(randomOrNull, random.m(s1.v(randomOrNull))));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short[] J9(short[] reversedArray) {
        f0.p(reversedArray, "$this$reversedArray");
        return y1.g(ArraysKt___ArraysKt.Yr(reversedArray));
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<j1> Ja(@d byte[] slice, @d Iterable<Integer> indices) {
        f0.p(slice, "$this$slice");
        f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(j1.b(k1.s(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int Jb(short[] sum) {
        f0.p(sum, "$this$sum");
        int iH = n1.h(0);
        int iV = y1.v(sum);
        for (int i10 = 0; i10 < iV; i10++) {
            iH = n1.h(iH + n1.h(y1.s(sum, i10) & x1.f128661e));
        }
        return iH;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short[] Jc(short[] toShortArray) {
        f0.p(toShortArray, "$this$toShortArray");
        short[] sArrCopyOf = Arrays.copyOf(toShortArray, toShortArray.length);
        f0.o(sArrCopyOf, "copyOf(this, size)");
        return sArrCopyOf;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int K0(int[] component4) {
        f0.p(component4, "$this$component4");
        return o1.s(component4, 3);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int K1(byte[] count, l<? super j1, Boolean> predicate) {
        f0.p(count, "$this$count");
        f0.p(predicate, "predicate");
        int iV = k1.v(count);
        int i10 = 0;
        for (int i11 = 0; i11 < iV; i11++) {
            if (predicate.invoke(j1.b(k1.s(count, i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <C extends Collection<? super r1>> C K2(long[] filterNotTo, C destination, l<? super r1, Boolean> predicate) {
        f0.p(filterNotTo, "$this$filterNotTo");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int iV = s1.v(filterNotTo);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(filterNotTo, i10);
            if (!predicate.invoke(r1.b(jS)).booleanValue()) {
                destination.add(r1.b(jS));
            }
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R K3(byte[] foldIndexed, R r10, yh.q<? super Integer, ? super R, ? super j1, ? extends R> operation) {
        f0.p(foldIndexed, "$this$foldIndexed");
        f0.p(operation, "operation");
        int iV = k1.v(foldIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, j1.b(k1.s(foldIndexed, i10)));
            i10++;
            i11++;
        }
        return r10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <K, M extends Map<? super K, List<n1>>> M K4(int[] groupByTo, M destination, l<? super n1, ? extends K> keySelector) {
        f0.p(groupByTo, "$this$groupByTo");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        int iV = o1.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(groupByTo, i10);
            K kInvoke = keySelector.invoke(n1.b(iS));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(n1.b(iS));
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, C extends Collection<? super R>> C K5(long[] mapTo, C destination, l<? super r1, ? extends R> transform) {
        f0.p(mapTo, "$this$mapTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = s1.v(mapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            destination.add(transform.invoke(r1.b(s1.s(mapTo, i10))));
        }
        return destination;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final j1 K6(@d byte[] maxWithOrNull, @d Comparator<? super j1> comparator) {
        f0.p(maxWithOrNull, "$this$maxWithOrNull");
        f0.p(comparator, "comparator");
        if (k1.y(maxWithOrNull)) {
            return null;
        }
        byte bS = k1.s(maxWithOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            byte bS2 = k1.s(maxWithOrNull, it.nextInt());
            if (comparator.compare(j1.b(bS), j1.b(bS2)) < 0) {
                bS = bS2;
            }
        }
        return j1.b(bS);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "minOrThrow-U")
    public static final byte K7(@d byte[] min) {
        f0.p(min, "$this$min");
        if (k1.y(min)) {
            throw new NoSuchElementException();
        }
        byte bS = k1.s(min, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(min)).iterator();
        while (it.hasNext()) {
            byte bS2 = k1.s(min, it.nextInt());
            if (f0.t(bS & 255, bS2 & 255) > 0) {
                bS = bS2;
            }
        }
        return bS;
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final r1 K8(long[] randomOrNull) {
        f0.p(randomOrNull, "$this$randomOrNull");
        return J8(randomOrNull, Random.f125033b);
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R> List<R> K9(long[] runningFold, R r10, p<? super R, ? super r1, ? extends R> operation) {
        f0.p(runningFold, "$this$runningFold");
        f0.p(operation, "operation");
        if (s1.y(runningFold)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(s1.v(runningFold) + 1);
        arrayList.add(r10);
        int iV = s1.v(runningFold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, r1.b(s1.s(runningFold, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<x1> Ka(@d short[] slice, @d fi.l indices) {
        f0.p(slice, "$this$slice");
        f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : b.d(y1.g(m.N1(slice, indices.D().intValue(), indices.e().intValue() + 1)));
    }

    @u0(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @s
    @kotlin.l(warningSince = s0.f136928s)
    @f
    private static final int Kb(byte[] sumBy, l<? super j1, n1> selector) {
        f0.p(sumBy, "$this$sumBy");
        f0.p(selector, "selector");
        int iV = k1.v(sumBy);
        int iH = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iH = n1.h(iH + selector.invoke(j1.b(k1.s(sumBy, i10))).q0());
        }
        return iH;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final n1[] Kc(@d int[] toTypedArray) {
        f0.p(toTypedArray, "$this$toTypedArray");
        int iV = o1.v(toTypedArray);
        n1[] n1VarArr = new n1[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            n1VarArr[i10] = n1.b(o1.s(toTypedArray, i10));
        }
        return n1VarArr;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte L0(byte[] component4) {
        f0.p(component4, "$this$component4");
        return k1.s(component4, 3);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int L1(long[] count, l<? super r1, Boolean> predicate) {
        f0.p(count, "$this$count");
        f0.p(predicate, "predicate");
        int iV = s1.v(count);
        int i10 = 0;
        for (int i11 = 0; i11 < iV; i11++) {
            if (predicate.invoke(r1.b(s1.s(count, i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <C extends Collection<? super x1>> C L2(short[] filterNotTo, C destination, l<? super x1, Boolean> predicate) {
        f0.p(filterNotTo, "$this$filterNotTo");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int iV = y1.v(filterNotTo);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(filterNotTo, i10);
            if (!predicate.invoke(x1.b(s10)).booleanValue()) {
                destination.add(x1.b(s10));
            }
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R L3(short[] foldIndexed, R r10, yh.q<? super Integer, ? super R, ? super x1, ? extends R> operation) {
        f0.p(foldIndexed, "$this$foldIndexed");
        f0.p(operation, "operation");
        int iV = y1.v(foldIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, x1.b(y1.s(foldIndexed, i10)));
            i10++;
            i11++;
        }
        return r10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <K, M extends Map<? super K, List<j1>>> M L4(byte[] groupByTo, M destination, l<? super j1, ? extends K> keySelector) {
        f0.p(groupByTo, "$this$groupByTo");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        int iV = k1.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(groupByTo, i10);
            K kInvoke = keySelector.invoke(j1.b(bS));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(j1.b(bS));
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, C extends Collection<? super R>> C L5(short[] mapTo, C destination, l<? super x1, ? extends R> transform) {
        f0.p(mapTo, "$this$mapTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = y1.v(mapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            destination.add(transform.invoke(x1.b(y1.s(mapTo, i10))));
        }
        return destination;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final n1 L6(@d int[] maxWithOrNull, @d Comparator<? super n1> comparator) {
        f0.p(maxWithOrNull, "$this$maxWithOrNull");
        f0.p(comparator, "comparator");
        if (o1.y(maxWithOrNull)) {
            return null;
        }
        int iS = o1.s(maxWithOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            int iS2 = o1.s(maxWithOrNull, it.nextInt());
            if (comparator.compare(n1.b(iS), n1.b(iS2)) < 0) {
                iS = iS2;
            }
        }
        return n1.b(iS);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "minOrThrow-U")
    public static final int L7(@d int[] min) {
        f0.p(min, "$this$min");
        if (o1.y(min)) {
            throw new NoSuchElementException();
        }
        int iS = o1.s(min, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(min)).iterator();
        while (it.hasNext()) {
            int iS2 = o1.s(min, it.nextInt());
            if (Integer.compare(iS ^ Integer.MIN_VALUE, iS2 ^ Integer.MIN_VALUE) > 0) {
                iS = iS2;
            }
        }
        return iS;
    }

    @u0(version = "1.4")
    @s
    @e
    @e2(markerClass = {q.class})
    public static final j1 L8(@d byte[] randomOrNull, @d Random random) {
        f0.p(randomOrNull, "$this$randomOrNull");
        f0.p(random, "random");
        if (k1.y(randomOrNull)) {
            return null;
        }
        return j1.b(k1.s(randomOrNull, random.m(k1.v(randomOrNull))));
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R> List<R> L9(byte[] runningFold, R r10, p<? super R, ? super j1, ? extends R> operation) {
        f0.p(runningFold, "$this$runningFold");
        f0.p(operation, "operation");
        if (k1.y(runningFold)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(k1.v(runningFold) + 1);
        arrayList.add(r10);
        int iV = k1.v(runningFold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, j1.b(k1.s(runningFold, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<r1> La(@d long[] slice, @d fi.l indices) {
        f0.p(slice, "$this$slice");
        f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : b.c(s1.g(m.L1(slice, indices.D().intValue(), indices.e().intValue() + 1)));
    }

    @u0(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @s
    @kotlin.l(warningSince = s0.f136928s)
    @f
    private static final int Lb(long[] sumBy, l<? super r1, n1> selector) {
        f0.p(sumBy, "$this$sumBy");
        f0.p(selector, "selector");
        int iV = s1.v(sumBy);
        int iH = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iH = n1.h(iH + selector.invoke(r1.b(s1.s(sumBy, i10))).q0());
        }
        return iH;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final j1[] Lc(@d byte[] toTypedArray) {
        f0.p(toTypedArray, "$this$toTypedArray");
        int iV = k1.v(toTypedArray);
        j1[] j1VarArr = new j1[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            j1VarArr[i10] = j1.b(k1.s(toTypedArray, i10));
        }
        return j1VarArr;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long M0(long[] component4) {
        f0.p(component4, "$this$component4");
        return s1.s(component4, 3);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int M1(int[] count, l<? super n1, Boolean> predicate) {
        f0.p(count, "$this$count");
        f0.p(predicate, "predicate");
        int iV = o1.v(count);
        int i10 = 0;
        for (int i11 = 0; i11 < iV; i11++) {
            if (predicate.invoke(n1.b(o1.s(count, i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <C extends Collection<? super n1>> C M2(int[] filterNotTo, C destination, l<? super n1, Boolean> predicate) {
        f0.p(filterNotTo, "$this$filterNotTo");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int iV = o1.v(filterNotTo);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(filterNotTo, i10);
            if (!predicate.invoke(n1.b(iS)).booleanValue()) {
                destination.add(n1.b(iS));
            }
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R M3(long[] foldIndexed, R r10, yh.q<? super Integer, ? super R, ? super r1, ? extends R> operation) {
        f0.p(foldIndexed, "$this$foldIndexed");
        f0.p(operation, "operation");
        int iV = s1.v(foldIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, r1.b(s1.s(foldIndexed, i10)));
            i10++;
            i11++;
        }
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @s
    @f
    private static final <K, V, M extends Map<? super K, List<V>>> M M4(int[] groupByTo, M destination, l<? super n1, ? extends K> keySelector, l<? super n1, ? extends V> valueTransform) {
        f0.p(groupByTo, "$this$groupByTo");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        int iV = o1.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(groupByTo, i10);
            K kInvoke = keySelector.invoke(n1.b(iS));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(n1.b(iS)));
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, C extends Collection<? super R>> C M5(int[] mapTo, C destination, l<? super n1, ? extends R> transform) {
        f0.p(mapTo, "$this$mapTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = o1.v(mapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            destination.add(transform.invoke(n1.b(o1.s(mapTo, i10))));
        }
        return destination;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final x1 M6(@d short[] maxWithOrNull, @d Comparator<? super x1> comparator) {
        f0.p(maxWithOrNull, "$this$maxWithOrNull");
        f0.p(comparator, "comparator");
        if (y1.y(maxWithOrNull)) {
            return null;
        }
        short s10 = y1.s(maxWithOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            short s11 = y1.s(maxWithOrNull, it.nextInt());
            if (comparator.compare(x1.b(s10), x1.b(s11)) < 0) {
                s10 = s11;
            }
        }
        return x1.b(s10);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "minOrThrow-U")
    public static final long M7(@d long[] min) {
        f0.p(min, "$this$min");
        if (s1.y(min)) {
            throw new NoSuchElementException();
        }
        long jS = s1.s(min, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(min)).iterator();
        while (it.hasNext()) {
            long jS2 = s1.s(min, it.nextInt());
            if (Long.compare(jS ^ Long.MIN_VALUE, jS2 ^ Long.MIN_VALUE) > 0) {
                jS = jS2;
            }
        }
        return jS;
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final x1 M8(short[] randomOrNull) {
        f0.p(randomOrNull, "$this$randomOrNull");
        return N8(randomOrNull, Random.f125033b);
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R> List<R> M9(int[] runningFold, R r10, p<? super R, ? super n1, ? extends R> operation) {
        f0.p(runningFold, "$this$runningFold");
        f0.p(operation, "operation");
        if (o1.y(runningFold)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(o1.v(runningFold) + 1);
        arrayList.add(r10);
        int iV = o1.v(runningFold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, n1.b(o1.s(runningFold, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<j1> Ma(@d byte[] slice, @d fi.l indices) {
        f0.p(slice, "$this$slice");
        f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : b.b(k1.g(m.G1(slice, indices.D().intValue(), indices.e().intValue() + 1)));
    }

    @u0(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @s
    @kotlin.l(warningSince = s0.f136928s)
    @f
    private static final int Mb(int[] sumBy, l<? super n1, n1> selector) {
        f0.p(sumBy, "$this$sumBy");
        f0.p(selector, "selector");
        int iV = o1.v(sumBy);
        int iH = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iH = n1.h(iH + selector.invoke(n1.b(o1.s(sumBy, i10))).q0());
        }
        return iH;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final r1[] Mc(@d long[] toTypedArray) {
        f0.p(toTypedArray, "$this$toTypedArray");
        int iV = s1.v(toTypedArray);
        r1[] r1VarArr = new r1[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            r1VarArr[i10] = r1.b(s1.s(toTypedArray, i10));
        }
        return r1VarArr;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short N0(short[] component4) {
        f0.p(component4, "$this$component4");
        return y1.s(component4, 3);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int N1(short[] count, l<? super x1, Boolean> predicate) {
        f0.p(count, "$this$count");
        f0.p(predicate, "predicate");
        int iV = y1.v(count);
        int i10 = 0;
        for (int i11 = 0; i11 < iV; i11++) {
            if (predicate.invoke(x1.b(y1.s(count, i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <C extends Collection<? super j1>> C N2(byte[] filterNotTo, C destination, l<? super j1, Boolean> predicate) {
        f0.p(filterNotTo, "$this$filterNotTo");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int iV = k1.v(filterNotTo);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(filterNotTo, i10);
            if (!predicate.invoke(j1.b(bS)).booleanValue()) {
                destination.add(j1.b(bS));
            }
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R N3(int[] foldIndexed, R r10, yh.q<? super Integer, ? super R, ? super n1, ? extends R> operation) {
        f0.p(foldIndexed, "$this$foldIndexed");
        f0.p(operation, "operation");
        int iV = o1.v(foldIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, n1.b(o1.s(foldIndexed, i10)));
            i10++;
            i11++;
        }
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @s
    @f
    private static final <K, V, M extends Map<? super K, List<V>>> M N4(long[] groupByTo, M destination, l<? super r1, ? extends K> keySelector, l<? super r1, ? extends V> valueTransform) {
        f0.p(groupByTo, "$this$groupByTo");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        int iV = s1.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(groupByTo, i10);
            K kInvoke = keySelector.invoke(r1.b(jS));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(r1.b(jS)));
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, C extends Collection<? super R>> C N5(byte[] mapTo, C destination, l<? super j1, ? extends R> transform) {
        f0.p(mapTo, "$this$mapTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = k1.v(mapTo);
        for (int i10 = 0; i10 < iV; i10++) {
            destination.add(transform.invoke(j1.b(k1.s(mapTo, i10))));
        }
        return destination;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final r1 N6(@d long[] maxWithOrNull, @d Comparator<? super r1> comparator) {
        f0.p(maxWithOrNull, "$this$maxWithOrNull");
        f0.p(comparator, "comparator");
        if (s1.y(maxWithOrNull)) {
            return null;
        }
        long jS = s1.s(maxWithOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            long jS2 = s1.s(maxWithOrNull, it.nextInt());
            if (comparator.compare(r1.b(jS), r1.b(jS2)) < 0) {
                jS = jS2;
            }
        }
        return r1.b(jS);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "minOrThrow-U")
    public static final short N7(@d short[] min) {
        f0.p(min, "$this$min");
        if (y1.y(min)) {
            throw new NoSuchElementException();
        }
        short s10 = y1.s(min, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(min)).iterator();
        while (it.hasNext()) {
            short s11 = y1.s(min, it.nextInt());
            if (f0.t(s10 & x1.f128661e, 65535 & s11) > 0) {
                s10 = s11;
            }
        }
        return s10;
    }

    @u0(version = "1.4")
    @s
    @e
    @e2(markerClass = {q.class})
    public static final x1 N8(@d short[] randomOrNull, @d Random random) {
        f0.p(randomOrNull, "$this$randomOrNull");
        f0.p(random, "random");
        if (y1.y(randomOrNull)) {
            return null;
        }
        return x1.b(y1.s(randomOrNull, random.m(y1.v(randomOrNull))));
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R> List<R> N9(short[] runningFold, R r10, p<? super R, ? super x1, ? extends R> operation) {
        f0.p(runningFold, "$this$runningFold");
        f0.p(operation, "operation");
        if (y1.y(runningFold)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(y1.v(runningFold) + 1);
        arrayList.add(r10);
        int iV = y1.v(runningFold);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, x1.b(y1.s(runningFold, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<n1> Na(@d int[] slice, @d fi.l indices) {
        f0.p(slice, "$this$slice");
        f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : b.a(o1.g(m.K1(slice, indices.D().intValue(), indices.e().intValue() + 1)));
    }

    @u0(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @s
    @kotlin.l(warningSince = s0.f136928s)
    @f
    private static final int Nb(short[] sumBy, l<? super x1, n1> selector) {
        f0.p(sumBy, "$this$sumBy");
        f0.p(selector, "selector");
        int iV = y1.v(sumBy);
        int iH = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iH = n1.h(iH + selector.invoke(x1.b(y1.s(sumBy, i10))).q0());
        }
        return iH;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final x1[] Nc(@d short[] toTypedArray) {
        f0.p(toTypedArray, "$this$toTypedArray");
        int iV = y1.v(toTypedArray);
        x1[] x1VarArr = new x1[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            x1VarArr[i10] = x1.b(y1.s(toTypedArray, i10));
        }
        return x1VarArr;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int O0(int[] component5) {
        f0.p(component5, "$this$component5");
        return o1.s(component5, 4);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<j1> O1(@d byte[] drop, int i10) {
        f0.p(drop, "$this$drop");
        if (i10 >= 0) {
            return uc(drop, u.u(k1.v(drop) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <C extends Collection<? super r1>> C O2(long[] filterTo, C destination, l<? super r1, Boolean> predicate) {
        f0.p(filterTo, "$this$filterTo");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int iV = s1.v(filterTo);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(filterTo, i10);
            if (predicate.invoke(r1.b(jS)).booleanValue()) {
                destination.add(r1.b(jS));
            }
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R O3(long[] foldRight, R r10, p<? super r1, ? super R, ? extends R> operation) {
        f0.p(foldRight, "$this$foldRight");
        f0.p(operation, "operation");
        for (int iWe = ArraysKt___ArraysKt.We(foldRight); iWe >= 0; iWe--) {
            r10 = operation.invoke(r1.b(s1.s(foldRight, iWe)), r10);
        }
        return r10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <K, M extends Map<? super K, List<r1>>> M O4(long[] groupByTo, M destination, l<? super r1, ? extends K> keySelector) {
        f0.p(groupByTo, "$this$groupByTo");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        int iV = s1.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(groupByTo, i10);
            K kInvoke = keySelector.invoke(r1.b(jS));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(r1.b(jS));
        }
        return destination;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R extends Comparable<? super R>> j1 O5(byte[] maxByOrNull, l<? super j1, ? extends R> selector) {
        f0.p(maxByOrNull, "$this$maxByOrNull");
        f0.p(selector, "selector");
        if (k1.y(maxByOrNull)) {
            return null;
        }
        byte bS = k1.s(maxByOrNull, 0);
        int iRe = ArraysKt___ArraysKt.Re(maxByOrNull);
        if (iRe == 0) {
            return j1.b(bS);
        }
        R rInvoke = selector.invoke(j1.b(bS));
        k0 it = new fi.l(1, iRe).iterator();
        while (it.hasNext()) {
            byte bS2 = k1.s(maxByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(j1.b(bS2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                bS = bS2;
                rInvoke = rInvoke2;
            }
        }
        return j1.b(bS);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "maxWithOrThrow-U")
    public static final byte O6(@d byte[] maxWith, @d Comparator<? super j1> comparator) {
        f0.p(maxWith, "$this$maxWith");
        f0.p(comparator, "comparator");
        if (k1.y(maxWith)) {
            throw new NoSuchElementException();
        }
        byte bS = k1.s(maxWith, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(maxWith)).iterator();
        while (it.hasNext()) {
            byte bS2 = k1.s(maxWith, it.nextInt());
            if (comparator.compare(j1.b(bS), j1.b(bS2)) < 0) {
                bS = bS2;
            }
        }
        return bS;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final j1 O7(@d byte[] minWithOrNull, @d Comparator<? super j1> comparator) {
        f0.p(minWithOrNull, "$this$minWithOrNull");
        f0.p(comparator, "comparator");
        if (k1.y(minWithOrNull)) {
            return null;
        }
        byte bS = k1.s(minWithOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(minWithOrNull)).iterator();
        while (it.hasNext()) {
            byte bS2 = k1.s(minWithOrNull, it.nextInt());
            if (comparator.compare(j1.b(bS), j1.b(bS2)) > 0) {
                bS = bS2;
            }
        }
        return j1.b(bS);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte O8(byte[] reduce, p<? super j1, ? super j1, j1> operation) {
        f0.p(reduce, "$this$reduce");
        f0.p(operation, "operation");
        if (k1.y(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bS = k1.s(reduce, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(reduce)).iterator();
        while (it.hasNext()) {
            bS = operation.invoke(j1.b(bS), j1.b(k1.s(reduce, it.nextInt()))).o0();
        }
        return bS;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R> List<R> O9(byte[] runningFoldIndexed, R r10, yh.q<? super Integer, ? super R, ? super j1, ? extends R> operation) {
        f0.p(runningFoldIndexed, "$this$runningFoldIndexed");
        f0.p(operation, "operation");
        if (k1.y(runningFoldIndexed)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(k1.v(runningFoldIndexed) + 1);
        arrayList.add(r10);
        int iV = k1.v(runningFoldIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, j1.b(k1.s(runningFoldIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final int[] Oa(@d int[] sliceArray, @d Collection<Integer> indices) {
        f0.p(sliceArray, "$this$sliceArray");
        f0.p(indices, "indices");
        return o1.g(ArraysKt___ArraysKt.Gu(sliceArray, indices));
    }

    @u0(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @s
    @kotlin.l(warningSince = s0.f136928s)
    @f
    private static final double Ob(byte[] sumByDouble, l<? super j1, Double> selector) {
        f0.p(sumByDouble, "$this$sumByDouble");
        f0.p(selector, "selector");
        int iV = k1.v(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(j1.b(k1.s(sumByDouble, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte[] Oc(byte[] bArr) {
        f0.p(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        f0.o(bArrCopyOf, "copyOf(this, size)");
        return k1.g(bArrCopyOf);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte P0(byte[] component5) {
        f0.p(component5, "$this$component5");
        return k1.s(component5, 4);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<x1> P1(@d short[] drop, int i10) {
        f0.p(drop, "$this$drop");
        if (i10 >= 0) {
            return vc(drop, u.u(y1.v(drop) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <C extends Collection<? super x1>> C P2(short[] filterTo, C destination, l<? super x1, Boolean> predicate) {
        f0.p(filterTo, "$this$filterTo");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int iV = y1.v(filterTo);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(filterTo, i10);
            if (predicate.invoke(x1.b(s10)).booleanValue()) {
                destination.add(x1.b(s10));
            }
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R P3(byte[] foldRight, R r10, p<? super j1, ? super R, ? extends R> operation) {
        f0.p(foldRight, "$this$foldRight");
        f0.p(operation, "operation");
        for (int iRe = ArraysKt___ArraysKt.Re(foldRight); iRe >= 0; iRe--) {
            r10 = operation.invoke(j1.b(k1.s(foldRight, iRe)), r10);
        }
        return r10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <K, M extends Map<? super K, List<x1>>> M P4(short[] groupByTo, M destination, l<? super x1, ? extends K> keySelector) {
        f0.p(groupByTo, "$this$groupByTo");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        int iV = y1.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(groupByTo, i10);
            K kInvoke = keySelector.invoke(x1.b(s10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(x1.b(s10));
        }
        return destination;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R extends Comparable<? super R>> r1 P5(long[] maxByOrNull, l<? super r1, ? extends R> selector) {
        f0.p(maxByOrNull, "$this$maxByOrNull");
        f0.p(selector, "selector");
        if (s1.y(maxByOrNull)) {
            return null;
        }
        long jS = s1.s(maxByOrNull, 0);
        int iWe = ArraysKt___ArraysKt.We(maxByOrNull);
        if (iWe == 0) {
            return r1.b(jS);
        }
        R rInvoke = selector.invoke(r1.b(jS));
        k0 it = new fi.l(1, iWe).iterator();
        while (it.hasNext()) {
            long jS2 = s1.s(maxByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(r1.b(jS2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                jS = jS2;
                rInvoke = rInvoke2;
            }
        }
        return r1.b(jS);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "maxWithOrThrow-U")
    public static final int P6(@d int[] maxWith, @d Comparator<? super n1> comparator) {
        f0.p(maxWith, "$this$maxWith");
        f0.p(comparator, "comparator");
        if (o1.y(maxWith)) {
            throw new NoSuchElementException();
        }
        int iS = o1.s(maxWith, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(maxWith)).iterator();
        while (it.hasNext()) {
            int iS2 = o1.s(maxWith, it.nextInt());
            if (comparator.compare(n1.b(iS), n1.b(iS2)) < 0) {
                iS = iS2;
            }
        }
        return iS;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final n1 P7(@d int[] minWithOrNull, @d Comparator<? super n1> comparator) {
        f0.p(minWithOrNull, "$this$minWithOrNull");
        f0.p(comparator, "comparator");
        if (o1.y(minWithOrNull)) {
            return null;
        }
        int iS = o1.s(minWithOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(minWithOrNull)).iterator();
        while (it.hasNext()) {
            int iS2 = o1.s(minWithOrNull, it.nextInt());
            if (comparator.compare(n1.b(iS), n1.b(iS2)) > 0) {
                iS = iS2;
            }
        }
        return n1.b(iS);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int P8(int[] reduce, p<? super n1, ? super n1, n1> operation) {
        f0.p(reduce, "$this$reduce");
        f0.p(operation, "operation");
        if (o1.y(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iS = o1.s(reduce, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(reduce)).iterator();
        while (it.hasNext()) {
            iS = operation.invoke(n1.b(iS), n1.b(o1.s(reduce, it.nextInt()))).q0();
        }
        return iS;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R> List<R> P9(short[] runningFoldIndexed, R r10, yh.q<? super Integer, ? super R, ? super x1, ? extends R> operation) {
        f0.p(runningFoldIndexed, "$this$runningFoldIndexed");
        f0.p(operation, "operation");
        if (y1.y(runningFoldIndexed)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(y1.v(runningFoldIndexed) + 1);
        arrayList.add(r10);
        int iV = y1.v(runningFoldIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, x1.b(y1.s(runningFoldIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final short[] Pa(@d short[] sliceArray, @d fi.l indices) {
        f0.p(sliceArray, "$this$sliceArray");
        f0.p(indices, "indices");
        return y1.g(ArraysKt___ArraysKt.Lu(sliceArray, indices));
    }

    @u0(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @s
    @kotlin.l(warningSince = s0.f136928s)
    @f
    private static final double Pb(long[] sumByDouble, l<? super r1, Double> selector) {
        f0.p(sumByDouble, "$this$sumByDouble");
        f0.p(selector, "selector");
        int iV = s1.v(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(r1.b(s1.s(sumByDouble, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final byte[] Pc(@d j1[] j1VarArr) {
        f0.p(j1VarArr, "<this>");
        int length = j1VarArr.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = j1VarArr[i10].o0();
        }
        return k1.g(bArr);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long Q0(long[] component5) {
        f0.p(component5, "$this$component5");
        return s1.s(component5, 4);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<n1> Q1(@d int[] drop, int i10) {
        f0.p(drop, "$this$drop");
        if (i10 >= 0) {
            return wc(drop, u.u(o1.v(drop) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <C extends Collection<? super n1>> C Q2(int[] filterTo, C destination, l<? super n1, Boolean> predicate) {
        f0.p(filterTo, "$this$filterTo");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int iV = o1.v(filterTo);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(filterTo, i10);
            if (predicate.invoke(n1.b(iS)).booleanValue()) {
                destination.add(n1.b(iS));
            }
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R Q3(int[] foldRight, R r10, p<? super n1, ? super R, ? extends R> operation) {
        f0.p(foldRight, "$this$foldRight");
        f0.p(operation, "operation");
        for (int iVe = ArraysKt___ArraysKt.Ve(foldRight); iVe >= 0; iVe--) {
            r10 = operation.invoke(n1.b(o1.s(foldRight, iVe)), r10);
        }
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @s
    @f
    private static final <K, V, M extends Map<? super K, List<V>>> M Q4(short[] groupByTo, M destination, l<? super x1, ? extends K> keySelector, l<? super x1, ? extends V> valueTransform) {
        f0.p(groupByTo, "$this$groupByTo");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        int iV = y1.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(groupByTo, i10);
            K kInvoke = keySelector.invoke(x1.b(s10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(x1.b(s10)));
        }
        return destination;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R extends Comparable<? super R>> n1 Q5(int[] maxByOrNull, l<? super n1, ? extends R> selector) {
        f0.p(maxByOrNull, "$this$maxByOrNull");
        f0.p(selector, "selector");
        if (o1.y(maxByOrNull)) {
            return null;
        }
        int iS = o1.s(maxByOrNull, 0);
        int iVe = ArraysKt___ArraysKt.Ve(maxByOrNull);
        if (iVe == 0) {
            return n1.b(iS);
        }
        R rInvoke = selector.invoke(n1.b(iS));
        k0 it = new fi.l(1, iVe).iterator();
        while (it.hasNext()) {
            int iS2 = o1.s(maxByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(n1.b(iS2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                iS = iS2;
                rInvoke = rInvoke2;
            }
        }
        return n1.b(iS);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "maxWithOrThrow-U")
    public static final long Q6(@d long[] maxWith, @d Comparator<? super r1> comparator) {
        f0.p(maxWith, "$this$maxWith");
        f0.p(comparator, "comparator");
        if (s1.y(maxWith)) {
            throw new NoSuchElementException();
        }
        long jS = s1.s(maxWith, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(maxWith)).iterator();
        while (it.hasNext()) {
            long jS2 = s1.s(maxWith, it.nextInt());
            if (comparator.compare(r1.b(jS), r1.b(jS2)) < 0) {
                jS = jS2;
            }
        }
        return jS;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final x1 Q7(@d short[] minWithOrNull, @d Comparator<? super x1> comparator) {
        f0.p(minWithOrNull, "$this$minWithOrNull");
        f0.p(comparator, "comparator");
        if (y1.y(minWithOrNull)) {
            return null;
        }
        short s10 = y1.s(minWithOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(minWithOrNull)).iterator();
        while (it.hasNext()) {
            short s11 = y1.s(minWithOrNull, it.nextInt());
            if (comparator.compare(x1.b(s10), x1.b(s11)) > 0) {
                s10 = s11;
            }
        }
        return x1.b(s10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long Q8(long[] reduce, p<? super r1, ? super r1, r1> operation) {
        f0.p(reduce, "$this$reduce");
        f0.p(operation, "operation");
        if (s1.y(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jS = s1.s(reduce, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(reduce)).iterator();
        while (it.hasNext()) {
            jS = operation.invoke(r1.b(jS), r1.b(s1.s(reduce, it.nextInt()))).q0();
        }
        return jS;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R> List<R> Q9(long[] runningFoldIndexed, R r10, yh.q<? super Integer, ? super R, ? super r1, ? extends R> operation) {
        f0.p(runningFoldIndexed, "$this$runningFoldIndexed");
        f0.p(operation, "operation");
        if (s1.y(runningFoldIndexed)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(s1.v(runningFoldIndexed) + 1);
        arrayList.add(r10);
        int iV = s1.v(runningFoldIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, r1.b(s1.s(runningFoldIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final long[] Qa(@d long[] sliceArray, @d fi.l indices) {
        f0.p(sliceArray, "$this$sliceArray");
        f0.p(indices, "indices");
        return s1.g(ArraysKt___ArraysKt.Hu(sliceArray, indices));
    }

    @u0(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @s
    @kotlin.l(warningSince = s0.f136928s)
    @f
    private static final double Qb(int[] sumByDouble, l<? super n1, Double> selector) {
        f0.p(sumByDouble, "$this$sumByDouble");
        f0.p(selector, "selector");
        int iV = o1.v(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(n1.b(o1.s(sumByDouble, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int[] Qc(int[] iArr) {
        f0.p(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        f0.o(iArrCopyOf, "copyOf(this, size)");
        return o1.g(iArrCopyOf);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short R0(short[] component5) {
        f0.p(component5, "$this$component5");
        return y1.s(component5, 4);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<r1> R1(@d long[] drop, int i10) {
        f0.p(drop, "$this$drop");
        if (i10 >= 0) {
            return xc(drop, u.u(s1.v(drop) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <C extends Collection<? super j1>> C R2(byte[] filterTo, C destination, l<? super j1, Boolean> predicate) {
        f0.p(filterTo, "$this$filterTo");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int iV = k1.v(filterTo);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(filterTo, i10);
            if (predicate.invoke(j1.b(bS)).booleanValue()) {
                destination.add(j1.b(bS));
            }
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R R3(short[] foldRight, R r10, p<? super x1, ? super R, ? extends R> operation) {
        f0.p(foldRight, "$this$foldRight");
        f0.p(operation, "operation");
        for (int iYe = ArraysKt___ArraysKt.Ye(foldRight); iYe >= 0; iYe--) {
            r10 = operation.invoke(x1.b(y1.s(foldRight, iYe)), r10);
        }
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @s
    @f
    private static final <K, V, M extends Map<? super K, List<V>>> M R4(byte[] groupByTo, M destination, l<? super j1, ? extends K> keySelector, l<? super j1, ? extends V> valueTransform) {
        f0.p(groupByTo, "$this$groupByTo");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        int iV = k1.v(groupByTo);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(groupByTo, i10);
            K kInvoke = keySelector.invoke(j1.b(bS));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(j1.b(bS)));
        }
        return destination;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R extends Comparable<? super R>> x1 R5(short[] maxByOrNull, l<? super x1, ? extends R> selector) {
        f0.p(maxByOrNull, "$this$maxByOrNull");
        f0.p(selector, "selector");
        if (y1.y(maxByOrNull)) {
            return null;
        }
        short s10 = y1.s(maxByOrNull, 0);
        int iYe = ArraysKt___ArraysKt.Ye(maxByOrNull);
        if (iYe == 0) {
            return x1.b(s10);
        }
        R rInvoke = selector.invoke(x1.b(s10));
        k0 it = new fi.l(1, iYe).iterator();
        while (it.hasNext()) {
            short s11 = y1.s(maxByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(x1.b(s11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                s10 = s11;
                rInvoke = rInvoke2;
            }
        }
        return x1.b(s10);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "maxWithOrThrow-U")
    public static final short R6(@d short[] maxWith, @d Comparator<? super x1> comparator) {
        f0.p(maxWith, "$this$maxWith");
        f0.p(comparator, "comparator");
        if (y1.y(maxWith)) {
            throw new NoSuchElementException();
        }
        short s10 = y1.s(maxWith, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(maxWith)).iterator();
        while (it.hasNext()) {
            short s11 = y1.s(maxWith, it.nextInt());
            if (comparator.compare(x1.b(s10), x1.b(s11)) < 0) {
                s10 = s11;
            }
        }
        return s10;
    }

    @u0(version = "1.4")
    @s
    @e
    public static final r1 R7(@d long[] minWithOrNull, @d Comparator<? super r1> comparator) {
        f0.p(minWithOrNull, "$this$minWithOrNull");
        f0.p(comparator, "comparator");
        if (s1.y(minWithOrNull)) {
            return null;
        }
        long jS = s1.s(minWithOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(minWithOrNull)).iterator();
        while (it.hasNext()) {
            long jS2 = s1.s(minWithOrNull, it.nextInt());
            if (comparator.compare(r1.b(jS), r1.b(jS2)) > 0) {
                jS = jS2;
            }
        }
        return r1.b(jS);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short R8(short[] reduce, p<? super x1, ? super x1, x1> operation) {
        f0.p(reduce, "$this$reduce");
        f0.p(operation, "operation");
        if (y1.y(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s10 = y1.s(reduce, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(reduce)).iterator();
        while (it.hasNext()) {
            s10 = operation.invoke(x1.b(s10), x1.b(y1.s(reduce, it.nextInt()))).o0();
        }
        return s10;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R> List<R> R9(int[] runningFoldIndexed, R r10, yh.q<? super Integer, ? super R, ? super n1, ? extends R> operation) {
        f0.p(runningFoldIndexed, "$this$runningFoldIndexed");
        f0.p(operation, "operation");
        if (o1.y(runningFoldIndexed)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(o1.v(runningFoldIndexed) + 1);
        arrayList.add(r10);
        int iV = o1.v(runningFoldIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, n1.b(o1.s(runningFoldIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final byte[] Ra(@d byte[] sliceArray, @d fi.l indices) {
        f0.p(sliceArray, "$this$sliceArray");
        f0.p(indices, "indices");
        return k1.g(ArraysKt___ArraysKt.xu(sliceArray, indices));
    }

    @u0(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @s
    @kotlin.l(warningSince = s0.f136928s)
    @f
    private static final double Rb(short[] sumByDouble, l<? super x1, Double> selector) {
        f0.p(sumByDouble, "$this$sumByDouble");
        f0.p(selector, "selector");
        int iV = y1.v(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(x1.b(y1.s(sumByDouble, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final int[] Rc(@d n1[] n1VarArr) {
        f0.p(n1VarArr, "<this>");
        int length = n1VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = n1VarArr[i10].q0();
        }
        return o1.g(iArr);
    }

    @u0(version = "1.4")
    @s
    public static final boolean S0(@e short[] sArr, @e short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<j1> S1(@d byte[] dropLast, int i10) {
        f0.p(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return qc(dropLast, u.u(k1.v(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @u0(version = "1.3")
    @s
    @f
    private static final j1 S2(byte[] find, l<? super j1, Boolean> predicate) {
        f0.p(find, "$this$find");
        f0.p(predicate, "predicate");
        int iV = k1.v(find);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(find, i10);
            if (predicate.invoke(j1.b(bS)).booleanValue()) {
                return j1.b(bS);
            }
        }
        return null;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R S3(byte[] foldRightIndexed, R r10, yh.q<? super Integer, ? super j1, ? super R, ? extends R> operation) {
        f0.p(foldRightIndexed, "$this$foldRightIndexed");
        f0.p(operation, "operation");
        for (int iRe = ArraysKt___ArraysKt.Re(foldRightIndexed); iRe >= 0; iRe--) {
            r10 = operation.invoke(Integer.valueOf(iRe), j1.b(k1.s(foldRightIndexed, iRe)), r10);
        }
        return r10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int S4(long[] indexOf, long j10) {
        f0.p(indexOf, "$this$indexOf");
        return ArraysKt___ArraysKt.ig(indexOf, j10);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "maxByOrThrow-U")
    @f
    private static final <R extends Comparable<? super R>> byte S5(byte[] maxBy, l<? super j1, ? extends R> selector) {
        f0.p(maxBy, "$this$maxBy");
        f0.p(selector, "selector");
        if (k1.y(maxBy)) {
            throw new NoSuchElementException();
        }
        byte bS = k1.s(maxBy, 0);
        int iRe = ArraysKt___ArraysKt.Re(maxBy);
        if (iRe == 0) {
            return bS;
        }
        R rInvoke = selector.invoke(j1.b(bS));
        k0 it = new fi.l(1, iRe).iterator();
        while (it.hasNext()) {
            byte bS2 = k1.s(maxBy, it.nextInt());
            R rInvoke2 = selector.invoke(j1.b(bS2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                bS = bS2;
                rInvoke = rInvoke2;
            }
        }
        return bS;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R extends Comparable<? super R>> j1 S6(byte[] minByOrNull, l<? super j1, ? extends R> selector) {
        f0.p(minByOrNull, "$this$minByOrNull");
        f0.p(selector, "selector");
        if (k1.y(minByOrNull)) {
            return null;
        }
        byte bS = k1.s(minByOrNull, 0);
        int iRe = ArraysKt___ArraysKt.Re(minByOrNull);
        if (iRe == 0) {
            return j1.b(bS);
        }
        R rInvoke = selector.invoke(j1.b(bS));
        k0 it = new fi.l(1, iRe).iterator();
        while (it.hasNext()) {
            byte bS2 = k1.s(minByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(j1.b(bS2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                bS = bS2;
                rInvoke = rInvoke2;
            }
        }
        return j1.b(bS);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "minWithOrThrow-U")
    public static final byte S7(@d byte[] minWith, @d Comparator<? super j1> comparator) {
        f0.p(minWith, "$this$minWith");
        f0.p(comparator, "comparator");
        if (k1.y(minWith)) {
            throw new NoSuchElementException();
        }
        byte bS = k1.s(minWith, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(minWith)).iterator();
        while (it.hasNext()) {
            byte bS2 = k1.s(minWith, it.nextInt());
            if (comparator.compare(j1.b(bS), j1.b(bS2)) > 0) {
                bS = bS2;
            }
        }
        return bS;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int S8(int[] reduceIndexed, yh.q<? super Integer, ? super n1, ? super n1, n1> operation) {
        f0.p(reduceIndexed, "$this$reduceIndexed");
        f0.p(operation, "operation");
        if (o1.y(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iS = o1.s(reduceIndexed, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            iS = operation.invoke(Integer.valueOf(iNextInt), n1.b(iS), n1.b(o1.s(reduceIndexed, iNextInt))).q0();
        }
        return iS;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final List<j1> S9(byte[] runningReduce, p<? super j1, ? super j1, j1> operation) {
        f0.p(runningReduce, "$this$runningReduce");
        f0.p(operation, "operation");
        if (k1.y(runningReduce)) {
            return CollectionsKt__CollectionsKt.E();
        }
        byte bS = k1.s(runningReduce, 0);
        ArrayList arrayList = new ArrayList(k1.v(runningReduce));
        arrayList.add(j1.b(bS));
        int iV = k1.v(runningReduce);
        for (int i10 = 1; i10 < iV; i10++) {
            bS = operation.invoke(j1.b(bS), j1.b(k1.s(runningReduce, i10))).o0();
            arrayList.add(j1.b(bS));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final long[] Sa(@d long[] sliceArray, @d Collection<Integer> indices) {
        f0.p(sliceArray, "$this$sliceArray");
        f0.p(indices, "indices");
        return s1.g(ArraysKt___ArraysKt.Iu(sliceArray, indices));
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfDouble")
    @f
    private static final double Sb(byte[] sumOf, l<? super j1, Double> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iV = k1.v(sumOf);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(j1.b(k1.s(sumOf, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long[] Sc(long[] jArr) {
        f0.p(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        f0.o(jArrCopyOf, "copyOf(this, size)");
        return s1.g(jArrCopyOf);
    }

    @u0(version = "1.4")
    @s
    public static final boolean T0(@e int[] iArr, @e int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<x1> T1(@d short[] dropLast, int i10) {
        f0.p(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return rc(dropLast, u.u(y1.v(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @u0(version = "1.3")
    @s
    @f
    private static final r1 T2(long[] find, l<? super r1, Boolean> predicate) {
        f0.p(find, "$this$find");
        f0.p(predicate, "predicate");
        int iV = s1.v(find);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(find, i10);
            if (predicate.invoke(r1.b(jS)).booleanValue()) {
                return r1.b(jS);
            }
        }
        return null;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R T3(short[] foldRightIndexed, R r10, yh.q<? super Integer, ? super x1, ? super R, ? extends R> operation) {
        f0.p(foldRightIndexed, "$this$foldRightIndexed");
        f0.p(operation, "operation");
        for (int iYe = ArraysKt___ArraysKt.Ye(foldRightIndexed); iYe >= 0; iYe--) {
            r10 = operation.invoke(Integer.valueOf(iYe), x1.b(y1.s(foldRightIndexed, iYe)), r10);
        }
        return r10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int T4(short[] indexOf, short s10) {
        f0.p(indexOf, "$this$indexOf");
        return ArraysKt___ArraysKt.kg(indexOf, s10);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "maxByOrThrow-U")
    @f
    private static final <R extends Comparable<? super R>> int T5(int[] maxBy, l<? super n1, ? extends R> selector) {
        f0.p(maxBy, "$this$maxBy");
        f0.p(selector, "selector");
        if (o1.y(maxBy)) {
            throw new NoSuchElementException();
        }
        int iS = o1.s(maxBy, 0);
        int iVe = ArraysKt___ArraysKt.Ve(maxBy);
        if (iVe == 0) {
            return iS;
        }
        R rInvoke = selector.invoke(n1.b(iS));
        k0 it = new fi.l(1, iVe).iterator();
        while (it.hasNext()) {
            int iS2 = o1.s(maxBy, it.nextInt());
            R rInvoke2 = selector.invoke(n1.b(iS2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                iS = iS2;
                rInvoke = rInvoke2;
            }
        }
        return iS;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R extends Comparable<? super R>> r1 T6(long[] minByOrNull, l<? super r1, ? extends R> selector) {
        f0.p(minByOrNull, "$this$minByOrNull");
        f0.p(selector, "selector");
        if (s1.y(minByOrNull)) {
            return null;
        }
        long jS = s1.s(minByOrNull, 0);
        int iWe = ArraysKt___ArraysKt.We(minByOrNull);
        if (iWe == 0) {
            return r1.b(jS);
        }
        R rInvoke = selector.invoke(r1.b(jS));
        k0 it = new fi.l(1, iWe).iterator();
        while (it.hasNext()) {
            long jS2 = s1.s(minByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(r1.b(jS2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                jS = jS2;
                rInvoke = rInvoke2;
            }
        }
        return r1.b(jS);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "minWithOrThrow-U")
    public static final int T7(@d int[] minWith, @d Comparator<? super n1> comparator) {
        f0.p(minWith, "$this$minWith");
        f0.p(comparator, "comparator");
        if (o1.y(minWith)) {
            throw new NoSuchElementException();
        }
        int iS = o1.s(minWith, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(minWith)).iterator();
        while (it.hasNext()) {
            int iS2 = o1.s(minWith, it.nextInt());
            if (comparator.compare(n1.b(iS), n1.b(iS2)) > 0) {
                iS = iS2;
            }
        }
        return iS;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte T8(byte[] reduceIndexed, yh.q<? super Integer, ? super j1, ? super j1, j1> operation) {
        f0.p(reduceIndexed, "$this$reduceIndexed");
        f0.p(operation, "operation");
        if (k1.y(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bS = k1.s(reduceIndexed, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            bS = operation.invoke(Integer.valueOf(iNextInt), j1.b(bS), j1.b(k1.s(reduceIndexed, iNextInt))).o0();
        }
        return bS;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final List<n1> T9(int[] runningReduce, p<? super n1, ? super n1, n1> operation) {
        f0.p(runningReduce, "$this$runningReduce");
        f0.p(operation, "operation");
        if (o1.y(runningReduce)) {
            return CollectionsKt__CollectionsKt.E();
        }
        int iS = o1.s(runningReduce, 0);
        ArrayList arrayList = new ArrayList(o1.v(runningReduce));
        arrayList.add(n1.b(iS));
        int iV = o1.v(runningReduce);
        for (int i10 = 1; i10 < iV; i10++) {
            iS = operation.invoke(n1.b(iS), n1.b(o1.s(runningReduce, i10))).q0();
            arrayList.add(n1.b(iS));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final short[] Ta(@d short[] sliceArray, @d Collection<Integer> indices) {
        f0.p(sliceArray, "$this$sliceArray");
        f0.p(indices, "indices");
        return y1.g(ArraysKt___ArraysKt.Mu(sliceArray, indices));
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfDouble")
    @f
    private static final double Tb(int[] sumOf, l<? super n1, Double> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iV = o1.v(sumOf);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(n1.b(o1.s(sumOf, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final long[] Tc(@d r1[] r1VarArr) {
        f0.p(r1VarArr, "<this>");
        int length = r1VarArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = r1VarArr[i10].q0();
        }
        return s1.g(jArr);
    }

    @u0(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @s
    @kotlin.l(hiddenSince = "1.4")
    public static final /* synthetic */ boolean U0(int[] contentEquals, int[] other) {
        f0.p(contentEquals, "$this$contentEquals");
        f0.p(other, "other");
        return T0(contentEquals, other);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<n1> U1(@d int[] dropLast, int i10) {
        f0.p(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return sc(dropLast, u.u(o1.v(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @u0(version = "1.3")
    @s
    @f
    private static final n1 U2(int[] find, l<? super n1, Boolean> predicate) {
        f0.p(find, "$this$find");
        f0.p(predicate, "predicate");
        int iV = o1.v(find);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(find, i10);
            if (predicate.invoke(n1.b(iS)).booleanValue()) {
                return n1.b(iS);
            }
        }
        return null;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R U3(long[] foldRightIndexed, R r10, yh.q<? super Integer, ? super r1, ? super R, ? extends R> operation) {
        f0.p(foldRightIndexed, "$this$foldRightIndexed");
        f0.p(operation, "operation");
        for (int iWe = ArraysKt___ArraysKt.We(foldRightIndexed); iWe >= 0; iWe--) {
            r10 = operation.invoke(Integer.valueOf(iWe), r1.b(s1.s(foldRightIndexed, iWe)), r10);
        }
        return r10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int U4(byte[] indexOf, byte b10) {
        f0.p(indexOf, "$this$indexOf");
        return ArraysKt___ArraysKt.dg(indexOf, b10);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "maxByOrThrow-U")
    @f
    private static final <R extends Comparable<? super R>> long U5(long[] maxBy, l<? super r1, ? extends R> selector) {
        f0.p(maxBy, "$this$maxBy");
        f0.p(selector, "selector");
        if (s1.y(maxBy)) {
            throw new NoSuchElementException();
        }
        long jS = s1.s(maxBy, 0);
        int iWe = ArraysKt___ArraysKt.We(maxBy);
        if (iWe == 0) {
            return jS;
        }
        R rInvoke = selector.invoke(r1.b(jS));
        k0 it = new fi.l(1, iWe).iterator();
        while (it.hasNext()) {
            long jS2 = s1.s(maxBy, it.nextInt());
            R rInvoke2 = selector.invoke(r1.b(jS2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                jS = jS2;
                rInvoke = rInvoke2;
            }
        }
        return jS;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R extends Comparable<? super R>> n1 U6(int[] minByOrNull, l<? super n1, ? extends R> selector) {
        f0.p(minByOrNull, "$this$minByOrNull");
        f0.p(selector, "selector");
        if (o1.y(minByOrNull)) {
            return null;
        }
        int iS = o1.s(minByOrNull, 0);
        int iVe = ArraysKt___ArraysKt.Ve(minByOrNull);
        if (iVe == 0) {
            return n1.b(iS);
        }
        R rInvoke = selector.invoke(n1.b(iS));
        k0 it = new fi.l(1, iVe).iterator();
        while (it.hasNext()) {
            int iS2 = o1.s(minByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(n1.b(iS2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                iS = iS2;
                rInvoke = rInvoke2;
            }
        }
        return n1.b(iS);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "minWithOrThrow-U")
    public static final long U7(@d long[] minWith, @d Comparator<? super r1> comparator) {
        f0.p(minWith, "$this$minWith");
        f0.p(comparator, "comparator");
        if (s1.y(minWith)) {
            throw new NoSuchElementException();
        }
        long jS = s1.s(minWith, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(minWith)).iterator();
        while (it.hasNext()) {
            long jS2 = s1.s(minWith, it.nextInt());
            if (comparator.compare(r1.b(jS), r1.b(jS2)) > 0) {
                jS = jS2;
            }
        }
        return jS;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short U8(short[] reduceIndexed, yh.q<? super Integer, ? super x1, ? super x1, x1> operation) {
        f0.p(reduceIndexed, "$this$reduceIndexed");
        f0.p(operation, "operation");
        if (y1.y(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s10 = y1.s(reduceIndexed, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            s10 = operation.invoke(Integer.valueOf(iNextInt), x1.b(s10), x1.b(y1.s(reduceIndexed, iNextInt))).o0();
        }
        return s10;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final List<r1> U9(long[] runningReduce, p<? super r1, ? super r1, r1> operation) {
        f0.p(runningReduce, "$this$runningReduce");
        f0.p(operation, "operation");
        if (s1.y(runningReduce)) {
            return CollectionsKt__CollectionsKt.E();
        }
        long jS = s1.s(runningReduce, 0);
        ArrayList arrayList = new ArrayList(s1.v(runningReduce));
        arrayList.add(r1.b(jS));
        int iV = s1.v(runningReduce);
        for (int i10 = 1; i10 < iV; i10++) {
            jS = operation.invoke(r1.b(jS), r1.b(s1.s(runningReduce, i10))).q0();
            arrayList.add(r1.b(jS));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final int[] Ua(@d int[] sliceArray, @d fi.l indices) {
        f0.p(sliceArray, "$this$sliceArray");
        f0.p(indices, "indices");
        return o1.g(ArraysKt___ArraysKt.Fu(sliceArray, indices));
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfDouble")
    @f
    private static final double Ub(long[] sumOf, l<? super r1, Double> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iV = s1.v(sumOf);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(r1.b(s1.s(sumOf, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final short[] Uc(@d x1[] x1VarArr) {
        f0.p(x1VarArr, "<this>");
        int length = x1VarArr.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = x1VarArr[i10].o0();
        }
        return y1.g(sArr);
    }

    @u0(version = "1.4")
    @s
    public static final boolean V0(@e byte[] bArr, @e byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<r1> V1(@d long[] dropLast, int i10) {
        f0.p(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return tc(dropLast, u.u(s1.v(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @u0(version = "1.3")
    @s
    @f
    private static final x1 V2(short[] find, l<? super x1, Boolean> predicate) {
        f0.p(find, "$this$find");
        f0.p(predicate, "predicate");
        int iV = y1.v(find);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(find, i10);
            if (predicate.invoke(x1.b(s10)).booleanValue()) {
                return x1.b(s10);
            }
        }
        return null;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> R V3(int[] foldRightIndexed, R r10, yh.q<? super Integer, ? super n1, ? super R, ? extends R> operation) {
        f0.p(foldRightIndexed, "$this$foldRightIndexed");
        f0.p(operation, "operation");
        for (int iVe = ArraysKt___ArraysKt.Ve(foldRightIndexed); iVe >= 0; iVe--) {
            r10 = operation.invoke(Integer.valueOf(iVe), n1.b(o1.s(foldRightIndexed, iVe)), r10);
        }
        return r10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int V4(int[] indexOf, int i10) {
        f0.p(indexOf, "$this$indexOf");
        return ArraysKt___ArraysKt.hg(indexOf, i10);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "maxByOrThrow-U")
    @f
    private static final <R extends Comparable<? super R>> short V5(short[] maxBy, l<? super x1, ? extends R> selector) {
        f0.p(maxBy, "$this$maxBy");
        f0.p(selector, "selector");
        if (y1.y(maxBy)) {
            throw new NoSuchElementException();
        }
        short s10 = y1.s(maxBy, 0);
        int iYe = ArraysKt___ArraysKt.Ye(maxBy);
        if (iYe == 0) {
            return s10;
        }
        R rInvoke = selector.invoke(x1.b(s10));
        k0 it = new fi.l(1, iYe).iterator();
        while (it.hasNext()) {
            short s11 = y1.s(maxBy, it.nextInt());
            R rInvoke2 = selector.invoke(x1.b(s11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                s10 = s11;
                rInvoke = rInvoke2;
            }
        }
        return s10;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <R extends Comparable<? super R>> x1 V6(short[] minByOrNull, l<? super x1, ? extends R> selector) {
        f0.p(minByOrNull, "$this$minByOrNull");
        f0.p(selector, "selector");
        if (y1.y(minByOrNull)) {
            return null;
        }
        short s10 = y1.s(minByOrNull, 0);
        int iYe = ArraysKt___ArraysKt.Ye(minByOrNull);
        if (iYe == 0) {
            return x1.b(s10);
        }
        R rInvoke = selector.invoke(x1.b(s10));
        k0 it = new fi.l(1, iYe).iterator();
        while (it.hasNext()) {
            short s11 = y1.s(minByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(x1.b(s11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                s10 = s11;
                rInvoke = rInvoke2;
            }
        }
        return x1.b(s10);
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "minWithOrThrow-U")
    public static final short V7(@d short[] minWith, @d Comparator<? super x1> comparator) {
        f0.p(minWith, "$this$minWith");
        f0.p(comparator, "comparator");
        if (y1.y(minWith)) {
            throw new NoSuchElementException();
        }
        short s10 = y1.s(minWith, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(minWith)).iterator();
        while (it.hasNext()) {
            short s11 = y1.s(minWith, it.nextInt());
            if (comparator.compare(x1.b(s10), x1.b(s11)) > 0) {
                s10 = s11;
            }
        }
        return s10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long V8(long[] reduceIndexed, yh.q<? super Integer, ? super r1, ? super r1, r1> operation) {
        f0.p(reduceIndexed, "$this$reduceIndexed");
        f0.p(operation, "operation");
        if (s1.y(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jS = s1.s(reduceIndexed, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jS = operation.invoke(Integer.valueOf(iNextInt), r1.b(jS), r1.b(s1.s(reduceIndexed, iNextInt))).q0();
        }
        return jS;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final List<x1> V9(short[] runningReduce, p<? super x1, ? super x1, x1> operation) {
        f0.p(runningReduce, "$this$runningReduce");
        f0.p(operation, "operation");
        if (y1.y(runningReduce)) {
            return CollectionsKt__CollectionsKt.E();
        }
        short s10 = y1.s(runningReduce, 0);
        ArrayList arrayList = new ArrayList(y1.v(runningReduce));
        arrayList.add(x1.b(s10));
        int iV = y1.v(runningReduce);
        for (int i10 = 1; i10 < iV; i10++) {
            s10 = operation.invoke(x1.b(s10), x1.b(y1.s(runningReduce, i10))).o0();
            arrayList.add(x1.b(s10));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final byte[] Va(@d byte[] sliceArray, @d Collection<Integer> indices) {
        f0.p(sliceArray, "$this$sliceArray");
        f0.p(indices, "indices");
        return k1.g(ArraysKt___ArraysKt.yu(sliceArray, indices));
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfDouble")
    @f
    private static final double Vb(short[] sumOf, l<? super x1, Double> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iV = y1.v(sumOf);
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < iV; i10++) {
            dDoubleValue += selector.invoke(x1.b(y1.s(sumOf, i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short[] Vc(short[] sArr) {
        f0.p(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        f0.o(sArrCopyOf, "copyOf(this, size)");
        return y1.g(sArrCopyOf);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean W(byte[] all, l<? super j1, Boolean> predicate) {
        f0.p(all, "$this$all");
        f0.p(predicate, "predicate");
        int iV = k1.v(all);
        for (int i10 = 0; i10 < iV; i10++) {
            if (!predicate.invoke(j1.b(k1.s(all, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @u0(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @s
    @kotlin.l(hiddenSince = "1.4")
    public static final /* synthetic */ boolean W0(byte[] contentEquals, byte[] other) {
        f0.p(contentEquals, "$this$contentEquals");
        f0.p(other, "other");
        return V0(contentEquals, other);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<j1> W1(byte[] dropLastWhile, l<? super j1, Boolean> predicate) {
        f0.p(dropLastWhile, "$this$dropLastWhile");
        f0.p(predicate, "predicate");
        for (int iRe = ArraysKt___ArraysKt.Re(dropLastWhile); -1 < iRe; iRe--) {
            if (!predicate.invoke(j1.b(k1.s(dropLastWhile, iRe))).booleanValue()) {
                return qc(dropLastWhile, iRe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @u0(version = "1.3")
    @s
    @f
    private static final j1 W2(byte[] findLast, l<? super j1, Boolean> predicate) {
        f0.p(findLast, "$this$findLast");
        f0.p(predicate, "predicate");
        int iV = k1.v(findLast) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                byte bS = k1.s(findLast, iV);
                if (predicate.invoke(j1.b(bS)).booleanValue()) {
                    return j1.b(bS);
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        return null;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final void W3(byte[] forEach, l<? super j1, b2> action) {
        f0.p(forEach, "$this$forEach");
        f0.p(action, "action");
        int iV = k1.v(forEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(j1.b(k1.s(forEach, i10)));
        }
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int W4(byte[] indexOfFirst, l<? super j1, Boolean> predicate) {
        f0.p(indexOfFirst, "$this$indexOfFirst");
        f0.p(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(j1.b(j1.h(indexOfFirst[i10]))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final double W5(byte[] maxOf, l<? super j1, Double> selector) {
        f0.p(maxOf, "$this$maxOf");
        f0.p(selector, "selector");
        if (k1.y(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(j1.b(k1.s(maxOf, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(maxOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(j1.b(k1.s(maxOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "minByOrThrow-U")
    @f
    private static final <R extends Comparable<? super R>> byte W6(byte[] minBy, l<? super j1, ? extends R> selector) {
        f0.p(minBy, "$this$minBy");
        f0.p(selector, "selector");
        if (k1.y(minBy)) {
            throw new NoSuchElementException();
        }
        byte bS = k1.s(minBy, 0);
        int iRe = ArraysKt___ArraysKt.Re(minBy);
        if (iRe == 0) {
            return bS;
        }
        R rInvoke = selector.invoke(j1.b(bS));
        k0 it = new fi.l(1, iRe).iterator();
        while (it.hasNext()) {
            byte bS2 = k1.s(minBy, it.nextInt());
            R rInvoke2 = selector.invoke(j1.b(bS2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                bS = bS2;
                rInvoke = rInvoke2;
            }
        }
        return bS;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean W7(int[] none) {
        f0.p(none, "$this$none");
        return o1.y(none);
    }

    @u0(version = "1.4")
    @s
    @f
    private static final n1 W8(int[] reduceIndexedOrNull, yh.q<? super Integer, ? super n1, ? super n1, n1> operation) {
        f0.p(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        f0.p(operation, "operation");
        if (o1.y(reduceIndexedOrNull)) {
            return null;
        }
        int iS = o1.s(reduceIndexedOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            iS = operation.invoke(Integer.valueOf(iNextInt), n1.b(iS), n1.b(o1.s(reduceIndexedOrNull, iNextInt))).q0();
        }
        return n1.b(iS);
    }

    @u0(version = "1.4")
    @s
    @f
    private static final List<n1> W9(int[] runningReduceIndexed, yh.q<? super Integer, ? super n1, ? super n1, n1> operation) {
        f0.p(runningReduceIndexed, "$this$runningReduceIndexed");
        f0.p(operation, "operation");
        if (o1.y(runningReduceIndexed)) {
            return CollectionsKt__CollectionsKt.E();
        }
        int iS = o1.s(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(o1.v(runningReduceIndexed));
        arrayList.add(n1.b(iS));
        int iV = o1.v(runningReduceIndexed);
        for (int i10 = 1; i10 < iV; i10++) {
            iS = operation.invoke(Integer.valueOf(i10), n1.b(iS), n1.b(o1.s(runningReduceIndexed, i10))).q0();
            arrayList.add(n1.b(iS));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    public static final void Wa(@d int[] sort) {
        f0.p(sort, "$this$sort");
        if (o1.v(sort) > 1) {
            h1.l(sort, 0, o1.v(sort));
        }
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfInt")
    @f
    private static final int Wb(byte[] sumOf, l<? super j1, Integer> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iV = k1.v(sumOf);
        int iIntValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iIntValue += selector.invoke(j1.b(k1.s(sumOf, i10))).intValue();
        }
        return iIntValue;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final Iterable<h0<n1>> Wc(@d final int[] withIndex) {
        f0.p(withIndex, "$this$withIndex");
        return new i0(new yh.a<Iterator<? extends n1>>() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<n1> invoke() {
                return o1.A(withIndex);
            }
        });
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean X(long[] all, l<? super r1, Boolean> predicate) {
        f0.p(all, "$this$all");
        f0.p(predicate, "predicate");
        int iV = s1.v(all);
        for (int i10 = 0; i10 < iV; i10++) {
            if (!predicate.invoke(r1.b(s1.s(all, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @u0(version = "1.4")
    @s
    public static final boolean X0(@e long[] jArr, @e long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<r1> X1(long[] dropLastWhile, l<? super r1, Boolean> predicate) {
        f0.p(dropLastWhile, "$this$dropLastWhile");
        f0.p(predicate, "predicate");
        for (int iWe = ArraysKt___ArraysKt.We(dropLastWhile); -1 < iWe; iWe--) {
            if (!predicate.invoke(r1.b(s1.s(dropLastWhile, iWe))).booleanValue()) {
                return tc(dropLastWhile, iWe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @u0(version = "1.3")
    @s
    @f
    private static final r1 X2(long[] findLast, l<? super r1, Boolean> predicate) {
        f0.p(findLast, "$this$findLast");
        f0.p(predicate, "predicate");
        int iV = s1.v(findLast) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                long jS = s1.s(findLast, iV);
                if (predicate.invoke(r1.b(jS)).booleanValue()) {
                    return r1.b(jS);
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        return null;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final void X3(long[] forEach, l<? super r1, b2> action) {
        f0.p(forEach, "$this$forEach");
        f0.p(action, "action");
        int iV = s1.v(forEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(r1.b(s1.s(forEach, i10)));
        }
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int X4(long[] indexOfFirst, l<? super r1, Boolean> predicate) {
        f0.p(indexOfFirst, "$this$indexOfFirst");
        f0.p(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(r1.b(r1.h(indexOfFirst[i10]))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final float X5(byte[] maxOf, l<? super j1, Float> selector) {
        f0.p(maxOf, "$this$maxOf");
        f0.p(selector, "selector");
        if (k1.y(maxOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(j1.b(k1.s(maxOf, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(maxOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(j1.b(k1.s(maxOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "minByOrThrow-U")
    @f
    private static final <R extends Comparable<? super R>> int X6(int[] minBy, l<? super n1, ? extends R> selector) {
        f0.p(minBy, "$this$minBy");
        f0.p(selector, "selector");
        if (o1.y(minBy)) {
            throw new NoSuchElementException();
        }
        int iS = o1.s(minBy, 0);
        int iVe = ArraysKt___ArraysKt.Ve(minBy);
        if (iVe == 0) {
            return iS;
        }
        R rInvoke = selector.invoke(n1.b(iS));
        k0 it = new fi.l(1, iVe).iterator();
        while (it.hasNext()) {
            int iS2 = o1.s(minBy, it.nextInt());
            R rInvoke2 = selector.invoke(n1.b(iS2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                iS = iS2;
                rInvoke = rInvoke2;
            }
        }
        return iS;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean X7(byte[] none) {
        f0.p(none, "$this$none");
        return k1.y(none);
    }

    @u0(version = "1.4")
    @s
    @f
    private static final j1 X8(byte[] reduceIndexedOrNull, yh.q<? super Integer, ? super j1, ? super j1, j1> operation) {
        f0.p(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        f0.p(operation, "operation");
        if (k1.y(reduceIndexedOrNull)) {
            return null;
        }
        byte bS = k1.s(reduceIndexedOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            bS = operation.invoke(Integer.valueOf(iNextInt), j1.b(bS), j1.b(k1.s(reduceIndexedOrNull, iNextInt))).o0();
        }
        return j1.b(bS);
    }

    @u0(version = "1.4")
    @s
    @f
    private static final List<j1> X9(byte[] runningReduceIndexed, yh.q<? super Integer, ? super j1, ? super j1, j1> operation) {
        f0.p(runningReduceIndexed, "$this$runningReduceIndexed");
        f0.p(operation, "operation");
        if (k1.y(runningReduceIndexed)) {
            return CollectionsKt__CollectionsKt.E();
        }
        byte bS = k1.s(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(k1.v(runningReduceIndexed));
        arrayList.add(j1.b(bS));
        int iV = k1.v(runningReduceIndexed);
        for (int i10 = 1; i10 < iV; i10++) {
            bS = operation.invoke(Integer.valueOf(i10), j1.b(bS), j1.b(k1.s(runningReduceIndexed, i10))).o0();
            arrayList.add(j1.b(bS));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    public static final void Xa(@d long[] sort, int i10, int i11) {
        f0.p(sort, "$this$sort");
        kotlin.collections.b.Companion.d(i10, i11, s1.v(sort));
        h1.i(sort, i10, i11);
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfInt")
    @f
    private static final int Xb(int[] sumOf, l<? super n1, Integer> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iV = o1.v(sumOf);
        int iIntValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iIntValue += selector.invoke(n1.b(o1.s(sumOf, i10))).intValue();
        }
        return iIntValue;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final Iterable<h0<j1>> Xc(@d final byte[] withIndex) {
        f0.p(withIndex, "$this$withIndex");
        return new i0(new yh.a<Iterator<? extends j1>>() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<j1> invoke() {
                return k1.A(withIndex);
            }
        });
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean Y(int[] all, l<? super n1, Boolean> predicate) {
        f0.p(all, "$this$all");
        f0.p(predicate, "predicate");
        int iV = o1.v(all);
        for (int i10 = 0; i10 < iV; i10++) {
            if (!predicate.invoke(n1.b(o1.s(all, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @u0(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @s
    @kotlin.l(hiddenSince = "1.4")
    public static final /* synthetic */ boolean Y0(short[] contentEquals, short[] other) {
        f0.p(contentEquals, "$this$contentEquals");
        f0.p(other, "other");
        return S0(contentEquals, other);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<n1> Y1(int[] dropLastWhile, l<? super n1, Boolean> predicate) {
        f0.p(dropLastWhile, "$this$dropLastWhile");
        f0.p(predicate, "predicate");
        for (int iVe = ArraysKt___ArraysKt.Ve(dropLastWhile); -1 < iVe; iVe--) {
            if (!predicate.invoke(n1.b(o1.s(dropLastWhile, iVe))).booleanValue()) {
                return sc(dropLastWhile, iVe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @u0(version = "1.3")
    @s
    @f
    private static final n1 Y2(int[] findLast, l<? super n1, Boolean> predicate) {
        f0.p(findLast, "$this$findLast");
        f0.p(predicate, "predicate");
        int iV = o1.v(findLast) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                int iS = o1.s(findLast, iV);
                if (predicate.invoke(n1.b(iS)).booleanValue()) {
                    return n1.b(iS);
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        return null;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final void Y3(int[] forEach, l<? super n1, b2> action) {
        f0.p(forEach, "$this$forEach");
        f0.p(action, "action");
        int iV = o1.v(forEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(n1.b(o1.s(forEach, i10)));
        }
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int Y4(int[] indexOfFirst, l<? super n1, Boolean> predicate) {
        f0.p(indexOfFirst, "$this$indexOfFirst");
        f0.p(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(n1.b(n1.h(indexOfFirst[i10]))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R Y5(byte[] maxOf, l<? super j1, ? extends R> selector) {
        f0.p(maxOf, "$this$maxOf");
        f0.p(selector, "selector");
        if (k1.y(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(j1.b(k1.s(maxOf, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(maxOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(j1.b(k1.s(maxOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "minByOrThrow-U")
    @f
    private static final <R extends Comparable<? super R>> long Y6(long[] minBy, l<? super r1, ? extends R> selector) {
        f0.p(minBy, "$this$minBy");
        f0.p(selector, "selector");
        if (s1.y(minBy)) {
            throw new NoSuchElementException();
        }
        long jS = s1.s(minBy, 0);
        int iWe = ArraysKt___ArraysKt.We(minBy);
        if (iWe == 0) {
            return jS;
        }
        R rInvoke = selector.invoke(r1.b(jS));
        k0 it = new fi.l(1, iWe).iterator();
        while (it.hasNext()) {
            long jS2 = s1.s(minBy, it.nextInt());
            R rInvoke2 = selector.invoke(r1.b(jS2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                jS = jS2;
                rInvoke = rInvoke2;
            }
        }
        return jS;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean Y7(byte[] none, l<? super j1, Boolean> predicate) {
        f0.p(none, "$this$none");
        f0.p(predicate, "predicate");
        int iV = k1.v(none);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(j1.b(k1.s(none, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final x1 Y8(short[] reduceIndexedOrNull, yh.q<? super Integer, ? super x1, ? super x1, x1> operation) {
        f0.p(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        f0.p(operation, "operation");
        if (y1.y(reduceIndexedOrNull)) {
            return null;
        }
        short s10 = y1.s(reduceIndexedOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            s10 = operation.invoke(Integer.valueOf(iNextInt), x1.b(s10), x1.b(y1.s(reduceIndexedOrNull, iNextInt))).o0();
        }
        return x1.b(s10);
    }

    @u0(version = "1.4")
    @s
    @f
    private static final List<x1> Y9(short[] runningReduceIndexed, yh.q<? super Integer, ? super x1, ? super x1, x1> operation) {
        f0.p(runningReduceIndexed, "$this$runningReduceIndexed");
        f0.p(operation, "operation");
        if (y1.y(runningReduceIndexed)) {
            return CollectionsKt__CollectionsKt.E();
        }
        short s10 = y1.s(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(y1.v(runningReduceIndexed));
        arrayList.add(x1.b(s10));
        int iV = y1.v(runningReduceIndexed);
        for (int i10 = 1; i10 < iV; i10++) {
            s10 = operation.invoke(Integer.valueOf(i10), x1.b(s10), x1.b(y1.s(runningReduceIndexed, i10))).o0();
            arrayList.add(x1.b(s10));
        }
        return arrayList;
    }

    public static /* synthetic */ void Ya(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = s1.v(jArr);
        }
        Xa(jArr, i10, i11);
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfInt")
    @f
    private static final int Yb(long[] sumOf, l<? super r1, Integer> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iV = s1.v(sumOf);
        int iIntValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iIntValue += selector.invoke(r1.b(s1.s(sumOf, i10))).intValue();
        }
        return iIntValue;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final Iterable<h0<r1>> Yc(@d final long[] withIndex) {
        f0.p(withIndex, "$this$withIndex");
        return new i0(new yh.a<Iterator<? extends r1>>() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<r1> invoke() {
                return s1.A(withIndex);
            }
        });
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean Z(short[] all, l<? super x1, Boolean> predicate) {
        f0.p(all, "$this$all");
        f0.p(predicate, "predicate");
        int iV = y1.v(all);
        for (int i10 = 0; i10 < iV; i10++) {
            if (!predicate.invoke(x1.b(y1.s(all, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @u0(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @s
    @kotlin.l(hiddenSince = "1.4")
    public static final /* synthetic */ boolean Z0(long[] contentEquals, long[] other) {
        f0.p(contentEquals, "$this$contentEquals");
        f0.p(other, "other");
        return X0(contentEquals, other);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<x1> Z1(short[] dropLastWhile, l<? super x1, Boolean> predicate) {
        f0.p(dropLastWhile, "$this$dropLastWhile");
        f0.p(predicate, "predicate");
        for (int iYe = ArraysKt___ArraysKt.Ye(dropLastWhile); -1 < iYe; iYe--) {
            if (!predicate.invoke(x1.b(y1.s(dropLastWhile, iYe))).booleanValue()) {
                return rc(dropLastWhile, iYe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @u0(version = "1.3")
    @s
    @f
    private static final x1 Z2(short[] findLast, l<? super x1, Boolean> predicate) {
        f0.p(findLast, "$this$findLast");
        f0.p(predicate, "predicate");
        int iV = y1.v(findLast) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                short s10 = y1.s(findLast, iV);
                if (predicate.invoke(x1.b(s10)).booleanValue()) {
                    return x1.b(s10);
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        return null;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final void Z3(short[] forEach, l<? super x1, b2> action) {
        f0.p(forEach, "$this$forEach");
        f0.p(action, "action");
        int iV = y1.v(forEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(x1.b(y1.s(forEach, i10)));
        }
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int Z4(short[] indexOfFirst, l<? super x1, Boolean> predicate) {
        f0.p(indexOfFirst, "$this$indexOfFirst");
        f0.p(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(x1.b(x1.h(indexOfFirst[i10]))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final double Z5(long[] maxOf, l<? super r1, Double> selector) {
        f0.p(maxOf, "$this$maxOf");
        f0.p(selector, "selector");
        if (s1.y(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(r1.b(s1.s(maxOf, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(maxOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(r1.b(s1.s(maxOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @u0(version = s0.f136932w)
    @s
    @h(name = "minByOrThrow-U")
    @f
    private static final <R extends Comparable<? super R>> short Z6(short[] minBy, l<? super x1, ? extends R> selector) {
        f0.p(minBy, "$this$minBy");
        f0.p(selector, "selector");
        if (y1.y(minBy)) {
            throw new NoSuchElementException();
        }
        short s10 = y1.s(minBy, 0);
        int iYe = ArraysKt___ArraysKt.Ye(minBy);
        if (iYe == 0) {
            return s10;
        }
        R rInvoke = selector.invoke(x1.b(s10));
        k0 it = new fi.l(1, iYe).iterator();
        while (it.hasNext()) {
            short s11 = y1.s(minBy, it.nextInt());
            R rInvoke2 = selector.invoke(x1.b(s11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                s10 = s11;
                rInvoke = rInvoke2;
            }
        }
        return s10;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean Z7(long[] none, l<? super r1, Boolean> predicate) {
        f0.p(none, "$this$none");
        f0.p(predicate, "predicate");
        int iV = s1.v(none);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(r1.b(s1.s(none, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final r1 Z8(long[] reduceIndexedOrNull, yh.q<? super Integer, ? super r1, ? super r1, r1> operation) {
        f0.p(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        f0.p(operation, "operation");
        if (s1.y(reduceIndexedOrNull)) {
            return null;
        }
        long jS = s1.s(reduceIndexedOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jS = operation.invoke(Integer.valueOf(iNextInt), r1.b(jS), r1.b(s1.s(reduceIndexedOrNull, iNextInt))).q0();
        }
        return r1.b(jS);
    }

    @u0(version = "1.4")
    @s
    @f
    private static final List<r1> Z9(long[] runningReduceIndexed, yh.q<? super Integer, ? super r1, ? super r1, r1> operation) {
        f0.p(runningReduceIndexed, "$this$runningReduceIndexed");
        f0.p(operation, "operation");
        if (s1.y(runningReduceIndexed)) {
            return CollectionsKt__CollectionsKt.E();
        }
        long jS = s1.s(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(s1.v(runningReduceIndexed));
        arrayList.add(r1.b(jS));
        int iV = s1.v(runningReduceIndexed);
        for (int i10 = 1; i10 < iV; i10++) {
            jS = operation.invoke(Integer.valueOf(i10), r1.b(jS), r1.b(s1.s(runningReduceIndexed, i10))).q0();
            arrayList.add(r1.b(jS));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    public static final void Za(@d byte[] sort, int i10, int i11) {
        f0.p(sort, "$this$sort");
        kotlin.collections.b.Companion.d(i10, i11, k1.v(sort));
        h1.j(sort, i10, i11);
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfInt")
    @f
    private static final int Zb(short[] sumOf, l<? super x1, Integer> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iV = y1.v(sumOf);
        int iIntValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iIntValue += selector.invoke(x1.b(y1.s(sumOf, i10))).intValue();
        }
        return iIntValue;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final Iterable<h0<x1>> Zc(@d final short[] withIndex) {
        f0.p(withIndex, "$this$withIndex");
        return new i0(new yh.a<Iterator<? extends x1>>() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<x1> invoke() {
                return y1.A(withIndex);
            }
        });
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean a0(int[] any) {
        f0.p(any, "$this$any");
        return ArraysKt___ArraysKt.M5(any);
    }

    @u0(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @s
    @kotlin.l(hiddenSince = "1.4")
    public static final /* synthetic */ int a1(int[] contentHashCode) {
        f0.p(contentHashCode, "$this$contentHashCode");
        return e1(contentHashCode);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<j1> a2(byte[] dropWhile, l<? super j1, Boolean> predicate) {
        f0.p(dropWhile, "$this$dropWhile");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = k1.v(dropWhile);
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(dropWhile, i10);
            if (z10) {
                arrayList.add(j1.b(bS));
            } else if (!predicate.invoke(j1.b(bS)).booleanValue()) {
                arrayList.add(j1.b(bS));
                z10 = true;
            }
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int a3(int[] first) {
        f0.p(first, "$this$first");
        return n1.h(ArraysKt___ArraysKt.oc(first));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final void a4(byte[] forEachIndexed, p<? super Integer, ? super j1, b2> action) {
        f0.p(forEachIndexed, "$this$forEachIndexed");
        f0.p(action, "action");
        int iV = k1.v(forEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), j1.b(k1.s(forEachIndexed, i10)));
            i10++;
            i11++;
        }
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int a5(byte[] indexOfLast, l<? super j1, Boolean> predicate) {
        f0.p(indexOfLast, "$this$indexOfLast");
        f0.p(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i10 = length - 1;
            if (predicate.invoke(j1.b(j1.h(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i10 < 0) {
                return -1;
            }
            length = i10;
        }
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final float a6(long[] maxOf, l<? super r1, Float> selector) {
        f0.p(maxOf, "$this$maxOf");
        f0.p(selector, "selector");
        if (s1.y(maxOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(r1.b(s1.s(maxOf, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(maxOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(r1.b(s1.s(maxOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final double a7(byte[] minOf, l<? super j1, Double> selector) {
        f0.p(minOf, "$this$minOf");
        f0.p(selector, "selector");
        if (k1.y(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(j1.b(k1.s(minOf, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(minOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(j1.b(k1.s(minOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean a8(long[] none) {
        f0.p(none, "$this$none");
        return s1.y(none);
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final j1 a9(byte[] reduceOrNull, p<? super j1, ? super j1, j1> operation) {
        f0.p(reduceOrNull, "$this$reduceOrNull");
        f0.p(operation, "operation");
        if (k1.y(reduceOrNull)) {
            return null;
        }
        byte bS = k1.s(reduceOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(reduceOrNull)).iterator();
        while (it.hasNext()) {
            bS = operation.invoke(j1.b(bS), j1.b(k1.s(reduceOrNull, it.nextInt()))).o0();
        }
        return j1.b(bS);
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final <R> List<R> aa(long[] scan, R r10, p<? super R, ? super r1, ? extends R> operation) {
        f0.p(scan, "$this$scan");
        f0.p(operation, "operation");
        if (s1.y(scan)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(s1.v(scan) + 1);
        arrayList.add(r10);
        int iV = s1.v(scan);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, r1.b(s1.s(scan, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static /* synthetic */ void ab(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = k1.v(bArr);
        }
        Za(bArr, i10, i11);
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfLong")
    @f
    private static final long ac(byte[] sumOf, l<? super j1, Long> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iV = k1.v(sumOf);
        long jLongValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            jLongValue += selector.invoke(j1.b(k1.s(sumOf, i10))).longValue();
        }
        return jLongValue;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, V> List<V> ad(int[] zip, Iterable<? extends R> other, p<? super n1, ? super R, ? extends V> transform) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iV = o1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(transform.invoke(n1.b(o1.s(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean b0(byte[] any) {
        f0.p(any, "$this$any");
        return ArraysKt___ArraysKt.E5(any);
    }

    @u0(version = "1.4")
    @s
    public static final int b1(@e byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<r1> b2(long[] dropWhile, l<? super r1, Boolean> predicate) {
        f0.p(dropWhile, "$this$dropWhile");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = s1.v(dropWhile);
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(dropWhile, i10);
            if (z10) {
                arrayList.add(r1.b(jS));
            } else if (!predicate.invoke(r1.b(jS)).booleanValue()) {
                arrayList.add(r1.b(jS));
                z10 = true;
            }
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte b3(byte[] first) {
        f0.p(first, "$this$first");
        return j1.h(ArraysKt___ArraysKt.gc(first));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final void b4(int[] forEachIndexed, p<? super Integer, ? super n1, b2> action) {
        f0.p(forEachIndexed, "$this$forEachIndexed");
        f0.p(action, "action");
        int iV = o1.v(forEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), n1.b(o1.s(forEachIndexed, i10)));
            i10++;
            i11++;
        }
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int b5(long[] indexOfLast, l<? super r1, Boolean> predicate) {
        f0.p(indexOfLast, "$this$indexOfLast");
        f0.p(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i10 = length - 1;
            if (predicate.invoke(r1.b(r1.h(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i10 < 0) {
                return -1;
            }
            length = i10;
        }
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R b6(long[] maxOf, l<? super r1, ? extends R> selector) {
        f0.p(maxOf, "$this$maxOf");
        f0.p(selector, "selector");
        if (s1.y(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(r1.b(s1.s(maxOf, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(maxOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(r1.b(s1.s(maxOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final float b7(byte[] minOf, l<? super j1, Float> selector) {
        f0.p(minOf, "$this$minOf");
        f0.p(selector, "selector");
        if (k1.y(minOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(j1.b(k1.s(minOf, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(minOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(j1.b(k1.s(minOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean b8(int[] none, l<? super n1, Boolean> predicate) {
        f0.p(none, "$this$none");
        f0.p(predicate, "predicate");
        int iV = o1.v(none);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(n1.b(o1.s(none, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final n1 b9(int[] reduceOrNull, p<? super n1, ? super n1, n1> operation) {
        f0.p(reduceOrNull, "$this$reduceOrNull");
        f0.p(operation, "operation");
        if (o1.y(reduceOrNull)) {
            return null;
        }
        int iS = o1.s(reduceOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(reduceOrNull)).iterator();
        while (it.hasNext()) {
            iS = operation.invoke(n1.b(iS), n1.b(o1.s(reduceOrNull, it.nextInt()))).q0();
        }
        return n1.b(iS);
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final <R> List<R> ba(byte[] scan, R r10, p<? super R, ? super j1, ? extends R> operation) {
        f0.p(scan, "$this$scan");
        f0.p(operation, "operation");
        if (k1.y(scan)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(k1.v(scan) + 1);
        arrayList.add(r10);
        int iV = k1.v(scan);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, j1.b(k1.s(scan, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    public static final void bb(@d short[] sort, int i10, int i11) {
        f0.p(sort, "$this$sort");
        kotlin.collections.b.Companion.d(i10, i11, y1.v(sort));
        h1.k(sort, i10, i11);
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfLong")
    @f
    private static final long bc(int[] sumOf, l<? super n1, Long> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iV = o1.v(sumOf);
        long jLongValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            jLongValue += selector.invoke(n1.b(o1.s(sumOf, i10))).longValue();
        }
        return jLongValue;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, V> List<V> bd(long[] zip, R[] other, p<? super r1, ? super R, ? extends V> transform) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iMin = Math.min(s1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(r1.b(s1.s(zip, i10)), other[i10]));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean c0(byte[] any, l<? super j1, Boolean> predicate) {
        f0.p(any, "$this$any");
        f0.p(predicate, "predicate");
        int iV = k1.v(any);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(j1.b(k1.s(any, i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @u0(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @s
    @kotlin.l(hiddenSince = "1.4")
    public static final /* synthetic */ int c1(byte[] contentHashCode) {
        f0.p(contentHashCode, "$this$contentHashCode");
        return b1(contentHashCode);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<n1> c2(int[] dropWhile, l<? super n1, Boolean> predicate) {
        f0.p(dropWhile, "$this$dropWhile");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = o1.v(dropWhile);
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(dropWhile, i10);
            if (z10) {
                arrayList.add(n1.b(iS));
            } else if (!predicate.invoke(n1.b(iS)).booleanValue()) {
                arrayList.add(n1.b(iS));
                z10 = true;
            }
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte c3(byte[] first, l<? super j1, Boolean> predicate) {
        f0.p(first, "$this$first");
        f0.p(predicate, "predicate");
        int iV = k1.v(first);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(first, i10);
            if (predicate.invoke(j1.b(bS)).booleanValue()) {
                return bS;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0(version = "1.3")
    @s
    @f
    private static final void c4(long[] forEachIndexed, p<? super Integer, ? super r1, b2> action) {
        f0.p(forEachIndexed, "$this$forEachIndexed");
        f0.p(action, "action");
        int iV = s1.v(forEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), r1.b(s1.s(forEachIndexed, i10)));
            i10++;
            i11++;
        }
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int c5(int[] indexOfLast, l<? super n1, Boolean> predicate) {
        f0.p(indexOfLast, "$this$indexOfLast");
        f0.p(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i10 = length - 1;
            if (predicate.invoke(n1.b(n1.h(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i10 < 0) {
                return -1;
            }
            length = i10;
        }
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final double c6(int[] maxOf, l<? super n1, Double> selector) {
        f0.p(maxOf, "$this$maxOf");
        f0.p(selector, "selector");
        if (o1.y(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(n1.b(o1.s(maxOf, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(maxOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(n1.b(o1.s(maxOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R c7(byte[] minOf, l<? super j1, ? extends R> selector) {
        f0.p(minOf, "$this$minOf");
        f0.p(selector, "selector");
        if (k1.y(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(j1.b(k1.s(minOf, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(minOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(j1.b(k1.s(minOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean c8(short[] none) {
        f0.p(none, "$this$none");
        return y1.y(none);
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final r1 c9(long[] reduceOrNull, p<? super r1, ? super r1, r1> operation) {
        f0.p(reduceOrNull, "$this$reduceOrNull");
        f0.p(operation, "operation");
        if (s1.y(reduceOrNull)) {
            return null;
        }
        long jS = s1.s(reduceOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(reduceOrNull)).iterator();
        while (it.hasNext()) {
            jS = operation.invoke(r1.b(jS), r1.b(s1.s(reduceOrNull, it.nextInt()))).q0();
        }
        return r1.b(jS);
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final <R> List<R> ca(int[] scan, R r10, p<? super R, ? super n1, ? extends R> operation) {
        f0.p(scan, "$this$scan");
        f0.p(operation, "operation");
        if (o1.y(scan)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(o1.v(scan) + 1);
        arrayList.add(r10);
        int iV = o1.v(scan);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, n1.b(o1.s(scan, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static /* synthetic */ void cb(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = y1.v(sArr);
        }
        bb(sArr, i10, i11);
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfLong")
    @f
    private static final long cc(long[] sumOf, l<? super r1, Long> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iV = s1.v(sumOf);
        long jLongValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            jLongValue += selector.invoke(r1.b(s1.s(sumOf, i10))).longValue();
        }
        return jLongValue;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final <R> List<Pair<n1, R>> cd(@d int[] zip, @d R[] other) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        int iMin = Math.min(o1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iS = o1.s(zip, i10);
            arrayList.add(c1.a(n1.b(iS), other[i10]));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean d0(long[] any, l<? super r1, Boolean> predicate) {
        f0.p(any, "$this$any");
        f0.p(predicate, "predicate");
        int iV = s1.v(any);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(r1.b(s1.s(any, i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @u0(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @s
    @kotlin.l(hiddenSince = "1.4")
    public static final /* synthetic */ int d1(long[] contentHashCode) {
        f0.p(contentHashCode, "$this$contentHashCode");
        return h1(contentHashCode);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<x1> d2(short[] dropWhile, l<? super x1, Boolean> predicate) {
        f0.p(dropWhile, "$this$dropWhile");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = y1.v(dropWhile);
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(dropWhile, i10);
            if (z10) {
                arrayList.add(x1.b(s10));
            } else if (!predicate.invoke(x1.b(s10)).booleanValue()) {
                arrayList.add(x1.b(s10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long d3(long[] first, l<? super r1, Boolean> predicate) {
        f0.p(first, "$this$first");
        f0.p(predicate, "predicate");
        int iV = s1.v(first);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(first, i10);
            if (predicate.invoke(r1.b(jS)).booleanValue()) {
                return jS;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0(version = "1.3")
    @s
    @f
    private static final void d4(short[] forEachIndexed, p<? super Integer, ? super x1, b2> action) {
        f0.p(forEachIndexed, "$this$forEachIndexed");
        f0.p(action, "action");
        int iV = y1.v(forEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), x1.b(y1.s(forEachIndexed, i10)));
            i10++;
            i11++;
        }
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int d5(short[] indexOfLast, l<? super x1, Boolean> predicate) {
        f0.p(indexOfLast, "$this$indexOfLast");
        f0.p(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i10 = length - 1;
            if (predicate.invoke(x1.b(x1.h(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i10 < 0) {
                return -1;
            }
            length = i10;
        }
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final float d6(int[] maxOf, l<? super n1, Float> selector) {
        f0.p(maxOf, "$this$maxOf");
        f0.p(selector, "selector");
        if (o1.y(maxOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(n1.b(o1.s(maxOf, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(maxOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(n1.b(o1.s(maxOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final double d7(long[] minOf, l<? super r1, Double> selector) {
        f0.p(minOf, "$this$minOf");
        f0.p(selector, "selector");
        if (s1.y(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(r1.b(s1.s(minOf, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(minOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(r1.b(s1.s(minOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean d8(short[] none, l<? super x1, Boolean> predicate) {
        f0.p(none, "$this$none");
        f0.p(predicate, "predicate");
        int iV = y1.v(none);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(x1.b(y1.s(none, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final x1 d9(short[] reduceOrNull, p<? super x1, ? super x1, x1> operation) {
        f0.p(reduceOrNull, "$this$reduceOrNull");
        f0.p(operation, "operation");
        if (y1.y(reduceOrNull)) {
            return null;
        }
        short s10 = y1.s(reduceOrNull, 0);
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(reduceOrNull)).iterator();
        while (it.hasNext()) {
            s10 = operation.invoke(x1.b(s10), x1.b(y1.s(reduceOrNull, it.nextInt()))).o0();
        }
        return x1.b(s10);
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final <R> List<R> da(short[] scan, R r10, p<? super R, ? super x1, ? extends R> operation) {
        f0.p(scan, "$this$scan");
        f0.p(operation, "operation");
        if (y1.y(scan)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(y1.v(scan) + 1);
        arrayList.add(r10);
        int iV = y1.v(scan);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(r10, x1.b(y1.s(scan, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    public static final void db(@d byte[] sort) {
        f0.p(sort, "$this$sort");
        if (k1.v(sort) > 1) {
            h1.j(sort, 0, k1.v(sort));
        }
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfLong")
    @f
    private static final long dc(short[] sumOf, l<? super x1, Long> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iV = y1.v(sumOf);
        long jLongValue = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            jLongValue += selector.invoke(x1.b(y1.s(sumOf, i10))).longValue();
        }
        return jLongValue;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final <R> List<Pair<r1, R>> dd(@d long[] zip, @d Iterable<? extends R> other) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        int iV = s1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(c1.a(r1.b(s1.s(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean e0(long[] any) {
        f0.p(any, "$this$any");
        return ArraysKt___ArraysKt.O5(any);
    }

    @u0(version = "1.4")
    @s
    public static final int e1(@e int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short e2(short[] elementAtOrElse, int i10, l<? super Integer, x1> defaultValue) {
        f0.p(elementAtOrElse, "$this$elementAtOrElse");
        f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > ArraysKt___ArraysKt.Ye(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).o0() : y1.s(elementAtOrElse, i10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long e3(long[] first) {
        f0.p(first, "$this$first");
        return r1.h(ArraysKt___ArraysKt.qc(first));
    }

    @d
    public static final fi.l e4(@d int[] indices) {
        f0.p(indices, "$this$indices");
        return ArraysKt___ArraysKt.Me(indices);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int e5(int[] last) {
        f0.p(last, "$this$last");
        return n1.h(ArraysKt___ArraysKt.Xh(last));
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R e6(int[] maxOf, l<? super n1, ? extends R> selector) {
        f0.p(maxOf, "$this$maxOf");
        f0.p(selector, "selector");
        if (o1.y(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(n1.b(o1.s(maxOf, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(maxOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(n1.b(o1.s(maxOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final float e7(long[] minOf, l<? super r1, Float> selector) {
        f0.p(minOf, "$this$minOf");
        f0.p(selector, "selector");
        if (s1.y(minOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(r1.b(s1.s(minOf, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(minOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(r1.b(s1.s(minOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final byte[] e8(byte[] onEach, l<? super j1, b2> action) {
        f0.p(onEach, "$this$onEach");
        f0.p(action, "action");
        int iV = k1.v(onEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(j1.b(k1.s(onEach, i10)));
        }
        return onEach;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte e9(byte[] reduceRight, p<? super j1, ? super j1, j1> operation) {
        f0.p(reduceRight, "$this$reduceRight");
        f0.p(operation, "operation");
        int iRe = ArraysKt___ArraysKt.Re(reduceRight);
        if (iRe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bS = k1.s(reduceRight, iRe);
        for (int i10 = iRe - 1; i10 >= 0; i10--) {
            bS = operation.invoke(j1.b(k1.s(reduceRight, i10)), j1.b(bS)).o0();
        }
        return bS;
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final <R> List<R> ea(byte[] scanIndexed, R r10, yh.q<? super Integer, ? super R, ? super j1, ? extends R> operation) {
        f0.p(scanIndexed, "$this$scanIndexed");
        f0.p(operation, "operation");
        if (k1.y(scanIndexed)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(k1.v(scanIndexed) + 1);
        arrayList.add(r10);
        int iV = k1.v(scanIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, j1.b(k1.s(scanIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    public static final void eb(@d long[] sort) {
        f0.p(sort, "$this$sort");
        if (s1.v(sort) > 1) {
            h1.i(sort, 0, s1.v(sort));
        }
    }

    @u0(version = s0.f136928s)
    @h(name = "sumOfUByte")
    @e2(markerClass = {s.class})
    public static final int ec(@d j1[] j1VarArr) {
        f0.p(j1VarArr, "<this>");
        int iH = 0;
        for (j1 j1Var : j1VarArr) {
            iH = n1.h(iH + n1.h(j1Var.o0() & 255));
        }
        return iH;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final <R> List<Pair<n1, R>> ed(@d int[] zip, @d Iterable<? extends R> other) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        int iV = o1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(c1.a(n1.b(o1.s(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean f0(int[] any, l<? super n1, Boolean> predicate) {
        f0.p(any, "$this$any");
        f0.p(predicate, "predicate");
        int iV = o1.v(any);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(n1.b(o1.s(any, i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @u0(version = "1.4")
    @s
    public static final int f1(@e short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int f2(int[] elementAtOrElse, int i10, l<? super Integer, n1> defaultValue) {
        f0.p(elementAtOrElse, "$this$elementAtOrElse");
        f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > ArraysKt___ArraysKt.Ve(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).q0() : o1.s(elementAtOrElse, i10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int f3(int[] first, l<? super n1, Boolean> predicate) {
        f0.p(first, "$this$first");
        f0.p(predicate, "predicate");
        int iV = o1.v(first);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(first, i10);
            if (predicate.invoke(n1.b(iS)).booleanValue()) {
                return iS;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0(version = "1.3")
    @s
    public static /* synthetic */ void f4(int[] iArr) {
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte f5(byte[] last) {
        f0.p(last, "$this$last");
        return j1.h(ArraysKt___ArraysKt.Ph(last));
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final double f6(short[] maxOf, l<? super x1, Double> selector) {
        f0.p(maxOf, "$this$maxOf");
        f0.p(selector, "selector");
        if (y1.y(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(x1.b(y1.s(maxOf, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(maxOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(x1.b(y1.s(maxOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R f7(long[] minOf, l<? super r1, ? extends R> selector) {
        f0.p(minOf, "$this$minOf");
        f0.p(selector, "selector");
        if (s1.y(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(r1.b(s1.s(minOf, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(minOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(r1.b(s1.s(minOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final long[] f8(long[] onEach, l<? super r1, b2> action) {
        f0.p(onEach, "$this$onEach");
        f0.p(action, "action");
        int iV = s1.v(onEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(r1.b(s1.s(onEach, i10)));
        }
        return onEach;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int f9(int[] reduceRight, p<? super n1, ? super n1, n1> operation) {
        f0.p(reduceRight, "$this$reduceRight");
        f0.p(operation, "operation");
        int iVe = ArraysKt___ArraysKt.Ve(reduceRight);
        if (iVe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iS = o1.s(reduceRight, iVe);
        for (int i10 = iVe - 1; i10 >= 0; i10--) {
            iS = operation.invoke(n1.b(o1.s(reduceRight, i10)), n1.b(iS)).q0();
        }
        return iS;
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final <R> List<R> fa(short[] scanIndexed, R r10, yh.q<? super Integer, ? super R, ? super x1, ? extends R> operation) {
        f0.p(scanIndexed, "$this$scanIndexed");
        f0.p(operation, "operation");
        if (y1.y(scanIndexed)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(y1.v(scanIndexed) + 1);
        arrayList.add(r10);
        int iV = y1.v(scanIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, x1.b(y1.s(scanIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    public static final void fb(@d int[] sort, int i10, int i11) {
        f0.p(sort, "$this$sort");
        kotlin.collections.b.Companion.d(i10, i11, o1.v(sort));
        h1.l(sort, i10, i11);
    }

    @u0(version = s0.f136928s)
    @s
    @e2(markerClass = {s.class})
    @l0
    @h(name = "sumOfUInt")
    @f
    private static final int fc(byte[] sumOf, l<? super j1, n1> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iH = n1.h(0);
        int iV = k1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            iH = n1.h(iH + selector.invoke(j1.b(k1.s(sumOf, i10))).q0());
        }
        return iH;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <V> List<V> fd(byte[] zip, byte[] other, p<? super j1, ? super j1, ? extends V> transform) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iMin = Math.min(k1.v(zip), k1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(j1.b(k1.s(zip, i10)), j1.b(k1.s(other, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean g0(short[] any) {
        f0.p(any, "$this$any");
        return ArraysKt___ArraysKt.S5(any);
    }

    @u0(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @s
    @kotlin.l(hiddenSince = "1.4")
    public static final /* synthetic */ int g1(short[] contentHashCode) {
        f0.p(contentHashCode, "$this$contentHashCode");
        return f1(contentHashCode);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long g2(long[] elementAtOrElse, int i10, l<? super Integer, r1> defaultValue) {
        f0.p(elementAtOrElse, "$this$elementAtOrElse");
        f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > ArraysKt___ArraysKt.We(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).q0() : s1.s(elementAtOrElse, i10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short g3(short[] first) {
        f0.p(first, "$this$first");
        return x1.h(ArraysKt___ArraysKt.uc(first));
    }

    @d
    public static final fi.l g4(@d byte[] indices) {
        f0.p(indices, "$this$indices");
        return ArraysKt___ArraysKt.Ie(indices);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte g5(byte[] last, l<? super j1, Boolean> predicate) {
        f0.p(last, "$this$last");
        f0.p(predicate, "predicate");
        int iV = k1.v(last) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                byte bS = k1.s(last, iV);
                if (predicate.invoke(j1.b(bS)).booleanValue()) {
                    return bS;
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final float g6(short[] maxOf, l<? super x1, Float> selector) {
        f0.p(maxOf, "$this$maxOf");
        f0.p(selector, "selector");
        if (y1.y(maxOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(x1.b(y1.s(maxOf, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(maxOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(x1.b(y1.s(maxOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final double g7(int[] minOf, l<? super n1, Double> selector) {
        f0.p(minOf, "$this$minOf");
        f0.p(selector, "selector");
        if (o1.y(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(n1.b(o1.s(minOf, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(minOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(n1.b(o1.s(minOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final int[] g8(int[] onEach, l<? super n1, b2> action) {
        f0.p(onEach, "$this$onEach");
        f0.p(action, "action");
        int iV = o1.v(onEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(n1.b(o1.s(onEach, i10)));
        }
        return onEach;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long g9(long[] reduceRight, p<? super r1, ? super r1, r1> operation) {
        f0.p(reduceRight, "$this$reduceRight");
        f0.p(operation, "operation");
        int iWe = ArraysKt___ArraysKt.We(reduceRight);
        if (iWe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jS = s1.s(reduceRight, iWe);
        for (int i10 = iWe - 1; i10 >= 0; i10--) {
            jS = operation.invoke(r1.b(s1.s(reduceRight, i10)), r1.b(jS)).q0();
        }
        return jS;
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final <R> List<R> ga(long[] scanIndexed, R r10, yh.q<? super Integer, ? super R, ? super r1, ? extends R> operation) {
        f0.p(scanIndexed, "$this$scanIndexed");
        f0.p(operation, "operation");
        if (s1.y(scanIndexed)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(s1.v(scanIndexed) + 1);
        arrayList.add(r10);
        int iV = s1.v(scanIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, r1.b(s1.s(scanIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static /* synthetic */ void gb(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = o1.v(iArr);
        }
        fb(iArr, i10, i11);
    }

    @u0(version = s0.f136928s)
    @s
    @e2(markerClass = {s.class})
    @l0
    @h(name = "sumOfUInt")
    @f
    private static final int gc(int[] sumOf, l<? super n1, n1> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iH = n1.h(0);
        int iV = o1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            iH = n1.h(iH + selector.invoke(n1.b(o1.s(sumOf, i10))).q0());
        }
        return iH;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final <R> List<Pair<x1, R>> gd(@d short[] zip, @d Iterable<? extends R> other) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        int iV = y1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(c1.a(x1.b(y1.s(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final boolean h0(short[] any, l<? super x1, Boolean> predicate) {
        f0.p(any, "$this$any");
        f0.p(predicate, "predicate");
        int iV = y1.v(any);
        for (int i10 = 0; i10 < iV; i10++) {
            if (predicate.invoke(x1.b(y1.s(any, i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @u0(version = "1.4")
    @s
    public static final int h1(@e long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte h2(byte[] elementAtOrElse, int i10, l<? super Integer, j1> defaultValue) {
        f0.p(elementAtOrElse, "$this$elementAtOrElse");
        f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > ArraysKt___ArraysKt.Re(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).o0() : k1.s(elementAtOrElse, i10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short h3(short[] first, l<? super x1, Boolean> predicate) {
        f0.p(first, "$this$first");
        f0.p(predicate, "predicate");
        int iV = y1.v(first);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(first, i10);
            if (predicate.invoke(x1.b(s10)).booleanValue()) {
                return s10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0(version = "1.3")
    @s
    public static /* synthetic */ void h4(byte[] bArr) {
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long h5(long[] last, l<? super r1, Boolean> predicate) {
        f0.p(last, "$this$last");
        f0.p(predicate, "predicate");
        int iV = s1.v(last) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                long jS = s1.s(last, iV);
                if (predicate.invoke(r1.b(jS)).booleanValue()) {
                    return jS;
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R h6(short[] maxOf, l<? super x1, ? extends R> selector) {
        f0.p(maxOf, "$this$maxOf");
        f0.p(selector, "selector");
        if (y1.y(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(x1.b(y1.s(maxOf, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(maxOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(x1.b(y1.s(maxOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final float h7(int[] minOf, l<? super n1, Float> selector) {
        f0.p(minOf, "$this$minOf");
        f0.p(selector, "selector");
        if (o1.y(minOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(n1.b(o1.s(minOf, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(minOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(n1.b(o1.s(minOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final short[] h8(short[] onEach, l<? super x1, b2> action) {
        f0.p(onEach, "$this$onEach");
        f0.p(action, "action");
        int iV = y1.v(onEach);
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(x1.b(y1.s(onEach, i10)));
        }
        return onEach;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short h9(short[] reduceRight, p<? super x1, ? super x1, x1> operation) {
        f0.p(reduceRight, "$this$reduceRight");
        f0.p(operation, "operation");
        int iYe = ArraysKt___ArraysKt.Ye(reduceRight);
        if (iYe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s10 = y1.s(reduceRight, iYe);
        for (int i10 = iYe - 1; i10 >= 0; i10--) {
            s10 = operation.invoke(x1.b(y1.s(reduceRight, i10)), x1.b(s10)).o0();
        }
        return s10;
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final <R> List<R> ha(int[] scanIndexed, R r10, yh.q<? super Integer, ? super R, ? super n1, ? extends R> operation) {
        f0.p(scanIndexed, "$this$scanIndexed");
        f0.p(operation, "operation");
        if (o1.y(scanIndexed)) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(o1.v(scanIndexed) + 1);
        arrayList.add(r10);
        int iV = o1.v(scanIndexed);
        for (int i10 = 0; i10 < iV; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, n1.b(o1.s(scanIndexed, i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    public static final void hb(@d short[] sort) {
        f0.p(sort, "$this$sort");
        if (y1.v(sort) > 1) {
            h1.k(sort, 0, y1.v(sort));
        }
    }

    @u0(version = s0.f136928s)
    @s
    @e2(markerClass = {s.class})
    @l0
    @h(name = "sumOfUInt")
    @f
    private static final int hc(long[] sumOf, l<? super r1, n1> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iH = n1.h(0);
        int iV = s1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            iH = n1.h(iH + selector.invoke(r1.b(s1.s(sumOf, i10))).q0());
        }
        return iH;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final <R> List<Pair<j1, R>> hd(@d byte[] zip, @d Iterable<? extends R> other) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        int iV = k1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(c1.a(j1.b(k1.s(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte[] i0(byte[] asByteArray) {
        f0.p(asByteArray, "$this$asByteArray");
        return asByteArray;
    }

    @u0(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @s
    @kotlin.l(hiddenSince = "1.4")
    public static final /* synthetic */ String i1(int[] contentToString) {
        f0.p(contentToString, "$this$contentToString");
        return m1(contentToString);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final j1 i2(byte[] elementAtOrNull, int i10) {
        f0.p(elementAtOrNull, "$this$elementAtOrNull");
        return y4(elementAtOrNull, i10);
    }

    @u0(version = "1.3")
    @s
    @e
    public static final n1 i3(@d int[] firstOrNull) {
        f0.p(firstOrNull, "$this$firstOrNull");
        if (o1.y(firstOrNull)) {
            return null;
        }
        return n1.b(o1.s(firstOrNull, 0));
    }

    @d
    public static final fi.l i4(@d long[] indices) {
        f0.p(indices, "$this$indices");
        return ArraysKt___ArraysKt.Ne(indices);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long i5(long[] last) {
        f0.p(last, "$this$last");
        return r1.h(ArraysKt___ArraysKt.Zh(last));
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R i6(byte[] maxOfOrNull, l<? super j1, ? extends R> selector) {
        f0.p(maxOfOrNull, "$this$maxOfOrNull");
        f0.p(selector, "selector");
        if (k1.y(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(j1.b(k1.s(maxOfOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(j1.b(k1.s(maxOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R i7(int[] minOf, l<? super n1, ? extends R> selector) {
        f0.p(minOf, "$this$minOf");
        f0.p(selector, "selector");
        if (o1.y(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(n1.b(o1.s(minOf, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(minOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(n1.b(o1.s(minOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final byte[] i8(byte[] onEachIndexed, p<? super Integer, ? super j1, b2> action) {
        f0.p(onEachIndexed, "$this$onEachIndexed");
        f0.p(action, "action");
        int iV = k1.v(onEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), j1.b(k1.s(onEachIndexed, i10)));
            i10++;
            i11++;
        }
        return onEachIndexed;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int i9(int[] reduceRightIndexed, yh.q<? super Integer, ? super n1, ? super n1, n1> operation) {
        f0.p(reduceRightIndexed, "$this$reduceRightIndexed");
        f0.p(operation, "operation");
        int iVe = ArraysKt___ArraysKt.Ve(reduceRightIndexed);
        if (iVe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iS = o1.s(reduceRightIndexed, iVe);
        for (int i10 = iVe - 1; i10 >= 0; i10--) {
            iS = operation.invoke(Integer.valueOf(i10), n1.b(o1.s(reduceRightIndexed, i10)), n1.b(iS)).q0();
        }
        return iS;
    }

    @u0(version = "1.4")
    @s
    public static final void ia(@d int[] shuffle) {
        f0.p(shuffle, "$this$shuffle");
        ja(shuffle, Random.f125033b);
    }

    @u0(version = "1.3")
    @s
    public static final void ib(@d int[] sortDescending) {
        f0.p(sortDescending, "$this$sortDescending");
        if (o1.v(sortDescending) > 1) {
            Wa(sortDescending);
            ArraysKt___ArraysKt.yr(sortDescending);
        }
    }

    @u0(version = s0.f136928s)
    @h(name = "sumOfUInt")
    @e2(markerClass = {s.class})
    public static final int ic(@d n1[] n1VarArr) {
        f0.p(n1VarArr, "<this>");
        int iH = 0;
        for (n1 n1Var : n1VarArr) {
            iH = n1.h(iH + n1Var.q0());
        }
        return iH;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <V> List<V> id(int[] zip, int[] other, p<? super n1, ? super n1, ? extends V> transform) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iMin = Math.min(o1.v(zip), o1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(n1.b(o1.s(zip, i10)), n1.b(o1.s(other, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int[] j0(int[] asIntArray) {
        f0.p(asIntArray, "$this$asIntArray");
        return asIntArray;
    }

    @u0(version = "1.4")
    @d
    @s
    public static final String j1(@e byte[] bArr) {
        String strH3;
        return (bArr == null || (strH3 = CollectionsKt___CollectionsKt.h3(k1.b(bArr), ", ", Constants.ARRAY_TYPE, "]", 0, null, null, 56, null)) == null) ? "null" : strH3;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final x1 j2(short[] elementAtOrNull, int i10) {
        f0.p(elementAtOrNull, "$this$elementAtOrNull");
        return z4(elementAtOrNull, i10);
    }

    @u0(version = "1.3")
    @s
    @e
    public static final j1 j3(@d byte[] firstOrNull) {
        f0.p(firstOrNull, "$this$firstOrNull");
        if (k1.y(firstOrNull)) {
            return null;
        }
        return j1.b(k1.s(firstOrNull, 0));
    }

    @u0(version = "1.3")
    @s
    public static /* synthetic */ void j4(long[] jArr) {
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int j5(int[] last, l<? super n1, Boolean> predicate) {
        f0.p(last, "$this$last");
        f0.p(predicate, "predicate");
        int iV = o1.v(last) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                int iS = o1.s(last, iV);
                if (predicate.invoke(n1.b(iS)).booleanValue()) {
                    return iS;
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Double j6(byte[] maxOfOrNull, l<? super j1, Double> selector) {
        f0.p(maxOfOrNull, "$this$maxOfOrNull");
        f0.p(selector, "selector");
        if (k1.y(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(j1.b(k1.s(maxOfOrNull, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(j1.b(k1.s(maxOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final double j7(short[] minOf, l<? super x1, Double> selector) {
        f0.p(minOf, "$this$minOf");
        f0.p(selector, "selector");
        if (y1.y(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(x1.b(y1.s(minOf, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(minOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(x1.b(y1.s(minOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final int[] j8(int[] onEachIndexed, p<? super Integer, ? super n1, b2> action) {
        f0.p(onEachIndexed, "$this$onEachIndexed");
        f0.p(action, "action");
        int iV = o1.v(onEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), n1.b(o1.s(onEachIndexed, i10)));
            i10++;
            i11++;
        }
        return onEachIndexed;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte j9(byte[] reduceRightIndexed, yh.q<? super Integer, ? super j1, ? super j1, j1> operation) {
        f0.p(reduceRightIndexed, "$this$reduceRightIndexed");
        f0.p(operation, "operation");
        int iRe = ArraysKt___ArraysKt.Re(reduceRightIndexed);
        if (iRe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bS = k1.s(reduceRightIndexed, iRe);
        for (int i10 = iRe - 1; i10 >= 0; i10--) {
            bS = operation.invoke(Integer.valueOf(i10), j1.b(k1.s(reduceRightIndexed, i10)), j1.b(bS)).o0();
        }
        return bS;
    }

    @u0(version = "1.4")
    @s
    public static final void ja(@d int[] shuffle, @d Random random) {
        f0.p(shuffle, "$this$shuffle");
        f0.p(random, "random");
        for (int iVe = ArraysKt___ArraysKt.Ve(shuffle); iVe > 0; iVe--) {
            int iM = random.m(iVe + 1);
            int iS = o1.s(shuffle, iVe);
            o1.B(shuffle, iVe, o1.s(shuffle, iM));
            o1.B(shuffle, iM, iS);
        }
    }

    @u0(version = "1.4")
    @s
    public static final void jb(@d long[] sortDescending, int i10, int i11) {
        f0.p(sortDescending, "$this$sortDescending");
        Xa(sortDescending, i10, i11);
        ArraysKt___ArraysKt.Br(sortDescending, i10, i11);
    }

    @u0(version = s0.f136928s)
    @s
    @e2(markerClass = {s.class})
    @l0
    @h(name = "sumOfUInt")
    @f
    private static final int jc(short[] sumOf, l<? super x1, n1> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        int iH = n1.h(0);
        int iV = y1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            iH = n1.h(iH + selector.invoke(x1.b(y1.s(sumOf, i10))).q0());
        }
        return iH;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, V> List<V> jd(byte[] zip, R[] other, p<? super j1, ? super R, ? extends V> transform) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iMin = Math.min(k1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(j1.b(k1.s(zip, i10)), other[i10]));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long[] k0(long[] asLongArray) {
        f0.p(asLongArray, "$this$asLongArray");
        return asLongArray;
    }

    @u0(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @s
    @kotlin.l(hiddenSince = "1.4")
    public static final /* synthetic */ String k1(byte[] contentToString) {
        f0.p(contentToString, "$this$contentToString");
        return j1(contentToString);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final n1 k2(int[] elementAtOrNull, int i10) {
        f0.p(elementAtOrNull, "$this$elementAtOrNull");
        return A4(elementAtOrNull, i10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final j1 k3(byte[] firstOrNull, l<? super j1, Boolean> predicate) {
        f0.p(firstOrNull, "$this$firstOrNull");
        f0.p(predicate, "predicate");
        int iV = k1.v(firstOrNull);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(firstOrNull, i10);
            if (predicate.invoke(j1.b(bS)).booleanValue()) {
                return j1.b(bS);
            }
        }
        return null;
    }

    @d
    public static final fi.l k4(@d short[] indices) {
        f0.p(indices, "$this$indices");
        return ArraysKt___ArraysKt.Pe(indices);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short k5(short[] last) {
        f0.p(last, "$this$last");
        return x1.h(ArraysKt___ArraysKt.di(last));
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Float k6(byte[] maxOfOrNull, l<? super j1, Float> selector) {
        f0.p(maxOfOrNull, "$this$maxOfOrNull");
        f0.p(selector, "selector");
        if (k1.y(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(j1.b(k1.s(maxOfOrNull, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(j1.b(k1.s(maxOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final float k7(short[] minOf, l<? super x1, Float> selector) {
        f0.p(minOf, "$this$minOf");
        f0.p(selector, "selector");
        if (y1.y(minOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(x1.b(y1.s(minOf, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(minOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(x1.b(y1.s(minOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final long[] k8(long[] onEachIndexed, p<? super Integer, ? super r1, b2> action) {
        f0.p(onEachIndexed, "$this$onEachIndexed");
        f0.p(action, "action");
        int iV = s1.v(onEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), r1.b(s1.s(onEachIndexed, i10)));
            i10++;
            i11++;
        }
        return onEachIndexed;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short k9(short[] reduceRightIndexed, yh.q<? super Integer, ? super x1, ? super x1, x1> operation) {
        f0.p(reduceRightIndexed, "$this$reduceRightIndexed");
        f0.p(operation, "operation");
        int iYe = ArraysKt___ArraysKt.Ye(reduceRightIndexed);
        if (iYe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s10 = y1.s(reduceRightIndexed, iYe);
        for (int i10 = iYe - 1; i10 >= 0; i10--) {
            s10 = operation.invoke(Integer.valueOf(i10), x1.b(y1.s(reduceRightIndexed, i10)), x1.b(s10)).o0();
        }
        return s10;
    }

    @u0(version = "1.4")
    @s
    public static final void ka(@d byte[] shuffle) {
        f0.p(shuffle, "$this$shuffle");
        na(shuffle, Random.f125033b);
    }

    @u0(version = "1.4")
    @s
    public static final void kb(@d byte[] sortDescending, int i10, int i11) {
        f0.p(sortDescending, "$this$sortDescending");
        Za(sortDescending, i10, i11);
        ArraysKt___ArraysKt.rr(sortDescending, i10, i11);
    }

    @u0(version = s0.f136928s)
    @s
    @e2(markerClass = {s.class})
    @l0
    @h(name = "sumOfULong")
    @f
    private static final long kc(byte[] sumOf, l<? super j1, r1> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        long jH = r1.h(0L);
        int iV = k1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            jH = r1.h(jH + selector.invoke(j1.b(k1.s(sumOf, i10))).q0());
        }
        return jH;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <V> List<V> kd(long[] zip, long[] other, p<? super r1, ? super r1, ? extends V> transform) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iMin = Math.min(s1.v(zip), s1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(r1.b(s1.s(zip, i10)), r1.b(s1.s(other, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short[] l0(short[] asShortArray) {
        f0.p(asShortArray, "$this$asShortArray");
        return asShortArray;
    }

    @u0(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @s
    @kotlin.l(hiddenSince = "1.4")
    public static final /* synthetic */ String l1(long[] contentToString) {
        f0.p(contentToString, "$this$contentToString");
        return p1(contentToString);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final r1 l2(long[] elementAtOrNull, int i10) {
        f0.p(elementAtOrNull, "$this$elementAtOrNull");
        return B4(elementAtOrNull, i10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final r1 l3(long[] firstOrNull, l<? super r1, Boolean> predicate) {
        f0.p(firstOrNull, "$this$firstOrNull");
        f0.p(predicate, "predicate");
        int iV = s1.v(firstOrNull);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(firstOrNull, i10);
            if (predicate.invoke(r1.b(jS)).booleanValue()) {
                return r1.b(jS);
            }
        }
        return null;
    }

    @u0(version = "1.3")
    @s
    public static /* synthetic */ void l4(short[] sArr) {
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short l5(short[] last, l<? super x1, Boolean> predicate) {
        f0.p(last, "$this$last");
        f0.p(predicate, "predicate");
        int iV = y1.v(last) - 1;
        if (iV >= 0) {
            while (true) {
                int i10 = iV - 1;
                short s10 = y1.s(last, iV);
                if (predicate.invoke(x1.b(s10)).booleanValue()) {
                    return s10;
                }
                if (i10 >= 0) {
                    iV = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R l6(long[] maxOfOrNull, l<? super r1, ? extends R> selector) {
        f0.p(maxOfOrNull, "$this$maxOfOrNull");
        f0.p(selector, "selector");
        if (s1.y(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(r1.b(s1.s(maxOfOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(r1.b(s1.s(maxOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R l7(short[] minOf, l<? super x1, ? extends R> selector) {
        f0.p(minOf, "$this$minOf");
        f0.p(selector, "selector");
        if (y1.y(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(x1.b(y1.s(minOf, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(minOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(x1.b(y1.s(minOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final short[] l8(short[] onEachIndexed, p<? super Integer, ? super x1, b2> action) {
        f0.p(onEachIndexed, "$this$onEachIndexed");
        f0.p(action, "action");
        int iV = y1.v(onEachIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            action.invoke(Integer.valueOf(i11), x1.b(y1.s(onEachIndexed, i10)));
            i10++;
            i11++;
        }
        return onEachIndexed;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long l9(long[] reduceRightIndexed, yh.q<? super Integer, ? super r1, ? super r1, r1> operation) {
        f0.p(reduceRightIndexed, "$this$reduceRightIndexed");
        f0.p(operation, "operation");
        int iWe = ArraysKt___ArraysKt.We(reduceRightIndexed);
        if (iWe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jS = s1.s(reduceRightIndexed, iWe);
        for (int i10 = iWe - 1; i10 >= 0; i10--) {
            jS = operation.invoke(Integer.valueOf(i10), r1.b(s1.s(reduceRightIndexed, i10)), r1.b(jS)).q0();
        }
        return jS;
    }

    @u0(version = "1.4")
    @s
    public static final void la(@d long[] shuffle, @d Random random) {
        f0.p(shuffle, "$this$shuffle");
        f0.p(random, "random");
        for (int iWe = ArraysKt___ArraysKt.We(shuffle); iWe > 0; iWe--) {
            int iM = random.m(iWe + 1);
            long jS = s1.s(shuffle, iWe);
            s1.B(shuffle, iWe, s1.s(shuffle, iM));
            s1.B(shuffle, iM, jS);
        }
    }

    @u0(version = "1.4")
    @s
    public static final void lb(@d short[] sortDescending, int i10, int i11) {
        f0.p(sortDescending, "$this$sortDescending");
        bb(sortDescending, i10, i11);
        ArraysKt___ArraysKt.Fr(sortDescending, i10, i11);
    }

    @u0(version = s0.f136928s)
    @s
    @e2(markerClass = {s.class})
    @l0
    @h(name = "sumOfULong")
    @f
    private static final long lc(int[] sumOf, l<? super n1, r1> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        long jH = r1.h(0L);
        int iV = o1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            jH = r1.h(jH + selector.invoke(n1.b(o1.s(sumOf, i10))).q0());
        }
        return jH;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, V> List<V> ld(long[] zip, Iterable<? extends R> other, p<? super r1, ? super R, ? extends V> transform) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iV = s1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(transform.invoke(r1.b(s1.s(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte[] m0(byte[] bArr) {
        f0.p(bArr, "<this>");
        return k1.g(bArr);
    }

    @u0(version = "1.4")
    @d
    @s
    public static final String m1(@e int[] iArr) {
        String strH3;
        return (iArr == null || (strH3 = CollectionsKt___CollectionsKt.h3(o1.b(iArr), ", ", Constants.ARRAY_TYPE, "]", 0, null, null, 56, null)) == null) ? "null" : strH3;
    }

    @u0(version = "1.3")
    @s
    public static final void m2(@d int[] fill, int i10, int i11, int i12) {
        f0.p(fill, "$this$fill");
        m.l2(fill, i10, i11, i12);
    }

    @u0(version = "1.3")
    @s
    @e
    public static final r1 m3(@d long[] firstOrNull) {
        f0.p(firstOrNull, "$this$firstOrNull");
        if (s1.y(firstOrNull)) {
            return null;
        }
        return r1.b(s1.s(firstOrNull, 0));
    }

    public static final int m4(@d int[] lastIndex) {
        f0.p(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.Ve(lastIndex);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int m5(long[] lastIndexOf, long j10) {
        f0.p(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.mi(lastIndexOf, j10);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Double m6(long[] maxOfOrNull, l<? super r1, Double> selector) {
        f0.p(maxOfOrNull, "$this$maxOfOrNull");
        f0.p(selector, "selector");
        if (s1.y(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(r1.b(s1.s(maxOfOrNull, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(r1.b(s1.s(maxOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R m7(byte[] minOfOrNull, l<? super j1, ? extends R> selector) {
        f0.p(minOfOrNull, "$this$minOfOrNull");
        f0.p(selector, "selector");
        if (k1.y(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(j1.b(k1.s(minOfOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(minOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(j1.b(k1.s(minOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long[] m8(long[] plus, long j10) {
        f0.p(plus, "$this$plus");
        return s1.g(m.U3(plus, j10));
    }

    @u0(version = "1.4")
    @s
    @f
    private static final n1 m9(int[] reduceRightIndexedOrNull, yh.q<? super Integer, ? super n1, ? super n1, n1> operation) {
        f0.p(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        f0.p(operation, "operation");
        int iVe = ArraysKt___ArraysKt.Ve(reduceRightIndexedOrNull);
        if (iVe < 0) {
            return null;
        }
        int iS = o1.s(reduceRightIndexedOrNull, iVe);
        for (int i10 = iVe - 1; i10 >= 0; i10--) {
            iS = operation.invoke(Integer.valueOf(i10), n1.b(o1.s(reduceRightIndexedOrNull, i10)), n1.b(iS)).q0();
        }
        return n1.b(iS);
    }

    @u0(version = "1.4")
    @s
    public static final void ma(@d long[] shuffle) {
        f0.p(shuffle, "$this$shuffle");
        la(shuffle, Random.f125033b);
    }

    @u0(version = "1.3")
    @s
    public static final void mb(@d byte[] sortDescending) {
        f0.p(sortDescending, "$this$sortDescending");
        if (k1.v(sortDescending) > 1) {
            db(sortDescending);
            ArraysKt___ArraysKt.qr(sortDescending);
        }
    }

    @u0(version = s0.f136928s)
    @s
    @e2(markerClass = {s.class})
    @l0
    @h(name = "sumOfULong")
    @f
    private static final long mc(long[] sumOf, l<? super r1, r1> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        long jH = r1.h(0L);
        int iV = s1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            jH = r1.h(jH + selector.invoke(r1.b(s1.s(sumOf, i10))).q0());
        }
        return jH;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, V> List<V> md(byte[] zip, Iterable<? extends R> other, p<? super j1, ? super R, ? extends V> transform) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iV = k1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(transform.invoke(j1.b(k1.s(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int[] n0(int[] iArr) {
        f0.p(iArr, "<this>");
        return o1.g(iArr);
    }

    @u0(version = "1.4")
    @d
    @s
    public static final String n1(@e short[] sArr) {
        String strH3;
        return (sArr == null || (strH3 = CollectionsKt___CollectionsKt.h3(y1.b(sArr), ", ", Constants.ARRAY_TYPE, "]", 0, null, null, 56, null)) == null) ? "null" : strH3;
    }

    public static /* synthetic */ void n2(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = o1.v(iArr);
        }
        m2(iArr, i10, i11, i12);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final n1 n3(int[] firstOrNull, l<? super n1, Boolean> predicate) {
        f0.p(firstOrNull, "$this$firstOrNull");
        f0.p(predicate, "predicate");
        int iV = o1.v(firstOrNull);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(firstOrNull, i10);
            if (predicate.invoke(n1.b(iS)).booleanValue()) {
                return n1.b(iS);
            }
        }
        return null;
    }

    @u0(version = "1.3")
    @s
    public static /* synthetic */ void n4(int[] iArr) {
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int n5(short[] lastIndexOf, short s10) {
        f0.p(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.oi(lastIndexOf, s10);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Float n6(long[] maxOfOrNull, l<? super r1, Float> selector) {
        f0.p(maxOfOrNull, "$this$maxOfOrNull");
        f0.p(selector, "selector");
        if (s1.y(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(r1.b(s1.s(maxOfOrNull, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(r1.b(s1.s(maxOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Double n7(byte[] minOfOrNull, l<? super j1, Double> selector) {
        f0.p(minOfOrNull, "$this$minOfOrNull");
        f0.p(selector, "selector");
        if (k1.y(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(j1.b(k1.s(minOfOrNull, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(minOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(j1.b(k1.s(minOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final int[] n8(@d int[] plus, @d Collection<n1> elements) {
        f0.p(plus, "$this$plus");
        f0.p(elements, "elements");
        int iV = o1.v(plus);
        int[] iArrCopyOf = Arrays.copyOf(plus, o1.v(plus) + elements.size());
        f0.o(iArrCopyOf, "copyOf(this, newSize)");
        Iterator<n1> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[iV] = it.next().q0();
            iV++;
        }
        return o1.g(iArrCopyOf);
    }

    @u0(version = "1.4")
    @s
    @f
    private static final j1 n9(byte[] reduceRightIndexedOrNull, yh.q<? super Integer, ? super j1, ? super j1, j1> operation) {
        f0.p(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        f0.p(operation, "operation");
        int iRe = ArraysKt___ArraysKt.Re(reduceRightIndexedOrNull);
        if (iRe < 0) {
            return null;
        }
        byte bS = k1.s(reduceRightIndexedOrNull, iRe);
        for (int i10 = iRe - 1; i10 >= 0; i10--) {
            bS = operation.invoke(Integer.valueOf(i10), j1.b(k1.s(reduceRightIndexedOrNull, i10)), j1.b(bS)).o0();
        }
        return j1.b(bS);
    }

    @u0(version = "1.4")
    @s
    public static final void na(@d byte[] shuffle, @d Random random) {
        f0.p(shuffle, "$this$shuffle");
        f0.p(random, "random");
        for (int iRe = ArraysKt___ArraysKt.Re(shuffle); iRe > 0; iRe--) {
            int iM = random.m(iRe + 1);
            byte bS = k1.s(shuffle, iRe);
            k1.B(shuffle, iRe, k1.s(shuffle, iM));
            k1.B(shuffle, iM, bS);
        }
    }

    @u0(version = "1.3")
    @s
    public static final void nb(@d long[] sortDescending) {
        f0.p(sortDescending, "$this$sortDescending");
        if (s1.v(sortDescending) > 1) {
            eb(sortDescending);
            ArraysKt___ArraysKt.Ar(sortDescending);
        }
    }

    @u0(version = s0.f136928s)
    @h(name = "sumOfULong")
    @e2(markerClass = {s.class})
    public static final long nc(@d r1[] r1VarArr) {
        f0.p(r1VarArr, "<this>");
        long jH = 0;
        for (r1 r1Var : r1VarArr) {
            jH = r1.h(jH + r1Var.q0());
        }
        return jH;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, V> List<V> nd(int[] zip, R[] other, p<? super n1, ? super R, ? extends V> transform) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iMin = Math.min(o1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(n1.b(o1.s(zip, i10)), other[i10]));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long[] o0(long[] jArr) {
        f0.p(jArr, "<this>");
        return s1.g(jArr);
    }

    @u0(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @s
    @kotlin.l(hiddenSince = "1.4")
    public static final /* synthetic */ String o1(short[] contentToString) {
        f0.p(contentToString, "$this$contentToString");
        return n1(contentToString);
    }

    @u0(version = "1.3")
    @s
    public static final void o2(@d short[] fill, short s10, int i10, int i11) {
        f0.p(fill, "$this$fill");
        m.o2(fill, s10, i10, i11);
    }

    @u0(version = "1.3")
    @s
    @e
    public static final x1 o3(@d short[] firstOrNull) {
        f0.p(firstOrNull, "$this$firstOrNull");
        if (y1.y(firstOrNull)) {
            return null;
        }
        return x1.b(y1.s(firstOrNull, 0));
    }

    public static final int o4(@d byte[] lastIndex) {
        f0.p(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.Re(lastIndex);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int o5(byte[] lastIndexOf, byte b10) {
        f0.p(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.hi(lastIndexOf, b10);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R o6(int[] maxOfOrNull, l<? super n1, ? extends R> selector) {
        f0.p(maxOfOrNull, "$this$maxOfOrNull");
        f0.p(selector, "selector");
        if (o1.y(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(n1.b(o1.s(maxOfOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(n1.b(o1.s(maxOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Float o7(byte[] minOfOrNull, l<? super j1, Float> selector) {
        f0.p(minOfOrNull, "$this$minOfOrNull");
        f0.p(selector, "selector");
        if (k1.y(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(j1.b(k1.s(minOfOrNull, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(minOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(j1.b(k1.s(minOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short[] o8(short[] plus, short s10) {
        f0.p(plus, "$this$plus");
        return y1.g(m.b4(plus, s10));
    }

    @u0(version = "1.4")
    @s
    @f
    private static final x1 o9(short[] reduceRightIndexedOrNull, yh.q<? super Integer, ? super x1, ? super x1, x1> operation) {
        f0.p(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        f0.p(operation, "operation");
        int iYe = ArraysKt___ArraysKt.Ye(reduceRightIndexedOrNull);
        if (iYe < 0) {
            return null;
        }
        short s10 = y1.s(reduceRightIndexedOrNull, iYe);
        for (int i10 = iYe - 1; i10 >= 0; i10--) {
            s10 = operation.invoke(Integer.valueOf(i10), x1.b(y1.s(reduceRightIndexedOrNull, i10)), x1.b(s10)).o0();
        }
        return x1.b(s10);
    }

    @u0(version = "1.4")
    @s
    public static final void oa(@d short[] shuffle) {
        f0.p(shuffle, "$this$shuffle");
        pa(shuffle, Random.f125033b);
    }

    @u0(version = "1.4")
    @s
    public static final void ob(@d int[] sortDescending, int i10, int i11) {
        f0.p(sortDescending, "$this$sortDescending");
        fb(sortDescending, i10, i11);
        ArraysKt___ArraysKt.zr(sortDescending, i10, i11);
    }

    @u0(version = s0.f136928s)
    @s
    @e2(markerClass = {s.class})
    @l0
    @h(name = "sumOfULong")
    @f
    private static final long oc(short[] sumOf, l<? super x1, r1> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        long jH = r1.h(0L);
        int iV = y1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            jH = r1.h(jH + selector.invoke(x1.b(y1.s(sumOf, i10))).q0());
        }
        return jH;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<Pair<n1, n1>> od(@d int[] zip, @d int[] other) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        int iMin = Math.min(o1.v(zip), o1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(c1.a(n1.b(o1.s(zip, i10)), n1.b(o1.s(other, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short[] p0(short[] sArr) {
        f0.p(sArr, "<this>");
        return y1.g(sArr);
    }

    @u0(version = "1.4")
    @d
    @s
    public static final String p1(@e long[] jArr) {
        String strH3;
        return (jArr == null || (strH3 = CollectionsKt___CollectionsKt.h3(s1.b(jArr), ", ", Constants.ARRAY_TYPE, "]", 0, null, null, 56, null)) == null) ? "null" : strH3;
    }

    public static /* synthetic */ void p2(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = y1.v(sArr);
        }
        o2(sArr, s10, i10, i11);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final x1 p3(short[] firstOrNull, l<? super x1, Boolean> predicate) {
        f0.p(firstOrNull, "$this$firstOrNull");
        f0.p(predicate, "predicate");
        int iV = y1.v(firstOrNull);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(firstOrNull, i10);
            if (predicate.invoke(x1.b(s10)).booleanValue()) {
                return x1.b(s10);
            }
        }
        return null;
    }

    @u0(version = "1.3")
    @s
    public static /* synthetic */ void p4(byte[] bArr) {
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int p5(int[] lastIndexOf, int i10) {
        f0.p(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.li(lastIndexOf, i10);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Double p6(int[] maxOfOrNull, l<? super n1, Double> selector) {
        f0.p(maxOfOrNull, "$this$maxOfOrNull");
        f0.p(selector, "selector");
        if (o1.y(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(n1.b(o1.s(maxOfOrNull, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(n1.b(o1.s(maxOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R p7(long[] minOfOrNull, l<? super r1, ? extends R> selector) {
        f0.p(minOfOrNull, "$this$minOfOrNull");
        f0.p(selector, "selector");
        if (s1.y(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(r1.b(s1.s(minOfOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(minOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(r1.b(s1.s(minOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int[] p8(int[] plus, int[] elements) {
        f0.p(plus, "$this$plus");
        f0.p(elements, "elements");
        return o1.g(m.T3(plus, elements));
    }

    @u0(version = "1.4")
    @s
    @f
    private static final r1 p9(long[] reduceRightIndexedOrNull, yh.q<? super Integer, ? super r1, ? super r1, r1> operation) {
        f0.p(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        f0.p(operation, "operation");
        int iWe = ArraysKt___ArraysKt.We(reduceRightIndexedOrNull);
        if (iWe < 0) {
            return null;
        }
        long jS = s1.s(reduceRightIndexedOrNull, iWe);
        for (int i10 = iWe - 1; i10 >= 0; i10--) {
            jS = operation.invoke(Integer.valueOf(i10), r1.b(s1.s(reduceRightIndexedOrNull, i10)), r1.b(jS)).q0();
        }
        return r1.b(jS);
    }

    @u0(version = "1.4")
    @s
    public static final void pa(@d short[] shuffle, @d Random random) {
        f0.p(shuffle, "$this$shuffle");
        f0.p(random, "random");
        for (int iYe = ArraysKt___ArraysKt.Ye(shuffle); iYe > 0; iYe--) {
            int iM = random.m(iYe + 1);
            short s10 = y1.s(shuffle, iYe);
            y1.B(shuffle, iYe, y1.s(shuffle, iM));
            y1.B(shuffle, iM, s10);
        }
    }

    @u0(version = "1.3")
    @s
    public static final void pb(@d short[] sortDescending) {
        f0.p(sortDescending, "$this$sortDescending");
        if (y1.v(sortDescending) > 1) {
            hb(sortDescending);
            ArraysKt___ArraysKt.Er(sortDescending);
        }
    }

    @u0(version = s0.f136928s)
    @h(name = "sumOfUShort")
    @e2(markerClass = {s.class})
    public static final int pc(@d x1[] x1VarArr) {
        f0.p(x1VarArr, "<this>");
        int iH = 0;
        for (x1 x1Var : x1VarArr) {
            iH = n1.h(iH + n1.h(x1Var.o0() & x1.f128661e));
        }
        return iH;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, V> List<V> pd(short[] zip, R[] other, p<? super x1, ? super R, ? extends V> transform) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iMin = Math.min(y1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(x1.b(y1.s(zip, i10)), other[i10]));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <V> Map<j1, V> q0(byte[] associateWith, l<? super j1, ? extends V> valueSelector) {
        f0.p(associateWith, "$this$associateWith");
        f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(r0.j(k1.v(associateWith)), 16));
        int iV = k1.v(associateWith);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(associateWith, i10);
            linkedHashMap.put(j1.b(bS), valueSelector.invoke(j1.b(bS)));
        }
        return linkedHashMap;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long[] q1(long[] copyInto, long[] destination, int i10, int i11, int i12) {
        f0.p(copyInto, "$this$copyInto");
        f0.p(destination, "destination");
        m.b1(copyInto, destination, i10, i11, i12);
        return destination;
    }

    @u0(version = "1.3")
    @s
    public static final void q2(@d long[] fill, long j10, int i10, int i11) {
        f0.p(fill, "$this$fill");
        m.m2(fill, j10, i10, i11);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> List<R> q3(byte[] flatMap, l<? super j1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMap, "$this$flatMap");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = k1.v(flatMap);
        for (int i10 = 0; i10 < iV; i10++) {
            x.n0(arrayList, transform.invoke(j1.b(k1.s(flatMap, i10))));
        }
        return arrayList;
    }

    public static final int q4(@d long[] lastIndex) {
        f0.p(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.We(lastIndex);
    }

    @u0(version = "1.3")
    @s
    @e
    public static final n1 q5(@d int[] lastOrNull) {
        f0.p(lastOrNull, "$this$lastOrNull");
        if (o1.y(lastOrNull)) {
            return null;
        }
        return n1.b(o1.s(lastOrNull, o1.v(lastOrNull) - 1));
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Float q6(int[] maxOfOrNull, l<? super n1, Float> selector) {
        f0.p(maxOfOrNull, "$this$maxOfOrNull");
        f0.p(selector, "selector");
        if (o1.y(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(n1.b(o1.s(maxOfOrNull, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(n1.b(o1.s(maxOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Double q7(long[] minOfOrNull, l<? super r1, Double> selector) {
        f0.p(minOfOrNull, "$this$minOfOrNull");
        f0.p(selector, "selector");
        if (s1.y(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(r1.b(s1.s(minOfOrNull, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(minOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(r1.b(s1.s(minOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte[] q8(byte[] plus, byte b10) {
        f0.p(plus, "$this$plus");
        return k1.g(m.F3(plus, b10));
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final j1 q9(byte[] reduceRightOrNull, p<? super j1, ? super j1, j1> operation) {
        f0.p(reduceRightOrNull, "$this$reduceRightOrNull");
        f0.p(operation, "operation");
        int iRe = ArraysKt___ArraysKt.Re(reduceRightOrNull);
        if (iRe < 0) {
            return null;
        }
        byte bS = k1.s(reduceRightOrNull, iRe);
        for (int i10 = iRe - 1; i10 >= 0; i10--) {
            bS = operation.invoke(j1.b(k1.s(reduceRightOrNull, i10)), j1.b(bS)).o0();
        }
        return j1.b(bS);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int qa(int[] single) {
        f0.p(single, "$this$single");
        return n1.h(ArraysKt___ArraysKt.Dt(single));
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<n1> qb(@d int[] sorted) {
        f0.p(sorted, "$this$sorted");
        int[] iArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        f0.o(iArrCopyOf, "copyOf(this, size)");
        int[] iArrG = o1.g(iArrCopyOf);
        Wa(iArrG);
        return b.a(iArrG);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<j1> qc(@d byte[] take, int i10) {
        f0.p(take, "$this$take");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= k1.v(take)) {
            return CollectionsKt___CollectionsKt.Q5(k1.b(take));
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(j1.b(k1.s(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iV = k1.v(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iV; i12++) {
            arrayList.add(j1.b(k1.s(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final <R> List<Pair<r1, R>> qd(@d long[] zip, @d R[] other) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        int iMin = Math.min(s1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            long jS = s1.s(zip, i10);
            arrayList.add(c1.a(r1.b(jS), other[i10]));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <V> Map<r1, V> r0(long[] associateWith, l<? super r1, ? extends V> valueSelector) {
        f0.p(associateWith, "$this$associateWith");
        f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(r0.j(s1.v(associateWith)), 16));
        int iV = s1.v(associateWith);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(associateWith, i10);
            linkedHashMap.put(r1.b(jS), valueSelector.invoke(r1.b(jS)));
        }
        return linkedHashMap;
    }

    static /* synthetic */ long[] r1(long[] copyInto, long[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = s1.v(copyInto);
        }
        f0.p(copyInto, "$this$copyInto");
        f0.p(destination, "destination");
        m.b1(copyInto, destination, i10, i11, i12);
        return destination;
    }

    public static /* synthetic */ void r2(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = s1.v(jArr);
        }
        q2(jArr, j10, i10, i11);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> List<R> r3(long[] flatMap, l<? super r1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMap, "$this$flatMap");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = s1.v(flatMap);
        for (int i10 = 0; i10 < iV; i10++) {
            x.n0(arrayList, transform.invoke(r1.b(s1.s(flatMap, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    public static /* synthetic */ void r4(long[] jArr) {
    }

    @u0(version = "1.3")
    @s
    @e
    public static final j1 r5(@d byte[] lastOrNull) {
        f0.p(lastOrNull, "$this$lastOrNull");
        if (k1.y(lastOrNull)) {
            return null;
        }
        return j1.b(k1.s(lastOrNull, k1.v(lastOrNull) - 1));
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R r6(short[] maxOfOrNull, l<? super x1, ? extends R> selector) {
        f0.p(maxOfOrNull, "$this$maxOfOrNull");
        f0.p(selector, "selector");
        if (y1.y(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(x1.b(y1.s(maxOfOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(x1.b(y1.s(maxOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Float r7(long[] minOfOrNull, l<? super r1, Float> selector) {
        f0.p(minOfOrNull, "$this$minOfOrNull");
        f0.p(selector, "selector");
        if (s1.y(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(r1.b(s1.s(minOfOrNull, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(minOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(r1.b(s1.s(minOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte[] r8(byte[] plus, byte[] elements) {
        f0.p(plus, "$this$plus");
        f0.p(elements, "elements");
        return k1.g(m.H3(plus, elements));
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final n1 r9(int[] reduceRightOrNull, p<? super n1, ? super n1, n1> operation) {
        f0.p(reduceRightOrNull, "$this$reduceRightOrNull");
        f0.p(operation, "operation");
        int iVe = ArraysKt___ArraysKt.Ve(reduceRightOrNull);
        if (iVe < 0) {
            return null;
        }
        int iS = o1.s(reduceRightOrNull, iVe);
        for (int i10 = iVe - 1; i10 >= 0; i10--) {
            iS = operation.invoke(n1.b(o1.s(reduceRightOrNull, i10)), n1.b(iS)).q0();
        }
        return n1.b(iS);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte ra(byte[] single) {
        f0.p(single, "$this$single");
        return j1.h(ArraysKt___ArraysKt.vt(single));
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<j1> rb(@d byte[] sorted) {
        f0.p(sorted, "$this$sorted");
        byte[] bArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        f0.o(bArrCopyOf, "copyOf(this, size)");
        byte[] bArrG = k1.g(bArrCopyOf);
        db(bArrG);
        return b.b(bArrG);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<x1> rc(@d short[] take, int i10) {
        f0.p(take, "$this$take");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= y1.v(take)) {
            return CollectionsKt___CollectionsKt.Q5(y1.b(take));
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(x1.b(y1.s(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iV = y1.v(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iV; i12++) {
            arrayList.add(x1.b(y1.s(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <V> List<V> rd(short[] zip, short[] other, p<? super x1, ? super x1, ? extends V> transform) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iMin = Math.min(y1.v(zip), y1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(x1.b(y1.s(zip, i10)), x1.b(y1.s(other, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <V> Map<n1, V> s0(int[] associateWith, l<? super n1, ? extends V> valueSelector) {
        f0.p(associateWith, "$this$associateWith");
        f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(r0.j(o1.v(associateWith)), 16));
        int iV = o1.v(associateWith);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(associateWith, i10);
            linkedHashMap.put(n1.b(iS), valueSelector.invoke(n1.b(iS)));
        }
        return linkedHashMap;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short[] s1(short[] copyInto, short[] destination, int i10, int i11, int i12) {
        f0.p(copyInto, "$this$copyInto");
        f0.p(destination, "destination");
        m.d1(copyInto, destination, i10, i11, i12);
        return destination;
    }

    @u0(version = "1.3")
    @s
    public static final void s2(@d byte[] fill, byte b10, int i10, int i11) {
        f0.p(fill, "$this$fill");
        m.h2(fill, b10, i10, i11);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> List<R> s3(int[] flatMap, l<? super n1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMap, "$this$flatMap");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = o1.v(flatMap);
        for (int i10 = 0; i10 < iV; i10++) {
            x.n0(arrayList, transform.invoke(n1.b(o1.s(flatMap, i10))));
        }
        return arrayList;
    }

    public static final int s4(@d short[] lastIndex) {
        f0.p(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.Ye(lastIndex);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final j1 s5(byte[] lastOrNull, l<? super j1, Boolean> predicate) {
        f0.p(lastOrNull, "$this$lastOrNull");
        f0.p(predicate, "predicate");
        int iV = k1.v(lastOrNull) - 1;
        if (iV < 0) {
            return null;
        }
        while (true) {
            int i10 = iV - 1;
            byte bS = k1.s(lastOrNull, iV);
            if (predicate.invoke(j1.b(bS)).booleanValue()) {
                return j1.b(bS);
            }
            if (i10 < 0) {
                return null;
            }
            iV = i10;
        }
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Double s6(short[] maxOfOrNull, l<? super x1, Double> selector) {
        f0.p(maxOfOrNull, "$this$maxOfOrNull");
        f0.p(selector, "selector");
        if (y1.y(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(x1.b(y1.s(maxOfOrNull, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(x1.b(y1.s(maxOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R s7(int[] minOfOrNull, l<? super n1, ? extends R> selector) {
        f0.p(minOfOrNull, "$this$minOfOrNull");
        f0.p(selector, "selector");
        if (o1.y(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(n1.b(o1.s(minOfOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(minOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(n1.b(o1.s(minOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final long[] s8(@d long[] plus, @d Collection<r1> elements) {
        f0.p(plus, "$this$plus");
        f0.p(elements, "elements");
        int iV = s1.v(plus);
        long[] jArrCopyOf = Arrays.copyOf(plus, s1.v(plus) + elements.size());
        f0.o(jArrCopyOf, "copyOf(this, newSize)");
        Iterator<r1> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[iV] = it.next().q0();
            iV++;
        }
        return s1.g(jArrCopyOf);
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final r1 s9(long[] reduceRightOrNull, p<? super r1, ? super r1, r1> operation) {
        f0.p(reduceRightOrNull, "$this$reduceRightOrNull");
        f0.p(operation, "operation");
        int iWe = ArraysKt___ArraysKt.We(reduceRightOrNull);
        if (iWe < 0) {
            return null;
        }
        long jS = s1.s(reduceRightOrNull, iWe);
        for (int i10 = iWe - 1; i10 >= 0; i10--) {
            jS = operation.invoke(r1.b(s1.s(reduceRightOrNull, i10)), r1.b(jS)).q0();
        }
        return r1.b(jS);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte sa(byte[] single, l<? super j1, Boolean> predicate) {
        f0.p(single, "$this$single");
        f0.p(predicate, "predicate");
        int iV = k1.v(single);
        j1 j1VarB = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(single, i10);
            if (predicate.invoke(j1.b(bS)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                j1VarB = j1.b(bS);
                z10 = true;
            }
        }
        if (z10) {
            return j1VarB.o0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<r1> sb(@d long[] sorted) {
        f0.p(sorted, "$this$sorted");
        long[] jArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        f0.o(jArrCopyOf, "copyOf(this, size)");
        long[] jArrG = s1.g(jArrCopyOf);
        eb(jArrG);
        return b.c(jArrG);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<n1> sc(@d int[] take, int i10) {
        f0.p(take, "$this$take");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= o1.v(take)) {
            return CollectionsKt___CollectionsKt.Q5(o1.b(take));
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(n1.b(o1.s(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iV = o1.v(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iV; i12++) {
            arrayList.add(n1.b(o1.s(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R, V> List<V> sd(short[] zip, Iterable<? extends R> other, p<? super x1, ? super R, ? extends V> transform) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iV = y1.v(zip);
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), iV));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iV) {
                break;
            }
            arrayList.add(transform.invoke(x1.b(y1.s(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <V> Map<x1, V> t0(short[] associateWith, l<? super x1, ? extends V> valueSelector) {
        f0.p(associateWith, "$this$associateWith");
        f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(r0.j(y1.v(associateWith)), 16));
        int iV = y1.v(associateWith);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(associateWith, i10);
            linkedHashMap.put(x1.b(s10), valueSelector.invoke(x1.b(s10)));
        }
        return linkedHashMap;
    }

    static /* synthetic */ short[] t1(short[] copyInto, short[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = y1.v(copyInto);
        }
        f0.p(copyInto, "$this$copyInto");
        f0.p(destination, "destination");
        m.d1(copyInto, destination, i10, i11, i12);
        return destination;
    }

    public static /* synthetic */ void t2(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = k1.v(bArr);
        }
        s2(bArr, b10, i10, i11);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> List<R> t3(short[] flatMap, l<? super x1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMap, "$this$flatMap");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = y1.v(flatMap);
        for (int i10 = 0; i10 < iV; i10++) {
            x.n0(arrayList, transform.invoke(x1.b(y1.s(flatMap, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    public static /* synthetic */ void t4(short[] sArr) {
    }

    @u0(version = "1.3")
    @s
    @f
    private static final r1 t5(long[] lastOrNull, l<? super r1, Boolean> predicate) {
        f0.p(lastOrNull, "$this$lastOrNull");
        f0.p(predicate, "predicate");
        int iV = s1.v(lastOrNull) - 1;
        if (iV < 0) {
            return null;
        }
        while (true) {
            int i10 = iV - 1;
            long jS = s1.s(lastOrNull, iV);
            if (predicate.invoke(r1.b(jS)).booleanValue()) {
                return r1.b(jS);
            }
            if (i10 < 0) {
                return null;
            }
            iV = i10;
        }
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Float t6(short[] maxOfOrNull, l<? super x1, Float> selector) {
        f0.p(maxOfOrNull, "$this$maxOfOrNull");
        f0.p(selector, "selector");
        if (y1.y(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(x1.b(y1.s(maxOfOrNull, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(x1.b(y1.s(maxOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Double t7(int[] minOfOrNull, l<? super n1, Double> selector) {
        f0.p(minOfOrNull, "$this$minOfOrNull");
        f0.p(selector, "selector");
        if (o1.y(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(n1.b(o1.s(minOfOrNull, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(minOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(n1.b(o1.s(minOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short[] t8(short[] plus, short[] elements) {
        f0.p(plus, "$this$plus");
        f0.p(elements, "elements");
        return y1.g(m.c4(plus, elements));
    }

    @u0(version = "1.4")
    @s
    @e2(markerClass = {q.class})
    @f
    private static final x1 t9(short[] reduceRightOrNull, p<? super x1, ? super x1, x1> operation) {
        f0.p(reduceRightOrNull, "$this$reduceRightOrNull");
        f0.p(operation, "operation");
        int iYe = ArraysKt___ArraysKt.Ye(reduceRightOrNull);
        if (iYe < 0) {
            return null;
        }
        short s10 = y1.s(reduceRightOrNull, iYe);
        for (int i10 = iYe - 1; i10 >= 0; i10--) {
            s10 = operation.invoke(x1.b(y1.s(reduceRightOrNull, i10)), x1.b(s10)).o0();
        }
        return x1.b(s10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long ta(long[] single, l<? super r1, Boolean> predicate) {
        f0.p(single, "$this$single");
        f0.p(predicate, "predicate");
        int iV = s1.v(single);
        r1 r1VarB = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(single, i10);
            if (predicate.invoke(r1.b(jS)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                r1VarB = r1.b(jS);
                z10 = true;
            }
        }
        if (z10) {
            return r1VarB.q0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<x1> tb(@d short[] sorted) {
        f0.p(sorted, "$this$sorted");
        short[] sArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        f0.o(sArrCopyOf, "copyOf(this, size)");
        short[] sArrG = y1.g(sArrCopyOf);
        hb(sArrG);
        return b.d(sArrG);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<r1> tc(@d long[] take, int i10) {
        f0.p(take, "$this$take");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= s1.v(take)) {
            return CollectionsKt___CollectionsKt.Q5(s1.b(take));
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(r1.b(s1.s(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iV = s1.v(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iV; i12++) {
            arrayList.add(r1.b(s1.s(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<Pair<j1, j1>> td(@d byte[] zip, @d byte[] other) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        int iMin = Math.min(k1.v(zip), k1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(c1.a(j1.b(k1.s(zip, i10)), j1.b(k1.s(other, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <V, M extends Map<? super n1, ? super V>> M u0(int[] associateWithTo, M destination, l<? super n1, ? extends V> valueSelector) {
        f0.p(associateWithTo, "$this$associateWithTo");
        f0.p(destination, "destination");
        f0.p(valueSelector, "valueSelector");
        int iV = o1.v(associateWithTo);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(associateWithTo, i10);
            destination.put(n1.b(iS), valueSelector.invoke(n1.b(iS)));
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte[] u1(byte[] copyInto, byte[] destination, int i10, int i11, int i12) {
        f0.p(copyInto, "$this$copyInto");
        f0.p(destination, "destination");
        m.W0(copyInto, destination, i10, i11, i12);
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<j1> u2(byte[] filter, l<? super j1, Boolean> predicate) {
        f0.p(filter, "$this$filter");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = k1.v(filter);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(filter, i10);
            if (predicate.invoke(j1.b(bS)).booleanValue()) {
                arrayList.add(j1.b(bS));
            }
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> List<R> u3(byte[] flatMapIndexed, p<? super Integer, ? super j1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMapIndexed, "$this$flatMapIndexed");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = k1.v(flatMapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), j1.b(k1.s(flatMapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short u4(short[] getOrElse, int i10, l<? super Integer, x1> defaultValue) {
        f0.p(getOrElse, "$this$getOrElse");
        f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > ArraysKt___ArraysKt.Ye(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).o0() : y1.s(getOrElse, i10);
    }

    @u0(version = "1.3")
    @s
    @e
    public static final r1 u5(@d long[] lastOrNull) {
        f0.p(lastOrNull, "$this$lastOrNull");
        if (s1.y(lastOrNull)) {
            return null;
        }
        return r1.b(s1.s(lastOrNull, s1.v(lastOrNull) - 1));
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R u6(long[] maxOfWith, Comparator<? super R> comparator, l<? super r1, ? extends R> selector) {
        f0.p(maxOfWith, "$this$maxOfWith");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (s1.y(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(r1.b(s1.s(maxOfWith, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(maxOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(r1.b(s1.s(maxOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Float u7(int[] minOfOrNull, l<? super n1, Float> selector) {
        f0.p(minOfOrNull, "$this$minOfOrNull");
        f0.p(selector, "selector");
        if (o1.y(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(n1.b(o1.s(minOfOrNull, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(minOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(n1.b(o1.s(minOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final short[] u8(@d short[] plus, @d Collection<x1> elements) {
        f0.p(plus, "$this$plus");
        f0.p(elements, "elements");
        int iV = y1.v(plus);
        short[] sArrCopyOf = Arrays.copyOf(plus, y1.v(plus) + elements.size());
        f0.o(sArrCopyOf, "copyOf(this, newSize)");
        Iterator<x1> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[iV] = it.next().o0();
            iV++;
        }
        return y1.g(sArrCopyOf);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final void u9(int[] reverse) {
        f0.p(reverse, "$this$reverse");
        ArraysKt___ArraysKt.yr(reverse);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long ua(long[] single) {
        f0.p(single, "$this$single");
        return r1.h(ArraysKt___ArraysKt.Ft(single));
    }

    @u0(version = "1.3")
    @d
    @s
    public static final int[] ub(@d int[] sortedArray) {
        f0.p(sortedArray, "$this$sortedArray");
        if (o1.y(sortedArray)) {
            return sortedArray;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        f0.o(iArrCopyOf, "copyOf(this, size)");
        int[] iArrG = o1.g(iArrCopyOf);
        Wa(iArrG);
        return iArrG;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<j1> uc(@d byte[] takeLast, int i10) {
        f0.p(takeLast, "$this$takeLast");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int iV = k1.v(takeLast);
        if (i10 >= iV) {
            return CollectionsKt___CollectionsKt.Q5(k1.b(takeLast));
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(j1.b(k1.s(takeLast, iV - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iV - i10; i11 < iV; i11++) {
            arrayList.add(j1.b(k1.s(takeLast, i11)));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<Pair<x1, x1>> ud(@d short[] zip, @d short[] other) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        int iMin = Math.min(y1.v(zip), y1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(c1.a(x1.b(y1.s(zip, i10)), x1.b(y1.s(other, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <V, M extends Map<? super j1, ? super V>> M v0(byte[] associateWithTo, M destination, l<? super j1, ? extends V> valueSelector) {
        f0.p(associateWithTo, "$this$associateWithTo");
        f0.p(destination, "destination");
        f0.p(valueSelector, "valueSelector");
        int iV = k1.v(associateWithTo);
        for (int i10 = 0; i10 < iV; i10++) {
            byte bS = k1.s(associateWithTo, i10);
            destination.put(j1.b(bS), valueSelector.invoke(j1.b(bS)));
        }
        return destination;
    }

    static /* synthetic */ byte[] v1(byte[] copyInto, byte[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = k1.v(copyInto);
        }
        f0.p(copyInto, "$this$copyInto");
        f0.p(destination, "destination");
        m.W0(copyInto, destination, i10, i11, i12);
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<r1> v2(long[] filter, l<? super r1, Boolean> predicate) {
        f0.p(filter, "$this$filter");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = s1.v(filter);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(filter, i10);
            if (predicate.invoke(r1.b(jS)).booleanValue()) {
                arrayList.add(r1.b(jS));
            }
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> List<R> v3(int[] flatMapIndexed, p<? super Integer, ? super n1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMapIndexed, "$this$flatMapIndexed");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = o1.v(flatMapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), n1.b(o1.s(flatMapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int v4(int[] getOrElse, int i10, l<? super Integer, n1> defaultValue) {
        f0.p(getOrElse, "$this$getOrElse");
        f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > ArraysKt___ArraysKt.Ve(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).q0() : o1.s(getOrElse, i10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final n1 v5(int[] lastOrNull, l<? super n1, Boolean> predicate) {
        f0.p(lastOrNull, "$this$lastOrNull");
        f0.p(predicate, "predicate");
        int iV = o1.v(lastOrNull) - 1;
        if (iV < 0) {
            return null;
        }
        while (true) {
            int i10 = iV - 1;
            int iS = o1.s(lastOrNull, iV);
            if (predicate.invoke(n1.b(iS)).booleanValue()) {
                return n1.b(iS);
            }
            if (i10 < 0) {
                return null;
            }
            iV = i10;
        }
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R v6(byte[] maxOfWith, Comparator<? super R> comparator, l<? super j1, ? extends R> selector) {
        f0.p(maxOfWith, "$this$maxOfWith");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (k1.y(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(j1.b(k1.s(maxOfWith, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(maxOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(j1.b(k1.s(maxOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R extends Comparable<? super R>> R v7(short[] minOfOrNull, l<? super x1, ? extends R> selector) {
        f0.p(minOfOrNull, "$this$minOfOrNull");
        f0.p(selector, "selector");
        if (y1.y(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(x1.b(y1.s(minOfOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(minOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(x1.b(y1.s(minOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int[] v8(int[] plus, int i10) {
        f0.p(plus, "$this$plus");
        return o1.g(m.R3(plus, i10));
    }

    @u0(version = "1.4")
    @s
    @f
    private static final void v9(long[] reverse, int i10, int i11) {
        f0.p(reverse, "$this$reverse");
        ArraysKt___ArraysKt.Br(reverse, i10, i11);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int va(int[] single, l<? super n1, Boolean> predicate) {
        f0.p(single, "$this$single");
        f0.p(predicate, "predicate");
        int iV = o1.v(single);
        n1 n1VarB = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(single, i10);
            if (predicate.invoke(n1.b(iS)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                n1VarB = n1.b(iS);
                z10 = true;
            }
        }
        if (z10) {
            return n1VarB.q0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0(version = "1.3")
    @d
    @s
    public static final byte[] vb(@d byte[] sortedArray) {
        f0.p(sortedArray, "$this$sortedArray");
        if (k1.y(sortedArray)) {
            return sortedArray;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        f0.o(bArrCopyOf, "copyOf(this, size)");
        byte[] bArrG = k1.g(bArrCopyOf);
        db(bArrG);
        return bArrG;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<x1> vc(@d short[] takeLast, int i10) {
        f0.p(takeLast, "$this$takeLast");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int iV = y1.v(takeLast);
        if (i10 >= iV) {
            return CollectionsKt___CollectionsKt.Q5(y1.b(takeLast));
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(x1.b(y1.s(takeLast, iV - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iV - i10; i11 < iV; i11++) {
            arrayList.add(x1.b(y1.s(takeLast, i11)));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final <R> List<Pair<j1, R>> vd(@d byte[] zip, @d R[] other) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        int iMin = Math.min(k1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            byte bS = k1.s(zip, i10);
            arrayList.add(c1.a(j1.b(bS), other[i10]));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <V, M extends Map<? super r1, ? super V>> M w0(long[] associateWithTo, M destination, l<? super r1, ? extends V> valueSelector) {
        f0.p(associateWithTo, "$this$associateWithTo");
        f0.p(destination, "destination");
        f0.p(valueSelector, "valueSelector");
        int iV = s1.v(associateWithTo);
        for (int i10 = 0; i10 < iV; i10++) {
            long jS = s1.s(associateWithTo, i10);
            destination.put(r1.b(jS), valueSelector.invoke(r1.b(jS)));
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int[] w1(int[] copyInto, int[] destination, int i10, int i11, int i12) {
        f0.p(copyInto, "$this$copyInto");
        f0.p(destination, "destination");
        m.a1(copyInto, destination, i10, i11, i12);
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<n1> w2(int[] filter, l<? super n1, Boolean> predicate) {
        f0.p(filter, "$this$filter");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = o1.v(filter);
        for (int i10 = 0; i10 < iV; i10++) {
            int iS = o1.s(filter, i10);
            if (predicate.invoke(n1.b(iS)).booleanValue()) {
                arrayList.add(n1.b(iS));
            }
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> List<R> w3(long[] flatMapIndexed, p<? super Integer, ? super r1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMapIndexed, "$this$flatMapIndexed");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = s1.v(flatMapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), r1.b(s1.s(flatMapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long w4(long[] getOrElse, int i10, l<? super Integer, r1> defaultValue) {
        f0.p(getOrElse, "$this$getOrElse");
        f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > ArraysKt___ArraysKt.We(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).q0() : s1.s(getOrElse, i10);
    }

    @u0(version = "1.3")
    @s
    @e
    public static final x1 w5(@d short[] lastOrNull) {
        f0.p(lastOrNull, "$this$lastOrNull");
        if (y1.y(lastOrNull)) {
            return null;
        }
        return x1.b(y1.s(lastOrNull, y1.v(lastOrNull) - 1));
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R w6(short[] maxOfWith, Comparator<? super R> comparator, l<? super x1, ? extends R> selector) {
        f0.p(maxOfWith, "$this$maxOfWith");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (y1.y(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(x1.b(y1.s(maxOfWith, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(maxOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(x1.b(y1.s(maxOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Double w7(short[] minOfOrNull, l<? super x1, Double> selector) {
        f0.p(minOfOrNull, "$this$minOfOrNull");
        f0.p(selector, "selector");
        if (y1.y(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(x1.b(y1.s(minOfOrNull, 0))).doubleValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(minOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(x1.b(y1.s(minOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long[] w8(long[] plus, long[] elements) {
        f0.p(plus, "$this$plus");
        f0.p(elements, "elements");
        return s1.g(m.W3(plus, elements));
    }

    @u0(version = "1.4")
    @s
    @f
    private static final void w9(byte[] reverse, int i10, int i11) {
        f0.p(reverse, "$this$reverse");
        ArraysKt___ArraysKt.rr(reverse, i10, i11);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short wa(short[] single) {
        f0.p(single, "$this$single");
        return x1.h(ArraysKt___ArraysKt.Jt(single));
    }

    @u0(version = "1.3")
    @d
    @s
    public static final long[] wb(@d long[] sortedArray) {
        f0.p(sortedArray, "$this$sortedArray");
        if (s1.y(sortedArray)) {
            return sortedArray;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        f0.o(jArrCopyOf, "copyOf(this, size)");
        long[] jArrG = s1.g(jArrCopyOf);
        eb(jArrG);
        return jArrG;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<n1> wc(@d int[] takeLast, int i10) {
        f0.p(takeLast, "$this$takeLast");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int iV = o1.v(takeLast);
        if (i10 >= iV) {
            return CollectionsKt___CollectionsKt.Q5(o1.b(takeLast));
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(n1.b(o1.s(takeLast, iV - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iV - i10; i11 < iV; i11++) {
            arrayList.add(n1.b(o1.s(takeLast, i11)));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final <R> List<Pair<x1, R>> wd(@d short[] zip, @d R[] other) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        int iMin = Math.min(y1.v(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            short s10 = y1.s(zip, i10);
            arrayList.add(c1.a(x1.b(s10), other[i10]));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @f
    private static final <V, M extends Map<? super x1, ? super V>> M x0(short[] associateWithTo, M destination, l<? super x1, ? extends V> valueSelector) {
        f0.p(associateWithTo, "$this$associateWithTo");
        f0.p(destination, "destination");
        f0.p(valueSelector, "valueSelector");
        int iV = y1.v(associateWithTo);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(associateWithTo, i10);
            destination.put(x1.b(s10), valueSelector.invoke(x1.b(s10)));
        }
        return destination;
    }

    static /* synthetic */ int[] x1(int[] copyInto, int[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = o1.v(copyInto);
        }
        f0.p(copyInto, "$this$copyInto");
        f0.p(destination, "destination");
        m.a1(copyInto, destination, i10, i11, i12);
        return destination;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<x1> x2(short[] filter, l<? super x1, Boolean> predicate) {
        f0.p(filter, "$this$filter");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = y1.v(filter);
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(filter, i10);
            if (predicate.invoke(x1.b(s10)).booleanValue()) {
                arrayList.add(x1.b(s10));
            }
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> List<R> x3(short[] flatMapIndexed, p<? super Integer, ? super x1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMapIndexed, "$this$flatMapIndexed");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iV = y1.v(flatMapIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), x1.b(y1.s(flatMapIndexed, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte x4(byte[] getOrElse, int i10, l<? super Integer, j1> defaultValue) {
        f0.p(getOrElse, "$this$getOrElse");
        f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > ArraysKt___ArraysKt.Re(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i10)).o0() : k1.s(getOrElse, i10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final x1 x5(short[] lastOrNull, l<? super x1, Boolean> predicate) {
        f0.p(lastOrNull, "$this$lastOrNull");
        f0.p(predicate, "predicate");
        int iV = y1.v(lastOrNull) - 1;
        if (iV < 0) {
            return null;
        }
        while (true) {
            int i10 = iV - 1;
            short s10 = y1.s(lastOrNull, iV);
            if (predicate.invoke(x1.b(s10)).booleanValue()) {
                return x1.b(s10);
            }
            if (i10 < 0) {
                return null;
            }
            iV = i10;
        }
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R x6(int[] maxOfWith, Comparator<? super R> comparator, l<? super n1, ? extends R> selector) {
        f0.p(maxOfWith, "$this$maxOfWith");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (o1.y(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(n1.b(o1.s(maxOfWith, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ve(maxOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(n1.b(o1.s(maxOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final Float x7(short[] minOfOrNull, l<? super x1, Float> selector) {
        f0.p(minOfOrNull, "$this$minOfOrNull");
        f0.p(selector, "selector");
        if (y1.y(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(x1.b(y1.s(minOfOrNull, 0))).floatValue();
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Ye(minOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(x1.b(y1.s(minOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @u0(version = "1.3")
    @d
    @s
    public static final byte[] x8(@d byte[] plus, @d Collection<j1> elements) {
        f0.p(plus, "$this$plus");
        f0.p(elements, "elements");
        int iV = k1.v(plus);
        byte[] bArrCopyOf = Arrays.copyOf(plus, k1.v(plus) + elements.size());
        f0.o(bArrCopyOf, "copyOf(this, newSize)");
        Iterator<j1> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[iV] = it.next().o0();
            iV++;
        }
        return k1.g(bArrCopyOf);
    }

    @u0(version = "1.4")
    @s
    @f
    private static final void x9(short[] reverse, int i10, int i11) {
        f0.p(reverse, "$this$reverse");
        ArraysKt___ArraysKt.Fr(reverse, i10, i11);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short xa(short[] single, l<? super x1, Boolean> predicate) {
        f0.p(single, "$this$single");
        f0.p(predicate, "predicate");
        int iV = y1.v(single);
        x1 x1VarB = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            short s10 = y1.s(single, i10);
            if (predicate.invoke(x1.b(s10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                x1VarB = x1.b(s10);
                z10 = true;
            }
        }
        if (z10) {
            return x1VarB.o0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0(version = "1.3")
    @d
    @s
    public static final short[] xb(@d short[] sortedArray) {
        f0.p(sortedArray, "$this$sortedArray");
        if (y1.y(sortedArray)) {
            return sortedArray;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        f0.o(sArrCopyOf, "copyOf(this, size)");
        short[] sArrG = y1.g(sArrCopyOf);
        hb(sArrG);
        return sArrG;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<r1> xc(@d long[] takeLast, int i10) {
        f0.p(takeLast, "$this$takeLast");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int iV = s1.v(takeLast);
        if (i10 >= iV) {
            return CollectionsKt___CollectionsKt.Q5(s1.b(takeLast));
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(r1.b(s1.s(takeLast, iV - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iV - i10; i11 < iV; i11++) {
            arrayList.add(r1.b(s1.s(takeLast, i11)));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final List<Pair<r1, r1>> xd(@d long[] zip, @d long[] other) {
        f0.p(zip, "$this$zip");
        f0.p(other, "other");
        int iMin = Math.min(s1.v(zip), s1.v(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(c1.a(r1.b(s1.s(zip, i10)), r1.b(s1.s(other, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int y0(int[] component1) {
        f0.p(component1, "$this$component1");
        return o1.s(component1, 0);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int[] y1(int[] copyOf) {
        f0.p(copyOf, "$this$copyOf");
        int[] iArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        f0.o(iArrCopyOf, "copyOf(this, size)");
        return o1.g(iArrCopyOf);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<j1> y2(byte[] filterIndexed, p<? super Integer, ? super j1, Boolean> predicate) {
        f0.p(filterIndexed, "$this$filterIndexed");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = k1.v(filterIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            byte bS = k1.s(filterIndexed, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), j1.b(bS)).booleanValue()) {
                arrayList.add(j1.b(bS));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R, C extends Collection<? super R>> C y3(int[] flatMapIndexedTo, C destination, p<? super Integer, ? super n1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMapIndexedTo, "$this$flatMapIndexedTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = o1.v(flatMapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), n1.b(o1.s(flatMapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @e
    public static final j1 y4(@d byte[] getOrNull, int i10) {
        f0.p(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 > ArraysKt___ArraysKt.Re(getOrNull)) {
            return null;
        }
        return j1.b(k1.s(getOrNull, i10));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> List<R> y5(byte[] map, l<? super j1, ? extends R> transform) {
        f0.p(map, "$this$map");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(k1.v(map));
        int iV = k1.v(map);
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(transform.invoke(j1.b(k1.s(map, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R y6(long[] maxOfWithOrNull, Comparator<? super R> comparator, l<? super r1, ? extends R> selector) {
        f0.p(maxOfWithOrNull, "$this$maxOfWithOrNull");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (s1.y(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(r1.b(s1.s(maxOfWithOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(r1.b(s1.s(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R y7(long[] minOfWith, Comparator<? super R> comparator, l<? super r1, ? extends R> selector) {
        f0.p(minOfWith, "$this$minOfWith");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (s1.y(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(r1.b(s1.s(minOfWith, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.We(minOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(r1.b(s1.s(minOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int y8(int[] random) {
        f0.p(random, "$this$random");
        return z8(random, Random.f125033b);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final void y9(byte[] reverse) {
        f0.p(reverse, "$this$reverse");
        ArraysKt___ArraysKt.qr(reverse);
    }

    @u0(version = "1.3")
    @s
    @e
    public static final n1 ya(@d int[] singleOrNull) {
        f0.p(singleOrNull, "$this$singleOrNull");
        if (o1.v(singleOrNull) == 1) {
            return n1.b(o1.s(singleOrNull, 0));
        }
        return null;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final int[] yb(@d int[] sortedArrayDescending) {
        f0.p(sortedArrayDescending, "$this$sortedArrayDescending");
        if (o1.y(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        f0.o(iArrCopyOf, "copyOf(this, size)");
        int[] iArrG = o1.g(iArrCopyOf);
        ib(iArrG);
        return iArrG;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<j1> yc(byte[] takeLastWhile, l<? super j1, Boolean> predicate) {
        f0.p(takeLastWhile, "$this$takeLastWhile");
        f0.p(predicate, "predicate");
        for (int iRe = ArraysKt___ArraysKt.Re(takeLastWhile); -1 < iRe; iRe--) {
            if (!predicate.invoke(j1.b(k1.s(takeLastWhile, iRe))).booleanValue()) {
                return O1(takeLastWhile, iRe + 1);
            }
        }
        return CollectionsKt___CollectionsKt.Q5(k1.b(takeLastWhile));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte z0(byte[] component1) {
        f0.p(component1, "$this$component1");
        return k1.s(component1, 0);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte[] z1(byte[] copyOf) {
        f0.p(copyOf, "$this$copyOf");
        byte[] bArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        f0.o(bArrCopyOf, "copyOf(this, size)");
        return k1.g(bArrCopyOf);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<n1> z2(int[] filterIndexed, p<? super Integer, ? super n1, Boolean> predicate) {
        f0.p(filterIndexed, "$this$filterIndexed");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iV = o1.v(filterIndexed);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            int iS = o1.s(filterIndexed, i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), n1.b(iS)).booleanValue()) {
                arrayList.add(n1.b(iS));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R, C extends Collection<? super R>> C z3(short[] flatMapIndexedTo, C destination, p<? super Integer, ? super x1, ? extends Iterable<? extends R>> transform) {
        f0.p(flatMapIndexedTo, "$this$flatMapIndexedTo");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int iV = y1.v(flatMapIndexedTo);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), x1.b(y1.s(flatMapIndexedTo, i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0(version = "1.3")
    @s
    @e
    public static final x1 z4(@d short[] getOrNull, int i10) {
        f0.p(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 > ArraysKt___ArraysKt.Ye(getOrNull)) {
            return null;
        }
        return x1.b(y1.s(getOrNull, i10));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final <R> List<R> z5(long[] map, l<? super r1, ? extends R> transform) {
        f0.p(map, "$this$map");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(s1.v(map));
        int iV = s1.v(map);
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(transform.invoke(r1.b(s1.s(map, i10))));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R z6(byte[] maxOfWithOrNull, Comparator<? super R> comparator, l<? super j1, ? extends R> selector) {
        f0.p(maxOfWithOrNull, "$this$maxOfWithOrNull");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (k1.y(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(j1.b(k1.s(maxOfWithOrNull, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(j1.b(k1.s(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.4")
    @s
    @l0
    @f
    private static final <R> R z7(byte[] minOfWith, Comparator<? super R> comparator, l<? super j1, ? extends R> selector) {
        f0.p(minOfWith, "$this$minOfWith");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (k1.y(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(j1.b(k1.s(minOfWith, 0)));
        k0 it = new fi.l(1, ArraysKt___ArraysKt.Re(minOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(j1.b(k1.s(minOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0(version = "1.3")
    @s
    public static final int z8(@d int[] random, @d Random random2) {
        f0.p(random, "$this$random");
        f0.p(random2, "random");
        if (o1.y(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return o1.s(random, random2.m(o1.v(random)));
    }

    @u0(version = "1.3")
    @s
    @f
    private static final void z9(long[] reverse) {
        f0.p(reverse, "$this$reverse");
        ArraysKt___ArraysKt.Ar(reverse);
    }

    @u0(version = "1.3")
    @s
    @e
    public static final j1 za(@d byte[] singleOrNull) {
        f0.p(singleOrNull, "$this$singleOrNull");
        if (k1.v(singleOrNull) == 1) {
            return j1.b(k1.s(singleOrNull, 0));
        }
        return null;
    }

    @u0(version = "1.3")
    @d
    @s
    public static final byte[] zb(@d byte[] sortedArrayDescending) {
        f0.p(sortedArrayDescending, "$this$sortedArrayDescending");
        if (k1.y(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        f0.o(bArrCopyOf, "copyOf(this, size)");
        byte[] bArrG = k1.g(bArrCopyOf);
        mb(bArrG);
        return bArrG;
    }

    @u0(version = "1.3")
    @s
    @f
    private static final List<r1> zc(long[] takeLastWhile, l<? super r1, Boolean> predicate) {
        f0.p(takeLastWhile, "$this$takeLastWhile");
        f0.p(predicate, "predicate");
        for (int iWe = ArraysKt___ArraysKt.We(takeLastWhile); -1 < iWe; iWe--) {
            if (!predicate.invoke(r1.b(s1.s(takeLastWhile, iWe))).booleanValue()) {
                return R1(takeLastWhile, iWe + 1);
            }
        }
        return CollectionsKt___CollectionsKt.Q5(s1.b(takeLastWhile));
    }
}
