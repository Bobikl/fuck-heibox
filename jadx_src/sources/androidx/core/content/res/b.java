package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.n0;
import androidx.core.graphics.f0;
import androidx.core.view.j1;

/* JADX INFO: compiled from: CamUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final float[][] f20553a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final float[][] f20554b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final float[] f20555c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final float[][] f20556d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private b() {
    }

    static int a(float f10) {
        if (f10 < 1.0f) {
            return j1.f21601t;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = (f10 > 8.0f ? 1 : (f10 == 8.0f ? 0 : -1)) > 0 ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f20555c;
        return f0.g(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    static float b(int i10) {
        return c(g(i10));
    }

    static float c(float f10) {
        float f11 = f10 / 100.0f;
        return f11 <= 0.008856452f ? f11 * 903.2963f : (((float) Math.cbrt(f11)) * 116.0f) - 16.0f;
    }

    static float d(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    static float e(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    @n0
    static float[] f(int i10) {
        float fE = e(Color.red(i10));
        float fE2 = e(Color.green(i10));
        float fE3 = e(Color.blue(i10));
        float[][] fArr = f20556d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[0] * fE) + (fArr2[1] * fE2) + (fArr2[2] * fE3);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[0] * fE) + (fArr3[1] * fE2) + (fArr3[2] * fE3);
        float[] fArr4 = fArr[2];
        return new float[]{f10, f11, (fE * fArr4[0]) + (fE2 * fArr4[1]) + (fE3 * fArr4[2])};
    }

    static float g(int i10) {
        float fE = e(Color.red(i10));
        float fE2 = e(Color.green(i10));
        float fE3 = e(Color.blue(i10));
        float[] fArr = f20556d[1];
        return (fE * fArr[0]) + (fE2 * fArr[1]) + (fE3 * fArr[2]);
    }

    static float h(float f10) {
        return (f10 > 8.0f ? (float) Math.pow((((double) f10) + 16.0d) / 116.0d, 3.0d) : f10 / 903.2963f) * 100.0f;
    }
}
