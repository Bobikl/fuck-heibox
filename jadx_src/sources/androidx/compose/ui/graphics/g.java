package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidMatrixConversions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/c1;", "Landroid/graphics/Matrix;", "matrix", "Lkotlin/b2;", "b", "([FLandroid/graphics/Matrix;)V", ak.av, "(Landroid/graphics/Matrix;[F)V", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    public static final void a(@dl.d Matrix setFrom, @dl.d float[] matrix) {
        boolean z10;
        kotlin.jvm.internal.f0.p(setFrom, "$this$setFrom");
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        float f10 = matrix[2];
        if (f10 == 0.0f) {
            if (matrix[6] == 0.0f) {
                if (matrix[10] == 1.0f) {
                    if (matrix[14] == 0.0f) {
                        if (matrix[8] == 0.0f) {
                            if (matrix[9] == 0.0f) {
                                if (matrix[11] == 0.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
        }
        float f11 = matrix[0];
        float f12 = matrix[1];
        float f13 = matrix[3];
        float f14 = matrix[4];
        float f15 = matrix[5];
        float f16 = matrix[6];
        float f17 = matrix[7];
        float f18 = matrix[8];
        float f19 = matrix[12];
        float f20 = matrix[13];
        float f21 = matrix[15];
        matrix[0] = f11;
        matrix[1] = f14;
        matrix[2] = f19;
        matrix[3] = f12;
        matrix[4] = f15;
        matrix[5] = f20;
        matrix[6] = f13;
        matrix[7] = f17;
        matrix[8] = f21;
        setFrom.setValues(matrix);
        matrix[0] = f11;
        matrix[1] = f12;
        matrix[2] = f10;
        matrix[3] = f13;
        matrix[4] = f14;
        matrix[5] = f15;
        matrix[6] = f16;
        matrix[7] = f17;
        matrix[8] = f18;
    }

    public static final void b(@dl.d float[] setFrom, @dl.d Matrix matrix) {
        kotlin.jvm.internal.f0.p(setFrom, "$this$setFrom");
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        matrix.getValues(setFrom);
        float f10 = setFrom[0];
        float f11 = setFrom[1];
        float f12 = setFrom[2];
        float f13 = setFrom[3];
        float f14 = setFrom[4];
        float f15 = setFrom[5];
        float f16 = setFrom[6];
        float f17 = setFrom[7];
        float f18 = setFrom[8];
        setFrom[0] = f10;
        setFrom[1] = f13;
        setFrom[2] = 0.0f;
        setFrom[3] = f16;
        setFrom[4] = f11;
        setFrom[5] = f14;
        setFrom[6] = 0.0f;
        setFrom[7] = f17;
        setFrom[8] = 0.0f;
        setFrom[9] = 0.0f;
        setFrom[10] = 1.0f;
        setFrom[11] = 0.0f;
        setFrom[12] = f12;
        setFrom[13] = f15;
        setFrom[14] = 0.0f;
        setFrom[15] = f18;
    }
}
