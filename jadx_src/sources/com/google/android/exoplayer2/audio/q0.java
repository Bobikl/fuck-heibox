package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SilenceSkippingAudioProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends y {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f44201u = 150000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f44202v = 20000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final short f44203w = 1024;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f44204x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f44205y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f44206z = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f44207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f44208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final short f44209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f44210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f44211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f44212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte[] f44213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f44214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f44215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f44216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f44217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f44218t;

    public q0() {
        this(f44201u, f44202v, f44203w);
    }

    public q0(long j10, long j11, short s10) {
        com.google.android.exoplayer2.util.a.a(j11 <= j10);
        this.f44207i = j10;
        this.f44208j = j11;
        this.f44209k = s10;
        byte[] bArr = com.google.android.exoplayer2.util.u0.f51541f;
        this.f44212n = bArr;
        this.f44213o = bArr;
    }

    private int l(long j10) {
        return (int) ((j10 * ((long) this.f44352b.f43948a)) / 1000000);
    }

    private int m(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f44209k);
        int i10 = this.f44210l;
        return ((iLimit / i10) * i10) + i10;
    }

    private int n(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f44209k) {
                int i10 = this.f44210l;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    private void p(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        k(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f44217s = true;
        }
    }

    private void q(byte[] bArr, int i10) {
        k(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f44217s = true;
        }
    }

    private void r(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iN = n(byteBuffer);
        int iPosition = iN - byteBuffer.position();
        byte[] bArr = this.f44212n;
        int length = bArr.length;
        int i10 = this.f44215q;
        int i11 = length - i10;
        if (iN < iLimit && iPosition < i11) {
            q(bArr, i10);
            this.f44215q = 0;
            this.f44214p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i11);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f44212n, this.f44215q, iMin);
        int i12 = this.f44215q + iMin;
        this.f44215q = i12;
        byte[] bArr2 = this.f44212n;
        if (i12 == bArr2.length) {
            if (this.f44217s) {
                q(bArr2, this.f44216r);
                this.f44218t += (long) ((this.f44215q - (this.f44216r * 2)) / this.f44210l);
            } else {
                this.f44218t += (long) ((i12 - this.f44216r) / this.f44210l);
            }
            v(byteBuffer, this.f44212n, this.f44215q);
            this.f44215q = 0;
            this.f44214p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void s(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f44212n.length));
        int iM = m(byteBuffer);
        if (iM == byteBuffer.position()) {
            this.f44214p = 1;
        } else {
            byteBuffer.limit(iM);
            p(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void t(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iN = n(byteBuffer);
        byteBuffer.limit(iN);
        this.f44218t += (long) (byteBuffer.remaining() / this.f44210l);
        v(byteBuffer, this.f44213o, this.f44216r);
        if (iN < iLimit) {
            q(this.f44213o, this.f44216r);
            this.f44214p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void v(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.f44216r);
        int i11 = this.f44216r - iMin;
        System.arraycopy(bArr, i10 - i11, this.f44213o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f44213o, i11, iMin);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !f()) {
            int i10 = this.f44214p;
            if (i10 == 0) {
                s(byteBuffer);
            } else if (i10 == 1) {
                r(byteBuffer);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                t(byteBuffer);
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.y
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f43950c == 2) {
            return this.f44211m ? aVar : AudioProcessor.a.f43947e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.y
    protected void h() {
        if (this.f44211m) {
            this.f44210l = this.f44352b.f43951d;
            int iL = l(this.f44207i) * this.f44210l;
            if (this.f44212n.length != iL) {
                this.f44212n = new byte[iL];
            }
            int iL2 = l(this.f44208j) * this.f44210l;
            this.f44216r = iL2;
            if (this.f44213o.length != iL2) {
                this.f44213o = new byte[iL2];
            }
        }
        this.f44214p = 0;
        this.f44218t = 0L;
        this.f44215q = 0;
        this.f44217s = false;
    }

    @Override // com.google.android.exoplayer2.audio.y
    protected void i() {
        int i10 = this.f44215q;
        if (i10 > 0) {
            q(this.f44212n, i10);
        }
        if (this.f44217s) {
            return;
        }
        this.f44218t += (long) (this.f44216r / this.f44210l);
    }

    @Override // com.google.android.exoplayer2.audio.y, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f44211m;
    }

    @Override // com.google.android.exoplayer2.audio.y
    protected void j() {
        this.f44211m = false;
        this.f44216r = 0;
        byte[] bArr = com.google.android.exoplayer2.util.u0.f51541f;
        this.f44212n = bArr;
        this.f44213o = bArr;
    }

    public long o() {
        return this.f44218t;
    }

    public void u(boolean z10) {
        this.f44211m = z10;
    }
}
