package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi23.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.w0(23)
public class v0 extends t0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f27955m = true;

    v0() {
    }

    @Override // androidx.transition.x0
    @SuppressLint({"NewApi"})
    public void h(@androidx.annotation.n0 View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i10);
        } else if (f27955m) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f27955m = false;
            }
        }
    }
}
