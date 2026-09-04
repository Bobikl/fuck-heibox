package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.upstream.r0;
import java.io.IOException;

/* JADX INFO: compiled from: InitializationChunk.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f47696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g.b f47697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f47698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f47699m;

    public m(com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.upstream.r rVar, a2 a2Var, int i10, @p0 Object obj, g gVar) {
        super(oVar, rVar, 2, a2Var, i10, obj, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b);
        this.f47696j = gVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() throws IOException {
        if (this.f47698l == 0) {
            this.f47696j.c(this.f47697k, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b);
        }
        try {
            com.google.android.exoplayer2.upstream.r rVarE = this.f47648b.e(this.f47698l);
            r0 r0Var = this.f47655i;
            com.google.android.exoplayer2.extractor.g gVar = new com.google.android.exoplayer2.extractor.g(r0Var, rVarE.f51200g, r0Var.a(rVarE));
            while (!this.f47699m && this.f47696j.a(gVar)) {
                try {
                } catch (Throwable th2) {
                    this.f47698l = gVar.getPosition() - this.f47648b.f51200g;
                    throw th2;
                }
            }
            this.f47698l = gVar.getPosition() - this.f47648b.f51200g;
            com.google.android.exoplayer2.upstream.q.a(this.f47655i);
        } catch (Throwable th3) {
            com.google.android.exoplayer2.upstream.q.a(this.f47655i);
            throw th3;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void c() {
        this.f47699m = true;
    }

    public void g(g.b bVar) {
        this.f47697k = bVar;
    }
}
