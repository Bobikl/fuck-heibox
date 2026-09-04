package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: QRCodeDecoderMetaData.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f61955a;

    i6(boolean z10) {
        this.f61955a = z10;
    }

    public void a(u6[] u6VarArr) {
        if (!this.f61955a || u6VarArr == null || u6VarArr.length < 3) {
            return;
        }
        u6 u6Var = u6VarArr[0];
        u6VarArr[0] = u6VarArr[2];
        u6VarArr[2] = u6Var;
    }
}
