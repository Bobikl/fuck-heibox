package com.google.android.exoplayer2;

/* JADX INFO: compiled from: DefaultMediaClock.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m implements com.google.android.exoplayer2.util.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.j0 f46560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f46561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private m3 f46562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.util.w f46563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f46564f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f46565g;

    /* JADX INFO: compiled from: DefaultMediaClock.java */
    public interface a {
        void b(b3 b3Var);
    }

    public m(a aVar, com.google.android.exoplayer2.util.e eVar) {
        this.f46561c = aVar;
        this.f46560b = new com.google.android.exoplayer2.util.j0(eVar);
    }

    private boolean d(boolean z10) {
        m3 m3Var = this.f46562d;
        return m3Var == null || m3Var.b() || (!this.f46562d.isReady() && (z10 || this.f46562d.f()));
    }

    private void j(boolean z10) {
        if (d(z10)) {
            this.f46564f = true;
            if (this.f46565g) {
                this.f46560b.b();
                return;
            }
            return;
        }
        com.google.android.exoplayer2.util.w wVar = (com.google.android.exoplayer2.util.w) com.google.android.exoplayer2.util.a.g(this.f46563e);
        long jS = wVar.s();
        if (this.f46564f) {
            if (jS < this.f46560b.s()) {
                this.f46560b.c();
                return;
            } else {
                this.f46564f = false;
                if (this.f46565g) {
                    this.f46560b.b();
                }
            }
        }
        this.f46560b.a(jS);
        b3 b3VarG = wVar.g();
        if (b3VarG.equals(this.f46560b.g())) {
            return;
        }
        this.f46560b.e(b3VarG);
        this.f46561c.b(b3VarG);
    }

    public void a(m3 m3Var) {
        if (m3Var == this.f46562d) {
            this.f46563e = null;
            this.f46562d = null;
            this.f46564f = true;
        }
    }

    public void b(m3 m3Var) throws ExoPlaybackException {
        com.google.android.exoplayer2.util.w wVar;
        com.google.android.exoplayer2.util.w wVarN = m3Var.n();
        if (wVarN == null || wVarN == (wVar = this.f46563e)) {
            return;
        }
        if (wVar != null) {
            throw ExoPlaybackException.n(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f46563e = wVarN;
        this.f46562d = m3Var;
        wVarN.e(this.f46560b.g());
    }

    public void c(long j10) {
        this.f46560b.a(j10);
    }

    @Override // com.google.android.exoplayer2.util.w
    public void e(b3 b3Var) {
        com.google.android.exoplayer2.util.w wVar = this.f46563e;
        if (wVar != null) {
            wVar.e(b3Var);
            b3Var = this.f46563e.g();
        }
        this.f46560b.e(b3Var);
    }

    public void f() {
        this.f46565g = true;
        this.f46560b.b();
    }

    @Override // com.google.android.exoplayer2.util.w
    public b3 g() {
        com.google.android.exoplayer2.util.w wVar = this.f46563e;
        return wVar != null ? wVar.g() : this.f46560b.g();
    }

    public void h() {
        this.f46565g = false;
        this.f46560b.c();
    }

    public long i(boolean z10) {
        j(z10);
        return s();
    }

    @Override // com.google.android.exoplayer2.util.w
    public long s() {
        return this.f46564f ? this.f46560b.s() : ((com.google.android.exoplayer2.util.w) com.google.android.exoplayer2.util.a.g(this.f46563e)).s();
    }
}
