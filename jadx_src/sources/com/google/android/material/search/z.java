package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.j1;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.j0;
import java.util.Objects;

/* JADX INFO: compiled from: SearchViewAnimationHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class z {
    private static final long A = 350;
    private static final long B = 150;
    private static final long C = 300;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f54988n = 300;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f54989o = 50;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f54990p = 250;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f54991q = 150;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f54992r = 75;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f54993s = 300;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f54994t = 250;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f54995u = 42;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f54996v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f54997w = 83;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f54998x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f54999y = 250;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final float f55000z = 0.95f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SearchView f55001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f55002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ClippableRoundedCornerLayout f55003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FrameLayout f55004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FrameLayout f55005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Toolbar f55006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Toolbar f55007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextView f55008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EditText f55009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ImageButton f55010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View f55011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final TouchObserverFrameLayout f55012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SearchBar f55013m;

    /* JADX INFO: compiled from: SearchViewAnimationHelper.java */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!z.this.f55001a.q()) {
                z.this.f55001a.M();
            }
            z.this.f55001a.setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z.this.f55003c.setVisibility(0);
            z.this.f55013m.y0();
        }
    }

    /* JADX INFO: compiled from: SearchViewAnimationHelper.java */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z.this.f55003c.setVisibility(8);
            if (!z.this.f55001a.q()) {
                z.this.f55001a.m();
            }
            z.this.f55001a.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z.this.f55001a.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* JADX INFO: compiled from: SearchViewAnimationHelper.java */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!z.this.f55001a.q()) {
                z.this.f55001a.M();
            }
            z.this.f55001a.setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z.this.f55003c.setVisibility(0);
            z.this.f55001a.setTransitionState(SearchView.TransitionState.SHOWING);
        }
    }

    /* JADX INFO: compiled from: SearchViewAnimationHelper.java */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z.this.f55003c.setVisibility(8);
            if (!z.this.f55001a.q()) {
                z.this.f55001a.m();
            }
            z.this.f55001a.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z.this.f55001a.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* JADX INFO: compiled from: SearchViewAnimationHelper.java */
    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f55018b;

        e(boolean z10) {
            this.f55018b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z.this.Q(this.f55018b ? 1.0f : 0.0f);
            if (this.f55018b) {
                z.this.f55003c.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z.this.Q(this.f55018b ? 0.0f : 1.0f);
        }
    }

    z(SearchView searchView) {
        this.f55001a = searchView;
        this.f55002b = searchView.f54902b;
        this.f55003c = searchView.f54903c;
        this.f55004d = searchView.f54906f;
        this.f55005e = searchView.f54907g;
        this.f55006f = searchView.f54908h;
        this.f55007g = searchView.f54909i;
        this.f55008h = searchView.f54910j;
        this.f55009i = searchView.f54911k;
        this.f55010j = searchView.f54912l;
        this.f55011k = searchView.f54913m;
        this.f55012l = searchView.f54914n;
    }

    private int A(View view) {
        int iC = androidx.core.view.s.c((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        int iK0 = j1.k0(this.f55013m);
        return j0.q(this.f55013m) ? ((this.f55013m.getWidth() - this.f55013m.getRight()) + iC) - iK0 : (this.f55013m.getLeft() - iC) + iK0;
    }

    private int B() {
        return ((this.f55013m.getTop() + this.f55013m.getBottom()) / 2) - ((this.f55005e.getTop() + this.f55005e.getBottom()) / 2);
    }

    private Animator C(boolean z10) {
        return H(z10, false, this.f55004d);
    }

    private Animator D(boolean z10) {
        Rect rectB = j0.b(this.f55001a);
        Rect rectO = o();
        final Rect rect = new Rect(rectO);
        final float cornerSize = this.f55013m.getCornerSize();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new com.google.android.material.internal.v(rect), rectO, rectB);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.y
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f54985b.M(cornerSize, rect, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfObject.setInterpolator(com.google.android.material.internal.w.a(z10, com.google.android.material.animation.b.f52897b));
        return valueAnimatorOfObject;
    }

    private Animator E(boolean z10) {
        TimeInterpolator timeInterpolator = z10 ? com.google.android.material.animation.b.f52896a : com.google.android.material.animation.b.f52897b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.w.a(z10, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.f(this.f55002b));
        return valueAnimatorOfFloat;
    }

    private Animator F(boolean z10) {
        return H(z10, true, this.f55008h);
    }

    private AnimatorSet G(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(I());
        k(animatorSet);
        animatorSet.setInterpolator(com.google.android.material.internal.w.a(z10, com.google.android.material.animation.b.f52897b));
        animatorSet.setDuration(z10 ? A : 300L);
        return animatorSet;
    }

    private Animator H(boolean z10, boolean z11, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z11 ? A(view) : z(view), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.n(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(B(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.r.p(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.w.a(z10, com.google.android.material.animation.b.f52897b));
        return animatorSet;
    }

    private Animator I() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f55003c.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.p(this.f55003c));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(androidx.appcompat.graphics.drawable.d dVar, ValueAnimator valueAnimator) {
        dVar.setProgress(valueAnimator.getAnimatedFraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(com.google.android.material.internal.i iVar, ValueAnimator valueAnimator) {
        iVar.a(valueAnimator.getAnimatedFraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(float f10, Rect rect, ValueAnimator valueAnimator) {
        this.f55003c.c(rect, f10 * (1.0f - valueAnimator.getAnimatedFraction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        AnimatorSet animatorSetY = y(true);
        animatorSetY.addListener(new a());
        animatorSetY.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f55003c;
        clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
        AnimatorSet animatorSetG = G(true);
        animatorSetG.addListener(new c());
        animatorSetG.start();
    }

    private void P(float f10) {
        ActionMenuView actionMenuViewB;
        if (!this.f55001a.t() || (actionMenuViewB = d0.b(this.f55006f)) == null) {
            return;
        }
        actionMenuViewB.setAlpha(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(float f10) {
        this.f55010j.setAlpha(f10);
        this.f55011k.setAlpha(f10);
        this.f55012l.setAlpha(f10);
        P(f10);
    }

    private void R(Drawable drawable) {
        if (drawable instanceof androidx.appcompat.graphics.drawable.d) {
            ((androidx.appcompat.graphics.drawable.d) drawable).setProgress(1.0f);
        }
        if (drawable instanceof com.google.android.material.internal.i) {
            ((com.google.android.material.internal.i) drawable).a(1.0f);
        }
    }

    private void S(Toolbar toolbar) {
        ActionMenuView actionMenuViewB = d0.b(toolbar);
        if (actionMenuViewB != null) {
            for (int i10 = 0; i10 < actionMenuViewB.getChildCount(); i10++) {
                View childAt = actionMenuViewB.getChildAt(i10);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    private void U() {
        Menu menu = this.f55007g.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.f55013m.getMenuResId() == -1 || !this.f55001a.t()) {
            this.f55007g.setVisibility(8);
            return;
        }
        this.f55007g.z(this.f55013m.getMenuResId());
        S(this.f55007g);
        this.f55007g.setVisibility(0);
    }

    private void W() {
        if (this.f55001a.q()) {
            this.f55001a.m();
        }
        AnimatorSet animatorSetY = y(false);
        animatorSetY.addListener(new b());
        animatorSetY.start();
    }

    private void X() {
        if (this.f55001a.q()) {
            this.f55001a.m();
        }
        AnimatorSet animatorSetG = G(false);
        animatorSetG.addListener(new d());
        animatorSetG.start();
    }

    private void Y() {
        if (this.f55001a.q()) {
            this.f55001a.M();
        }
        this.f55001a.setTransitionState(SearchView.TransitionState.SHOWING);
        U();
        this.f55009i.setText(this.f55013m.getText());
        EditText editText = this.f55009i;
        editText.setSelection(editText.getText().length());
        this.f55003c.setVisibility(4);
        this.f55003c.post(new Runnable() { // from class: com.google.android.material.search.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f54982b.N();
            }
        });
    }

    private void Z() {
        if (this.f55001a.q()) {
            final SearchView searchView = this.f55001a;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: com.google.android.material.search.w
                @Override // java.lang.Runnable
                public final void run() {
                    searchView.M();
                }
            }, 150L);
        }
        this.f55003c.setVisibility(4);
        this.f55003c.post(new Runnable() { // from class: com.google.android.material.search.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f54984b.O();
            }
        });
    }

    private void j(AnimatorSet animatorSet) {
        ActionMenuView actionMenuViewB = d0.b(this.f55006f);
        if (actionMenuViewB == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z(actionMenuViewB), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.n(actionMenuViewB));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(B(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.r.p(actionMenuViewB));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void k(AnimatorSet animatorSet) {
        ImageButton imageButtonE = d0.e(this.f55006f);
        if (imageButtonE == null) {
            return;
        }
        Drawable drawableQ = androidx.core.graphics.drawable.d.q(imageButtonE.getDrawable());
        if (!this.f55001a.r()) {
            R(drawableQ);
        } else {
            m(animatorSet, drawableQ);
            n(animatorSet, drawableQ);
        }
    }

    private void l(AnimatorSet animatorSet) {
        ImageButton imageButtonE = d0.e(this.f55006f);
        if (imageButtonE == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(A(imageButtonE), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.n(imageButtonE));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(B(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.r.p(imageButtonE));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void m(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof androidx.appcompat.graphics.drawable.d) {
            final androidx.appcompat.graphics.drawable.d dVar = (androidx.appcompat.graphics.drawable.d) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.u
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    z.K(dVar, valueAnimator);
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private void n(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof com.google.android.material.internal.i) {
            final com.google.android.material.internal.i iVar = (com.google.android.material.internal.i) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    z.L(iVar, valueAnimator);
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private Rect o() {
        int[] iArr = new int[2];
        this.f55013m.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int[] iArr2 = new int[2];
        this.f55003c.getLocationOnScreen(iArr2);
        int i12 = i10 - iArr2[0];
        int i13 = i11 - iArr2[1];
        return new Rect(i12, i13, this.f55013m.getWidth() + i12, this.f55013m.getHeight() + i13);
    }

    private Animator p(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.w.a(z10, com.google.android.material.animation.b.f52897b));
        if (this.f55001a.t()) {
            valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.internal.j(d0.b(this.f55007g), d0.b(this.f55006f)));
        }
        return valueAnimatorOfFloat;
    }

    private Animator q(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        l(animatorSet);
        k(animatorSet);
        j(animatorSet);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.w.a(z10, com.google.android.material.animation.b.f52897b));
        return animatorSet;
    }

    private Animator r(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? f54989o : f54995u);
        valueAnimatorOfFloat.setStartDelay(z10 ? 250L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.w.a(z10, com.google.android.material.animation.b.f52896a));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.f(this.f55010j));
        return valueAnimatorOfFloat;
    }

    private Animator s(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 150L : f54997w);
        valueAnimatorOfFloat.setStartDelay(z10 ? 75L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.w.a(z10, com.google.android.material.animation.b.f52896a));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.f(this.f55011k, this.f55012l));
        return valueAnimatorOfFloat;
    }

    private Animator t(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(s(z10), v(z10), u(z10));
        return animatorSet;
    }

    private Animator u(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f55000z, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.w.a(z10, com.google.android.material.animation.b.f52897b));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.h(this.f55012l));
        return valueAnimatorOfFloat;
    }

    private Animator v(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f55012l.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.w.a(z10, com.google.android.material.animation.b.f52897b));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.p(this.f55011k));
        return valueAnimatorOfFloat;
    }

    private Animator w(boolean z10) {
        return H(z10, false, this.f55007g);
    }

    private Animator x(boolean z10) {
        return H(z10, true, this.f55009i);
    }

    private AnimatorSet y(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(E(z10), D(z10), r(z10), t(z10), q(z10), C(z10), w(z10), p(z10), x(z10), F(z10));
        animatorSet.addListener(new e(z10));
        return animatorSet;
    }

    private int z(View view) {
        int iB = androidx.core.view.s.b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        return j0.q(this.f55013m) ? this.f55013m.getLeft() - iB : (this.f55013m.getRight() - this.f55001a.getWidth()) + iB;
    }

    void J() {
        if (this.f55013m != null) {
            W();
        } else {
            X();
        }
    }

    void T(SearchBar searchBar) {
        this.f55013m = searchBar;
    }

    void V() {
        if (this.f55013m != null) {
            Y();
        } else {
            Z();
        }
    }
}
