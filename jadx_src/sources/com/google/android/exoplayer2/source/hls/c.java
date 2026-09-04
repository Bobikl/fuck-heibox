package com.google.android.exoplayer2.source.hls;

import androidx.annotation.j1;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.ts.h0;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.n0;
import java.io.IOException;

/* JADX INFO: compiled from: BundledHlsMediaChunkExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z f48104d = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @j1
    final com.google.android.exoplayer2.extractor.k f48105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a2 f48106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f48107c;

    public c(com.google.android.exoplayer2.extractor.k kVar, a2 a2Var, n0 n0Var) {
        this.f48105a = kVar;
        this.f48106b = a2Var;
        this.f48107c = n0Var;
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public boolean a(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        return this.f48105a.g(lVar, f48104d) == 0;
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        this.f48105a.b(mVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public void c() {
        this.f48105a.a(0L, 0L);
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public boolean d() {
        com.google.android.exoplayer2.extractor.k kVar = this.f48105a;
        return (kVar instanceof h0) || (kVar instanceof com.google.android.exoplayer2.extractor.mp4.g);
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public boolean e() {
        com.google.android.exoplayer2.extractor.k kVar = this.f48105a;
        return (kVar instanceof com.google.android.exoplayer2.extractor.ts.h) || (kVar instanceof com.google.android.exoplayer2.extractor.ts.b) || (kVar instanceof com.google.android.exoplayer2.extractor.ts.e) || (kVar instanceof com.google.android.exoplayer2.extractor.mp3.f);
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public k f() {
        com.google.android.exoplayer2.extractor.k fVar;
        com.google.android.exoplayer2.util.a.i(!d());
        com.google.android.exoplayer2.extractor.k kVar = this.f48105a;
        if (kVar instanceof w) {
            fVar = new w(this.f48106b.f43584d, this.f48107c);
        } else if (kVar instanceof com.google.android.exoplayer2.extractor.ts.h) {
            fVar = new com.google.android.exoplayer2.extractor.ts.h();
        } else if (kVar instanceof com.google.android.exoplayer2.extractor.ts.b) {
            fVar = new com.google.android.exoplayer2.extractor.ts.b();
        } else if (kVar instanceof com.google.android.exoplayer2.extractor.ts.e) {
            fVar = new com.google.android.exoplayer2.extractor.ts.e();
        } else {
            if (!(kVar instanceof com.google.android.exoplayer2.extractor.mp3.f)) {
                String simpleName = this.f48105a.getClass().getSimpleName();
                throw new IllegalStateException(simpleName.length() != 0 ? "Unexpected extractor type for recreation: ".concat(simpleName) : new String("Unexpected extractor type for recreation: "));
            }
            fVar = new com.google.android.exoplayer2.extractor.mp3.f();
        }
        return new c(fVar, this.f48106b, this.f48107c);
    }
}
