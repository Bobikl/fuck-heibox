package com.google.android.exoplayer2.video;

import androidx.annotation.p0;
import com.google.android.exoplayer2.util.e0;

/* JADX INFO: compiled from: DolbyVisionConfig.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51741c;

    private e(int i10, int i11, String str) {
        this.f51739a = i10;
        this.f51740b = i11;
        this.f51741c = str;
    }

    @p0
    public static e a(e0 e0Var) {
        String str;
        e0Var.T(2);
        int iG = e0Var.G();
        int i10 = iG >> 1;
        int iG2 = ((e0Var.G() >> 3) & 31) | ((iG & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = iG2 < 10 ? ".0" : ".";
        StringBuilder sb2 = new StringBuilder(str.length() + 24 + str2.length());
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(iG2);
        return new e(i10, iG2, sb2.toString());
    }
}
