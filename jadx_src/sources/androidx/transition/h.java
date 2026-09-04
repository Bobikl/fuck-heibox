package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: GhostViewUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class h {
    private h() {
    }

    @androidx.annotation.p0
    static f a(@androidx.annotation.n0 View view, @androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.p0 Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? g.b(view, viewGroup, matrix) : GhostViewPort.b(view, viewGroup, matrix);
    }

    static void b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            g.f(view);
        } else {
            GhostViewPort.f(view);
        }
    }
}
