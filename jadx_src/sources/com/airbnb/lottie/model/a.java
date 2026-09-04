package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: CubicCurveData.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f37455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f37456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f37457c;

    public a() {
        this.f37455a = new PointF();
        this.f37456b = new PointF();
        this.f37457c = new PointF();
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f37455a = pointF;
        this.f37456b = pointF2;
        this.f37457c = pointF3;
    }

    public PointF a() {
        return this.f37455a;
    }

    public PointF b() {
        return this.f37456b;
    }

    public PointF c() {
        return this.f37457c;
    }

    public void d(float f10, float f11) {
        this.f37455a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f37456b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f37457c.set(f10, f11);
    }
}
