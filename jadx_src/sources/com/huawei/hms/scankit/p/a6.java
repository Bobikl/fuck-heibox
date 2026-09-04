package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: ParticleScale.java */
/* JADX INFO: loaded from: classes7.dex */
public class a6 implements g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f61535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f61536b;

    public a6(float f10, float f11) {
        this.f61536b = f10;
        this.f61535a = f11;
    }

    @Override // com.huawei.hms.scankit.p.g4
    public void a(@androidx.annotation.n0 w5 w5Var) {
        float fA = this.f61535a;
        float f10 = this.f61536b;
        if (fA != f10) {
            fA = n6.a(fA - f10) + this.f61536b;
        }
        w5Var.b(fA);
        w5Var.a(fA);
    }
}
