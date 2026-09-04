package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi22.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.w0(22)
public class t0 extends r0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f27944l = true;

    t0() {
    }

    @Override // androidx.transition.x0
    @SuppressLint({"NewApi"})
    public void f(@androidx.annotation.n0 View view, int i10, int i11, int i12, int i13) {
        if (f27944l) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f27944l = false;
            }
        }
    }
}
