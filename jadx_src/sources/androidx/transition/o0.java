package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi19.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.w0(19)
public class o0 extends x0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f27894h = true;

    o0() {
    }

    @Override // androidx.transition.x0
    public void a(@androidx.annotation.n0 View view) {
    }

    @Override // androidx.transition.x0
    @SuppressLint({"NewApi"})
    public float c(@androidx.annotation.n0 View view) {
        if (f27894h) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f27894h = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.x0
    public void d(@androidx.annotation.n0 View view) {
    }

    @Override // androidx.transition.x0
    @SuppressLint({"NewApi"})
    public void g(@androidx.annotation.n0 View view, float f10) {
        if (f27894h) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f27894h = false;
            }
        }
        view.setAlpha(f10);
    }
}
