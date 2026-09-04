package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BundledExtractorsAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.extractor.q f47578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.extractor.k f47579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.extractor.l f47580c;

    public b(com.google.android.exoplayer2.extractor.q qVar) {
        this.f47578a = qVar;
    }

    @Override // com.google.android.exoplayer2.source.r0
    public void a(long j10, long j11) {
        ((com.google.android.exoplayer2.extractor.k) com.google.android.exoplayer2.util.a.g(this.f47579b)).a(j10, j11);
    }

    @Override // com.google.android.exoplayer2.source.r0
    public int b(com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        return ((com.google.android.exoplayer2.extractor.k) com.google.android.exoplayer2.util.a.g(this.f47579b)).g((com.google.android.exoplayer2.extractor.l) com.google.android.exoplayer2.util.a.g(this.f47580c), zVar);
    }

    @Override // com.google.android.exoplayer2.source.r0
    public long c() {
        com.google.android.exoplayer2.extractor.l lVar = this.f47580c;
        if (lVar != null) {
            return lVar.getPosition();
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.r0
    public void d() {
        com.google.android.exoplayer2.extractor.k kVar = this.f47579b;
        if (kVar instanceof com.google.android.exoplayer2.extractor.mp3.f) {
            ((com.google.android.exoplayer2.extractor.mp3.f) kVar).j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    @Override // com.google.android.exoplayer2.source.r0
    public void e(com.google.android.exoplayer2.upstream.k kVar, Uri uri, Map<String, List<String>> map, long j10, long j11, com.google.android.exoplayer2.extractor.m mVar) throws IOException {
        com.google.android.exoplayer2.extractor.g gVar = new com.google.android.exoplayer2.extractor.g(kVar, j10, j11);
        this.f47580c = gVar;
        if (this.f47579b != null) {
            return;
        }
        com.google.android.exoplayer2.extractor.k[] kVarArrA = this.f47578a.a(uri, map);
        if (kVarArrA.length == 1) {
            this.f47579b = kVarArrA[0];
        } else {
            for (com.google.android.exoplayer2.extractor.k kVar2 : kVarArrA) {
                try {
                    if (kVar2.f(gVar)) {
                        this.f47579b = kVar2;
                        com.google.android.exoplayer2.util.a.i(true);
                        gVar.o();
                        break;
                    } else {
                        boolean z10 = this.f47579b != null || gVar.getPosition() == j10;
                        com.google.android.exoplayer2.util.a.i(z10);
                        gVar.o();
                    }
                } catch (EOFException unused) {
                    if (this.f47579b != null || gVar.getPosition() == j10) {
                    }
                } catch (Throwable th2) {
                    com.google.android.exoplayer2.util.a.i(this.f47579b != null || gVar.getPosition() == j10);
                    gVar.o();
                    throw th2;
                }
                com.google.android.exoplayer2.util.a.i(z10);
                gVar.o();
            }
            if (this.f47579b == null) {
                String strT = com.google.android.exoplayer2.util.u0.T(kVarArrA);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strT).length() + 58);
                sb2.append("None of the available extractors (");
                sb2.append(strT);
                sb2.append(") could read the stream.");
                throw new UnrecognizedInputFormatException(sb2.toString(), (Uri) com.google.android.exoplayer2.util.a.g(uri));
            }
        }
        this.f47579b.b(mVar);
    }

    @Override // com.google.android.exoplayer2.source.r0
    public void release() {
        com.google.android.exoplayer2.extractor.k kVar = this.f47579b;
        if (kVar != null) {
            kVar.release();
            this.f47579b = null;
        }
        this.f47580c = null;
    }
}
