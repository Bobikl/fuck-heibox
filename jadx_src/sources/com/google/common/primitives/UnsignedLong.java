package com.google.common.primitives;

import com.google.common.base.w;
import java.io.Serializable;
import java.math.BigInteger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@b
@o9.b(serializable = true)
public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f59079c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final UnsignedLong f59080d = new UnsignedLong(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final UnsignedLong f59081e = new UnsignedLong(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final UnsignedLong f59082f = new UnsignedLong(-1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f59083b;

    private UnsignedLong(long j10) {
        this.f59083b = j10;
    }

    public static UnsignedLong d(long j10) {
        return new UnsignedLong(j10);
    }

    @s9.a
    public static UnsignedLong j(long j10) {
        w.p(j10 >= 0, "value (%s) is outside the range for an unsigned long value", j10);
        return d(j10);
    }

    @s9.a
    public static UnsignedLong k(String str) {
        return l(str, 10);
    }

    @s9.a
    public static UnsignedLong l(String str, int i10) {
        return d(UnsignedLongs.j(str, i10));
    }

    @s9.a
    public static UnsignedLong m(BigInteger bigInteger) {
        w.E(bigInteger);
        w.u(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", bigInteger);
        return d(bigInteger.longValue());
    }

    public BigInteger a() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(this.f59083b & Long.MAX_VALUE);
        return this.f59083b < 0 ? bigIntegerValueOf.setBit(63) : bigIntegerValueOf;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(UnsignedLong unsignedLong) {
        w.E(unsignedLong);
        return UnsignedLongs.a(this.f59083b, unsignedLong.f59083b);
    }

    public UnsignedLong c(UnsignedLong unsignedLong) {
        return d(UnsignedLongs.c(this.f59083b, ((UnsignedLong) w.E(unsignedLong)).f59083b));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j10 = this.f59083b;
        if (j10 >= 0) {
            return j10;
        }
        return ((j10 & 1) | (j10 >>> 1)) * 2.0d;
    }

    public UnsignedLong e(UnsignedLong unsignedLong) {
        return d(this.f59083b - ((UnsignedLong) w.E(unsignedLong)).f59083b);
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof UnsignedLong) && this.f59083b == ((UnsignedLong) obj).f59083b;
    }

    public UnsignedLong f(UnsignedLong unsignedLong) {
        return d(UnsignedLongs.k(this.f59083b, ((UnsignedLong) w.E(unsignedLong)).f59083b));
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j10 = this.f59083b;
        if (j10 >= 0) {
            return j10;
        }
        return ((j10 & 1) | (j10 >>> 1)) * 2.0f;
    }

    public UnsignedLong g(UnsignedLong unsignedLong) {
        return d(this.f59083b + ((UnsignedLong) w.E(unsignedLong)).f59083b);
    }

    public UnsignedLong h(UnsignedLong unsignedLong) {
        return d(this.f59083b * ((UnsignedLong) w.E(unsignedLong)).f59083b);
    }

    public int hashCode() {
        return Longs.k(this.f59083b);
    }

    public String i(int i10) {
        return UnsignedLongs.q(this.f59083b, i10);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f59083b;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f59083b;
    }

    public String toString() {
        return UnsignedLongs.p(this.f59083b);
    }
}
