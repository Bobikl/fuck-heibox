package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: AnimatorUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: androidx.transition.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimatorUtils.java */
    public interface InterfaceC0220a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    private a() {
    }

    static void a(@androidx.annotation.n0 Animator animator, @androidx.annotation.n0 AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    static void b(@androidx.annotation.n0 Animator animator) {
        animator.pause();
    }

    static void c(@androidx.annotation.n0 Animator animator) {
        animator.resume();
    }
}
