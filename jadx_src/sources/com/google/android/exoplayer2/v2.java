package com.google.android.exoplayer2;

import java.io.IOException;

/* JADX INFO: compiled from: NoSampleRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class v2 implements m3, o3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p3 f51657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.source.d1 f51660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f51661f;

    protected void A() throws ExoPlaybackException {
    }

    protected void B() {
    }

    @Override // com.google.android.exoplayer2.o3
    public int a(a2 a2Var) throws ExoPlaybackException {
        return n3.a(0);
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean b() {
        return true;
    }

    @Override // com.google.android.exoplayer2.m3
    public final void c() {
        com.google.android.exoplayer2.util.a.i(this.f51659d == 1);
        this.f51659d = 0;
        this.f51660e = null;
        this.f51661f = false;
        s();
    }

    @Override // com.google.android.exoplayer2.m3, com.google.android.exoplayer2.o3
    public final int d() {
        return -2;
    }

    @androidx.annotation.p0
    protected final p3 e() {
        return this.f51657b;
    }

    @Override // com.google.android.exoplayer2.m3
    public final boolean f() {
        return true;
    }

    protected final int g() {
        return this.f51658c;
    }

    @Override // com.google.android.exoplayer2.m3
    public final int getState() {
        return this.f51659d;
    }

    @Override // com.google.android.exoplayer2.h3.b
    public void h(int i10, @androidx.annotation.p0 Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.m3
    public final boolean i() {
        return this.f51661f;
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.m3
    @androidx.annotation.p0
    public final com.google.android.exoplayer2.source.d1 k() {
        return this.f51660e;
    }

    @Override // com.google.android.exoplayer2.m3
    public long l() {
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.m3
    public final void m(long j10) throws ExoPlaybackException {
        this.f51661f = false;
        x(j10, false);
    }

    @Override // com.google.android.exoplayer2.m3
    @androidx.annotation.p0
    public com.google.android.exoplayer2.util.w n() {
        return null;
    }

    @Override // com.google.android.exoplayer2.m3
    public final void o() {
        this.f51661f = true;
    }

    @Override // com.google.android.exoplayer2.m3
    public final void p() throws IOException {
    }

    @Override // com.google.android.exoplayer2.m3
    public final void q(a2[] a2VarArr, com.google.android.exoplayer2.source.d1 d1Var, long j10, long j11) throws ExoPlaybackException {
        com.google.android.exoplayer2.util.a.i(!this.f51661f);
        this.f51660e = d1Var;
        y(j11);
    }

    @Override // com.google.android.exoplayer2.m3
    public final o3 r() {
        return this;
    }

    @Override // com.google.android.exoplayer2.m3
    public final void reset() {
        com.google.android.exoplayer2.util.a.i(this.f51659d == 0);
        z();
    }

    protected void s() {
    }

    @Override // com.google.android.exoplayer2.m3
    public final void setIndex(int i10) {
        this.f51658c = i10;
    }

    @Override // com.google.android.exoplayer2.m3
    public final void start() throws ExoPlaybackException {
        com.google.android.exoplayer2.util.a.i(this.f51659d == 1);
        this.f51659d = 2;
        A();
    }

    @Override // com.google.android.exoplayer2.m3
    public final void stop() {
        com.google.android.exoplayer2.util.a.i(this.f51659d == 2);
        this.f51659d = 1;
        B();
    }

    @Override // com.google.android.exoplayer2.m3
    public /* synthetic */ void t(float f10, float f11) throws ExoPlaybackException {
        l3.a(this, f10, f11);
    }

    @Override // com.google.android.exoplayer2.m3
    public final void u(p3 p3Var, a2[] a2VarArr, com.google.android.exoplayer2.source.d1 d1Var, long j10, boolean z10, boolean z11, long j11, long j12) throws ExoPlaybackException {
        com.google.android.exoplayer2.util.a.i(this.f51659d == 0);
        this.f51657b = p3Var;
        this.f51659d = 1;
        w(z10);
        q(a2VarArr, d1Var, j11, j12);
        x(j10, z10);
    }

    @Override // com.google.android.exoplayer2.o3
    public int v() throws ExoPlaybackException {
        return 0;
    }

    protected void w(boolean z10) throws ExoPlaybackException {
    }

    protected void x(long j10, boolean z10) throws ExoPlaybackException {
    }

    protected void y(long j10) throws ExoPlaybackException {
    }

    protected void z() {
    }
}
