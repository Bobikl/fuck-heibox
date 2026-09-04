package com.google.android.exoplayer2;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

/* JADX INFO: compiled from: BaseRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e implements m3, o3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44763b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private p3 f44765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f44767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.source.d1 f44768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private a2[] f44769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f44770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f44771j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f44773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f44774m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b2 f44764c = new b2();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f44772k = Long.MIN_VALUE;

    public e(int i10) {
        this.f44763b = i10;
    }

    protected final int A() {
        return this.f44766e;
    }

    protected final long B() {
        return this.f44771j;
    }

    protected final a2[] C() {
        return (a2[]) com.google.android.exoplayer2.util.a.g(this.f44769h);
    }

    protected final boolean D() {
        return f() ? this.f44773l : ((com.google.android.exoplayer2.source.d1) com.google.android.exoplayer2.util.a.g(this.f44768g)).isReady();
    }

    protected void E() {
    }

    protected void F(boolean z10, boolean z11) throws ExoPlaybackException {
    }

    protected void G(long j10, boolean z10) throws ExoPlaybackException {
    }

    protected void H() {
    }

    protected void I() throws ExoPlaybackException {
    }

    protected void J() {
    }

    protected void K(a2[] a2VarArr, long j10, long j11) throws ExoPlaybackException {
    }

    protected final int L(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
        int iC = ((com.google.android.exoplayer2.source.d1) com.google.android.exoplayer2.util.a.g(this.f44768g)).c(b2Var, decoderInputBuffer, i10);
        if (iC == -4) {
            if (decoderInputBuffer.k()) {
                this.f44772k = Long.MIN_VALUE;
                return this.f44773l ? -4 : -3;
            }
            long j10 = decoderInputBuffer.f44490g + this.f44770i;
            decoderInputBuffer.f44490g = j10;
            this.f44772k = Math.max(this.f44772k, j10);
        } else if (iC == -5) {
            a2 a2Var = (a2) com.google.android.exoplayer2.util.a.g(b2Var.f44366b);
            if (a2Var.f43597q != Long.MAX_VALUE) {
                b2Var.f44366b = a2Var.c().i0(a2Var.f43597q + this.f44770i).E();
            }
        }
        return iC;
    }

    protected int M(long j10) {
        return ((com.google.android.exoplayer2.source.d1) com.google.android.exoplayer2.util.a.g(this.f44768g)).n(j10 - this.f44770i);
    }

    @Override // com.google.android.exoplayer2.m3
    public final void c() {
        com.google.android.exoplayer2.util.a.i(this.f44767f == 1);
        this.f44764c.a();
        this.f44767f = 0;
        this.f44768g = null;
        this.f44769h = null;
        this.f44773l = false;
        E();
    }

    @Override // com.google.android.exoplayer2.m3, com.google.android.exoplayer2.o3
    public final int d() {
        return this.f44763b;
    }

    @Override // com.google.android.exoplayer2.m3
    public final boolean f() {
        return this.f44772k == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.m3
    public final int getState() {
        return this.f44767f;
    }

    @Override // com.google.android.exoplayer2.h3.b
    public void h(int i10, @androidx.annotation.p0 Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.m3
    public final boolean i() {
        return this.f44773l;
    }

    @Override // com.google.android.exoplayer2.m3
    @androidx.annotation.p0
    public final com.google.android.exoplayer2.source.d1 k() {
        return this.f44768g;
    }

    @Override // com.google.android.exoplayer2.m3
    public final long l() {
        return this.f44772k;
    }

    @Override // com.google.android.exoplayer2.m3
    public final void m(long j10) throws ExoPlaybackException {
        this.f44773l = false;
        this.f44771j = j10;
        this.f44772k = j10;
        G(j10, false);
    }

    @Override // com.google.android.exoplayer2.m3
    @androidx.annotation.p0
    public com.google.android.exoplayer2.util.w n() {
        return null;
    }

    @Override // com.google.android.exoplayer2.m3
    public final void o() {
        this.f44773l = true;
    }

    @Override // com.google.android.exoplayer2.m3
    public final void p() throws IOException {
        ((com.google.android.exoplayer2.source.d1) com.google.android.exoplayer2.util.a.g(this.f44768g)).b();
    }

    @Override // com.google.android.exoplayer2.m3
    public final void q(a2[] a2VarArr, com.google.android.exoplayer2.source.d1 d1Var, long j10, long j11) throws ExoPlaybackException {
        com.google.android.exoplayer2.util.a.i(!this.f44773l);
        this.f44768g = d1Var;
        if (this.f44772k == Long.MIN_VALUE) {
            this.f44772k = j10;
        }
        this.f44769h = a2VarArr;
        this.f44770i = j11;
        K(a2VarArr, j10, j11);
    }

    @Override // com.google.android.exoplayer2.m3
    public final o3 r() {
        return this;
    }

    @Override // com.google.android.exoplayer2.m3
    public final void reset() {
        com.google.android.exoplayer2.util.a.i(this.f44767f == 0);
        this.f44764c.a();
        H();
    }

    @Override // com.google.android.exoplayer2.m3
    public final void setIndex(int i10) {
        this.f44766e = i10;
    }

    @Override // com.google.android.exoplayer2.m3
    public final void start() throws ExoPlaybackException {
        com.google.android.exoplayer2.util.a.i(this.f44767f == 1);
        this.f44767f = 2;
        I();
    }

    @Override // com.google.android.exoplayer2.m3
    public final void stop() {
        com.google.android.exoplayer2.util.a.i(this.f44767f == 2);
        this.f44767f = 1;
        J();
    }

    @Override // com.google.android.exoplayer2.m3
    public /* synthetic */ void t(float f10, float f11) throws ExoPlaybackException {
        l3.a(this, f10, f11);
    }

    @Override // com.google.android.exoplayer2.m3
    public final void u(p3 p3Var, a2[] a2VarArr, com.google.android.exoplayer2.source.d1 d1Var, long j10, boolean z10, boolean z11, long j11, long j12) throws ExoPlaybackException {
        com.google.android.exoplayer2.util.a.i(this.f44767f == 0);
        this.f44765d = p3Var;
        this.f44767f = 1;
        this.f44771j = j10;
        F(z10, z11);
        q(a2VarArr, d1Var, j11, j12);
        G(j10, z10);
    }

    @Override // com.google.android.exoplayer2.o3
    public int v() throws ExoPlaybackException {
        return 0;
    }

    protected final ExoPlaybackException w(Throwable th2, @androidx.annotation.p0 a2 a2Var, int i10) {
        return x(th2, a2Var, false, i10);
    }

    protected final ExoPlaybackException x(Throwable th2, @androidx.annotation.p0 a2 a2Var, boolean z10, int i10) {
        int iD;
        if (a2Var == null || this.f44774m) {
            iD = 4;
        } else {
            this.f44774m = true;
            try {
                iD = n3.d(a(a2Var));
                this.f44774m = false;
            } catch (ExoPlaybackException unused) {
                this.f44774m = false;
                iD = 4;
            } catch (Throwable th3) {
                this.f44774m = false;
                throw th3;
            }
        }
        return ExoPlaybackException.l(th2, getName(), A(), a2Var, iD, z10, i10);
    }

    protected final p3 y() {
        return (p3) com.google.android.exoplayer2.util.a.g(this.f44765d);
    }

    protected final b2 z() {
        this.f44764c.a();
        return this.f44764c;
    }
}
