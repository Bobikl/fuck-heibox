package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: compiled from: _CollectionsJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public class z extends y {
    @dl.d
    public static final <R> List<R> a1(@dl.d Iterable<?> iterable, @dl.d Class<R> klass) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(klass, "klass");
        return (List) b1(iterable, new ArrayList(), klass);
    }

    @dl.d
    public static final <C extends Collection<? super R>, R> C b1(@dl.d Iterable<?> iterable, @dl.d C destination, @dl.d Class<R> klass) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(klass, "klass");
        for (Object obj : iterable) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Comparable c1(Iterable iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return CollectionsKt___CollectionsKt.K3(iterable);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Double d1(Iterable iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return CollectionsKt___CollectionsKt.L3(iterable);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Float e1(Iterable iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return CollectionsKt___CollectionsKt.M3(iterable);
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T f1(Iterable<? extends T> iterable, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(next);
            do {
                T next2 = it.next();
                R rInvoke2 = selector.invoke(next2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    next = next2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return (T) next;
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Object g1(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return CollectionsKt___CollectionsKt.Q3(iterable, comparator);
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Comparable h1(Iterable iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return CollectionsKt___CollectionsKt.c4(iterable);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Double i1(Iterable iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return CollectionsKt___CollectionsKt.d4(iterable);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Float j1(Iterable iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return CollectionsKt___CollectionsKt.e4(iterable);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T k1(Iterable<? extends T> iterable, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(next);
            do {
                T next2 = it.next();
                R rInvoke2 = selector.invoke(next2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    next = next2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return (T) next;
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Object l1(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return CollectionsKt___CollectionsKt.i4(iterable, comparator);
    }

    public static final <T> void m1(@dl.d List<T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        Collections.reverse(list);
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigDecimal")
    @sh.f
    private static final <T> BigDecimal n1(Iterable<? extends T> iterable, yh.l<? super T, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(it.next()));
            kotlin.jvm.internal.f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigInteger")
    @sh.f
    private static final <T> BigInteger o1(Iterable<? extends T> iterable, yh.l<? super T, ? extends BigInteger> selector) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(it.next()));
            kotlin.jvm.internal.f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @dl.d
    public static final <T extends Comparable<? super T>> SortedSet<T> p1(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return (SortedSet) CollectionsKt___CollectionsKt.L5(iterable, new TreeSet());
    }

    @dl.d
    public static final <T> SortedSet<T> q1(@dl.d Iterable<? extends T> iterable, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return (SortedSet) CollectionsKt___CollectionsKt.L5(iterable, new TreeSet(comparator));
    }
}
