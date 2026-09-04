package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: compiled from: ReversableAnimatedValueInterpolator.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class w implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f54577a;

    public w(@n0 TimeInterpolator timeInterpolator) {
        this.f54577a = timeInterpolator;
    }

    @n0
    public static TimeInterpolator a(boolean z10, @n0 TimeInterpolator timeInterpolator) {
        return z10 ? timeInterpolator : new w(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return 1.0f - this.f54577a.getInterpolation(f10);
    }
}
