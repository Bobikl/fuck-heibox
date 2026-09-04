package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.e0;
import java.io.IOException;

/* JADX INFO: compiled from: SingleSampleMediaChunk.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f47713o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final a2 f47714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f47715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f47716r;

    public r(com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.upstream.r rVar, a2 a2Var, int i10, @p0 Object obj, long j10, long j11, long j12, int i11, a2 a2Var2) {
        super(oVar, rVar, a2Var, i10, obj, j10, j11, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b, j12);
        this.f47713o = i11;
        this.f47714p = a2Var2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() throws IOException {
        c cVarJ = j();
        cVarJ.c(0L);
        e0 e0VarB = cVarJ.b(0, this.f47713o);
        e0VarB.d(this.f47714p);
        try {
            long jA = this.f47655i.a(this.f47648b.e(this.f47715q));
            if (jA != -1) {
                jA += this.f47715q;
            }
            com.google.android.exoplayer2.extractor.g gVar = new com.google.android.exoplayer2.extractor.g(this.f47655i, this.f47715q, jA);
            for (int iB = 0; iB != -1; iB = e0VarB.b(gVar, Integer.MAX_VALUE, true)) {
                this.f47715q += (long) iB;
            }
            e0VarB.e(this.f47653g, 1, (int) this.f47715q, 0, null);
            com.google.android.exoplayer2.upstream.q.a(this.f47655i);
            this.f47716r = true;
        } catch (Throwable th2) {
            com.google.android.exoplayer2.upstream.q.a(this.f47655i);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void c() {
    }

    @Override // com.google.android.exoplayer2.source.chunk.n
    public boolean h() {
        return this.f47716r;
    }
}
