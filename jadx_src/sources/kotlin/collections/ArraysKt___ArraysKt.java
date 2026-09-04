package kotlin.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.b2;
import kotlin.e2;
import kotlin.n1;
import kotlin.r1;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt__SequencesKt;

/* JADX INFO: compiled from: _Arrays.kt */
/* JADX INFO: loaded from: classes5.dex */
public class ArraysKt___ArraysKt extends kotlin.collections.m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.kt */
    public static final class a<T> implements Iterable<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f124503b;

        public a(Object[] objArr) {
            this.f124503b = objArr;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<T> iterator() {
            return kotlin.jvm.internal.h.a(this.f124503b);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class b implements Iterable<Byte>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f124504b;

        public b(byte[] bArr) {
            this.f124504b = bArr;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<Byte> iterator() {
            return kotlin.jvm.internal.i.b(this.f124504b);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class c implements Iterable<Short>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ short[] f124505b;

        public c(short[] sArr) {
            this.f124505b = sArr;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<Short> iterator() {
            return kotlin.jvm.internal.i.h(this.f124505b);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class d implements Iterable<Integer>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f124506b;

        public d(int[] iArr) {
            this.f124506b = iArr;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<Integer> iterator() {
            return kotlin.jvm.internal.i.f(this.f124506b);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class e implements Iterable<Long>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long[] f124507b;

        public e(long[] jArr) {
            this.f124507b = jArr;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<Long> iterator() {
            return kotlin.jvm.internal.i.g(this.f124507b);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class f implements Iterable<Float>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float[] f124508b;

        public f(float[] fArr) {
            this.f124508b = fArr;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<Float> iterator() {
            return kotlin.jvm.internal.i.e(this.f124508b);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class g implements Iterable<Double>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ double[] f124509b;

        public g(double[] dArr) {
            this.f124509b = dArr;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<Double> iterator() {
            return kotlin.jvm.internal.i.d(this.f124509b);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class h implements Iterable<Boolean>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f124510b;

        public h(boolean[] zArr) {
            this.f124510b = zArr;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<Boolean> iterator() {
            return kotlin.jvm.internal.i.a(this.f124510b);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class i implements Iterable<Character>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ char[] f124511b;

        public i(char[] cArr) {
            this.f124511b = cArr;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<Character> iterator() {
            return kotlin.jvm.internal.i.c(this.f124511b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class j<T> implements kotlin.sequences.m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f124512a;

        public j(Object[] objArr) {
            this.f124512a = objArr;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<T> iterator() {
            return kotlin.jvm.internal.h.a(this.f124512a);
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class k implements kotlin.sequences.m<Byte> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f124513a;

        public k(byte[] bArr) {
            this.f124513a = bArr;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<Byte> iterator() {
            return kotlin.jvm.internal.i.b(this.f124513a);
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class l implements kotlin.sequences.m<Short> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ short[] f124514a;

        public l(short[] sArr) {
            this.f124514a = sArr;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<Short> iterator() {
            return kotlin.jvm.internal.i.h(this.f124514a);
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class m implements kotlin.sequences.m<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f124515a;

        public m(int[] iArr) {
            this.f124515a = iArr;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<Integer> iterator() {
            return kotlin.jvm.internal.i.f(this.f124515a);
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class n implements kotlin.sequences.m<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long[] f124516a;

        public n(long[] jArr) {
            this.f124516a = jArr;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<Long> iterator() {
            return kotlin.jvm.internal.i.g(this.f124516a);
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class o implements kotlin.sequences.m<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float[] f124517a;

        public o(float[] fArr) {
            this.f124517a = fArr;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<Float> iterator() {
            return kotlin.jvm.internal.i.e(this.f124517a);
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class p implements kotlin.sequences.m<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ double[] f124518a;

        public p(double[] dArr) {
            this.f124518a = dArr;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<Double> iterator() {
            return kotlin.jvm.internal.i.d(this.f124518a);
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class q implements kotlin.sequences.m<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f124519a;

        public q(boolean[] zArr) {
            this.f124519a = zArr;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<Boolean> iterator() {
            return kotlin.jvm.internal.i.a(this.f124519a);
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class r implements kotlin.sequences.m<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ char[] f124520a;

        public r(char[] cArr) {
            this.f124520a = cArr;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<Character> iterator() {
            return kotlin.jvm.internal.i.c(this.f124520a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* JADX INFO: compiled from: _Arrays.kt */
    public static final class s<K, T> implements d0<T, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T[] f124521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<T, K> f124522b;

        /* JADX WARN: Multi-variable type inference failed */
        public s(T[] tArr, yh.l<? super T, ? extends K> lVar) {
            this.f124521a = tArr;
            this.f124522b = lVar;
        }

        @Override // kotlin.collections.d0
        public K a(T t10) {
            return this.f124522b.invoke(t10);
        }

        @Override // kotlin.collections.d0
        @dl.d
        public Iterator<T> b() {
            return kotlin.jvm.internal.h.a(this.f124521a);
        }
    }

    public static final boolean A5(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final <K, V> Map<K, V> A6(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends K> keySelector, @dl.d yh.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(cArr.length), 16));
        for (char c10 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c10)), valueTransform.invoke(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V, M extends Map<? super Character, ? super V>> M A7(char[] cArr, M destination, yh.l<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        for (char c10 : cArr) {
            destination.put(Character.valueOf(c10), valueSelector.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @sh.f
    private static final long A8(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr[3];
    }

    @dl.d
    public static final <K> List<Float> A9(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends K> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (hashSet.add(selector.invoke(Float.valueOf(f10)))) {
                arrayList.add(Float.valueOf(f10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <R> List<Pair<Float, R>> AA(@dl.d float[] fArr, @dl.d Iterable<? extends R> other) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(kotlin.c1.a(Float.valueOf(fArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @sh.f
    private static final Byte Aa(byte[] bArr, int i10) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return kf(bArr, i10);
    }

    @dl.d
    public static final <C extends Collection<? super Integer>> C Ab(@dl.d int[] iArr, @dl.d C destination, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                destination.add(Integer.valueOf(i10));
            }
        }
        return destination;
    }

    @dl.e
    public static final Boolean Ac(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C Ad(@dl.d float[] fArr, @dl.d C destination, @dl.d yh.l<? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (float f10 : fArr) {
            x.n0(destination, transform.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    public static final void Ae(@dl.d char[] cArr, @dl.d yh.p<? super Integer, ? super Character, b2> action) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
    }

    @dl.d
    public static final <K> Map<K, List<Integer>> Af(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i10));
        }
        return linkedHashMap;
    }

    public static final int Ag(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final String Ah(@dl.d float[] fArr, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        String string = ((StringBuilder) ih(fArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.f0.o(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @dl.e
    public static final Integer Ai(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Float Aj(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int iUe = Ue(fArr);
        if (iUe == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        k0 it = new fi.l(1, iUe).iterator();
        while (it.hasNext()) {
            float f11 = fArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                f10 = f11;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double Ak(double[] dArr, yh.l<? super Double, Double> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @dl.d
    @xh.h(name = "maxOrThrow")
    public static final <T extends Comparable<? super T>> T Al(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t11 = tArr[it.nextInt()];
            if (t10.compareTo(t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float Am(long[] jArr, yh.l<? super Long, Float> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R An(float[] fArr, Comparator<? super R> comparator, yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean Ao(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr.length == 0;
    }

    @kotlin.u0(version = "1.3")
    public static final short Ap(@dl.d short[] sArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[random.m(sArr.length)];
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Float Aq(@dl.d float[] fArr, @dl.d yh.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[it.nextInt()])).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    public static final void Ar(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iWe = We(jArr);
        k0 it = new fi.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            long j10 = jArr[iNextInt];
            jArr[iNextInt] = jArr[iWe];
            jArr[iWe] = j10;
            iWe--;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Boolean> As(boolean[] zArr, yh.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        boolean zBooleanValue = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(zBooleanValue));
        int length = zArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i10])).booleanValue();
            arrayList.add(Boolean.valueOf(zBooleanValue));
        }
        return arrayList;
    }

    public static final double At(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Double dValueOf = null;
        boolean z10 = false;
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                dValueOf = Double.valueOf(d10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.f0.n(dValueOf, "null cannot be cast to non-null type kotlin.Double");
        return dValueOf.doubleValue();
    }

    @dl.d
    public static final char[] Au(@dl.d char[] cArr, @dl.d Collection<Integer> indices) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        char[] cArr2 = new char[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            cArr2[i10] = cArr[it.next().intValue()];
            i10++;
        }
        return cArr2;
    }

    @dl.d
    public static final float[] Av(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.f0.o(fArrCopyOf, "copyOf(this, size)");
        Xu(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final int Aw(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 += b10;
        }
        return i10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfLong")
    @sh.f
    private static final long Ax(short[] sArr, yh.l<? super Short, Long> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jLongValue = 0;
        for (short s10 : sArr) {
            jLongValue += selector.invoke(Short.valueOf(s10)).longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final List<Float> Ay(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    @dl.d
    public static final Set<Float> Az(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return (Set) My(fArr, new LinkedHashSet(r0.j(fArr.length)));
    }

    public static final <T> boolean B5(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final <K> Map<K, Double> B6(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(dArr.length), 16));
        for (double d10 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d10)), Double.valueOf(d10));
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V, M extends Map<? super Double, ? super V>> M B7(double[] dArr, M destination, yh.l<? super Double, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        for (double d10 : dArr) {
            destination.put(Double.valueOf(d10), valueSelector.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    @sh.f
    private static final <T> T B8(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr[3];
    }

    @dl.d
    public static final <K> List<Integer> B9(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends K> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (hashSet.add(selector.invoke(Integer.valueOf(i10)))) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <R, V> List<V> BA(@dl.d float[] fArr, @dl.d Iterable<? extends R> other, @dl.d yh.p<? super Float, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Float.valueOf(fArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @sh.f
    private static final Character Ba(char[] cArr, int i10) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return lf(cArr, i10);
    }

    @dl.d
    public static final <C extends Collection<? super Long>> C Bb(@dl.d long[] jArr, @dl.d C destination, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                destination.add(Long.valueOf(j10));
            }
        }
        return destination;
    }

    @dl.e
    public static final Boolean Bc(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C Bd(@dl.d int[] iArr, @dl.d C destination, @dl.d yh.l<? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (int i10 : iArr) {
            x.n0(destination, transform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    public static final void Be(@dl.d double[] dArr, @dl.d yh.p<? super Integer, ? super Double, b2> action) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
    }

    @dl.d
    public static final <K, V> Map<K, List<V>> Bf(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends K> keySelector, @dl.d yh.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    public static final <T> int Bg(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final String Bh(@dl.d int[] iArr, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        String string = ((StringBuilder) jh(iArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.f0.o(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @dl.e
    public static final Integer Bi(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            int i11 = iArr[length];
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                return Integer.valueOf(i11);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Integer Bj(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iVe = Ve(iArr);
        if (iVe == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        k0 it = new fi.l(1, iVe).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                i10 = i11;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double Bk(float[] fArr, yh.l<? super Float, Double> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final short Bl(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            if (s10 < s11) {
                s10 = s11;
            }
        }
        return s10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> float Bm(T[] tArr, yh.l<? super T, Float> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(tArr[it.nextInt()]).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R Bn(int[] iArr, Comparator<? super R> comparator, yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean Bo(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.u0(version = "1.3")
    @sh.f
    private static final boolean Bp(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return Cp(zArr, Random.f125033b);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Integer Bq(@dl.d int[] iArr, @dl.d yh.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[it.nextInt()])).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @kotlin.u0(version = "1.4")
    public static final void Br(@dl.d long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.collections.b.Companion.d(i10, i11, jArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            long j10 = jArr[i10];
            jArr[i10] = jArr[i13];
            jArr[i13] = j10;
            i13--;
            i10++;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Byte> Bs(byte[] bArr, yh.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        byte bByteValue = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(bByteValue));
        int length = bArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
            arrayList.add(Byte.valueOf(bByteValue));
        }
        return arrayList;
    }

    public static final float Bt(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return fArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @dl.d
    public static final double[] Bu(@dl.d double[] dArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? new double[0] : kotlin.collections.m.I1(dArr, indices.D().intValue(), indices.e().intValue() + 1);
    }

    @dl.d
    public static final int[] Bv(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, size)");
        Zu(iArrCopyOf);
        return iArrCopyOf;
    }

    public static final int Bw(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfLong")
    @sh.f
    private static final long Bx(boolean[] zArr, yh.l<? super Boolean, Long> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jLongValue = 0;
        for (boolean z10 : zArr) {
            jLongValue += selector.invoke(Boolean.valueOf(z10)).longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final List<Integer> By(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    @dl.d
    public static final Set<Integer> Bz(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return (Set) Ny(iArr, new LinkedHashSet(r0.j(iArr.length)));
    }

    public static final boolean C5(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final <K, V> Map<K, V> C6(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends K> keySelector, @dl.d yh.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(dArr.length), 16));
        for (double d10 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d10)), valueTransform.invoke(Double.valueOf(d10)));
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V, M extends Map<? super Float, ? super V>> M C7(float[] fArr, M destination, yh.l<? super Float, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        for (float f10 : fArr) {
            destination.put(Float.valueOf(f10), valueSelector.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    @sh.f
    private static final short C8(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return sArr[3];
    }

    @dl.d
    public static final <K> List<Long> C9(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends K> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (hashSet.add(selector.invoke(Long.valueOf(j10)))) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final List<Pair<Float, Float>> CA(@dl.d float[] fArr, @dl.d float[] other) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(kotlin.c1.a(Float.valueOf(fArr[i10]), Float.valueOf(other[i10])));
        }
        return arrayList;
    }

    @sh.f
    private static final Double Ca(double[] dArr, int i10) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return mf(dArr, i10);
    }

    @dl.d
    public static final <T, C extends Collection<? super T>> C Cb(@dl.d T[] tArr, @dl.d C destination, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @dl.e
    public static final Byte Cc(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C Cd(@dl.d long[] jArr, @dl.d C destination, @dl.d yh.l<? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (long j10 : jArr) {
            x.n0(destination, transform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    public static final void Ce(@dl.d float[] fArr, @dl.d yh.p<? super Integer, ? super Float, b2> action) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10]));
            i10++;
            i11++;
        }
    }

    @dl.d
    public static final <K> Map<K, List<Long>> Cf(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Long.valueOf(j10));
        }
        return linkedHashMap;
    }

    public static final int Cg(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final String Ch(@dl.d long[] jArr, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Long, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        String string = ((StringBuilder) kh(jArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.f0.o(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @dl.e
    public static final Long Ci(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Long Cj(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int iWe = We(jArr);
        if (iWe == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        k0 it = new fi.l(1, iWe).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double Ck(int[] iArr, yh.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Boolean Cl(@dl.d boolean[] zArr, @dl.d Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            boolean z11 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) < 0) {
                z10 = z11;
            }
        }
        return Boolean.valueOf(z10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float Cm(short[] sArr, yh.l<? super Short, Float> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R Cn(long[] jArr, Comparator<? super R> comparator, yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean Co(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr.length == 0;
    }

    @kotlin.u0(version = "1.3")
    public static final boolean Cp(@dl.d boolean[] zArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[random.m(zArr.length)];
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Long Cq(@dl.d long[] jArr, @dl.d yh.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[it.nextInt()])).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public static final <T> void Cr(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iXe = Xe(tArr);
        k0 it = new fi.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            T t10 = tArr[iNextInt];
            tArr[iNextInt] = tArr[iXe];
            tArr[iXe] = t10;
            iXe--;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Character> Cs(char[] cArr, yh.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        char cCharValue = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(cCharValue));
        int length = cArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            cCharValue = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharValue), Character.valueOf(cArr[i10])).charValue();
            arrayList.add(Character.valueOf(cCharValue));
        }
        return arrayList;
    }

    public static final float Ct(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Float fValueOf = null;
        boolean z10 = false;
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                fValueOf = Float.valueOf(f10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.f0.n(fValueOf, "null cannot be cast to non-null type kotlin.Float");
        return fValueOf.floatValue();
    }

    @dl.d
    public static final double[] Cu(@dl.d double[] dArr, @dl.d Collection<Integer> indices) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        double[] dArr2 = new double[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr2[i10] = dArr[it.next().intValue()];
            i10++;
        }
        return dArr2;
    }

    @dl.d
    public static final long[] Cv(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(this, size)");
        bv(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final int Cw(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        int i10 = 0;
        for (short s10 : sArr) {
            i10 += s10;
        }
        return i10;
    }

    @xh.h(name = "sumOfShort")
    public static final int Cx(@dl.d Short[] shArr) {
        kotlin.jvm.internal.f0.p(shArr, "<this>");
        int iShortValue = 0;
        for (Short sh2 : shArr) {
            iShortValue += sh2.shortValue();
        }
        return iShortValue;
    }

    @dl.d
    public static final List<Long> Cy(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    @dl.d
    public static final Set<Long> Cz(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return (Set) Oy(jArr, new LinkedHashSet(r0.j(jArr.length)));
    }

    public static final boolean D5(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final <K> Map<K, Float> D6(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(fArr.length), 16));
        for (float f10 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f10)), Float.valueOf(f10));
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V, M extends Map<? super Integer, ? super V>> M D7(int[] iArr, M destination, yh.l<? super Integer, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        for (int i10 : iArr) {
            destination.put(Integer.valueOf(i10), valueSelector.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @sh.f
    private static final boolean D8(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr[3];
    }

    @dl.d
    public static final <T, K> List<T> D9(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (hashSet.add(selector.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <V> List<V> DA(@dl.d float[] fArr, @dl.d float[] other, @dl.d yh.p<? super Float, ? super Float, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i10]), Float.valueOf(other[i10])));
        }
        return arrayList;
    }

    @sh.f
    private static final Float Da(float[] fArr, int i10) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return nf(fArr, i10);
    }

    @dl.d
    public static final <C extends Collection<? super Short>> C Db(@dl.d short[] sArr, @dl.d C destination, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                destination.add(Short.valueOf(s10));
            }
        }
        return destination;
    }

    @dl.e
    public static final Byte Dc(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
        }
        return null;
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C Dd(@dl.d T[] tArr, @dl.d C destination, @dl.d yh.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (T t10 : tArr) {
            x.n0(destination, transform.invoke(t10));
        }
        return destination;
    }

    public static final void De(@dl.d int[] iArr, @dl.d yh.p<? super Integer, ? super Integer, b2> action) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
    }

    @dl.d
    public static final <K, V> Map<K, List<V>> Df(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends K> keySelector, @dl.d yh.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    public static final int Dg(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final <T> String Dh(@dl.d T[] tArr, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        String string = ((StringBuilder) lh(tArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.f0.o(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @dl.e
    public static final Long Di(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            long j10 = jArr[length];
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <T, R extends Comparable<? super R>> T Dj(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int iXe = Xe(tArr);
        if (iXe == 0) {
            return t10;
        }
        R rInvoke = selector.invoke(t10);
        k0 it = new fi.l(1, iXe).iterator();
        while (it.hasNext()) {
            T t11 = tArr[it.nextInt()];
            R rInvoke2 = selector.invoke(t11);
            if (rInvoke.compareTo(rInvoke2) < 0) {
                t10 = t11;
                rInvoke = rInvoke2;
            }
        }
        return t10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double Dk(long[] jArr, yh.l<? super Long, Double> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Byte Dl(@dl.d byte[] bArr, @dl.d Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) < 0) {
                b10 = b11;
            }
        }
        return Byte.valueOf(b10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float Dm(boolean[] zArr, yh.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R> R Dn(T[] tArr, Comparator<? super R> comparator, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean Do(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final Boolean Dp(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return Ep(zArr, Random.f125033b);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final <S, T extends S> S Dq(@dl.d T[] tArr, @dl.d yh.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (S) tArr[0];
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            sInvoke = operation.invoke(sInvoke, (Object) tArr[it.nextInt()]);
        }
        return sInvoke;
    }

    @kotlin.u0(version = "1.4")
    public static final <T> void Dr(@dl.d T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.collections.b.Companion.d(i10, i11, tArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            T t10 = tArr[i10];
            tArr[i10] = tArr[i13];
            tArr[i13] = t10;
            i13--;
            i10++;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Double> Ds(double[] dArr, yh.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        double dDoubleValue = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(dDoubleValue));
        int length = dArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    public static final int Dt(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return iArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @dl.d
    public static final float[] Du(@dl.d float[] fArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? new float[0] : kotlin.collections.m.J1(fArr, indices.D().intValue(), indices.e().intValue() + 1);
    }

    @dl.d
    public static final <T extends Comparable<? super T>> T[] Dv(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        kotlin.collections.m.I4(tArr2, kotlin.comparisons.g.x());
        return tArr2;
    }

    public static final long Dw(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        return j10;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfUInt")
    @sh.f
    private static final int Dx(byte[] bArr, yh.l<? super Byte, n1> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iH = n1.h(0);
        for (byte b10 : bArr) {
            iH = n1.h(iH + selector.invoke(Byte.valueOf(b10)).q0());
        }
        return iH;
    }

    @dl.d
    public static final <T> List<T> Dy(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                break;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }

    @dl.d
    public static final <T> Set<T> Dz(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return (Set) Py(tArr, new LinkedHashSet(r0.j(tArr.length)));
    }

    public static final boolean E5(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @dl.d
    public static final <K, V> Map<K, V> E6(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends K> keySelector, @dl.d yh.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(fArr.length), 16));
        for (float f10 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f10)), valueTransform.invoke(Float.valueOf(f10)));
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V, M extends Map<? super Long, ? super V>> M E7(long[] jArr, M destination, yh.l<? super Long, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        for (long j10 : jArr) {
            destination.put(Long.valueOf(j10), valueSelector.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @sh.f
    private static final byte E8(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return bArr[4];
    }

    @dl.d
    public static final <K> List<Short> E9(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends K> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (hashSet.add(selector.invoke(Short.valueOf(s10)))) {
                arrayList.add(Short.valueOf(s10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <R> List<Pair<Float, R>> EA(@dl.d float[] fArr, @dl.d R[] other) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            float f10 = fArr[i10];
            arrayList.add(kotlin.c1.a(Float.valueOf(f10), other[i10]));
        }
        return arrayList;
    }

    @sh.f
    private static final Integer Ea(int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return of(iArr, i10);
    }

    @dl.d
    public static final <C extends Collection<? super Boolean>> C Eb(@dl.d boolean[] zArr, @dl.d C destination, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                destination.add(Boolean.valueOf(z10));
            }
        }
        return destination;
    }

    @dl.e
    public static final Character Ec(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C Ed(@dl.d short[] sArr, @dl.d C destination, @dl.d yh.l<? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (short s10 : sArr) {
            x.n0(destination, transform.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    public static final void Ee(@dl.d long[] jArr, @dl.d yh.p<? super Integer, ? super Long, b2> action) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
    }

    @dl.d
    public static final <T, K> Map<K, List<T>> Ef(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : tArr) {
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

    @dl.d
    public static final Set<Byte> Eg(@dl.d byte[] bArr, @dl.d Iterable<Byte> other) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Byte> setXz = xz(bArr);
        x.O0(setXz, other);
        return setXz;
    }

    @dl.d
    public static final String Eh(@dl.d short[] sArr, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Short, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        String string = ((StringBuilder) mh(sArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.f0.o(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @dl.e
    public static final <T> T Ei(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Short Ej(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int iYe = Ye(sArr);
        if (iYe == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        k0 it = new fi.l(1, iYe).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                s10 = s11;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> Double Ek(T[] tArr, yh.l<? super T, Double> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Character El(@dl.d char[] cArr, @dl.d Comparator<? super Character> comparator) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) < 0) {
                c10 = c11;
            }
        }
        return Character.valueOf(c10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Em(byte[] bArr, yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R En(short[] sArr, Comparator<? super R> comparator, yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <T> boolean Eo(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr.length == 0;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Boolean Ep(@dl.d boolean[] zArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[random.m(zArr.length)]);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Short Eq(@dl.d short[] sArr, @dl.d yh.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[it.nextInt()])).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    public static final void Er(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iYe = Ye(sArr);
        k0 it = new fi.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            short s10 = sArr[iNextInt];
            sArr[iNextInt] = sArr[iYe];
            sArr[iYe] = s10;
            iYe--;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Float> Es(float[] fArr, yh.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        float fFloatValue = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(fFloatValue));
        int length = fArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return arrayList;
    }

    public static final int Et(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Integer numValueOf = null;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                numValueOf = Integer.valueOf(i10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.f0.n(numValueOf, "null cannot be cast to non-null type kotlin.Int");
        return numValueOf.intValue();
    }

    @dl.d
    public static final float[] Eu(@dl.d float[] fArr, @dl.d Collection<Integer> indices) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        float[] fArr2 = new float[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr2[i10] = fArr[it.next().intValue()];
            i10++;
        }
        return fArr2;
    }

    @dl.d
    public static final short[] Ev(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.f0.o(sArrCopyOf, "copyOf(this, size)");
        fv(sArrCopyOf);
        return sArrCopyOf;
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final int Ew(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Integer> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (byte b10 : bArr) {
            iIntValue += selector.invoke(Byte.valueOf(b10)).intValue();
        }
        return iIntValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfUInt")
    @sh.f
    private static final int Ex(char[] cArr, yh.l<? super Character, n1> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iH = n1.h(0);
        for (char c10 : cArr) {
            iH = n1.h(iH + selector.invoke(Character.valueOf(c10)).q0());
        }
        return iH;
    }

    @dl.d
    public static final List<Short> Ey(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    @dl.d
    public static final Set<Short> Ez(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return (Set) Qy(sArr, new LinkedHashSet(r0.j(sArr.length)));
    }

    public static final boolean F5(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final <K> Map<K, Integer> F6(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(iArr.length), 16));
        for (int i10 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i10)), Integer.valueOf(i10));
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M F7(@dl.d K[] kArr, @dl.d M destination, @dl.d yh.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(kArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        for (K k10 : kArr) {
            destination.put(k10, valueSelector.invoke(k10));
        }
        return destination;
    }

    @sh.f
    private static final char F8(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return cArr[4];
    }

    @dl.d
    public static final <K> List<Boolean> F9(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends K> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (hashSet.add(selector.invoke(Boolean.valueOf(z10)))) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <R, V> List<V> FA(@dl.d float[] fArr, @dl.d R[] other, @dl.d yh.p<? super Float, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @sh.f
    private static final Long Fa(long[] jArr, int i10) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return pf(jArr, i10);
    }

    @dl.d
    public static final <C extends Collection<? super Byte>> C Fb(@dl.d byte[] bArr, @dl.d C destination, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                destination.add(Byte.valueOf(b10));
            }
        }
        return destination;
    }

    @dl.e
    public static final Character Fc(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
        }
        return null;
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C Fd(@dl.d boolean[] zArr, @dl.d C destination, @dl.d yh.l<? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (boolean z10 : zArr) {
            x.n0(destination, transform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    public static final <T> void Fe(@dl.d T[] tArr, @dl.d yh.p<? super Integer, ? super T, b2> action) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), tArr[i10]);
            i10++;
            i11++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T, K, V> Map<K, List<V>> Ff(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends K> keySelector, @dl.d yh.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a.a.a.a.d.p.d.c.C0001c.a aVar : tArr) {
            K kInvoke = keySelector.invoke(aVar);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(aVar));
        }
        return linkedHashMap;
    }

    @dl.d
    public static final Set<Character> Fg(@dl.d char[] cArr, @dl.d Iterable<Character> other) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Character> setYz = yz(cArr);
        x.O0(setYz, other);
        return setYz;
    }

    @dl.d
    public static final String Fh(@dl.d boolean[] zArr, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Boolean, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        String string = ((StringBuilder) nh(zArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.f0.o(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @dl.e
    public static final <T> T Fi(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            T t10 = tArr[length];
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> byte Fj(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int iRe = Re(bArr);
        if (iRe == 0) {
            return b10;
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        k0 it = new fi.l(1, iRe).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                b10 = b11;
                rInvoke = rInvoke2;
            }
        }
        return b10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double Fk(short[] sArr, yh.l<? super Short, Double> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Double Fl(@dl.d double[] dArr, @dl.d Comparator<? super Double> comparator) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            double d11 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) < 0) {
                d10 = d11;
            }
        }
        return Double.valueOf(d10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Fm(char[] cArr, yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R Fn(boolean[] zArr, Comparator<? super R> comparator, yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <T> boolean Fo(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final Byte Fp(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return Gp(bArr, Random.f125033b);
    }

    public static final byte Fq(@dl.d byte[] bArr, @dl.d yh.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iRe = Re(bArr);
        if (iRe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[iRe];
        for (int i10 = iRe - 1; i10 >= 0; i10--) {
            bByteValue = operation.invoke(Byte.valueOf(bArr[i10]), Byte.valueOf(bByteValue)).byteValue();
        }
        return bByteValue;
    }

    @kotlin.u0(version = "1.4")
    public static final void Fr(@dl.d short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.collections.b.Companion.d(i10, i11, sArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            short s10 = sArr[i10];
            sArr[i10] = sArr[i13];
            sArr[i13] = s10;
            i13--;
            i10++;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Integer> Fs(int[] iArr, yh.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int iIntValue = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(iIntValue));
        int length = iArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    public static final long Ft(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return jArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @dl.d
    public static final int[] Fu(@dl.d int[] iArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? new int[0] : kotlin.collections.m.K1(iArr, indices.D().intValue(), indices.e().intValue() + 1);
    }

    @dl.d
    public static final <T> T[] Fv(@dl.d T[] tArr, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.f0.o(tArr2, "copyOf(this, size)");
        kotlin.collections.m.I4(tArr2, comparator);
        return tArr2;
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final int Fw(@dl.d char[] cArr, @dl.d yh.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (char c10 : cArr) {
            iIntValue += selector.invoke(Character.valueOf(c10)).intValue();
        }
        return iIntValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfUInt")
    @sh.f
    private static final int Fx(double[] dArr, yh.l<? super Double, n1> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iH = n1.h(0);
        for (double d10 : dArr) {
            iH = n1.h(iH + selector.invoke(Double.valueOf(d10)).q0());
        }
        return iH;
    }

    @dl.d
    public static final List<Boolean> Fy(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    @dl.d
    public static final Set<Boolean> Fz(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return (Set) Ry(zArr, new LinkedHashSet(r0.j(zArr.length)));
    }

    public static final boolean G5(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @dl.d
    public static final <K, V> Map<K, V> G6(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends K> keySelector, @dl.d yh.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(iArr.length), 16));
        for (int i10 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i10)), valueTransform.invoke(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V, M extends Map<? super Short, ? super V>> M G7(short[] sArr, M destination, yh.l<? super Short, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        for (short s10 : sArr) {
            destination.put(Short.valueOf(s10), valueSelector.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    @sh.f
    private static final double G8(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr[4];
    }

    @dl.d
    public static final List<Byte> G9(@dl.d byte[] bArr, int i10) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (i10 >= 0) {
            return fy(bArr, fi.u.u(bArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R> List<Pair<Integer, R>> GA(@dl.d int[] iArr, @dl.d Iterable<? extends R> other) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(kotlin.c1.a(Integer.valueOf(iArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @sh.f
    private static final <T> T Ga(T[] tArr, int i10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return (T) qf(tArr, i10);
    }

    @dl.d
    public static final <C extends Collection<? super Character>> C Gb(@dl.d char[] cArr, @dl.d C destination, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                destination.add(Character.valueOf(c10));
            }
        }
        return destination;
    }

    @dl.e
    public static final Double Gc(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    public static final <R> R Gd(@dl.d byte[] bArr, R r10, @dl.d yh.p<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (byte b10 : bArr) {
            r10 = operation.invoke(r10, Byte.valueOf(b10));
        }
        return r10;
    }

    public static final void Ge(@dl.d short[] sArr, @dl.d yh.p<? super Integer, ? super Short, b2> action) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
    }

    @dl.d
    public static final <K> Map<K, List<Short>> Gf(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s10 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Short.valueOf(s10));
        }
        return linkedHashMap;
    }

    @dl.d
    public static final Set<Double> Gg(@dl.d double[] dArr, @dl.d Iterable<Double> other) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Double> setZz = zz(dArr);
        x.O0(setZz, other);
        return setZz;
    }

    public static /* synthetic */ String Gh(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        return xh(bArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.e
    public static final Short Gi(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char Gj(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        int iSe = Se(cArr);
        if (iSe == 0) {
            return c10;
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        k0 it = new fi.l(1, iSe).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                c10 = c11;
                rInvoke = rInvoke2;
            }
        }
        return c10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double Gk(boolean[] zArr, yh.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Float Gl(@dl.d float[] fArr, @dl.d Comparator<? super Float> comparator) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            float f11 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) < 0) {
                f10 = f11;
            }
        }
        return Float.valueOf(f10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Gm(double[] dArr, yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Byte Gn(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            if (b10 > b11) {
                b10 = b11;
            }
        }
        return Byte.valueOf(b10);
    }

    public static final boolean Go(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return sArr.length == 0;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Byte Gp(@dl.d byte[] bArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[random.m(bArr.length)]);
    }

    public static final char Gq(@dl.d char[] cArr, @dl.d yh.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iSe = Se(cArr);
        if (iSe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char cCharValue = cArr[iSe];
        for (int i10 = iSe - 1; i10 >= 0; i10--) {
            cCharValue = operation.invoke(Character.valueOf(cArr[i10]), Character.valueOf(cCharValue)).charValue();
        }
        return cCharValue;
    }

    public static final void Gr(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iZe = Ze(zArr);
        k0 it = new fi.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            boolean z10 = zArr[iNextInt];
            zArr[iNextInt] = zArr[iZe];
            zArr[iZe] = z10;
            iZe--;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Long> Gs(long[] jArr, yh.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        long jLongValue = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(jLongValue));
        int length = jArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
            arrayList.add(Long.valueOf(jLongValue));
        }
        return arrayList;
    }

    public static final long Gt(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Long lValueOf = null;
        boolean z10 = false;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                lValueOf = Long.valueOf(j10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.f0.n(lValueOf, "null cannot be cast to non-null type kotlin.Long");
        return lValueOf.longValue();
    }

    @dl.d
    public static final int[] Gu(@dl.d int[] iArr, @dl.d Collection<Integer> indices) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        int[] iArr2 = new int[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr2[i10] = iArr[it.next().intValue()];
            i10++;
        }
        return iArr2;
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Byte> Gv(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return gw(bArr, new kotlin.comparisons.g.a(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final int Gw(@dl.d double[] dArr, @dl.d yh.l<? super Double, Integer> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (double d10 : dArr) {
            iIntValue += selector.invoke(Double.valueOf(d10)).intValue();
        }
        return iIntValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfUInt")
    @sh.f
    private static final int Gx(float[] fArr, yh.l<? super Float, n1> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iH = n1.h(0);
        for (float f10 : fArr) {
            iH = n1.h(iH + selector.invoke(Float.valueOf(f10)).q0());
        }
        return iH;
    }

    @dl.d
    public static final boolean[] Gy(@dl.d Boolean[] boolArr) {
        kotlin.jvm.internal.f0.p(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = boolArr[i10].booleanValue();
        }
        return zArr;
    }

    @dl.d
    public static final Set<Byte> Gz(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            return length != 1 ? (Set) Jy(bArr, new LinkedHashSet(r0.j(bArr.length))) : c1.f(Byte.valueOf(bArr[0]));
        }
        return d1.k();
    }

    public static final boolean H5(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final <K> Map<K, Long> H6(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(jArr.length), 16));
        for (long j10 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j10)), Long.valueOf(j10));
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V, M extends Map<? super Boolean, ? super V>> M H7(boolean[] zArr, M destination, yh.l<? super Boolean, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        for (boolean z10 : zArr) {
            destination.put(Boolean.valueOf(z10), valueSelector.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @sh.f
    private static final float H8(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr[4];
    }

    @dl.d
    public static final List<Character> H9(@dl.d char[] cArr, int i10) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (i10 >= 0) {
            return gy(cArr, fi.u.u(cArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R, V> List<V> HA(@dl.d int[] iArr, @dl.d Iterable<? extends R> other, @dl.d yh.p<? super Integer, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @sh.f
    private static final Short Ha(short[] sArr, int i10) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return rf(sArr, i10);
    }

    @dl.d
    public static final <C extends Collection<? super Double>> C Hb(@dl.d double[] dArr, @dl.d C destination, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                destination.add(Double.valueOf(d10));
            }
        }
        return destination;
    }

    @dl.e
    public static final Double Hc(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return Double.valueOf(d10);
            }
        }
        return null;
    }

    public static final <R> R Hd(@dl.d char[] cArr, R r10, @dl.d yh.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (char c10 : cArr) {
            r10 = operation.invoke(r10, Character.valueOf(c10));
        }
        return r10;
    }

    public static final void He(@dl.d boolean[] zArr, @dl.d yh.p<? super Integer, ? super Boolean, b2> action) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
    }

    @dl.d
    public static final <K, V> Map<K, List<V>> Hf(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends K> keySelector, @dl.d yh.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s10 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Short.valueOf(s10)));
        }
        return linkedHashMap;
    }

    @dl.d
    public static final Set<Float> Hg(@dl.d float[] fArr, @dl.d Iterable<Float> other) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Float> setAz = Az(fArr);
        x.O0(setAz, other);
        return setAz;
    }

    public static /* synthetic */ String Hh(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        return yh(cArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.e
    public static final Short Hi(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            short s10 = sArr[length];
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> double Hj(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d10 = dArr[0];
        int iTe = Te(dArr);
        if (iTe == 0) {
            return d10;
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        k0 it = new fi.l(1, iTe).iterator();
        while (it.hasNext()) {
            double d11 = dArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                d10 = d11;
            }
        }
        return d10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float Hk(byte[] bArr, yh.l<? super Byte, Float> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Integer Hl(@dl.d int[] iArr, @dl.d Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i11)) < 0) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Hm(float[] fArr, yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Character Hn(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            if (kotlin.jvm.internal.f0.t(c10, c11) > 0) {
                c10 = c11;
            }
        }
        return Character.valueOf(c10);
    }

    public static final boolean Ho(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final Character Hp(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return Ip(cArr, Random.f125033b);
    }

    public static final double Hq(@dl.d double[] dArr, @dl.d yh.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iTe = Te(dArr);
        if (iTe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[iTe];
        for (int i10 = iTe - 1; i10 >= 0; i10--) {
            dDoubleValue = operation.invoke(Double.valueOf(dArr[i10]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    public static final void Hr(@dl.d boolean[] zArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.collections.b.Companion.d(i10, i11, zArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            boolean z10 = zArr[i10];
            zArr[i10] = zArr[i13];
            zArr[i13] = z10;
            i13--;
            i10++;
        }
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <S, T extends S> List<S> Hs(@dl.d T[] tArr, @dl.d yh.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sInvoke = operation.invoke(Integer.valueOf(i10), sInvoke, (Object) tArr[i10]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    public static final <T> T Ht(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @dl.d
    public static final long[] Hu(@dl.d long[] jArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? new long[0] : kotlin.collections.m.L1(jArr, indices.D().intValue(), indices.e().intValue() + 1);
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Character> Hv(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return hw(cArr, new kotlin.comparisons.g.a(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final int Hw(@dl.d float[] fArr, @dl.d yh.l<? super Float, Integer> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (float f10 : fArr) {
            iIntValue += selector.invoke(Float.valueOf(f10)).intValue();
        }
        return iIntValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfUInt")
    @sh.f
    private static final int Hx(int[] iArr, yh.l<? super Integer, n1> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iH = n1.h(0);
        for (int i10 : iArr) {
            iH = n1.h(iH + selector.invoke(Integer.valueOf(i10)).q0());
        }
        return iH;
    }

    @dl.d
    public static final byte[] Hy(@dl.d Byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = bArr[i10].byteValue();
        }
        return bArr2;
    }

    @dl.d
    public static final Set<Character> Hz(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            return length != 1 ? (Set) Ky(cArr, new LinkedHashSet(r0.j(fi.u.B(cArr.length, 128)))) : c1.f(Character.valueOf(cArr[0]));
        }
        return d1.k();
    }

    public static final boolean I5(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @dl.d
    public static final <K, V> Map<K, V> I6(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends K> keySelector, @dl.d yh.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(jArr.length), 16));
        for (long j10 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j10)), valueTransform.invoke(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    public static final double I7(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (byte b10 : bArr) {
            d10 += (double) b10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @sh.f
    private static final int I8(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr[4];
    }

    @dl.d
    public static final List<Double> I9(@dl.d double[] dArr, int i10) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (i10 >= 0) {
            return hy(dArr, fi.u.u(dArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final List<Pair<Integer, Integer>> IA(@dl.d int[] iArr, @dl.d int[] other) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(kotlin.c1.a(Integer.valueOf(iArr[i10]), Integer.valueOf(other[i10])));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Byte> Ia(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <C extends Collection<? super Float>> C Ib(@dl.d float[] fArr, @dl.d C destination, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                destination.add(Float.valueOf(f10));
            }
        }
        return destination;
    }

    @dl.e
    public static final Float Ic(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final <R> R Id(@dl.d double[] dArr, R r10, @dl.d yh.p<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (double d10 : dArr) {
            r10 = operation.invoke(r10, Double.valueOf(d10));
        }
        return r10;
    }

    @dl.d
    public static final fi.l Ie(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return new fi.l(0, Re(bArr));
    }

    @dl.d
    public static final <K> Map<K, List<Boolean>> If(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Boolean.valueOf(z10));
        }
        return linkedHashMap;
    }

    @dl.d
    public static final Set<Integer> Ig(@dl.d int[] iArr, @dl.d Iterable<Integer> other) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Integer> setBz = Bz(iArr);
        x.O0(setBz, other);
        return setBz;
    }

    public static /* synthetic */ String Ih(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        return zh(dArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.d
    public static final <R> List<R> Ii(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(transform.invoke(Byte.valueOf(b10)));
        }
        return arrayList;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> float Ij(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f10 = fArr[0];
        int iUe = Ue(fArr);
        if (iUe == 0) {
            return f10;
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        k0 it = new fi.l(1, iUe).iterator();
        while (it.hasNext()) {
            float f11 = fArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                f10 = f11;
                rInvoke = rInvoke2;
            }
        }
        return f10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float Ik(char[] cArr, yh.l<? super Character, Float> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Long Il(@dl.d long[] jArr, @dl.d Comparator<? super Long> comparator) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) < 0) {
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Im(int[] iArr, yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <T extends Comparable<? super T>> T In(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t11 = tArr[it.nextInt()];
            if (t10.compareTo(t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    public static final boolean Io(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr.length == 0;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Character Ip(@dl.d char[] cArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[random.m(cArr.length)]);
    }

    public static final float Iq(@dl.d float[] fArr, @dl.d yh.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iUe = Ue(fArr);
        if (iUe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[iUe];
        for (int i10 = iUe - 1; i10 >= 0; i10--) {
            fFloatValue = operation.invoke(Float.valueOf(fArr[i10]), Float.valueOf(fFloatValue)).floatValue();
        }
        return fFloatValue;
    }

    @dl.d
    public static final List<Byte> Ir(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<Byte> listOz = oz(bArr);
        z.m1(listOz);
        return listOz;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Short> Is(short[] sArr, yh.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        short sShortValue = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(sShortValue));
        int length = sArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
            arrayList.add(Short.valueOf(sShortValue));
        }
        return arrayList;
    }

    public static final <T> T It(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @dl.d
    public static final long[] Iu(@dl.d long[] jArr, @dl.d Collection<Integer> indices) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        long[] jArr2 = new long[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr2[i10] = jArr[it.next().intValue()];
            i10++;
        }
        return jArr2;
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Double> Iv(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return iw(dArr, new kotlin.comparisons.g.a(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final int Iw(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Integer> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (int i10 : iArr) {
            iIntValue += selector.invoke(Integer.valueOf(i10)).intValue();
        }
        return iIntValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfUInt")
    @sh.f
    private static final int Ix(long[] jArr, yh.l<? super Long, n1> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iH = n1.h(0);
        for (long j10 : jArr) {
            iH = n1.h(iH + selector.invoke(Long.valueOf(j10)).q0());
        }
        return iH;
    }

    @dl.d
    public static final char[] Iy(@dl.d Character[] chArr) {
        kotlin.jvm.internal.f0.p(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = chArr[i10].charValue();
        }
        return cArr;
    }

    @dl.d
    public static final Set<Double> Iz(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            return length != 1 ? (Set) Ly(dArr, new LinkedHashSet(r0.j(dArr.length))) : c1.f(Double.valueOf(dArr[0]));
        }
        return d1.k();
    }

    public static final boolean J5(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final <T, K> Map<K, T> J6(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(tArr.length), 16));
        for (T t10 : tArr) {
            linkedHashMap.put(keySelector.invoke(t10), t10);
        }
        return linkedHashMap;
    }

    public static final double J7(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (double d11 : dArr) {
            d10 += d11;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @sh.f
    private static final long J8(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr[4];
    }

    @dl.d
    public static final List<Float> J9(@dl.d float[] fArr, int i10) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (i10 >= 0) {
            return iy(fArr, fi.u.u(fArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <V> List<V> JA(@dl.d int[] iArr, @dl.d int[] other, @dl.d yh.p<? super Integer, ? super Integer, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i10]), Integer.valueOf(other[i10])));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Character> Ja(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <C extends Collection<? super Integer>> C Jb(@dl.d int[] iArr, @dl.d C destination, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                destination.add(Integer.valueOf(i10));
            }
        }
        return destination;
    }

    @dl.e
    public static final Float Jc(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
        }
        return null;
    }

    public static final <R> R Jd(@dl.d float[] fArr, R r10, @dl.d yh.p<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (float f10 : fArr) {
            r10 = operation.invoke(r10, Float.valueOf(f10));
        }
        return r10;
    }

    @dl.d
    public static final fi.l Je(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return new fi.l(0, Se(cArr));
    }

    @dl.d
    public static final <K, V> Map<K, List<V>> Jf(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends K> keySelector, @dl.d yh.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    @dl.d
    public static final Set<Long> Jg(@dl.d long[] jArr, @dl.d Iterable<Long> other) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Long> setCz = Cz(jArr);
        x.O0(setCz, other);
        return setCz;
    }

    public static /* synthetic */ String Jh(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        return Ah(fArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.d
    public static final <R> List<R> Ji(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(transform.invoke(Character.valueOf(c10)));
        }
        return arrayList;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> int Jj(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int iVe = Ve(iArr);
        if (iVe == 0) {
            return i10;
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        k0 it = new fi.l(1, iVe).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                i10 = i11;
                rInvoke = rInvoke2;
            }
        }
        return i10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float Jk(double[] dArr, yh.l<? super Double, Float> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <T> T Jl(@dl.d T[] tArr, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t11 = tArr[it.nextInt()];
            if (comparator.compare(t10, t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Jm(long[] jArr, yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Double Jn(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMin = dArr[0];
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            dMin = Math.min(dMin, dArr[it.nextInt()]);
        }
        return Double.valueOf(dMin);
    }

    public static final boolean Jo(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final Double Jp(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return Kp(dArr, Random.f125033b);
    }

    public static final int Jq(@dl.d int[] iArr, @dl.d yh.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iVe = Ve(iArr);
        if (iVe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[iVe];
        for (int i10 = iVe - 1; i10 >= 0; i10--) {
            iIntValue = operation.invoke(Integer.valueOf(iArr[i10]), Integer.valueOf(iIntValue)).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final List<Character> Jr(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<Character> listPz = pz(cArr);
        z.m1(listPz);
        return listPz;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Boolean> Js(boolean[] zArr, yh.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        boolean zBooleanValue = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(zBooleanValue));
        int length = zArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            zBooleanValue = operation.invoke(Integer.valueOf(i10), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i10])).booleanValue();
            arrayList.add(Boolean.valueOf(zBooleanValue));
        }
        return arrayList;
    }

    public static final short Jt(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return sArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @dl.d
    public static final <T> T[] Ju(@dl.d T[] tArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? (T[]) kotlin.collections.m.M1(tArr, 0, 0) : (T[]) kotlin.collections.m.M1(tArr, indices.D().intValue(), indices.e().intValue() + 1);
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Float> Jv(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return jw(fArr, new kotlin.comparisons.g.a(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final int Jw(@dl.d long[] jArr, @dl.d yh.l<? super Long, Integer> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (long j10 : jArr) {
            iIntValue += selector.invoke(Long.valueOf(j10)).intValue();
        }
        return iIntValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfUInt")
    @sh.f
    private static final <T> int Jx(T[] tArr, yh.l<? super T, n1> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iH = n1.h(0);
        for (T t10 : tArr) {
            iH = n1.h(iH + selector.invoke(t10).q0());
        }
        return iH;
    }

    @dl.d
    public static final <C extends Collection<? super Byte>> C Jy(@dl.d byte[] bArr, @dl.d C destination) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (byte b10 : bArr) {
            destination.add(Byte.valueOf(b10));
        }
        return destination;
    }

    @dl.d
    public static final Set<Float> Jz(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            return length != 1 ? (Set) My(fArr, new LinkedHashSet(r0.j(fArr.length))) : c1.f(Float.valueOf(fArr[0]));
        }
        return d1.k();
    }

    public static final boolean K5(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @dl.d
    public static final <T, K, V> Map<K, V> K6(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends K> keySelector, @dl.d yh.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(tArr.length), 16));
        for (T t10 : tArr) {
            linkedHashMap.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    public static final double K7(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (float f10 : fArr) {
            d10 += (double) f10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @sh.f
    private static final <T> T K8(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr[4];
    }

    @dl.d
    public static final List<Integer> K9(@dl.d int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (i10 >= 0) {
            return jy(iArr, fi.u.u(iArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R> List<Pair<Integer, R>> KA(@dl.d int[] iArr, @dl.d R[] other) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = iArr[i10];
            arrayList.add(kotlin.c1.a(Integer.valueOf(i11), other[i10]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Double> Ka(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <C extends Collection<? super Long>> C Kb(@dl.d long[] jArr, @dl.d C destination, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                destination.add(Long.valueOf(j10));
            }
        }
        return destination;
    }

    @dl.e
    public static final Integer Kc(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final <R> R Kd(@dl.d int[] iArr, R r10, @dl.d yh.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int i10 : iArr) {
            r10 = operation.invoke(r10, Integer.valueOf(i10));
        }
        return r10;
    }

    @dl.d
    public static final fi.l Ke(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return new fi.l(0, Te(dArr));
    }

    @dl.d
    public static final <K, M extends Map<? super K, List<Byte>>> M Kf(@dl.d byte[] bArr, @dl.d M destination, @dl.d yh.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Byte.valueOf(b10));
        }
        return destination;
    }

    @dl.d
    public static final <T> Set<T> Kg(@dl.d T[] tArr, @dl.d Iterable<? extends T> other) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<T> setDz = Dz(tArr);
        x.O0(setDz, other);
        return setDz;
    }

    public static /* synthetic */ String Kh(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        return Bh(iArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.d
    public static final <R> List<R> Ki(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(transform.invoke(Double.valueOf(d10)));
        }
        return arrayList;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> long Kj(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int iWe = We(jArr);
        if (iWe == 0) {
            return j10;
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        k0 it = new fi.l(1, iWe).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                j10 = j11;
            }
        }
        return j10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float Kk(float[] fArr, yh.l<? super Float, Float> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Short Kl(@dl.d short[] sArr, @dl.d Comparator<? super Short> comparator) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) < 0) {
                s10 = s11;
            }
        }
        return Short.valueOf(s10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R extends Comparable<? super R>> R Km(T[] tArr, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Double Kn(@dl.d Double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        k0 it = new fi.l(1, Xe(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, dArr[it.nextInt()].doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final byte[] Ko(byte[] bArr, yh.l<? super Byte, b2> action) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (byte b10 : bArr) {
            action.invoke(Byte.valueOf(b10));
        }
        return bArr;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Double Kp(@dl.d double[] dArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[random.m(dArr.length)]);
    }

    public static final long Kq(@dl.d long[] jArr, @dl.d yh.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iWe = We(jArr);
        if (iWe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[iWe];
        for (int i10 = iWe - 1; i10 >= 0; i10--) {
            jLongValue = operation.invoke(Long.valueOf(jArr[i10]), Long.valueOf(jLongValue)).longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final List<Double> Kr(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<Double> listQz = qz(dArr);
        z.m1(listQz);
        return listQz;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Ks(byte[] bArr, R r10, yh.p<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        for (byte b10 : bArr) {
            r10 = operation.invoke(r10, Byte.valueOf(b10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final short Kt(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Short shValueOf = null;
        boolean z10 = false;
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                shValueOf = Short.valueOf(s10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.f0.n(shValueOf, "null cannot be cast to non-null type kotlin.Short");
        return shValueOf.shortValue();
    }

    @dl.d
    public static final <T> T[] Ku(@dl.d T[] tArr, @dl.d Collection<Integer> indices) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        T[] tArr2 = (T[]) kotlin.collections.k.a(tArr, indices.size());
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            tArr2[i10] = tArr[it.next().intValue()];
            i10++;
        }
        return tArr2;
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Integer> Kv(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return kw(iArr, new kotlin.comparisons.g.a(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final <T> int Kw(@dl.d T[] tArr, @dl.d yh.l<? super T, Integer> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (T t10 : tArr) {
            iIntValue += selector.invoke(t10).intValue();
        }
        return iIntValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfUInt")
    @sh.f
    private static final int Kx(short[] sArr, yh.l<? super Short, n1> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iH = n1.h(0);
        for (short s10 : sArr) {
            iH = n1.h(iH + selector.invoke(Short.valueOf(s10)).q0());
        }
        return iH;
    }

    @dl.d
    public static final <C extends Collection<? super Character>> C Ky(@dl.d char[] cArr, @dl.d C destination) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (char c10 : cArr) {
            destination.add(Character.valueOf(c10));
        }
        return destination;
    }

    @dl.d
    public static final Set<Integer> Kz(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? (Set) Ny(iArr, new LinkedHashSet(r0.j(iArr.length))) : c1.f(Integer.valueOf(iArr[0]));
        }
        return d1.k();
    }

    public static final boolean L5(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final <K> Map<K, Short> L6(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(sArr.length), 16));
        for (short s10 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s10)), Short.valueOf(s10));
        }
        return linkedHashMap;
    }

    public static final double L7(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (int i11 : iArr) {
            d10 += (double) i11;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @sh.f
    private static final short L8(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return sArr[4];
    }

    @dl.d
    public static final List<Long> L9(@dl.d long[] jArr, int i10) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (i10 >= 0) {
            return ky(jArr, fi.u.u(jArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R, V> List<V> LA(@dl.d int[] iArr, @dl.d R[] other, @dl.d yh.p<? super Integer, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Float> La(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <T, C extends Collection<? super T>> C Lb(@dl.d T[] tArr, @dl.d C destination, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @dl.e
    public static final Integer Lc(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    public static final <R> R Ld(@dl.d long[] jArr, R r10, @dl.d yh.p<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (long j10 : jArr) {
            r10 = operation.invoke(r10, Long.valueOf(j10));
        }
        return r10;
    }

    @dl.d
    public static final fi.l Le(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return new fi.l(0, Ue(fArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Lf(@dl.d byte[] bArr, @dl.d M destination, @dl.d yh.l<? super Byte, ? extends K> keySelector, @dl.d yh.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    @dl.d
    public static final Set<Short> Lg(@dl.d short[] sArr, @dl.d Iterable<Short> other) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Short> setEz = Ez(sArr);
        x.O0(setEz, other);
        return setEz;
    }

    public static /* synthetic */ String Lh(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        return Ch(jArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.d
    public static final <R> List<R> Li(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(transform.invoke(Float.valueOf(f10)));
        }
        return arrayList;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T Lj(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int iXe = Xe(tArr);
        if (iXe == 0) {
            return t10;
        }
        R rInvoke = selector.invoke(t10);
        k0 it = new fi.l(1, iXe).iterator();
        while (it.hasNext()) {
            T t11 = tArr[it.nextInt()];
            R rInvoke2 = selector.invoke(t11);
            if (rInvoke.compareTo(rInvoke2) < 0) {
                t10 = t11;
                rInvoke = rInvoke2;
            }
        }
        return t10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float Lk(int[] iArr, yh.l<? super Integer, Float> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    public static final byte Ll(@dl.d byte[] bArr, @dl.d Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) < 0) {
                b10 = b11;
            }
        }
        return b10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Lm(short[] sArr, yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Float Ln(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            fMin = Math.min(fMin, fArr[it.nextInt()]);
        }
        return Float.valueOf(fMin);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final char[] Lo(char[] cArr, yh.l<? super Character, b2> action) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (char c10 : cArr) {
            action.invoke(Character.valueOf(c10));
        }
        return cArr;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final Float Lp(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return Mp(fArr, Random.f125033b);
    }

    public static final <S, T extends S> S Lq(@dl.d T[] tArr, @dl.d yh.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iXe = Xe(tArr);
        if (iXe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[iXe];
        for (int i10 = iXe - 1; i10 >= 0; i10--) {
            sInvoke = operation.invoke((Object) tArr[i10], sInvoke);
        }
        return sInvoke;
    }

    @dl.d
    public static final List<Float> Lr(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<Float> listRz = rz(fArr);
        z.m1(listRz);
        return listRz;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Ls(char[] cArr, R r10, yh.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r10);
        for (char c10 : cArr) {
            r10 = operation.invoke(r10, Character.valueOf(c10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final boolean Lt(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return zArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @dl.d
    public static final short[] Lu(@dl.d short[] sArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? new short[0] : kotlin.collections.m.N1(sArr, indices.D().intValue(), indices.e().intValue() + 1);
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Long> Lv(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return lw(jArr, new kotlin.comparisons.g.a(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final int Lw(@dl.d short[] sArr, @dl.d yh.l<? super Short, Integer> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (short s10 : sArr) {
            iIntValue += selector.invoke(Short.valueOf(s10)).intValue();
        }
        return iIntValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfUInt")
    @sh.f
    private static final int Lx(boolean[] zArr, yh.l<? super Boolean, n1> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iH = n1.h(0);
        for (boolean z10 : zArr) {
            iH = n1.h(iH + selector.invoke(Boolean.valueOf(z10)).q0());
        }
        return iH;
    }

    @dl.d
    public static final <C extends Collection<? super Double>> C Ly(@dl.d double[] dArr, @dl.d C destination) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (double d10 : dArr) {
            destination.add(Double.valueOf(d10));
        }
        return destination;
    }

    @dl.d
    public static final Set<Long> Lz(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            return length != 1 ? (Set) Oy(jArr, new LinkedHashSet(r0.j(jArr.length))) : c1.f(Long.valueOf(jArr[0]));
        }
        return d1.k();
    }

    public static final boolean M5(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @dl.d
    public static final <K, V> Map<K, V> M6(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends K> keySelector, @dl.d yh.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(sArr.length), 16));
        for (short s10 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s10)), valueTransform.invoke(Short.valueOf(s10)));
        }
        return linkedHashMap;
    }

    public static final double M7(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (long j10 : jArr) {
            d10 += j10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @sh.f
    private static final boolean M8(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr[4];
    }

    @dl.d
    public static final <T> List<T> M9(@dl.d T[] tArr, int i10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (i10 >= 0) {
            return ly(tArr, fi.u.u(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R> List<Pair<Long, R>> MA(@dl.d long[] jArr, @dl.d Iterable<? extends R> other) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(kotlin.c1.a(Long.valueOf(jArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final List<Integer> Ma(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <C extends Collection<? super Short>> C Mb(@dl.d short[] sArr, @dl.d C destination, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                destination.add(Short.valueOf(s10));
            }
        }
        return destination;
    }

    @dl.e
    public static final Long Mc(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Md(@dl.d T[] tArr, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (a.a.a.a.d.p.d.c.C0001c.a aVar : tArr) {
            r10 = operation.invoke(r10, aVar);
        }
        return r10;
    }

    @dl.d
    public static final fi.l Me(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return new fi.l(0, Ve(iArr));
    }

    @dl.d
    public static final <K, M extends Map<? super K, List<Character>>> M Mf(@dl.d char[] cArr, @dl.d M destination, @dl.d yh.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(c10));
        }
        return destination;
    }

    @dl.d
    public static final Set<Boolean> Mg(@dl.d boolean[] zArr, @dl.d Iterable<Boolean> other) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Boolean> setFz = Fz(zArr);
        x.O0(setFz, other);
        return setFz;
    }

    public static /* synthetic */ String Mh(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        return Dh(objArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.d
    public static final <R> List<R> Mi(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(transform.invoke(Integer.valueOf(i10)));
        }
        return arrayList;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> short Mj(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int iYe = Ye(sArr);
        if (iYe == 0) {
            return s10;
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        k0 it = new fi.l(1, iYe).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                s10 = s11;
                rInvoke = rInvoke2;
            }
        }
        return s10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float Mk(long[] jArr, yh.l<? super Long, Float> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    public static final char Ml(@dl.d char[] cArr, @dl.d Comparator<? super Character> comparator) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) < 0) {
                c10 = c11;
            }
        }
        return c10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Mm(boolean[] zArr, yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Float Mn(@dl.d Float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        k0 it = new fi.l(1, Xe(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final double[] Mo(double[] dArr, yh.l<? super Double, b2> action) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (double d10 : dArr) {
            action.invoke(Double.valueOf(d10));
        }
        return dArr;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Float Mp(@dl.d float[] fArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[random.m(fArr.length)]);
    }

    public static final short Mq(@dl.d short[] sArr, @dl.d yh.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iYe = Ye(sArr);
        if (iYe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[iYe];
        for (int i10 = iYe - 1; i10 >= 0; i10--) {
            sShortValue = operation.invoke(Short.valueOf(sArr[i10]), Short.valueOf(sShortValue)).shortValue();
        }
        return sShortValue;
    }

    @dl.d
    public static final List<Integer> Mr(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<Integer> listSz = sz(iArr);
        z.m1(listSz);
        return listSz;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Ms(double[] dArr, R r10, yh.p<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r10);
        for (double d10 : dArr) {
            r10 = operation.invoke(r10, Double.valueOf(d10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final boolean Mt(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Boolean boolValueOf = null;
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                boolValueOf = Boolean.valueOf(z11);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.f0.n(boolValueOf, "null cannot be cast to non-null type kotlin.Boolean");
        return boolValueOf.booleanValue();
    }

    @dl.d
    public static final short[] Mu(@dl.d short[] sArr, @dl.d Collection<Integer> indices) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        short[] sArr2 = new short[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            sArr2[i10] = sArr[it.next().intValue()];
            i10++;
        }
        return sArr2;
    }

    @dl.d
    public static final <T, R extends Comparable<? super R>> List<T> Mv(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return mw(tArr, new kotlin.comparisons.g.a(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final int Mw(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Integer> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (boolean z10 : zArr) {
            iIntValue += selector.invoke(Boolean.valueOf(z10)).intValue();
        }
        return iIntValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfULong")
    @sh.f
    private static final long Mx(byte[] bArr, yh.l<? super Byte, r1> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jH = r1.h(0L);
        for (byte b10 : bArr) {
            jH = r1.h(jH + selector.invoke(Byte.valueOf(b10)).q0());
        }
        return jH;
    }

    @dl.d
    public static final <C extends Collection<? super Float>> C My(@dl.d float[] fArr, @dl.d C destination) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (float f10 : fArr) {
            destination.add(Float.valueOf(f10));
        }
        return destination;
    }

    @dl.d
    public static final <T> Set<T> Mz(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? (Set) Py(tArr, new LinkedHashSet(r0.j(tArr.length))) : c1.f(tArr[0]);
        }
        return d1.k();
    }

    public static final boolean N5(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final <K> Map<K, Boolean> N6(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(zArr.length), 16));
        for (boolean z10 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z10)), Boolean.valueOf(z10));
        }
        return linkedHashMap;
    }

    public static final double N7(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (short s10 : sArr) {
            d10 += (double) s10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static final boolean N8(@dl.d byte[] bArr, byte b10) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return dg(bArr, b10) >= 0;
    }

    @dl.d
    public static final List<Short> N9(@dl.d short[] sArr, int i10) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (i10 >= 0) {
            return my(sArr, fi.u.u(sArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R, V> List<V> NA(@dl.d long[] jArr, @dl.d Iterable<? extends R> other, @dl.d yh.p<? super Long, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Long.valueOf(jArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final List<Long> Na(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <C extends Collection<? super Boolean>> C Nb(@dl.d boolean[] zArr, @dl.d C destination, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                destination.add(Boolean.valueOf(z10));
            }
        }
        return destination;
    }

    @dl.e
    public static final Long Nc(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
        }
        return null;
    }

    public static final <R> R Nd(@dl.d short[] sArr, R r10, @dl.d yh.p<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (short s10 : sArr) {
            r10 = operation.invoke(r10, Short.valueOf(s10));
        }
        return r10;
    }

    @dl.d
    public static final fi.l Ne(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return new fi.l(0, We(jArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Nf(@dl.d char[] cArr, @dl.d M destination, @dl.d yh.l<? super Character, ? extends K> keySelector, @dl.d yh.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @sh.f
    private static final boolean Ng(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return bArr.length == 0;
    }

    public static /* synthetic */ String Nh(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        return Eh(sArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.d
    public static final <R> List<R> Ni(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(transform.invoke(Long.valueOf(j10)));
        }
        return arrayList;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> boolean Nj(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z10 = zArr[0];
        int iZe = Ze(zArr);
        if (iZe == 0) {
            return z10;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        k0 it = new fi.l(1, iZe).iterator();
        while (it.hasNext()) {
            boolean z11 = zArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                z10 = z11;
                rInvoke = rInvoke2;
            }
        }
        return z10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> Float Nk(T[] tArr, yh.l<? super T, Float> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(tArr[it.nextInt()]).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    public static final double Nl(@dl.d double[] dArr, @dl.d Comparator<? super Double> comparator) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d10 = dArr[0];
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            double d11 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) < 0) {
                d10 = d11;
            }
        }
        return d10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Nm(byte[] bArr, yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Integer Nn(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            if (i10 > i11) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final float[] No(float[] fArr, yh.l<? super Float, b2> action) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (float f10 : fArr) {
            action.invoke(Float.valueOf(f10));
        }
        return fArr;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final Integer Np(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return Op(iArr, Random.f125033b);
    }

    public static final boolean Nq(@dl.d boolean[] zArr, @dl.d yh.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iZe = Ze(zArr);
        if (iZe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[iZe];
        for (int i10 = iZe - 1; i10 >= 0; i10--) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zArr[i10]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return zBooleanValue;
    }

    @dl.d
    public static final List<Long> Nr(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<Long> listTz = tz(jArr);
        z.m1(listTz);
        return listTz;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Ns(float[] fArr, R r10, yh.p<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r10);
        for (float f10 : fArr) {
            r10 = operation.invoke(r10, Float.valueOf(f10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Boolean Nt(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    @dl.d
    public static final boolean[] Nu(@dl.d boolean[] zArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? new boolean[0] : kotlin.collections.m.O1(zArr, indices.D().intValue(), indices.e().intValue() + 1);
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Short> Nv(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return nw(sArr, new kotlin.comparisons.g.a(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final double Nw(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (byte b10 : bArr) {
            dDoubleValue += selector.invoke(Byte.valueOf(b10)).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfULong")
    @sh.f
    private static final long Nx(char[] cArr, yh.l<? super Character, r1> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jH = r1.h(0L);
        for (char c10 : cArr) {
            jH = r1.h(jH + selector.invoke(Character.valueOf(c10)).q0());
        }
        return jH;
    }

    @dl.d
    public static final <C extends Collection<? super Integer>> C Ny(@dl.d int[] iArr, @dl.d C destination) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (int i10 : iArr) {
            destination.add(Integer.valueOf(i10));
        }
        return destination;
    }

    @dl.d
    public static final Set<Short> Nz(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            return length != 1 ? (Set) Qy(sArr, new LinkedHashSet(r0.j(sArr.length))) : c1.f(Short.valueOf(sArr[0]));
        }
        return d1.k();
    }

    public static final boolean O5(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @dl.d
    public static final <K, V> Map<K, V> O6(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends K> keySelector, @dl.d yh.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(zArr.length), 16));
        for (boolean z10 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z10)), valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    @xh.h(name = "averageOfByte")
    public static final double O7(@dl.d Byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        double dByteValue = 0.0d;
        int i10 = 0;
        for (Byte b10 : bArr) {
            dByteValue += (double) b10.byteValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i10);
    }

    public static final boolean O8(@dl.d char[] cArr, char c10) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return eg(cArr, c10) >= 0;
    }

    @dl.d
    public static final List<Boolean> O9(@dl.d boolean[] zArr, int i10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (i10 >= 0) {
            return ny(zArr, fi.u.u(zArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final List<Pair<Long, Long>> OA(@dl.d long[] jArr, @dl.d long[] other) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(kotlin.c1.a(Long.valueOf(jArr[i10]), Long.valueOf(other[i10])));
        }
        return arrayList;
    }

    @dl.d
    public static final <T> List<T> Oa(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @sh.f
    private static final Boolean Ob(boolean[] zArr, yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }

    @dl.e
    public static final <T> T Oc(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final <R> R Od(@dl.d boolean[] zArr, R r10, @dl.d yh.p<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (boolean z10 : zArr) {
            r10 = operation.invoke(r10, Boolean.valueOf(z10));
        }
        return r10;
    }

    @dl.d
    public static final <T> fi.l Oe(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return new fi.l(0, Xe(tArr));
    }

    @dl.d
    public static final <K, M extends Map<? super K, List<Double>>> M Of(@dl.d double[] dArr, @dl.d M destination, @dl.d yh.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (double d10 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Double.valueOf(d10));
        }
        return destination;
    }

    @sh.f
    private static final boolean Og(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return cArr.length == 0;
    }

    public static /* synthetic */ String Oh(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        return Fh(zArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.d
    public static final <T, R> List<R> Oi(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t10 : tArr) {
            arrayList.add(transform.invoke(t10));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double Oj(byte[] bArr, yh.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float Ok(short[] sArr, yh.l<? super Short, Float> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    public static final float Ol(@dl.d float[] fArr, @dl.d Comparator<? super Float> comparator) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f10 = fArr[0];
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            float f11 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) < 0) {
                f10 = f11;
            }
        }
        return f10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Om(char[] cArr, yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Long On(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            if (j10 > j11) {
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final int[] Oo(int[] iArr, yh.l<? super Integer, b2> action) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (int i10 : iArr) {
            action.invoke(Integer.valueOf(i10));
        }
        return iArr;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Integer Op(@dl.d int[] iArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[random.m(iArr.length)]);
    }

    public static final byte Oq(@dl.d byte[] bArr, @dl.d yh.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iRe = Re(bArr);
        if (iRe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[iRe];
        for (int i10 = iRe - 1; i10 >= 0; i10--) {
            bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bArr[i10]), Byte.valueOf(bByteValue)).byteValue();
        }
        return bByteValue;
    }

    @dl.d
    public static final <T> List<T> Or(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<T> listUz = uz(tArr);
        z.m1(listUz);
        return listUz;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Os(int[] iArr, R r10, yh.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        for (int i10 : iArr) {
            r10 = operation.invoke(r10, Integer.valueOf(i10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Boolean Ot(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        boolean z10 = false;
        Boolean boolValueOf = null;
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                if (z10) {
                    return null;
                }
                boolValueOf = Boolean.valueOf(z11);
                z10 = true;
            }
        }
        if (z10) {
            return boolValueOf;
        }
        return null;
    }

    @dl.d
    public static final boolean[] Ou(@dl.d boolean[] zArr, @dl.d Collection<Integer> indices) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        boolean[] zArr2 = new boolean[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr2[i10] = zArr[it.next().intValue()];
            i10++;
        }
        return zArr2;
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Boolean> Ov(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return ow(zArr, new kotlin.comparisons.g.a(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final double Ow(@dl.d char[] cArr, @dl.d yh.l<? super Character, Double> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (char c10 : cArr) {
            dDoubleValue += selector.invoke(Character.valueOf(c10)).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfULong")
    @sh.f
    private static final long Ox(double[] dArr, yh.l<? super Double, r1> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jH = r1.h(0L);
        for (double d10 : dArr) {
            jH = r1.h(jH + selector.invoke(Double.valueOf(d10)).q0());
        }
        return jH;
    }

    @dl.d
    public static final <C extends Collection<? super Long>> C Oy(@dl.d long[] jArr, @dl.d C destination) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (long j10 : jArr) {
            destination.add(Long.valueOf(j10));
        }
        return destination;
    }

    @dl.d
    public static final Set<Boolean> Oz(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            return length != 1 ? (Set) Ry(zArr, new LinkedHashSet(r0.j(zArr.length))) : c1.f(Boolean.valueOf(zArr[0]));
        }
        return d1.k();
    }

    public static final boolean P5(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final <K, M extends Map<? super K, ? super Byte>> M P6(@dl.d byte[] bArr, @dl.d M destination, @dl.d yh.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (byte b10 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b10)), Byte.valueOf(b10));
        }
        return destination;
    }

    @xh.h(name = "averageOfDouble")
    public static final double P7(@dl.d Double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        double dDoubleValue = 0.0d;
        int i10 = 0;
        for (Double d10 : dArr) {
            dDoubleValue += d10.doubleValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i10);
    }

    @kotlin.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.s0(expression = "any { it == element }", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136930u, hiddenSince = org.apache.tools.ant.util.s0.f136932w, warningSince = "1.4")
    public static final /* synthetic */ boolean P8(double[] dArr, double d10) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        for (double d11 : dArr) {
            if (d11 == d10) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final List<Byte> P9(@dl.d byte[] bArr, int i10) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (i10 >= 0) {
            return Vx(bArr, fi.u.u(bArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <V> List<V> PA(@dl.d long[] jArr, @dl.d long[] other, @dl.d yh.p<? super Long, ? super Long, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i10]), Long.valueOf(other[i10])));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Short> Pa(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            }
        }
        return arrayList;
    }

    @sh.f
    private static final Byte Pb(byte[] bArr, yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
        }
        return null;
    }

    @dl.e
    public static final <T> T Pc(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    public static final <R> R Pd(@dl.d byte[] bArr, R r10, @dl.d yh.q<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    @dl.d
    public static final fi.l Pe(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return new fi.l(0, Ye(sArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Pf(@dl.d double[] dArr, @dl.d M destination, @dl.d yh.l<? super Double, ? extends K> keySelector, @dl.d yh.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (double d10 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    @sh.f
    private static final boolean Pg(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr.length == 0;
    }

    public static final byte Ph(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[Re(bArr)];
    }

    @dl.d
    public static final <R> List<R> Pi(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(transform.invoke(Short.valueOf(s10)));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double Pj(char[] cArr, yh.l<? super Character, Double> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float Pk(boolean[] zArr, yh.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    public static final int Pl(@dl.d int[] iArr, @dl.d Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i11)) < 0) {
                i10 = i11;
            }
        }
        return i10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Pm(double[] dArr, yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Short Pn(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            if (s10 > s11) {
                s10 = s11;
            }
        }
        return Short.valueOf(s10);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final long[] Po(long[] jArr, yh.l<? super Long, b2> action) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (long j10 : jArr) {
            action.invoke(Long.valueOf(j10));
        }
        return jArr;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final Long Pp(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return Qp(jArr, Random.f125033b);
    }

    public static final char Pq(@dl.d char[] cArr, @dl.d yh.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iSe = Se(cArr);
        if (iSe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char cCharValue = cArr[iSe];
        for (int i10 = iSe - 1; i10 >= 0; i10--) {
            cCharValue = operation.invoke(Integer.valueOf(i10), Character.valueOf(cArr[i10]), Character.valueOf(cCharValue)).charValue();
        }
        return cCharValue;
    }

    @dl.d
    public static final List<Short> Pr(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<Short> listVz = vz(sArr);
        z.m1(listVz);
        return listVz;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Ps(long[] jArr, R r10, yh.p<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        for (long j10 : jArr) {
            r10 = operation.invoke(r10, Long.valueOf(j10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Byte Pt(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> void Pu(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length > 1) {
            kotlin.collections.m.I4(tArr, new kotlin.comparisons.g.a(selector));
        }
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Byte> Pv(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return gw(bArr, new kotlin.comparisons.g.c(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final double Pw(@dl.d double[] dArr, @dl.d yh.l<? super Double, Double> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (double d10 : dArr) {
            dDoubleValue += selector.invoke(Double.valueOf(d10)).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfULong")
    @sh.f
    private static final long Px(float[] fArr, yh.l<? super Float, r1> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jH = r1.h(0L);
        for (float f10 : fArr) {
            jH = r1.h(jH + selector.invoke(Float.valueOf(f10)).q0());
        }
        return jH;
    }

    @dl.d
    public static final <T, C extends Collection<? super T>> C Py(@dl.d T[] tArr, @dl.d C destination) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (T t10 : tArr) {
            destination.add(t10);
        }
        return destination;
    }

    @dl.d
    public static final short[] Pz(@dl.d Short[] shArr) {
        kotlin.jvm.internal.f0.p(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = shArr[i10].shortValue();
        }
        return sArr;
    }

    public static final <T> boolean Q5(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M Q6(@dl.d byte[] bArr, @dl.d M destination, @dl.d yh.l<? super Byte, ? extends K> keySelector, @dl.d yh.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (byte b10 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b10)), valueTransform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    @xh.h(name = "averageOfFloat")
    public static final double Q7(@dl.d Float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        double dFloatValue = 0.0d;
        int i10 = 0;
        for (Float f10 : fArr) {
            dFloatValue += (double) f10.floatValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i10);
    }

    @kotlin.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.s0(expression = "any { it == element }", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136930u, hiddenSince = org.apache.tools.ant.util.s0.f136932w, warningSince = "1.4")
    public static final /* synthetic */ boolean Q8(float[] fArr, float f10) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        for (float f11 : fArr) {
            if (f11 == f10) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final List<Character> Q9(@dl.d char[] cArr, int i10) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (i10 >= 0) {
            return Wx(cArr, fi.u.u(cArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R> List<Pair<Long, R>> QA(@dl.d long[] jArr, @dl.d R[] other) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            long j10 = jArr[i10];
            arrayList.add(kotlin.c1.a(Long.valueOf(j10), other[i10]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Boolean> Qa(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    @sh.f
    private static final Character Qb(char[] cArr, yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
        }
        return null;
    }

    @dl.e
    public static final Short Qc(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    public static final <R> R Qd(@dl.d char[] cArr, R r10, @dl.d yh.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    @dl.d
    public static final fi.l Qe(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return new fi.l(0, Ze(zArr));
    }

    @dl.d
    public static final <K, M extends Map<? super K, List<Float>>> M Qf(@dl.d float[] fArr, @dl.d M destination, @dl.d yh.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (float f10 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f10));
        }
        return destination;
    }

    @sh.f
    private static final boolean Qg(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr.length == 0;
    }

    public static final byte Qh(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                byte b10 = bArr[length];
                if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                    return b10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @dl.d
    public static final <R> List<R> Qi(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(transform.invoke(Boolean.valueOf(z10)));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double Qj(double[] dArr, yh.l<? super Double, Double> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R Qk(byte[] bArr, Comparator<? super R> comparator, yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    public static final long Ql(@dl.d long[] jArr, @dl.d Comparator<? super Long> comparator) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) < 0) {
                j10 = j11;
            }
        }
        return j10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Qm(float[] fArr, yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final byte Qn(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            if (b10 > b11) {
                b10 = b11;
            }
        }
        return b10;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <T> T[] Qo(T[] tArr, yh.l<? super T, b2> action) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (T t10 : tArr) {
            action.invoke(t10);
        }
        return tArr;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Long Qp(@dl.d long[] jArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[random.m(jArr.length)]);
    }

    public static final double Qq(@dl.d double[] dArr, @dl.d yh.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iTe = Te(dArr);
        if (iTe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[iTe];
        for (int i10 = iTe - 1; i10 >= 0; i10--) {
            dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dArr[i10]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final List<Boolean> Qr(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<Boolean> listWz = wz(zArr);
        z.m1(listWz);
        return listWz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final <T, R> List<R> Qs(@dl.d T[] tArr, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r10);
        for (a.a.a.a.d.p.d.c.C0001c.a aVar : tArr) {
            r10 = operation.invoke(r10, aVar);
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Byte Qt(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        boolean z10 = false;
        Byte bValueOf = null;
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                bValueOf = Byte.valueOf(b10);
                z10 = true;
            }
        }
        if (z10) {
            return bValueOf;
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> void Qu(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length > 1) {
            kotlin.collections.m.I4(tArr, new kotlin.comparisons.g.c(selector));
        }
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Character> Qv(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return hw(cArr, new kotlin.comparisons.g.c(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final double Qw(@dl.d float[] fArr, @dl.d yh.l<? super Float, Double> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (float f10 : fArr) {
            dDoubleValue += selector.invoke(Float.valueOf(f10)).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfULong")
    @sh.f
    private static final long Qx(int[] iArr, yh.l<? super Integer, r1> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jH = r1.h(0L);
        for (int i10 : iArr) {
            jH = r1.h(jH + selector.invoke(Integer.valueOf(i10)).q0());
        }
        return jH;
    }

    @dl.d
    public static final <C extends Collection<? super Short>> C Qy(@dl.d short[] sArr, @dl.d C destination) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (short s10 : sArr) {
            destination.add(Short.valueOf(s10));
        }
        return destination;
    }

    @dl.d
    public static final Set<Byte> Qz(@dl.d byte[] bArr, @dl.d Iterable<Byte> other) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Byte> setXz = xz(bArr);
        x.n0(setXz, other);
        return setXz;
    }

    public static final <T> boolean R5(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final <K, M extends Map<? super K, ? super Character>> M R6(@dl.d char[] cArr, @dl.d M destination, @dl.d yh.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (char c10 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c10)), Character.valueOf(c10));
        }
        return destination;
    }

    @xh.h(name = "averageOfInt")
    public static final double R7(@dl.d Integer[] numArr) {
        kotlin.jvm.internal.f0.p(numArr, "<this>");
        double dIntValue = 0.0d;
        int i10 = 0;
        for (Integer num : numArr) {
            dIntValue += (double) num.intValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i10);
    }

    public static final boolean R8(@dl.d int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return hg(iArr, i10) >= 0;
    }

    @dl.d
    public static final List<Double> R9(@dl.d double[] dArr, int i10) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (i10 >= 0) {
            return Xx(dArr, fi.u.u(dArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R, V> List<V> RA(@dl.d long[] jArr, @dl.d R[] other, @dl.d yh.p<? super Long, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Byte> Ra(@dl.d byte[] bArr, @dl.d yh.p<? super Integer, ? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @sh.f
    private static final Double Rb(double[] dArr, yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return Double.valueOf(d10);
            }
        }
        return null;
    }

    @dl.e
    public static final Short Rc(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
        }
        return null;
    }

    public static final <R> R Rd(@dl.d double[] dArr, R r10, @dl.d yh.q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final int Re(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return bArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Rf(@dl.d float[] fArr, @dl.d M destination, @dl.d yh.l<? super Float, ? extends K> keySelector, @dl.d yh.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (float f10 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    @sh.f
    private static final boolean Rg(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr.length == 0;
    }

    public static final char Rh(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[Se(cArr)];
    }

    @dl.d
    public static final <R> List<R> Ri(@dl.d byte[] bArr, @dl.d yh.p<? super Integer, ? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double Rj(float[] fArr, yh.l<? super Float, Double> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R Rk(char[] cArr, Comparator<? super R> comparator, yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    public static final <T> T Rl(@dl.d T[] tArr, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t11 = tArr[it.nextInt()];
            if (comparator.compare(t10, t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Rm(int[] iArr, yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final char Rn(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            if (kotlin.jvm.internal.f0.t(c10, c11) > 0) {
                c10 = c11;
            }
        }
        return c10;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final short[] Ro(short[] sArr, yh.l<? super Short, b2> action) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (short s10 : sArr) {
            action.invoke(Short.valueOf(s10));
        }
        return sArr;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <T> T Rp(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return (T) Sp(tArr, Random.f125033b);
    }

    public static final float Rq(@dl.d float[] fArr, @dl.d yh.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iUe = Ue(fArr);
        if (iUe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[iUe];
        for (int i10 = iUe - 1; i10 >= 0; i10--) {
            fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fArr[i10]), Float.valueOf(fFloatValue)).floatValue();
        }
        return fFloatValue;
    }

    @dl.d
    public static final byte[] Rr(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int iRe = Re(bArr);
        k0 it = new fi.l(0, iRe).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            bArr2[iRe - iNextInt] = bArr[iNextInt];
        }
        return bArr2;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Rs(short[] sArr, R r10, yh.p<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        for (short s10 : sArr) {
            r10 = operation.invoke(r10, Short.valueOf(s10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Character Rt(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    public static final void Ru(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length > 1) {
            kotlin.collections.m.h4(bArr);
            qr(bArr);
        }
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Double> Rv(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return iw(dArr, new kotlin.comparisons.g.c(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final double Rw(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 : iArr) {
            dDoubleValue += selector.invoke(Integer.valueOf(i10)).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfULong")
    @sh.f
    private static final long Rx(long[] jArr, yh.l<? super Long, r1> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jH = r1.h(0L);
        for (long j10 : jArr) {
            jH = r1.h(jH + selector.invoke(Long.valueOf(j10)).q0());
        }
        return jH;
    }

    @dl.d
    public static final <C extends Collection<? super Boolean>> C Ry(@dl.d boolean[] zArr, @dl.d C destination) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (boolean z10 : zArr) {
            destination.add(Boolean.valueOf(z10));
        }
        return destination;
    }

    @dl.d
    public static final Set<Character> Rz(@dl.d char[] cArr, @dl.d Iterable<Character> other) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Character> setYz = yz(cArr);
        x.n0(setYz, other);
        return setYz;
    }

    public static final boolean S5(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M S6(@dl.d char[] cArr, @dl.d M destination, @dl.d yh.l<? super Character, ? extends K> keySelector, @dl.d yh.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (char c10 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c10)), valueTransform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @xh.h(name = "averageOfLong")
    public static final double S7(@dl.d Long[] lArr) {
        kotlin.jvm.internal.f0.p(lArr, "<this>");
        double dLongValue = 0.0d;
        int i10 = 0;
        for (Long l10 : lArr) {
            dLongValue += l10.longValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i10);
    }

    public static final boolean S8(@dl.d long[] jArr, long j10) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return ig(jArr, j10) >= 0;
    }

    @dl.d
    public static final List<Float> S9(@dl.d float[] fArr, int i10) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (i10 >= 0) {
            return Yx(fArr, fi.u.u(fArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <T, R> List<Pair<T, R>> SA(@dl.d T[] tArr, @dl.d Iterable<? extends R> other) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(kotlin.c1.a(tArr[i10], r10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final List<Character> Sa(@dl.d char[] cArr, @dl.d yh.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char c10 = cArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @sh.f
    private static final Float Sb(float[] fArr, yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
        }
        return null;
    }

    @dl.d
    public static final <R> List<R> Sc(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            x.n0(arrayList, transform.invoke(Byte.valueOf(b10)));
        }
        return arrayList;
    }

    public static final <R> R Sd(@dl.d float[] fArr, R r10, @dl.d yh.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Float.valueOf(fArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final int Se(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return cArr.length - 1;
    }

    @dl.d
    public static final <K, M extends Map<? super K, List<Integer>>> M Sf(@dl.d int[] iArr, @dl.d M destination, @dl.d yh.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i10));
        }
        return destination;
    }

    @sh.f
    private static final boolean Sg(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr.length == 0;
    }

    public static final char Sh(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char c10 = cArr[length];
                if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                    return c10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @dl.d
    public static final <R> List<R> Si(@dl.d char[] cArr, @dl.d yh.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double Sj(int[] iArr, yh.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R Sk(double[] dArr, Comparator<? super R> comparator, yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    public static final short Sl(@dl.d short[] sArr, @dl.d Comparator<? super Short> comparator) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) < 0) {
                s10 = s11;
            }
        }
        return s10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Sm(long[] jArr, yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final double Sn(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dMin = dArr[0];
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            dMin = Math.min(dMin, dArr[it.nextInt()]);
        }
        return dMin;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final boolean[] So(boolean[] zArr, yh.l<? super Boolean, b2> action) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (boolean z10 : zArr) {
            action.invoke(Boolean.valueOf(z10));
        }
        return zArr;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final <T> T Sp(@dl.d T[] tArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[random.m(tArr.length)];
    }

    public static final int Sq(@dl.d int[] iArr, @dl.d yh.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iVe = Ve(iArr);
        if (iVe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[iVe];
        for (int i10 = iVe - 1; i10 >= 0; i10--) {
            iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]), Integer.valueOf(iIntValue)).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final char[] Sr(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int iSe = Se(cArr);
        k0 it = new fi.l(0, iSe).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cArr2[iSe - iNextInt] = cArr[iNextInt];
        }
        return cArr2;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Ss(boolean[] zArr, R r10, yh.p<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r10);
        for (boolean z10 : zArr) {
            r10 = operation.invoke(r10, Boolean.valueOf(z10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Character St(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        boolean z10 = false;
        Character chValueOf = null;
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                chValueOf = Character.valueOf(c10);
                z10 = true;
            }
        }
        if (z10) {
            return chValueOf;
        }
        return null;
    }

    @kotlin.u0(version = "1.4")
    public static final void Su(@dl.d byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.collections.m.i4(bArr, i10, i11);
        rr(bArr, i10, i11);
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Float> Sv(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return jw(fArr, new kotlin.comparisons.g.c(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final double Sw(@dl.d long[] jArr, @dl.d yh.l<? super Long, Double> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (long j10 : jArr) {
            dDoubleValue += selector.invoke(Long.valueOf(j10)).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfULong")
    @sh.f
    private static final <T> long Sx(T[] tArr, yh.l<? super T, r1> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jH = r1.h(0L);
        for (T t10 : tArr) {
            jH = r1.h(jH + selector.invoke(t10).q0());
        }
        return jH;
    }

    @dl.d
    public static final double[] Sy(@dl.d Double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = dArr[i10].doubleValue();
        }
        return dArr2;
    }

    @dl.d
    public static final Set<Double> Sz(@dl.d double[] dArr, @dl.d Iterable<Double> other) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Double> setZz = zz(dArr);
        x.n0(setZz, other);
        return setZz;
    }

    public static final boolean T5(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final <K, M extends Map<? super K, ? super Double>> M T6(@dl.d double[] dArr, @dl.d M destination, @dl.d yh.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (double d10 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d10)), Double.valueOf(d10));
        }
        return destination;
    }

    @xh.h(name = "averageOfShort")
    public static final double T7(@dl.d Short[] shArr) {
        kotlin.jvm.internal.f0.p(shArr, "<this>");
        double dShortValue = 0.0d;
        int i10 = 0;
        for (Short sh2 : shArr) {
            dShortValue += (double) sh2.shortValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i10);
    }

    public static final <T> boolean T8(@dl.d T[] tArr, T t10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return jg(tArr, t10) >= 0;
    }

    @dl.d
    public static final List<Integer> T9(@dl.d int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (i10 >= 0) {
            return Zx(iArr, fi.u.u(iArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T, R, V> List<V> TA(@dl.d T[] tArr, @dl.d Iterable<? extends R> other, @dl.d yh.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(tArr[i10], r10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final List<Double> Ta(@dl.d double[] dArr, @dl.d yh.p<? super Integer, ? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            double d10 = dArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @sh.f
    private static final Integer Tb(int[] iArr, yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    @dl.d
    public static final <R> List<R> Tc(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            x.n0(arrayList, transform.invoke(Character.valueOf(c10)));
        }
        return arrayList;
    }

    public static final <R> R Td(@dl.d int[] iArr, R r10, @dl.d yh.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final int Te(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Tf(@dl.d int[] iArr, @dl.d M destination, @dl.d yh.l<? super Integer, ? extends K> keySelector, @dl.d yh.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @sh.f
    private static final <T> boolean Tg(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr.length == 0;
    }

    public static final double Th(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[Te(dArr)];
    }

    @dl.d
    public static final <R> List<R> Ti(@dl.d double[] dArr, @dl.d yh.p<? super Integer, ? super Double, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double Tj(long[] jArr, yh.l<? super Long, Double> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R Tk(float[] fArr, Comparator<? super R> comparator, yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    public static final boolean Tl(@dl.d boolean[] zArr, @dl.d Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z10 = zArr[0];
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            boolean z11 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) < 0) {
                z10 = z11;
            }
        }
        return z10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R extends Comparable<? super R>> R Tm(T[] tArr, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final double Tn(@dl.d Double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        k0 it = new fi.l(1, Xe(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, dArr[it.nextInt()].doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final byte[] To(byte[] bArr, yh.p<? super Integer, ? super Byte, b2> action) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
        return bArr;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final Short Tp(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return Up(sArr, Random.f125033b);
    }

    public static final long Tq(@dl.d long[] jArr, @dl.d yh.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iWe = We(jArr);
        if (iWe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[iWe];
        for (int i10 = iWe - 1; i10 >= 0; i10--) {
            jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jArr[i10]), Long.valueOf(jLongValue)).longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final double[] Tr(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int iTe = Te(dArr);
        k0 it = new fi.l(0, iTe).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            dArr2[iTe - iNextInt] = dArr[iNextInt];
        }
        return dArr2;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Ts(byte[] bArr, R r10, yh.q<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Byte.valueOf(bArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Double Tt(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    public static final void Tu(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length > 1) {
            kotlin.collections.m.j4(cArr);
            sr(cArr);
        }
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Integer> Tv(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return kw(iArr, new kotlin.comparisons.g.c(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final <T> double Tw(@dl.d T[] tArr, @dl.d yh.l<? super T, Double> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (T t10 : tArr) {
            dDoubleValue += selector.invoke(t10).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfULong")
    @sh.f
    private static final long Tx(short[] sArr, yh.l<? super Short, r1> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jH = r1.h(0L);
        for (short s10 : sArr) {
            jH = r1.h(jH + selector.invoke(Short.valueOf(s10)).q0());
        }
        return jH;
    }

    @dl.d
    public static final float[] Ty(@dl.d Float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = fArr[i10].floatValue();
        }
        return fArr2;
    }

    @dl.d
    public static final Set<Float> Tz(@dl.d float[] fArr, @dl.d Iterable<Float> other) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Float> setAz = Az(fArr);
        x.n0(setAz, other);
        return setAz;
    }

    public static final boolean U5(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M U6(@dl.d double[] dArr, @dl.d M destination, @dl.d yh.l<? super Double, ? extends K> keySelector, @dl.d yh.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (double d10 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d10)), valueTransform.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    @sh.f
    private static final byte U7(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return bArr[0];
    }

    public static final boolean U8(@dl.d short[] sArr, short s10) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return kg(sArr, s10) >= 0;
    }

    @dl.d
    public static final List<Long> U9(@dl.d long[] jArr, int i10) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (i10 >= 0) {
            return ay(jArr, fi.u.u(jArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <T, R> List<Pair<T, R>> UA(@dl.d T[] tArr, @dl.d R[] other) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(kotlin.c1.a(tArr[i10], other[i10]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Float> Ua(@dl.d float[] fArr, @dl.d yh.p<? super Integer, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            float f10 = fArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @sh.f
    private static final Long Ub(long[] jArr, yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
        }
        return null;
    }

    @dl.d
    public static final <R> List<R> Uc(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            x.n0(arrayList, transform.invoke(Double.valueOf(d10)));
        }
        return arrayList;
    }

    public static final <R> R Ud(@dl.d long[] jArr, R r10, @dl.d yh.q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final int Ue(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr.length - 1;
    }

    @dl.d
    public static final <K, M extends Map<? super K, List<Long>>> M Uf(@dl.d long[] jArr, @dl.d M destination, @dl.d yh.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Long.valueOf(j10));
        }
        return destination;
    }

    @sh.f
    private static final boolean Ug(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return sArr.length == 0;
    }

    public static final double Uh(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                double d10 = dArr[length];
                if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                    return d10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @dl.d
    public static final <R> List<R> Ui(@dl.d float[] fArr, @dl.d yh.p<? super Integer, ? super Float, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> double Uj(T[] tArr, yh.l<? super T, Double> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R Uk(int[] iArr, Comparator<? super R> comparator, yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Boolean Ul(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int iZe = Ze(zArr);
        if (iZe == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        k0 it = new fi.l(1, iZe).iterator();
        while (it.hasNext()) {
            boolean z11 = zArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                z10 = z11;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Um(short[] sArr, yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final float Un(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fMin = fArr[0];
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            fMin = Math.min(fMin, fArr[it.nextInt()]);
        }
        return fMin;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final char[] Uo(char[] cArr, yh.p<? super Integer, ? super Character, b2> action) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
        return cArr;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Short Up(@dl.d short[] sArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[random.m(sArr.length)]);
    }

    public static final <S, T extends S> S Uq(@dl.d T[] tArr, @dl.d yh.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iXe = Xe(tArr);
        if (iXe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[iXe];
        for (int i10 = iXe - 1; i10 >= 0; i10--) {
            sInvoke = operation.invoke(Integer.valueOf(i10), (Object) tArr[i10], sInvoke);
        }
        return sInvoke;
    }

    @dl.d
    public static final float[] Ur(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int iUe = Ue(fArr);
        k0 it = new fi.l(0, iUe).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            fArr2[iUe - iNextInt] = fArr[iNextInt];
        }
        return fArr2;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Us(char[] cArr, R r10, yh.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r10);
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(cArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Double Ut(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        boolean z10 = false;
        Double dValueOf = null;
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                dValueOf = Double.valueOf(d10);
                z10 = true;
            }
        }
        if (z10) {
            return dValueOf;
        }
        return null;
    }

    @kotlin.u0(version = "1.4")
    public static final void Uu(@dl.d char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.collections.m.k4(cArr, i10, i11);
        tr(cArr, i10, i11);
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Long> Uv(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return lw(jArr, new kotlin.comparisons.g.c(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final double Uw(@dl.d short[] sArr, @dl.d yh.l<? super Short, Double> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (short s10 : sArr) {
            dDoubleValue += selector.invoke(Short.valueOf(s10)).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @kotlin.l0
    @xh.h(name = "sumOfULong")
    @sh.f
    private static final long Ux(boolean[] zArr, yh.l<? super Boolean, r1> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jH = r1.h(0L);
        for (boolean z10 : zArr) {
            jH = r1.h(jH + selector.invoke(Boolean.valueOf(z10)).q0());
        }
        return jH;
    }

    @dl.d
    public static final HashSet<Byte> Uy(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return (HashSet) Jy(bArr, new HashSet(r0.j(bArr.length)));
    }

    @dl.d
    public static final Set<Integer> Uz(@dl.d int[] iArr, @dl.d Iterable<Integer> other) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Integer> setBz = Bz(iArr);
        x.n0(setBz, other);
        return setBz;
    }

    public static final boolean V5(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final <K, M extends Map<? super K, ? super Float>> M V6(@dl.d float[] fArr, @dl.d M destination, @dl.d yh.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (float f10 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f10)), Float.valueOf(f10));
        }
        return destination;
    }

    @sh.f
    private static final char V7(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return cArr[0];
    }

    public static final boolean V8(@dl.d boolean[] zArr, boolean z10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return lg(zArr, z10) >= 0;
    }

    @dl.d
    public static final <T> List<T> V9(@dl.d T[] tArr, int i10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (i10 >= 0) {
            return cy(tArr, fi.u.u(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <T, R, V> List<V> VA(@dl.d T[] tArr, @dl.d R[] other, @dl.d yh.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(tArr[i10], other[i10]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Integer> Va(@dl.d int[] iArr, @dl.d yh.p<? super Integer, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            int i13 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Integer.valueOf(i12)).booleanValue()) {
                arrayList.add(Integer.valueOf(i12));
            }
            i10++;
            i11 = i13;
        }
        return arrayList;
    }

    @sh.f
    private static final <T> T Vb(T[] tArr, yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    @dl.d
    public static final <R> List<R> Vc(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            x.n0(arrayList, transform.invoke(Float.valueOf(f10)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Vd(@dl.d T[] tArr, R r10, @dl.d yh.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, tArr[i10]);
            i10++;
            i11++;
        }
        return r10;
    }

    public static final int Ve(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Vf(@dl.d long[] jArr, @dl.d M destination, @dl.d yh.l<? super Long, ? extends K> keySelector, @dl.d yh.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @sh.f
    private static final boolean Vg(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr.length == 0;
    }

    public static final float Vh(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[Ue(fArr)];
    }

    @dl.d
    public static final <R> List<R> Vi(@dl.d int[] iArr, @dl.d yh.p<? super Integer, ? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double Vj(short[] sArr, yh.l<? super Short, Double> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R Vk(long[] jArr, Comparator<? super R> comparator, yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Byte Vl(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int iRe = Re(bArr);
        if (iRe == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        k0 it = new fi.l(1, iRe).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                b10 = b11;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Vm(boolean[] zArr, yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final float Vn(@dl.d Float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = fArr[0].floatValue();
        k0 it = new fi.l(1, Xe(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, fArr[it.nextInt()].floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final double[] Vo(double[] dArr, yh.p<? super Integer, ? super Double, b2> action) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
        return dArr;
    }

    public static final byte Vp(@dl.d byte[] bArr, @dl.d yh.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[0];
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[it.nextInt()])).byteValue();
        }
        return bByteValue;
    }

    public static final short Vq(@dl.d short[] sArr, @dl.d yh.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iYe = Ye(sArr);
        if (iYe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[iYe];
        for (int i10 = iYe - 1; i10 >= 0; i10--) {
            sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sArr[i10]), Short.valueOf(sShortValue)).shortValue();
        }
        return sShortValue;
    }

    @dl.d
    public static final int[] Vr(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int iVe = Ve(iArr);
        k0 it = new fi.l(0, iVe).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            iArr2[iVe - iNextInt] = iArr[iNextInt];
        }
        return iArr2;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Vs(double[] dArr, R r10, yh.q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r10);
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Double.valueOf(dArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Float Vt(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    public static final void Vu(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length > 1) {
            kotlin.collections.m.l4(dArr);
            ur(dArr);
        }
    }

    @dl.d
    public static final <T, R extends Comparable<? super R>> List<T> Vv(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return mw(tArr, new kotlin.comparisons.g.c(selector));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final double Vw(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (boolean z10 : zArr) {
            dDoubleValue += selector.invoke(Boolean.valueOf(z10)).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final List<Byte> Vx(@dl.d byte[] bArr, int i10) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= bArr.length) {
            return ez(bArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final HashSet<Character> Vy(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return (HashSet) Ky(cArr, new HashSet(r0.j(fi.u.B(cArr.length, 128))));
    }

    @dl.d
    public static final Set<Long> Vz(@dl.d long[] jArr, @dl.d Iterable<Long> other) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Long> setCz = Cz(jArr);
        x.n0(setCz, other);
        return setCz;
    }

    @dl.d
    public static final Iterable<Byte> W5(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return bArr.length == 0 ? CollectionsKt__CollectionsKt.E() : new b(bArr);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M W6(@dl.d float[] fArr, @dl.d M destination, @dl.d yh.l<? super Float, ? extends K> keySelector, @dl.d yh.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (float f10 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f10)), valueTransform.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    @sh.f
    private static final double W7(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr[0];
    }

    @sh.f
    private static final int W8(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return bArr.length;
    }

    @dl.d
    public static final List<Short> W9(@dl.d short[] sArr, int i10) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (i10 >= 0) {
            return dy(sArr, fi.u.u(sArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R> List<Pair<Short, R>> WA(@dl.d short[] sArr, @dl.d Iterable<? extends R> other) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(kotlin.c1.a(Short.valueOf(sArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final List<Long> Wa(@dl.d long[] jArr, @dl.d yh.p<? super Integer, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            long j10 = jArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @sh.f
    private static final Short Wb(short[] sArr, yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
        }
        return null;
    }

    @dl.d
    public static final <R> List<R> Wc(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i10)));
        }
        return arrayList;
    }

    public static final <R> R Wd(@dl.d short[] sArr, R r10, @dl.d yh.q<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final int We(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr.length - 1;
    }

    @dl.d
    public static final <T, K, M extends Map<? super K, List<T>>> M Wf(@dl.d T[] tArr, @dl.d M destination, @dl.d yh.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (T t10 : tArr) {
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

    @sh.f
    private static final boolean Wg(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final float Wh(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                float f10 = fArr[length];
                if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                    return f10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @dl.d
    public static final <R> List<R> Wi(@dl.d long[] jArr, @dl.d yh.p<? super Integer, ? super Long, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double Wj(boolean[] zArr, yh.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R> R Wk(T[] tArr, Comparator<? super R> comparator, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Character Wl(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int iSe = Se(cArr);
        if (iSe == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        k0 it = new fi.l(1, iSe).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                c10 = c11;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double Wm(byte[] bArr, yh.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final int Wn(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            if (i10 > i11) {
                i10 = i11;
            }
        }
        return i10;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final float[] Wo(float[] fArr, yh.p<? super Integer, ? super Float, b2> action) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10]));
            i10++;
            i11++;
        }
        return fArr;
    }

    public static final char Wp(@dl.d char[] cArr, @dl.d yh.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char cCharValue = cArr[0];
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            cCharValue = operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[it.nextInt()])).charValue();
        }
        return cCharValue;
    }

    public static final boolean Wq(@dl.d boolean[] zArr, @dl.d yh.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iZe = Ze(zArr);
        if (iZe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[iZe];
        for (int i10 = iZe - 1; i10 >= 0; i10--) {
            zBooleanValue = operation.invoke(Integer.valueOf(i10), Boolean.valueOf(zArr[i10]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return zBooleanValue;
    }

    @dl.d
    public static final long[] Wr(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int iWe = We(jArr);
        k0 it = new fi.l(0, iWe).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jArr2[iWe - iNextInt] = jArr[iNextInt];
        }
        return jArr2;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Ws(float[] fArr, R r10, yh.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r10);
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Float.valueOf(fArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Float Wt(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        boolean z10 = false;
        Float fValueOf = null;
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                fValueOf = Float.valueOf(f10);
                z10 = true;
            }
        }
        if (z10) {
            return fValueOf;
        }
        return null;
    }

    @kotlin.u0(version = "1.4")
    public static final void Wu(@dl.d double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.collections.m.m4(dArr, i10, i11);
        vr(dArr, i10, i11);
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Short> Wv(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return nw(sArr, new kotlin.comparisons.g.c(selector));
    }

    @xh.h(name = "sumOfByte")
    public static final int Ww(@dl.d Byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        int iByteValue = 0;
        for (Byte b10 : bArr) {
            iByteValue += b10.byteValue();
        }
        return iByteValue;
    }

    @dl.d
    public static final List<Character> Wx(@dl.d char[] cArr, int i10) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= cArr.length) {
            return fz(cArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final HashSet<Double> Wy(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return (HashSet) Ly(dArr, new HashSet(r0.j(dArr.length)));
    }

    @dl.d
    public static final <T> Set<T> Wz(@dl.d T[] tArr, @dl.d Iterable<? extends T> other) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<T> setDz = Dz(tArr);
        x.n0(setDz, other);
        return setDz;
    }

    @dl.d
    public static final Iterable<Character> X5(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return cArr.length == 0 ? CollectionsKt__CollectionsKt.E() : new i(cArr);
    }

    @dl.d
    public static final <K, M extends Map<? super K, ? super Integer>> M X6(@dl.d int[] iArr, @dl.d M destination, @dl.d yh.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (int i10 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i10)), Integer.valueOf(i10));
        }
        return destination;
    }

    @sh.f
    private static final float X7(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr[0];
    }

    public static final int X8(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @dl.d
    public static final List<Boolean> X9(@dl.d boolean[] zArr, int i10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (i10 >= 0) {
            return ey(zArr, fi.u.u(zArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R, V> List<V> XA(@dl.d short[] sArr, @dl.d Iterable<? extends R> other, @dl.d yh.p<? super Short, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Short.valueOf(sArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final <T> List<T> Xa(@dl.d T[] tArr, @dl.d yh.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), t10).booleanValue()) {
                arrayList.add(t10);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @sh.f
    private static final Boolean Xb(boolean[] zArr, yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                boolean z10 = zArr[length];
                if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                    return Boolean.valueOf(z10);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @dl.d
    public static final <R> List<R> Xc(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            x.n0(arrayList, transform.invoke(Long.valueOf(j10)));
        }
        return arrayList;
    }

    public static final <R> R Xd(@dl.d boolean[] zArr, R r10, @dl.d yh.q<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final <T> int Xe(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T, K, V, M extends Map<? super K, List<V>>> M Xf(@dl.d T[] tArr, @dl.d M destination, @dl.d yh.l<? super T, ? extends K> keySelector, @dl.d yh.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (T t10 : tArr) {
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

    @sh.f
    private static final boolean Xg(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return !(cArr.length == 0);
    }

    public static final int Xh(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[Ve(iArr)];
    }

    @dl.d
    public static final <T, R> List<R> Xi(@dl.d T[] tArr, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float Xj(byte[] bArr, yh.l<? super Byte, Float> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R Xk(short[] sArr, Comparator<? super R> comparator, yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Double Xl(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int iTe = Te(dArr);
        if (iTe == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        k0 it = new fi.l(1, iTe).iterator();
        while (it.hasNext()) {
            double d11 = dArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                d10 = d11;
            }
        }
        return Double.valueOf(d10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double Xm(char[] cArr, yh.l<? super Character, Double> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final long Xn(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            if (j10 > j11) {
                j10 = j11;
            }
        }
        return j10;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final int[] Xo(int[] iArr, yh.p<? super Integer, ? super Integer, b2> action) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
        return iArr;
    }

    public static final double Xp(@dl.d double[] dArr, @dl.d yh.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[0];
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[it.nextInt()])).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Boolean Xq(@dl.d boolean[] zArr, @dl.d yh.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iZe = Ze(zArr);
        if (iZe < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[iZe];
        for (int i10 = iZe - 1; i10 >= 0; i10--) {
            zBooleanValue = operation.invoke(Integer.valueOf(i10), Boolean.valueOf(zArr[i10]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @dl.d
    public static final <T> T[] Xr(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) kotlin.collections.k.a(tArr, tArr.length);
        int iXe = Xe(tArr);
        k0 it = new fi.l(0, iXe).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            tArr2[iXe - iNextInt] = tArr[iNextInt];
        }
        return tArr2;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Xs(int[] iArr, R r10, yh.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Integer.valueOf(iArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Integer Xt(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    public static final void Xu(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length > 1) {
            kotlin.collections.m.n4(fArr);
            wr(fArr);
        }
    }

    @dl.d
    public static final <R extends Comparable<? super R>> List<Boolean> Xv(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        return ow(zArr, new kotlin.comparisons.g.c(selector));
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfDouble")
    @sh.f
    private static final double Xw(byte[] bArr, yh.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (byte b10 : bArr) {
            dDoubleValue += selector.invoke(Byte.valueOf(b10)).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final List<Double> Xx(@dl.d double[] dArr, int i10) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= dArr.length) {
            return gz(dArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final HashSet<Float> Xy(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return (HashSet) My(fArr, new HashSet(r0.j(fArr.length)));
    }

    @dl.d
    public static final Set<Short> Xz(@dl.d short[] sArr, @dl.d Iterable<Short> other) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Short> setEz = Ez(sArr);
        x.n0(setEz, other);
        return setEz;
    }

    @dl.d
    public static final Iterable<Double> Y5(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr.length == 0 ? CollectionsKt__CollectionsKt.E() : new g(dArr);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M Y6(@dl.d int[] iArr, @dl.d M destination, @dl.d yh.l<? super Integer, ? extends K> keySelector, @dl.d yh.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (int i10 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i10)), valueTransform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @sh.f
    private static final int Y7(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr[0];
    }

    @sh.f
    private static final int Y8(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return cArr.length;
    }

    @dl.d
    public static final List<Byte> Y9(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iRe = Re(bArr); -1 < iRe; iRe--) {
            if (!predicate.invoke(Byte.valueOf(bArr[iRe])).booleanValue()) {
                return Vx(bArr, iRe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final <R> List<Pair<Short, R>> YA(@dl.d short[] sArr, @dl.d R[] other) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            short s10 = sArr[i10];
            arrayList.add(kotlin.c1.a(Short.valueOf(s10), other[i10]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Short> Ya(@dl.d short[] sArr, @dl.d yh.p<? super Integer, ? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            short s10 = sArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @sh.f
    private static final Byte Yb(byte[] bArr, yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                byte b10 = bArr[length];
                if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                    return Byte.valueOf(b10);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @dl.d
    public static final <T, R> List<R> Yc(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            x.n0(arrayList, transform.invoke(t10));
        }
        return arrayList;
    }

    public static final <R> R Yd(@dl.d byte[] bArr, R r10, @dl.d yh.p<? super Byte, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iRe = Re(bArr); iRe >= 0; iRe--) {
            r10 = operation.invoke(Byte.valueOf(bArr[iRe]), r10);
        }
        return r10;
    }

    public static final int Ye(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return sArr.length - 1;
    }

    @dl.d
    public static final <K, M extends Map<? super K, List<Short>>> M Yf(@dl.d short[] sArr, @dl.d M destination, @dl.d yh.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (short s10 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Short.valueOf(s10));
        }
        return destination;
    }

    @sh.f
    private static final boolean Yg(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return !(dArr.length == 0);
    }

    public static final int Yh(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                int i11 = iArr[length];
                if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                    return i11;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @dl.d
    public static final <R> List<R> Yi(@dl.d short[] sArr, @dl.d yh.p<? super Integer, ? super Short, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float Yj(char[] cArr, yh.l<? super Character, Float> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R Yk(boolean[] zArr, Comparator<? super R> comparator, yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Float Yl(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int iUe = Ue(fArr);
        if (iUe == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        k0 it = new fi.l(1, iUe).iterator();
        while (it.hasNext()) {
            float f11 = fArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                f10 = f11;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double Ym(double[] dArr, yh.l<? super Double, Double> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @dl.d
    @xh.h(name = "minOrThrow")
    public static final <T extends Comparable<? super T>> T Yn(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t11 = tArr[it.nextInt()];
            if (t10.compareTo(t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final long[] Yo(long[] jArr, yh.p<? super Integer, ? super Long, b2> action) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
        return jArr;
    }

    public static final float Yp(@dl.d float[] fArr, @dl.d yh.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[0];
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[it.nextInt()])).floatValue();
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Byte Yq(@dl.d byte[] bArr, @dl.d yh.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iRe = Re(bArr);
        if (iRe < 0) {
            return null;
        }
        byte bByteValue = bArr[iRe];
        for (int i10 = iRe - 1; i10 >= 0; i10--) {
            bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bArr[i10]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @dl.d
    public static final short[] Yr(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int iYe = Ye(sArr);
        k0 it = new fi.l(0, iYe).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sArr2[iYe - iNextInt] = sArr[iNextInt];
        }
        return sArr2;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> Ys(long[] jArr, R r10, yh.q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Long.valueOf(jArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Integer Yt(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        boolean z10 = false;
        Integer numValueOf = null;
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                numValueOf = Integer.valueOf(i10);
                z10 = true;
            }
        }
        if (z10) {
            return numValueOf;
        }
        return null;
    }

    @kotlin.u0(version = "1.4")
    public static final void Yu(@dl.d float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.collections.m.o4(fArr, i10, i11);
        xr(fArr, i10, i11);
    }

    @dl.d
    public static final List<Byte> Yv(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.f0.o(bArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.h4(bArrCopyOf);
        return Ir(bArrCopyOf);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfDouble")
    @sh.f
    private static final double Yw(char[] cArr, yh.l<? super Character, Double> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (char c10 : cArr) {
            dDoubleValue += selector.invoke(Character.valueOf(c10)).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final List<Float> Yx(@dl.d float[] fArr, int i10) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= fArr.length) {
            return hz(fArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final HashSet<Integer> Yy(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return (HashSet) Ny(iArr, new HashSet(r0.j(iArr.length)));
    }

    @dl.d
    public static final Set<Boolean> Yz(@dl.d boolean[] zArr, @dl.d Iterable<Boolean> other) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Boolean> setFz = Fz(zArr);
        x.n0(setFz, other);
        return setFz;
    }

    @dl.d
    public static final Iterable<Float> Z5(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr.length == 0 ? CollectionsKt__CollectionsKt.E() : new f(fArr);
    }

    @dl.d
    public static final <K, M extends Map<? super K, ? super Long>> M Z6(@dl.d long[] jArr, @dl.d M destination, @dl.d yh.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (long j10 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j10)), Long.valueOf(j10));
        }
        return destination;
    }

    @sh.f
    private static final long Z7(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr[0];
    }

    public static final int Z8(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @dl.d
    public static final List<Character> Z9(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iSe = Se(cArr); -1 < iSe; iSe--) {
            if (!predicate.invoke(Character.valueOf(cArr[iSe])).booleanValue()) {
                return Wx(cArr, iSe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final <R, V> List<V> ZA(@dl.d short[] sArr, @dl.d R[] other, @dl.d yh.p<? super Short, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Boolean> Za(@dl.d boolean[] zArr, @dl.d yh.p<? super Integer, ? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            boolean z10 = zArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @sh.f
    private static final Character Zb(char[] cArr, yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char c10 = cArr[length];
                if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                    return Character.valueOf(c10);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @dl.d
    public static final <R> List<R> Zc(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            x.n0(arrayList, transform.invoke(Short.valueOf(s10)));
        }
        return arrayList;
    }

    public static final <R> R Zd(@dl.d char[] cArr, R r10, @dl.d yh.p<? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iSe = Se(cArr); iSe >= 0; iSe--) {
            r10 = operation.invoke(Character.valueOf(cArr[iSe]), r10);
        }
        return r10;
    }

    public static final int Ze(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Zf(@dl.d short[] sArr, @dl.d M destination, @dl.d yh.l<? super Short, ? extends K> keySelector, @dl.d yh.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (short s10 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    @sh.f
    private static final boolean Zg(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return !(fArr.length == 0);
    }

    public static final long Zh(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[We(jArr)];
    }

    @dl.d
    public static final <R> List<R> Zi(@dl.d boolean[] zArr, @dl.d yh.p<? super Integer, ? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float Zj(double[] dArr, yh.l<? super Double, Float> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R Zk(byte[] bArr, Comparator<? super R> comparator, yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Integer Zl(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iVe = Ve(iArr);
        if (iVe == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        k0 it = new fi.l(1, iVe).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                i10 = i11;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double Zm(float[] fArr, yh.l<? super Float, Double> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final short Zn(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            if (s10 > s11) {
                s10 = s11;
            }
        }
        return s10;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <T> T[] Zo(T[] tArr, yh.p<? super Integer, ? super T, b2> action) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), tArr[i10]);
            i10++;
            i11++;
        }
        return tArr;
    }

    public static final int Zp(@dl.d int[] iArr, @dl.d yh.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[0];
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[it.nextInt()])).intValue();
        }
        return iIntValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Character Zq(@dl.d char[] cArr, @dl.d yh.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iSe = Se(cArr);
        if (iSe < 0) {
            return null;
        }
        char cCharValue = cArr[iSe];
        for (int i10 = iSe - 1; i10 >= 0; i10--) {
            cCharValue = operation.invoke(Integer.valueOf(i10), Character.valueOf(cArr[i10]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @dl.d
    public static final boolean[] Zr(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int iZe = Ze(zArr);
        k0 it = new fi.l(0, iZe).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            zArr2[iZe - iNextInt] = zArr[iNextInt];
        }
        return zArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final <T, R> List<R> Zs(@dl.d T[] tArr, R r10, @dl.d yh.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r10);
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, tArr[i10]);
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Long Zt(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    public static final void Zu(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length > 1) {
            kotlin.collections.m.p4(iArr);
            yr(iArr);
        }
    }

    @dl.d
    public static final List<Character> Zv(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.f0.o(cArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.j4(cArrCopyOf);
        return Jr(cArrCopyOf);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfDouble")
    @sh.f
    private static final double Zw(double[] dArr, yh.l<? super Double, Double> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (double d10 : dArr) {
            dDoubleValue += selector.invoke(Double.valueOf(d10)).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final List<Integer> Zx(@dl.d int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= iArr.length) {
            return iz(iArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (int i12 : iArr) {
            arrayList.add(Integer.valueOf(i12));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final HashSet<Long> Zy(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return (HashSet) Oy(jArr, new HashSet(r0.j(jArr.length)));
    }

    @dl.d
    public static final Iterable<h0<Byte>> Zz(@dl.d final byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return new i0(new yh.a<Iterator<? extends Byte>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<Byte> invoke() {
                return kotlin.jvm.internal.i.b(bArr);
            }
        });
    }

    @dl.d
    public static final Iterable<Integer> a6(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr.length == 0 ? CollectionsKt__CollectionsKt.E() : new d(iArr);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M a7(@dl.d long[] jArr, @dl.d M destination, @dl.d yh.l<? super Long, ? extends K> keySelector, @dl.d yh.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (long j10 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j10)), valueTransform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @sh.f
    private static final <T> T a8(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr[0];
    }

    @sh.f
    private static final int a9(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr.length;
    }

    @dl.d
    public static final Iterable<h0<Character>> aA(@dl.d final char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return new i0(new yh.a<Iterator<? extends Character>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<Character> invoke() {
                return kotlin.jvm.internal.i.c(cArr);
            }
        });
    }

    @dl.d
    public static final List<Pair<Short, Short>> aB(@dl.d short[] sArr, @dl.d short[] other) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(kotlin.c1.a(Short.valueOf(sArr[i10]), Short.valueOf(other[i10])));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Double> aa(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iTe = Te(dArr); -1 < iTe; iTe--) {
            if (!predicate.invoke(Double.valueOf(dArr[iTe])).booleanValue()) {
                return Xx(dArr, iTe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final <C extends Collection<? super Byte>> C ab(@dl.d byte[] bArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Byte.valueOf(b10)).booleanValue()) {
                destination.add(Byte.valueOf(b10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @sh.f
    private static final Double ac(double[] dArr, yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                double d10 = dArr[length];
                if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                    return Double.valueOf(d10);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @dl.d
    public static final <R> List<R> ad(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            x.n0(arrayList, transform.invoke(Boolean.valueOf(z10)));
        }
        return arrayList;
    }

    public static final <R> R ae(@dl.d double[] dArr, R r10, @dl.d yh.p<? super Double, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iTe = Te(dArr); iTe >= 0; iTe--) {
            r10 = operation.invoke(Double.valueOf(dArr[iTe]), r10);
        }
        return r10;
    }

    @sh.f
    private static final byte af(byte[] bArr, int i10, yh.l<? super Integer, Byte> defaultValue) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Re(bArr)) ? defaultValue.invoke(Integer.valueOf(i10)).byteValue() : bArr[i10];
    }

    @dl.d
    public static final <K, M extends Map<? super K, List<Boolean>>> M ag(@dl.d boolean[] zArr, @dl.d M destination, @dl.d yh.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Boolean.valueOf(z10));
        }
        return destination;
    }

    @sh.f
    private static final boolean ah(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return !(iArr.length == 0);
    }

    public static final long ai(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                long j10 = jArr[length];
                if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                    return j10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @dl.d
    public static final <T, R> List<R> aj(@dl.d T[] tArr, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), tArr[i10]);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float ak(float[] fArr, yh.l<? super Float, Float> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R al(char[] cArr, Comparator<? super R> comparator, yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Long am(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int iWe = We(jArr);
        if (iWe == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        k0 it = new fi.l(1, iWe).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double an(int[] iArr, yh.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Boolean ao(@dl.d boolean[] zArr, @dl.d Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            boolean z11 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) > 0) {
                z10 = z11;
            }
        }
        return Boolean.valueOf(z10);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final short[] ap(short[] sArr, yh.p<? super Integer, ? super Short, b2> action) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
        return sArr;
    }

    public static final long aq(@dl.d long[] jArr, @dl.d yh.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[0];
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[it.nextInt()])).longValue();
        }
        return jLongValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Double ar(@dl.d double[] dArr, @dl.d yh.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iTe = Te(dArr);
        if (iTe < 0) {
            return null;
        }
        double dDoubleValue = dArr[iTe];
        for (int i10 = iTe - 1; i10 >= 0; i10--) {
            dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dArr[i10]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> as(byte[] bArr, R r10, yh.p<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        for (byte b10 : bArr) {
            r10 = operation.invoke(r10, Byte.valueOf(b10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> at(short[] sArr, R r10, yh.q<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Short.valueOf(sArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final Long au(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        boolean z10 = false;
        Long lValueOf = null;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                lValueOf = Long.valueOf(j10);
                z10 = true;
            }
        }
        if (z10) {
            return lValueOf;
        }
        return null;
    }

    @kotlin.u0(version = "1.4")
    public static final void av(@dl.d int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.collections.m.q4(iArr, i10, i11);
        zr(iArr, i10, i11);
    }

    @dl.d
    public static final List<Double> aw(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.f0.o(dArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.l4(dArrCopyOf);
        return Kr(dArrCopyOf);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfDouble")
    @sh.f
    private static final double ax(float[] fArr, yh.l<? super Float, Double> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (float f10 : fArr) {
            dDoubleValue += selector.invoke(Float.valueOf(f10)).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final List<Long> ay(@dl.d long[] jArr, int i10) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= jArr.length) {
            return jz(jArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <T> HashSet<T> az(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return (HashSet) Py(tArr, new HashSet(r0.j(tArr.length)));
    }

    @dl.d
    public static final Iterable<Long> b6(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr.length == 0 ? CollectionsKt__CollectionsKt.E() : new e(jArr);
    }

    @dl.d
    public static final <T, K, M extends Map<? super K, ? super T>> M b7(@dl.d T[] tArr, @dl.d M destination, @dl.d yh.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (T t10 : tArr) {
            destination.put(keySelector.invoke(t10), t10);
        }
        return destination;
    }

    @sh.f
    private static final short b8(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return sArr[0];
    }

    public static final int b9(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @dl.d
    public static final Iterable<h0<Double>> bA(@dl.d final double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return new i0(new yh.a<Iterator<? extends Double>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<Double> invoke() {
                return kotlin.jvm.internal.i.d(dArr);
            }
        });
    }

    @dl.d
    public static final <V> List<V> bB(@dl.d short[] sArr, @dl.d short[] other, @dl.d yh.p<? super Short, ? super Short, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i10]), Short.valueOf(other[i10])));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Float> ba(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iUe = Ue(fArr); -1 < iUe; iUe--) {
            if (!predicate.invoke(Float.valueOf(fArr[iUe])).booleanValue()) {
                return Yx(fArr, iUe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final <C extends Collection<? super Character>> C bb(@dl.d char[] cArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char c10 = cArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(c10)).booleanValue()) {
                destination.add(Character.valueOf(c10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @sh.f
    private static final Float bc(float[] fArr, yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                float f10 = fArr[length];
                if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                    return Float.valueOf(f10);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterable")
    @sh.f
    private static final <R> List<R> bd(byte[] bArr, yh.p<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R be(@dl.d float[] fArr, R r10, @dl.d yh.p<? super Float, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iUe = Ue(fArr); iUe >= 0; iUe--) {
            r10 = operation.invoke(Float.valueOf(fArr[iUe]), r10);
        }
        return r10;
    }

    @sh.f
    private static final char bf(char[] cArr, int i10, yh.l<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Se(cArr)) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : cArr[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, M extends Map<? super K, List<V>>> M bg(@dl.d boolean[] zArr, @dl.d M destination, @dl.d yh.l<? super Boolean, ? extends K> keySelector, @dl.d yh.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @sh.f
    private static final boolean bh(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return !(jArr.length == 0);
    }

    public static final <T> T bi(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[Xe(tArr)];
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C bj(@dl.d T[] tArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), tArr[i10]);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float bk(int[] iArr, yh.l<? super Integer, Float> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R bl(double[] dArr, Comparator<? super R> comparator, yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <T, R extends Comparable<? super R>> T bm(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int iXe = Xe(tArr);
        if (iXe == 0) {
            return t10;
        }
        R rInvoke = selector.invoke(t10);
        k0 it = new fi.l(1, iXe).iterator();
        while (it.hasNext()) {
            T t11 = tArr[it.nextInt()];
            R rInvoke2 = selector.invoke(t11);
            if (rInvoke.compareTo(rInvoke2) > 0) {
                t10 = t11;
                rInvoke = rInvoke2;
            }
        }
        return t10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double bn(long[] jArr, yh.l<? super Long, Double> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Byte bo(@dl.d byte[] bArr, @dl.d Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) > 0) {
                b10 = b11;
            }
        }
        return Byte.valueOf(b10);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final boolean[] bp(boolean[] zArr, yh.p<? super Integer, ? super Boolean, b2> action) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
        return zArr;
    }

    public static final <S, T extends S> S bq(@dl.d T[] tArr, @dl.d yh.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[0];
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            sInvoke = operation.invoke(sInvoke, (Object) tArr[it.nextInt()]);
        }
        return sInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Float br(@dl.d float[] fArr, @dl.d yh.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iUe = Ue(fArr);
        if (iUe < 0) {
            return null;
        }
        float fFloatValue = fArr[iUe];
        for (int i10 = iUe - 1; i10 >= 0; i10--) {
            fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fArr[i10]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> bs(char[] cArr, R r10, yh.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r10);
        for (char c10 : cArr) {
            r10 = operation.invoke(r10, Character.valueOf(c10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <R> List<R> bt(boolean[] zArr, R r10, yh.q<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r10);
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Boolean.valueOf(zArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.e
    public static final <T> T bu(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final void bv(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length > 1) {
            kotlin.collections.m.r4(jArr);
            Ar(jArr);
        }
    }

    @dl.d
    public static final List<Float> bw(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.f0.o(fArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.n4(fArrCopyOf);
        return Lr(fArrCopyOf);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfDouble")
    @sh.f
    private static final double bx(int[] iArr, yh.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 : iArr) {
            dDoubleValue += selector.invoke(Integer.valueOf(i10)).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final HashSet<Short> bz(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return (HashSet) Qy(sArr, new HashSet(r0.j(sArr.length)));
    }

    @dl.d
    public static final <T> Iterable<T> c6(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr.length == 0 ? CollectionsKt__CollectionsKt.E() : new a(tArr);
    }

    @dl.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M c7(@dl.d T[] tArr, @dl.d M destination, @dl.d yh.l<? super T, ? extends K> keySelector, @dl.d yh.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (T t10 : tArr) {
            destination.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return destination;
    }

    @sh.f
    private static final boolean c8(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr[0];
    }

    @sh.f
    private static final int c9(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr.length;
    }

    @dl.d
    public static final Iterable<h0<Float>> cA(@dl.d final float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return new i0(new yh.a<Iterator<? extends Float>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<Float> invoke() {
                return kotlin.jvm.internal.i.e(fArr);
            }
        });
    }

    @dl.d
    public static final <R> List<Pair<Boolean, R>> cB(@dl.d boolean[] zArr, @dl.d Iterable<? extends R> other) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(kotlin.c1.a(Boolean.valueOf(zArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final List<Integer> ca(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iVe = Ve(iArr); -1 < iVe; iVe--) {
            if (!predicate.invoke(Integer.valueOf(iArr[iVe])).booleanValue()) {
                return Zx(iArr, iVe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final <C extends Collection<? super Double>> C cb(@dl.d double[] dArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            double d10 = dArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Double.valueOf(d10)).booleanValue()) {
                destination.add(Double.valueOf(d10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @sh.f
    private static final Integer cc(int[] iArr, yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                int i11 = iArr[length];
                if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                    return Integer.valueOf(i11);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterable")
    @sh.f
    private static final <R> List<R> cd(char[] cArr, yh.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R ce(@dl.d int[] iArr, R r10, @dl.d yh.p<? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iVe = Ve(iArr); iVe >= 0; iVe--) {
            r10 = operation.invoke(Integer.valueOf(iArr[iVe]), r10);
        }
        return r10;
    }

    @sh.f
    private static final double cf(double[] dArr, int i10, yh.l<? super Integer, Double> defaultValue) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Te(dArr)) ? defaultValue.invoke(Integer.valueOf(i10)).doubleValue() : dArr[i10];
    }

    @kotlin.u0(version = "1.1")
    @dl.d
    public static final <T, K> d0<T, K> cg(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        return new s(tArr, keySelector);
    }

    @sh.f
    private static final <T> boolean ch(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return !(tArr.length == 0);
    }

    public static final <T> T ci(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                T t10 = tArr[length];
                if (predicate.invoke(t10).booleanValue()) {
                    return t10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C cj(@dl.d byte[] bArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float ck(long[] jArr, yh.l<? super Long, Float> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R cl(float[] fArr, Comparator<? super R> comparator, yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Short cm(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int iYe = Ye(sArr);
        if (iYe == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        k0 it = new fi.l(1, iYe).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                s10 = s11;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> Double cn(T[] tArr, yh.l<? super T, Double> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Character co(@dl.d char[] cArr, @dl.d Comparator<? super Character> comparator) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) > 0) {
                c10 = c11;
            }
        }
        return Character.valueOf(c10);
    }

    @dl.d
    public static final Pair<List<Byte>, List<Byte>> cp(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            } else {
                arrayList2.add(Byte.valueOf(b10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final short cq(@dl.d short[] sArr, @dl.d yh.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[0];
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[it.nextInt()])).shortValue();
        }
        return sShortValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Integer cr(@dl.d int[] iArr, @dl.d yh.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iVe = Ve(iArr);
        if (iVe < 0) {
            return null;
        }
        int iIntValue = iArr[iVe];
        for (int i10 = iVe - 1; i10 >= 0; i10--) {
            iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> cs(double[] dArr, R r10, yh.p<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r10);
        for (double d10 : dArr) {
            r10 = operation.invoke(r10, Double.valueOf(d10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void ct(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        dt(bArr, Random.f125033b);
    }

    @dl.e
    public static final <T> T cu(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        boolean z10 = false;
        T t10 = null;
        for (T t11 : tArr) {
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

    @kotlin.u0(version = "1.4")
    public static final void cv(@dl.d long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.collections.m.s4(jArr, i10, i11);
        Br(jArr, i10, i11);
    }

    @dl.d
    public static final List<Integer> cw(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.p4(iArrCopyOf);
        return Mr(iArrCopyOf);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfDouble")
    @sh.f
    private static final double cx(long[] jArr, yh.l<? super Long, Double> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (long j10 : jArr) {
            dDoubleValue += selector.invoke(Long.valueOf(j10)).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final <T> List<T> cy(@dl.d T[] tArr, int i10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= tArr.length) {
            return kz(tArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(tArr[0]);
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (T t10 : tArr) {
            arrayList.add(t10);
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final HashSet<Boolean> cz(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return (HashSet) Ry(zArr, new HashSet(r0.j(zArr.length)));
    }

    @dl.d
    public static final Iterable<Short> d6(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return sArr.length == 0 ? CollectionsKt__CollectionsKt.E() : new c(sArr);
    }

    @dl.d
    public static final <K, M extends Map<? super K, ? super Short>> M d7(@dl.d short[] sArr, @dl.d M destination, @dl.d yh.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (short s10 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s10)), Short.valueOf(s10));
        }
        return destination;
    }

    @sh.f
    private static final byte d8(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return bArr[1];
    }

    public static final int d9(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @dl.d
    public static final Iterable<h0<Integer>> dA(@dl.d final int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return new i0(new yh.a<Iterator<? extends Integer>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<Integer> invoke() {
                return kotlin.jvm.internal.i.f(iArr);
            }
        });
    }

    @dl.d
    public static final <R, V> List<V> dB(@dl.d boolean[] zArr, @dl.d Iterable<? extends R> other, @dl.d yh.p<? super Boolean, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final List<Long> da(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iWe = We(jArr); -1 < iWe; iWe--) {
            if (!predicate.invoke(Long.valueOf(jArr[iWe])).booleanValue()) {
                return ay(jArr, iWe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final <C extends Collection<? super Float>> C db(@dl.d float[] fArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            float f10 = fArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Float.valueOf(f10)).booleanValue()) {
                destination.add(Float.valueOf(f10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @sh.f
    private static final Long dc(long[] jArr, yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                long j10 = jArr[length];
                if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                    return Long.valueOf(j10);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterable")
    @sh.f
    private static final <R> List<R> dd(double[] dArr, yh.p<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R de(@dl.d long[] jArr, R r10, @dl.d yh.p<? super Long, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iWe = We(jArr); iWe >= 0; iWe--) {
            r10 = operation.invoke(Long.valueOf(jArr[iWe]), r10);
        }
        return r10;
    }

    @sh.f
    private static final float df(float[] fArr, int i10, yh.l<? super Integer, Float> defaultValue) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Ue(fArr)) ? defaultValue.invoke(Integer.valueOf(i10)).floatValue() : fArr[i10];
    }

    public static final int dg(@dl.d byte[] bArr, byte b10) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @sh.f
    private static final boolean dh(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return !(sArr.length == 0);
    }

    public static final short di(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[Ye(sArr)];
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C dj(@dl.d char[] cArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> float dk(T[] tArr, yh.l<? super T, Float> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(tArr[it.nextInt()]).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R dl(int[] iArr, Comparator<? super R> comparator, yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> byte dm(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int iRe = Re(bArr);
        if (iRe == 0) {
            return b10;
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        k0 it = new fi.l(1, iRe).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                b10 = b11;
                rInvoke = rInvoke2;
            }
        }
        return b10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double dn(short[] sArr, yh.l<? super Short, Double> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final Double m782do(@dl.d double[] dArr, @dl.d Comparator<? super Double> comparator) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            double d11 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) > 0) {
                d10 = d11;
            }
        }
        return Double.valueOf(d10);
    }

    @dl.d
    public static final Pair<List<Character>, List<Character>> dp(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            } else {
                arrayList2.add(Character.valueOf(c10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean dq(@dl.d boolean[] zArr, @dl.d yh.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[0];
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[it.nextInt()])).booleanValue();
        }
        return zBooleanValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Long dr(@dl.d long[] jArr, @dl.d yh.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iWe = We(jArr);
        if (iWe < 0) {
            return null;
        }
        long jLongValue = jArr[iWe];
        for (int i10 = iWe - 1; i10 >= 0; i10--) {
            jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jArr[i10]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> ds(float[] fArr, R r10, yh.p<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r10);
        for (float f10 : fArr) {
            r10 = operation.invoke(r10, Float.valueOf(f10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void dt(@dl.d byte[] bArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        for (int iRe = Re(bArr); iRe > 0; iRe--) {
            int iM = random.m(iRe + 1);
            byte b10 = bArr[iRe];
            bArr[iRe] = bArr[iM];
            bArr[iM] = b10;
        }
    }

    @dl.e
    public static final Short du(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> void dv(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.collections.m.I4(tArr, kotlin.comparisons.g.x());
    }

    @dl.d
    public static final List<Long> dw(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.r4(jArrCopyOf);
        return Nr(jArrCopyOf);
    }

    @xh.h(name = "sumOfDouble")
    public static final double dx(@dl.d Double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        double dDoubleValue = 0.0d;
        for (Double d10 : dArr) {
            dDoubleValue += d10.doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final List<Short> dy(@dl.d short[] sArr, int i10) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= sArr.length) {
            return lz(sArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final int[] dz(@dl.d Integer[] numArr) {
        kotlin.jvm.internal.f0.p(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    @dl.d
    public static final Iterable<Boolean> e6(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr.length == 0 ? CollectionsKt__CollectionsKt.E() : new h(zArr);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M e7(@dl.d short[] sArr, @dl.d M destination, @dl.d yh.l<? super Short, ? extends K> keySelector, @dl.d yh.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (short s10 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s10)), valueTransform.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    @sh.f
    private static final char e8(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return cArr[1];
    }

    @sh.f
    private static final int e9(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr.length;
    }

    @dl.d
    public static final Iterable<h0<Long>> eA(@dl.d final long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return new i0(new yh.a<Iterator<? extends Long>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<Long> invoke() {
                return kotlin.jvm.internal.i.g(jArr);
            }
        });
    }

    @dl.d
    public static final <R> List<Pair<Boolean, R>> eB(@dl.d boolean[] zArr, @dl.d R[] other) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            boolean z10 = zArr[i10];
            arrayList.add(kotlin.c1.a(Boolean.valueOf(z10), other[i10]));
        }
        return arrayList;
    }

    @dl.d
    public static final <T> List<T> ea(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iXe = Xe(tArr); -1 < iXe; iXe--) {
            if (!predicate.invoke(tArr[iXe]).booleanValue()) {
                return cy(tArr, iXe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final <C extends Collection<? super Integer>> C eb(@dl.d int[] iArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            int i13 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Integer.valueOf(i12)).booleanValue()) {
                destination.add(Integer.valueOf(i12));
            }
            i10++;
            i11 = i13;
        }
        return destination;
    }

    @sh.f
    private static final <T> T ec(T[] tArr, yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                T t10 = tArr[length];
                if (predicate.invoke(t10).booleanValue()) {
                    return t10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterable")
    @sh.f
    private static final <R> List<R> ed(float[] fArr, yh.p<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R ee(@dl.d T[] tArr, R r10, @dl.d yh.p<? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iXe = Xe(tArr); iXe >= 0; iXe--) {
            r10 = operation.invoke(tArr[iXe], r10);
        }
        return r10;
    }

    @sh.f
    private static final int ef(int[] iArr, int i10, yh.l<? super Integer, Integer> defaultValue) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Ve(iArr)) ? defaultValue.invoke(Integer.valueOf(i10)).intValue() : iArr[i10];
    }

    public static final int eg(@dl.d char[] cArr, char c10) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @sh.f
    private static final boolean eh(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return !(zArr.length == 0);
    }

    public static final short ei(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                short s10 = sArr[length];
                if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                    return s10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C ej(@dl.d double[] dArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Double, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float ek(short[] sArr, yh.l<? super Short, Float> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R el(long[] jArr, Comparator<? super R> comparator, yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char em(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        int iSe = Se(cArr);
        if (iSe == 0) {
            return c10;
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        k0 it = new fi.l(1, iSe).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                c10 = c11;
                rInvoke = rInvoke2;
            }
        }
        return c10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double en(boolean[] zArr, yh.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Float eo(@dl.d float[] fArr, @dl.d Comparator<? super Float> comparator) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            float f11 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) > 0) {
                f10 = f11;
            }
        }
        return Float.valueOf(f10);
    }

    @dl.d
    public static final Pair<List<Double>, List<Double>> ep(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            } else {
                arrayList2.add(Double.valueOf(d10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final byte eq(@dl.d byte[] bArr, @dl.d yh.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[0];
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            bByteValue = operation.invoke(Integer.valueOf(iNextInt), Byte.valueOf(bByteValue), Byte.valueOf(bArr[iNextInt])).byteValue();
        }
        return bByteValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <S, T extends S> S er(@dl.d T[] tArr, @dl.d yh.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iXe = Xe(tArr);
        if (iXe < 0) {
            return null;
        }
        S sInvoke = (S) tArr[iXe];
        for (int i10 = iXe - 1; i10 >= 0; i10--) {
            sInvoke = operation.invoke(Integer.valueOf(i10), (Object) tArr[i10], sInvoke);
        }
        return sInvoke;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> es(int[] iArr, R r10, yh.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        for (int i10 : iArr) {
            r10 = operation.invoke(r10, Integer.valueOf(i10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void et(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        ft(cArr, Random.f125033b);
    }

    @dl.e
    public static final Short eu(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        boolean z10 = false;
        Short shValueOf = null;
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                shValueOf = Short.valueOf(s10);
                z10 = true;
            }
        }
        if (z10) {
            return shValueOf;
        }
        return null;
    }

    @kotlin.u0(version = "1.4")
    public static final <T extends Comparable<? super T>> void ev(@dl.d T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.collections.m.J4(tArr, kotlin.comparisons.g.x(), i10, i11);
    }

    @dl.d
    public static final <T extends Comparable<? super T>> List<T> ew(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return mw(tArr, kotlin.comparisons.g.x());
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfDouble")
    @sh.f
    private static final <T> double ex(T[] tArr, yh.l<? super T, Double> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (T t10 : tArr) {
            dDoubleValue += selector.invoke(t10).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final List<Boolean> ey(@dl.d boolean[] zArr, int i10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 >= zArr.length) {
            return mz(zArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final List<Byte> ez(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            return length != 1 ? oz(bArr) : kotlin.collections.s.k(Byte.valueOf(bArr[0]));
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final kotlin.sequences.m<Byte> f6(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return bArr.length == 0 ? SequencesKt__SequencesKt.g() : new k(bArr);
    }

    @dl.d
    public static final <K, M extends Map<? super K, ? super Boolean>> M f7(@dl.d boolean[] zArr, @dl.d M destination, @dl.d yh.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        for (boolean z10 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z10)), Boolean.valueOf(z10));
        }
        return destination;
    }

    @sh.f
    private static final double f8(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr[1];
    }

    public static final int f9(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @dl.d
    public static final <T> Iterable<h0<T>> fA(@dl.d final T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return new i0(new yh.a<Iterator<? extends T>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<T> invoke() {
                return kotlin.jvm.internal.h.a(tArr);
            }
        });
    }

    @dl.d
    public static final <R, V> List<V> fB(@dl.d boolean[] zArr, @dl.d R[] other, @dl.d yh.p<? super Boolean, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Short> fa(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iYe = Ye(sArr); -1 < iYe; iYe--) {
            if (!predicate.invoke(Short.valueOf(sArr[iYe])).booleanValue()) {
                return dy(sArr, iYe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final <C extends Collection<? super Long>> C fb(@dl.d long[] jArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            long j10 = jArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Long.valueOf(j10)).booleanValue()) {
                destination.add(Long.valueOf(j10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @sh.f
    private static final Short fc(short[] sArr, yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                short s10 = sArr[length];
                if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                    return Short.valueOf(s10);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterable")
    @sh.f
    private static final <R> List<R> fd(int[] iArr, yh.p<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R fe(@dl.d short[] sArr, R r10, @dl.d yh.p<? super Short, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iYe = Ye(sArr); iYe >= 0; iYe--) {
            r10 = operation.invoke(Short.valueOf(sArr[iYe]), r10);
        }
        return r10;
    }

    @sh.f
    private static final long ff(long[] jArr, int i10, yh.l<? super Integer, Long> defaultValue) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > We(jArr)) ? defaultValue.invoke(Integer.valueOf(i10)).longValue() : jArr[i10];
    }

    @kotlin.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.s0(expression = "indexOfFirst { it == element }", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136930u, hiddenSince = org.apache.tools.ant.util.s0.f136932w, warningSince = "1.4")
    public static final /* synthetic */ int fg(double[] dArr, double d10) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (d10 == dArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @dl.d
    public static final <A extends Appendable> A fh(@dl.d byte[] bArr, @dl.d A buffer, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Byte, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean fi(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[Ze(zArr)];
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C fj(@dl.d float[] fArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Float, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float fk(boolean[] zArr, yh.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R> R fl(T[] tArr, Comparator<? super R> comparator, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> double fm(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d10 = dArr[0];
        int iTe = Te(dArr);
        if (iTe == 0) {
            return d10;
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        k0 it = new fi.l(1, iTe).iterator();
        while (it.hasNext()) {
            double d11 = dArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                d10 = d11;
            }
        }
        return d10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float fn(byte[] bArr, yh.l<? super Byte, Float> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Integer fo(@dl.d int[] iArr, @dl.d Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i11)) > 0) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    @dl.d
    public static final Pair<List<Float>, List<Float>> fp(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            } else {
                arrayList2.add(Float.valueOf(f10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final char fq(@dl.d char[] cArr, @dl.d yh.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char cCharValue = cArr[0];
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharValue = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharValue), Character.valueOf(cArr[iNextInt])).charValue();
        }
        return cCharValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Short fr(@dl.d short[] sArr, @dl.d yh.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iYe = Ye(sArr);
        if (iYe < 0) {
            return null;
        }
        short sShortValue = sArr[iYe];
        for (int i10 = iYe - 1; i10 >= 0; i10--) {
            sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sArr[i10]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> fs(long[] jArr, R r10, yh.p<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        for (long j10 : jArr) {
            r10 = operation.invoke(r10, Long.valueOf(j10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void ft(@dl.d char[] cArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        for (int iSe = Se(cArr); iSe > 0; iSe--) {
            int iM = random.m(iSe + 1);
            char c10 = cArr[iSe];
            cArr[iSe] = cArr[iM];
            cArr[iM] = c10;
        }
    }

    @dl.d
    public static final List<Byte> fu(@dl.d byte[] bArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : kotlin.collections.m.n(kotlin.collections.m.G1(bArr, indices.D().intValue(), indices.e().intValue() + 1));
    }

    public static final void fv(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length > 1) {
            kotlin.collections.m.x4(sArr);
            Er(sArr);
        }
    }

    @dl.d
    public static final List<Short> fw(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.f0.o(sArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.x4(sArrCopyOf);
        return Pr(sArrCopyOf);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfDouble")
    @sh.f
    private static final double fx(short[] sArr, yh.l<? super Short, Double> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (short s10 : sArr) {
            dDoubleValue += selector.invoke(Short.valueOf(s10)).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final List<Byte> fy(@dl.d byte[] bArr, int i10) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int length = bArr.length;
        if (i10 >= length) {
            return ez(bArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Byte.valueOf(bArr[i11]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Character> fz(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            return length != 1 ? pz(cArr) : kotlin.collections.s.k(Character.valueOf(cArr[0]));
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final kotlin.sequences.m<Character> g6(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return cArr.length == 0 ? SequencesKt__SequencesKt.g() : new r(cArr);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M g7(@dl.d boolean[] zArr, @dl.d M destination, @dl.d yh.l<? super Boolean, ? extends K> keySelector, @dl.d yh.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        for (boolean z10 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z10)), valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @sh.f
    private static final float g8(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr[1];
    }

    @sh.f
    private static final int g9(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr.length;
    }

    @dl.d
    public static final Iterable<h0<Short>> gA(@dl.d final short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return new i0(new yh.a<Iterator<? extends Short>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<Short> invoke() {
                return kotlin.jvm.internal.i.h(sArr);
            }
        });
    }

    @dl.d
    public static final List<Pair<Boolean, Boolean>> gB(@dl.d boolean[] zArr, @dl.d boolean[] other) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(kotlin.c1.a(Boolean.valueOf(zArr[i10]), Boolean.valueOf(other[i10])));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Boolean> ga(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iZe = Ze(zArr); -1 < iZe; iZe--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[iZe])).booleanValue()) {
                return ey(zArr, iZe + 1);
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final <T, C extends Collection<? super T>> C gb(@dl.d T[] tArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), t10).booleanValue()) {
                destination.add(t10);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    public static final byte gc(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[0];
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterable")
    @sh.f
    private static final <R> List<R> gd(long[] jArr, yh.p<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R ge(@dl.d boolean[] zArr, R r10, @dl.d yh.p<? super Boolean, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iZe = Ze(zArr); iZe >= 0; iZe--) {
            r10 = operation.invoke(Boolean.valueOf(zArr[iZe]), r10);
        }
        return r10;
    }

    @sh.f
    private static final <T> T gf(T[] tArr, int i10, yh.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Xe(tArr)) ? defaultValue.invoke(Integer.valueOf(i10)) : tArr[i10];
    }

    @kotlin.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.s0(expression = "indexOfFirst { it == element }", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136930u, hiddenSince = org.apache.tools.ant.util.s0.f136932w, warningSince = "1.4")
    public static final /* synthetic */ int gg(float[] fArr, float f10) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (f10 == fArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @dl.d
    public static final <A extends Appendable> A gh(@dl.d char[] cArr, @dl.d A buffer, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Character, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (char c10 : cArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Character.valueOf(c10)));
            } else {
                buffer.append(c10);
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean gi(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                boolean z10 = zArr[length];
                if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                    return z10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C gj(@dl.d int[] iArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R gk(byte[] bArr, yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R gl(short[] sArr, Comparator<? super R> comparator, yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> float gm(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f10 = fArr[0];
        int iUe = Ue(fArr);
        if (iUe == 0) {
            return f10;
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        k0 it = new fi.l(1, iUe).iterator();
        while (it.hasNext()) {
            float f11 = fArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                f10 = f11;
                rInvoke = rInvoke2;
            }
        }
        return f10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float gn(char[] cArr, yh.l<? super Character, Float> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Long go(@dl.d long[] jArr, @dl.d Comparator<? super Long> comparator) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) > 0) {
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @dl.d
    public static final Pair<List<Integer>, List<Integer>> gp(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            } else {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final double gq(@dl.d double[] dArr, @dl.d yh.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[0];
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            dDoubleValue = operation.invoke(Integer.valueOf(iNextInt), Double.valueOf(dDoubleValue), Double.valueOf(dArr[iNextInt])).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Boolean gr(@dl.d boolean[] zArr, @dl.d yh.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iZe = Ze(zArr);
        if (iZe < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[iZe];
        for (int i10 = iZe - 1; i10 >= 0; i10--) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zArr[i10]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <T, R> List<R> gs(@dl.d T[] tArr, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r10);
        for (a.a.a.a.d.p.d.c.C0001c.a aVar : tArr) {
            r10 = operation.invoke(r10, aVar);
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void gt(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        ht(dArr, Random.f125033b);
    }

    @dl.d
    public static final List<Byte> gu(@dl.d byte[] bArr, @dl.d Iterable<Integer> indices) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void gv(@dl.d short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.collections.m.y4(sArr, i10, i11);
        Fr(sArr, i10, i11);
    }

    @dl.d
    public static final List<Byte> gw(@dl.d byte[] bArr, @dl.d Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Byte[] bArrO5 = kotlin.collections.m.o5(bArr);
        kotlin.collections.m.I4(bArrO5, comparator);
        return kotlin.collections.m.t(bArrO5);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfDouble")
    @sh.f
    private static final double gx(boolean[] zArr, yh.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (boolean z10 : zArr) {
            dDoubleValue += selector.invoke(Boolean.valueOf(z10)).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final List<Character> gy(@dl.d char[] cArr, int i10) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int length = cArr.length;
        if (i10 >= length) {
            return fz(cArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Character.valueOf(cArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Character.valueOf(cArr[i11]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Double> gz(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            return length != 1 ? qz(dArr) : kotlin.collections.s.k(Double.valueOf(dArr[0]));
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final kotlin.sequences.m<Double> h6(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr.length == 0 ? SequencesKt__SequencesKt.g() : new p(dArr);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M h7(@dl.d byte[] bArr, @dl.d M destination, @dl.d yh.l<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (byte b10 : bArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Byte.valueOf(b10));
            destination.put(pairInvoke.e(), pairInvoke.f());
        }
        return destination;
    }

    @sh.f
    private static final int h8(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr[1];
    }

    public static final int h9(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @dl.d
    public static final Iterable<h0<Boolean>> hA(@dl.d final boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return new i0(new yh.a<Iterator<? extends Boolean>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<Boolean> invoke() {
                return kotlin.jvm.internal.i.a(zArr);
            }
        });
    }

    @dl.d
    public static final <V> List<V> hB(@dl.d boolean[] zArr, @dl.d boolean[] other, @dl.d yh.p<? super Boolean, ? super Boolean, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i10]), Boolean.valueOf(other[i10])));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Byte> ha(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (z10) {
                arrayList.add(Byte.valueOf(b10));
            } else if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <C extends Collection<? super Short>> C hb(@dl.d short[] sArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            short s10 = sArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Short.valueOf(s10)).booleanValue()) {
                destination.add(Short.valueOf(s10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    public static final byte hc(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return b10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterable")
    @sh.f
    private static final <T, R> List<R> hd(T[] tArr, yh.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R he(@dl.d byte[] bArr, R r10, @dl.d yh.q<? super Integer, ? super Byte, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iRe = Re(bArr); iRe >= 0; iRe--) {
            r10 = operation.invoke(Integer.valueOf(iRe), Byte.valueOf(bArr[iRe]), r10);
        }
        return r10;
    }

    @sh.f
    private static final short hf(short[] sArr, int i10, yh.l<? super Integer, Short> defaultValue) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Ye(sArr)) ? defaultValue.invoke(Integer.valueOf(i10)).shortValue() : sArr[i10];
    }

    public static final int hg(@dl.d int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    @dl.d
    public static final <A extends Appendable> A hh(@dl.d double[] dArr, @dl.d A buffer, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Double, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (double d10 : dArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Double.valueOf(d10)));
            } else {
                buffer.append(String.valueOf(d10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final int hi(@dl.d byte[] bArr, byte b10) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (b10 == bArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C hj(@dl.d long[] jArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Long, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R hk(char[] cArr, yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R hl(boolean[] zArr, Comparator<? super R> comparator, yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> int hm(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int iVe = Ve(iArr);
        if (iVe == 0) {
            return i10;
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        k0 it = new fi.l(1, iVe).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                i10 = i11;
                rInvoke = rInvoke2;
            }
        }
        return i10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float hn(double[] dArr, yh.l<? super Double, Float> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <T> T ho(@dl.d T[] tArr, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t11 = tArr[it.nextInt()];
            if (comparator.compare(t10, t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @dl.d
    public static final Pair<List<Long>, List<Long>> hp(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            } else {
                arrayList2.add(Long.valueOf(j10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final float hq(@dl.d float[] fArr, @dl.d yh.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[0];
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            fFloatValue = operation.invoke(Integer.valueOf(iNextInt), Float.valueOf(fFloatValue), Float.valueOf(fArr[iNextInt])).floatValue();
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Byte hr(@dl.d byte[] bArr, @dl.d yh.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iRe = Re(bArr);
        if (iRe < 0) {
            return null;
        }
        byte bByteValue = bArr[iRe];
        for (int i10 = iRe - 1; i10 >= 0; i10--) {
            bByteValue = operation.invoke(Byte.valueOf(bArr[i10]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> hs(short[] sArr, R r10, yh.p<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        for (short s10 : sArr) {
            r10 = operation.invoke(r10, Short.valueOf(s10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void ht(@dl.d double[] dArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        for (int iTe = Te(dArr); iTe > 0; iTe--) {
            int iM = random.m(iTe + 1);
            double d10 = dArr[iTe];
            dArr[iTe] = dArr[iM];
            dArr[iM] = d10;
        }
    }

    @dl.d
    public static final List<Character> hu(@dl.d char[] cArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : kotlin.collections.m.o(kotlin.collections.m.H1(cArr, indices.D().intValue(), indices.e().intValue() + 1));
    }

    @dl.d
    public static final List<Byte> hv(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        Byte[] bArrO5 = kotlin.collections.m.o5(bArr);
        kotlin.collections.m.v4(bArrO5);
        return kotlin.collections.m.t(bArrO5);
    }

    @dl.d
    public static final List<Character> hw(@dl.d char[] cArr, @dl.d Comparator<? super Character> comparator) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Character[] chArrP5 = kotlin.collections.m.p5(cArr);
        kotlin.collections.m.I4(chArrP5, comparator);
        return kotlin.collections.m.t(chArrP5);
    }

    @xh.h(name = "sumOfFloat")
    public static final float hx(@dl.d Float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        float fFloatValue = 0.0f;
        for (Float f10 : fArr) {
            fFloatValue += f10.floatValue();
        }
        return fFloatValue;
    }

    @dl.d
    public static final List<Double> hy(@dl.d double[] dArr, int i10) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int length = dArr.length;
        if (i10 >= length) {
            return gz(dArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Double.valueOf(dArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Double.valueOf(dArr[i11]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Float> hz(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            return length != 1 ? rz(fArr) : kotlin.collections.s.k(Float.valueOf(fArr[0]));
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final kotlin.sequences.m<Float> i6(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr.length == 0 ? SequencesKt__SequencesKt.g() : new o(fArr);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M i7(@dl.d char[] cArr, @dl.d M destination, @dl.d yh.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (char c10 : cArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(c10));
            destination.put(pairInvoke.e(), pairInvoke.f());
        }
        return destination;
    }

    @sh.f
    private static final long i8(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr[1];
    }

    @sh.f
    private static final <T> int i9(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr.length;
    }

    @dl.d
    public static final <R> List<Pair<Byte, R>> iA(@dl.d byte[] bArr, @dl.d Iterable<? extends R> other) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(kotlin.c1.a(Byte.valueOf(bArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final List<Character> ia(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (char c10 : cArr) {
            if (z10) {
                arrayList.add(Character.valueOf(c10));
            } else if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <C extends Collection<? super Boolean>> C ib(@dl.d boolean[] zArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            boolean z10 = zArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Boolean.valueOf(z10)).booleanValue()) {
                destination.add(Boolean.valueOf(z10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    public static final char ic(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[0];
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterable")
    @sh.f
    private static final <R> List<R> id(short[] sArr, yh.p<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R ie(@dl.d char[] cArr, R r10, @dl.d yh.q<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iSe = Se(cArr); iSe >= 0; iSe--) {
            r10 = operation.invoke(Integer.valueOf(iSe), Character.valueOf(cArr[iSe]), r10);
        }
        return r10;
    }

    @sh.f
    /* JADX INFO: renamed from: if, reason: not valid java name */
    private static final boolean m783if(boolean[] zArr, int i10, yh.l<? super Integer, Boolean> defaultValue) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Ze(zArr)) ? defaultValue.invoke(Integer.valueOf(i10)).booleanValue() : zArr[i10];
    }

    public static final int ig(@dl.d long[] jArr, long j10) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @dl.d
    public static final <A extends Appendable> A ih(@dl.d float[] fArr, @dl.d A buffer, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Float, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (float f10 : fArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Float.valueOf(f10)));
            } else {
                buffer.append(String.valueOf(f10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final int ii(@dl.d char[] cArr, char c10) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (c10 == cArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C ij(@dl.d T[] tArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R ik(double[] dArr, yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Byte il(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            if (b10 < b11) {
                b10 = b11;
            }
        }
        return Byte.valueOf(b10);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> long im(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int iWe = We(jArr);
        if (iWe == 0) {
            return j10;
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        k0 it = new fi.l(1, iWe).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                j10 = j11;
            }
        }
        return j10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float in(float[] fArr, yh.l<? super Float, Float> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Short io(@dl.d short[] sArr, @dl.d Comparator<? super Short> comparator) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) > 0) {
                s10 = s11;
            }
        }
        return Short.valueOf(s10);
    }

    @dl.d
    public static final <T> Pair<List<T>, List<T>> ip(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            } else {
                arrayList2.add(t10);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final int iq(@dl.d int[] iArr, @dl.d yh.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[0];
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            iIntValue = operation.invoke(Integer.valueOf(iNextInt), Integer.valueOf(iIntValue), Integer.valueOf(iArr[iNextInt])).intValue();
        }
        return iIntValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Character ir(@dl.d char[] cArr, @dl.d yh.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iSe = Se(cArr);
        if (iSe < 0) {
            return null;
        }
        char cCharValue = cArr[iSe];
        for (int i10 = iSe - 1; i10 >= 0; i10--) {
            cCharValue = operation.invoke(Character.valueOf(cArr[i10]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> is(boolean[] zArr, R r10, yh.p<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r10);
        for (boolean z10 : zArr) {
            r10 = operation.invoke(r10, Boolean.valueOf(z10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.d
    public static final List<Character> iu(@dl.d char[] cArr, @dl.d Iterable<Integer> indices) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Character> iv(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        Character[] chArrP5 = kotlin.collections.m.p5(cArr);
        kotlin.collections.m.v4(chArrP5);
        return kotlin.collections.m.t(chArrP5);
    }

    @dl.d
    public static final List<Double> iw(@dl.d double[] dArr, @dl.d Comparator<? super Double> comparator) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Double[] dArrQ5 = kotlin.collections.m.q5(dArr);
        kotlin.collections.m.I4(dArrQ5, comparator);
        return kotlin.collections.m.t(dArrQ5);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfInt")
    @sh.f
    private static final int ix(byte[] bArr, yh.l<? super Byte, Integer> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (byte b10 : bArr) {
            iIntValue += selector.invoke(Byte.valueOf(b10)).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final List<Float> iy(@dl.d float[] fArr, int i10) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int length = fArr.length;
        if (i10 >= length) {
            return hz(fArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Float.valueOf(fArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Float.valueOf(fArr[i11]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Integer> iz(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? sz(iArr) : kotlin.collections.s.k(Integer.valueOf(iArr[0]));
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final kotlin.sequences.m<Integer> j6(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr.length == 0 ? SequencesKt__SequencesKt.g() : new m(iArr);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M j7(@dl.d double[] dArr, @dl.d M destination, @dl.d yh.l<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (double d10 : dArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Double.valueOf(d10));
            destination.put(pairInvoke.e(), pairInvoke.f());
        }
        return destination;
    }

    @sh.f
    private static final <T> T j8(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr[1];
    }

    public static final <T> int j9(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @dl.d
    public static final <R, V> List<V> jA(@dl.d byte[] bArr, @dl.d Iterable<? extends R> other, @dl.d yh.p<? super Byte, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final List<Double> ja(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (double d10 : dArr) {
            if (z10) {
                arrayList.add(Double.valueOf(d10));
            } else if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
                z10 = true;
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R> List<R> jb(Object[] objArr) {
        kotlin.jvm.internal.f0.p(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            kotlin.jvm.internal.f0.y(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final char jc(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return c10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterable")
    @sh.f
    private static final <R> List<R> jd(boolean[] zArr, yh.p<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(arrayList, transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R je(@dl.d double[] dArr, R r10, @dl.d yh.q<? super Integer, ? super Double, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iTe = Te(dArr); iTe >= 0; iTe--) {
            r10 = operation.invoke(Integer.valueOf(iTe), Double.valueOf(dArr[iTe]), r10);
        }
        return r10;
    }

    @dl.e
    public static final Boolean jf(@dl.d boolean[] zArr, int i10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (i10 < 0 || i10 > Ze(zArr)) {
            return null;
        }
        return Boolean.valueOf(zArr[i10]);
    }

    public static final <T> int jg(@dl.d T[] tArr, T t10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (kotlin.jvm.internal.f0.g(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @dl.d
    public static final <A extends Appendable> A jh(@dl.d int[] iArr, @dl.d A buffer, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Integer, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Integer.valueOf(i12)));
            } else {
                buffer.append(String.valueOf(i12));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @kotlin.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.s0(expression = "indexOfLast { it == element }", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136930u, hiddenSince = org.apache.tools.ant.util.s0.f136932w, warningSince = "1.4")
    public static final /* synthetic */ int ji(double[] dArr, double d10) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (d10 == dArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C jj(@dl.d short[] sArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Short, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R jk(float[] fArr, yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Character jl(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            if (kotlin.jvm.internal.f0.t(c10, c11) < 0) {
                c10 = c11;
            }
        }
        return Character.valueOf(c10);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T jm(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int iXe = Xe(tArr);
        if (iXe == 0) {
            return t10;
        }
        R rInvoke = selector.invoke(t10);
        k0 it = new fi.l(1, iXe).iterator();
        while (it.hasNext()) {
            T t11 = tArr[it.nextInt()];
            R rInvoke2 = selector.invoke(t11);
            if (rInvoke.compareTo(rInvoke2) > 0) {
                t10 = t11;
                rInvoke = rInvoke2;
            }
        }
        return t10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float jn(int[] iArr, yh.l<? super Integer, Float> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    public static final byte jo(@dl.d byte[] bArr, @dl.d Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) > 0) {
                b10 = b11;
            }
        }
        return b10;
    }

    @dl.d
    public static final Pair<List<Short>, List<Short>> jp(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            } else {
                arrayList2.add(Short.valueOf(s10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final long jq(@dl.d long[] jArr, @dl.d yh.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[0];
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jLongValue = operation.invoke(Integer.valueOf(iNextInt), Long.valueOf(jLongValue), Long.valueOf(jArr[iNextInt])).longValue();
        }
        return jLongValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Double jr(@dl.d double[] dArr, @dl.d yh.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iTe = Te(dArr);
        if (iTe < 0) {
            return null;
        }
        double dDoubleValue = dArr[iTe];
        for (int i10 = iTe - 1; i10 >= 0; i10--) {
            dDoubleValue = operation.invoke(Double.valueOf(dArr[i10]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> js(byte[] bArr, R r10, yh.q<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Byte.valueOf(bArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void jt(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kt(fArr, Random.f125033b);
    }

    @dl.d
    public static final List<Double> ju(@dl.d double[] dArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : kotlin.collections.m.p(kotlin.collections.m.I1(dArr, indices.D().intValue(), indices.e().intValue() + 1));
    }

    @dl.d
    public static final List<Double> jv(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        Double[] dArrQ5 = kotlin.collections.m.q5(dArr);
        kotlin.collections.m.v4(dArrQ5);
        return kotlin.collections.m.t(dArrQ5);
    }

    @dl.d
    public static final List<Float> jw(@dl.d float[] fArr, @dl.d Comparator<? super Float> comparator) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Float[] fArrR5 = kotlin.collections.m.r5(fArr);
        kotlin.collections.m.I4(fArrR5, comparator);
        return kotlin.collections.m.t(fArrR5);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfInt")
    @sh.f
    private static final int jx(char[] cArr, yh.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (char c10 : cArr) {
            iIntValue += selector.invoke(Character.valueOf(c10)).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final List<Integer> jy(@dl.d int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int length = iArr.length;
        if (i10 >= length) {
            return iz(iArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Integer.valueOf(iArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Integer.valueOf(iArr[i11]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Long> jz(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            return length != 1 ? tz(jArr) : kotlin.collections.s.k(Long.valueOf(jArr[0]));
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final kotlin.sequences.m<Long> k6(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr.length == 0 ? SequencesKt__SequencesKt.g() : new n(jArr);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M k7(@dl.d float[] fArr, @dl.d M destination, @dl.d yh.l<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (float f10 : fArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Float.valueOf(f10));
            destination.put(pairInvoke.e(), pairInvoke.f());
        }
        return destination;
    }

    @sh.f
    private static final short k8(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return sArr[1];
    }

    @sh.f
    private static final int k9(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return sArr.length;
    }

    @dl.d
    public static final List<Pair<Byte, Byte>> kA(@dl.d byte[] bArr, @dl.d byte[] other) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(kotlin.c1.a(Byte.valueOf(bArr[i10]), Byte.valueOf(other[i10])));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Float> ka(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (float f10 : fArr) {
            if (z10) {
                arrayList.add(Float.valueOf(f10));
            } else if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
                z10 = true;
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C kb(Object[] objArr, C destination) {
        kotlin.jvm.internal.f0.p(objArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (Object obj : objArr) {
            kotlin.jvm.internal.f0.y(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final double kc(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[0];
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterableTo")
    @sh.f
    private static final <R, C extends Collection<? super R>> C kd(byte[] bArr, C destination, yh.p<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final <R> R ke(@dl.d float[] fArr, R r10, @dl.d yh.q<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iUe = Ue(fArr); iUe >= 0; iUe--) {
            r10 = operation.invoke(Integer.valueOf(iUe), Float.valueOf(fArr[iUe]), r10);
        }
        return r10;
    }

    @dl.e
    public static final Byte kf(@dl.d byte[] bArr, int i10) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (i10 < 0 || i10 > Re(bArr)) {
            return null;
        }
        return Byte.valueOf(bArr[i10]);
    }

    public static final int kg(@dl.d short[] sArr, short s10) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @dl.d
    public static final <A extends Appendable> A kh(@dl.d long[] jArr, @dl.d A buffer, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Long, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Long.valueOf(j10)));
            } else {
                buffer.append(String.valueOf(j10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @kotlin.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.s0(expression = "indexOfLast { it == element }", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136930u, hiddenSince = org.apache.tools.ant.util.s0.f136932w, warningSince = "1.4")
    public static final /* synthetic */ int ki(float[] fArr, float f10) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (f10 == fArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C kj(@dl.d boolean[] zArr, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R kk(int[] iArr, yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <T extends Comparable<? super T>> T kl(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t11 = tArr[it.nextInt()];
            if (t10.compareTo(t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> short km(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int iYe = Ye(sArr);
        if (iYe == 0) {
            return s10;
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        k0 it = new fi.l(1, iYe).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                s10 = s11;
                rInvoke = rInvoke2;
            }
        }
        return s10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float kn(long[] jArr, yh.l<? super Long, Float> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    public static final char ko(@dl.d char[] cArr, @dl.d Comparator<? super Character> comparator) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) > 0) {
                c10 = c11;
            }
        }
        return c10;
    }

    @dl.d
    public static final Pair<List<Boolean>, List<Boolean>> kp(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            } else {
                arrayList2.add(Boolean.valueOf(z10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final <S, T extends S> S kq(@dl.d T[] tArr, @dl.d yh.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[0];
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sInvoke = operation.invoke(Integer.valueOf(iNextInt), sInvoke, (Object) tArr[iNextInt]);
        }
        return sInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Float kr(@dl.d float[] fArr, @dl.d yh.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iUe = Ue(fArr);
        if (iUe < 0) {
            return null;
        }
        float fFloatValue = fArr[iUe];
        for (int i10 = iUe - 1; i10 >= 0; i10--) {
            fFloatValue = operation.invoke(Float.valueOf(fArr[i10]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> ks(char[] cArr, R r10, yh.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r10);
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(cArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void kt(@dl.d float[] fArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        for (int iUe = Ue(fArr); iUe > 0; iUe--) {
            int iM = random.m(iUe + 1);
            float f10 = fArr[iUe];
            fArr[iUe] = fArr[iM];
            fArr[iM] = f10;
        }
    }

    @dl.d
    public static final List<Double> ku(@dl.d double[] dArr, @dl.d Iterable<Integer> indices) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Float> kv(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        Float[] fArrR5 = kotlin.collections.m.r5(fArr);
        kotlin.collections.m.v4(fArrR5);
        return kotlin.collections.m.t(fArrR5);
    }

    @dl.d
    public static final List<Integer> kw(@dl.d int[] iArr, @dl.d Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Integer[] numArrS5 = kotlin.collections.m.s5(iArr);
        kotlin.collections.m.I4(numArrS5, comparator);
        return kotlin.collections.m.t(numArrS5);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfInt")
    @sh.f
    private static final int kx(double[] dArr, yh.l<? super Double, Integer> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (double d10 : dArr) {
            iIntValue += selector.invoke(Double.valueOf(d10)).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final List<Long> ky(@dl.d long[] jArr, int i10) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int length = jArr.length;
        if (i10 >= length) {
            return jz(jArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Long.valueOf(jArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Long.valueOf(jArr[i11]));
        }
        return arrayList;
    }

    @dl.d
    public static final <T> List<T> kz(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? uz(tArr) : kotlin.collections.s.k(tArr[0]);
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final <T> kotlin.sequences.m<T> l6(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr.length == 0 ? SequencesKt__SequencesKt.g() : new j(tArr);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M l7(@dl.d int[] iArr, @dl.d M destination, @dl.d yh.l<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (int i10 : iArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Integer.valueOf(i10));
            destination.put(pairInvoke.e(), pairInvoke.f());
        }
        return destination;
    }

    @sh.f
    private static final boolean l8(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr[1];
    }

    public static final int l9(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @dl.d
    public static final <V> List<V> lA(@dl.d byte[] bArr, @dl.d byte[] other, @dl.d yh.p<? super Byte, ? super Byte, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i10]), Byte.valueOf(other[i10])));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Integer> la(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (int i10 : iArr) {
            if (z10) {
                arrayList.add(Integer.valueOf(i10));
            } else if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final List<Byte> lb(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    public static final double lc(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return d10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterableTo")
    @sh.f
    private static final <R, C extends Collection<? super R>> C ld(char[] cArr, C destination, yh.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final <R> R le(@dl.d int[] iArr, R r10, @dl.d yh.q<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iVe = Ve(iArr); iVe >= 0; iVe--) {
            r10 = operation.invoke(Integer.valueOf(iVe), Integer.valueOf(iArr[iVe]), r10);
        }
        return r10;
    }

    @dl.e
    public static final Character lf(@dl.d char[] cArr, int i10) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (i10 < 0 || i10 > Se(cArr)) {
            return null;
        }
        return Character.valueOf(cArr[i10]);
    }

    public static final int lg(@dl.d boolean[] zArr, boolean z10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10 == zArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @dl.d
    public static final <T, A extends Appendable> A lh(@dl.d T[] tArr, @dl.d A buffer, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super T, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : tArr) {
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

    public static final int li(@dl.d int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 >= 0) {
                    length = i11;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final <T, R> List<R> lj(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            R rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R lk(long[] jArr, yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Double ll(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMax = dArr[0];
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            dMax = Math.max(dMax, dArr[it.nextInt()]);
        }
        return Double.valueOf(dMax);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> boolean lm(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z10 = zArr[0];
        int iZe = Ze(zArr);
        if (iZe == 0) {
            return z10;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        k0 it = new fi.l(1, iZe).iterator();
        while (it.hasNext()) {
            boolean z11 = zArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                z10 = z11;
                rInvoke = rInvoke2;
            }
        }
        return z10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> Float ln(T[] tArr, yh.l<? super T, Float> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(tArr[it.nextInt()]).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    public static final double lo(@dl.d double[] dArr, @dl.d Comparator<? super Double> comparator) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d10 = dArr[0];
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            double d11 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) > 0) {
                d10 = d11;
            }
        }
        return d10;
    }

    @kotlin.u0(version = "1.3")
    @sh.f
    private static final byte lp(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return mp(bArr, Random.f125033b);
    }

    public static final short lq(@dl.d short[] sArr, @dl.d yh.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[0];
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sShortValue = operation.invoke(Integer.valueOf(iNextInt), Short.valueOf(sShortValue), Short.valueOf(sArr[iNextInt])).shortValue();
        }
        return sShortValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Integer lr(@dl.d int[] iArr, @dl.d yh.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iVe = Ve(iArr);
        if (iVe < 0) {
            return null;
        }
        int iIntValue = iArr[iVe];
        for (int i10 = iVe - 1; i10 >= 0; i10--) {
            iIntValue = operation.invoke(Integer.valueOf(iArr[i10]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> ls(double[] dArr, R r10, yh.q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r10);
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Double.valueOf(dArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void lt(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        mt(iArr, Random.f125033b);
    }

    @dl.d
    public static final List<Float> lu(@dl.d float[] fArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : kotlin.collections.m.q(kotlin.collections.m.J1(fArr, indices.D().intValue(), indices.e().intValue() + 1));
    }

    @dl.d
    public static final List<Integer> lv(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        Integer[] numArrS5 = kotlin.collections.m.s5(iArr);
        kotlin.collections.m.v4(numArrS5);
        return kotlin.collections.m.t(numArrS5);
    }

    @dl.d
    public static final List<Long> lw(@dl.d long[] jArr, @dl.d Comparator<? super Long> comparator) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Long[] lArrT5 = kotlin.collections.m.t5(jArr);
        kotlin.collections.m.I4(lArrT5, comparator);
        return kotlin.collections.m.t(lArrT5);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfInt")
    @sh.f
    private static final int lx(float[] fArr, yh.l<? super Float, Integer> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (float f10 : fArr) {
            iIntValue += selector.invoke(Float.valueOf(f10)).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final <T> List<T> ly(@dl.d T[] tArr, int i10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int length = tArr.length;
        if (i10 >= length) {
            return kz(tArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(tArr[i11]);
        }
        return arrayList;
    }

    @dl.d
    public static final List<Short> lz(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            return length != 1 ? vz(sArr) : kotlin.collections.s.k(Short.valueOf(sArr[0]));
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final kotlin.sequences.m<Short> m6(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return sArr.length == 0 ? SequencesKt__SequencesKt.g() : new l(sArr);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M m7(@dl.d long[] jArr, @dl.d M destination, @dl.d yh.l<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (long j10 : jArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Long.valueOf(j10));
            destination.put(pairInvoke.e(), pairInvoke.f());
        }
        return destination;
    }

    @sh.f
    private static final byte m8(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return bArr[2];
    }

    @sh.f
    private static final int m9(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr.length;
    }

    @dl.d
    public static final <R> List<Pair<Byte, R>> mA(@dl.d byte[] bArr, @dl.d R[] other) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            byte b10 = bArr[i10];
            arrayList.add(kotlin.c1.a(Byte.valueOf(b10), other[i10]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Long> ma(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (long j10 : jArr) {
            if (z10) {
                arrayList.add(Long.valueOf(j10));
            } else if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final List<Character> mb(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    public static final float mc(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterableTo")
    @sh.f
    private static final <R, C extends Collection<? super R>> C md(double[] dArr, C destination, yh.p<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final <R> R me(@dl.d long[] jArr, R r10, @dl.d yh.q<? super Integer, ? super Long, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iWe = We(jArr); iWe >= 0; iWe--) {
            r10 = operation.invoke(Integer.valueOf(iWe), Long.valueOf(jArr[iWe]), r10);
        }
        return r10;
    }

    @dl.e
    public static final Double mf(@dl.d double[] dArr, int i10) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (i10 < 0 || i10 > Te(dArr)) {
            return null;
        }
        return Double.valueOf(dArr[i10]);
    }

    public static final int mg(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Byte.valueOf(bArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @dl.d
    public static final <A extends Appendable> A mh(@dl.d short[] sArr, @dl.d A buffer, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Short, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (short s10 : sArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Short.valueOf(s10)));
            } else {
                buffer.append(String.valueOf((int) s10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final int mi(@dl.d long[] jArr, long j10) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (j10 == jArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C mj(@dl.d T[] tArr, @dl.d C destination, @dl.d yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (T t10 : tArr) {
            R rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R extends Comparable<? super R>> R mk(T[] tArr, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Double ml(@dl.d Double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        k0 it = new fi.l(1, Xe(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, dArr[it.nextInt()].doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double mm(byte[] bArr, yh.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float mn(short[] sArr, yh.l<? super Short, Float> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    public static final float mo(@dl.d float[] fArr, @dl.d Comparator<? super Float> comparator) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f10 = fArr[0];
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            float f11 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) > 0) {
                f10 = f11;
            }
        }
        return f10;
    }

    @kotlin.u0(version = "1.3")
    public static final byte mp(@dl.d byte[] bArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[random.m(bArr.length)];
    }

    public static final boolean mq(@dl.d boolean[] zArr, @dl.d yh.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[0];
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            zBooleanValue = operation.invoke(Integer.valueOf(iNextInt), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[iNextInt])).booleanValue();
        }
        return zBooleanValue;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Long mr(@dl.d long[] jArr, @dl.d yh.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iWe = We(jArr);
        if (iWe < 0) {
            return null;
        }
        long jLongValue = jArr[iWe];
        for (int i10 = iWe - 1; i10 >= 0; i10--) {
            jLongValue = operation.invoke(Long.valueOf(jArr[i10]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> ms(float[] fArr, R r10, yh.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r10);
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Float.valueOf(fArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void mt(@dl.d int[] iArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        for (int iVe = Ve(iArr); iVe > 0; iVe--) {
            int iM = random.m(iVe + 1);
            int i10 = iArr[iVe];
            iArr[iVe] = iArr[iM];
            iArr[iM] = i10;
        }
    }

    @dl.d
    public static final List<Float> mu(@dl.d float[] fArr, @dl.d Iterable<Integer> indices) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Long> mv(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        Long[] lArrT5 = kotlin.collections.m.t5(jArr);
        kotlin.collections.m.v4(lArrT5);
        return kotlin.collections.m.t(lArrT5);
    }

    @dl.d
    public static final <T> List<T> mw(@dl.d T[] tArr, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return kotlin.collections.m.t(Fv(tArr, comparator));
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfInt")
    @sh.f
    private static final int mx(int[] iArr, yh.l<? super Integer, Integer> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (int i10 : iArr) {
            iIntValue += selector.invoke(Integer.valueOf(i10)).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final List<Short> my(@dl.d short[] sArr, int i10) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int length = sArr.length;
        if (i10 >= length) {
            return lz(sArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Short.valueOf(sArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Short.valueOf(sArr[i11]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Boolean> mz(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            return length != 1 ? wz(zArr) : kotlin.collections.s.k(Boolean.valueOf(zArr[0]));
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public static final kotlin.sequences.m<Boolean> n6(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr.length == 0 ? SequencesKt__SequencesKt.g() : new q(zArr);
    }

    @dl.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M n7(@dl.d T[] tArr, @dl.d M destination, @dl.d yh.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (T t10 : tArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(t10);
            destination.put(pairInvoke.e(), pairInvoke.f());
        }
        return destination;
    }

    @sh.f
    private static final char n8(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return cArr[2];
    }

    public static final int n9(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = 0;
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @dl.d
    public static final <R, V> List<V> nA(@dl.d byte[] bArr, @dl.d R[] other, @dl.d yh.p<? super Byte, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @dl.d
    public static final <T> List<T> na(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (T t10 : tArr) {
            if (z10) {
                arrayList.add(t10);
            } else if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
                z10 = true;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final List<Double> nb(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            }
        }
        return arrayList;
    }

    public static final float nc(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return f10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterableTo")
    @sh.f
    private static final <R, C extends Collection<? super R>> C nd(float[] fArr, C destination, yh.p<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R ne(@dl.d T[] tArr, R r10, @dl.d yh.q<? super Integer, ? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iXe = Xe(tArr); iXe >= 0; iXe--) {
            r10 = operation.invoke(Integer.valueOf(iXe), tArr[iXe], r10);
        }
        return r10;
    }

    @dl.e
    public static final Float nf(@dl.d float[] fArr, int i10) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (i10 < 0 || i10 > Ue(fArr)) {
            return null;
        }
        return Float.valueOf(fArr[i10]);
    }

    public static final int ng(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Character.valueOf(cArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @dl.d
    public static final <A extends Appendable> A nh(@dl.d boolean[] zArr, @dl.d A buffer, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Boolean, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (boolean z10 : zArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Boolean.valueOf(z10)));
            } else {
                buffer.append(String.valueOf(z10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> int ni(@dl.d T[] tArr, T t10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i10 >= 0) {
                        length = i10;
                    }
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (kotlin.jvm.internal.f0.g(t10, tArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C nj(@dl.d byte[] bArr, @dl.d C destination, @dl.d yh.l<? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (byte b10 : bArr) {
            destination.add(transform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R nk(short[] sArr, yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Float nl(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            fMax = Math.max(fMax, fArr[it.nextInt()]);
        }
        return Float.valueOf(fMax);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double nm(char[] cArr, yh.l<? super Character, Double> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Float nn(boolean[] zArr, yh.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    public static final int no(@dl.d int[] iArr, @dl.d Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i11)) > 0) {
                i10 = i11;
            }
        }
        return i10;
    }

    @kotlin.u0(version = "1.3")
    @sh.f
    private static final char np(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return op(cArr, Random.f125033b);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Boolean nq(@dl.d boolean[] zArr, @dl.d yh.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            zBooleanValue = operation.invoke(Integer.valueOf(iNextInt), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[iNextInt])).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final <S, T extends S> S nr(@dl.d T[] tArr, @dl.d yh.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iXe = Xe(tArr);
        if (iXe < 0) {
            return null;
        }
        S sInvoke = (S) tArr[iXe];
        for (int i10 = iXe - 1; i10 >= 0; i10--) {
            sInvoke = operation.invoke((Object) tArr[i10], sInvoke);
        }
        return sInvoke;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> ns(int[] iArr, R r10, yh.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Integer.valueOf(iArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void nt(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        ot(jArr, Random.f125033b);
    }

    @dl.d
    public static final List<Integer> nu(@dl.d int[] iArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : kotlin.collections.m.r(kotlin.collections.m.K1(iArr, indices.D().intValue(), indices.e().intValue() + 1));
    }

    @dl.d
    public static final <T extends Comparable<? super T>> List<T> nv(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return kotlin.collections.m.t(vv(tArr));
    }

    @dl.d
    public static final List<Short> nw(@dl.d short[] sArr, @dl.d Comparator<? super Short> comparator) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Short[] shArrU5 = kotlin.collections.m.u5(sArr);
        kotlin.collections.m.I4(shArrU5, comparator);
        return kotlin.collections.m.t(shArrU5);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfInt")
    @sh.f
    private static final int nx(long[] jArr, yh.l<? super Long, Integer> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (long j10 : jArr) {
            iIntValue += selector.invoke(Long.valueOf(j10)).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final List<Boolean> ny(@dl.d boolean[] zArr, int i10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int length = zArr.length;
        if (i10 >= length) {
            return mz(zArr);
        }
        if (i10 == 1) {
            return kotlin.collections.s.k(Boolean.valueOf(zArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Boolean.valueOf(zArr[i11]));
        }
        return arrayList;
    }

    @dl.d
    public static final long[] nz(@dl.d Long[] lArr) {
        kotlin.jvm.internal.f0.p(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = lArr[i10].longValue();
        }
        return jArr;
    }

    @dl.d
    public static final <K, V> Map<K, V> o6(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(bArr.length), 16));
        for (byte b10 : bArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Byte.valueOf(b10));
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M o7(@dl.d short[] sArr, @dl.d M destination, @dl.d yh.l<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (short s10 : sArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Short.valueOf(s10));
            destination.put(pairInvoke.e(), pairInvoke.f());
        }
        return destination;
    }

    @sh.f
    private static final double o8(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr[2];
    }

    @dl.d
    public static final List<Byte> o9(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return CollectionsKt___CollectionsKt.Q5(xz(bArr));
    }

    @dl.d
    public static final <R> List<Pair<Character, R>> oA(@dl.d char[] cArr, @dl.d Iterable<? extends R> other) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(kotlin.c1.a(Character.valueOf(cArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final List<Short> oa(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (short s10 : sArr) {
            if (z10) {
                arrayList.add(Short.valueOf(s10));
            } else if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final List<Float> ob(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            }
        }
        return arrayList;
    }

    public static final int oc(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterableTo")
    @sh.f
    private static final <R, C extends Collection<? super R>> C od(int[] iArr, C destination, yh.p<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final <R> R oe(@dl.d short[] sArr, R r10, @dl.d yh.q<? super Integer, ? super Short, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iYe = Ye(sArr); iYe >= 0; iYe--) {
            r10 = operation.invoke(Integer.valueOf(iYe), Short.valueOf(sArr[iYe]), r10);
        }
        return r10;
    }

    @dl.e
    public static final Integer of(@dl.d int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (i10 < 0 || i10 > Ve(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static final int og(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Double.valueOf(dArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int oi(@dl.d short[] sArr, short s10) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (s10 == sArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C oj(@dl.d char[] cArr, @dl.d C destination, @dl.d yh.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (char c10 : cArr) {
            destination.add(transform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R ok(boolean[] zArr, yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Float ol(@dl.d Float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        k0 it = new fi.l(1, Xe(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double om(double[] dArr, yh.l<? super Double, Double> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R on(byte[] bArr, Comparator<? super R> comparator, yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    public static final long oo(@dl.d long[] jArr, @dl.d Comparator<? super Long> comparator) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) > 0) {
                j10 = j11;
            }
        }
        return j10;
    }

    @kotlin.u0(version = "1.3")
    public static final char op(@dl.d char[] cArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[random.m(cArr.length)];
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Byte oq(@dl.d byte[] bArr, @dl.d yh.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            bByteValue = operation.invoke(Integer.valueOf(iNextInt), Byte.valueOf(bByteValue), Byte.valueOf(bArr[iNextInt])).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Short or(@dl.d short[] sArr, @dl.d yh.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int iYe = Ye(sArr);
        if (iYe < 0) {
            return null;
        }
        short sShortValue = sArr[iYe];
        for (int i10 = iYe - 1; i10 >= 0; i10--) {
            sShortValue = operation.invoke(Short.valueOf(sArr[i10]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> os(long[] jArr, R r10, yh.q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Long.valueOf(jArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void ot(@dl.d long[] jArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        for (int iWe = We(jArr); iWe > 0; iWe--) {
            int iM = random.m(iWe + 1);
            long j10 = jArr[iWe];
            jArr[iWe] = jArr[iM];
            jArr[iM] = j10;
        }
    }

    @dl.d
    public static final List<Integer> ou(@dl.d int[] iArr, @dl.d Iterable<Integer> indices) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @dl.d
    public static final List<Short> ov(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        Short[] shArrU5 = kotlin.collections.m.u5(sArr);
        kotlin.collections.m.v4(shArrU5);
        return kotlin.collections.m.t(shArrU5);
    }

    @dl.d
    public static final List<Boolean> ow(@dl.d boolean[] zArr, @dl.d Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Boolean[] boolArrN5 = kotlin.collections.m.n5(zArr);
        kotlin.collections.m.I4(boolArrN5, comparator);
        return kotlin.collections.m.t(boolArrN5);
    }

    @xh.h(name = "sumOfInt")
    public static final int ox(@dl.d Integer[] numArr) {
        kotlin.jvm.internal.f0.p(numArr, "<this>");
        int iIntValue = 0;
        for (Integer num : numArr) {
            iIntValue += num.intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final List<Byte> oy(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iRe = Re(bArr); -1 < iRe; iRe--) {
            if (!predicate.invoke(Byte.valueOf(bArr[iRe])).booleanValue()) {
                return G9(bArr, iRe + 1);
            }
        }
        return ez(bArr);
    }

    @dl.d
    public static final List<Byte> oz(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    @dl.d
    public static final <K, V> Map<K, V> p6(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(cArr.length), 16));
        for (char c10 : cArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(c10));
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M p7(@dl.d boolean[] zArr, @dl.d M destination, @dl.d yh.l<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (boolean z10 : zArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Boolean.valueOf(z10));
            destination.put(pairInvoke.e(), pairInvoke.f());
        }
        return destination;
    }

    @sh.f
    private static final float p8(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr[2];
    }

    @dl.d
    public static final List<Character> p9(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return CollectionsKt___CollectionsKt.Q5(yz(cArr));
    }

    @dl.d
    public static final <R, V> List<V> pA(@dl.d char[] cArr, @dl.d Iterable<? extends R> other, @dl.d yh.p<? super Character, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Character.valueOf(cArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final List<Boolean> pa(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (z10) {
                arrayList.add(Boolean.valueOf(z11));
            } else if (!predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z11));
                z10 = true;
            }
        }
        return arrayList;
    }

    @dl.d
    public static final List<Integer> pb(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    public static final int pc(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return i10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterableTo")
    @sh.f
    private static final <R, C extends Collection<? super R>> C pd(long[] jArr, C destination, yh.p<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final <R> R pe(@dl.d boolean[] zArr, R r10, @dl.d yh.q<? super Integer, ? super Boolean, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        for (int iZe = Ze(zArr); iZe >= 0; iZe--) {
            r10 = operation.invoke(Integer.valueOf(iZe), Boolean.valueOf(zArr[iZe]), r10);
        }
        return r10;
    }

    @dl.e
    public static final Long pf(@dl.d long[] jArr, int i10) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (i10 < 0 || i10 > We(jArr)) {
            return null;
        }
        return Long.valueOf(jArr[i10]);
    }

    public static final int pg(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Float.valueOf(fArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int pi(@dl.d boolean[] zArr, boolean z10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (z10 == zArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C pj(@dl.d double[] dArr, @dl.d C destination, @dl.d yh.l<? super Double, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (double d10 : dArr) {
            destination.add(transform.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R pk(byte[] bArr, yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Integer pl(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            if (i10 < i11) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double pm(float[] fArr, yh.l<? super Float, Double> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R pn(char[] cArr, Comparator<? super R> comparator, yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    public static final <T> T po(@dl.d T[] tArr, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t11 = tArr[it.nextInt()];
            if (comparator.compare(t10, t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @kotlin.u0(version = "1.3")
    @sh.f
    private static final double pp(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return qp(dArr, Random.f125033b);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Character pq(@dl.d char[] cArr, @dl.d yh.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharValue = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharValue), Character.valueOf(cArr[iNextInt])).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @dl.d
    public static final <T> T[] pr(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        for (T t10 : tArr) {
            if (t10 == null) {
                throw new IllegalArgumentException("null element found in " + tArr + lg.a.f131414g);
            }
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <T, R> List<R> ps(@dl.d T[] tArr, R r10, @dl.d yh.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r10);
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, tArr[i10]);
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final <T> void pt(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        qt(tArr, Random.f125033b);
    }

    @dl.d
    public static final List<Long> pu(@dl.d long[] jArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : kotlin.collections.m.s(kotlin.collections.m.L1(jArr, indices.D().intValue(), indices.e().intValue() + 1));
    }

    @dl.d
    public static final byte[] pv(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.f0.o(bArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.h4(bArrCopyOf);
        return bArrCopyOf;
    }

    @dl.d
    public static final Set<Byte> pw(@dl.d byte[] bArr, @dl.d Iterable<Byte> other) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Byte> setXz = xz(bArr);
        x.E0(setXz, other);
        return setXz;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfInt")
    @sh.f
    private static final <T> int px(T[] tArr, yh.l<? super T, Integer> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (T t10 : tArr) {
            iIntValue += selector.invoke(t10).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final List<Character> py(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iSe = Se(cArr); -1 < iSe; iSe--) {
            if (!predicate.invoke(Character.valueOf(cArr[iSe])).booleanValue()) {
                return H9(cArr, iSe + 1);
            }
        }
        return fz(cArr);
    }

    @dl.d
    public static final List<Character> pz(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    @dl.d
    public static final <K, V> Map<K, V> q6(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(dArr.length), 16));
        for (double d10 : dArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Double.valueOf(d10));
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V> Map<Byte, V> q7(byte[] bArr, yh.l<? super Byte, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(bArr.length), 16));
        for (byte b10 : bArr) {
            linkedHashMap.put(Byte.valueOf(b10), valueSelector.invoke(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    @sh.f
    private static final int q8(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr[2];
    }

    @dl.d
    public static final List<Double> q9(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return CollectionsKt___CollectionsKt.Q5(zz(dArr));
    }

    @dl.d
    public static final List<Pair<Character, Character>> qA(@dl.d char[] cArr, @dl.d char[] other) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(kotlin.c1.a(Character.valueOf(cArr[i10]), Character.valueOf(other[i10])));
        }
        return arrayList;
    }

    @sh.f
    private static final byte qa(byte[] bArr, int i10, yh.l<? super Integer, Byte> defaultValue) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Re(bArr)) ? defaultValue.invoke(Integer.valueOf(i10)).byteValue() : bArr[i10];
    }

    @dl.d
    public static final List<Long> qb(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    public static final long qc(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[0];
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterableTo")
    @sh.f
    private static final <T, R, C extends Collection<? super R>> C qd(T[] tArr, C destination, yh.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final void qe(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, b2> action) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (byte b10 : bArr) {
            action.invoke(Byte.valueOf(b10));
        }
    }

    @dl.e
    public static final <T> T qf(@dl.d T[] tArr, int i10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (i10 < 0 || i10 > Xe(tArr)) {
            return null;
        }
        return tArr[i10];
    }

    public static final int qg(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @dl.e
    public static final Boolean qi(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C qj(@dl.d float[] fArr, @dl.d C destination, @dl.d yh.l<? super Float, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (float f10 : fArr) {
            destination.add(transform.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R qk(char[] cArr, yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Long ql(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            if (j10 < j11) {
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double qm(int[] iArr, yh.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R qn(double[] dArr, Comparator<? super R> comparator, yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    public static final short qo(@dl.d short[] sArr, @dl.d Comparator<? super Short> comparator) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) > 0) {
                s10 = s11;
            }
        }
        return s10;
    }

    @kotlin.u0(version = "1.3")
    public static final double qp(@dl.d double[] dArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[random.m(dArr.length)];
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Double qq(@dl.d double[] dArr, @dl.d yh.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            dDoubleValue = operation.invoke(Integer.valueOf(iNextInt), Double.valueOf(dDoubleValue), Double.valueOf(dArr[iNextInt])).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final void qr(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iRe = Re(bArr);
        k0 it = new fi.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            byte b10 = bArr[iNextInt];
            bArr[iNextInt] = bArr[iRe];
            bArr[iRe] = b10;
            iRe--;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> qs(short[] sArr, R r10, yh.q<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Short.valueOf(sArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final <T> void qt(@dl.d T[] tArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        for (int iXe = Xe(tArr); iXe > 0; iXe--) {
            int iM = random.m(iXe + 1);
            T t10 = tArr[iXe];
            tArr[iXe] = tArr[iM];
            tArr[iM] = t10;
        }
    }

    @dl.d
    public static final List<Long> qu(@dl.d long[] jArr, @dl.d Iterable<Integer> indices) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @dl.d
    public static final char[] qv(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.f0.o(cArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.j4(cArrCopyOf);
        return cArrCopyOf;
    }

    @dl.d
    public static final Set<Character> qw(@dl.d char[] cArr, @dl.d Iterable<Character> other) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Character> setYz = yz(cArr);
        x.E0(setYz, other);
        return setYz;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfInt")
    @sh.f
    private static final int qx(short[] sArr, yh.l<? super Short, Integer> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (short s10 : sArr) {
            iIntValue += selector.invoke(Short.valueOf(s10)).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final List<Double> qy(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iTe = Te(dArr); -1 < iTe; iTe--) {
            if (!predicate.invoke(Double.valueOf(dArr[iTe])).booleanValue()) {
                return I9(dArr, iTe + 1);
            }
        }
        return gz(dArr);
    }

    @dl.d
    public static final List<Double> qz(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    @dl.d
    public static final <K, V> Map<K, V> r6(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(fArr.length), 16));
        for (float f10 : fArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Float.valueOf(f10));
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V> Map<Character, V> r7(char[] cArr, yh.l<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(fi.u.B(cArr.length, 128)), 16));
        for (char c10 : cArr) {
            linkedHashMap.put(Character.valueOf(c10), valueSelector.invoke(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    @sh.f
    private static final long r8(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr[2];
    }

    @dl.d
    public static final List<Float> r9(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return CollectionsKt___CollectionsKt.Q5(Az(fArr));
    }

    @dl.d
    public static final <V> List<V> rA(@dl.d char[] cArr, @dl.d char[] other, @dl.d yh.p<? super Character, ? super Character, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i10]), Character.valueOf(other[i10])));
        }
        return arrayList;
    }

    @sh.f
    private static final char ra(char[] cArr, int i10, yh.l<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Se(cArr)) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : cArr[i10];
    }

    @dl.d
    public static final <T> List<T> rb(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final long rc(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return j10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterableTo")
    @sh.f
    private static final <R, C extends Collection<? super R>> C rd(short[] sArr, C destination, yh.p<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final void re(@dl.d char[] cArr, @dl.d yh.l<? super Character, b2> action) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (char c10 : cArr) {
            action.invoke(Character.valueOf(c10));
        }
    }

    @dl.e
    public static final Short rf(@dl.d short[] sArr, int i10) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (i10 < 0 || i10 > Ye(sArr)) {
            return null;
        }
        return Short.valueOf(sArr[i10]);
    }

    public static final int rg(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Long.valueOf(jArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @dl.e
    public static final Boolean ri(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            boolean z10 = zArr[length];
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C rj(@dl.d int[] iArr, @dl.d C destination, @dl.d yh.l<? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (int i10 : iArr) {
            destination.add(transform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R rk(double[] dArr, yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Short rl(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            if (s10 < s11) {
                s10 = s11;
            }
        }
        return Short.valueOf(s10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double rm(long[] jArr, yh.l<? super Long, Double> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R rn(float[] fArr, Comparator<? super R> comparator, yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    public static final boolean ro(@dl.d boolean[] zArr, @dl.d Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z10 = zArr[0];
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            boolean z11 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) > 0) {
                z10 = z11;
            }
        }
        return z10;
    }

    @kotlin.u0(version = "1.3")
    @sh.f
    private static final float rp(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return sp(fArr, Random.f125033b);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Float rq(@dl.d float[] fArr, @dl.d yh.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            fFloatValue = operation.invoke(Integer.valueOf(iNextInt), Float.valueOf(fFloatValue), Float.valueOf(fArr[iNextInt])).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.u0(version = "1.4")
    public static final void rr(@dl.d byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.collections.b.Companion.d(i10, i11, bArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i13];
            bArr[i13] = b10;
            i13--;
            i10++;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <R> List<R> rs(boolean[] zArr, R r10, yh.q<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r10);
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Boolean.valueOf(zArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void rt(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        st(sArr, Random.f125033b);
    }

    @dl.d
    public static final <T> List<T> ru(@dl.d T[] tArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : kotlin.collections.m.t(kotlin.collections.m.M1(tArr, indices.D().intValue(), indices.e().intValue() + 1));
    }

    @dl.d
    public static final double[] rv(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.f0.o(dArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.l4(dArrCopyOf);
        return dArrCopyOf;
    }

    @dl.d
    public static final Set<Double> rw(@dl.d double[] dArr, @dl.d Iterable<Double> other) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Double> setZz = zz(dArr);
        x.E0(setZz, other);
        return setZz;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfInt")
    @sh.f
    private static final int rx(boolean[] zArr, yh.l<? super Boolean, Integer> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        int iIntValue = 0;
        for (boolean z10 : zArr) {
            iIntValue += selector.invoke(Boolean.valueOf(z10)).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final List<Float> ry(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iUe = Ue(fArr); -1 < iUe; iUe--) {
            if (!predicate.invoke(Float.valueOf(fArr[iUe])).booleanValue()) {
                return J9(fArr, iUe + 1);
            }
        }
        return hz(fArr);
    }

    @dl.d
    public static final List<Float> rz(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    @dl.d
    public static final <K, V> Map<K, V> s6(@dl.d int[] iArr, @dl.d yh.l<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(iArr.length), 16));
        for (int i10 : iArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Integer.valueOf(i10));
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V> Map<Double, V> s7(double[] dArr, yh.l<? super Double, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(dArr.length), 16));
        for (double d10 : dArr) {
            linkedHashMap.put(Double.valueOf(d10), valueSelector.invoke(Double.valueOf(d10)));
        }
        return linkedHashMap;
    }

    @sh.f
    private static final <T> T s8(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr[2];
    }

    @dl.d
    public static final List<Integer> s9(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return CollectionsKt___CollectionsKt.Q5(Bz(iArr));
    }

    @dl.d
    public static final <R> List<Pair<Character, R>> sA(@dl.d char[] cArr, @dl.d R[] other) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            char c10 = cArr[i10];
            arrayList.add(kotlin.c1.a(Character.valueOf(c10), other[i10]));
        }
        return arrayList;
    }

    @sh.f
    private static final double sa(double[] dArr, int i10, yh.l<? super Integer, Double> defaultValue) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Te(dArr)) ? defaultValue.invoke(Integer.valueOf(i10)).doubleValue() : dArr[i10];
    }

    @dl.d
    public static final List<Short> sb(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            }
        }
        return arrayList;
    }

    public static final <T> T sc(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedIterableTo")
    @sh.f
    private static final <R, C extends Collection<? super R>> C sd(boolean[] zArr, C destination, yh.p<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.n0(destination, transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final void se(@dl.d double[] dArr, @dl.d yh.l<? super Double, b2> action) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (double d10 : dArr) {
            action.invoke(Double.valueOf(d10));
        }
    }

    @dl.d
    public static final <K> Map<K, List<Byte>> sf(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Byte.valueOf(b10));
        }
        return linkedHashMap;
    }

    public static final <T> int sg(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(tArr[i10]).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @dl.e
    public static final Byte si(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C sj(@dl.d long[] jArr, @dl.d C destination, @dl.d yh.l<? super Long, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (long j10 : jArr) {
            destination.add(transform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R sk(float[] fArr, yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final byte sl(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            if (b10 < b11) {
                b10 = b11;
            }
        }
        return b10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T> double sm(T[] tArr, yh.l<? super T, Double> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R sn(int[] iArr, Comparator<? super R> comparator, yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean so(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return bArr.length == 0;
    }

    @kotlin.u0(version = "1.3")
    public static final float sp(@dl.d float[] fArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[random.m(fArr.length)];
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Integer sq(@dl.d int[] iArr, @dl.d yh.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            iIntValue = operation.invoke(Integer.valueOf(iNextInt), Integer.valueOf(iIntValue), Integer.valueOf(iArr[iNextInt])).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final void sr(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iSe = Se(cArr);
        k0 it = new fi.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            char c10 = cArr[iNextInt];
            cArr[iNextInt] = cArr[iSe];
            cArr[iSe] = c10;
            iSe--;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Byte> ss(byte[] bArr, yh.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        byte bByteValue = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(bByteValue));
        int length = bArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
            arrayList.add(Byte.valueOf(bByteValue));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void st(@dl.d short[] sArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        for (int iYe = Ye(sArr); iYe > 0; iYe--) {
            int iM = random.m(iYe + 1);
            short s10 = sArr[iYe];
            sArr[iYe] = sArr[iM];
            sArr[iM] = s10;
        }
    }

    @dl.d
    public static final <T> List<T> su(@dl.d T[] tArr, @dl.d Iterable<Integer> indices) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(tArr[it.next().intValue()]);
        }
        return arrayList;
    }

    @dl.d
    public static final float[] sv(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.f0.o(fArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.n4(fArrCopyOf);
        return fArrCopyOf;
    }

    @dl.d
    public static final Set<Float> sw(@dl.d float[] fArr, @dl.d Iterable<Float> other) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Float> setAz = Az(fArr);
        x.E0(setAz, other);
        return setAz;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfLong")
    @sh.f
    private static final long sx(byte[] bArr, yh.l<? super Byte, Long> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jLongValue = 0;
        for (byte b10 : bArr) {
            jLongValue += selector.invoke(Byte.valueOf(b10)).longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final List<Integer> sy(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iVe = Ve(iArr); -1 < iVe; iVe--) {
            if (!predicate.invoke(Integer.valueOf(iArr[iVe])).booleanValue()) {
                return K9(iArr, iVe + 1);
            }
        }
        return iz(iArr);
    }

    @dl.d
    public static final List<Integer> sz(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    @dl.d
    public static final <K, V> Map<K, V> t6(@dl.d long[] jArr, @dl.d yh.l<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(jArr.length), 16));
        for (long j10 : jArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Long.valueOf(j10));
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V> Map<Float, V> t7(float[] fArr, yh.l<? super Float, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(fArr.length), 16));
        for (float f10 : fArr) {
            linkedHashMap.put(Float.valueOf(f10), valueSelector.invoke(Float.valueOf(f10)));
        }
        return linkedHashMap;
    }

    @sh.f
    private static final short t8(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return sArr[2];
    }

    @dl.d
    public static final List<Long> t9(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return CollectionsKt___CollectionsKt.Q5(Cz(jArr));
    }

    @dl.d
    public static final <R, V> List<V> tA(@dl.d char[] cArr, @dl.d R[] other, @dl.d yh.p<? super Character, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @sh.f
    private static final float ta(float[] fArr, int i10, yh.l<? super Integer, Float> defaultValue) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Ue(fArr)) ? defaultValue.invoke(Integer.valueOf(i10)).floatValue() : fArr[i10];
    }

    @dl.d
    public static final List<Boolean> tb(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    public static final <T> T tc(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedSequence")
    @sh.f
    private static final <T, R> List<R> td(T[] tArr, yh.p<? super Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.o0(arrayList, transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final void te(@dl.d float[] fArr, @dl.d yh.l<? super Float, b2> action) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (float f10 : fArr) {
            action.invoke(Float.valueOf(f10));
        }
    }

    @dl.d
    public static final <K, V> Map<K, List<V>> tf(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends K> keySelector, @dl.d yh.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    public static final int tg(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Short.valueOf(sArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @dl.e
    public static final Byte ti(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            byte b10 = bArr[length];
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C tj(@dl.d T[] tArr, @dl.d C destination, @dl.d yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (T t10 : tArr) {
            destination.add(transform.invoke(t10));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R tk(int[] iArr, yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final char tl(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            if (kotlin.jvm.internal.f0.t(c10, c11) < 0) {
                c10 = c11;
            }
        }
        return c10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double tm(short[] sArr, yh.l<? super Short, Double> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R tn(long[] jArr, Comparator<? super R> comparator, yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean to(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.u0(version = "1.3")
    @sh.f
    private static final int tp(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return up(iArr, Random.f125033b);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Long tq(@dl.d long[] jArr, @dl.d yh.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jLongValue = operation.invoke(Integer.valueOf(iNextInt), Long.valueOf(jLongValue), Long.valueOf(jArr[iNextInt])).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @kotlin.u0(version = "1.4")
    public static final void tr(@dl.d char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.collections.b.Companion.d(i10, i11, cArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            char c10 = cArr[i10];
            cArr[i10] = cArr[i13];
            cArr[i13] = c10;
            i13--;
            i10++;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Character> ts(char[] cArr, yh.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        char cCharValue = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(cCharValue));
        int length = cArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            cCharValue = operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[i10])).charValue();
            arrayList.add(Character.valueOf(cCharValue));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void tt(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        ut(zArr, Random.f125033b);
    }

    @dl.d
    public static final List<Short> tu(@dl.d short[] sArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : kotlin.collections.m.u(kotlin.collections.m.N1(sArr, indices.D().intValue(), indices.e().intValue() + 1));
    }

    @dl.d
    public static final int[] tv(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.p4(iArrCopyOf);
        return iArrCopyOf;
    }

    @dl.d
    public static final Set<Integer> tw(@dl.d int[] iArr, @dl.d Iterable<Integer> other) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Integer> setBz = Bz(iArr);
        x.E0(setBz, other);
        return setBz;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfLong")
    @sh.f
    private static final long tx(char[] cArr, yh.l<? super Character, Long> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jLongValue = 0;
        for (char c10 : cArr) {
            jLongValue += selector.invoke(Character.valueOf(c10)).longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final List<Long> ty(@dl.d long[] jArr, @dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iWe = We(jArr); -1 < iWe; iWe--) {
            if (!predicate.invoke(Long.valueOf(jArr[iWe])).booleanValue()) {
                return L9(jArr, iWe + 1);
            }
        }
        return jz(jArr);
    }

    @dl.d
    public static final List<Long> tz(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T, K, V> Map<K, V> u6(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(tArr.length), 16));
        for (a.a.a.a.d.p.d.c.C0001c.a aVar : tArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(aVar);
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V> Map<Integer, V> u7(int[] iArr, yh.l<? super Integer, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(iArr.length), 16));
        for (int i10 : iArr) {
            linkedHashMap.put(Integer.valueOf(i10), valueSelector.invoke(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    @sh.f
    private static final boolean u8(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr[2];
    }

    @dl.d
    public static final <T> List<T> u9(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return CollectionsKt___CollectionsKt.Q5(Dz(tArr));
    }

    @dl.d
    public static final <R> List<Pair<Double, R>> uA(@dl.d double[] dArr, @dl.d Iterable<? extends R> other) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(kotlin.c1.a(Double.valueOf(dArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @sh.f
    private static final int ua(int[] iArr, int i10, yh.l<? super Integer, Integer> defaultValue) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Ve(iArr)) ? defaultValue.invoke(Integer.valueOf(i10)).intValue() : iArr[i10];
    }

    @dl.d
    public static final <T> List<T> ub(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return (List) vb(tArr, new ArrayList());
    }

    public static final short uc(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[0];
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "flatMapIndexedSequenceTo")
    @sh.f
    private static final <T, R, C extends Collection<? super R>> C ud(T[] tArr, C destination, yh.p<? super Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x.o0(destination, transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final void ue(@dl.d int[] iArr, @dl.d yh.l<? super Integer, b2> action) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (int i10 : iArr) {
            action.invoke(Integer.valueOf(i10));
        }
    }

    @dl.d
    public static final <K> Map<K, List<Character>> uf(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(c10));
        }
        return linkedHashMap;
    }

    public static final int ug(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Boolean.valueOf(zArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @dl.e
    public static final Character ui(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C uj(@dl.d short[] sArr, @dl.d C destination, @dl.d yh.l<? super Short, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (short s10 : sArr) {
            destination.add(transform.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R uk(long[] jArr, yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final double ul(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dMax = dArr[0];
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            dMax = Math.max(dMax, dArr[it.nextInt()]);
        }
        return dMax;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final double um(boolean[] zArr, yh.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R> R un(T[] tArr, Comparator<? super R> comparator, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean uo(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return cArr.length == 0;
    }

    @kotlin.u0(version = "1.3")
    public static final int up(@dl.d int[] iArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[random.m(iArr.length)];
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <S, T extends S> S uq(@dl.d T[] tArr, @dl.d yh.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (S) tArr[0];
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sInvoke = operation.invoke(Integer.valueOf(iNextInt), sInvoke, (Object) tArr[iNextInt]);
        }
        return sInvoke;
    }

    public static final void ur(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iTe = Te(dArr);
        k0 it = new fi.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            double d10 = dArr[iNextInt];
            dArr[iNextInt] = dArr[iTe];
            dArr[iTe] = d10;
            iTe--;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Double> us(double[] dArr, yh.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        double dDoubleValue = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(dDoubleValue));
        int length = dArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    @kotlin.u0(version = "1.4")
    public static final void ut(@dl.d boolean[] zArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        for (int iZe = Ze(zArr); iZe > 0; iZe--) {
            int iM = random.m(iZe + 1);
            boolean z10 = zArr[iZe];
            zArr[iZe] = zArr[iM];
            zArr[iM] = z10;
        }
    }

    @dl.d
    public static final List<Short> uu(@dl.d short[] sArr, @dl.d Iterable<Integer> indices) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @dl.d
    public static final long[] uv(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.r4(jArrCopyOf);
        return jArrCopyOf;
    }

    @dl.d
    public static final Set<Long> uw(@dl.d long[] jArr, @dl.d Iterable<Long> other) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Long> setCz = Cz(jArr);
        x.E0(setCz, other);
        return setCz;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfLong")
    @sh.f
    private static final long ux(double[] dArr, yh.l<? super Double, Long> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jLongValue = 0;
        for (double d10 : dArr) {
            jLongValue += selector.invoke(Double.valueOf(d10)).longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final <T> List<T> uy(@dl.d T[] tArr, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iXe = Xe(tArr); -1 < iXe; iXe--) {
            if (!predicate.invoke(tArr[iXe]).booleanValue()) {
                return M9(tArr, iXe + 1);
            }
        }
        return kz(tArr);
    }

    @dl.d
    public static final <T> List<T> uz(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return new ArrayList(CollectionsKt__CollectionsKt.s(tArr));
    }

    public static final boolean v5(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final <K, V> Map<K, V> v6(@dl.d short[] sArr, @dl.d yh.l<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(sArr.length), 16));
        for (short s10 : sArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Short.valueOf(s10));
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V> Map<Long, V> v7(long[] jArr, yh.l<? super Long, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(jArr.length), 16));
        for (long j10 : jArr) {
            linkedHashMap.put(Long.valueOf(j10), valueSelector.invoke(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    @sh.f
    private static final byte v8(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return bArr[3];
    }

    @dl.d
    public static final List<Short> v9(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return CollectionsKt___CollectionsKt.Q5(Ez(sArr));
    }

    @dl.d
    public static final <R, V> List<V> vA(@dl.d double[] dArr, @dl.d Iterable<? extends R> other, @dl.d yh.p<? super Double, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.Y(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Double.valueOf(dArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @sh.f
    private static final long va(long[] jArr, int i10, yh.l<? super Integer, Long> defaultValue) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > We(jArr)) ? defaultValue.invoke(Integer.valueOf(i10)).longValue() : jArr[i10];
    }

    @dl.d
    public static final <C extends Collection<? super T>, T> C vb(@dl.d T[] tArr, @dl.d C destination) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static final short vc(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return s10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    @kotlin.l0
    @xh.h(name = "flatMapSequence")
    public static final <T, R> List<R> vd(@dl.d T[] tArr, @dl.d yh.l<? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            x.o0(arrayList, transform.invoke(t10));
        }
        return arrayList;
    }

    public static final void ve(@dl.d long[] jArr, @dl.d yh.l<? super Long, b2> action) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (long j10 : jArr) {
            action.invoke(Long.valueOf(j10));
        }
    }

    @dl.d
    public static final <K, V> Map<K, List<V>> vf(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends K> keySelector, @dl.d yh.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    public static final int vg(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.e
    public static final Character vi(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char c10 = cArr[length];
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C vj(@dl.d boolean[] zArr, @dl.d C destination, @dl.d yh.l<? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (boolean z10 : zArr) {
            destination.add(transform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <T, R extends Comparable<? super R>> R vk(T[] tArr, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        k0 it = new fi.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final double vl(@dl.d Double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        k0 it = new fi.l(1, Xe(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, dArr[it.nextInt()].doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float vm(byte[] bArr, yh.l<? super Byte, Float> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R vn(short[] sArr, Comparator<? super R> comparator, yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean vo(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.u0(version = "1.3")
    @sh.f
    private static final long vp(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return wp(jArr, Random.f125033b);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final Short vq(@dl.d short[] sArr, @dl.d yh.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sShortValue = operation.invoke(Integer.valueOf(iNextInt), Short.valueOf(sShortValue), Short.valueOf(sArr[iNextInt])).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @kotlin.u0(version = "1.4")
    public static final void vr(@dl.d double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.collections.b.Companion.d(i10, i11, dArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            double d10 = dArr[i10];
            dArr[i10] = dArr[i13];
            dArr[i13] = d10;
            i13--;
            i10++;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Float> vs(float[] fArr, yh.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        float fFloatValue = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(fFloatValue));
        int length = fArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return arrayList;
    }

    public static final byte vt(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return bArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @dl.d
    public static final List<Boolean> vu(@dl.d boolean[] zArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.E() : kotlin.collections.m.v(kotlin.collections.m.O1(zArr, indices.D().intValue(), indices.e().intValue() + 1));
    }

    @dl.d
    public static final <T extends Comparable<? super T>> T[] vv(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        kotlin.collections.m.v4(tArr2);
        return tArr2;
    }

    @dl.d
    public static final <T> Set<T> vw(@dl.d T[] tArr, @dl.d Iterable<? extends T> other) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<T> setDz = Dz(tArr);
        x.E0(setDz, other);
        return setDz;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfLong")
    @sh.f
    private static final long vx(float[] fArr, yh.l<? super Float, Long> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jLongValue = 0;
        for (float f10 : fArr) {
            jLongValue += selector.invoke(Float.valueOf(f10)).longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final List<Short> vy(@dl.d short[] sArr, @dl.d yh.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iYe = Ye(sArr); -1 < iYe; iYe--) {
            if (!predicate.invoke(Short.valueOf(sArr[iYe])).booleanValue()) {
                return N9(sArr, iYe + 1);
            }
        }
        return lz(sArr);
    }

    @dl.d
    public static final List<Short> vz(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static final boolean w5(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final <K, V> Map<K, V> w6(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(zArr.length), 16));
        for (boolean z10 : zArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Boolean.valueOf(z10));
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <K, V> Map<K, V> w7(@dl.d K[] kArr, @dl.d yh.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(kArr, "<this>");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(kArr.length), 16));
        for (K k10 : kArr) {
            linkedHashMap.put(k10, valueSelector.invoke(k10));
        }
        return linkedHashMap;
    }

    @sh.f
    private static final char w8(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return cArr[3];
    }

    @dl.d
    public static final List<Boolean> w9(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return CollectionsKt___CollectionsKt.Q5(Fz(zArr));
    }

    @dl.d
    public static final List<Pair<Double, Double>> wA(@dl.d double[] dArr, @dl.d double[] other) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(kotlin.c1.a(Double.valueOf(dArr[i10]), Double.valueOf(other[i10])));
        }
        return arrayList;
    }

    @sh.f
    private static final <T> T wa(T[] tArr, int i10, yh.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Xe(tArr)) ? defaultValue.invoke(Integer.valueOf(i10)) : tArr[i10];
    }

    @dl.d
    public static final <C extends Collection<? super Byte>> C wb(@dl.d byte[] bArr, @dl.d C destination, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                destination.add(Byte.valueOf(b10));
            }
        }
        return destination;
    }

    public static final boolean wc(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[0];
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    @kotlin.l0
    @xh.h(name = "flatMapSequenceTo")
    public static final <T, R, C extends Collection<? super R>> C wd(@dl.d T[] tArr, @dl.d C destination, @dl.d yh.l<? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (T t10 : tArr) {
            x.o0(destination, transform.invoke(t10));
        }
        return destination;
    }

    public static final <T> void we(@dl.d T[] tArr, @dl.d yh.l<? super T, b2> action) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (T t10 : tArr) {
            action.invoke(t10);
        }
    }

    @dl.d
    public static final <K> Map<K, List<Double>> wf(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d10 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Double.valueOf(d10));
        }
        return linkedHashMap;
    }

    public static final int wg(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.e
    public static final Double wi(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Boolean wj(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int iZe = Ze(zArr);
        if (iZe == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        k0 it = new fi.l(1, iZe).iterator();
        while (it.hasNext()) {
            boolean z11 = zArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                z10 = z11;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R wk(short[] sArr, yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        k0 it = new fi.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final float wl(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fMax = fArr[0];
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            fMax = Math.max(fMax, fArr[it.nextInt()]);
        }
        return fMax;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float wm(char[] cArr, yh.l<? super Character, Float> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R wn(boolean[] zArr, Comparator<? super R> comparator, yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean wo(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr.length == 0;
    }

    @kotlin.u0(version = "1.3")
    public static final long wp(@dl.d long[] jArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[random.m(jArr.length)];
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Boolean wq(@dl.d boolean[] zArr, @dl.d yh.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[it.nextInt()])).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final void wr(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iUe = Ue(fArr);
        k0 it = new fi.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            float f10 = fArr[iNextInt];
            fArr[iNextInt] = fArr[iUe];
            fArr[iUe] = f10;
            iUe--;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Integer> ws(int[] iArr, yh.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        int iIntValue = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(iIntValue));
        int length = iArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    public static final byte wt(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Byte bValueOf = null;
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                bValueOf = Byte.valueOf(b10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.f0.n(bValueOf, "null cannot be cast to non-null type kotlin.Byte");
        return bValueOf.byteValue();
    }

    @dl.d
    public static final List<Boolean> wu(@dl.d boolean[] zArr, @dl.d Iterable<Integer> indices) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        int iY = t.Y(indices, 10);
        if (iY == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @dl.d
    public static final short[] wv(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.f0.o(sArrCopyOf, "copyOf(this, size)");
        kotlin.collections.m.x4(sArrCopyOf);
        return sArrCopyOf;
    }

    @dl.d
    public static final Set<Short> ww(@dl.d short[] sArr, @dl.d Iterable<Short> other) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Short> setEz = Ez(sArr);
        x.E0(setEz, other);
        return setEz;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfLong")
    @sh.f
    private static final long wx(int[] iArr, yh.l<? super Integer, Long> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jLongValue = 0;
        for (int i10 : iArr) {
            jLongValue += selector.invoke(Integer.valueOf(i10)).longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final List<Boolean> wy(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int iZe = Ze(zArr); -1 < iZe; iZe--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[iZe])).booleanValue()) {
                return O9(zArr, iZe + 1);
            }
        }
        return mz(zArr);
    }

    @dl.d
    public static final List<Boolean> wz(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static final boolean x5(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final <K> Map<K, Byte> x6(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(bArr.length), 16));
        for (byte b10 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b10)), Byte.valueOf(b10));
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V> Map<Short, V> x7(short[] sArr, yh.l<? super Short, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(sArr.length), 16));
        for (short s10 : sArr) {
            linkedHashMap.put(Short.valueOf(s10), valueSelector.invoke(Short.valueOf(s10)));
        }
        return linkedHashMap;
    }

    @sh.f
    private static final double x8(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr[3];
    }

    @dl.d
    public static final <K> List<Byte> x9(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends K> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (hashSet.add(selector.invoke(Byte.valueOf(b10)))) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <V> List<V> xA(@dl.d double[] dArr, @dl.d double[] other, @dl.d yh.p<? super Double, ? super Double, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i10]), Double.valueOf(other[i10])));
        }
        return arrayList;
    }

    @sh.f
    private static final short xa(short[] sArr, int i10, yh.l<? super Integer, Short> defaultValue) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Ye(sArr)) ? defaultValue.invoke(Integer.valueOf(i10)).shortValue() : sArr[i10];
    }

    @dl.d
    public static final <C extends Collection<? super Character>> C xb(@dl.d char[] cArr, @dl.d C destination, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                destination.add(Character.valueOf(c10));
            }
        }
        return destination;
    }

    public static final boolean xc(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return z10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C xd(@dl.d byte[] bArr, @dl.d C destination, @dl.d yh.l<? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (byte b10 : bArr) {
            x.n0(destination, transform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    public static final void xe(@dl.d short[] sArr, @dl.d yh.l<? super Short, b2> action) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (short s10 : sArr) {
            action.invoke(Short.valueOf(s10));
        }
    }

    @dl.d
    public static final <K, V> Map<K, List<V>> xf(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends K> keySelector, @dl.d yh.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d10 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Double.valueOf(d10)));
        }
        return linkedHashMap;
    }

    public static final int xg(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final String xh(@dl.d byte[] bArr, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Byte, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        String string = ((StringBuilder) fh(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.f0.o(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @dl.e
    public static final Double xi(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            double d10 = dArr[length];
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return Double.valueOf(d10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Byte xj(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int iRe = Re(bArr);
        if (iRe == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        k0 it = new fi.l(1, iRe).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                b10 = b11;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R extends Comparable<? super R>> R xk(boolean[] zArr, yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        k0 it = new fi.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final float xl(@dl.d Float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = fArr[0].floatValue();
        k0 it = new fi.l(1, Xe(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, fArr[it.nextInt()].floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float xm(double[] dArr, yh.l<? super Double, Float> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R xn(byte[] bArr, Comparator<? super R> comparator, yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean xo(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.u0(version = "1.3")
    @sh.f
    private static final <T> T xp(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return (T) yp(tArr, Random.f125033b);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Byte xq(@dl.d byte[] bArr, @dl.d yh.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[it.nextInt()])).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @kotlin.u0(version = "1.4")
    public static final void xr(@dl.d float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.collections.b.Companion.d(i10, i11, fArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            float f10 = fArr[i10];
            fArr[i10] = fArr[i13];
            fArr[i13] = f10;
            i13--;
            i10++;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Long> xs(long[] jArr, yh.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        long jLongValue = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(jLongValue));
        int length = jArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
            arrayList.add(Long.valueOf(jLongValue));
        }
        return arrayList;
    }

    public static final char xt(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @dl.d
    public static final byte[] xu(@dl.d byte[] bArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? new byte[0] : kotlin.collections.m.G1(bArr, indices.D().intValue(), indices.e().intValue() + 1);
    }

    @dl.d
    public static final byte[] xv(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.f0.o(bArrCopyOf, "copyOf(this, size)");
        Ru(bArrCopyOf);
        return bArrCopyOf;
    }

    @dl.d
    public static final Set<Boolean> xw(@dl.d boolean[] zArr, @dl.d Iterable<Boolean> other) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Set<Boolean> setFz = Fz(zArr);
        x.E0(setFz, other);
        return setFz;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfLong")
    @sh.f
    private static final long xx(long[] jArr, yh.l<? super Long, Long> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jLongValue = 0;
        for (long j10 : jArr) {
            jLongValue += selector.invoke(Long.valueOf(j10)).longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final List<Byte> xy(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    @dl.d
    public static final Set<Byte> xz(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return (Set) Jy(bArr, new LinkedHashSet(r0.j(bArr.length)));
    }

    public static final boolean y5(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final <K, V> Map<K, V> y6(@dl.d byte[] bArr, @dl.d yh.l<? super Byte, ? extends K> keySelector, @dl.d yh.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(bArr.length), 16));
        for (byte b10 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b10)), valueTransform.invoke(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V> Map<Boolean, V> y7(boolean[] zArr, yh.l<? super Boolean, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(zArr.length), 16));
        for (boolean z10 : zArr) {
            linkedHashMap.put(Boolean.valueOf(z10), valueSelector.invoke(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    @sh.f
    private static final float y8(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr[3];
    }

    @dl.d
    public static final <K> List<Character> y9(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends K> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (hashSet.add(selector.invoke(Character.valueOf(c10)))) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <R> List<Pair<Double, R>> yA(@dl.d double[] dArr, @dl.d R[] other) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            double d10 = dArr[i10];
            arrayList.add(kotlin.c1.a(Double.valueOf(d10), other[i10]));
        }
        return arrayList;
    }

    @sh.f
    private static final boolean ya(boolean[] zArr, int i10, yh.l<? super Integer, Boolean> defaultValue) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > Ze(zArr)) ? defaultValue.invoke(Integer.valueOf(i10)).booleanValue() : zArr[i10];
    }

    @dl.d
    public static final <C extends Collection<? super Double>> C yb(@dl.d double[] dArr, @dl.d C destination, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (double d10 : dArr) {
            if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                destination.add(Double.valueOf(d10));
            }
        }
        return destination;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c A[RETURN] */
    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.f
    private static final <T, R> R yc(T[] tArr, yh.l<? super T, ? extends R> transform) {
        R rInvoke;
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (T t10 : tArr) {
            rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                if (rInvoke != null) {
                    return rInvoke;
                }
                throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
            }
        }
        rInvoke = null;
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C yd(@dl.d char[] cArr, @dl.d C destination, @dl.d yh.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (char c10 : cArr) {
            x.n0(destination, transform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    public static final void ye(@dl.d boolean[] zArr, @dl.d yh.l<? super Boolean, b2> action) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        for (boolean z10 : zArr) {
            action.invoke(Boolean.valueOf(z10));
        }
    }

    @dl.d
    public static final <K> Map<K, List<Float>> yf(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f10 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f10));
        }
        return linkedHashMap;
    }

    public static final int yg(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final String yh(@dl.d char[] cArr, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Character, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        String string = ((StringBuilder) gh(cArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.f0.o(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @dl.e
    public static final Float yi(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Character yj(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int iSe = Se(cArr);
        if (iSe == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        k0 it = new fi.l(1, iSe).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                c10 = c11;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double yk(byte[] bArr, yh.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        k0 it = new fi.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final int yl(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            if (i10 < i11) {
                i10 = i11;
            }
        }
        return i10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float ym(float[] fArr, yh.l<? super Float, Float> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        k0 it = new fi.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R yn(char[] cArr, Comparator<? super R> comparator, yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean yo(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr.length == 0;
    }

    @kotlin.u0(version = "1.3")
    public static final <T> T yp(@dl.d T[] tArr, @dl.d Random random) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[random.m(tArr.length)];
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Character yq(@dl.d char[] cArr, @dl.d yh.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            cCharValue = operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[it.nextInt()])).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    public static final void yr(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iVe = Ve(iArr);
        k0 it = new fi.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            int i10 = iArr[iNextInt];
            iArr[iNextInt] = iArr[iVe];
            iArr[iVe] = i10;
            iVe--;
        }
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final <S, T extends S> List<S> ys(@dl.d T[] tArr, @dl.d yh.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sInvoke = operation.invoke(sInvoke, (Object) tArr[i10]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    public static final char yt(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                chValueOf = Character.valueOf(c10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.f0.n(chValueOf, "null cannot be cast to non-null type kotlin.Char");
        return chValueOf.charValue();
    }

    @dl.d
    public static final byte[] yu(@dl.d byte[] bArr, @dl.d Collection<Integer> indices) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        byte[] bArr2 = new byte[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr2[i10] = bArr[it.next().intValue()];
            i10++;
        }
        return bArr2;
    }

    @dl.d
    public static final char[] yv(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.f0.o(cArrCopyOf, "copyOf(this, size)");
        Tu(cArrCopyOf);
        return cArrCopyOf;
    }

    public static final double yw(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        double d10 = 0.0d;
        for (double d11 : dArr) {
            d10 += d11;
        }
        return d10;
    }

    @xh.h(name = "sumOfLong")
    public static final long yx(@dl.d Long[] lArr) {
        kotlin.jvm.internal.f0.p(lArr, "<this>");
        long jLongValue = 0;
        for (Long l10 : lArr) {
            jLongValue += l10.longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final List<Character> yy(@dl.d char[] cArr, @dl.d yh.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    @dl.d
    public static final Set<Character> yz(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return (Set) Ky(cArr, new LinkedHashSet(r0.j(fi.u.B(cArr.length, 128))));
    }

    public static final boolean z5(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final <K> Map<K, Character> z6(@dl.d char[] cArr, @dl.d yh.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(cArr.length), 16));
        for (char c10 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c10)), Character.valueOf(c10));
        }
        return linkedHashMap;
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final <V, M extends Map<? super Byte, ? super V>> M z7(byte[] bArr, M destination, yh.l<? super Byte, ? extends V> valueSelector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(valueSelector, "valueSelector");
        for (byte b10 : bArr) {
            destination.put(Byte.valueOf(b10), valueSelector.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    @sh.f
    private static final int z8(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr[3];
    }

    @dl.d
    public static final <K> List<Double> z9(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends K> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (hashSet.add(selector.invoke(Double.valueOf(d10)))) {
                arrayList.add(Double.valueOf(d10));
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <R, V> List<V> zA(@dl.d double[] dArr, @dl.d R[] other, @dl.d yh.p<? super Double, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @sh.f
    private static final Boolean za(boolean[] zArr, int i10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return jf(zArr, i10);
    }

    @dl.d
    public static final <C extends Collection<? super Float>> C zb(@dl.d float[] fArr, @dl.d C destination, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                destination.add(Float.valueOf(f10));
            }
        }
        return destination;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @sh.f
    private static final <T, R> R zc(T[] tArr, yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (T t10 : tArr) {
            R rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C zd(@dl.d double[] dArr, @dl.d C destination, @dl.d yh.l<? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        for (double d10 : dArr) {
            x.n0(destination, transform.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    public static final void ze(@dl.d byte[] bArr, @dl.d yh.p<? super Integer, ? super Byte, b2> action) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
    }

    @dl.d
    public static final <K, V> Map<K, List<V>> zf(@dl.d float[] fArr, @dl.d yh.l<? super Float, ? extends K> keySelector, @dl.d yh.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        kotlin.jvm.internal.f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f10 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Float.valueOf(f10)));
        }
        return linkedHashMap;
    }

    public static final int zg(@dl.d int[] iArr, @dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @dl.d
    public static final String zh(@dl.d double[] dArr, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super Double, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        String string = ((StringBuilder) hh(dArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.f0.o(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @dl.e
    public static final Float zi(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            float f10 = fArr[length];
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Double zj(@dl.d double[] dArr, @dl.d yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int iTe = Te(dArr);
        if (iTe == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        k0 it = new fi.l(1, iTe).iterator();
        while (it.hasNext()) {
            double d11 = dArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                d10 = d11;
            }
        }
        return Double.valueOf(d10);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final Double zk(char[] cArr, yh.l<? super Character, Double> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        k0 it = new fi.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final long zl(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        k0 it = new fi.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            if (j10 < j11) {
                j10 = j11;
            }
        }
        return j10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final float zm(int[] iArr, yh.l<? super Integer, Float> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        k0 it = new fi.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @sh.f
    private static final <R> R zn(double[] dArr, Comparator<? super R> comparator, yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean zo(@dl.d float[] fArr, @dl.d yh.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.u0(version = "1.3")
    @sh.f
    private static final short zp(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return Ap(sArr, Random.f125033b);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Double zq(@dl.d double[] dArr, @dl.d yh.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        k0 it = new fi.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[it.nextInt()])).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.u0(version = "1.4")
    public static final void zr(@dl.d int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.collections.b.Companion.d(i10, i11, iArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            int i14 = iArr[i10];
            iArr[i10] = iArr[i13];
            iArr[i13] = i14;
            i13--;
            i10++;
        }
    }

    @kotlin.u0(version = "1.4")
    @sh.f
    private static final List<Short> zs(short[] sArr, yh.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        short sShortValue = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(sShortValue));
        int length = sArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
            arrayList.add(Short.valueOf(sShortValue));
        }
        return arrayList;
    }

    public static final double zt(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return dArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @dl.d
    public static final char[] zu(@dl.d char[] cArr, @dl.d fi.l indices) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(indices, "indices");
        return indices.isEmpty() ? new char[0] : kotlin.collections.m.H1(cArr, indices.D().intValue(), indices.e().intValue() + 1);
    }

    @dl.d
    public static final double[] zv(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.f0.o(dArrCopyOf, "copyOf(this, size)");
        Vu(dArrCopyOf);
        return dArrCopyOf;
    }

    public static final float zw(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        return f10;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfLong")
    @sh.f
    private static final <T> long zx(T[] tArr, yh.l<? super T, Long> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        long jLongValue = 0;
        for (T t10 : tArr) {
            jLongValue += selector.invoke(t10).longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final List<Double> zy(@dl.d double[] dArr, @dl.d yh.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    @dl.d
    public static final Set<Double> zz(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return (Set) Ly(dArr, new LinkedHashSet(r0.j(dArr.length)));
    }
}
