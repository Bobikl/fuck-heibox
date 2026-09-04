package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p0 {
    private static final long D = 2000;
    private static final long E = 250;
    private static final long F = 250;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    private static final int J = 3;
    private static final int K = 4;
    private boolean A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StyledPlayerControlView f50744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f50746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f50747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f50748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f50749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f50750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f50751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f50752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f50754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AnimatorSet f50755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AnimatorSet f50756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AnimatorSet f50757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AnimatorSet f50758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AnimatorSet f50759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ValueAnimator f50760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ValueAnimator f50761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f50762s = new Runnable() { // from class: com.google.android.exoplayer2.ui.h0
        @Override // java.lang.Runnable
        public final void run() {
            this.f50730b.d0();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f50763t = new Runnable() { // from class: com.google.android.exoplayer2.ui.k0
        @Override // java.lang.Runnable
        public final void run() {
            this.f50736b.D();
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f50764u = new Runnable() { // from class: com.google.android.exoplayer2.ui.l0
        @Override // java.lang.Runnable
        public final void run() {
            this.f50738b.H();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f50765v = new Runnable() { // from class: com.google.android.exoplayer2.ui.m0
        @Override // java.lang.Runnable
        public final void run() {
            this.f50740b.G();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f50766w = new Runnable() { // from class: com.google.android.exoplayer2.ui.n0
        @Override // java.lang.Runnable
        public final void run() {
            this.f50742b.E();
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View.OnLayoutChangeListener f50767x = new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.o0
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f50743b.S(view, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    };
    private boolean C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f50769z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List<View> f50768y = new ArrayList();

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (p0.this.f50745b != null) {
                p0.this.f50745b.setVisibility(4);
            }
            if (p0.this.f50746c != null) {
                p0.this.f50746c.setVisibility(4);
            }
            if (p0.this.f50748e != null) {
                p0.this.f50748e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(p0.this.f50753j instanceof DefaultTimeBar) || p0.this.A) {
                return;
            }
            ((DefaultTimeBar) p0.this.f50753j).h(250L);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (p0.this.f50745b != null) {
                p0.this.f50745b.setVisibility(0);
            }
            if (p0.this.f50746c != null) {
                p0.this.f50746c.setVisibility(0);
            }
            if (p0.this.f50748e != null) {
                p0.this.f50748e.setVisibility(p0.this.A ? 0 : 4);
            }
            if (!(p0.this.f50753j instanceof DefaultTimeBar) || p0.this.A) {
                return;
            }
            ((DefaultTimeBar) p0.this.f50753j).u(250L);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StyledPlayerControlView f50772b;

        c(StyledPlayerControlView styledPlayerControlView) {
            this.f50772b = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p0.this.a0(1);
            if (p0.this.B) {
                this.f50772b.post(p0.this.f50762s);
                p0.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p0.this.a0(3);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StyledPlayerControlView f50774b;

        d(StyledPlayerControlView styledPlayerControlView) {
            this.f50774b = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p0.this.a0(2);
            if (p0.this.B) {
                this.f50774b.post(p0.this.f50762s);
                p0.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p0.this.a0(3);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StyledPlayerControlView f50776b;

        e(StyledPlayerControlView styledPlayerControlView) {
            this.f50776b = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p0.this.a0(2);
            if (p0.this.B) {
                this.f50776b.post(p0.this.f50762s);
                p0.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p0.this.a0(3);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p0.this.a0(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p0.this.a0(4);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p0.this.a0(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p0.this.a0(4);
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (p0.this.f50749f != null) {
                p0.this.f50749f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (p0.this.f50751h != null) {
                p0.this.f50751h.setVisibility(0);
                p0.this.f50751h.setTranslationX(p0.this.f50751h.getWidth());
                p0.this.f50751h.scrollTo(p0.this.f50751h.getWidth(), 0);
            }
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    public class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (p0.this.f50751h != null) {
                p0.this.f50751h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (p0.this.f50749f != null) {
                p0.this.f50749f.setVisibility(0);
            }
        }
    }

    public p0(StyledPlayerControlView styledPlayerControlView) {
        this.f50744a = styledPlayerControlView;
        this.f50745b = styledPlayerControlView.findViewById(R.id.exo_controls_background);
        this.f50746c = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_center_controls);
        this.f50748e = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_bottom_bar);
        this.f50747d = viewGroup;
        this.f50752i = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_time);
        View viewFindViewById = styledPlayerControlView.findViewById(R.id.exo_progress);
        this.f50753j = viewFindViewById;
        this.f50749f = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_basic_controls);
        this.f50750g = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_extra_controls);
        this.f50751h = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = styledPlayerControlView.findViewById(R.id.exo_overflow_show);
        this.f50754k = viewFindViewById2;
        View viewFindViewById3 = styledPlayerControlView.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f50710b.U(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f50710b.U(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.e0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f50724b.K(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f50726b.L(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = styledPlayerControlView.getResources();
        int i10 = R.dimen.exo_styled_bottom_bar_height;
        float dimension = resources.getDimension(i10) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(i10);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50755l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(styledPlayerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(O(0.0f, dimension, viewFindViewById)).with(O(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f50756m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(styledPlayerControlView));
        animatorSet2.play(O(dimension, dimension2, viewFindViewById)).with(O(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f50757n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(styledPlayerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(O(0.0f, dimension2, viewFindViewById)).with(O(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f50758o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(O(dimension, 0.0f, viewFindViewById)).with(O(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f50759p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(O(dimension2, 0.0f, viewFindViewById)).with(O(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f50760q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.i0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f50732b.M(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f50761r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.j0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f50735b.N(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    private static int B(@androidx.annotation.p0 View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.f50757n.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        a0(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.f50755l.start();
        V(this.f50764u, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.f50756m.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f50745b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f50746c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f50748e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f50745b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f50746c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f50748e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private static ObjectAnimator O(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean zF0 = f0();
        if (this.A != zF0) {
            this.A = zF0;
            view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50706b.e0();
                }
            });
        }
        boolean z10 = i12 - i10 != i16 - i14;
        if (this.A || !z10) {
            return;
        }
        view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f50728b.T();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        int i10;
        if (this.f50749f == null || this.f50750g == null) {
            return;
        }
        int width = (this.f50744a.getWidth() - this.f50744a.getPaddingLeft()) - this.f50744a.getPaddingRight();
        while (true) {
            if (this.f50750g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f50750g.getChildCount() - 2;
            View childAt = this.f50750g.getChildAt(childCount);
            this.f50750g.removeViewAt(childCount);
            this.f50749f.addView(childAt, 0);
        }
        View view = this.f50754k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f50752i);
        int childCount2 = this.f50749f.getChildCount() - 1;
        for (int i11 = 0; i11 < childCount2; i11++) {
            iB += B(this.f50749f.getChildAt(i11));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f50751h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f50761r.isStarted()) {
                return;
            }
            this.f50760q.cancel();
            this.f50761r.start();
            return;
        }
        View view2 = this.f50754k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f50754k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = this.f50749f.getChildAt(i12);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f50749f.removeViews(0, arrayList.size());
        for (i10 = 0; i10 < arrayList.size(); i10++) {
            this.f50750g.addView((View) arrayList.get(i10), this.f50750g.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(View view) {
        X();
        if (view.getId() == R.id.exo_overflow_show) {
            this.f50760q.start();
        } else if (view.getId() == R.id.exo_overflow_hide) {
            this.f50761r.start();
        }
    }

    private void V(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f50744a.postDelayed(runnable, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(int i10) {
        int i11 = this.f50769z;
        this.f50769z = i10;
        if (i10 == 2) {
            this.f50744a.setVisibility(8);
        } else if (i11 == 2) {
            this.f50744a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f50744a.l0();
        }
    }

    private boolean b0(View view) {
        int id2 = view.getId();
        return id2 == R.id.exo_bottom_bar || id2 == R.id.exo_prev || id2 == R.id.exo_next || id2 == R.id.exo_rew || id2 == R.id.exo_rew_with_amount || id2 == R.id.exo_ffwd || id2 == R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        if (!this.C) {
            a0(0);
            X();
            return;
        }
        int i10 = this.f50769z;
        if (i10 == 1) {
            this.f50758o.start();
        } else if (i10 == 2) {
            this.f50759p.start();
        } else if (i10 == 3) {
            this.B = true;
        } else if (i10 == 4) {
            return;
        }
        X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        ViewGroup viewGroup = this.f50748e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.A ? 0 : 4);
        }
        View view = this.f50753j;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int dimensionPixelSize = this.f50744a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
            if (this.A) {
                dimensionPixelSize = 0;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            this.f50753j.setLayoutParams(marginLayoutParams);
            View view2 = this.f50753j;
            if (view2 instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                if (this.A) {
                    defaultTimeBar.i(true);
                } else {
                    int i10 = this.f50769z;
                    if (i10 == 1) {
                        defaultTimeBar.i(false);
                    } else if (i10 != 3) {
                        defaultTimeBar.t();
                    }
                }
            }
        }
        for (View view3 : this.f50768y) {
            view3.setVisibility((this.A && b0(view3)) ? 4 : 0);
        }
    }

    private boolean f0() {
        int width = (this.f50744a.getWidth() - this.f50744a.getPaddingLeft()) - this.f50744a.getPaddingRight();
        int height = (this.f50744a.getHeight() - this.f50744a.getPaddingBottom()) - this.f50744a.getPaddingTop();
        int iB = B(this.f50746c);
        ViewGroup viewGroup = this.f50746c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f50746c.getPaddingRight() : 0);
        int iZ = z(this.f50746c);
        ViewGroup viewGroup2 = this.f50746c;
        return width <= Math.max(paddingLeft, B(this.f50752i) + B(this.f50754k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f50746c.getPaddingBottom() : 0)) + (z(this.f50747d) * 2);
    }

    private void y(float f10) {
        ViewGroup viewGroup = this.f50751h;
        if (viewGroup != null) {
            this.f50751h.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f10)));
        }
        ViewGroup viewGroup2 = this.f50752i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f50749f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    private static int z(@androidx.annotation.p0 View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(@androidx.annotation.p0 View view) {
        return view != null && this.f50768y.contains(view);
    }

    public void C() {
        int i10 = this.f50769z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        W();
        if (!this.C) {
            E();
        } else if (this.f50769z == 1) {
            H();
        } else {
            D();
        }
    }

    public void F() {
        int i10 = this.f50769z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        W();
        E();
    }

    public boolean I() {
        return this.C;
    }

    public boolean J() {
        return this.f50769z == 0 && this.f50744a.k0();
    }

    public void P() {
        this.f50744a.addOnLayoutChangeListener(this.f50767x);
    }

    public void Q() {
        this.f50744a.removeOnLayoutChangeListener(this.f50767x);
    }

    public void R(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f50745b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void W() {
        this.f50744a.removeCallbacks(this.f50766w);
        this.f50744a.removeCallbacks(this.f50763t);
        this.f50744a.removeCallbacks(this.f50765v);
        this.f50744a.removeCallbacks(this.f50764u);
    }

    public void X() {
        if (this.f50769z == 3) {
            return;
        }
        W();
        int showTimeoutMs = this.f50744a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                V(this.f50766w, showTimeoutMs);
            } else if (this.f50769z == 1) {
                V(this.f50764u, 2000L);
            } else {
                V(this.f50765v, showTimeoutMs);
            }
        }
    }

    public void Y(boolean z10) {
        this.C = z10;
    }

    public void Z(@androidx.annotation.p0 View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (!z10) {
            view.setVisibility(8);
            this.f50768y.remove(view);
            return;
        }
        if (this.A && b0(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f50768y.add(view);
    }

    public void c0() {
        if (!this.f50744a.k0()) {
            this.f50744a.setVisibility(0);
            this.f50744a.v0();
            this.f50744a.q0();
        }
        d0();
    }
}
