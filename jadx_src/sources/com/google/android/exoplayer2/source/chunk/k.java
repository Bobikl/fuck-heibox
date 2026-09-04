package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.upstream.r0;
import java.io.IOException;

/* JADX INFO: compiled from: ContainerMediaChunk.java */
/* JADX INFO: loaded from: classes7.dex */
public class k extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f47687o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f47688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final g f47689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f47690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f47691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f47692t;

    public k(com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.upstream.r rVar, a2 a2Var, int i10, @p0 Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, g gVar) {
        super(oVar, rVar, a2Var, i10, obj, j10, j11, j12, j13, j14);
        this.f47687o = i11;
        this.f47688p = j15;
        this.f47689q = gVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() throws IOException {
        if (this.f47690r == 0) {
            c cVarJ = j();
            cVarJ.c(this.f47688p);
            g gVar = this.f47689q;
            g.b bVarL = l(cVarJ);
            long j10 = this.f47619k;
            long j11 = j10 == com.google.android.exoplayer2.j.f46377b ? -9223372036854775807L : j10 - this.f47688p;
            long j12 = this.f47620l;
            gVar.c(bVarL, j11, j12 == com.google.android.exoplayer2.j.f46377b ? -9223372036854775807L : j12 - this.f47688p);
        }
        try {
            com.google.android.exoplayer2.upstream.r rVarE = this.f47648b.e(this.f47690r);
            r0 r0Var = this.f47655i;
            com.google.android.exoplayer2.extractor.g gVar2 = new com.google.android.exoplayer2.extractor.g(r0Var, rVarE.f51200g, r0Var.a(rVarE));
            do {
                try {
                    if (this.f47691s) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.f47690r = gVar2.getPosition() - this.f47648b.f51200g;
                    throw th2;
                }
            } while (this.f47689q.a(gVar2));
            this.f47690r = gVar2.getPosition() - this.f47648b.f51200g;
            com.google.android.exoplayer2.upstream.q.a(this.f47655i);
            this.f47692t = !this.f47691s;
        } catch (Throwable th3) {
            com.google.android.exoplayer2.upstream.q.a(this.f47655i);
            throw th3;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void c() {
        this.f47691s = true;
    }

    @Override // com.google.android.exoplayer2.source.chunk.n
    public long g() {
        return this.f47700j + ((long) this.f47687o);
    }

    @Override // com.google.android.exoplayer2.source.chunk.n
    public boolean h() {
        return this.f47692t;
    }

    protected g.b l(c cVar) {
        return cVar;
    }
}
