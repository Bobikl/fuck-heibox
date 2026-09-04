package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* JADX INFO: compiled from: BigIntegers.kt */
/* JADX INFO: loaded from: classes5.dex */
public class f0 extends e0 {
    @u0(version = "1.2")
    @sh.f
    private static final BigInteger A(BigInteger bigInteger, int i10) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(i10);
        kotlin.jvm.internal.f0.o(bigIntegerShiftRight, "this.shiftRight(n)");
        return bigIntegerShiftRight;
    }

    @sh.f
    private static final BigInteger B(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        BigInteger bigIntegerMultiply = bigInteger.multiply(other);
        kotlin.jvm.internal.f0.o(bigIntegerMultiply, "this.multiply(other)");
        return bigIntegerMultiply;
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigDecimal C(BigInteger bigInteger) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigDecimal D(BigInteger bigInteger, int i10, MathContext mathContext) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        kotlin.jvm.internal.f0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i10, mathContext);
    }

    static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i10, MathContext mathContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            kotlin.jvm.internal.f0.o(mathContext, "UNLIMITED");
        }
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        kotlin.jvm.internal.f0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i10, mathContext);
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigInteger F(int i10) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(i10);
        kotlin.jvm.internal.f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        return bigIntegerValueOf;
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigInteger G(long j10) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j10);
        kotlin.jvm.internal.f0.o(bigIntegerValueOf, "valueOf(this)");
        return bigIntegerValueOf;
    }

    @sh.f
    private static final BigInteger H(BigInteger bigInteger) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        BigInteger bigIntegerNegate = bigInteger.negate();
        kotlin.jvm.internal.f0.o(bigIntegerNegate, "this.negate()");
        return bigIntegerNegate;
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigInteger I(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        BigInteger bigIntegerXor = bigInteger.xor(other);
        kotlin.jvm.internal.f0.o(bigIntegerXor, "this.xor(other)");
        return bigIntegerXor;
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigInteger q(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        BigInteger bigIntegerAnd = bigInteger.and(other);
        kotlin.jvm.internal.f0.o(bigIntegerAnd, "this.and(other)");
        return bigIntegerAnd;
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigInteger r(BigInteger bigInteger) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        BigInteger bigIntegerSubtract = bigInteger.subtract(BigInteger.ONE);
        kotlin.jvm.internal.f0.o(bigIntegerSubtract, "this.subtract(BigInteger.ONE)");
        return bigIntegerSubtract;
    }

    @sh.f
    private static final BigInteger s(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        BigInteger bigIntegerDivide = bigInteger.divide(other);
        kotlin.jvm.internal.f0.o(bigIntegerDivide, "this.divide(other)");
        return bigIntegerDivide;
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigInteger t(BigInteger bigInteger) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        BigInteger bigIntegerAdd = bigInteger.add(BigInteger.ONE);
        kotlin.jvm.internal.f0.o(bigIntegerAdd, "this.add(BigInteger.ONE)");
        return bigIntegerAdd;
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigInteger u(BigInteger bigInteger) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        BigInteger bigIntegerNot = bigInteger.not();
        kotlin.jvm.internal.f0.o(bigIntegerNot, "this.not()");
        return bigIntegerNot;
    }

    @sh.f
    private static final BigInteger v(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        BigInteger bigIntegerSubtract = bigInteger.subtract(other);
        kotlin.jvm.internal.f0.o(bigIntegerSubtract, "this.subtract(other)");
        return bigIntegerSubtract;
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigInteger w(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        BigInteger bigIntegerOr = bigInteger.or(other);
        kotlin.jvm.internal.f0.o(bigIntegerOr, "this.or(other)");
        return bigIntegerOr;
    }

    @sh.f
    private static final BigInteger x(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        BigInteger bigIntegerAdd = bigInteger.add(other);
        kotlin.jvm.internal.f0.o(bigIntegerAdd, "this.add(other)");
        return bigIntegerAdd;
    }

    @u0(version = "1.1")
    @sh.f
    private static final BigInteger y(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        BigInteger bigIntegerRemainder = bigInteger.remainder(other);
        kotlin.jvm.internal.f0.o(bigIntegerRemainder, "this.remainder(other)");
        return bigIntegerRemainder;
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigInteger z(BigInteger bigInteger, int i10) {
        kotlin.jvm.internal.f0.p(bigInteger, "<this>");
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(i10);
        kotlin.jvm.internal.f0.o(bigIntegerShiftLeft, "this.shiftLeft(n)");
        return bigIntegerShiftLeft;
    }
}
