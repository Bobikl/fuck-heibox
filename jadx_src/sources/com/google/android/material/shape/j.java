package com.google.android.material.shape;

import androidx.annotation.n0;

/* JADX INFO: compiled from: MarkerEdgeTreatment.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f55070b;

    public j(float f10) {
        this.f55070b = f10 - 0.001f;
    }

    @Override // com.google.android.material.shape.h
    boolean a() {
        return true;
    }

    @Override // com.google.android.material.shape.h
    public void b(float f10, float f11, float f12, @n0 r rVar) {
        float fSqrt = (float) ((((double) this.f55070b) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f55070b, 2.0d) - Math.pow(fSqrt, 2.0d));
        rVar.q(f11 - fSqrt, ((float) (-((((double) this.f55070b) * Math.sqrt(2.0d)) - ((double) this.f55070b)))) + fSqrt2);
        rVar.n(f11, (float) (-((((double) this.f55070b) * Math.sqrt(2.0d)) - ((double) this.f55070b))));
        rVar.n(f11 + fSqrt, ((float) (-((((double) this.f55070b) * Math.sqrt(2.0d)) - ((double) this.f55070b)))) + fSqrt2);
    }
}
