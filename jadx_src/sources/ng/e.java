package ng;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.n0;

/* JADX INFO: compiled from: RefreshContent.java */
/* JADX INFO: loaded from: classes8.dex */
public interface e {
    void a(boolean z10);

    void b(k kVar);

    void c(MotionEvent motionEvent);

    ValueAnimator.AnimatorUpdateListener d(int i10);

    void e(i iVar, View view, View view2);

    void f(int i10, int i11, int i12);

    boolean g();

    @n0
    View getView();

    @n0
    View h();

    boolean i();
}
