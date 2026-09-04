package kotlin.sequences;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.f0;
import kotlin.l0;
import kotlin.s0;
import kotlin.u0;

/* JADX INFO: compiled from: _SequencesJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public class SequencesKt___SequencesJvmKt extends SequencesKt__SequencesKt {
    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Object A(m mVar, Comparator comparator) {
        f0.p(mVar, "<this>");
        f0.p(comparator, "comparator");
        return SequencesKt___SequencesKt.I1(mVar, comparator);
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Comparable B(m mVar) {
        f0.p(mVar, "<this>");
        return SequencesKt___SequencesKt.U1(mVar);
    }

    @u0(version = "1.1")
    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Double C(m mVar) {
        f0.p(mVar, "<this>");
        return SequencesKt___SequencesKt.V1(mVar);
    }

    @u0(version = "1.1")
    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Float D(m mVar) {
        f0.p(mVar, "<this>");
        return SequencesKt___SequencesKt.W1(mVar);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T E(m<? extends T> mVar, yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Object F(m mVar, Comparator comparator) {
        f0.p(mVar, "<this>");
        f0.p(comparator, "comparator");
        return SequencesKt___SequencesKt.a2(mVar, comparator);
    }

    @u0(version = "1.4")
    @l0
    @xh.h(name = "sumOfBigDecimal")
    @sh.f
    private static final <T> BigDecimal G(m<? extends T> mVar, yh.l<? super T, ? extends BigDecimal> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(it.next()));
            f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @u0(version = "1.4")
    @l0
    @xh.h(name = "sumOfBigInteger")
    @sh.f
    private static final <T> BigInteger H(m<? extends T> mVar, yh.l<? super T, ? extends BigInteger> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(it.next()));
            f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @dl.d
    public static final <T extends Comparable<? super T>> SortedSet<T> I(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return (SortedSet) SequencesKt___SequencesKt.a3(mVar, new TreeSet());
    }

    @dl.d
    public static final <T> SortedSet<T> J(@dl.d m<? extends T> mVar, @dl.d Comparator<? super T> comparator) {
        f0.p(mVar, "<this>");
        f0.p(comparator, "comparator");
        return (SortedSet) SequencesKt___SequencesKt.a3(mVar, new TreeSet(comparator));
    }

    @dl.d
    public static final <R> m<R> u(@dl.d m<?> mVar, @dl.d final Class<R> klass) {
        f0.p(mVar, "<this>");
        f0.p(klass, "klass");
        m<R> mVarP0 = SequencesKt___SequencesKt.p0(mVar, new yh.l<Object, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesJvmKt$filterIsInstance$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.e Object obj) {
                return Boolean.valueOf(klass.isInstance(obj));
            }
        });
        f0.n(mVarP0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return mVarP0;
    }

    @dl.d
    public static final <C extends Collection<? super R>, R> C v(@dl.d m<?> mVar, @dl.d C destination, @dl.d Class<R> klass) {
        f0.p(mVar, "<this>");
        f0.p(destination, "destination");
        f0.p(klass, "klass");
        for (Object obj : mVar) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Comparable w(m mVar) {
        f0.p(mVar, "<this>");
        return SequencesKt___SequencesKt.C1(mVar);
    }

    @u0(version = "1.1")
    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Double x(m mVar) {
        f0.p(mVar, "<this>");
        return SequencesKt___SequencesKt.D1(mVar);
    }

    @u0(version = "1.1")
    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Float y(m mVar) {
        f0.p(mVar, "<this>");
        return SequencesKt___SequencesKt.E1(mVar);
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T z(m<? extends T> mVar, yh.l<? super T, ? extends R> selector) {
        f0.p(mVar, "<this>");
        f0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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
}
