package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: SampleDataQueue.java */
/* JADX INFO: loaded from: classes7.dex */
public class a1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f47461h = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f47462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f47464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f47465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f47466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f47467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f47468g;

    /* JADX INFO: compiled from: SampleDataQueue.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f47469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f47470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f47471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public com.google.android.exoplayer2.upstream.a f47472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        public a f47473e;

        public a(long j10, int i10) {
            this.f47469a = j10;
            this.f47470b = j10 + ((long) i10);
        }

        public a a() {
            this.f47472d = null;
            a aVar = this.f47473e;
            this.f47473e = null;
            return aVar;
        }

        public void b(com.google.android.exoplayer2.upstream.a aVar, a aVar2) {
            this.f47472d = aVar;
            this.f47473e = aVar2;
            this.f47471c = true;
        }

        public int c(long j10) {
            return ((int) (j10 - this.f47469a)) + this.f47472d.f50929b;
        }
    }

    public a1(com.google.android.exoplayer2.upstream.b bVar) {
        this.f47462a = bVar;
        int iF = bVar.f();
        this.f47463b = iF;
        this.f47464c = new com.google.android.exoplayer2.util.e0(32);
        a aVar = new a(0L, iF);
        this.f47465d = aVar;
        this.f47466e = aVar;
        this.f47467f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f47471c) {
            a aVar2 = this.f47467f;
            boolean z10 = aVar2.f47471c;
            int i10 = (z10 ? 1 : 0) + (((int) (aVar2.f47469a - aVar.f47469a)) / this.f47463b);
            com.google.android.exoplayer2.upstream.a[] aVarArr = new com.google.android.exoplayer2.upstream.a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = aVar.f47472d;
                aVar = aVar.a();
            }
            this.f47462a.e(aVarArr);
        }
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f47470b) {
            aVar = aVar.f47473e;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f47468g + ((long) i10);
        this.f47468g = j10;
        a aVar = this.f47467f;
        if (j10 == aVar.f47470b) {
            this.f47467f = aVar.f47473e;
        }
    }

    private int h(int i10) {
        a aVar = this.f47467f;
        if (!aVar.f47471c) {
            aVar.b(this.f47462a.d(), new a(this.f47467f.f47470b, this.f47463b));
        }
        return Math.min(i10, (int) (this.f47467f.f47470b - this.f47468g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarD = d(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarD.f47470b - j10));
            byteBuffer.put(aVarD.f47472d.f50928a, aVarD.c(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f47470b) {
                aVarD = aVarD.f47473e;
            }
        }
        return aVarD;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a aVarD = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarD.f47470b - j10));
            System.arraycopy(aVarD.f47472d.f50928a, aVarD.c(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f47470b) {
                aVarD = aVarD.f47473e;
            }
        }
        return aVarD;
    }

    private static a k(a aVar, DecoderInputBuffer decoderInputBuffer, c1.b bVar, com.google.android.exoplayer2.util.e0 e0Var) {
        long j10 = bVar.f47615b;
        int iM = 1;
        e0Var.O(1);
        a aVarJ = j(aVar, j10, e0Var.d(), 1);
        long j11 = j10 + 1;
        byte b10 = e0Var.d()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        com.google.android.exoplayer2.decoder.d dVar = decoderInputBuffer.f44487d;
        byte[] bArr = dVar.f44500a;
        if (bArr == null) {
            dVar.f44500a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j11, dVar.f44500a, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            e0Var.O(2);
            aVarJ2 = j(aVarJ2, j12, e0Var.d(), 2);
            j12 += 2;
            iM = e0Var.M();
        }
        int i11 = iM;
        int[] iArr = dVar.f44503d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = dVar.f44504e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            e0Var.O(i12);
            aVarJ2 = j(aVarJ2, j12, e0Var.d(), i12);
            j12 += (long) i12;
            e0Var.S(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = e0Var.M();
                iArr4[i13] = e0Var.K();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f47614a - ((int) (j12 - bVar.f47615b));
        }
        com.google.android.exoplayer2.extractor.e0.a aVar2 = (com.google.android.exoplayer2.extractor.e0.a) com.google.android.exoplayer2.util.u0.k(bVar.f47616c);
        dVar.c(i11, iArr2, iArr4, aVar2.f44874b, dVar.f44500a, aVar2.f44873a, aVar2.f44875c, aVar2.f44876d);
        long j13 = bVar.f47615b;
        int i14 = (int) (j12 - j13);
        bVar.f47615b = j13 + ((long) i14);
        bVar.f47614a -= i14;
        return aVarJ2;
    }

    private static a l(a aVar, DecoderInputBuffer decoderInputBuffer, c1.b bVar, com.google.android.exoplayer2.util.e0 e0Var) {
        if (decoderInputBuffer.q()) {
            aVar = k(aVar, decoderInputBuffer, bVar, e0Var);
        }
        if (!decoderInputBuffer.i()) {
            decoderInputBuffer.o(bVar.f47614a);
            return i(aVar, bVar.f47615b, decoderInputBuffer.f44488e, bVar.f47614a);
        }
        e0Var.O(4);
        a aVarJ = j(aVar, bVar.f47615b, e0Var.d(), 4);
        int iK = e0Var.K();
        bVar.f47615b += 4;
        bVar.f47614a -= 4;
        decoderInputBuffer.o(iK);
        a aVarI = i(aVarJ, bVar.f47615b, decoderInputBuffer.f44488e, iK);
        bVar.f47615b += (long) iK;
        int i10 = bVar.f47614a - iK;
        bVar.f47614a = i10;
        decoderInputBuffer.s(i10);
        return i(aVarI, bVar.f47615b, decoderInputBuffer.f44491h, bVar.f47614a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f47465d;
            if (j10 < aVar.f47470b) {
                break;
            }
            this.f47462a.b(aVar.f47472d);
            this.f47465d = this.f47465d.a();
        }
        if (this.f47466e.f47469a < aVar.f47469a) {
            this.f47466e = aVar;
        }
    }

    public void c(long j10) {
        this.f47468g = j10;
        if (j10 != 0) {
            a aVar = this.f47465d;
            if (j10 != aVar.f47469a) {
                while (this.f47468g > aVar.f47470b) {
                    aVar = aVar.f47473e;
                }
                a aVar2 = aVar.f47473e;
                a(aVar2);
                a aVar3 = new a(aVar.f47470b, this.f47463b);
                aVar.f47473e = aVar3;
                if (this.f47468g == aVar.f47470b) {
                    aVar = aVar3;
                }
                this.f47467f = aVar;
                if (this.f47466e == aVar2) {
                    this.f47466e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f47465d);
        a aVar4 = new a(this.f47468g, this.f47463b);
        this.f47465d = aVar4;
        this.f47466e = aVar4;
        this.f47467f = aVar4;
    }

    public long e() {
        return this.f47468g;
    }

    public void f(DecoderInputBuffer decoderInputBuffer, c1.b bVar) {
        l(this.f47466e, decoderInputBuffer, bVar, this.f47464c);
    }

    public void m(DecoderInputBuffer decoderInputBuffer, c1.b bVar) {
        this.f47466e = l(this.f47466e, decoderInputBuffer, bVar, this.f47464c);
    }

    public void n() {
        a(this.f47465d);
        a aVar = new a(0L, this.f47463b);
        this.f47465d = aVar;
        this.f47466e = aVar;
        this.f47467f = aVar;
        this.f47468g = 0L;
        this.f47462a.c();
    }

    public void o() {
        this.f47466e = this.f47465d;
    }

    public int p(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10) throws IOException {
        int iH = h(i10);
        a aVar = this.f47467f;
        int i11 = kVar.read(aVar.f47472d.f50928a, aVar.c(this.f47468g), iH);
        if (i11 != -1) {
            g(i11);
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
        while (i10 > 0) {
            int iH = h(i10);
            a aVar = this.f47467f;
            e0Var.k(aVar.f47472d.f50928a, aVar.c(this.f47468g), iH);
            i10 -= iH;
            g(iH);
        }
    }
}
