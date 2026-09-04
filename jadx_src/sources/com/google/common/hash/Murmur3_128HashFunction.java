package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@h
@s9.j
public final class Murmur3_128HashFunction extends c implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final k f58495c = new Murmur3_128HashFunction(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final k f58496d = new Murmur3_128HashFunction(Hashing.f58475a);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58497b;

    public static final class a extends f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f58498g = 16;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f58499h = -8663945395140668459L;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f58500i = 5545529020109919103L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f58501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f58502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f58503f;

        a(int i10) {
            super(16);
            long j10 = i10;
            this.f58501d = j10;
            this.f58502e = j10;
            this.f58503f = 0;
        }

        private void v(long j10, long j11) {
            long jX = x(j10) ^ this.f58501d;
            this.f58501d = jX;
            long jRotateLeft = Long.rotateLeft(jX, 27);
            long j12 = this.f58502e;
            this.f58501d = ((jRotateLeft + j12) * 5) + 1390208809;
            long jY = y(j11) ^ j12;
            this.f58502e = jY;
            this.f58502e = ((Long.rotateLeft(jY, 31) + this.f58501d) * 5) + 944331445;
        }

        private static long w(long j10) {
            long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
            long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
            return j12 ^ (j12 >>> 33);
        }

        private static long x(long j10) {
            return Long.rotateLeft(j10 * f58499h, 31) * f58500i;
        }

        private static long y(long j10) {
            return Long.rotateLeft(j10 * f58500i, 33) * f58499h;
        }

        @Override // com.google.common.hash.f
        protected HashCode p() {
            long j10 = this.f58501d;
            int i10 = this.f58503f;
            long j11 = j10 ^ ((long) i10);
            long j12 = this.f58502e ^ ((long) i10);
            long j13 = j11 + j12;
            this.f58501d = j13;
            this.f58502e = j12 + j13;
            this.f58501d = w(j13);
            long jW = w(this.f58502e);
            long j14 = this.f58501d + jW;
            this.f58501d = j14;
            this.f58502e = jW + j14;
            return HashCode.h(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f58501d).putLong(this.f58502e).array());
        }

        @Override // com.google.common.hash.f
        protected void s(ByteBuffer byteBuffer) {
            v(byteBuffer.getLong(), byteBuffer.getLong());
            this.f58503f += 16;
        }

        @Override // com.google.common.hash.f
        protected void t(ByteBuffer byteBuffer) {
            long jP;
            long jP2;
            long jP3;
            long jP4;
            long jP5;
            long jP6;
            long jP7;
            long jP8;
            long jP9;
            long jP10;
            long jP11;
            long jP12;
            long jP13;
            long jP14;
            this.f58503f += byteBuffer.remaining();
            long j10 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    jP = 0;
                    jP7 = ((long) UnsignedBytes.p(byteBuffer.get(0))) ^ jP;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 2:
                    jP2 = 0;
                    jP = jP2 ^ (((long) UnsignedBytes.p(byteBuffer.get(1))) << 8);
                    jP7 = ((long) UnsignedBytes.p(byteBuffer.get(0))) ^ jP;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 3:
                    jP3 = 0;
                    jP2 = jP3 ^ (((long) UnsignedBytes.p(byteBuffer.get(2))) << 16);
                    jP = jP2 ^ (((long) UnsignedBytes.p(byteBuffer.get(1))) << 8);
                    jP7 = ((long) UnsignedBytes.p(byteBuffer.get(0))) ^ jP;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 4:
                    jP4 = 0;
                    jP3 = jP4 ^ (((long) UnsignedBytes.p(byteBuffer.get(3))) << 24);
                    jP2 = jP3 ^ (((long) UnsignedBytes.p(byteBuffer.get(2))) << 16);
                    jP = jP2 ^ (((long) UnsignedBytes.p(byteBuffer.get(1))) << 8);
                    jP7 = ((long) UnsignedBytes.p(byteBuffer.get(0))) ^ jP;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 5:
                    jP5 = 0;
                    jP4 = jP5 ^ (((long) UnsignedBytes.p(byteBuffer.get(4))) << 32);
                    jP3 = jP4 ^ (((long) UnsignedBytes.p(byteBuffer.get(3))) << 24);
                    jP2 = jP3 ^ (((long) UnsignedBytes.p(byteBuffer.get(2))) << 16);
                    jP = jP2 ^ (((long) UnsignedBytes.p(byteBuffer.get(1))) << 8);
                    jP7 = ((long) UnsignedBytes.p(byteBuffer.get(0))) ^ jP;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 6:
                    jP6 = 0;
                    jP5 = jP6 ^ (((long) UnsignedBytes.p(byteBuffer.get(5))) << 40);
                    jP4 = jP5 ^ (((long) UnsignedBytes.p(byteBuffer.get(4))) << 32);
                    jP3 = jP4 ^ (((long) UnsignedBytes.p(byteBuffer.get(3))) << 24);
                    jP2 = jP3 ^ (((long) UnsignedBytes.p(byteBuffer.get(2))) << 16);
                    jP = jP2 ^ (((long) UnsignedBytes.p(byteBuffer.get(1))) << 8);
                    jP7 = ((long) UnsignedBytes.p(byteBuffer.get(0))) ^ jP;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 7:
                    jP6 = (((long) UnsignedBytes.p(byteBuffer.get(6))) << 48) ^ 0;
                    jP5 = jP6 ^ (((long) UnsignedBytes.p(byteBuffer.get(5))) << 40);
                    jP4 = jP5 ^ (((long) UnsignedBytes.p(byteBuffer.get(4))) << 32);
                    jP3 = jP4 ^ (((long) UnsignedBytes.p(byteBuffer.get(3))) << 24);
                    jP2 = jP3 ^ (((long) UnsignedBytes.p(byteBuffer.get(2))) << 16);
                    jP = jP2 ^ (((long) UnsignedBytes.p(byteBuffer.get(1))) << 8);
                    jP7 = ((long) UnsignedBytes.p(byteBuffer.get(0))) ^ jP;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 8:
                    jP8 = 0;
                    jP7 = byteBuffer.getLong() ^ 0;
                    j10 = jP8;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 9:
                    jP9 = 0;
                    jP8 = jP9 ^ ((long) UnsignedBytes.p(byteBuffer.get(8)));
                    jP7 = byteBuffer.getLong() ^ 0;
                    j10 = jP8;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 10:
                    jP10 = 0;
                    jP9 = jP10 ^ (((long) UnsignedBytes.p(byteBuffer.get(9))) << 8);
                    jP8 = jP9 ^ ((long) UnsignedBytes.p(byteBuffer.get(8)));
                    jP7 = byteBuffer.getLong() ^ 0;
                    j10 = jP8;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 11:
                    jP11 = 0;
                    jP10 = jP11 ^ (((long) UnsignedBytes.p(byteBuffer.get(10))) << 16);
                    jP9 = jP10 ^ (((long) UnsignedBytes.p(byteBuffer.get(9))) << 8);
                    jP8 = jP9 ^ ((long) UnsignedBytes.p(byteBuffer.get(8)));
                    jP7 = byteBuffer.getLong() ^ 0;
                    j10 = jP8;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 12:
                    jP12 = 0;
                    jP11 = jP12 ^ (((long) UnsignedBytes.p(byteBuffer.get(11))) << 24);
                    jP10 = jP11 ^ (((long) UnsignedBytes.p(byteBuffer.get(10))) << 16);
                    jP9 = jP10 ^ (((long) UnsignedBytes.p(byteBuffer.get(9))) << 8);
                    jP8 = jP9 ^ ((long) UnsignedBytes.p(byteBuffer.get(8)));
                    jP7 = byteBuffer.getLong() ^ 0;
                    j10 = jP8;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 13:
                    jP13 = 0;
                    jP12 = jP13 ^ (((long) UnsignedBytes.p(byteBuffer.get(12))) << 32);
                    jP11 = jP12 ^ (((long) UnsignedBytes.p(byteBuffer.get(11))) << 24);
                    jP10 = jP11 ^ (((long) UnsignedBytes.p(byteBuffer.get(10))) << 16);
                    jP9 = jP10 ^ (((long) UnsignedBytes.p(byteBuffer.get(9))) << 8);
                    jP8 = jP9 ^ ((long) UnsignedBytes.p(byteBuffer.get(8)));
                    jP7 = byteBuffer.getLong() ^ 0;
                    j10 = jP8;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 14:
                    jP14 = 0;
                    jP13 = jP14 ^ (((long) UnsignedBytes.p(byteBuffer.get(13))) << 40);
                    jP12 = jP13 ^ (((long) UnsignedBytes.p(byteBuffer.get(12))) << 32);
                    jP11 = jP12 ^ (((long) UnsignedBytes.p(byteBuffer.get(11))) << 24);
                    jP10 = jP11 ^ (((long) UnsignedBytes.p(byteBuffer.get(10))) << 16);
                    jP9 = jP10 ^ (((long) UnsignedBytes.p(byteBuffer.get(9))) << 8);
                    jP8 = jP9 ^ ((long) UnsignedBytes.p(byteBuffer.get(8)));
                    jP7 = byteBuffer.getLong() ^ 0;
                    j10 = jP8;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                case 15:
                    jP14 = (((long) UnsignedBytes.p(byteBuffer.get(14))) << 48) ^ 0;
                    jP13 = jP14 ^ (((long) UnsignedBytes.p(byteBuffer.get(13))) << 40);
                    jP12 = jP13 ^ (((long) UnsignedBytes.p(byteBuffer.get(12))) << 32);
                    jP11 = jP12 ^ (((long) UnsignedBytes.p(byteBuffer.get(11))) << 24);
                    jP10 = jP11 ^ (((long) UnsignedBytes.p(byteBuffer.get(10))) << 16);
                    jP9 = jP10 ^ (((long) UnsignedBytes.p(byteBuffer.get(9))) << 8);
                    jP8 = jP9 ^ ((long) UnsignedBytes.p(byteBuffer.get(8)));
                    jP7 = byteBuffer.getLong() ^ 0;
                    j10 = jP8;
                    this.f58501d ^= x(jP7);
                    this.f58502e ^= y(j10);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    Murmur3_128HashFunction(int i10) {
        this.f58497b = i10;
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof Murmur3_128HashFunction) && this.f58497b == ((Murmur3_128HashFunction) obj).f58497b;
    }

    @Override // com.google.common.hash.k
    public int h() {
        return 128;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.f58497b;
    }

    @Override // com.google.common.hash.k
    public m i() {
        return new a(this.f58497b);
    }

    public String toString() {
        int i10 = this.f58497b;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Hashing.murmur3_128(");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }
}
