package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.appcompat.widget.b1;
import androidx.core.util.n;
import androidx.core.view.accessibility.a0;
import androidx.core.view.d1;
import androidx.core.view.j1;
import androidx.core.view.s;
import androidx.core.widget.q;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    private static final int G2 = -1;
    private static final String G3 = "TabLayout";
    public static final int J3 = 0;
    public static final int K3 = 1;
    public static final int L3 = 2;
    public static final int M3 = 0;
    public static final int N3 = 1;
    public static final int O3 = 0;
    public static final int P3 = 1;
    public static final int Q3 = 2;
    public static final int R3 = 0;
    public static final int S3 = 1;
    public static final int T3 = 2;
    public static final int U3 = 3;
    public static final int V3 = 0;
    public static final int W3 = 1;
    public static final int X3 = 2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @r(unit = 0)
    private static final int f55428c0 = 72;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @r(unit = 0)
    static final int f55429p1 = 8;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @r(unit = 0)
    static final int f55430p2 = 16;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @r(unit = 0)
    private static final int f55432x1 = 48;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f55433x2 = -1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @r(unit = 0)
    private static final int f55434y1 = 56;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f55435y2 = 300;
    private int A;
    int B;
    int C;
    int D;
    int E;
    boolean F;
    boolean G;
    int H;
    int I;
    boolean J;
    private com.google.android.material.tabs.c K;
    private final TimeInterpolator L;

    @p0
    private c M;
    private final ArrayList<c> N;

    @p0
    private c O;
    private ValueAnimator P;

    @p0
    ViewPager Q;

    @p0
    private androidx.viewpager.widget.a R;
    private DataSetObserver S;
    private l T;
    private b U;
    private boolean V;
    private int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final n.a<TabView> f55436a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f55437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<h> f55438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private h f55439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    final SlidingTabIndicator f55440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f55441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f55442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f55443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f55444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f55445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f55446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f55447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ColorStateList f55448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ColorStateList f55449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ColorStateList f55450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @n0
    Drawable f55451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f55452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    PorterDuff.Mode f55453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f55454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f55455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    float f55456u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final int f55457v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f55458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f55459x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f55460y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f55461z;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f55427b0 = R.style.Widget_Design_TabLayout;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final n.a<h> f55431p3 = new n.c(16);

    public class SlidingTabIndicator extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ValueAnimator f55462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f55463c;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f55465b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f55466c;

            a(View view, View view2) {
                this.f55465b = view;
                this.f55466c = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
                SlidingTabIndicator.this.i(this.f55465b, this.f55466c, valueAnimator.getAnimatedFraction());
            }
        }

        SlidingTabIndicator(Context context) {
            super(context);
            this.f55463c = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f55437b == -1) {
                tabLayout.f55437b = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f55437b);
        }

        private void f(int i10) {
            if (TabLayout.this.W == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                com.google.android.material.tabs.c cVar = TabLayout.this.K;
                TabLayout tabLayout = TabLayout.this;
                cVar.c(tabLayout, childAt, tabLayout.f55451p);
                TabLayout.this.f55437b = i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(View view, View view2, float f10) {
            if (view != null && view.getWidth() > 0) {
                com.google.android.material.tabs.c cVar = TabLayout.this.K;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f10, tabLayout.f55451p);
            } else {
                Drawable drawable = TabLayout.this.f55451p;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f55451p.getBounds().bottom);
            }
            j1.n1(this);
        }

        private void j(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f55437b == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f55437b = i10;
            a aVar = new a(childAt, childAt2);
            if (!z10) {
                this.f55462b.removeAllUpdateListeners();
                this.f55462b.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f55462b = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.L);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f55462b;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f55437b != i10) {
                this.f55462b.cancel();
            }
            j(true, i10, i11);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(@n0 Canvas canvas) {
            int iHeight = TabLayout.this.f55451p.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f55451p.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.D;
            int height = 0;
            if (i10 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i10 == 1) {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            } else if (i10 != 2) {
                iHeight = i10 != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.f55451p.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f55451p.getBounds();
                TabLayout.this.f55451p.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f55451p.draw(canvas);
            }
            super.draw(canvas);
        }

        void h(int i10, float f10) {
            TabLayout.this.f55437b = Math.round(i10 + f10);
            ValueAnimator valueAnimator = this.f55462b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f55462b.cancel();
            }
            i(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f55462b;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                j(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.B == 1 || tabLayout.E == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) j0.g(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.B = 0;
                    tabLayout2.Y(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }

        void setSelectedIndicatorHeight(int i10) {
            Rect bounds = TabLayout.this.f55451p.getBounds();
            TabLayout.this.f55451p.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }
    }

    public final class TabView extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h f55468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f55469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f55470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private View f55471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private com.google.android.material.badge.a f55472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private View f55473g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        private TextView f55474h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        private ImageView f55475i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        private Drawable f55476j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f55477k;

        public class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f55479b;

            a(View view) {
                this.f55479b = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f55479b.getVisibility() == 0) {
                    TabView.this.w(this.f55479b);
                }
            }
        }

        public TabView(Context context) {
            super(context);
            this.f55477k = 2;
            y(context);
            j1.d2(this, TabLayout.this.f55441f, TabLayout.this.f55442g, TabLayout.this.f55443h, TabLayout.this.f55444i);
            setGravity(17);
            setOrientation(!TabLayout.this.F ? 1 : 0);
            setClickable(true);
            j1.g2(this, d1.c(getContext(), 1002));
        }

        private void B(@p0 TextView textView, @p0 ImageView imageView, boolean z10) {
            boolean z11;
            h hVar = this.f55468b;
            Drawable drawableMutate = (hVar == null || hVar.h() == null) ? null : androidx.core.graphics.drawable.d.r(this.f55468b.h()).mutate();
            if (drawableMutate != null) {
                androidx.core.graphics.drawable.d.o(drawableMutate, TabLayout.this.f55449n);
                PorterDuff.Mode mode = TabLayout.this.f55453r;
                if (mode != null) {
                    androidx.core.graphics.drawable.d.p(drawableMutate, mode);
                }
            }
            h hVar2 = this.f55468b;
            CharSequence charSequenceN = hVar2 != null ? hVar2.n() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z12 = !TextUtils.isEmpty(charSequenceN);
            if (textView != null) {
                z11 = z12 && this.f55468b.f55492g == 1;
                textView.setText(z12 ? charSequenceN : null);
                textView.setVisibility(z11 ? 0 : 8);
                if (z12) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iG = (z11 && imageView.getVisibility() == 0) ? (int) j0.g(getContext(), 8) : 0;
                if (TabLayout.this.F) {
                    if (iG != s.b(marginLayoutParams)) {
                        s.g(marginLayoutParams, iG);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iG != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iG;
                    s.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            h hVar3 = this.f55468b;
            CharSequence charSequence = hVar3 != null ? hVar3.f55489d : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (!z12) {
                    charSequenceN = charSequence;
                }
                b1.a(this, charSequenceN);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @p0
        public com.google.android.material.badge.a getBadge() {
            return this.f55472f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @n0
        public com.google.android.material.badge.a getOrCreateBadge() {
            if (this.f55472f == null) {
                this.f55472f = com.google.android.material.badge.a.d(getContext());
            }
            v();
            com.google.android.material.badge.a aVar = this.f55472f;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void i(@p0 View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float j(@n0 Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private void k(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        @n0
        private FrameLayout l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(@n0 Canvas canvas) {
            Drawable drawable = this.f55476j;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f55476j.draw(canvas);
            }
        }

        @p0
        private FrameLayout n(@n0 View view) {
            if ((view == this.f55470d || view == this.f55469c) && com.google.android.material.badge.b.f53129a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o() {
            return this.f55472f != null;
        }

        private void p() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.b.f53129a) {
                FrameLayout frameLayoutL = l();
                addView(frameLayoutL, 0);
                viewGroup = frameLayoutL;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, viewGroup, false);
            this.f55470d = imageView;
            viewGroup.addView(imageView, 0);
        }

        private void q() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.b.f53129a) {
                FrameLayout frameLayoutL = l();
                addView(frameLayoutL);
                viewGroup = frameLayoutL;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, viewGroup, false);
            this.f55469c = textView;
            viewGroup.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r() {
            if (this.f55471e != null) {
                u();
            }
            this.f55472f = null;
        }

        private void t(@p0 View view) {
            if (o() && view != null) {
                k(false);
                com.google.android.material.badge.b.d(this.f55472f, view, n(view));
                this.f55471e = view;
            }
        }

        private void u() {
            if (o()) {
                k(true);
                View view = this.f55471e;
                if (view != null) {
                    com.google.android.material.badge.b.j(this.f55472f, view);
                    this.f55471e = null;
                }
            }
        }

        private void v() {
            h hVar;
            h hVar2;
            if (o()) {
                if (this.f55473g != null) {
                    u();
                    return;
                }
                if (this.f55470d != null && (hVar2 = this.f55468b) != null && hVar2.h() != null) {
                    View view = this.f55471e;
                    ImageView imageView = this.f55470d;
                    if (view == imageView) {
                        w(imageView);
                        return;
                    } else {
                        u();
                        t(this.f55470d);
                        return;
                    }
                }
                if (this.f55469c == null || (hVar = this.f55468b) == null || hVar.l() != 1) {
                    u();
                    return;
                }
                View view2 = this.f55471e;
                TextView textView = this.f55469c;
                if (view2 == textView) {
                    w(textView);
                } else {
                    u();
                    t(this.f55469c);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(@n0 View view) {
            if (o() && view == this.f55471e) {
                com.google.android.material.badge.b.m(this.f55472f, view, n(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(Context context) {
            GradientDrawable gradientDrawable;
            int i10 = TabLayout.this.f55457v;
            if (i10 != 0) {
                Drawable drawableB = b0.a.b(context, i10);
                this.f55476j = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f55476j.setState(getDrawableState());
                }
            } else {
                this.f55476j = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (TabLayout.this.f55450o != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListA = com.google.android.material.ripple.b.a(TabLayout.this.f55450o);
                boolean z10 = TabLayout.this.J;
                if (z10) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z10 ? null : gradientDrawable3);
            }
            j1.I1(this, rippleDrawable);
            TabLayout.this.invalidate();
        }

        final void A() {
            ViewParent parent;
            h hVar = this.f55468b;
            View viewG = hVar != null ? hVar.g() : null;
            if (viewG != null) {
                ViewParent parent2 = viewG.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewG);
                    }
                    View view = this.f55473g;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f55473g);
                    }
                    addView(viewG);
                }
                this.f55473g = viewG;
                TextView textView = this.f55469c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f55470d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f55470d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewG.findViewById(android.R.id.text1);
                this.f55474h = textView2;
                if (textView2 != null) {
                    this.f55477k = q.k(textView2);
                }
                this.f55475i = (ImageView) viewG.findViewById(android.R.id.icon);
            } else {
                View view2 = this.f55473g;
                if (view2 != null) {
                    removeView(view2);
                    this.f55473g = null;
                }
                this.f55474h = null;
                this.f55475i = null;
            }
            if (this.f55473g == null) {
                if (this.f55470d == null) {
                    p();
                }
                if (this.f55469c == null) {
                    q();
                    this.f55477k = q.k(this.f55469c);
                }
                q.E(this.f55469c, TabLayout.this.f55445j);
                if (!isSelected() || TabLayout.this.f55447l == -1) {
                    q.E(this.f55469c, TabLayout.this.f55446k);
                } else {
                    q.E(this.f55469c, TabLayout.this.f55447l);
                }
                ColorStateList colorStateList = TabLayout.this.f55448m;
                if (colorStateList != null) {
                    this.f55469c.setTextColor(colorStateList);
                }
                B(this.f55469c, this.f55470d, true);
                v();
                i(this.f55470d);
                i(this.f55469c);
            } else {
                TextView textView3 = this.f55474h;
                if (textView3 != null || this.f55475i != null) {
                    B(textView3, this.f55475i, false);
                }
            }
            if (hVar == null || TextUtils.isEmpty(hVar.f55489d)) {
                return;
            }
            setContentDescription(hVar.f55489d);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f55476j;
            boolean state = false;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.f55476j.setState(drawableState);
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f55469c, this.f55470d, this.f55473g};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f55469c, this.f55470d, this.f55473g};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        @p0
        public h getTab() {
            return this.f55468b;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.f55472f;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f55472f.o()));
            }
            a0 a0VarG2 = a0.g2(accessibilityNodeInfo);
            a0VarG2.e1(a0.e.h(0, 1, this.f55468b.k(), 1, false, isSelected()));
            if (isSelected()) {
                a0VarG2.c1(false);
                a0VarG2.P0(a0.a.f21380j);
            }
            a0VarG2.K1(getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f55458w, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f55469c != null) {
                float f10 = TabLayout.this.f55454s;
                int i12 = this.f55477k;
                ImageView imageView = this.f55470d;
                boolean z10 = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f55469c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f55456u;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f55469c.getTextSize();
                int lineCount = this.f55469c.getLineCount();
                int iK = q.k(this.f55469c);
                if (f10 != textSize || (iK >= 0 && i12 != iK)) {
                    if (TabLayout.this.E == 1 && f10 > textSize && lineCount == 1 && ((layout = this.f55469c.getLayout()) == null || j(layout, 0, f10) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f55469c.setTextSize(0, f10);
                        this.f55469c.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f55468b == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f55468b.r();
            return true;
        }

        void s() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f55469c;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f55470d;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f55473g;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        void setTab(@p0 h hVar) {
            if (hVar != this.f55468b) {
                this.f55468b = hVar;
                x();
            }
        }

        final void x() {
            A();
            h hVar = this.f55468b;
            setSelected(hVar != null && hVar.o());
        }

        final void z() {
            setOrientation(!TabLayout.this.F ? 1 : 0);
            TextView textView = this.f55474h;
            if (textView == null && this.f55475i == null) {
                B(this.f55469c, this.f55470d, true);
            } else {
                B(textView, this.f55475i, false);
            }
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f55482b;

        b() {
        }

        void a(boolean z10) {
            this.f55482b = z10;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(@n0 ViewPager viewPager, @p0 androidx.viewpager.widget.a aVar, @p0 androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.Q == viewPager) {
                tabLayout.T(aVar2, this.f55482b);
            }
        }
    }

    @Deprecated
    public interface c<T extends h> {
        void a(T t10);

        void b(T t10);

        void c(T t10);
    }

    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface e {
    }

    public interface f extends c<h> {
    }

    public class g extends DataSetObserver {
        g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.J();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.J();
        }
    }

    public static class h {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f55485k = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private Object f55486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private Drawable f55487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private CharSequence f55488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private CharSequence f55489d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private View f55491f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        public TabLayout f55493h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @n0
        public TabView f55494i;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f55490e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @d
        private int f55492g = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f55495j = -1;

        @s9.a
        @n0
        public h A(@d int i10) {
            this.f55492g = i10;
            TabLayout tabLayout = this.f55493h;
            if (tabLayout.B == 1 || tabLayout.E == 2) {
                tabLayout.Y(true);
            }
            E();
            if (com.google.android.material.badge.b.f53129a && this.f55494i.o() && this.f55494i.f55472f.isVisible()) {
                this.f55494i.invalidate();
            }
            return this;
        }

        @s9.a
        @n0
        public h B(@p0 Object obj) {
            this.f55486a = obj;
            return this;
        }

        @s9.a
        @n0
        public h C(@androidx.annotation.d1 int i10) {
            TabLayout tabLayout = this.f55493h;
            if (tabLayout != null) {
                return D(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @s9.a
        @n0
        public h D(@p0 CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f55489d) && !TextUtils.isEmpty(charSequence)) {
                this.f55494i.setContentDescription(charSequence);
            }
            this.f55488c = charSequence;
            E();
            return this;
        }

        void E() {
            TabView tabView = this.f55494i;
            if (tabView != null) {
                tabView.x();
            }
        }

        @p0
        public com.google.android.material.badge.a e() {
            return this.f55494i.getBadge();
        }

        @p0
        public CharSequence f() {
            TabView tabView = this.f55494i;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @p0
        public View g() {
            return this.f55491f;
        }

        @p0
        public Drawable h() {
            return this.f55487b;
        }

        public int i() {
            return this.f55495j;
        }

        @n0
        public com.google.android.material.badge.a j() {
            return this.f55494i.getOrCreateBadge();
        }

        public int k() {
            return this.f55490e;
        }

        @d
        public int l() {
            return this.f55492g;
        }

        @p0
        public Object m() {
            return this.f55486a;
        }

        @p0
        public CharSequence n() {
            return this.f55488c;
        }

        public boolean o() {
            TabLayout tabLayout = this.f55493h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f55490e;
        }

        public void p() {
            this.f55494i.r();
        }

        void q() {
            this.f55493h = null;
            this.f55494i = null;
            this.f55486a = null;
            this.f55487b = null;
            this.f55495j = -1;
            this.f55488c = null;
            this.f55489d = null;
            this.f55490e = -1;
            this.f55491f = null;
        }

        public void r() {
            TabLayout tabLayout = this.f55493h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.R(this);
        }

        @s9.a
        @n0
        public h s(@androidx.annotation.d1 int i10) {
            TabLayout tabLayout = this.f55493h;
            if (tabLayout != null) {
                return t(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @s9.a
        @n0
        public h t(@p0 CharSequence charSequence) {
            this.f55489d = charSequence;
            E();
            return this;
        }

        @s9.a
        @n0
        public h u(@i0 int i10) {
            return v(LayoutInflater.from(this.f55494i.getContext()).inflate(i10, (ViewGroup) this.f55494i, false));
        }

        @s9.a
        @n0
        public h v(@p0 View view) {
            this.f55491f = view;
            E();
            return this;
        }

        @s9.a
        @n0
        public h w(@v int i10) {
            TabLayout tabLayout = this.f55493h;
            if (tabLayout != null) {
                return x(b0.a.b(tabLayout.getContext(), i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @s9.a
        @n0
        public h x(@p0 Drawable drawable) {
            this.f55487b = drawable;
            TabLayout tabLayout = this.f55493h;
            if (tabLayout.B == 1 || tabLayout.E == 2) {
                tabLayout.Y(true);
            }
            E();
            if (com.google.android.material.badge.b.f53129a && this.f55494i.o() && this.f55494i.f55472f.isVisible()) {
                this.f55494i.invalidate();
            }
            return this;
        }

        @s9.a
        @n0
        public h y(int i10) {
            this.f55495j = i10;
            TabView tabView = this.f55494i;
            if (tabView != null) {
                tabView.setId(i10);
            }
            return this;
        }

        void z(int i10) {
            this.f55490e = i10;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface i {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface j {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface k {
    }

    public static class l implements ViewPager.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private final WeakReference<TabLayout> f55496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f55497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f55498d;

        public l(TabLayout tabLayout) {
            this.f55496b = new WeakReference<>(tabLayout);
        }

        void b() {
            this.f55498d = 0;
            this.f55497c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
            this.f55497c = this.f55498d;
            this.f55498d = i10;
            TabLayout tabLayout = this.f55496b.get();
            if (tabLayout != null) {
                tabLayout.Z(this.f55498d);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f55496b.get();
            if (tabLayout != null) {
                int i12 = this.f55498d;
                tabLayout.U(i10, f10, i12 != 2 || this.f55497c == 1, (i12 == 2 && this.f55497c == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            TabLayout tabLayout = this.f55496b.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f55498d;
            tabLayout.S(tabLayout.D(i10), i11 == 0 || (i11 == 2 && this.f55497c == 0));
        }
    }

    public static class m implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewPager f55499a;

        public m(ViewPager viewPager) {
            this.f55499a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@n0 h hVar) {
            this.f55499a.setCurrentItem(hVar.k());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(h hVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(h hVar) {
        }
    }

    public TabLayout(@n0 Context context) {
        this(context, null);
    }

    public TabLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f55427b0;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f55437b = -1;
        this.f55438c = new ArrayList<>();
        this.f55447l = -1;
        this.f55452q = 0;
        this.f55458w = Integer.MAX_VALUE;
        this.H = -1;
        this.N = new ArrayList<>();
        this.f55436a0 = new n.b(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.f55440e = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = R.styleable.f52892y1;
        int i12 = R.styleable.TabLayout_tabTextAppearance;
        TypedArray typedArrayK = c0.k(context2, attributeSet, iArr, i10, i11, i12);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
            kVar.o0(ColorStateList.valueOf(colorDrawable.getColor()));
            kVar.Z(context2);
            kVar.n0(j1.R(this));
            j1.I1(this, kVar);
        }
        setSelectedTabIndicator(com.google.android.material.resources.c.e(context2, typedArrayK, R.styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayK.getColor(R.styleable.TabLayout_tabIndicatorColor, 0));
        slidingTabIndicator.setSelectedIndicatorHeight(typedArrayK.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayK.getInt(R.styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayK.getInt(R.styleable.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayK.getBoolean(R.styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayK.getDimensionPixelSize(R.styleable.TabLayout_tabPadding, 0);
        this.f55444i = dimensionPixelSize;
        this.f55443h = dimensionPixelSize;
        this.f55442g = dimensionPixelSize;
        this.f55441f = dimensionPixelSize;
        this.f55441f = typedArrayK.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f55442g = typedArrayK.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingTop, this.f55442g);
        this.f55443h = typedArrayK.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingEnd, this.f55443h);
        this.f55444i = typedArrayK.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingBottom, this.f55444i);
        if (c0.h(context2)) {
            this.f55445j = R.attr.textAppearanceTitleSmall;
        } else {
            this.f55445j = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayK.getResourceId(i12, R.style.TextAppearance_Design_Tab);
        this.f55446k = resourceId;
        int[] iArr2 = androidx.appcompat.R.styleable.D;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i13 = androidx.appcompat.R.styleable.TextAppearance_android_textSize;
            this.f55454s = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, 0);
            int i14 = androidx.appcompat.R.styleable.TextAppearance_android_textColor;
            this.f55448m = com.google.android.material.resources.c.a(context2, typedArrayObtainStyledAttributes, i14);
            typedArrayObtainStyledAttributes.recycle();
            int i15 = R.styleable.TabLayout_tabSelectedTextAppearance;
            if (typedArrayK.hasValue(i15)) {
                this.f55447l = typedArrayK.getResourceId(i15, resourceId);
            }
            int i16 = this.f55447l;
            if (i16 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i16, iArr2);
                try {
                    this.f55455t = typedArrayObtainStyledAttributes2.getDimensionPixelSize(i13, (int) this.f55454s);
                    ColorStateList colorStateListA = com.google.android.material.resources.c.a(context2, typedArrayObtainStyledAttributes2, i14);
                    if (colorStateListA != null) {
                        this.f55448m = v(this.f55448m.getDefaultColor(), colorStateListA.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            }
            int i17 = R.styleable.TabLayout_tabTextColor;
            if (typedArrayK.hasValue(i17)) {
                this.f55448m = com.google.android.material.resources.c.a(context2, typedArrayK, i17);
            }
            int i18 = R.styleable.TabLayout_tabSelectedTextColor;
            if (typedArrayK.hasValue(i18)) {
                this.f55448m = v(this.f55448m.getDefaultColor(), typedArrayK.getColor(i18, 0));
            }
            this.f55449n = com.google.android.material.resources.c.a(context2, typedArrayK, R.styleable.TabLayout_tabIconTint);
            this.f55453r = j0.r(typedArrayK.getInt(R.styleable.TabLayout_tabIconTintMode, -1), null);
            this.f55450o = com.google.android.material.resources.c.a(context2, typedArrayK, R.styleable.TabLayout_tabRippleColor);
            this.C = typedArrayK.getInt(R.styleable.TabLayout_tabIndicatorAnimationDuration, 300);
            this.L = i9.a.g(context2, R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.f52897b);
            this.f55459x = typedArrayK.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
            this.f55460y = typedArrayK.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
            this.f55457v = typedArrayK.getResourceId(R.styleable.TabLayout_tabBackground, 0);
            this.A = typedArrayK.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
            this.E = typedArrayK.getInt(R.styleable.TabLayout_tabMode, 1);
            this.B = typedArrayK.getInt(R.styleable.TabLayout_tabGravity, 0);
            this.F = typedArrayK.getBoolean(R.styleable.TabLayout_tabInlineLabel, false);
            this.J = typedArrayK.getBoolean(R.styleable.TabLayout_tabUnboundedRipple, false);
            typedArrayK.recycle();
            Resources resources = getResources();
            this.f55456u = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f55461z = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            r();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    private void A(@n0 h hVar) {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            this.N.get(size).a(hVar);
        }
    }

    private void B(@n0 h hVar) {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            this.N.get(size).b(hVar);
        }
    }

    private void C() {
        if (this.P == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.P = valueAnimator;
            valueAnimator.setInterpolator(this.L);
            this.P.setDuration(this.C);
            this.P.addUpdateListener(new a());
        }
    }

    private boolean G() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void Q(int i10) {
        TabView tabView = (TabView) this.f55440e.getChildAt(i10);
        this.f55440e.removeViewAt(i10);
        if (tabView != null) {
            tabView.s();
            this.f55436a0.b(tabView);
        }
        requestLayout();
    }

    private void V(@p0 ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.Q;
        if (viewPager2 != null) {
            l lVar = this.T;
            if (lVar != null) {
                viewPager2.O(lVar);
            }
            b bVar = this.U;
            if (bVar != null) {
                this.Q.N(bVar);
            }
        }
        c cVar = this.O;
        if (cVar != null) {
            M(cVar);
            this.O = null;
        }
        if (viewPager != null) {
            this.Q = viewPager;
            if (this.T == null) {
                this.T = new l(this);
            }
            this.T.b();
            viewPager.c(this.T);
            m mVar = new m(viewPager);
            this.O = mVar;
            g(mVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                T(adapter, z10);
            }
            if (this.U == null) {
                this.U = new b();
            }
            this.U.a(z10);
            viewPager.b(this.U);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.Q = null;
            T(null, false);
        }
        this.V = z11;
    }

    private void W() {
        int size = this.f55438c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f55438c.get(i10).E();
        }
    }

    private void X(@n0 LinearLayout.LayoutParams layoutParams) {
        if (this.E == 1 && this.B == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    @r(unit = 0)
    private int getDefaultHeight() {
        int size = this.f55438c.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f55438c.get(i10);
            if (hVar != null && hVar.h() != null && !TextUtils.isEmpty(hVar.n())) {
                z10 = true;
                break;
            }
        }
        return (!z10 || this.F) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i10 = this.f55459x;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.E;
        if (i11 == 0 || i11 == 2) {
            return this.f55461z;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f55440e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void m(@n0 TabItem tabItem) {
        h hVarI = I();
        CharSequence charSequence = tabItem.f55424b;
        if (charSequence != null) {
            hVarI.D(charSequence);
        }
        Drawable drawable = tabItem.f55425c;
        if (drawable != null) {
            hVarI.x(drawable);
        }
        int i10 = tabItem.f55426d;
        if (i10 != 0) {
            hVarI.u(i10);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            hVarI.t(tabItem.getContentDescription());
        }
        i(hVarI);
    }

    private void n(@n0 h hVar) {
        TabView tabView = hVar.f55494i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f55440e.addView(tabView, hVar.k(), w());
    }

    private void o(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        m((TabItem) view);
    }

    private void p(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !j1.U0(this) || this.f55440e.d()) {
            setScrollPosition(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iS = s(i10, 0.0f);
        if (scrollX != iS) {
            C();
            this.P.setIntValues(scrollX, iS);
            this.P.start();
        }
        this.f55440e.c(i10, this.C);
    }

    private void q(int i10) {
        if (i10 == 0) {
            Log.w(G3, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f55440e.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f55440e.setGravity(androidx.core.view.n.f21701b);
    }

    private void r() {
        int i10 = this.E;
        j1.d2(this.f55440e, (i10 == 0 || i10 == 2) ? Math.max(0, this.A - this.f55441f) : 0, 0, 0, 0);
        int i11 = this.E;
        if (i11 == 0) {
            q(this.B);
        } else if (i11 == 1 || i11 == 2) {
            if (this.B == 2) {
                Log.w(G3, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f55440e.setGravity(1);
        }
        Y(true);
    }

    private int s(int i10, float f10) {
        View childAt;
        int i11 = this.E;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f55440e.getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f55440e.getChildCount() ? this.f55440e.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return j1.Z(this) == 0 ? left + i13 : left - i13;
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f55440e.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f55440e.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).A();
                    }
                }
                i11++;
            }
        }
    }

    private void u(@n0 h hVar, int i10) {
        hVar.z(i10);
        this.f55438c.add(i10, hVar);
        int size = this.f55438c.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (this.f55438c.get(i12).k() == this.f55437b) {
                i11 = i12;
            }
            this.f55438c.get(i12).z(i12);
        }
        this.f55437b = i11;
    }

    @n0
    private static ColorStateList v(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    @n0
    private LinearLayout.LayoutParams w() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        X(layoutParams);
        return layoutParams;
    }

    @n0
    private TabView y(@n0 h hVar) {
        n.a<TabView> aVar = this.f55436a0;
        TabView tabViewA = aVar != null ? aVar.a() : null;
        if (tabViewA == null) {
            tabViewA = new TabView(getContext());
        }
        tabViewA.setTab(hVar);
        tabViewA.setFocusable(true);
        tabViewA.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(hVar.f55489d)) {
            tabViewA.setContentDescription(hVar.f55488c);
        } else {
            tabViewA.setContentDescription(hVar.f55489d);
        }
        return tabViewA;
    }

    private void z(@n0 h hVar) {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            this.N.get(size).c(hVar);
        }
    }

    @p0
    public h D(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f55438c.get(i10);
    }

    public boolean E() {
        return this.J;
    }

    public boolean F() {
        return this.F;
    }

    public boolean H() {
        return this.G;
    }

    @n0
    public h I() {
        h hVarX = x();
        hVarX.f55493h = this;
        hVarX.f55494i = y(hVarX);
        if (hVarX.f55495j != -1) {
            hVarX.f55494i.setId(hVarX.f55495j);
        }
        return hVarX;
    }

    void J() {
        int currentItem;
        L();
        androidx.viewpager.widget.a aVar = this.R;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                l(I().D(this.R.getPageTitle(i10)), false);
            }
            ViewPager viewPager = this.Q;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            R(D(currentItem));
        }
    }

    protected boolean K(h hVar) {
        return f55431p3.b(hVar);
    }

    public void L() {
        for (int childCount = this.f55440e.getChildCount() - 1; childCount >= 0; childCount--) {
            Q(childCount);
        }
        Iterator<h> it = this.f55438c.iterator();
        while (it.hasNext()) {
            h next = it.next();
            it.remove();
            next.q();
            K(next);
        }
        this.f55439d = null;
    }

    @Deprecated
    public void M(@p0 c cVar) {
        this.N.remove(cVar);
    }

    public void N(@n0 f fVar) {
        M(fVar);
    }

    public void O(@n0 h hVar) {
        if (hVar.f55493h != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        P(hVar.k());
    }

    public void P(int i10) {
        h hVar = this.f55439d;
        int iK = hVar != null ? hVar.k() : 0;
        Q(i10);
        h hVarRemove = this.f55438c.remove(i10);
        if (hVarRemove != null) {
            hVarRemove.q();
            K(hVarRemove);
        }
        int size = this.f55438c.size();
        int i11 = -1;
        for (int i12 = i10; i12 < size; i12++) {
            if (this.f55438c.get(i12).k() == this.f55437b) {
                i11 = i12;
            }
            this.f55438c.get(i12).z(i12);
        }
        this.f55437b = i11;
        if (iK == i10) {
            R(this.f55438c.isEmpty() ? null : this.f55438c.get(Math.max(0, i10 - 1)));
        }
    }

    public void R(@p0 h hVar) {
        S(hVar, true);
    }

    public void S(@p0 h hVar, boolean z10) {
        h hVar2 = this.f55439d;
        if (hVar2 == hVar) {
            if (hVar2 != null) {
                z(hVar);
                p(hVar.k());
                return;
            }
            return;
        }
        int iK = hVar != null ? hVar.k() : -1;
        if (z10) {
            if ((hVar2 == null || hVar2.k() == -1) && iK != -1) {
                setScrollPosition(iK, 0.0f, true);
            } else {
                p(iK);
            }
            if (iK != -1) {
                setSelectedTabView(iK);
            }
        }
        this.f55439d = hVar;
        if (hVar2 != null && hVar2.f55493h != null) {
            B(hVar2);
        }
        if (hVar != null) {
            A(hVar);
        }
    }

    void T(@p0 androidx.viewpager.widget.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.R;
        if (aVar2 != null && (dataSetObserver = this.S) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.R = aVar;
        if (z10 && aVar != null) {
            if (this.S == null) {
                this.S = new g();
            }
            aVar.registerDataSetObserver(this.S);
        }
        J();
    }

    void U(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        int iRound = Math.round(i10 + f10);
        if (iRound < 0 || iRound >= this.f55440e.getChildCount()) {
            return;
        }
        if (z11) {
            this.f55440e.h(i10, f10);
        }
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.P.cancel();
        }
        int iS = s(i10, f10);
        int scrollX = getScrollX();
        boolean z13 = (i10 < getSelectedTabPosition() && iS >= scrollX) || (i10 > getSelectedTabPosition() && iS <= scrollX) || i10 == getSelectedTabPosition();
        if (j1.Z(this) == 1) {
            z13 = (i10 < getSelectedTabPosition() && iS <= scrollX) || (i10 > getSelectedTabPosition() && iS >= scrollX) || i10 == getSelectedTabPosition();
        }
        if (z13 || this.W == 1 || z12) {
            if (i10 < 0) {
                iS = 0;
            }
            scrollTo(iS, 0);
        }
        if (z10) {
            setSelectedTabView(iRound);
        }
    }

    void Y(boolean z10) {
        for (int i10 = 0; i10 < this.f55440e.getChildCount(); i10++) {
            View childAt = this.f55440e.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            X((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    void Z(int i10) {
        this.W = i10;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        o(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        o(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        o(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        o(view);
    }

    @Deprecated
    public void g(@p0 c cVar) {
        if (this.N.contains(cVar)) {
            return;
        }
        this.N.add(cVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        h hVar = this.f55439d;
        if (hVar != null) {
            return hVar.k();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f55438c.size();
    }

    public int getTabGravity() {
        return this.B;
    }

    @p0
    public ColorStateList getTabIconTint() {
        return this.f55449n;
    }

    public int getTabIndicatorAnimationMode() {
        return this.I;
    }

    public int getTabIndicatorGravity() {
        return this.D;
    }

    int getTabMaxWidth() {
        return this.f55458w;
    }

    public int getTabMode() {
        return this.E;
    }

    @p0
    public ColorStateList getTabRippleColor() {
        return this.f55450o;
    }

    @n0
    public Drawable getTabSelectedIndicator() {
        return this.f55451p;
    }

    @p0
    public ColorStateList getTabTextColors() {
        return this.f55448m;
    }

    public void h(@n0 f fVar) {
        g(fVar);
    }

    public void i(@n0 h hVar) {
        l(hVar, this.f55438c.isEmpty());
    }

    public void j(@n0 h hVar, int i10) {
        k(hVar, i10, this.f55438c.isEmpty());
    }

    public void k(@n0 h hVar, int i10, boolean z10) {
        if (hVar.f55493h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        u(hVar, i10);
        n(hVar);
        if (z10) {
            hVar.r();
        }
    }

    public void l(@n0 h hVar, boolean z10) {
        k(hVar, this.f55438c.size(), z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.e(this);
        if (this.Q == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                V((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.V) {
            setupWithViewPager(null);
            this.V = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(@n0 Canvas canvas) {
        for (int i10 = 0; i10 < this.f55440e.getChildCount(); i10++) {
            View childAt = this.f55440e.getChildAt(i10);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a0.g2(accessibilityNodeInfo).d1(a0.d.f(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return G() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iRound = Math.round(j0.g(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i11);
        boolean z10 = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int iG = this.f55460y;
            if (iG <= 0) {
                iG = (int) (size - j0.g(getContext(), 56));
            }
            this.f55458w = iG;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.E;
            if (i12 == 0) {
                if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                    z10 = true;
                }
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                        z10 = true;
                    }
                }
            } else if (childAt.getMeasuredWidth() != getMeasuredWidth()) {
                z10 = true;
            }
            if (z10) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || G()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.shape.l.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            for (int i10 = 0; i10 < this.f55440e.getChildCount(); i10++) {
                View childAt = this.f55440e.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).z();
                }
            }
            r();
        }
    }

    public void setInlineLabelResource(@androidx.annotation.h int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(@p0 c cVar) {
        c cVar2 = this.M;
        if (cVar2 != null) {
            M(cVar2);
        }
        this.M = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@p0 f fVar) {
        setOnTabSelectedListener((c) fVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        C();
        this.P.addListener(animatorListener);
    }

    public void setScrollPosition(int i10, float f10, boolean z10) {
        setScrollPosition(i10, f10, z10, true);
    }

    public void setScrollPosition(int i10, float f10, boolean z10, boolean z11) {
        U(i10, f10, z10, z11, true);
    }

    public void setSelectedTabIndicator(@v int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(b0.a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicator(@p0 Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.d.r(drawable).mutate();
        this.f55451p = drawableMutate;
        e9.a.j(drawableMutate, this.f55452q);
        int intrinsicHeight = this.H;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f55451p.getIntrinsicHeight();
        }
        this.f55440e.setSelectedIndicatorHeight(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(@androidx.annotation.l int i10) {
        this.f55452q = i10;
        e9.a.j(this.f55451p, i10);
        Y(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.D != i10) {
            this.D = i10;
            j1.n1(this.f55440e);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.H = i10;
        this.f55440e.setSelectedIndicatorHeight(i10);
    }

    public void setTabGravity(int i10) {
        if (this.B != i10) {
            this.B = i10;
            r();
        }
    }

    public void setTabIconTint(@p0 ColorStateList colorStateList) {
        if (this.f55449n != colorStateList) {
            this.f55449n = colorStateList;
            W();
        }
    }

    public void setTabIconTintResource(@androidx.annotation.n int i10) {
        setTabIconTint(b0.a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.I = i10;
        if (i10 == 0) {
            this.K = new com.google.android.material.tabs.c();
            return;
        }
        if (i10 == 1) {
            this.K = new com.google.android.material.tabs.a();
        } else {
            if (i10 == 2) {
                this.K = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.G = z10;
        this.f55440e.g();
        j1.n1(this.f55440e);
    }

    public void setTabMode(int i10) {
        if (i10 != this.E) {
            this.E = i10;
            r();
        }
    }

    public void setTabRippleColor(@p0 ColorStateList colorStateList) {
        if (this.f55450o != colorStateList) {
            this.f55450o = colorStateList;
            for (int i10 = 0; i10 < this.f55440e.getChildCount(); i10++) {
                View childAt = this.f55440e.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@androidx.annotation.n int i10) {
        setTabRippleColor(b0.a.a(getContext(), i10));
    }

    public void setTabTextColors(int i10, int i11) {
        setTabTextColors(v(i10, i11));
    }

    public void setTabTextColors(@p0 ColorStateList colorStateList) {
        if (this.f55448m != colorStateList) {
            this.f55448m = colorStateList;
            W();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@p0 androidx.viewpager.widget.a aVar) {
        T(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            for (int i10 = 0; i10 < this.f55440e.getChildCount(); i10++) {
                View childAt = this.f55440e.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@androidx.annotation.h int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(@p0 ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(@p0 ViewPager viewPager, boolean z10) {
        V(viewPager, z10, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void t() {
        this.N.clear();
    }

    protected h x() {
        h hVarA = f55431p3.a();
        return hVarA == null ? new h() : hVarA;
    }
}
