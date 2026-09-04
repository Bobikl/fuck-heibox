package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: SonicAudioProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s0 implements AudioProcessor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f44251q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f44252r = 1.0E-4f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f44253s = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f44255c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f44256d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f44257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AudioProcessor.a f44258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AudioProcessor.a f44259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioProcessor.a f44260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f44261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private r0 f44262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteBuffer f44263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ShortBuffer f44264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ByteBuffer f44265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f44266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f44267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f44268p;

    public s0() {
        AudioProcessor.a aVar = AudioProcessor.a.f43947e;
        this.f44257e = aVar;
        this.f44258f = aVar;
        this.f44259g = aVar;
        this.f44260h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f43946a;
        this.f44263k = byteBuffer;
        this.f44264l = byteBuffer.asShortBuffer();
        this.f44265m = byteBuffer;
        this.f44254b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            r0 r0Var = (r0) com.google.android.exoplayer2.util.a.g(this.f44262j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f44266n += (long) iRemaining;
            r0Var.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean b() {
        r0 r0Var;
        return this.f44268p && ((r0Var = this.f44262j) == null || r0Var.k() == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c() {
        r0 r0Var = this.f44262j;
        if (r0Var != null) {
            r0Var.s();
        }
        this.f44268p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer d() {
        int iK;
        r0 r0Var = this.f44262j;
        if (r0Var != null && (iK = r0Var.k()) > 0) {
            if (this.f44263k.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f44263k = byteBufferOrder;
                this.f44264l = byteBufferOrder.asShortBuffer();
            } else {
                this.f44263k.clear();
                this.f44264l.clear();
            }
            r0Var.j(this.f44264l);
            this.f44267o += (long) iK;
            this.f44263k.limit(iK);
            this.f44265m = this.f44263k;
        }
        ByteBuffer byteBuffer = this.f44265m;
        this.f44265m = AudioProcessor.f43946a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public AudioProcessor.a e(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f43950c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i10 = this.f44254b;
        if (i10 == -1) {
            i10 = aVar.f43948a;
        }
        this.f44257e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f43949b, 2);
        this.f44258f = aVar2;
        this.f44261i = true;
        return aVar2;
    }

    public long f(long j10) {
        if (this.f44267o < 1024) {
            return (long) (((double) this.f44255c) * j10);
        }
        long jL = this.f44266n - ((long) ((r0) com.google.android.exoplayer2.util.a.g(this.f44262j)).l());
        int i10 = this.f44260h.f43948a;
        int i11 = this.f44259g.f43948a;
        return i10 == i11 ? com.google.android.exoplayer2.util.u0.j1(j10, jL, this.f44267o) : com.google.android.exoplayer2.util.u0.j1(j10, jL * ((long) i10), this.f44267o * ((long) i11));
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.f44257e;
            this.f44259g = aVar;
            AudioProcessor.a aVar2 = this.f44258f;
            this.f44260h = aVar2;
            if (this.f44261i) {
                this.f44262j = new r0(aVar.f43948a, aVar.f43949b, this.f44255c, this.f44256d, aVar2.f43948a);
            } else {
                r0 r0Var = this.f44262j;
                if (r0Var != null) {
                    r0Var.i();
                }
            }
        }
        this.f44265m = AudioProcessor.f43946a;
        this.f44266n = 0L;
        this.f44267o = 0L;
        this.f44268p = false;
    }

    public void g(int i10) {
        this.f44254b = i10;
    }

    public void h(float f10) {
        if (this.f44256d != f10) {
            this.f44256d = f10;
            this.f44261i = true;
        }
    }

    public void i(float f10) {
        if (this.f44255c != f10) {
            this.f44255c = f10;
            this.f44261i = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f44258f.f43948a != -1 && (Math.abs(this.f44255c - 1.0f) >= 1.0E-4f || Math.abs(this.f44256d - 1.0f) >= 1.0E-4f || this.f44258f.f43948a != this.f44257e.f43948a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.f44255c = 1.0f;
        this.f44256d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f43947e;
        this.f44257e = aVar;
        this.f44258f = aVar;
        this.f44259g = aVar;
        this.f44260h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f43946a;
        this.f44263k = byteBuffer;
        this.f44264l = byteBuffer.asShortBuffer();
        this.f44265m = byteBuffer;
        this.f44254b = -1;
        this.f44261i = false;
        this.f44262j = null;
        this.f44266n = 0L;
        this.f44267o = 0L;
        this.f44268p = false;
    }
}
