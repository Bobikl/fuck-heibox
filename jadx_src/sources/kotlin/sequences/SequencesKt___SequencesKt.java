package kotlin.sequences;

import java.io.IOException;
import java.util.ArrayList;
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
import kotlin.c1;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.collections.d0;
import kotlin.collections.d1;
import kotlin.collections.h0;
import kotlin.e2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.l0;
import kotlin.n1;
import kotlin.r1;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public class SequencesKt___SequencesKt extends SequencesKt___SequencesJvmKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.kt */
    public static final class a<T> implements Iterable<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f128363b;

        public a(m mVar) {
            this.f128363b = mVar;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<T> iterator() {
            return this.f128363b.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public static final class b<K, T> implements d0<T, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m<T> f128364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<T, K> f128365b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(m<? extends T> mVar, yh.l<? super T, ? extends K> lVar) {
            this.f128364a = mVar;
            this.f128365b = lVar;
        }

        @Override // kotlin.collections.d0
        public K a(T t10) {
            return this.f128365b.invoke(t10);
        }

        @Override // kotlin.collections.d0
        @dl.d
        public Iterator<T> b() {
            return this.f128364a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public static final class c<T> implements m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m<T> f128366a;

        /* JADX WARN: Multi-variable type inference failed */
        c(m<? extends T> mVar) {
            this.f128366a = mVar;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<T> iterator() {
            List listD3 = SequencesKt___SequencesKt.d3(this.f128366a);
            kotlin.collections.w.j0(listD3);
            return listD3.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public static final class d<T> implements m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m<T> f128367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super T> f128368b;

        /* JADX WARN: Multi-variable type inference failed */
        d(m<? extends T> mVar, Comparator<? super T> comparator) {
            this.f128367a = mVar;
            this.f128368b = comparator;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<T> iterator() {
            List listD3 = SequencesKt___SequencesKt.d3(this.f128367a);
            kotlin.collections.w.m0(listD3, this.f128368b);
            return listD3.iterator();
        }
    }

    @sh.f
    private static final <T> T A0(m<? extends T> mVar, yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        T t10 = null;
        for (T t11 : mVar) {
            if (predicate.invoke(t11).booleanValue()) {
                t10 = t11;
            }
        }
        return t10;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T, R> R A1(m<? extends T> mVar, Comparator<? super R> comparator, yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final <T, R> m<R> A2(@dl.d m<? extends T> mVar, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        f0.p(mVar, "<this>");
        f0.p(operation, "operation");
        return w2(mVar, r10, operation);
    }

    public static final <T> T B0(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T, R> R B1(m<? extends T> mVar, Comparator<? super R> comparator, yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final <T, R> m<R> B2(@dl.d m<? extends T> mVar, R r10, @dl.d yh.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        f0.p(mVar, "<this>");
        f0.p(operation, "operation");
        return x2(mVar, r10, operation);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T C0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        for (T t10 : mVar) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @u0(version = "1.4")
    @dl.e
    public static final <T extends Comparable<? super T>> T C1(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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

    public static final <T> T C2(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return next;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    @u0(version = s0.f136928s)
    @sh.f
    private static final <T, R> R D0(m<? extends T> mVar, yh.l<? super T, ? extends R> transform) {
        R rInvoke;
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                if (rInvoke != null) {
                    return rInvoke;
                }
                throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
            }
        }
        rInvoke = null;
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @u0(version = "1.4")
    @dl.e
    public static final Double D1(@dl.d m<Double> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final <T> T D2(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : mVar) {
            if (predicate.invoke(t11).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @u0(version = s0.f136928s)
    @sh.f
    private static final <T, R> R E0(m<? extends T> mVar, yh.l<? super T, ? extends R> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @u0(version = "1.4")
    @dl.e
    public static final Float E1(@dl.d m<Float> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @dl.e
    public static final <T> T E2(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @dl.e
    public static final <T> T F0(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final double F1(@dl.d m<Double> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @dl.e
    public static final <T> T F2(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        boolean z10 = false;
        T t10 = null;
        for (T t11 : mVar) {
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

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @dl.e
    public static final <T> T G0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        for (T t10 : mVar) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final float G1(@dl.d m<Float> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @dl.d
    public static final <T extends Comparable<? super T>> m<T> G2(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return new c(mVar);
    }

    @dl.d
    public static final <T, R> m<R> H0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends m<? extends R>> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        return new i(mVar, transform, SequencesKt___SequencesKt$flatMap$2.f128376d);
    }

    @u0(version = s0.f136932w)
    @dl.d
    @xh.h(name = "maxOrThrow")
    public static final <T extends Comparable<? super T>> T H1(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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

    @dl.d
    public static final <T, R extends Comparable<? super R>> m<T> H2(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        return K2(mVar, new kotlin.comparisons.g.a(selector));
    }

    @u0(version = "1.4")
    @dl.d
    @l0
    @xh.h(name = "flatMapIndexedIterable")
    public static final <T, R> m<R> I0(@dl.d m<? extends T> mVar, @dl.d yh.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        return SequencesKt__SequencesKt.h(mVar, transform, SequencesKt___SequencesKt$flatMapIndexed$1.f128377d);
    }

    @u0(version = "1.4")
    @dl.e
    public static final <T> T I1(@dl.d m<? extends T> mVar, @dl.d Comparator<? super T> comparator) {
        f0.p(mVar, "<this>");
        f0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
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

    @dl.d
    public static final <T, R extends Comparable<? super R>> m<T> I2(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        return K2(mVar, new kotlin.comparisons.g.c(selector));
    }

    @u0(version = "1.4")
    @l0
    @xh.h(name = "flatMapIndexedIterableTo")
    @sh.f
    private static final <T, R, C extends Collection<? super R>> C J0(m<? extends T> mVar, C destination, yh.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int i10 = 0;
        for (T t10 : mVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            kotlin.collections.x.n0(destination, transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    public static final <T> T J1(@dl.d m<? extends T> mVar, @dl.d Comparator<? super T> comparator) {
        f0.p(mVar, "<this>");
        f0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
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

    @dl.d
    public static final <T extends Comparable<? super T>> m<T> J2(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return K2(mVar, kotlin.comparisons.g.x());
    }

    public static final <T> boolean K(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @u0(version = "1.4")
    @dl.d
    @l0
    @xh.h(name = "flatMapIndexedSequence")
    public static final <T, R> m<R> K0(@dl.d m<? extends T> mVar, @dl.d yh.p<? super Integer, ? super T, ? extends m<? extends R>> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        return SequencesKt__SequencesKt.h(mVar, transform, SequencesKt___SequencesKt$flatMapIndexed$2.f128378d);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @u0(version = "1.4")
    @dl.e
    public static final <T, R extends Comparable<? super R>> T K1(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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
    public static final <T> m<T> K2(@dl.d m<? extends T> mVar, @dl.d Comparator<? super T> comparator) {
        f0.p(mVar, "<this>");
        f0.p(comparator, "comparator");
        return new d(mVar, comparator);
    }

    public static final <T> boolean L(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return mVar.iterator().hasNext();
    }

    @u0(version = "1.4")
    @l0
    @xh.h(name = "flatMapIndexedSequenceTo")
    @sh.f
    private static final <T, R, C extends Collection<? super R>> C L0(m<? extends T> mVar, C destination, yh.p<? super Integer, ? super T, ? extends m<? extends R>> transform) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int i10 = 0;
        for (T t10 : mVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            kotlin.collections.x.o0(destination, transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @u0(version = s0.f136932w)
    @xh.h(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T L1(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = s0.f136928s)
    public static final <T> int L2(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Integer> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += selector.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    public static final <T> boolean M(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @u0(version = "1.4")
    @dl.d
    @l0
    @xh.h(name = "flatMapIterable")
    public static final <T, R> m<R> M0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends Iterable<? extends R>> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        return new i(mVar, transform, SequencesKt___SequencesKt$flatMap$1.f128375d);
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T> double M1(m<? extends T> mVar, yh.l<? super T, Double> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = s0.f136928s)
    public static final <T> double M2(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Double> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += selector.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final <T> Iterable<T> N(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return new a(mVar);
    }

    @u0(version = "1.4")
    @dl.d
    @l0
    @xh.h(name = "flatMapIterableTo")
    public static final <T, R, C extends Collection<? super R>> C N0(@dl.d m<? extends T> mVar, @dl.d C destination, @dl.d yh.l<? super T, ? extends Iterable<? extends R>> transform) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            kotlin.collections.x.n0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T> float N1(m<? extends T> mVar, yh.l<? super T, Float> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    @xh.h(name = "sumOfByte")
    public static final int N2(@dl.d m<Byte> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Byte> it = mVar.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @sh.f
    private static final <T> m<T> O(m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return mVar;
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C O0(@dl.d m<? extends T> mVar, @dl.d C destination, @dl.d yh.l<? super T, ? extends m<? extends R>> transform) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            kotlin.collections.x.o0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T, R extends Comparable<? super R>> R O1(m<? extends T> mVar, yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @xh.h(name = "sumOfDouble")
    public static final double O2(@dl.d m<Double> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final <T, K, V> Map<K, V> P(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(it.next());
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    public static final <T, R> R P0(@dl.d m<? extends T> mVar, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        f0.p(mVar, "<this>");
        f0.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            r10 = operation.invoke(r10, it.next());
        }
        return r10;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T, R extends Comparable<? super R>> R P1(m<? extends T> mVar, yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @u0(version = "1.4")
    @l0
    @xh.h(name = "sumOfDouble")
    @sh.f
    private static final <T> double P2(m<? extends T> mVar, yh.l<? super T, Double> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += selector.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final <T, K> Map<K, T> Q(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends K> keySelector) {
        f0.p(mVar, "<this>");
        f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : mVar) {
            linkedHashMap.put(keySelector.invoke(t10), t10);
        }
        return linkedHashMap;
    }

    public static final <T, R> R Q0(@dl.d m<? extends T> mVar, R r10, @dl.d yh.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        f0.p(mVar, "<this>");
        f0.p(operation, "operation");
        int i10 = 0;
        for (T t10 : mVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            r10 = operation.invoke(Integer.valueOf(i10), r10, t10);
            i10 = i11;
        }
        return r10;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T> Double Q1(m<? extends T> mVar, yh.l<? super T, Double> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @xh.h(name = "sumOfFloat")
    public static final float Q2(@dl.d m<Float> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    @dl.d
    public static final <T, K, V> Map<K, V> R(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends K> keySelector, @dl.d yh.l<? super T, ? extends V> valueTransform) {
        f0.p(mVar, "<this>");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : mVar) {
            linkedHashMap.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    public static final <T> void R0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, b2> action) {
        f0.p(mVar, "<this>");
        f0.p(action, "action");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T> Float R1(m<? extends T> mVar, yh.l<? super T, Float> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @xh.h(name = "sumOfInt")
    public static final int R2(@dl.d m<Integer> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Integer> it = mVar.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final <T, K, M extends Map<? super K, ? super T>> M S(@dl.d m<? extends T> mVar, @dl.d M destination, @dl.d yh.l<? super T, ? extends K> keySelector) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        for (T t10 : mVar) {
            destination.put(keySelector.invoke(t10), t10);
        }
        return destination;
    }

    public static final <T> void S0(@dl.d m<? extends T> mVar, @dl.d yh.p<? super Integer, ? super T, b2> action) {
        f0.p(mVar, "<this>");
        f0.p(action, "action");
        int i10 = 0;
        for (T t10 : mVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            action.invoke(Integer.valueOf(i10), t10);
            i10 = i11;
        }
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T, R> R S1(m<? extends T> mVar, Comparator<? super R> comparator, yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @u0(version = "1.4")
    @l0
    @xh.h(name = "sumOfInt")
    @sh.f
    private static final <T> int S2(m<? extends T> mVar, yh.l<? super T, Integer> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += selector.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M T(@dl.d m<? extends T> mVar, @dl.d M destination, @dl.d yh.l<? super T, ? extends K> keySelector, @dl.d yh.l<? super T, ? extends V> valueTransform) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        for (T t10 : mVar) {
            destination.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return destination;
    }

    @dl.d
    public static final <T, K> Map<K, List<T>> T0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends K> keySelector) {
        f0.p(mVar, "<this>");
        f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : mVar) {
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

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T, R> R T1(m<? extends T> mVar, Comparator<? super R> comparator, yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @xh.h(name = "sumOfLong")
    public static final long T2(@dl.d m<Long> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Long> it = mVar.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    @dl.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M U(@dl.d m<? extends T> mVar, @dl.d M destination, @dl.d yh.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(it.next());
            destination.put(pairInvoke.e(), pairInvoke.f());
        }
        return destination;
    }

    @dl.d
    public static final <T, K, V> Map<K, List<V>> U0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends K> keySelector, @dl.d yh.l<? super T, ? extends V> valueTransform) {
        f0.p(mVar, "<this>");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : mVar) {
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

    @u0(version = "1.4")
    @dl.e
    public static final <T extends Comparable<? super T>> T U1(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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

    @u0(version = "1.4")
    @l0
    @xh.h(name = "sumOfLong")
    @sh.f
    private static final <T> long U2(m<? extends T> mVar, yh.l<? super T, Long> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += selector.invoke(it.next()).longValue();
        }
        return jLongValue;
    }

    @u0(version = "1.3")
    @dl.d
    public static final <K, V> Map<K, V> V(@dl.d m<? extends K> mVar, @dl.d yh.l<? super K, ? extends V> valueSelector) {
        f0.p(mVar, "<this>");
        f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k10 : mVar) {
            linkedHashMap.put(k10, valueSelector.invoke(k10));
        }
        return linkedHashMap;
    }

    @dl.d
    public static final <T, K, M extends Map<? super K, List<T>>> M V0(@dl.d m<? extends T> mVar, @dl.d M destination, @dl.d yh.l<? super T, ? extends K> keySelector) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        for (T t10 : mVar) {
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

    @u0(version = "1.4")
    @dl.e
    public static final Double V1(@dl.d m<Double> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @xh.h(name = "sumOfShort")
    public static final int V2(@dl.d m<Short> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Short> it = mVar.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    @u0(version = "1.3")
    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M W(@dl.d m<? extends K> mVar, @dl.d M destination, @dl.d yh.l<? super K, ? extends V> valueSelector) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(valueSelector, "valueSelector");
        for (K k10 : mVar) {
            destination.put(k10, valueSelector.invoke(k10));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T, K, V, M extends Map<? super K, List<V>>> M W0(@dl.d m<? extends T> mVar, @dl.d M destination, @dl.d yh.l<? super T, ? extends K> keySelector, @dl.d yh.l<? super T, ? extends V> valueTransform) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        for (T t10 : mVar) {
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

    @u0(version = "1.4")
    @dl.e
    public static final Float W1(@dl.d m<Float> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @l0
    @xh.h(name = "sumOfUInt")
    @sh.f
    private static final <T> int W2(m<? extends T> mVar, yh.l<? super T, n1> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        int iH = n1.h(0);
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            iH = n1.h(iH + selector.invoke(it.next()).q0());
        }
        return iH;
    }

    @xh.h(name = "averageOfByte")
    public static final double X(@dl.d m<Byte> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Byte> it = mVar.iterator();
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

    @u0(version = "1.1")
    @dl.d
    public static final <T, K> d0<T, K> X0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends K> keySelector) {
        f0.p(mVar, "<this>");
        f0.p(keySelector, "keySelector");
        return new b(mVar, keySelector);
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final double X1(@dl.d m<Double> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @l0
    @xh.h(name = "sumOfULong")
    @sh.f
    private static final <T> long X2(m<? extends T> mVar, yh.l<? super T, r1> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        long jH = r1.h(0L);
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            jH = r1.h(jH + selector.invoke(it.next()).q0());
        }
        return jH;
    }

    @xh.h(name = "averageOfDouble")
    public static final double Y(@dl.d m<Double> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
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

    public static final <T> int Y0(@dl.d m<? extends T> mVar, T t10) {
        f0.p(mVar, "<this>");
        int i10 = 0;
        for (T t11 : mVar) {
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            if (f0.g(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final float Y1(@dl.d m<Float> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
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
    public static final <T> m<T> Y2(@dl.d m<? extends T> mVar, int i10) {
        f0.p(mVar, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return SequencesKt__SequencesKt.g();
            }
            return mVar instanceof e ? ((e) mVar).b(i10) : new t(mVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @xh.h(name = "averageOfFloat")
    public static final double Z(@dl.d m<Float> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
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

    public static final <T> int Z0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        int i10 = 0;
        for (T t10 : mVar) {
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

    @u0(version = s0.f136932w)
    @dl.d
    @xh.h(name = "minOrThrow")
    public static final <T extends Comparable<? super T>> T Z1(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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
    public static final <T> m<T> Z2(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        return new u(mVar, predicate);
    }

    @xh.h(name = "averageOfInt")
    public static final double a0(@dl.d m<Integer> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Integer> it = mVar.iterator();
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

    public static final <T> int a1(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        int i10 = -1;
        int i11 = 0;
        for (T t10 : mVar) {
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

    @u0(version = "1.4")
    @dl.e
    public static final <T> T a2(@dl.d m<? extends T> mVar, @dl.d Comparator<? super T> comparator) {
        f0.p(mVar, "<this>");
        f0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
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

    @dl.d
    public static final <T, C extends Collection<? super T>> C a3(@dl.d m<? extends T> mVar, @dl.d C destination) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @xh.h(name = "averageOfLong")
    public static final double b0(@dl.d m<Long> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Long> it = mVar.iterator();
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

    @dl.d
    public static final <T, A extends Appendable> A b1(@dl.d m<? extends T> mVar, @dl.d A buffer, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super T, ? extends CharSequence> lVar) throws IOException {
        f0.p(mVar, "<this>");
        f0.p(buffer, "buffer");
        f0.p(separator, "separator");
        f0.p(prefix, "prefix");
        f0.p(postfix, "postfix");
        f0.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : mVar) {
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

    @u0(version = s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    public static final <T> T b2(@dl.d m<? extends T> mVar, @dl.d Comparator<? super T> comparator) {
        f0.p(mVar, "<this>");
        f0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
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

    @dl.d
    public static final <T> HashSet<T> b3(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return (HashSet) a3(mVar, new HashSet());
    }

    @xh.h(name = "averageOfShort")
    public static final double c0(@dl.d m<Short> mVar) {
        f0.p(mVar, "<this>");
        Iterator<Short> it = mVar.iterator();
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
    public static final <T> m<T> c2(@dl.d final m<? extends T> mVar, @dl.d final Iterable<? extends T> elements) {
        f0.p(mVar, "<this>");
        f0.p(elements, "elements");
        return new m<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$3
            @Override // kotlin.sequences.m
            @dl.d
            public Iterator<T> iterator() {
                final Collection collectionQ0 = kotlin.collections.x.q0(elements);
                return collectionQ0.isEmpty() ? mVar.iterator() : SequencesKt___SequencesKt.u0(mVar, new yh.l<T, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$3$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(T t10) {
                        return Boolean.valueOf(collectionQ0.contains(t10));
                    }
                }).iterator();
            }
        };
    }

    @dl.d
    public static final <T> List<T> c3(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return CollectionsKt__CollectionsKt.Q(d3(mVar));
    }

    @u0(version = "1.2")
    @dl.d
    public static final <T> m<List<T>> d0(@dl.d m<? extends T> mVar, int i10) {
        f0.p(mVar, "<this>");
        return g3(mVar, i10, i10, true);
    }

    @dl.d
    public static final <T> String d1(@dl.d m<? extends T> mVar, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super T, ? extends CharSequence> lVar) {
        f0.p(mVar, "<this>");
        f0.p(separator, "separator");
        f0.p(prefix, "prefix");
        f0.p(postfix, "postfix");
        f0.p(truncated, "truncated");
        String string = ((StringBuilder) b1(mVar, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        f0.o(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @dl.d
    public static final <T> m<T> d2(@dl.d final m<? extends T> mVar, final T t10) {
        f0.p(mVar, "<this>");
        return new m<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$1
            @Override // kotlin.sequences.m
            @dl.d
            public Iterator<T> iterator() {
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                m<T> mVar2 = mVar;
                final T t11 = t10;
                return SequencesKt___SequencesKt.p0(mVar2, new yh.l<T, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$1$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(T t12) {
                        boolean z10 = true;
                        if (!booleanRef.f124884b && f0.g(t12, t11)) {
                            booleanRef.f124884b = true;
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                }).iterator();
            }
        };
    }

    @dl.d
    public static final <T> List<T> d3(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return (List) a3(mVar, new ArrayList());
    }

    @u0(version = "1.2")
    @dl.d
    public static final <T, R> m<R> e0(@dl.d m<? extends T> mVar, int i10, @dl.d yh.l<? super List<? extends T>, ? extends R> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        return h3(mVar, i10, i10, true, transform);
    }

    public static /* synthetic */ String e1(m mVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        return d1(mVar, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.d
    public static final <T> m<T> e2(@dl.d final m<? extends T> mVar, @dl.d final m<? extends T> elements) {
        f0.p(mVar, "<this>");
        f0.p(elements, "elements");
        return new m<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$4
            @Override // kotlin.sequences.m
            @dl.d
            public Iterator<T> iterator() {
                final List listC3 = SequencesKt___SequencesKt.c3(elements);
                return listC3.isEmpty() ? mVar.iterator() : SequencesKt___SequencesKt.u0(mVar, new yh.l<T, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$4$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(T t10) {
                        return Boolean.valueOf(listC3.contains(t10));
                    }
                }).iterator();
            }
        };
    }

    @dl.d
    public static final <T> Set<T> e3(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final <T> boolean f0(@dl.d m<? extends T> mVar, T t10) {
        f0.p(mVar, "<this>");
        return Y0(mVar, t10) >= 0;
    }

    public static final <T> T f1(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T> m<T> f2(@dl.d final m<? extends T> mVar, @dl.d final T[] elements) {
        f0.p(mVar, "<this>");
        f0.p(elements, "elements");
        return elements.length == 0 ? mVar : new m<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$2
            @Override // kotlin.sequences.m
            @dl.d
            public Iterator<T> iterator() {
                m<T> mVar2 = mVar;
                final T[] tArr = elements;
                return SequencesKt___SequencesKt.u0(mVar2, new yh.l<T, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$2$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(T t10) {
                        return Boolean.valueOf(ArraysKt___ArraysKt.T8(tArr, t10));
                    }
                }).iterator();
            }
        };
    }

    @dl.d
    public static final <T> Set<T> f3(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return d1.r((Set) a3(mVar, new LinkedHashSet()));
    }

    public static final <T> int g0(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.V();
            }
        }
        return i10;
    }

    public static final <T> T g1(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : mVar) {
            if (predicate.invoke(t11).booleanValue()) {
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @sh.f
    private static final <T> m<T> g2(m<? extends T> mVar, T t10) {
        f0.p(mVar, "<this>");
        return d2(mVar, t10);
    }

    @u0(version = "1.2")
    @dl.d
    public static final <T> m<List<T>> g3(@dl.d m<? extends T> mVar, int i10, int i11, boolean z10) {
        f0.p(mVar, "<this>");
        return SlidingWindowKt.c(mVar, i10, i11, z10, false);
    }

    public static final <T> int h0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue() && (i10 = i10 + 1) < 0) {
                CollectionsKt__CollectionsKt.V();
            }
        }
        return i10;
    }

    public static final <T> int h1(@dl.d m<? extends T> mVar, T t10) {
        f0.p(mVar, "<this>");
        int i10 = -1;
        int i11 = 0;
        for (T t11 : mVar) {
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            if (f0.g(t10, t11)) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    public static final <T> boolean h2(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return !mVar.iterator().hasNext();
    }

    @u0(version = "1.2")
    @dl.d
    public static final <T, R> m<R> h3(@dl.d m<? extends T> mVar, int i10, int i11, boolean z10, @dl.d yh.l<? super List<? extends T>, ? extends R> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        return k1(SlidingWindowKt.c(mVar, i10, i11, z10, true), transform);
    }

    @dl.d
    public static final <T> m<T> i0(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return j0(mVar, new yh.l<T, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$distinct$1
            @Override // yh.l
            public final T invoke(T t10) {
                return t10;
            }
        });
    }

    @dl.e
    public static final <T> T i1(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> boolean i2(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ m i3(m mVar, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return g3(mVar, i10, i11, z10);
    }

    @dl.d
    public static final <T, K> m<T> j0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends K> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        return new kotlin.sequences.c(mVar, selector);
    }

    @dl.e
    public static final <T> T j1(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        T t10 = null;
        for (T t11 : mVar) {
            if (predicate.invoke(t11).booleanValue()) {
                t10 = t11;
            }
        }
        return t10;
    }

    @u0(version = "1.1")
    @dl.d
    public static final <T> m<T> j2(@dl.d m<? extends T> mVar, @dl.d final yh.l<? super T, b2> action) {
        f0.p(mVar, "<this>");
        f0.p(action, "action");
        return k1(mVar, new yh.l<T, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$onEach$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            public final T invoke(T t10) {
                action.invoke(t10);
                return t10;
            }
        });
    }

    public static /* synthetic */ m j3(m mVar, int i10, int i11, boolean z10, yh.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return h3(mVar, i10, i11, z10, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T> m<T> k0(@dl.d m<? extends T> mVar, int i10) {
        f0.p(mVar, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return mVar;
            }
            return mVar instanceof e ? ((e) mVar).a(i10) : new kotlin.sequences.d(mVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <T, R> m<R> k1(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends R> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        return new w(mVar, transform);
    }

    @u0(version = "1.4")
    @dl.d
    public static final <T> m<T> k2(@dl.d m<? extends T> mVar, @dl.d final yh.p<? super Integer, ? super T, b2> action) {
        f0.p(mVar, "<this>");
        f0.p(action, "action");
        return l1(mVar, new yh.p<Integer, T, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$onEachIndexed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final T a(int i10, T t10) {
                action.invoke(Integer.valueOf(i10), t10);
                return t10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Object obj) {
                return a(num.intValue(), obj);
            }
        });
    }

    @dl.d
    public static final <T> m<h0<T>> k3(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return new k(mVar);
    }

    @dl.d
    public static final <T> m<T> l0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        return new f(mVar, predicate);
    }

    @dl.d
    public static final <T, R> m<R> l1(@dl.d m<? extends T> mVar, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        return new v(mVar, transform);
    }

    @dl.d
    public static final <T> Pair<List<T>, List<T>> l2(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : mVar) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            } else {
                arrayList2.add(t10);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @dl.d
    public static final <T, R> m<Pair<T, R>> l3(@dl.d m<? extends T> mVar, @dl.d m<? extends R> other) {
        f0.p(mVar, "<this>");
        f0.p(other, "other");
        return new l(mVar, other, new yh.p<T, R, Pair<? extends T, ? extends R>>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$zip$1
            @Override // yh.p
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pair<T, R> invoke(T t10, R r10) {
                return c1.a(t10, r10);
            }
        });
    }

    public static final <T> T m0(@dl.d m<? extends T> mVar, final int i10) {
        f0.p(mVar, "<this>");
        return (T) n0(mVar, i10, new yh.l<Integer, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final T a(int i11) {
                throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i10 + lg.a.f131414g);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        });
    }

    @dl.d
    public static final <T, R> m<R> m1(@dl.d m<? extends T> mVar, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        return v0(new v(mVar, transform));
    }

    @dl.d
    public static final <T> m<T> m2(@dl.d m<? extends T> mVar, @dl.d Iterable<? extends T> elements) {
        f0.p(mVar, "<this>");
        f0.p(elements, "elements");
        return SequencesKt__SequencesKt.i(SequencesKt__SequencesKt.q(mVar, CollectionsKt___CollectionsKt.v1(elements)));
    }

    @dl.d
    public static final <T, R, V> m<V> m3(@dl.d m<? extends T> mVar, @dl.d m<? extends R> other, @dl.d yh.p<? super T, ? super R, ? extends V> transform) {
        f0.p(mVar, "<this>");
        f0.p(other, "other");
        f0.p(transform, "transform");
        return new l(mVar, other, transform);
    }

    public static final <T> T n0(@dl.d m<? extends T> mVar, int i10, @dl.d yh.l<? super Integer, ? extends T> defaultValue) {
        f0.p(mVar, "<this>");
        f0.p(defaultValue, "defaultValue");
        if (i10 < 0) {
            return defaultValue.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (T t10 : mVar) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return defaultValue.invoke(Integer.valueOf(i10));
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C n1(@dl.d m<? extends T> mVar, @dl.d C destination, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int i10 = 0;
        for (T t10 : mVar) {
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
    public static final <T> m<T> n2(@dl.d m<? extends T> mVar, T t10) {
        f0.p(mVar, "<this>");
        return SequencesKt__SequencesKt.i(SequencesKt__SequencesKt.q(mVar, SequencesKt__SequencesKt.q(t10)));
    }

    @u0(version = "1.2")
    @dl.d
    public static final <T> m<Pair<T, T>> n3(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return o3(mVar, new yh.p<T, T, Pair<? extends T, ? extends T>>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$1
            @Override // yh.p
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pair<T, T> invoke(T t10, T t11) {
                return c1.a(t10, t11);
            }
        });
    }

    @dl.e
    public static final <T> T o0(@dl.d m<? extends T> mVar, int i10) {
        f0.p(mVar, "<this>");
        if (i10 < 0) {
            return null;
        }
        int i11 = 0;
        for (T t10 : mVar) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return null;
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C o1(@dl.d m<? extends T> mVar, @dl.d C destination, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int i10 = 0;
        for (T t10 : mVar) {
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
    public static final <T> m<T> o2(@dl.d m<? extends T> mVar, @dl.d m<? extends T> elements) {
        f0.p(mVar, "<this>");
        f0.p(elements, "elements");
        return SequencesKt__SequencesKt.i(SequencesKt__SequencesKt.q(mVar, elements));
    }

    @u0(version = "1.2")
    @dl.d
    public static final <T, R> m<R> o3(@dl.d m<? extends T> mVar, @dl.d yh.p<? super T, ? super T, ? extends R> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        return q.b(new SequencesKt___SequencesKt$zipWithNext$2(mVar, transform, null));
    }

    @dl.d
    public static final <T> m<T> p0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        return new h(mVar, true, predicate);
    }

    @dl.d
    public static final <T, R> m<R> p1(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends R> transform) {
        f0.p(mVar, "<this>");
        f0.p(transform, "transform");
        return v0(new w(mVar, transform));
    }

    @dl.d
    public static final <T> m<T> p2(@dl.d m<? extends T> mVar, @dl.d T[] elements) {
        f0.p(mVar, "<this>");
        f0.p(elements, "elements");
        return m2(mVar, kotlin.collections.m.t(elements));
    }

    @dl.d
    public static final <T> m<T> q0(@dl.d m<? extends T> mVar, @dl.d final yh.p<? super Integer, ? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        return new w(new h(new k(mVar), true, new yh.l<h0<? extends T>, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterIndexed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d h0<? extends T> it) {
                f0.p(it, "it");
                return predicate.invoke(Integer.valueOf(it.e()), it.f());
            }
        }), new yh.l<h0<? extends T>, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterIndexed$2
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T invoke(@dl.d h0<? extends T> it) {
                f0.p(it, "it");
                return it.f();
            }
        });
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C q1(@dl.d m<? extends T> mVar, @dl.d C destination, @dl.d yh.l<? super T, ? extends R> transform) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @sh.f
    private static final <T> m<T> q2(m<? extends T> mVar, T t10) {
        f0.p(mVar, "<this>");
        return n2(mVar, t10);
    }

    @dl.d
    public static final <T, C extends Collection<? super T>> C r0(@dl.d m<? extends T> mVar, @dl.d C destination, @dl.d yh.p<? super Integer, ? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int i10 = 0;
        for (T t10 : mVar) {
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

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C r1(@dl.d m<? extends T> mVar, @dl.d C destination, @dl.d yh.l<? super T, ? extends R> transform) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <S, T extends S> S r2(@dl.d m<? extends T> mVar, @dl.d yh.p<? super S, ? super T, ? extends S> operation) {
        f0.p(mVar, "<this>");
        f0.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    public static final /* synthetic */ <R> m<R> s0(m<?> mVar) {
        f0.p(mVar, "<this>");
        f0.w();
        m<R> mVarP0 = p0(mVar, new yh.l<Object, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterIsInstance$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.e Object obj) {
                f0.y(3, "R");
                return Boolean.valueOf(obj instanceof Object);
            }
        });
        f0.n(mVarP0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return mVarP0;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @u0(version = "1.4")
    @dl.e
    public static final <T, R extends Comparable<? super R>> T s1(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    public static final <S, T extends S> S s2(@dl.d m<? extends T> mVar, @dl.d yh.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        f0.p(mVar, "<this>");
        f0.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
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

    public static final /* synthetic */ <R, C extends Collection<? super R>> C t0(m<?> mVar, C destination) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        for (Object obj : mVar) {
            f0.y(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @u0(version = s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T t1(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @u0(version = "1.4")
    @dl.e
    public static final <S, T extends S> S t2(@dl.d m<? extends T> mVar, @dl.d yh.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        f0.p(mVar, "<this>");
        f0.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
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
    public static final <T> m<T> u0(@dl.d m<? extends T> mVar, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        return new h(mVar, false, predicate);
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T> double u1(m<? extends T> mVar, yh.l<? super T, Double> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final <S, T extends S> S u2(@dl.d m<? extends T> mVar, @dl.d yh.p<? super S, ? super T, ? extends S> operation) {
        f0.p(mVar, "<this>");
        f0.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
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
    public static final <T> m<T> v0(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        m<T> mVarU0 = u0(mVar, new yh.l<T, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterNotNull$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.e T t10) {
                return Boolean.valueOf(t10 == null);
            }
        });
        f0.n(mVarU0, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return mVarU0;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T> float v1(m<? extends T> mVar, yh.l<? super T, Float> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    @dl.d
    public static final <T> m<T> v2(@dl.d final m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return k1(mVar, new yh.l<T, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$requireNoNulls$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            public final T invoke(@dl.e T t10) {
                if (t10 != null) {
                    return t10;
                }
                throw new IllegalArgumentException("null element found in " + mVar + lg.a.f131414g);
            }
        });
    }

    @dl.d
    public static final <C extends Collection<? super T>, T> C w0(@dl.d m<? extends T> mVar, @dl.d C destination) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        for (T t10 : mVar) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T, R extends Comparable<? super R>> R w1(m<? extends T> mVar, yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @u0(version = "1.4")
    @dl.d
    public static final <T, R> m<R> w2(@dl.d m<? extends T> mVar, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        f0.p(mVar, "<this>");
        f0.p(operation, "operation");
        return q.b(new SequencesKt___SequencesKt$runningFold$1(r10, mVar, operation, null));
    }

    @dl.d
    public static final <T, C extends Collection<? super T>> C x0(@dl.d m<? extends T> mVar, @dl.d C destination, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        for (T t10 : mVar) {
            if (!predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T, R extends Comparable<? super R>> R x1(m<? extends T> mVar, yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @u0(version = "1.4")
    @dl.d
    public static final <T, R> m<R> x2(@dl.d m<? extends T> mVar, R r10, @dl.d yh.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        f0.p(mVar, "<this>");
        f0.p(operation, "operation");
        return q.b(new SequencesKt___SequencesKt$runningFoldIndexed$1(r10, mVar, operation, null));
    }

    @dl.d
    public static final <T, C extends Collection<? super T>> C y0(@dl.d m<? extends T> mVar, @dl.d C destination, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        for (T t10 : mVar) {
            if (predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T> Double y1(m<? extends T> mVar, yh.l<? super T, Double> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final <S, T extends S> m<S> y2(@dl.d m<? extends T> mVar, @dl.d yh.p<? super S, ? super T, ? extends S> operation) {
        f0.p(mVar, "<this>");
        f0.p(operation, "operation");
        return q.b(new SequencesKt___SequencesKt$runningReduce$1(mVar, operation, null));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @sh.f
    private static final <T> T z0(m<? extends T> mVar, yh.l<? super T, Boolean> predicate) {
        f0.p(mVar, "<this>");
        f0.p(predicate, "predicate");
        for (T t10 : mVar) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <T> Float z1(m<? extends T> mVar, yh.l<? super T, Float> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @u0(version = "1.4")
    @dl.d
    public static final <S, T extends S> m<S> z2(@dl.d m<? extends T> mVar, @dl.d yh.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        f0.p(mVar, "<this>");
        f0.p(operation, "operation");
        return q.b(new SequencesKt___SequencesKt$runningReduceIndexed$1(mVar, operation, null));
    }
}
