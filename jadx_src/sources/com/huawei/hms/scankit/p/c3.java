package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: ErrorCorrectionLevel.java */
/* JADX INFO: loaded from: classes7.dex */
public enum c3 {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c3[] f61624f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61626a;

    static {
        c3 c3Var = L;
        c3 c3Var2 = M;
        c3 c3Var3 = Q;
        f61624f = new c3[]{c3Var2, c3Var, H, c3Var3};
    }

    c3(int i10) {
        this.f61626a = i10;
    }

    public static c3 a(int i10) {
        if (i10 >= 0) {
            c3[] c3VarArr = f61624f;
            if (i10 < c3VarArr.length) {
                return c3VarArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }
}
