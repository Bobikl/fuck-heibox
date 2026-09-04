package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.b1;
import androidx.core.view.accessibility.a0;
import androidx.core.view.d1;
import androidx.core.view.j1;
import androidx.core.widget.q;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements n.a {
    private static final int F = -1;
    private static final int[] G = {R.attr.state_checked};
    private static final d H;
    private static final d I;
    private int A;
    private int B;
    private boolean C;
    private int D;

    @p0
    private com.google.android.material.badge.a E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorStateList f54597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    Drawable f54598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f54601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f54602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f54603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f54605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private final FrameLayout f54606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private final View f54607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ImageView f54608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ViewGroup f54609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final TextView f54610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final TextView f54611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f54612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private j f54613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private ColorStateList f54614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private Drawable f54615u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private Drawable f54616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ValueAnimator f54617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private d f54618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f54619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f54620z;

    public class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (NavigationBarItemView.this.f54608n.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.x(navigationBarItemView.f54608n);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f54622b;

        b(int i10) {
            this.f54622b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            NavigationBarItemView.this.y(this.f54622b);
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f54624b;

        c(float f10) {
            this.f54624b = f10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            NavigationBarItemView.this.r(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f54624b);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final float f54626a = 0.4f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final float f54627b = 1.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f54628c = 0.2f;

        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        protected float a(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11) {
            return com.google.android.material.animation.b.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10);
        }

        protected float b(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11) {
            return com.google.android.material.animation.b.a(0.4f, 1.0f, f10);
        }

        protected float c(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11) {
            return 1.0f;
        }

        public void d(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11, @n0 View view) {
            view.setScaleX(b(f10, f11));
            view.setScaleY(c(f10, f11));
            view.setAlpha(a(f10, f11));
        }
    }

    public static class e extends d {
        private e() {
            super(null);
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.d
        protected float c(float f10, float f11) {
            return b(f10, f11);
        }
    }

    static {
        a aVar = null;
        H = new d(aVar);
        I = new e(aVar);
    }

    public NavigationBarItemView(@n0 Context context) {
        super(context);
        this.f54596b = false;
        this.f54612r = -1;
        this.f54618x = H;
        this.f54619y = 0.0f;
        this.f54620z = false;
        this.A = 0;
        this.B = 0;
        this.C = false;
        this.D = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f54606l = (FrameLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_container);
        this.f54607m = findViewById(com.google.android.material.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_view);
        this.f54608n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.google.android.material.R.id.navigation_bar_item_labels_group);
        this.f54609o = viewGroup;
        TextView textView = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_small_label_view);
        this.f54610p = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_large_label_view);
        this.f54611q = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f54599e = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f54600f = viewGroup.getPaddingBottom();
        j1.R1(textView, 2);
        j1.R1(textView2, 2);
        setFocusable(true);
        h(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    private static void A(@n0 View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f54606l;
        return frameLayout != null ? frameLayout : this.f54608n;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        com.google.android.material.badge.a aVar = this.E;
        int minimumHeight = aVar != null ? aVar.getMinimumHeight() / 2 : 0;
        return Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.f54608n.getMeasuredWidth() + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        com.google.android.material.badge.a aVar = this.E;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.E.q();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f54608n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private void h(float f10, float f11) {
        this.f54601g = f10 - f11;
        this.f54602h = (f11 * 1.0f) / f10;
        this.f54603i = (f10 * 1.0f) / f11;
    }

    private static Drawable j(@n0 ColorStateList colorStateList) {
        return new RippleDrawable(com.google.android.material.ripple.b.a(colorStateList), null, null);
    }

    @p0
    private FrameLayout k(View view) {
        ImageView imageView = this.f54608n;
        if (view == imageView && com.google.android.material.badge.b.f53129a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private boolean l() {
        return this.E != null;
    }

    private boolean m() {
        return this.C && this.f54604j == 2;
    }

    private void n(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        if (!this.f54620z || !this.f54596b || !j1.O0(this)) {
            r(f10, f10);
            return;
        }
        ValueAnimator valueAnimator = this.f54617w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f54617w = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f54619y, f10);
        this.f54617w = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new c(f10));
        this.f54617w.setInterpolator(i9.a.g(getContext(), com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.f52897b));
        this.f54617w.setDuration(i9.a.f(getContext(), com.google.android.material.R.attr.motionDurationLong2, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
        this.f54617w.start();
    }

    private void o() {
        j jVar = this.f54613s;
        if (jVar != null) {
            setChecked(jVar.isChecked());
        }
    }

    private void p() {
        Drawable drawableJ = this.f54598d;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (this.f54597c != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f54620z && getActiveIndicatorDrawable() != null && this.f54606l != null && activeIndicatorDrawable != null) {
                z10 = false;
                rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.e(this.f54597c), null, activeIndicatorDrawable);
            } else if (drawableJ == null) {
                drawableJ = j(this.f54597c);
            }
        }
        FrameLayout frameLayout = this.f54606l;
        if (frameLayout != null) {
            j1.I1(frameLayout, rippleDrawable);
        }
        j1.I1(this, drawableJ);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, float f11) {
        View view = this.f54607m;
        if (view != null) {
            this.f54618x.d(f10, f11, view);
        }
        this.f54619y = f10;
    }

    private static void s(TextView textView, @e1 int i10) {
        q.E(textView, i10);
        int iH = com.google.android.material.resources.c.h(textView.getContext(), i10, 0);
        if (iH != 0) {
            textView.setTextSize(0, iH);
        }
    }

    private static void t(@n0 View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    private static void u(@n0 View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private void v(@p0 View view) {
        if (l() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.b.d(this.E, view, k(view));
        }
    }

    private void w(@p0 View view) {
        if (l()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.b.j(this.E, view);
            }
            this.E = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(View view) {
        if (l()) {
            com.google.android.material.badge.b.m(this.E, view, k(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(int i10) {
        if (this.f54607m == null) {
            return;
        }
        int iMin = Math.min(this.A, i10 - (this.D * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f54607m.getLayoutParams();
        layoutParams.height = m() ? iMin : this.B;
        layoutParams.width = iMin;
        this.f54607m.setLayoutParams(layoutParams);
    }

    private void z() {
        if (m()) {
            this.f54618x = I;
        } else {
            this.f54618x = H;
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void d(@n0 j jVar, int i10) {
        this.f54613s = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitle());
        setId(jVar.getItemId());
        if (!TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(jVar.getContentDescription());
        }
        CharSequence tooltipText = !TextUtils.isEmpty(jVar.getTooltipText()) ? jVar.getTooltipText() : jVar.getTitle();
        if (Build.VERSION.SDK_INT > 23) {
            b1.a(this, tooltipText);
        }
        setVisibility(jVar.isVisible() ? 0 : 8);
        this.f54596b = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f54606l;
        if (frameLayout != null && this.f54620z) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean e() {
        return true;
    }

    @p0
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f54607m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @p0
    public com.google.android.material.badge.a getBadge() {
        return this.E;
    }

    @v
    protected int getItemBackgroundResId() {
        return com.google.android.material.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.n.a
    @p0
    public j getItemData() {
        return this.f54613s;
    }

    @androidx.annotation.q
    protected int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @i0
    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f54612r;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f54609o.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f54609o.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f54609o.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f54609o.getMeasuredWidth() + layoutParams.rightMargin);
    }

    void i() {
        q();
        this.f54613s = null;
        this.f54619y = 0.0f;
        this.f54596b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @n0
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        j jVar = this.f54613s;
        if (jVar != null && jVar.isCheckable() && this.f54613s.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.E;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.f54613s.getTitle();
            if (!TextUtils.isEmpty(this.f54613s.getContentDescription())) {
                title = this.f54613s.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.E.o()));
        }
        a0 a0VarG2 = a0.g2(accessibilityNodeInfo);
        a0VarG2.e1(a0.e.h(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            a0VarG2.c1(false);
            a0VarG2.P0(a0.a.f21380j);
        }
        a0VarG2.K1(getResources().getString(com.google.android.material.R.string.item_view_role_description));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new b(i10));
    }

    void q() {
        w(this.f54608n);
    }

    public void setActiveIndicatorDrawable(@p0 Drawable drawable) {
        View view = this.f54607m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        p();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.f54620z = z10;
        p();
        View view = this.f54607m;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.B = i10;
        y(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@t0 int i10) {
        this.D = i10;
        y(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.C = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.A = i10;
        y(getWidth());
    }

    void setBadge(@n0 com.google.android.material.badge.a aVar) {
        if (this.E == aVar) {
            return;
        }
        if (l() && this.f54608n != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            w(this.f54608n);
        }
        this.E = aVar;
        ImageView imageView = this.f54608n;
        if (imageView != null) {
            v(imageView);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setChecked(boolean z10) {
        TextView textView = this.f54611q;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.f54611q;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.f54610p;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.f54610p;
        textView4.setPivotY(textView4.getBaseline());
        n(z10 ? 1.0f : 0.0f);
        int i10 = this.f54604j;
        if (i10 != -1) {
            if (i10 == 0) {
                if (z10) {
                    u(getIconOrContainer(), this.f54599e, 49);
                    A(this.f54609o, this.f54600f);
                    this.f54611q.setVisibility(0);
                } else {
                    u(getIconOrContainer(), this.f54599e, 17);
                    A(this.f54609o, 0);
                    this.f54611q.setVisibility(4);
                }
                this.f54610p.setVisibility(4);
            } else if (i10 == 1) {
                A(this.f54609o, this.f54600f);
                if (z10) {
                    u(getIconOrContainer(), (int) (this.f54599e + this.f54601g), 49);
                    t(this.f54611q, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f54610p;
                    float f10 = this.f54602h;
                    t(textView5, f10, f10, 4);
                } else {
                    u(getIconOrContainer(), this.f54599e, 49);
                    TextView textView6 = this.f54611q;
                    float f11 = this.f54603i;
                    t(textView6, f11, f11, 4);
                    t(this.f54610p, 1.0f, 1.0f, 0);
                }
            } else if (i10 == 2) {
                u(getIconOrContainer(), this.f54599e, 17);
                this.f54611q.setVisibility(8);
                this.f54610p.setVisibility(8);
            }
        } else if (this.f54605k) {
            if (z10) {
                u(getIconOrContainer(), this.f54599e, 49);
                A(this.f54609o, this.f54600f);
                this.f54611q.setVisibility(0);
            } else {
                u(getIconOrContainer(), this.f54599e, 17);
                A(this.f54609o, 0);
                this.f54611q.setVisibility(4);
            }
            this.f54610p.setVisibility(4);
        } else {
            A(this.f54609o, this.f54600f);
            if (z10) {
                u(getIconOrContainer(), (int) (this.f54599e + this.f54601g), 49);
                t(this.f54611q, 1.0f, 1.0f, 0);
                TextView textView7 = this.f54610p;
                float f12 = this.f54602h;
                t(textView7, f12, f12, 4);
            } else {
                u(getIconOrContainer(), this.f54599e, 49);
                TextView textView8 = this.f54611q;
                float f13 = this.f54603i;
                t(textView8, f13, f13, 4);
                t(this.f54610p, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.n.a
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f54610p.setEnabled(z10);
        this.f54611q.setEnabled(z10);
        this.f54608n.setEnabled(z10);
        if (z10) {
            j1.g2(this, d1.c(getContext(), 1002));
        } else {
            j1.g2(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setIcon(@p0 Drawable drawable) {
        if (drawable == this.f54615u) {
            return;
        }
        this.f54615u = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = androidx.core.graphics.drawable.d.r(drawable).mutate();
            this.f54616v = drawable;
            ColorStateList colorStateList = this.f54614t;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.d.o(drawable, colorStateList);
            }
        }
        this.f54608n.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f54608n.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f54608n.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@p0 ColorStateList colorStateList) {
        Drawable drawable;
        this.f54614t = colorStateList;
        if (this.f54613s == null || (drawable = this.f54616v) == null) {
            return;
        }
        androidx.core.graphics.drawable.d.o(drawable, colorStateList);
        this.f54616v.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : androidx.core.content.d.i(getContext(), i10));
    }

    public void setItemBackground(@p0 Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f54598d = drawable;
        p();
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f54600f != i10) {
            this.f54600f = i10;
            o();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f54599e != i10) {
            this.f54599e = i10;
            o();
        }
    }

    public void setItemPosition(int i10) {
        this.f54612r = i10;
    }

    public void setItemRippleColor(@p0 ColorStateList colorStateList) {
        this.f54597c = colorStateList;
        p();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f54604j != i10) {
            this.f54604j = i10;
            z();
            y(getWidth());
            o();
        }
    }

    public void setShifting(boolean z10) {
        if (this.f54605k != z10) {
            this.f54605k = z10;
            o();
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setShortcut(boolean z10, char c10) {
    }

    public void setTextAppearanceActive(@e1 int i10) {
        s(this.f54611q, i10);
        h(this.f54610p.getTextSize(), this.f54611q.getTextSize());
        TextView textView = this.f54611q;
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(@e1 int i10) {
        s(this.f54610p, i10);
        h(this.f54610p.getTextSize(), this.f54611q.getTextSize());
    }

    public void setTextColor(@p0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f54610p.setTextColor(colorStateList);
            this.f54611q.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setTitle(@p0 CharSequence charSequence) {
        this.f54610p.setText(charSequence);
        this.f54611q.setText(charSequence);
        j jVar = this.f54613s;
        if (jVar == null || TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        j jVar2 = this.f54613s;
        if (jVar2 != null && !TextUtils.isEmpty(jVar2.getTooltipText())) {
            charSequence = this.f54613s.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            b1.a(this, charSequence);
        }
    }
}
