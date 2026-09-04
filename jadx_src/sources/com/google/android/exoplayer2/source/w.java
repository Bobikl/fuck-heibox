package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.r3;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: MaskingMediaPeriod.java */
/* JADX INFO: loaded from: classes7.dex */
public final class w implements c0, c0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.a f49238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f49239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f49240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f0 f49241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c0 f49242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private c0.a f49243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private a f49244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f49245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f49246j = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: compiled from: MaskingMediaPeriod.java */
    public interface a {
        void a(f0.a aVar, IOException iOException);

        void b(f0.a aVar);
    }

    public w(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        this.f49238b = aVar;
        this.f49240d = bVar;
        this.f49239c = j10;
    }

    private long t(long j10) {
        long j11 = this.f49246j;
        return j11 != com.google.android.exoplayer2.j.f46377b ? j11 : j10;
    }

    public void A(a aVar) {
        this.f49244h = aVar;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean a() {
        c0 c0Var = this.f49242f;
        return c0Var != null && c0Var.a();
    }

    public void b(f0.a aVar) {
        long jT = t(this.f49239c);
        c0 c0VarH = ((f0) com.google.android.exoplayer2.util.a.g(this.f49241e)).h(aVar, this.f49240d, jT);
        this.f49242f = c0VarH;
        if (this.f49243g != null) {
            c0VarH.r(this, jT);
        }
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean d(long j10) {
        c0 c0Var = this.f49242f;
        return c0Var != null && c0Var.d(j10);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long e() {
        return ((c0) com.google.android.exoplayer2.util.u0.k(this.f49242f)).e();
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public void f(long j10) {
        ((c0) com.google.android.exoplayer2.util.u0.k(this.f49242f)).f(j10);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long g() {
        return ((c0) com.google.android.exoplayer2.util.u0.k(this.f49242f)).g();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long h(long j10, r3 r3Var) {
        return ((c0) com.google.android.exoplayer2.util.u0.k(this.f49242f)).h(j10, r3Var);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public /* synthetic */ List i(List list) {
        return b0.a(this, list);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long j(long j10) {
        return ((c0) com.google.android.exoplayer2.util.u0.k(this.f49242f)).j(j10);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long k() {
        return ((c0) com.google.android.exoplayer2.util.u0.k(this.f49242f)).k();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long l(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f49246j;
        if (j12 == com.google.android.exoplayer2.j.f46377b || j10 != this.f49239c) {
            j11 = j10;
        } else {
            this.f49246j = com.google.android.exoplayer2.j.f46377b;
            j11 = j12;
        }
        return ((c0) com.google.android.exoplayer2.util.u0.k(this.f49242f)).l(jVarArr, zArr, d1VarArr, zArr2, j11);
    }

    public long m() {
        return this.f49246j;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public p1 o() {
        return ((c0) com.google.android.exoplayer2.util.u0.k(this.f49242f)).o();
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    public void q(c0 c0Var) {
        ((c0.a) com.google.android.exoplayer2.util.u0.k(this.f49243g)).q(this);
        a aVar = this.f49244h;
        if (aVar != null) {
            aVar.b(this.f49238b);
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void r(c0.a aVar, long j10) {
        this.f49243g = aVar;
        c0 c0Var = this.f49242f;
        if (c0Var != null) {
            c0Var.r(this, t(this.f49239c));
        }
    }

    public long s() {
        return this.f49239c;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void u() throws IOException {
        try {
            c0 c0Var = this.f49242f;
            if (c0Var != null) {
                c0Var.u();
            } else {
                f0 f0Var = this.f49241e;
                if (f0Var != null) {
                    f0Var.f();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f49244h;
            if (aVar == null) {
                throw e10;
            }
            if (this.f49245i) {
                return;
            }
            this.f49245i = true;
            aVar.a(this.f49238b, e10);
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void v(long j10, boolean z10) {
        ((c0) com.google.android.exoplayer2.util.u0.k(this.f49242f)).v(j10, z10);
    }

    @Override // com.google.android.exoplayer2.source.e1.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void n(c0 c0Var) {
        ((c0.a) com.google.android.exoplayer2.util.u0.k(this.f49243g)).n(this);
    }

    public void x(long j10) {
        this.f49246j = j10;
    }

    public void y() {
        if (this.f49242f != null) {
            ((f0) com.google.android.exoplayer2.util.a.g(this.f49241e)).k(this.f49242f);
        }
    }

    public void z(f0 f0Var) {
        com.google.android.exoplayer2.util.a.i(this.f49241e == null);
        this.f49241e = f0Var;
    }
}
