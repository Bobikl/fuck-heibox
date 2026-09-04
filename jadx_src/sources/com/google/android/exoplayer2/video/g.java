package com.google.android.exoplayer2.video;

import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.e0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HevcConfig.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f51758g = 33;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f51759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f51763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final String f51764f;

    private g(List<byte[]> list, int i10, int i11, int i12, float f10, @p0 String str) {
        this.f51759a = list;
        this.f51760b = i10;
        this.f51761c = i11;
        this.f51762d = i12;
        this.f51763e = f10;
        this.f51764f = str;
    }

    public static g a(e0 e0Var) throws ParserException {
        try {
            e0Var.T(21);
            int iG = e0Var.G() & 3;
            int iG2 = e0Var.G();
            int iE = e0Var.e();
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < iG2; i12++) {
                e0Var.T(1);
                int iM = e0Var.M();
                for (int i13 = 0; i13 < iM; i13++) {
                    int iM2 = e0Var.M();
                    i11 += iM2 + 4;
                    e0Var.T(iM2);
                }
            }
            e0Var.S(iE);
            byte[] bArr = new byte[i11];
            float f10 = 1.0f;
            String strC = null;
            int i14 = -1;
            int i15 = -1;
            int i16 = 0;
            int i17 = 0;
            while (i16 < iG2) {
                int iG3 = e0Var.G() & 127;
                int iM3 = e0Var.M();
                int i18 = i10;
                while (i18 < iM3) {
                    int iM4 = e0Var.M();
                    byte[] bArr2 = com.google.android.exoplayer2.util.z.f51618b;
                    int i19 = iG2;
                    System.arraycopy(bArr2, i10, bArr, i17, bArr2.length);
                    int length = i17 + bArr2.length;
                    System.arraycopy(e0Var.d(), e0Var.e(), bArr, length, iM4);
                    if (iG3 == 33 && i18 == 0) {
                        com.google.android.exoplayer2.util.z.a aVarH = com.google.android.exoplayer2.util.z.h(bArr, length, length + iM4);
                        int i20 = aVarH.f51633h;
                        i15 = aVarH.f51634i;
                        f10 = aVarH.f51635j;
                        i14 = i20;
                        strC = com.google.android.exoplayer2.util.f.c(aVarH.f51626a, aVarH.f51627b, aVarH.f51628c, aVarH.f51629d, aVarH.f51630e, aVarH.f51631f);
                    }
                    i17 = length + iM4;
                    e0Var.T(iM4);
                    i18++;
                    iG2 = i19;
                    iG3 = iG3;
                    iM3 = iM3;
                    i10 = 0;
                }
                i16++;
                i10 = 0;
            }
            return new g(i11 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iG + 1, i14, i15, f10, strC);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing HEVC config", e10);
        }
    }
}
