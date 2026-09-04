package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: LookupTableInterpolator.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f23904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f23905b;

    protected d(float[] fArr) {
        this.f23904a = fArr;
        this.f23905b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f23904a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f23905b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float[] fArr2 = this.f23904a;
        float f13 = fArr2[iMin];
        return f13 + (f12 * (fArr2[iMin + 1] - f13));
    }
}
