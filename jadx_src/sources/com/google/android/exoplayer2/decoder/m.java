package com.google.android.exoplayer2.decoder;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: VideoDecoderOutputBuffer.java */
/* JADX INFO: loaded from: classes7.dex */
public class m extends h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f44565p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f44566q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f44567r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f44568s = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    public ByteBuffer f44571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    public a2 f44574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    public ByteBuffer[] f44575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    public int[] f44576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f44577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    public ByteBuffer f44578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final h.a<m> f44579o;

    public m(h.a<m> aVar) {
        this.f44579o = aVar;
    }

    private static boolean r(int i10, int i11) {
        return i10 >= 0 && i11 >= 0 && (i11 <= 0 || i10 < Integer.MAX_VALUE / i11);
    }

    @Override // com.google.android.exoplayer2.decoder.h
    public void n() {
        this.f44579o.a(this);
    }

    public void o(long j10, int i10, @p0 ByteBuffer byteBuffer) {
        this.f44523c = j10;
        this.f44570f = i10;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.f44578n = null;
            return;
        }
        e(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.f44578n;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.f44578n = ByteBuffer.allocate(iLimit);
        } else {
            this.f44578n.clear();
        }
        this.f44578n.put(byteBuffer);
        this.f44578n.flip();
        byteBuffer.position(0);
    }

    public void p(int i10, int i11) {
        this.f44572h = i10;
        this.f44573i = i11;
    }

    public boolean q(int i10, int i11, int i12, int i13, int i14) {
        this.f44572h = i10;
        this.f44573i = i11;
        this.f44577m = i14;
        int i15 = (int) ((((long) i11) + 1) / 2);
        if (r(i12, i11) && r(i13, i15)) {
            int i16 = i11 * i12;
            int i17 = i15 * i13;
            int i18 = (i17 * 2) + i16;
            if (r(i17, 2) && i18 >= i16) {
                ByteBuffer byteBuffer = this.f44571g;
                if (byteBuffer == null || byteBuffer.capacity() < i18) {
                    this.f44571g = ByteBuffer.allocateDirect(i18);
                } else {
                    this.f44571g.position(0);
                    this.f44571g.limit(i18);
                }
                if (this.f44575k == null) {
                    this.f44575k = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.f44571g;
                ByteBuffer[] byteBufferArr = this.f44575k;
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferArr[0] = byteBufferSlice;
                byteBufferSlice.limit(i16);
                byteBuffer2.position(i16);
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                byteBufferArr[1] = byteBufferSlice2;
                byteBufferSlice2.limit(i17);
                byteBuffer2.position(i16 + i17);
                ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                byteBufferArr[2] = byteBufferSlice3;
                byteBufferSlice3.limit(i17);
                if (this.f44576l == null) {
                    this.f44576l = new int[3];
                }
                int[] iArr = this.f44576l;
                iArr[0] = i12;
                iArr[1] = i13;
                iArr[2] = i13;
                return true;
            }
        }
        return false;
    }
}
