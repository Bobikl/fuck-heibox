package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.animation.i;
import java.util.List;

/* JADX INFO: compiled from: MotionStrategy.java */
/* JADX INFO: loaded from: classes7.dex */
public interface f {
    void a();

    i b();

    @p0
    i c();

    boolean d();

    void e(@n0 Animator.AnimatorListener animatorListener);

    @androidx.annotation.b
    int f();

    AnimatorSet g();

    void h(@p0 ExtendedFloatingActionButton.l lVar);

    void i();

    void j();

    void k(@n0 Animator.AnimatorListener animatorListener);

    void l(@p0 i iVar);

    List<Animator.AnimatorListener> m();

    void onAnimationStart(Animator animator);
}
