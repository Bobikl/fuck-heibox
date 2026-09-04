package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.j1;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.c0;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v;

/* JADX INFO: compiled from: IndexSeeker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @j1
    static final long f45257h = 100000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f45258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v f45259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v f45260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f45261g;

    public b(long j10, long j11, long j12) {
        this.f45261g = j10;
        this.f45258d = j12;
        v vVar = new v();
        this.f45259e = vVar;
        v vVar2 = new v();
        this.f45260f = vVar2;
        vVar.a(0L);
        vVar2.a(j11);
    }

    public boolean a(long j10) {
        v vVar = this.f45259e;
        return j10 - vVar.b(vVar.c() - 1) < f45257h;
    }

    public void b(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f45259e.a(j10);
        this.f45260f.a(j11);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.g
    public long c(long j10) {
        return this.f45259e.b(u0.g(this.f45260f, j10, true, true));
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public b0.a d(long j10) {
        int iG = u0.g(this.f45259e, j10, true, true);
        c0 c0Var = new c0(this.f45259e.b(iG), this.f45260f.b(iG));
        if (c0Var.f44855a == j10 || iG == this.f45259e.c() - 1) {
            return new b0.a(c0Var);
        }
        int i10 = iG + 1;
        return new b0.a(c0Var, new c0(this.f45259e.b(i10), this.f45260f.b(i10)));
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public boolean e() {
        return true;
    }

    void f(long j10) {
        this.f45261g = j10;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.g
    public long h() {
        return this.f45258d;
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public long i() {
        return this.f45261g;
    }
}
