package com.google.android.exoplayer2.extractor;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: DummyTrackOutput.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f45041d = new byte[4096];

    @Override // com.google.android.exoplayer2.extractor.e0
    public int a(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10, int i11) throws IOException {
        int i12 = kVar.read(this.f45041d, 0, Math.min(this.f45041d.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.exoplayer2.extractor.e0
    public /* synthetic */ int b(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10) {
        return d0.a(this, kVar, i10, z10);
    }

    @Override // com.google.android.exoplayer2.extractor.e0
    public /* synthetic */ void c(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
        d0.b(this, e0Var, i10);
    }

    @Override // com.google.android.exoplayer2.extractor.e0
    public void d(a2 a2Var) {
    }

    @Override // com.google.android.exoplayer2.extractor.e0
    public void e(long j10, int i10, int i11, int i12, @p0 e0.a aVar) {
    }

    @Override // com.google.android.exoplayer2.extractor.e0
    public void f(com.google.android.exoplayer2.util.e0 e0Var, int i10, int i11) {
        e0Var.T(i10);
    }
}
