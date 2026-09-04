package com.google.android.material.bottomappbar;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.x;
import com.google.android.material.shape.h;
import com.google.android.material.shape.r;

/* JADX INFO: compiled from: BottomAppBarTopEdgeTreatment.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends h implements Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f53226h = 90;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f53227i = 180;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f53228j = 270;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f53229k = 180;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f53230l = 1.75f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f53231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f53232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f53233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f53234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f53235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f53236g = -1.0f;

    public b(float f10, float f11, float f12) {
        this.f53232c = f10;
        this.f53231b = f11;
        j(f12);
        this.f53235f = 0.0f;
    }

    @Override // com.google.android.material.shape.h
    public void b(float f10, float f11, float f12, @n0 r rVar) {
        float f13;
        float f14;
        float f15 = this.f53233d;
        if (f15 == 0.0f) {
            rVar.n(f10, 0.0f);
            return;
        }
        float f16 = ((this.f53232c * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f53231b;
        float f18 = f11 + this.f53235f;
        float f19 = (this.f53234e * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            rVar.n(f10, 0.0f);
            return;
        }
        float f20 = this.f53236g;
        float f21 = f20 * f12;
        boolean z10 = f20 == -1.0f || Math.abs((f20 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = f19;
            f14 = 0.0f;
        } else {
            f14 = f53230l;
            f13 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float fSqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - fSqrt;
        float f25 = f18 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        rVar.n(f24, 0.0f);
        float f27 = f17 * 2.0f;
        rVar.a(f24 - f17, 0.0f, f24 + f17, f27, 270.0f, degrees);
        if (z10) {
            rVar.a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f28 = this.f53232c;
            float f29 = f21 * 2.0f;
            float f30 = f18 - f16;
            rVar.a(f30, -(f21 + f28), f30 + f28 + f29, f28 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f31 = f18 + f16;
            float f32 = this.f53232c;
            rVar.n(f31 - ((f32 / 2.0f) + f21), f32 + f21);
            float f33 = this.f53232c;
            rVar.a(f31 - (f29 + f33), -(f21 + f33), f31, f33 + f21, 90.0f, f26 - 90.0f);
        }
        rVar.a(f25 - f17, 0.0f, f25 + f17, f27, 270.0f - degrees, degrees);
        rVar.n(f10, 0.0f);
    }

    float d() {
        return this.f53234e;
    }

    public float e() {
        return this.f53236g;
    }

    float f() {
        return this.f53232c;
    }

    float g() {
        return this.f53231b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float h() {
        return this.f53233d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float i() {
        return this.f53235f;
    }

    void j(@x(from = 0.0d) float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f53234e = f10;
    }

    public void k(float f10) {
        this.f53236g = f10;
    }

    void l(float f10) {
        this.f53232c = f10;
    }

    void m(float f10) {
        this.f53231b = f10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void n(float f10) {
        this.f53233d = f10;
    }

    void o(float f10) {
        this.f53235f = f10;
    }
}
