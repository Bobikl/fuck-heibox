package com.google.android.exoplayer2.extractor;

import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: ExtractorUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n {
    private n() {
    }

    @Pure
    public static void a(boolean z10, @p0 String str) throws ParserException {
        if (!z10) {
            throw ParserException.a(str, null);
        }
    }

    public static boolean b(l lVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return lVar.n(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(l lVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iJ = lVar.j(bArr, i10 + i12, i11 - i12);
            if (iJ == -1) {
                break;
            }
            i12 += iJ;
        }
        return i12;
    }

    public static boolean d(l lVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            lVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(l lVar, int i10) throws IOException {
        try {
            lVar.t(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
