package com.donkingliang.consecutivescroller;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: OverScrollInterpolator.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements Interpolator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f42390b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f42391c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f42392d = 8.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f42393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f42394f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42395a;

    static {
        float fA = 1.0f / a(1.0f);
        f42393e = fA;
        f42394f = 1.0f - (fA * a(1.0f));
    }

    public e(int i10) {
        this.f42395a = i10;
    }

    private static float a(float f10) {
        float f11 = f10 * 8.0f;
        return f11 < 1.0f ? f11 - (1.0f - ((float) Math.exp(-f11))) : ((1.0f - ((float) Math.exp(1.0f - f11))) * 0.63212055f) + 0.36787945f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (this.f42395a == f42391c) {
            float f11 = 1.0f - f10;
            return 1.0f - (f11 * f11);
        }
        float fA = f42393e * a(f10);
        return fA > 0.0f ? fA + f42394f : fA;
    }
}
