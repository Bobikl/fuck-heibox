package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi29.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.w0(29)
public class w0 extends v0 {
    w0() {
    }

    @Override // androidx.transition.o0, androidx.transition.x0
    public float c(@androidx.annotation.n0 View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.r0, androidx.transition.x0
    public void e(@androidx.annotation.n0 View view, @androidx.annotation.p0 Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.t0, androidx.transition.x0
    public void f(@androidx.annotation.n0 View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.transition.o0, androidx.transition.x0
    public void g(@androidx.annotation.n0 View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // androidx.transition.v0, androidx.transition.x0
    public void h(@androidx.annotation.n0 View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // androidx.transition.r0, androidx.transition.x0
    public void i(@androidx.annotation.n0 View view, @androidx.annotation.n0 Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.r0, androidx.transition.x0
    public void j(@androidx.annotation.n0 View view, @androidx.annotation.n0 Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
