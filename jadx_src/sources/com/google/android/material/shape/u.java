package com.google.android.material.shape;

import androidx.annotation.n0;

/* JADX INFO: compiled from: TriangleEdgeTreatment.java */
/* JADX INFO: loaded from: classes7.dex */
public class u extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f55212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f55213c;

    public u(float f10, boolean z10) {
        this.f55212b = f10;
        this.f55213c = z10;
    }

    @Override // com.google.android.material.shape.h
    public void b(float f10, float f11, float f12, @n0 r rVar) {
        if (!this.f55213c) {
            float f13 = this.f55212b;
            rVar.o(f11 - (f13 * f12), 0.0f, f11, (-f13) * f12);
            rVar.o(f11 + (this.f55212b * f12), 0.0f, f10, 0.0f);
        } else {
            rVar.n(f11 - (this.f55212b * f12), 0.0f);
            float f14 = this.f55212b;
            rVar.o(f11, f14 * f12, (f14 * f12) + f11, 0.0f);
            rVar.n(f10, 0.0f);
        }
    }
}
