package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.n0;

/* JADX INFO: compiled from: MatrixEvaluator.java */
/* JADX INFO: loaded from: classes7.dex */
public class h implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f52906a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f52907b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f52908c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @n0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f10, @n0 Matrix matrix, @n0 Matrix matrix2) {
        matrix.getValues(this.f52906a);
        matrix2.getValues(this.f52907b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f52907b;
            float f11 = fArr[i10];
            float f12 = this.f52906a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f52908c.setValues(this.f52907b);
        return this.f52908c;
    }
}
