package androidx.transition;

import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: FloatArrayEvaluator.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f27840a;

    d(float[] fArr) {
        this.f27840a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f10, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f27840a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i10 = 0; i10 < fArr3.length; i10++) {
            float f11 = fArr[i10];
            fArr3[i10] = f11 + ((fArr2[i10] - f11) * f10);
        }
        return fArr3;
    }
}
