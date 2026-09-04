package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f107115a = a(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f107116b = a(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f107117c = a(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f107118d = a(3, 2);

    static int a(int i10) {
        return i10 & 7;
    }

    static int a(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    public static int b(int i10) {
        return i10 >>> 3;
    }
}
