package com.google.android.material.internal;

/* JADX INFO: compiled from: FadeThroughUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final float f54525a = 0.5f;

    private k() {
    }

    static void a(@androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, float[] fArr) {
        if (f10 <= 0.5f) {
            fArr[0] = 1.0f - (f10 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f10 * 2.0f) - 1.0f;
        }
    }
}
