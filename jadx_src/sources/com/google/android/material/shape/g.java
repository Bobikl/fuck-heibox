package com.google.android.material.shape;

import androidx.annotation.n0;

/* JADX INFO: compiled from: CutCornerTreatment.java */
/* JADX INFO: loaded from: classes7.dex */
public class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f55062a;

    public g() {
        this.f55062a = -1.0f;
    }

    @Deprecated
    public g(float f10) {
        this.f55062a = f10;
    }

    @Override // com.google.android.material.shape.f
    public void b(@n0 r rVar, float f10, float f11, float f12) {
        rVar.r(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double d10 = f12;
        double d11 = f11;
        rVar.n((float) (Math.sin(Math.toRadians(f10)) * d10 * d11), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10 * d11));
    }
}
