package com.tencent.thumbplayer.tcmedia.b;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f102436a = "base_video";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f102437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f102438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f102439d;

    static int a(int i10) {
        if (i10 == 1) {
            int i11 = f102439d;
            f102439d = i11 + 1;
            return i11;
        }
        if (i10 == 2) {
            int i12 = f102437b;
            f102437b = i12 + 1;
            return i12;
        }
        if (i10 != 3) {
            return -1;
        }
        int i13 = f102438c;
        f102438c = i13 + 1;
        return i13;
    }
}
