package com.google.common.primitives;

import com.google.common.base.w;
import io.flutter.embedding.android.KeyboardMap;
import java.math.BigInteger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@b
@o9.b(emulated = true)
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UnsignedInteger f59074c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final UnsignedInteger f59075d = d(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final UnsignedInteger f59076e = d(-1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59077b;

    private UnsignedInteger(int i10) {
        this.f59077b = i10 & (-1);
    }

    public static UnsignedInteger d(int i10) {
        return new UnsignedInteger(i10);
    }

    public static UnsignedInteger j(long j10) {
        w.p((KeyboardMap.kValueMask & j10) == j10, "value (%s) is outside the range for an unsigned integer value", j10);
        return d((int) j10);
    }

    public static UnsignedInteger k(String str) {
        return l(str, 10);
    }

    public static UnsignedInteger l(String str, int i10) {
        return d(UnsignedInts.k(str, i10));
    }

    public static UnsignedInteger m(BigInteger bigInteger) {
        w.E(bigInteger);
        w.u(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", bigInteger);
        return d(bigInteger.intValue());
    }

    public BigInteger a() {
        return BigInteger.valueOf(longValue());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(UnsignedInteger unsignedInteger) {
        w.E(unsignedInteger);
        return UnsignedInts.b(this.f59077b, unsignedInteger.f59077b);
    }

    public UnsignedInteger c(UnsignedInteger unsignedInteger) {
        return d(UnsignedInts.d(this.f59077b, ((UnsignedInteger) w.E(unsignedInteger)).f59077b));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return longValue();
    }

    public UnsignedInteger e(UnsignedInteger unsignedInteger) {
        return d(this.f59077b - ((UnsignedInteger) w.E(unsignedInteger)).f59077b);
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof UnsignedInteger) && this.f59077b == ((UnsignedInteger) obj).f59077b;
    }

    public UnsignedInteger f(UnsignedInteger unsignedInteger) {
        return d(UnsignedInts.l(this.f59077b, ((UnsignedInteger) w.E(unsignedInteger)).f59077b));
    }

    @Override // java.lang.Number
    public float floatValue() {
        return longValue();
    }

    public UnsignedInteger g(UnsignedInteger unsignedInteger) {
        return d(this.f59077b + ((UnsignedInteger) w.E(unsignedInteger)).f59077b);
    }

    @o9.c
    public UnsignedInteger h(UnsignedInteger unsignedInteger) {
        return d(this.f59077b * ((UnsignedInteger) w.E(unsignedInteger)).f59077b);
    }

    public int hashCode() {
        return this.f59077b;
    }

    public String i(int i10) {
        return UnsignedInts.t(this.f59077b, i10);
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f59077b;
    }

    @Override // java.lang.Number
    public long longValue() {
        return UnsignedInts.r(this.f59077b);
    }

    public String toString() {
        return i(10);
    }
}
