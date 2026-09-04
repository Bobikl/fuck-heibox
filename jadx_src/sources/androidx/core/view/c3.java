package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class c3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f21478e = 2113929216;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f21479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Runnable f21480b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Runnable f21481c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f21482d = -1;

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d3 f21483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f21484c;

        a(d3 d3Var, View view) {
            this.f21483b = d3Var;
            this.f21484c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f21483b.a(this.f21484c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f21483b.b(this.f21484c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f21483b.c(this.f21484c);
        }
    }

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    @androidx.annotation.w0(16)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        @androidx.annotation.u
        static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        @androidx.annotation.u
        static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    @androidx.annotation.w0(18)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static Interpolator a(ViewPropertyAnimator viewPropertyAnimator) {
            return (Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    @androidx.annotation.w0(19)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    @androidx.annotation.w0(21)
    public static class e {
        private e() {
        }

        @androidx.annotation.u
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.translationZ(f10);
        }

        @androidx.annotation.u
        static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.translationZBy(f10);
        }

        @androidx.annotation.u
        static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.z(f10);
        }

        @androidx.annotation.u
        static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.zBy(f10);
        }
    }

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    public static class f implements d3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c3 f21486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f21487b;

        f(c3 c3Var) {
            this.f21486a = c3Var;
        }

        @Override // androidx.core.view.d3
        public void a(@androidx.annotation.n0 View view) {
            Object tag = view.getTag(c3.f21478e);
            d3 d3Var = tag instanceof d3 ? (d3) tag : null;
            if (d3Var != null) {
                d3Var.a(view);
            }
        }

        @Override // androidx.core.view.d3
        @SuppressLint({"WrongConstant"})
        public void b(@androidx.annotation.n0 View view) {
            int i10 = this.f21486a.f21482d;
            if (i10 > -1) {
                view.setLayerType(i10, null);
                this.f21486a.f21482d = -1;
            }
            c3 c3Var = this.f21486a;
            Runnable runnable = c3Var.f21481c;
            if (runnable != null) {
                c3Var.f21481c = null;
                runnable.run();
            }
            Object tag = view.getTag(c3.f21478e);
            d3 d3Var = tag instanceof d3 ? (d3) tag : null;
            if (d3Var != null) {
                d3Var.b(view);
            }
            this.f21487b = true;
        }

        @Override // androidx.core.view.d3
        public void c(@androidx.annotation.n0 View view) {
            this.f21487b = false;
            if (this.f21486a.f21482d > -1) {
                view.setLayerType(2, null);
            }
            c3 c3Var = this.f21486a;
            Runnable runnable = c3Var.f21480b;
            if (runnable != null) {
                c3Var.f21480b = null;
                runnable.run();
            }
            Object tag = view.getTag(c3.f21478e);
            d3 d3Var = tag instanceof d3 ? (d3) tag : null;
            if (d3Var != null) {
                d3Var.c(view);
            }
        }
    }

    c3(View view) {
        this.f21479a = new WeakReference<>(view);
    }

    private void v(View view, d3 d3Var) {
        if (d3Var != null) {
            view.animate().setListener(new a(d3Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @androidx.annotation.n0
    public c3 A(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().translationXBy(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 B(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 C(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().translationYBy(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 D(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            e.a(view.animate(), f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 E(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            e.b(view.animate(), f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 F(@androidx.annotation.n0 Runnable runnable) {
        View view = this.f21479a.get();
        if (view != null) {
            b.a(view.animate(), runnable);
        }
        return this;
    }

    @androidx.annotation.n0
    @SuppressLint({"WrongConstant"})
    public c3 G() {
        View view = this.f21479a.get();
        if (view != null) {
            b.b(view.animate());
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 H(@androidx.annotation.n0 Runnable runnable) {
        View view = this.f21479a.get();
        if (view != null) {
            b.c(view.animate(), runnable);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 I(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().x(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 J(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().xBy(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 K(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().y(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 L(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().yBy(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 M(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            e.c(view.animate(), f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 N(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            e.d(view.animate(), f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 b(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 c(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().alphaBy(f10);
        }
        return this;
    }

    public void d() {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long e() {
        View view = this.f21479a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @androidx.annotation.p0
    public Interpolator f() {
        View view = this.f21479a.get();
        if (view != null) {
            return c.a(view.animate());
        }
        return null;
    }

    public long g() {
        View view = this.f21479a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @androidx.annotation.n0
    public c3 i(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().rotation(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 j(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().rotationBy(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 k(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().rotationX(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 l(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().rotationXBy(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 m(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().rotationY(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 n(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().rotationYBy(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 o(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().scaleX(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 p(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().scaleXBy(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 q(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().scaleY(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 r(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().scaleYBy(f10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 s(long j10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 t(@androidx.annotation.p0 Interpolator interpolator) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 u(@androidx.annotation.p0 d3 d3Var) {
        View view = this.f21479a.get();
        if (view != null) {
            v(view, d3Var);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 w(long j10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    @androidx.annotation.n0
    public c3 x(@androidx.annotation.p0 final f3 f3Var) {
        final View view = this.f21479a.get();
        if (view != null) {
            d.a(view.animate(), f3Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.b3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    f3Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void y() {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @androidx.annotation.n0
    public c3 z(float f10) {
        View view = this.f21479a.get();
        if (view != null) {
            view.animate().translationX(f10);
        }
        return this;
    }
}
