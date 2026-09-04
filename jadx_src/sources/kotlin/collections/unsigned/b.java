package kotlin.collections.unsigned;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.k0;
import kotlin.d2;
import kotlin.j1;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.k1;
import kotlin.l;
import kotlin.l0;
import kotlin.n1;
import kotlin.o1;
import kotlin.r1;
import kotlin.s;
import kotlin.s0;
import kotlin.s1;
import kotlin.u0;
import kotlin.x1;
import kotlin.y1;
import sh.f;
import xh.h;

/* JADX INFO: compiled from: _UArraysJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: compiled from: _UArraysJvm.kt */
    public static final class a extends kotlin.collections.b<n1> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f124645b;

        a(int[] iArr) {
            this.f124645b = iArr;
        }

        public boolean a(int i10) {
            return o1.i(this.f124645b, i10);
        }

        public int b(int i10) {
            return o1.s(this.f124645b, i10);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof n1) {
                return a(((n1) obj).q0());
            }
            return false;
        }

        public int e(int i10) {
            return ArraysKt___ArraysKt.hg(this.f124645b, i10);
        }

        public int g(int i10) {
            return ArraysKt___ArraysKt.li(this.f124645b, i10);
        }

        @Override // kotlin.collections.b, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i10) {
            return n1.b(b(i10));
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() {
            return o1.v(this.f124645b);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof n1) {
                return e(((n1) obj).q0());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return o1.y(this.f124645b);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof n1) {
                return g(((n1) obj).q0());
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.unsigned.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: _UArraysJvm.kt */
    public static final class C1126b extends kotlin.collections.b<r1> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long[] f124646b;

        C1126b(long[] jArr) {
            this.f124646b = jArr;
        }

        public boolean a(long j10) {
            return s1.i(this.f124646b, j10);
        }

        public long b(int i10) {
            return s1.s(this.f124646b, i10);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof r1) {
                return a(((r1) obj).q0());
            }
            return false;
        }

        public int e(long j10) {
            return ArraysKt___ArraysKt.ig(this.f124646b, j10);
        }

        public int g(long j10) {
            return ArraysKt___ArraysKt.mi(this.f124646b, j10);
        }

        @Override // kotlin.collections.b, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i10) {
            return r1.b(b(i10));
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() {
            return s1.v(this.f124646b);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof r1) {
                return e(((r1) obj).q0());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return s1.y(this.f124646b);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof r1) {
                return g(((r1) obj).q0());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: _UArraysJvm.kt */
    public static final class c extends kotlin.collections.b<j1> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f124647b;

        c(byte[] bArr) {
            this.f124647b = bArr;
        }

        public boolean a(byte b10) {
            return k1.i(this.f124647b, b10);
        }

        public byte b(int i10) {
            return k1.s(this.f124647b, i10);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof j1) {
                return a(((j1) obj).o0());
            }
            return false;
        }

        public int e(byte b10) {
            return ArraysKt___ArraysKt.dg(this.f124647b, b10);
        }

        public int g(byte b10) {
            return ArraysKt___ArraysKt.hi(this.f124647b, b10);
        }

        @Override // kotlin.collections.b, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i10) {
            return j1.b(b(i10));
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() {
            return k1.v(this.f124647b);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof j1) {
                return e(((j1) obj).o0());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return k1.y(this.f124647b);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof j1) {
                return g(((j1) obj).o0());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: _UArraysJvm.kt */
    public static final class d extends kotlin.collections.b<x1> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ short[] f124648b;

        d(short[] sArr) {
            this.f124648b = sArr;
        }

        public boolean a(short s10) {
            return y1.i(this.f124648b, s10);
        }

        public short b(int i10) {
            return y1.s(this.f124648b, i10);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof x1) {
                return a(((x1) obj).o0());
            }
            return false;
        }

        public int e(short s10) {
            return ArraysKt___ArraysKt.kg(this.f124648b, s10);
        }

        public int g(short s10) {
            return ArraysKt___ArraysKt.oi(this.f124648b, s10);
        }

        @Override // kotlin.collections.b, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i10) {
            return x1.b(b(i10));
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() {
            return y1.v(this.f124648b);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof x1) {
                return e(((x1) obj).o0());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return y1.y(this.f124648b);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof x1) {
                return g(((x1) obj).o0());
            }
            return -1;
        }
    }

    @u0(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ x1 A(short[] maxWith, Comparator comparator) {
        f0.p(maxWith, "$this$maxWith");
        f0.p(comparator, "comparator");
        return UArraysKt___UArraysKt.M6(maxWith, comparator);
    }

    @u0(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ r1 B(long[] maxWith, Comparator comparator) {
        f0.p(maxWith, "$this$maxWith");
        f0.p(comparator, "comparator");
        return UArraysKt___UArraysKt.N6(maxWith, comparator);
    }

    @u0(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @s0(expression = "this.minOrNull()", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ n1 C(int[] min) {
        f0.p(min, "$this$min");
        return UArraysKt___UArraysKt.G7(min);
    }

    @u0(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @s0(expression = "this.minOrNull()", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ j1 D(byte[] min) {
        f0.p(min, "$this$min");
        return UArraysKt___UArraysKt.H7(min);
    }

    @u0(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @s0(expression = "this.minOrNull()", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ r1 E(long[] min) {
        f0.p(min, "$this$min");
        return UArraysKt___UArraysKt.I7(min);
    }

    @u0(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @s0(expression = "this.minOrNull()", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ x1 F(short[] min) {
        f0.p(min, "$this$min");
        return UArraysKt___UArraysKt.J7(min);
    }

    @u0(version = "1.3")
    @k(message = "Use minByOrNull instead.", replaceWith = @s0(expression = "this.minByOrNull(selector)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> j1 G(byte[] minBy, yh.l<? super j1, ? extends R> selector) {
        f0.p(minBy, "$this$minBy");
        f0.p(selector, "selector");
        if (k1.y(minBy)) {
            return null;
        }
        byte bS = k1.s(minBy, 0);
        int iRe = ArraysKt___ArraysKt.Re(minBy);
        if (iRe != 0) {
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
        }
        return j1.b(bS);
    }

    @u0(version = "1.3")
    @k(message = "Use minByOrNull instead.", replaceWith = @s0(expression = "this.minByOrNull(selector)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> r1 H(long[] minBy, yh.l<? super r1, ? extends R> selector) {
        f0.p(minBy, "$this$minBy");
        f0.p(selector, "selector");
        if (s1.y(minBy)) {
            return null;
        }
        long jS = s1.s(minBy, 0);
        int iWe = ArraysKt___ArraysKt.We(minBy);
        if (iWe != 0) {
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
        }
        return r1.b(jS);
    }

    @u0(version = "1.3")
    @k(message = "Use minByOrNull instead.", replaceWith = @s0(expression = "this.minByOrNull(selector)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> n1 I(int[] minBy, yh.l<? super n1, ? extends R> selector) {
        f0.p(minBy, "$this$minBy");
        f0.p(selector, "selector");
        if (o1.y(minBy)) {
            return null;
        }
        int iS = o1.s(minBy, 0);
        int iVe = ArraysKt___ArraysKt.Ve(minBy);
        if (iVe != 0) {
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
        }
        return n1.b(iS);
    }

    @u0(version = "1.3")
    @k(message = "Use minByOrNull instead.", replaceWith = @s0(expression = "this.minByOrNull(selector)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> x1 J(short[] minBy, yh.l<? super x1, ? extends R> selector) {
        f0.p(minBy, "$this$minBy");
        f0.p(selector, "selector");
        if (y1.y(minBy)) {
            return null;
        }
        short s10 = y1.s(minBy, 0);
        int iYe = ArraysKt___ArraysKt.Ye(minBy);
        if (iYe != 0) {
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
        }
        return x1.b(s10);
    }

    @u0(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ j1 K(byte[] minWith, Comparator comparator) {
        f0.p(minWith, "$this$minWith");
        f0.p(comparator, "comparator");
        return UArraysKt___UArraysKt.O7(minWith, comparator);
    }

    @u0(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ n1 L(int[] minWith, Comparator comparator) {
        f0.p(minWith, "$this$minWith");
        f0.p(comparator, "comparator");
        return UArraysKt___UArraysKt.P7(minWith, comparator);
    }

    @u0(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ x1 M(short[] minWith, Comparator comparator) {
        f0.p(minWith, "$this$minWith");
        f0.p(comparator, "comparator");
        return UArraysKt___UArraysKt.Q7(minWith, comparator);
    }

    @u0(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ r1 N(long[] minWith, Comparator comparator) {
        f0.p(minWith, "$this$minWith");
        f0.p(comparator, "comparator");
        return UArraysKt___UArraysKt.R7(minWith, comparator);
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfBigDecimal")
    @f
    private static final BigDecimal O(byte[] sumOf, yh.l<? super j1, ? extends BigDecimal> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        int iV = k1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(j1.b(k1.s(sumOf, i10))));
            f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfBigDecimal")
    @f
    private static final BigDecimal P(int[] sumOf, yh.l<? super n1, ? extends BigDecimal> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        int iV = o1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(n1.b(o1.s(sumOf, i10))));
            f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfBigDecimal")
    @f
    private static final BigDecimal Q(long[] sumOf, yh.l<? super r1, ? extends BigDecimal> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        int iV = s1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(r1.b(s1.s(sumOf, i10))));
            f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfBigDecimal")
    @f
    private static final BigDecimal R(short[] sumOf, yh.l<? super x1, ? extends BigDecimal> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        int iV = y1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(x1.b(y1.s(sumOf, i10))));
            f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfBigInteger")
    @f
    private static final BigInteger S(byte[] sumOf, yh.l<? super j1, ? extends BigInteger> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        int iV = k1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(j1.b(k1.s(sumOf, i10))));
            f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfBigInteger")
    @f
    private static final BigInteger T(int[] sumOf, yh.l<? super n1, ? extends BigInteger> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        int iV = o1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(n1.b(o1.s(sumOf, i10))));
            f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfBigInteger")
    @f
    private static final BigInteger U(long[] sumOf, yh.l<? super r1, ? extends BigInteger> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        int iV = s1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(r1.b(s1.s(sumOf, i10))));
            f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @u0(version = "1.4")
    @s
    @l0
    @h(name = "sumOfBigInteger")
    @f
    private static final BigInteger V(short[] sumOf, yh.l<? super x1, ? extends BigInteger> selector) {
        f0.p(sumOf, "$this$sumOf");
        f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        int iV = y1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(x1.b(y1.s(sumOf, i10))));
            f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @u0(version = "1.3")
    @dl.d
    @s
    public static final List<n1> a(@dl.d int[] asList) {
        f0.p(asList, "$this$asList");
        return new a(asList);
    }

    @u0(version = "1.3")
    @dl.d
    @s
    public static final List<j1> b(@dl.d byte[] asList) {
        f0.p(asList, "$this$asList");
        return new c(asList);
    }

    @u0(version = "1.3")
    @dl.d
    @s
    public static final List<r1> c(@dl.d long[] asList) {
        f0.p(asList, "$this$asList");
        return new C1126b(asList);
    }

    @u0(version = "1.3")
    @dl.d
    @s
    public static final List<x1> d(@dl.d short[] asList) {
        f0.p(asList, "$this$asList");
        return new d(asList);
    }

    @u0(version = "1.3")
    @s
    public static final int e(@dl.d int[] binarySearch, int i10, int i11, int i12) {
        f0.p(binarySearch, "$this$binarySearch");
        kotlin.collections.b.Companion.d(i11, i12, o1.v(binarySearch));
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int iC = d2.c(binarySearch[i14], i10);
            if (iC < 0) {
                i11 = i14 + 1;
            } else {
                if (iC <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static /* synthetic */ int f(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = o1.v(iArr);
        }
        return e(iArr, i10, i11, i12);
    }

    @u0(version = "1.3")
    @s
    public static final int g(@dl.d short[] binarySearch, short s10, int i10, int i11) {
        f0.p(binarySearch, "$this$binarySearch");
        kotlin.collections.b.Companion.d(i10, i11, y1.v(binarySearch));
        int i12 = s10 & x1.f128661e;
        int i13 = i11 - 1;
        while (i10 <= i13) {
            int i14 = (i10 + i13) >>> 1;
            int iC = d2.c(binarySearch[i14], i12);
            if (iC < 0) {
                i10 = i14 + 1;
            } else {
                if (iC <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int h(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = y1.v(sArr);
        }
        return g(sArr, s10, i10, i11);
    }

    @u0(version = "1.3")
    @s
    public static final int i(@dl.d long[] binarySearch, long j10, int i10, int i11) {
        f0.p(binarySearch, "$this$binarySearch");
        kotlin.collections.b.Companion.d(i10, i11, s1.v(binarySearch));
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iG = d2.g(binarySearch[i13], j10);
            if (iG < 0) {
                i10 = i13 + 1;
            } else {
                if (iG <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int j(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = s1.v(jArr);
        }
        return i(jArr, j10, i10, i11);
    }

    @u0(version = "1.3")
    @s
    public static final int k(@dl.d byte[] binarySearch, byte b10, int i10, int i11) {
        f0.p(binarySearch, "$this$binarySearch");
        kotlin.collections.b.Companion.d(i10, i11, k1.v(binarySearch));
        int i12 = b10 & 255;
        int i13 = i11 - 1;
        while (i10 <= i13) {
            int i14 = (i10 + i13) >>> 1;
            int iC = d2.c(binarySearch[i14], i12);
            if (iC < 0) {
                i10 = i14 + 1;
            } else {
                if (iC <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int l(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = k1.v(bArr);
        }
        return k(bArr, b10, i10, i11);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final byte m(byte[] elementAt, int i10) {
        f0.p(elementAt, "$this$elementAt");
        return k1.s(elementAt, i10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final short n(short[] elementAt, int i10) {
        f0.p(elementAt, "$this$elementAt");
        return y1.s(elementAt, i10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final int o(int[] elementAt, int i10) {
        f0.p(elementAt, "$this$elementAt");
        return o1.s(elementAt, i10);
    }

    @u0(version = "1.3")
    @s
    @f
    private static final long p(long[] elementAt, int i10) {
        f0.p(elementAt, "$this$elementAt");
        return s1.s(elementAt, i10);
    }

    @u0(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @s0(expression = "this.maxOrNull()", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ n1 q(int[] max) {
        f0.p(max, "$this$max");
        return UArraysKt___UArraysKt.C6(max);
    }

    @u0(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @s0(expression = "this.maxOrNull()", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ j1 r(byte[] max) {
        f0.p(max, "$this$max");
        return UArraysKt___UArraysKt.D6(max);
    }

    @u0(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @s0(expression = "this.maxOrNull()", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ r1 s(long[] max) {
        f0.p(max, "$this$max");
        return UArraysKt___UArraysKt.E6(max);
    }

    @u0(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @s0(expression = "this.maxOrNull()", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ x1 t(short[] max) {
        f0.p(max, "$this$max");
        return UArraysKt___UArraysKt.F6(max);
    }

    @u0(version = "1.3")
    @k(message = "Use maxByOrNull instead.", replaceWith = @s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> j1 u(byte[] maxBy, yh.l<? super j1, ? extends R> selector) {
        f0.p(maxBy, "$this$maxBy");
        f0.p(selector, "selector");
        if (k1.y(maxBy)) {
            return null;
        }
        byte bS = k1.s(maxBy, 0);
        int iRe = ArraysKt___ArraysKt.Re(maxBy);
        if (iRe != 0) {
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
        }
        return j1.b(bS);
    }

    @u0(version = "1.3")
    @k(message = "Use maxByOrNull instead.", replaceWith = @s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> r1 v(long[] maxBy, yh.l<? super r1, ? extends R> selector) {
        f0.p(maxBy, "$this$maxBy");
        f0.p(selector, "selector");
        if (s1.y(maxBy)) {
            return null;
        }
        long jS = s1.s(maxBy, 0);
        int iWe = ArraysKt___ArraysKt.We(maxBy);
        if (iWe != 0) {
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
        }
        return r1.b(jS);
    }

    @u0(version = "1.3")
    @k(message = "Use maxByOrNull instead.", replaceWith = @s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> n1 w(int[] maxBy, yh.l<? super n1, ? extends R> selector) {
        f0.p(maxBy, "$this$maxBy");
        f0.p(selector, "selector");
        if (o1.y(maxBy)) {
            return null;
        }
        int iS = o1.s(maxBy, 0);
        int iVe = ArraysKt___ArraysKt.Ve(maxBy);
        if (iVe != 0) {
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
        }
        return n1.b(iS);
    }

    @u0(version = "1.3")
    @k(message = "Use maxByOrNull instead.", replaceWith = @s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> x1 x(short[] maxBy, yh.l<? super x1, ? extends R> selector) {
        f0.p(maxBy, "$this$maxBy");
        f0.p(selector, "selector");
        if (y1.y(maxBy)) {
            return null;
        }
        short s10 = y1.s(maxBy, 0);
        int iYe = ArraysKt___ArraysKt.Ye(maxBy);
        if (iYe != 0) {
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
        }
        return x1.b(s10);
    }

    @u0(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ j1 y(byte[] maxWith, Comparator comparator) {
        f0.p(maxWith, "$this$maxWith");
        f0.p(comparator, "comparator");
        return UArraysKt___UArraysKt.K6(maxWith, comparator);
    }

    @u0(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @s
    @l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ n1 z(int[] maxWith, Comparator comparator) {
        f0.p(maxWith, "$this$maxWith");
        f0.p(comparator, "comparator");
        return UArraysKt___UArraysKt.L6(maxWith, comparator);
    }
}
