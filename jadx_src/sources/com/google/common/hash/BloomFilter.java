package com.google.common.hash;

import com.google.common.base.w;
import com.google.common.base.x;
import com.google.common.math.LongMath;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@h
@o9.a
public final class BloomFilter<T> implements x<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BloomFilterStrategies.a f58451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Funnel<? super T> f58453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Strategy f58454e;

    public static class SerialForm<T> implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long[] f58455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f58456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Funnel<? super T> f58457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Strategy f58458e;

        SerialForm(BloomFilter<T> bloomFilter) {
            this.f58455b = BloomFilterStrategies.a.i(((BloomFilter) bloomFilter).f58451b.f58460a);
            this.f58456c = ((BloomFilter) bloomFilter).f58452c;
            this.f58457d = ((BloomFilter) bloomFilter).f58453d;
            this.f58458e = ((BloomFilter) bloomFilter).f58454e;
        }

        Object a() {
            return new BloomFilter(new BloomFilterStrategies.a(this.f58455b), this.f58456c, this.f58457d, this.f58458e);
        }
    }

    public interface Strategy extends Serializable {
        <T> boolean mightContain(@t T t10, Funnel<? super T> funnel, int i10, BloomFilterStrategies.a aVar);

        int ordinal();

        <T> boolean put(@t T t10, Funnel<? super T> funnel, int i10, BloomFilterStrategies.a aVar);
    }

    private BloomFilter(BloomFilterStrategies.a aVar, int i10, Funnel<? super T> funnel, Strategy strategy) {
        w.k(i10 > 0, "numHashFunctions (%s) must be > 0", i10);
        w.k(i10 <= 255, "numHashFunctions (%s) must be <= 255", i10);
        this.f58451b = (BloomFilterStrategies.a) w.E(aVar);
        this.f58452c = i10;
        this.f58453d = (Funnel) w.E(funnel);
        this.f58454e = (Strategy) w.E(strategy);
    }

    public static <T> BloomFilter<T> h(Funnel<? super T> funnel, int i10) {
        return j(funnel, i10);
    }

    public static <T> BloomFilter<T> i(Funnel<? super T> funnel, int i10, double d10) {
        return k(funnel, i10, d10);
    }

    public static <T> BloomFilter<T> j(Funnel<? super T> funnel, long j10) {
        return k(funnel, j10, 0.03d);
    }

    public static <T> BloomFilter<T> k(Funnel<? super T> funnel, long j10, double d10) {
        return l(funnel, j10, d10, BloomFilterStrategies.MURMUR128_MITZ_64);
    }

    @o9.d
    static <T> BloomFilter<T> l(Funnel<? super T> funnel, long j10, double d10, Strategy strategy) {
        w.E(funnel);
        w.p(j10 >= 0, "Expected insertions (%s) must be >= 0", j10);
        w.u(d10 > 0.0d, "False positive probability (%s) must be > 0.0", Double.valueOf(d10));
        w.u(d10 < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(d10));
        w.E(strategy);
        if (j10 == 0) {
            j10 = 1;
        }
        long jP = p(j10, d10);
        try {
            return new BloomFilter<>(new BloomFilterStrategies.a(jP), q(j10, jP), funnel, strategy);
        } catch (IllegalArgumentException e10) {
            StringBuilder sb2 = new StringBuilder(57);
            sb2.append("Could not create BloomFilter of ");
            sb2.append(jP);
            sb2.append(" bits");
            throw new IllegalArgumentException(sb2.toString(), e10);
        }
    }

    @o9.d
    static long p(long j10, double d10) {
        if (d10 == 0.0d) {
            d10 = Double.MIN_VALUE;
        }
        return (long) (((-j10) * Math.log(d10)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    @o9.d
    static int q(long j10, long j11) {
        return Math.max(1, (int) Math.round((j11 / j10) * Math.log(2.0d)));
    }

    public static <T> BloomFilter<T> t(InputStream inputStream, Funnel<? super T> funnel) throws IOException {
        int i10;
        int iP;
        w.F(inputStream, "InputStream");
        w.F(funnel, "Funnel");
        int i11 = -1;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            byte b10 = dataInputStream.readByte();
            try {
                iP = UnsignedBytes.p(dataInputStream.readByte());
                try {
                    i11 = dataInputStream.readInt();
                    BloomFilterStrategies bloomFilterStrategies = BloomFilterStrategies.values()[b10];
                    BloomFilterStrategies.a aVar = new BloomFilterStrategies.a(LongMath.d(i11, 64L));
                    for (int i12 = 0; i12 < i11; i12++) {
                        aVar.g(i12, dataInputStream.readLong());
                    }
                    return new BloomFilter<>(aVar, iP, funnel, bloomFilterStrategies);
                } catch (RuntimeException e10) {
                    e = e10;
                    int i13 = i11;
                    i11 = b10;
                    i10 = i13;
                    StringBuilder sb2 = new StringBuilder(134);
                    sb2.append("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
                    sb2.append(i11);
                    sb2.append(" numHashFunctions: ");
                    sb2.append(iP);
                    sb2.append(" dataLength: ");
                    sb2.append(i10);
                    throw new IOException(sb2.toString(), e);
                }
            } catch (RuntimeException e11) {
                e = e11;
                iP = -1;
                i11 = b10;
                i10 = -1;
            }
        } catch (RuntimeException e12) {
            e = e12;
            i10 = -1;
            iP = -1;
        }
    }

    private Object u() {
        return new SerialForm(this);
    }

    @Override // com.google.common.base.x
    @Deprecated
    public boolean apply(@t T t10) {
        return o(t10);
    }

    public long e() {
        double dB = this.f58451b.b();
        return com.google.common.math.c.q(((-Math.log1p(-(this.f58451b.a() / dB))) * dB) / ((double) this.f58452c), RoundingMode.HALF_UP);
    }

    @Override // com.google.common.base.x
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        BloomFilter bloomFilter = (BloomFilter) obj;
        return this.f58452c == bloomFilter.f58452c && this.f58453d.equals(bloomFilter.f58453d) && this.f58451b.equals(bloomFilter.f58451b) && this.f58454e.equals(bloomFilter.f58454e);
    }

    @o9.d
    long f() {
        return this.f58451b.b();
    }

    public BloomFilter<T> g() {
        return new BloomFilter<>(this.f58451b.c(), this.f58452c, this.f58453d, this.f58454e);
    }

    public int hashCode() {
        return com.google.common.base.s.b(Integer.valueOf(this.f58452c), this.f58453d, this.f58454e, this.f58451b);
    }

    public double m() {
        return Math.pow(this.f58451b.a() / f(), this.f58452c);
    }

    public boolean n(BloomFilter<T> bloomFilter) {
        w.E(bloomFilter);
        return this != bloomFilter && this.f58452c == bloomFilter.f58452c && f() == bloomFilter.f() && this.f58454e.equals(bloomFilter.f58454e) && this.f58453d.equals(bloomFilter.f58453d);
    }

    public boolean o(@t T t10) {
        return this.f58454e.mightContain(t10, this.f58453d, this.f58452c, this.f58451b);
    }

    @s9.a
    public boolean r(@t T t10) {
        return this.f58454e.put(t10, this.f58453d, this.f58452c, this.f58451b);
    }

    public void s(BloomFilter<T> bloomFilter) {
        w.E(bloomFilter);
        w.e(this != bloomFilter, "Cannot combine a BloomFilter with itself.");
        int i10 = this.f58452c;
        int i11 = bloomFilter.f58452c;
        w.m(i10 == i11, "BloomFilters must have the same number of hash functions (%s != %s)", i10, i11);
        w.s(f() == bloomFilter.f(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", f(), bloomFilter.f());
        w.y(this.f58454e.equals(bloomFilter.f58454e), "BloomFilters must have equal strategies (%s != %s)", this.f58454e, bloomFilter.f58454e);
        w.y(this.f58453d.equals(bloomFilter.f58453d), "BloomFilters must have equal funnels (%s != %s)", this.f58453d, bloomFilter.f58453d);
        this.f58451b.f(bloomFilter.f58451b);
    }

    public void v(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(SignedBytes.a(this.f58454e.ordinal()));
        dataOutputStream.writeByte(UnsignedBytes.a(this.f58452c));
        dataOutputStream.writeInt(this.f58451b.f58460a.length());
        for (int i10 = 0; i10 < this.f58451b.f58460a.length(); i10++) {
            dataOutputStream.writeLong(this.f58451b.f58460a.get(i10));
        }
    }
}
