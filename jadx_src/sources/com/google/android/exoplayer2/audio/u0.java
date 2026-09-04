package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TrimmingAudioProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u0 extends y {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f44285p = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f44286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f44287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f44288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f44289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f44290m = com.google.android.exoplayer2.util.u0.f51541f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f44291n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f44292o;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f44289l);
        this.f44292o += (long) (iMin / this.f44352b.f43951d);
        this.f44289l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f44289l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f44291n + i11) - this.f44290m.length;
        ByteBuffer byteBufferK = k(length);
        int iS = com.google.android.exoplayer2.util.u0.s(length, 0, this.f44291n);
        byteBufferK.put(this.f44290m, 0, iS);
        int iS2 = com.google.android.exoplayer2.util.u0.s(length - iS, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iS2);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iS2;
        int i13 = this.f44291n - iS;
        this.f44291n = i13;
        byte[] bArr = this.f44290m;
        System.arraycopy(bArr, iS, bArr, 0, i13);
        byteBuffer.get(this.f44290m, this.f44291n, i12);
        this.f44291n += i12;
        byteBufferK.flip();
    }

    @Override // com.google.android.exoplayer2.audio.y, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean b() {
        return super.b() && this.f44291n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.y, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer d() {
        int i10;
        if (super.b() && (i10 = this.f44291n) > 0) {
            k(i10).put(this.f44290m, 0, this.f44291n).flip();
            this.f44291n = 0;
        }
        return super.d();
    }

    @Override // com.google.android.exoplayer2.audio.y
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f43950c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f44288k = true;
        return (this.f44286i == 0 && this.f44287j == 0) ? AudioProcessor.a.f43947e : aVar;
    }

    @Override // com.google.android.exoplayer2.audio.y
    protected void h() {
        if (this.f44288k) {
            this.f44288k = false;
            int i10 = this.f44287j;
            int i11 = this.f44352b.f43951d;
            this.f44290m = new byte[i10 * i11];
            this.f44289l = this.f44286i * i11;
        }
        this.f44291n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.y
    protected void i() {
        if (this.f44288k) {
            int i10 = this.f44291n;
            if (i10 > 0) {
                this.f44292o += (long) (i10 / this.f44352b.f43951d);
            }
            this.f44291n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.y
    protected void j() {
        this.f44290m = com.google.android.exoplayer2.util.u0.f51541f;
    }

    public long l() {
        return this.f44292o;
    }

    public void m() {
        this.f44292o = 0L;
    }

    public void n(int i10, int i11) {
        this.f44286i = i10;
        this.f44287j = i11;
    }
}
