package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f53137o = 225;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f53138p = 175;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f53139q = R.attr.motionDurationLong2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f53140r = R.attr.motionDurationMedium4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f53141s = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f53142t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f53143u = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    private final LinkedHashSet<b> f53144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TimeInterpolator f53147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TimeInterpolator f53148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f53149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @c
    private int f53150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private ViewPropertyAnimator f53152n;

    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f53152n = null;
        }
    }

    public interface b {
        void a(@n0 View view, @c int i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface c {
    }

    public HideBottomViewOnScrollBehavior() {
        this.f53144f = new LinkedHashSet<>();
        this.f53149k = 0;
        this.f53150l = 2;
        this.f53151m = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53144f = new LinkedHashSet<>();
        this.f53149k = 0;
        this.f53150l = 2;
        this.f53151m = 0;
    }

    private void L(@n0 V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f53152n = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    private void V(@n0 V v10, @c int i10) {
        this.f53150l = i10;
        Iterator<b> it = this.f53144f.iterator();
        while (it.hasNext()) {
            it.next().a(v10, this.f53150l);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean E(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, @n0 View view2, int i10, int i11) {
        return i10 == 2;
    }

    public void K(@n0 b bVar) {
        this.f53144f.add(bVar);
    }

    public void M() {
        this.f53144f.clear();
    }

    public boolean N() {
        return this.f53150l == 1;
    }

    public boolean O() {
        return this.f53150l == 2;
    }

    public void P(@n0 b bVar) {
        this.f53144f.remove(bVar);
    }

    public void Q(@n0 V v10, @r int i10) {
        this.f53151m = i10;
        if (this.f53150l == 1) {
            v10.setTranslationY(this.f53149k + i10);
        }
    }

    public void R(@n0 V v10) {
        S(v10, true);
    }

    public void S(@n0 V v10, boolean z10) {
        if (N()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f53152n;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        V(v10, 1);
        int i10 = this.f53149k + this.f53151m;
        if (z10) {
            L(v10, i10, this.f53146h, this.f53148j);
        } else {
            v10.setTranslationY(i10);
        }
    }

    public void T(@n0 V v10) {
        U(v10, true);
    }

    public void U(@n0 V v10, boolean z10) {
        if (O()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f53152n;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        V(v10, 2);
        if (z10) {
            L(v10, 0, this.f53145g, this.f53147i);
        } else {
            v10.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, int i10) {
        this.f53149k = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f53145g = i9.a.f(v10.getContext(), f53139q, 225);
        this.f53146h = i9.a.f(v10.getContext(), f53140r, 175);
        Context context = v10.getContext();
        int i11 = f53141s;
        this.f53147i = i9.a.g(context, i11, com.google.android.material.animation.b.f52899d);
        this.f53148j = i9.a.g(v10.getContext(), i11, com.google.android.material.animation.b.f52898c);
        return super.p(coordinatorLayout, v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void x(CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, int i10, int i11, int i12, int i13, int i14, @n0 int[] iArr) {
        if (i11 > 0) {
            R(v10);
        } else if (i11 < 0) {
            T(v10);
        }
    }
}
