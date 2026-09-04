package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.j1;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: SearchBarAnimationHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f54941j = 250;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f54942k = 500;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f54943l = 750;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f54944m = 250;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f54945n = 250;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f54946o = 300;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f54947p = 75;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f54948q = 250;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f54949r = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Animator f54953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Animator f54954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f54955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f54956g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<SearchBar.b> f54950a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<AnimatorListenerAdapter> f54951b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<AnimatorListenerAdapter> f54952c = new LinkedHashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f54957h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Animator f54958i = null;

    /* JADX INFO: compiled from: SearchBarAnimationHelper.java */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.k(new g() { // from class: com.google.android.material.search.h
                @Override // com.google.android.material.search.i.g
                public final void a(SearchBar.b bVar) {
                    bVar.a();
                }
            });
        }
    }

    /* JADX INFO: compiled from: SearchBarAnimationHelper.java */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Animator f54961c;

        b(View view, Animator animator) {
            this.f54960b = view;
            this.f54961c = animator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54960b.setVisibility(8);
            this.f54961c.start();
        }
    }

    /* JADX INFO: compiled from: SearchBarAnimationHelper.java */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f54958i = null;
        }
    }

    /* JADX INFO: compiled from: SearchBarAnimationHelper.java */
    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchBar f54964b;

        d(SearchBar searchBar) {
            this.f54964b = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f54955f = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f54964b.setVisibility(4);
        }
    }

    /* JADX INFO: compiled from: SearchBarAnimationHelper.java */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f54958i = null;
        }
    }

    /* JADX INFO: compiled from: SearchBarAnimationHelper.java */
    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchBar f54967b;

        f(SearchBar searchBar) {
            this.f54967b = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54967b.setVisibility(0);
            i.this.f54956g = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f54967b.y0();
        }
    }

    /* JADX INFO: compiled from: SearchBarAnimationHelper.java */
    public interface g {
        void a(SearchBar.b bVar);
    }

    i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(com.google.android.material.shape.k kVar, View view, ValueAnimator valueAnimator) {
        kVar.p0(1.0f - valueAnimator.getAnimatedFraction());
        j1.I1(view, kVar);
        view.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(t(searchBar, view), o(searchBar, view, appBarLayout));
        animatorSet.addListener(new c());
        Iterator<AnimatorListenerAdapter> it = this.f54951b.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z10) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.f54958i = animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(g gVar) {
        Iterator<SearchBar.b> it = this.f54950a.iterator();
        while (it.hasNext()) {
            gVar.a(it.next());
        }
    }

    private Animator l(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return p(searchBar, view, appBarLayout).p(250L).e(new f(searchBar)).h();
    }

    private Animator m(@p0 View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.f(view));
        TimeInterpolator timeInterpolator = com.google.android.material.animation.b.f52896a;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f54957h ? 250L : 0L);
        valueAnimatorOfFloat.setStartDelay(this.f54957h ? 500L : 0L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.r.f(view));
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.setStartDelay(f54943l);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }

    private List<View> n(View view) {
        boolean zQ = j0.q(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((!zQ && (childAt instanceof ActionMenuView)) || (zQ && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    private Animator o(SearchBar searchBar, View view, @p0 AppBarLayout appBarLayout) {
        return p(searchBar, view, appBarLayout).p(300L).e(new d(searchBar)).j();
    }

    private com.google.android.material.internal.g p(SearchBar searchBar, View view, @p0 AppBarLayout appBarLayout) {
        return new com.google.android.material.internal.g(searchBar, view).n(q(searchBar, view)).o(appBarLayout != null ? appBarLayout.getTop() : 0).c(n(view));
    }

    private ValueAnimator.AnimatorUpdateListener q(SearchBar searchBar, final View view) {
        final com.google.android.material.shape.k kVarM = com.google.android.material.shape.k.m(view.getContext());
        kVarM.k0(searchBar.getCornerSize());
        kVarM.n0(j1.R(searchBar));
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                i.A(kVarM, view, valueAnimator);
            }
        };
    }

    private List<View> r(SearchBar searchBar) {
        List<View> listI = j0.i(searchBar);
        if (searchBar.getCenterView() != null) {
            listI.remove(searchBar.getCenterView());
        }
        return listI;
    }

    private Animator s(SearchBar searchBar) {
        List<View> listR = r(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.e(listR));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.b.f52896a);
        return valueAnimatorOfFloat;
    }

    private Animator t(SearchBar searchBar, final View view) {
        List<View> listR = r(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.e(listR));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(0.0f);
            }
        });
        valueAnimatorOfFloat.setDuration(75L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.b.f52896a);
        return valueAnimatorOfFloat;
    }

    private Animator u(@p0 View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.f(view));
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.b.f52896a);
        valueAnimatorOfFloat.setDuration(250L);
        return valueAnimatorOfFloat;
    }

    private Animator v(TextView textView, @p0 View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(w(textView));
        if (view != null) {
            animatorSet.play(u(view));
        }
        return animatorSet;
    }

    private Animator w(TextView textView) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.r.f(textView));
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.b.f52896a);
        valueAnimatorOfFloat.setDuration(250L);
        return valueAnimatorOfFloat;
    }

    boolean D(@n0 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f54952c.remove(animatorListenerAdapter);
    }

    boolean E(@n0 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f54951b.remove(animatorListenerAdapter);
    }

    boolean F(SearchBar.b bVar) {
        return this.f54950a.remove(bVar);
    }

    void G(boolean z10) {
        this.f54957h = z10;
    }

    void H(SearchBar searchBar, View view, @p0 AppBarLayout appBarLayout, boolean z10) {
        Animator animator;
        if (y() && (animator = this.f54958i) != null) {
            animator.cancel();
        }
        this.f54956g = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(l(searchBar, view, appBarLayout), s(searchBar));
        animatorSet.addListener(new e());
        Iterator<AnimatorListenerAdapter> it = this.f54952c.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z10) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.f54958i = animatorSet;
    }

    void I(final SearchBar searchBar, final View view, @p0 final AppBarLayout appBarLayout, final boolean z10) {
        Animator animator;
        if (x() && (animator = this.f54958i) != null) {
            animator.cancel();
        }
        this.f54955f = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.google.android.material.search.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f54932b.C(searchBar, view, appBarLayout, z10);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    void J(SearchBar searchBar) {
        k(new g() { // from class: com.google.android.material.search.f
            @Override // com.google.android.material.search.i.g
            public final void a(SearchBar.b bVar) {
                bVar.b();
            }
        });
        TextView textView = searchBar.getTextView();
        View centerView = searchBar.getCenterView();
        View viewF = d0.f(searchBar);
        final Animator animatorV = v(textView, viewF);
        animatorV.addListener(new a());
        this.f54953d = animatorV;
        textView.setAlpha(0.0f);
        if (viewF != null) {
            viewF.setAlpha(0.0f);
        }
        if (centerView instanceof com.google.android.material.animation.a) {
            ((com.google.android.material.animation.a) centerView).b(new com.google.android.material.animation.a.InterfaceC0414a() { // from class: com.google.android.material.search.g
                @Override // com.google.android.material.animation.a.InterfaceC0414a
                public final void a() {
                    animatorV.start();
                }
            });
            return;
        }
        if (centerView == 0) {
            animatorV.start();
            return;
        }
        centerView.setAlpha(0.0f);
        centerView.setVisibility(0);
        Animator animatorM = m(centerView);
        this.f54954e = animatorM;
        animatorM.addListener(new b(centerView, animatorV));
        animatorM.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void K(SearchBar searchBar) {
        Animator animator = this.f54953d;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f54954e;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof com.google.android.material.animation.a) {
            ((com.google.android.material.animation.a) centerView).a();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }

    void h(@n0 AnimatorListenerAdapter animatorListenerAdapter) {
        this.f54952c.add(animatorListenerAdapter);
    }

    void i(@n0 AnimatorListenerAdapter animatorListenerAdapter) {
        this.f54951b.add(animatorListenerAdapter);
    }

    void j(SearchBar.b bVar) {
        this.f54950a.add(bVar);
    }

    boolean x() {
        return this.f54956g;
    }

    boolean y() {
        return this.f54955f;
    }

    boolean z() {
        return this.f54957h;
    }
}
