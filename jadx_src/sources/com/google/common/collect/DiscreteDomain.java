package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class DiscreteDomain<C extends Comparable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f57190b;

    public static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final BigIntegerDomain f57191c = new BigIntegerDomain();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final BigInteger f57192d = BigInteger.valueOf(Long.MIN_VALUE);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final BigInteger f57193e = BigInteger.valueOf(Long.MAX_VALUE);
        private static final long serialVersionUID = 0;

        BigIntegerDomain() {
            super(true);
        }

        private Object o() {
            return f57191c;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public long b(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f57192d).min(f57193e).longValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public BigInteger g(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public BigInteger h(BigInteger bigInteger, long j10) {
            n.c(j10, "distance");
            return bigInteger.add(BigInteger.valueOf(j10));
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public BigInteger i(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    public static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final IntegerDomain f57194c = new IntegerDomain();
        private static final long serialVersionUID = 0;

        IntegerDomain() {
            super(true);
        }

        private Object q() {
            return f57194c;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public long b(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer e() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer f() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer g(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Integer h(Integer num, long j10) {
            n.c(j10, "distance");
            return Integer.valueOf(Ints.d(num.longValue() + j10));
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Integer i(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    public static final class LongDomain extends DiscreteDomain<Long> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final LongDomain f57195c = new LongDomain();
        private static final long serialVersionUID = 0;

        LongDomain() {
            super(true);
        }

        private Object q() {
            return f57195c;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public long b(Long l10, Long l11) {
            long jLongValue = l11.longValue() - l10.longValue();
            if (l11.longValue() > l10.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l11.longValue() >= l10.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Long e() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long f() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long g(Long l10) {
            long jLongValue = l10.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Long h(Long l10, long j10) {
            n.c(j10, "distance");
            long jLongValue = l10.longValue() + j10;
            if (jLongValue < 0) {
                com.google.common.base.w.e(l10.longValue() < 0, "overflow");
            }
            return Long.valueOf(jLongValue);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Long i(Long l10) {
            long jLongValue = l10.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    protected DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean z10) {
        this.f57190b = z10;
    }

    public static DiscreteDomain<BigInteger> a() {
        return BigIntegerDomain.f57191c;
    }

    public static DiscreteDomain<Integer> c() {
        return IntegerDomain.f57194c;
    }

    public static DiscreteDomain<Long> d() {
        return LongDomain.f57195c;
    }

    public abstract long b(C c10, C c11);

    @s9.a
    public C e() {
        throw new NoSuchElementException();
    }

    @s9.a
    public C f() {
        throw new NoSuchElementException();
    }

    @CheckForNull
    public abstract C g(C c10);

    C h(C c10, long j10) {
        n.c(j10, "distance");
        C c11 = c10;
        for (long j11 = 0; j11 < j10; j11++) {
            c11 = (C) g(c11);
            if (c11 == null) {
                String strValueOf = String.valueOf(c10);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 51);
                sb2.append("overflowed computing offset(");
                sb2.append(strValueOf);
                sb2.append(", ");
                sb2.append(j10);
                sb2.append(")");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return c11;
    }

    @CheckForNull
    public abstract C i(C c10);
}
