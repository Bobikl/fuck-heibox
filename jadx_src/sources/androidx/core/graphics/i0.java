package androidx.core.graphics;

import android.graphics.Matrix;

/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/core/graphics/MatrixKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class i0 {
    @dl.d
    public static final Matrix a(float f10, float f11, float f12) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f10, f11, f12);
        return matrix;
    }

    public static /* synthetic */ Matrix b(float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        return a(f10, f11, f12);
    }

    @dl.d
    public static final Matrix c(float f10, float f11) {
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f11);
        return matrix;
    }

    public static /* synthetic */ Matrix d(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        return c(f10, f11);
    }

    @dl.d
    public static final Matrix e(@dl.d Matrix matrix, @dl.d Matrix m10) {
        kotlin.jvm.internal.f0.p(matrix, "<this>");
        kotlin.jvm.internal.f0.p(m10, "m");
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preConcat(m10);
        return matrix2;
    }

    @dl.d
    public static final Matrix f(float f10, float f11) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f10, f11);
        return matrix;
    }

    public static /* synthetic */ Matrix g(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return f(f10, f11);
    }

    @dl.d
    public static final float[] h(@dl.d Matrix matrix) {
        kotlin.jvm.internal.f0.p(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
