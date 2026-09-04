package com.google.android.exoplayer2.extractor;

import androidx.annotation.p0;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: Id3Peeker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f46213a = new com.google.android.exoplayer2.util.e0(10);

    @p0
    public Metadata a(l lVar, @p0 com.google.android.exoplayer2.metadata.id3.b.a aVar) throws IOException {
        Metadata metadataE = null;
        int i10 = 0;
        while (true) {
            try {
                lVar.l(this.f46213a.d(), 0, 10);
                this.f46213a.S(0);
                if (this.f46213a.J() != 4801587) {
                    break;
                }
                this.f46213a.T(3);
                int iF = this.f46213a.F();
                int i11 = iF + 10;
                if (metadataE == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f46213a.d(), 0, bArr, 0, 10);
                    lVar.l(bArr, 10, iF);
                    metadataE = new com.google.android.exoplayer2.metadata.id3.b(aVar).e(bArr, i11);
                } else {
                    lVar.s(iF);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        lVar.o();
        lVar.s(i10);
        return metadataE;
    }
}
