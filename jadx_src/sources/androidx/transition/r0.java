package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi21.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.w0(21)
public class r0 extends o0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f27903i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f27904j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f27905k = true;

    r0() {
    }

    @Override // androidx.transition.x0
    @SuppressLint({"NewApi"})
    public void e(@androidx.annotation.n0 View view, @androidx.annotation.p0 Matrix matrix) {
        if (f27903i) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f27903i = false;
            }
        }
    }

    @Override // androidx.transition.x0
    @SuppressLint({"NewApi"})
    public void i(@androidx.annotation.n0 View view, @androidx.annotation.n0 Matrix matrix) {
        if (f27904j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f27904j = false;
            }
        }
    }

    @Override // androidx.transition.x0
    @SuppressLint({"NewApi"})
    public void j(@androidx.annotation.n0 View view, @androidx.annotation.n0 Matrix matrix) {
        if (f27905k) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f27905k = false;
            }
        }
    }
}
