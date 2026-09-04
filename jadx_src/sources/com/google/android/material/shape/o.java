package com.google.android.material.shape;

import androidx.annotation.n0;

/* JADX INFO: compiled from: RoundedCornerTreatment.java */
/* JADX INFO: loaded from: classes7.dex */
public class o extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f55124a;

    public o() {
        this.f55124a = -1.0f;
    }

    @Deprecated
    public o(float f10) {
        this.f55124a = f10;
    }

    @Override // com.google.android.material.shape.f
    public void b(@n0 r rVar, float f10, float f11, float f12) {
        rVar.r(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        float f13 = f12 * 2.0f * f11;
        rVar.a(0.0f, 0.0f, f13, f13, 180.0f, f10);
    }
}
