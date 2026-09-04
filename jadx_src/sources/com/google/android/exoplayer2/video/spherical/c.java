package com.google.android.exoplayer2.video.spherical;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.m0;

/* JADX INFO: compiled from: FrameRotationQueue.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f51874a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f51875b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0<float[]> f51876c = new m0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51877d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / fSqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12 / fSqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArrJ = this.f51876c.j(j10);
        if (fArrJ == null) {
            return false;
        }
        b(this.f51875b, fArrJ);
        if (!this.f51877d) {
            a(this.f51874a, this.f51875b);
            this.f51877d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f51874a, 0, this.f51875b, 0);
        return true;
    }

    public void d() {
        this.f51876c.c();
        this.f51877d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f51876c.a(j10, fArr);
    }
}
