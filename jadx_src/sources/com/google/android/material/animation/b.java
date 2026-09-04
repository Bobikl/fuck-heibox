package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: AnimationUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f52896a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f52897b = new androidx.interpolator.view.animation.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f52898c = new androidx.interpolator.view.animation.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f52899d = new androidx.interpolator.view.animation.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f52900e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= f12) {
            return f10;
        }
        return f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i10, int i11, float f10) {
        return i10 + Math.round(f10 * (i11 - i10));
    }
}
