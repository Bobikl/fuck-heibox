package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: UPCEANExtensionSupport.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f62229c = {1, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n7 f62230a = new n7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o7 f62231b = new o7();

    p7() {
    }

    s6 a(int i10, r rVar, int i11) throws a {
        int[] iArrA = q7.a(rVar, i11, false, f62229c);
        try {
            return this.f62231b.a(i10, rVar, iArrA);
        } catch (a unused) {
            return this.f62230a.a(i10, rVar, iArrA);
        }
    }
}
