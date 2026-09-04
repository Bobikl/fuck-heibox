package com.google.android.exoplayer2.video;

import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.e0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AvcConfig.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f51696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f51700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final String f51701f;

    private a(List<byte[]> list, int i10, int i11, int i12, float f10, @p0 String str) {
        this.f51696a = list;
        this.f51697b = i10;
        this.f51698c = i11;
        this.f51699d = i12;
        this.f51700e = f10;
        this.f51701f = str;
    }

    private static byte[] a(e0 e0Var) {
        int iM = e0Var.M();
        int iE = e0Var.e();
        e0Var.T(iM);
        return com.google.android.exoplayer2.util.f.d(e0Var.d(), iE, iM);
    }

    public static a b(e0 e0Var) throws ParserException {
        float f10;
        String strA;
        int i10;
        try {
            e0Var.T(4);
            int iG = (e0Var.G() & 3) + 1;
            if (iG == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iG2 = e0Var.G() & 31;
            for (int i11 = 0; i11 < iG2; i11++) {
                arrayList.add(a(e0Var));
            }
            int iG3 = e0Var.G();
            for (int i12 = 0; i12 < iG3; i12++) {
                arrayList.add(a(e0Var));
            }
            int i13 = -1;
            if (iG2 > 0) {
                com.google.android.exoplayer2.util.z.c cVarL = com.google.android.exoplayer2.util.z.l((byte[]) arrayList.get(0), iG, ((byte[]) arrayList.get(0)).length);
                int i14 = cVarL.f51643e;
                int i15 = cVarL.f51644f;
                float f11 = cVarL.f51645g;
                strA = com.google.android.exoplayer2.util.f.a(cVarL.f51639a, cVarL.f51640b, cVarL.f51641c);
                i13 = i14;
                i10 = i15;
                f10 = f11;
            } else {
                f10 = 1.0f;
                strA = null;
                i10 = -1;
            }
            return new a(arrayList, iG, i13, i10, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing AVC config", e10);
        }
    }
}
