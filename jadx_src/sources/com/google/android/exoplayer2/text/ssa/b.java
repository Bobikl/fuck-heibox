package com.google.android.exoplayer2.text.ssa;

import android.text.TextUtils;
import androidx.annotation.p0;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: SsaDialogueFormat.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49700e;

    private b(int i10, int i11, int i12, int i13, int i14) {
        this.f49696a = i10;
        this.f49697b = i11;
        this.f49698c = i12;
        this.f49699d = i13;
        this.f49700e = i14;
    }

    @p0
    public static b a(String str) {
        com.google.android.exoplayer2.util.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), Constants.ACCEPT_TIME_SEPARATOR_SP);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strG = com.google.common.base.a.g(strArrSplit[i14].trim());
            strG.hashCode();
            switch (strG) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i13 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new b(i10, i11, i12, i13, strArrSplit.length);
    }
}
