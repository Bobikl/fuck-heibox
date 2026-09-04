package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.util.u0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: RtpPacket.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f48744l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f48745m = 65507;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f48746n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f48747o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f48748p = 65535;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f48749q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f48750r = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f48751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f48754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f48756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f48758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f48759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f48760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f48761k;

    /* JADX INFO: compiled from: RtpPacket.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f48762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f48763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte f48764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f48765d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f48766e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f48767f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f48768g = h.f48750r;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte[] f48769h = h.f48750r;

        public h i() {
            return new h(this);
        }

        public b j(byte[] bArr) {
            com.google.android.exoplayer2.util.a.g(bArr);
            this.f48768g = bArr;
            return this;
        }

        public b k(boolean z10) {
            this.f48763b = z10;
            return this;
        }

        public b l(boolean z10) {
            this.f48762a = z10;
            return this;
        }

        public b m(byte[] bArr) {
            com.google.android.exoplayer2.util.a.g(bArr);
            this.f48769h = bArr;
            return this;
        }

        public b n(byte b10) {
            this.f48764c = b10;
            return this;
        }

        public b o(int i10) {
            com.google.android.exoplayer2.util.a.a(i10 >= 0 && i10 <= 65535);
            this.f48765d = i10 & 65535;
            return this;
        }

        public b p(int i10) {
            this.f48767f = i10;
            return this;
        }

        public b q(long j10) {
            this.f48766e = j10;
            return this;
        }
    }

    private h(b bVar) {
        this.f48751a = (byte) 2;
        this.f48752b = bVar.f48762a;
        this.f48753c = false;
        this.f48755e = bVar.f48763b;
        this.f48756f = bVar.f48764c;
        this.f48757g = bVar.f48765d;
        this.f48758h = bVar.f48766e;
        this.f48759i = bVar.f48767f;
        byte[] bArr = bVar.f48768g;
        this.f48760j = bArr;
        this.f48754d = (byte) (bArr.length / 4);
        this.f48761k = bVar.f48769h;
    }

    @androidx.annotation.p0
    public static h b(com.google.android.exoplayer2.util.e0 e0Var) {
        byte[] bArr;
        if (e0Var.a() < 12) {
            return null;
        }
        int iG = e0Var.G();
        byte b10 = (byte) (iG >> 6);
        boolean z10 = ((iG >> 5) & 1) == 1;
        byte b11 = (byte) (iG & 15);
        if (b10 != 2) {
            return null;
        }
        int iG2 = e0Var.G();
        boolean z11 = ((iG2 >> 7) & 1) == 1;
        byte b12 = (byte) (iG2 & 127);
        int iM = e0Var.M();
        long jI = e0Var.I();
        int iO = e0Var.o();
        if (b11 > 0) {
            bArr = new byte[b11 * 4];
            for (int i10 = 0; i10 < b11; i10++) {
                e0Var.k(bArr, i10 * 4, 4);
            }
        } else {
            bArr = f48750r;
        }
        byte[] bArr2 = new byte[e0Var.a()];
        e0Var.k(bArr2, 0, e0Var.a());
        return new b().l(z10).k(z11).n(b12).o(iM).q(jI).p(iO).j(bArr).m(bArr2).i();
    }

    @androidx.annotation.p0
    public static h c(byte[] bArr, int i10) {
        return b(new com.google.android.exoplayer2.util.e0(bArr, i10));
    }

    public int d(byte[] bArr, int i10, int i11) {
        int length = (this.f48754d * 4) + 12 + this.f48761k.length;
        if (i11 < length || bArr.length - i10 < length) {
            return -1;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i10, i11);
        byte b10 = (byte) (((this.f48752b ? 1 : 0) << 5) | 128 | ((this.f48753c ? 1 : 0) << 4) | (this.f48754d & 15));
        byteBufferWrap.put(b10).put((byte) (((this.f48755e ? 1 : 0) << 7) | (this.f48756f & 127))).putShort((short) this.f48757g).putInt((int) this.f48758h).putInt(this.f48759i).put(this.f48760j).put(this.f48761k);
        return length;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f48756f == hVar.f48756f && this.f48757g == hVar.f48757g && this.f48755e == hVar.f48755e && this.f48758h == hVar.f48758h && this.f48759i == hVar.f48759i;
    }

    public int hashCode() {
        int i10 = (((((bb.c.b.f30674h7 + this.f48756f) * 31) + this.f48757g) * 31) + (this.f48755e ? 1 : 0)) * 31;
        long j10 = this.f48758h;
        return ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f48759i;
    }

    public String toString() {
        return u0.H("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f48756f), Integer.valueOf(this.f48757g), Long.valueOf(this.f48758h), Integer.valueOf(this.f48759i), Boolean.valueOf(this.f48755e));
    }
}
