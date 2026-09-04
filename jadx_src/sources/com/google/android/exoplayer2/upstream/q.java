package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: DataSourceUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q {
    private q() {
    }

    public static void a(@androidx.annotation.p0 o oVar) {
        if (oVar != null) {
            try {
                oVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(o oVar, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = oVar.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                StringBuilder sb2 = new StringBuilder(56);
                sb2.append("Not enough data could be read: ");
                sb2.append(i11);
                sb2.append(" < ");
                sb2.append(i10);
                throw new IllegalStateException(sb2.toString());
            }
            i11 += i12;
        }
        return bArr;
    }

    public static byte[] c(o oVar) throws IOException {
        byte[] bArrCopyOf = new byte[1024];
        int i10 = 0;
        int i11 = 0;
        while (i10 != -1) {
            if (i11 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i10 = oVar.read(bArrCopyOf, i11, bArrCopyOf.length - i11);
            if (i10 != -1) {
                i11 += i10;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i11);
    }
}
