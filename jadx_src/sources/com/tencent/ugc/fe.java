package com.tencent.ugc;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fe implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f103611b;

    private fe(int i10, float[] fArr) {
        this.f103610a = i10;
        this.f103611b = fArr;
    }

    public static Runnable a(int i10, float[] fArr) {
        return new fe(i10, fArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        GLES20.glUniformMatrix4fv(this.f103610a, 1, false, this.f103611b, 0);
    }
}
