package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.f0;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.annotation.x;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int G = R.style.Widget_Design_CollapsingToolbar;
    private static final int H = 600;
    public static final int I = 0;
    public static final int J = 1;
    private int A;

    @p0
    n3 B;
    private int C;
    private boolean D;
    private int E;
    private boolean F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private ViewGroup f52992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private View f52993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f52994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f52996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f52997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f52998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f52999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    final com.google.android.material.internal.b f53000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    final f9.a f53001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f53002n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f53003o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private Drawable f53004p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    Drawable f53005q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f53006r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f53007s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ValueAnimator f53008t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f53009u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TimeInterpolator f53010v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final TimeInterpolator f53011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f53012x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private AppBarLayout.f f53013y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f53014z;

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f53015c = 0.5f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f53016d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f53017e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f53018f = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f53019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f53020b;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f53019a = 0;
            this.f53020b = 0.5f;
        }

        public LayoutParams(int i10, int i11, int i12) {
            super(i10, i11, i12);
            this.f53019a = 0;
            this.f53020b = 0.5f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f53019a = 0;
            this.f53020b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.I);
            this.f53019a = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            d(typedArrayObtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(@n0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f53019a = 0;
            this.f53020b = 0.5f;
        }

        public LayoutParams(@n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f53019a = 0;
            this.f53020b = 0.5f;
        }

        @w0(19)
        public LayoutParams(@n0 FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f53019a = 0;
            this.f53020b = 0.5f;
        }

        @w0(19)
        public LayoutParams(@n0 LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.f53019a = 0;
            this.f53020b = 0.5f;
            this.f53019a = layoutParams.f53019a;
            this.f53020b = layoutParams.f53020b;
        }

        public int a() {
            return this.f53019a;
        }

        public float b() {
            return this.f53020b;
        }

        public void c(int i10) {
            this.f53019a = i10;
        }

        public void d(float f10) {
            this.f53020b = f10;
        }
    }

    public class a implements z0 {
        a() {
        }

        @Override // androidx.core.view.z0
        public n3 a(View view, @n0 n3 n3Var) {
            return CollapsingToolbarLayout.this.s(n3Var);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class c implements AppBarLayout.f {
        c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f53014z = i10;
            n3 n3Var = collapsingToolbarLayout.B;
            int iR = n3Var != null ? n3Var.r() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i iVarK = CollapsingToolbarLayout.k(childAt);
                int i12 = layoutParams.f53019a;
                if (i12 == 1) {
                    iVarK.k(a2.a.e(-i10, 0, CollapsingToolbarLayout.this.i(childAt)));
                } else if (i12 == 2) {
                    iVarK.k(Math.round((-i10) * layoutParams.f53020b));
                }
            }
            CollapsingToolbarLayout.this.y();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f53005q != null && iR > 0) {
                j1.n1(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int iE0 = (height - j1.e0(CollapsingToolbarLayout.this)) - iR;
            float f10 = iE0;
            CollapsingToolbarLayout.this.f53000l.C0(Math.min(1.0f, (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f10));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f53000l.p0(collapsingToolbarLayout3.f53014z + iE0);
            CollapsingToolbarLayout.this.f53000l.A0(Math.abs(i10) / f10);
        }
    }

    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface d extends y {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface e {
    }

    public CollapsingToolbarLayout(@n0 Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = G;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f52990b = true;
        this.f52999k = new Rect();
        this.f53012x = -1;
        this.C = 0;
        this.E = 0;
        Context context2 = getContext();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f53000l = bVar;
        bVar.N0(com.google.android.material.animation.b.f52900e);
        bVar.J0(false);
        this.f53001m = new f9.a(context2);
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.H, i10, i11, new int[0]);
        bVar.w0(typedArrayK.getInt(R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        bVar.l0(typedArrayK.getInt(R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayK.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f52998j = dimensionPixelSize;
        this.f52997i = dimensionPixelSize;
        this.f52996h = dimensionPixelSize;
        this.f52995g = dimensionPixelSize;
        int i12 = R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart;
        if (typedArrayK.hasValue(i12)) {
            this.f52995g = typedArrayK.getDimensionPixelSize(i12, 0);
        }
        int i13 = R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd;
        if (typedArrayK.hasValue(i13)) {
            this.f52997i = typedArrayK.getDimensionPixelSize(i13, 0);
        }
        int i14 = R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop;
        if (typedArrayK.hasValue(i14)) {
            this.f52996h = typedArrayK.getDimensionPixelSize(i14, 0);
        }
        int i15 = R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom;
        if (typedArrayK.hasValue(i15)) {
            this.f52998j = typedArrayK.getDimensionPixelSize(i15, 0);
        }
        this.f53002n = typedArrayK.getBoolean(R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayK.getText(R.styleable.CollapsingToolbarLayout_title));
        bVar.t0(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        bVar.i0(androidx.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        int i16 = R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance;
        if (typedArrayK.hasValue(i16)) {
            bVar.t0(typedArrayK.getResourceId(i16, 0));
        }
        int i17 = R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance;
        if (typedArrayK.hasValue(i17)) {
            bVar.i0(typedArrayK.getResourceId(i17, 0));
        }
        int i18 = R.styleable.CollapsingToolbarLayout_titleTextEllipsize;
        if (typedArrayK.hasValue(i18)) {
            setTitleEllipsize(b(typedArrayK.getInt(i18, -1)));
        }
        int i19 = R.styleable.CollapsingToolbarLayout_expandedTitleTextColor;
        if (typedArrayK.hasValue(i19)) {
            bVar.v0(com.google.android.material.resources.c.a(context2, typedArrayK, i19));
        }
        int i20 = R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor;
        if (typedArrayK.hasValue(i20)) {
            bVar.k0(com.google.android.material.resources.c.a(context2, typedArrayK, i20));
        }
        this.f53012x = typedArrayK.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        int i21 = R.styleable.CollapsingToolbarLayout_maxLines;
        if (typedArrayK.hasValue(i21)) {
            bVar.H0(typedArrayK.getInt(i21, 1));
        }
        int i22 = R.styleable.CollapsingToolbarLayout_titlePositionInterpolator;
        if (typedArrayK.hasValue(i22)) {
            bVar.I0(AnimationUtils.loadInterpolator(context2, typedArrayK.getResourceId(i22, 0)));
        }
        this.f53009u = typedArrayK.getInt(R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        int i23 = R.attr.motionEasingStandardInterpolator;
        this.f53010v = i9.a.g(context2, i23, com.google.android.material.animation.b.f52898c);
        this.f53011w = i9.a.g(context2, i23, com.google.android.material.animation.b.f52899d);
        setContentScrim(typedArrayK.getDrawable(R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayK.getDrawable(R.styleable.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayK.getInt(R.styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.f52991c = typedArrayK.getResourceId(R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        this.D = typedArrayK.getBoolean(R.styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.F = typedArrayK.getBoolean(R.styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayK.recycle();
        setWillNotDraw(false);
        j1.a2(this, new a());
    }

    private void A() {
        if (this.f52992d != null && this.f53002n && TextUtils.isEmpty(this.f53000l.P())) {
            setTitle(j(this.f52992d));
        }
    }

    private void a(int i10) {
        d();
        ValueAnimator valueAnimator = this.f53008t;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f53008t = valueAnimator2;
            valueAnimator2.setInterpolator(i10 > this.f53006r ? this.f53010v : this.f53011w);
            this.f53008t.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.f53008t.cancel();
        }
        this.f53008t.setDuration(this.f53009u);
        this.f53008t.setIntValues(this.f53006r, i10);
        this.f53008t.start();
    }

    private TextUtils.TruncateAt b(int i10) {
        if (i10 == 0) {
            return TextUtils.TruncateAt.START;
        }
        if (i10 != 1) {
            return i10 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
        }
        return TextUtils.TruncateAt.MIDDLE;
    }

    private void c(AppBarLayout appBarLayout) {
        if (o()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void d() {
        if (this.f52990b) {
            ViewGroup viewGroup = null;
            this.f52992d = null;
            this.f52993e = null;
            int i10 = this.f52991c;
            if (i10 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
                this.f52992d = viewGroup2;
                if (viewGroup2 != null) {
                    this.f52993e = e(viewGroup2);
                }
            }
            if (this.f52992d == null) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (q(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f52992d = viewGroup;
            }
            x();
            this.f52990b = false;
        }
    }

    @n0
    private View e(@n0 View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private static int h(@n0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static CharSequence j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @n0
    static i k(@n0 View view) {
        int i10 = R.id.view_offset_helper;
        i iVar = (i) view.getTag(i10);
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(view);
        view.setTag(i10, iVar2);
        return iVar2;
    }

    private boolean o() {
        return this.A == 1;
    }

    private static boolean q(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean r(View view) {
        View view2 = this.f52993e;
        if (view2 == null || view2 == this) {
            if (view == this.f52992d) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private void t(boolean z10) {
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.f52993e;
        if (view == null) {
            view = this.f52992d;
        }
        int i10 = i(view);
        com.google.android.material.internal.d.a(this, this.f52994f, this.f52999k);
        ViewGroup viewGroup = this.f52992d;
        int titleMarginStart = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        }
        com.google.android.material.internal.b bVar = this.f53000l;
        Rect rect = this.f52999k;
        int i11 = rect.left + (z10 ? titleMarginEnd : titleMarginStart);
        int i12 = rect.top + i10 + titleMarginTop;
        int i13 = rect.right;
        if (!z10) {
            titleMarginStart = titleMarginEnd;
        }
        bVar.g0(i11, i12, i13 - titleMarginStart, (rect.bottom + i10) - titleMarginBottom);
    }

    private void u() {
        setContentDescription(getTitle());
    }

    private void v(@n0 Drawable drawable, int i10, int i11) {
        w(drawable, this.f52992d, i10, i11);
    }

    private void w(@n0 Drawable drawable, @p0 View view, int i10, int i11) {
        if (o() && view != null && this.f53002n) {
            i11 = view.getBottom();
        }
        drawable.setBounds(0, 0, i10, i11);
    }

    private void x() {
        View view;
        if (!this.f53002n && (view = this.f52994f) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f52994f);
            }
        }
        if (!this.f53002n || this.f52992d == null) {
            return;
        }
        if (this.f52994f == null) {
            this.f52994f = new View(getContext());
        }
        if (this.f52994f.getParent() == null) {
            this.f52992d.addView(this.f52994f, -1, -1);
        }
    }

    private void z(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        if (!this.f53002n || (view = this.f52994f) == null) {
            return;
        }
        boolean z11 = j1.O0(view) && this.f52994f.getVisibility() == 0;
        this.f53003o = z11;
        if (z11 || z10) {
            boolean z12 = j1.Z(this) == 1;
            t(z12);
            this.f53000l.q0(z12 ? this.f52997i : this.f52995g, this.f52999k.top + this.f52996h, (i12 - i10) - (z12 ? this.f52995g : this.f52997i), (i13 - i11) - this.f52998j);
            this.f53000l.d0(z10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(@n0 Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        d();
        if (this.f52992d == null && (drawable = this.f53004p) != null && this.f53006r > 0) {
            drawable.mutate().setAlpha(this.f53006r);
            this.f53004p.draw(canvas);
        }
        if (this.f53002n && this.f53003o) {
            if (this.f52992d == null || this.f53004p == null || this.f53006r <= 0 || !o() || this.f53000l.G() >= this.f53000l.H()) {
                this.f53000l.l(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.f53004p.getBounds(), Region.Op.DIFFERENCE);
                this.f53000l.l(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f53005q == null || this.f53006r <= 0) {
            return;
        }
        n3 n3Var = this.B;
        int iR = n3Var != null ? n3Var.r() : 0;
        if (iR > 0) {
            this.f53005q.setBounds(0, -this.f53014z, getWidth(), iR - this.f53014z);
            this.f53005q.mutate().setAlpha(this.f53006r);
            this.f53005q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (this.f53004p == null || this.f53006r <= 0 || !r(view)) {
            z10 = false;
        } else {
            w(this.f53004p, view, getWidth(), getHeight());
            this.f53004p.mutate().setAlpha(this.f53006r);
            this.f53004p.draw(canvas);
            z10 = true;
        }
        return super.drawChild(canvas, view, j10) || z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f53005q;
        boolean zK0 = false;
        if (drawable != null && drawable.isStateful()) {
            zK0 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f53004p;
        if (drawable2 != null && drawable2.isStateful()) {
            zK0 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.b bVar = this.f53000l;
        if (bVar != null) {
            zK0 |= bVar.K0(drawableState);
        }
        if (zK0) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.f53000l.q();
    }

    public float getCollapsedTitleTextSize() {
        return this.f53000l.u();
    }

    @n0
    public Typeface getCollapsedTitleTypeface() {
        return this.f53000l.v();
    }

    @p0
    public Drawable getContentScrim() {
        return this.f53004p;
    }

    public int getExpandedTitleGravity() {
        return this.f53000l.C();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f52998j;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f52997i;
    }

    public int getExpandedTitleMarginStart() {
        return this.f52995g;
    }

    public int getExpandedTitleMarginTop() {
        return this.f52996h;
    }

    public float getExpandedTitleTextSize() {
        return this.f53000l.E();
    }

    @n0
    public Typeface getExpandedTitleTypeface() {
        return this.f53000l.F();
    }

    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f53000l.I();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.f53000l.J();
    }

    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f53000l.K();
    }

    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f53000l.L();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f53000l.M();
    }

    int getScrimAlpha() {
        return this.f53006r;
    }

    public long getScrimAnimationDuration() {
        return this.f53009u;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.f53012x;
        if (i10 >= 0) {
            return i10 + this.C + this.E;
        }
        n3 n3Var = this.B;
        int iR = n3Var != null ? n3Var.r() : 0;
        int iE0 = j1.e0(this);
        return iE0 > 0 ? Math.min((iE0 * 2) + iR, getHeight()) : getHeight() / 3;
    }

    @p0
    public Drawable getStatusBarScrim() {
        return this.f53005q;
    }

    @p0
    public CharSequence getTitle() {
        if (this.f53002n) {
            return this.f53000l.P();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.A;
    }

    @p0
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f53000l.O();
    }

    @n0
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f53000l.S();
    }

    final int i(@n0 View view) {
        return ((getHeight() - k(view).c()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean l() {
        return this.F;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean m() {
        return this.D;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean n() {
        return this.f53000l.W();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            c(appBarLayout);
            j1.O1(this, j1.U(appBarLayout));
            if (this.f53013y == null) {
                this.f53013y = new c();
            }
            appBarLayout.e(this.f53013y);
            j1.v1(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f53000l.a0(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.f fVar = this.f53013y;
        if (fVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).z(fVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        n3 n3Var = this.B;
        if (n3Var != null) {
            int iR = n3Var.r();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!j1.U(childAt) && childAt.getTop() < iR) {
                    j1.f1(childAt, iR);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            k(getChildAt(i15)).h();
        }
        z(i10, i11, i12, i13, false);
        A();
        y();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            k(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        d();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        n3 n3Var = this.B;
        int iR = n3Var != null ? n3Var.r() : 0;
        if ((mode == 0 || this.D) && iR > 0) {
            this.C = iR;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iR, 1073741824));
        }
        if (this.F && this.f53000l.M() > 1) {
            A();
            z(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int iZ = this.f53000l.z();
            if (iZ > 1) {
                this.E = Math.round(this.f53000l.B()) * (iZ - 1);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.E, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f52992d;
        if (viewGroup != null) {
            View view = this.f52993e;
            if (view == null || view == this) {
                setMinimumHeight(h(viewGroup));
            } else {
                setMinimumHeight(h(view));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f53004p;
        if (drawable != null) {
            v(drawable, i10, i11);
        }
    }

    public boolean p() {
        return this.f53002n;
    }

    n3 s(@n0 n3 n3Var) {
        n3 n3Var2 = j1.U(this) ? n3Var : null;
        if (!androidx.core.util.j.a(this.B, n3Var2)) {
            this.B = n3Var2;
            requestLayout();
        }
        return n3Var.c();
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f53000l.l0(i10);
    }

    public void setCollapsedTitleTextAppearance(@e1 int i10) {
        this.f53000l.i0(i10);
    }

    public void setCollapsedTitleTextColor(@l int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextColor(@n0 ColorStateList colorStateList) {
        this.f53000l.k0(colorStateList);
    }

    public void setCollapsedTitleTextSize(float f10) {
        this.f53000l.m0(f10);
    }

    public void setCollapsedTitleTypeface(@p0 Typeface typeface) {
        this.f53000l.n0(typeface);
    }

    public void setContentScrim(@p0 Drawable drawable) {
        Drawable drawable2 = this.f53004p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f53004p = drawableMutate;
            if (drawableMutate != null) {
                v(drawableMutate, getWidth(), getHeight());
                this.f53004p.setCallback(this);
                this.f53004p.setAlpha(this.f53006r);
            }
            j1.n1(this);
        }
    }

    public void setContentScrimColor(@l int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(@v int i10) {
        setContentScrim(androidx.core.content.d.i(getContext(), i10));
    }

    public void setExpandedTitleColor(@l int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.f53000l.w0(i10);
    }

    public void setExpandedTitleMargin(int i10, int i11, int i12, int i13) {
        this.f52995g = i10;
        this.f52996h = i11;
        this.f52997i = i12;
        this.f52998j = i13;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f52998j = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f52997i = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f52995g = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f52996h = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@e1 int i10) {
        this.f53000l.t0(i10);
    }

    public void setExpandedTitleTextColor(@n0 ColorStateList colorStateList) {
        this.f53000l.v0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f10) {
        this.f53000l.x0(f10);
    }

    public void setExpandedTitleTypeface(@p0 Typeface typeface) {
        this.f53000l.y0(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.F = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.D = z10;
    }

    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i10) {
        this.f53000l.D0(i10);
    }

    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f10) {
        this.f53000l.F0(f10);
    }

    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@x(from = 0.0d) float f10) {
        this.f53000l.G0(f10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i10) {
        this.f53000l.H0(i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f53000l.J0(z10);
    }

    void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f53006r) {
            if (this.f53004p != null && (viewGroup = this.f52992d) != null) {
                j1.n1(viewGroup);
            }
            this.f53006r = i10;
            j1.n1(this);
        }
    }

    public void setScrimAnimationDuration(@f0(from = 0) long j10) {
        this.f53009u = j10;
    }

    public void setScrimVisibleHeightTrigger(@f0(from = 0) int i10) {
        if (this.f53012x != i10) {
            this.f53012x = i10;
            y();
        }
    }

    public void setScrimsShown(boolean z10) {
        setScrimsShown(z10, j1.U0(this) && !isInEditMode());
    }

    public void setScrimsShown(boolean z10, boolean z11) {
        if (this.f53007s != z10) {
            if (z11) {
                a(z10 ? 255 : 0);
            } else {
                setScrimAlpha(z10 ? 255 : 0);
            }
            this.f53007s = z10;
        }
    }

    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@p0 d dVar) {
        this.f53000l.L0(dVar);
    }

    public void setStatusBarScrim(@p0 Drawable drawable) {
        Drawable drawable2 = this.f53005q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f53005q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f53005q.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.d.m(this.f53005q, j1.Z(this));
                this.f53005q.setVisible(getVisibility() == 0, false);
                this.f53005q.setCallback(this);
                this.f53005q.setAlpha(this.f53006r);
            }
            j1.n1(this);
        }
    }

    public void setStatusBarScrimColor(@l int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(@v int i10) {
        setStatusBarScrim(androidx.core.content.d.i(getContext(), i10));
    }

    public void setTitle(@p0 CharSequence charSequence) {
        this.f53000l.M0(charSequence);
        u();
    }

    public void setTitleCollapseMode(int i10) {
        this.A = i10;
        boolean zO = o();
        this.f53000l.B0(zO);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (zO && this.f53004p == null) {
            setContentScrimColor(this.f53001m.g(getResources().getDimension(R.dimen.design_appbar_elevation)));
        }
    }

    public void setTitleEllipsize(@n0 TextUtils.TruncateAt truncateAt) {
        this.f53000l.O0(truncateAt);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f53002n) {
            this.f53002n = z10;
            u();
            x();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@p0 TimeInterpolator timeInterpolator) {
        this.f53000l.I0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f53005q;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f53005q.setVisible(z10, false);
        }
        Drawable drawable2 = this.f53004p;
        if (drawable2 == null || drawable2.isVisible() == z10) {
            return;
        }
        this.f53004p.setVisible(z10, false);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@n0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f53004p || drawable == this.f53005q;
    }

    final void y() {
        if (this.f53004p == null && this.f53005q == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f53014z < getScrimVisibleHeightTrigger());
    }
}
