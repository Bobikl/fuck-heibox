package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: ErrorCorrectionLevel.java */
/* JADX INFO: loaded from: classes7.dex */
public enum b3 {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b3[] f61563f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61565a;

    static {
        b3 b3Var = L;
        b3 b3Var2 = M;
        b3 b3Var3 = Q;
        f61563f = new b3[]{b3Var2, b3Var, H, b3Var3};
    }

    b3(int i10) {
        this.f61565a = i10;
    }

    public static b3 a(int i10) throws Exception {
        if (i10 >= 0) {
            b3[] b3VarArr = f61563f;
            if (i10 < b3VarArr.length) {
                return b3VarArr[i10];
            }
        }
        try {
            throw new IllegalArgumentException();
        } catch (Exception e10) {
            throw e10;
        }
    }

    public int a() {
        return this.f61565a;
    }
}
