package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.appcompat.widget.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.o;
import androidx.core.view.g1;
import androidx.core.view.j1;
import androidx.core.widget.d0;
import com.google.android.material.R;
import com.google.android.material.animation.i;
import com.google.android.material.animation.l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import com.google.android.material.stateful.ExtendableSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements g1, d0, g9.a, t, CoordinatorLayout.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f54230s = "FloatingActionButton";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f54231t = "expandableWidgetHelper";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f54232u = R.style.Widget_Design_FloatingActionButton;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f54233v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f54234w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f54235x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f54236y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f54237z = 470;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private ColorStateList f54238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private PorterDuff.Mode f54239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private ColorStateList f54240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private PorterDuff.Mode f54241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private ColorStateList f54242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f54244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f54246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f54247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f54248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Rect f54249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f54250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @n0
    private final j f54251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @n0
    private final g9.c f54252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.d f54253r;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final boolean f54254i = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Rect f54255f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b f54256g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f54257h;

        public BaseBehavior() {
            this.f54257h = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.X);
            this.f54257h = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean L(@n0 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void M(@n0 CoordinatorLayout coordinatorLayout, @n0 FloatingActionButton floatingActionButton) {
            int i10;
            Rect rect = floatingActionButton.f54249n;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i11 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                i10 = rect.right;
            } else {
                i10 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i11 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i11 = -rect.top;
            }
            if (i11 != 0) {
                j1.f1(floatingActionButton, i11);
            }
            if (i10 != 0) {
                j1.e1(floatingActionButton, i10);
            }
        }

        private boolean R(@n0 View view, @n0 FloatingActionButton floatingActionButton) {
            return this.f54257h && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean S(CoordinatorLayout coordinatorLayout, @n0 AppBarLayout appBarLayout, @n0 FloatingActionButton floatingActionButton) {
            if (!R(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f54255f == null) {
                this.f54255f = new Rect();
            }
            Rect rect = this.f54255f;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.p(this.f54256g, false);
                return true;
            }
            floatingActionButton.A(this.f54256g, false);
            return true;
        }

        private boolean T(@n0 View view, @n0 FloatingActionButton floatingActionButton) {
            if (!R(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.p(this.f54256g, false);
                return true;
            }
            floatingActionButton.A(this.f54256g, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean e(@n0 CoordinatorLayout coordinatorLayout, @n0 FloatingActionButton floatingActionButton, @n0 Rect rect) {
            Rect rect2 = floatingActionButton.f54249n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public boolean K() {
            return this.f54257h;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, @n0 FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                S(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!L(view)) {
                return false;
            }
            T(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 FloatingActionButton floatingActionButton, int i10) {
            List<View> listS = coordinatorLayout.s(floatingActionButton);
            int size = listS.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = listS.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (L(view) && T(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (S(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.K(floatingActionButton, i10);
            M(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void P(boolean z10) {
            this.f54257h = z10;
        }

        @androidx.annotation.j1
        public void Q(b bVar) {
            this.f54256g = bVar;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void k(@n0 CoordinatorLayout.f fVar) {
            if (fVar.f19808h == 0) {
                fVar.f19808h = 80;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: J */
        public /* bridge */ /* synthetic */ boolean e(@n0 CoordinatorLayout coordinatorLayout, @n0 FloatingActionButton floatingActionButton, @n0 Rect rect) {
            return super.e(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean K() {
            return super.K();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: N */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, @n0 FloatingActionButton floatingActionButton, View view) {
            return super.l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: O */
        public /* bridge */ /* synthetic */ boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 FloatingActionButton floatingActionButton, int i10) {
            return super.p(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void P(boolean z10) {
            super.P(z10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @androidx.annotation.j1
        public /* bridge */ /* synthetic */ void Q(b bVar) {
            super.Q(bVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void k(@n0 CoordinatorLayout.f fVar) {
            super.k(fVar);
        }
    }

    public class a implements com.google.android.material.floatingactionbutton.d.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f54258a;

        a(b bVar) {
            this.f54258a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.k
        public void a() {
            this.f54258a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.k
        public void b() {
            this.f54258a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    public class c implements com.google.android.material.shadow.c {
        c() {
        }

        @Override // com.google.android.material.shadow.c
        public void a(@p0 Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.google.android.material.shadow.c
        public void b(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f54249n.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f54246k, i11 + FloatingActionButton.this.f54246k, i12 + FloatingActionButton.this.f54246k, i13 + FloatingActionButton.this.f54246k);
        }

        @Override // com.google.android.material.shadow.c
        public boolean c() {
            return FloatingActionButton.this.f54248m;
        }

        @Override // com.google.android.material.shadow.c
        public float d() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface d {
    }

    public class e<T extends FloatingActionButton> implements com.google.android.material.floatingactionbutton.d.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final l<T> f54261a;

        e(l<T> lVar) {
            this.f54261a = lVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void a() {
            this.f54261a.a(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void b() {
            this.f54261a.b(FloatingActionButton.this);
        }

        public boolean equals(@p0 Object obj) {
            return (obj instanceof e) && ((e) obj).f54261a.equals(this.f54261a);
        }

        public int hashCode() {
            return this.f54261a.hashCode();
        }
    }

    public FloatingActionButton(@n0 Context context) {
        this(context, null);
    }

    public FloatingActionButton(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f54232u;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f54249n = new Rect();
        this.f54250o = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.W, i10, i11, new int[0]);
        this.f54238c = com.google.android.material.resources.c.a(context2, typedArrayK, R.styleable.FloatingActionButton_backgroundTint);
        this.f54239d = j0.r(typedArrayK.getInt(R.styleable.FloatingActionButton_backgroundTintMode, -1), null);
        this.f54242g = com.google.android.material.resources.c.a(context2, typedArrayK, R.styleable.FloatingActionButton_rippleColor);
        this.f54244i = typedArrayK.getInt(R.styleable.FloatingActionButton_fabSize, -1);
        this.f54245j = typedArrayK.getDimensionPixelSize(R.styleable.FloatingActionButton_fabCustomSize, 0);
        this.f54243h = typedArrayK.getDimensionPixelSize(R.styleable.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayK.getDimension(R.styleable.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayK.getDimension(R.styleable.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayK.getDimension(R.styleable.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f54248m = typedArrayK.getBoolean(R.styleable.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayK.getDimensionPixelSize(R.styleable.FloatingActionButton_maxImageSize, 0));
        i iVarC = i.c(context2, typedArrayK, R.styleable.FloatingActionButton_showMotionSpec);
        i iVarC2 = i.c(context2, typedArrayK, R.styleable.FloatingActionButton_hideMotionSpec);
        p pVarM = p.g(context2, attributeSet, i10, i11, p.f55125m).m();
        boolean z10 = typedArrayK.getBoolean(R.styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayK.getBoolean(R.styleable.FloatingActionButton_android_enabled, true));
        typedArrayK.recycle();
        j jVar = new j(this);
        this.f54251p = jVar;
        jVar.g(attributeSet, i10);
        this.f54252q = new g9.c(this);
        getImpl().a0(pVarM);
        getImpl().x(this.f54238c, this.f54239d, this.f54242g, this.f54243h);
        getImpl().W(dimensionPixelSize);
        getImpl().Q(dimension);
        getImpl().T(dimension2);
        getImpl().X(dimension3);
        getImpl().b0(iVarC);
        getImpl().S(iVarC2);
        getImpl().R(z10);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @p0
    private com.google.android.material.floatingactionbutton.d.k B(@p0 b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    private com.google.android.material.floatingactionbutton.d getImpl() {
        if (this.f54253r == null) {
            this.f54253r = j();
        }
        return this.f54253r;
    }

    @n0
    private com.google.android.material.floatingactionbutton.d j() {
        return new com.google.android.material.floatingactionbutton.e(this, new c());
    }

    private int m(int i10) {
        int i11 = this.f54245j;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return i10 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m(1) : m(0);
    }

    private void s(@n0 Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f54249n;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void t() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f54240e;
        if (colorStateList == null) {
            androidx.core.graphics.drawable.d.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f54241f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.f.e(colorForState, mode));
    }

    void A(@p0 b bVar, boolean z10) {
        getImpl().f0(B(bVar), z10);
    }

    @Override // g9.b
    public boolean a(boolean z10) {
        return this.f54252q.f(z10);
    }

    @Override // g9.b
    public boolean b() {
        return this.f54252q.c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void f(@n0 Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void g(@n0 Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    @Override // android.view.View
    @p0
    public ColorStateList getBackgroundTintList() {
        return this.f54238c;
    }

    @Override // android.view.View
    @p0
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f54239d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @n0
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().t();
    }

    @p0
    public Drawable getContentBackground() {
        return getImpl().m();
    }

    @t0
    public int getCustomSize() {
        return this.f54245j;
    }

    @Override // g9.a
    public int getExpandedComponentIdHint() {
        return this.f54252q.b();
    }

    @p0
    public i getHideMotionSpec() {
        return getImpl().p();
    }

    @androidx.annotation.l
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f54242g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @p0
    public ColorStateList getRippleColorStateList() {
        return this.f54242g;
    }

    @Override // com.google.android.material.shape.t
    @n0
    public p getShapeAppearanceModel() {
        return (p) o.l(getImpl().u());
    }

    @p0
    public i getShowMotionSpec() {
        return getImpl().v();
    }

    public int getSize() {
        return this.f54244i;
    }

    int getSizeDimension() {
        return m(this.f54244i);
    }

    @Override // androidx.core.view.g1
    @p0
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.g1
    @p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.d0
    @p0
    public ColorStateList getSupportImageTintList() {
        return this.f54240e;
    }

    @Override // androidx.core.widget.d0
    @p0
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f54241f;
    }

    public boolean getUseCompatPadding() {
        return this.f54248m;
    }

    public void h(@n0 l<? extends FloatingActionButton> lVar) {
        getImpl().g(new e(lVar));
    }

    public void i() {
        setCustomSize(0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    @Deprecated
    public boolean k(@n0 Rect rect) {
        if (!j1.U0(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        s(rect);
        return true;
    }

    public void l(@n0 Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        s(rect);
    }

    public void n() {
        o(null);
    }

    public void o(@p0 b bVar) {
        p(bVar, true);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f54246k = (sizeDimension - this.f54247l) / 2;
        getImpl().i0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f54249n;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        this.f54252q.d((Bundle) o.l(extendableSavedState.f55419b.get(f54231t)));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f55419b.put(f54231t, this.f54252q.e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@n0 MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && k(this.f54250o) && !this.f54250o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    void p(@p0 b bVar, boolean z10) {
        getImpl().w(B(bVar), z10);
    }

    public boolean q() {
        return getImpl().y();
    }

    public boolean r() {
        return getImpl().z();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i(f54230s, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(f54230s, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i(f54230s, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@p0 ColorStateList colorStateList) {
        if (this.f54238c != colorStateList) {
            this.f54238c = colorStateList;
            getImpl().O(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@p0 PorterDuff.Mode mode) {
        if (this.f54239d != mode) {
            this.f54239d = mode;
            getImpl().P(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().Q(f10);
    }

    public void setCompatElevationResource(@q int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().T(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(@q int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().X(f10);
    }

    public void setCompatPressedTranslationZResource(@q int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(@t0 int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f54245j) {
            this.f54245j = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().j0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().o()) {
            getImpl().R(z10);
            requestLayout();
        }
    }

    @Override // g9.a
    public void setExpandedComponentIdHint(@androidx.annotation.d0 int i10) {
        this.f54252q.g(i10);
    }

    public void setHideMotionSpec(@p0 i iVar) {
        getImpl().S(iVar);
    }

    public void setHideMotionSpecResource(@androidx.annotation.b int i10) {
        setHideMotionSpec(i.d(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@p0 Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().h0();
            if (this.f54240e != null) {
                t();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@v int i10) {
        this.f54251p.i(i10);
        t();
    }

    public void setMaxImageSize(int i10) {
        this.f54247l = i10;
        getImpl().V(i10);
    }

    public void setRippleColor(@androidx.annotation.l int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setRippleColor(@p0 ColorStateList colorStateList) {
        if (this.f54242g != colorStateList) {
            this.f54242g = colorStateList;
            getImpl().Y(this.f54242g);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().I();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().I();
    }

    @androidx.annotation.j1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().Z(z10);
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@n0 p pVar) {
        getImpl().a0(pVar);
    }

    public void setShowMotionSpec(@p0 i iVar) {
        getImpl().b0(iVar);
    }

    public void setShowMotionSpecResource(@androidx.annotation.b int i10) {
        setShowMotionSpec(i.d(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f54245j = 0;
        if (i10 != this.f54244i) {
            this.f54244i = i10;
            requestLayout();
        }
    }

    @Override // androidx.core.view.g1
    public void setSupportBackgroundTintList(@p0 ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.g1
    public void setSupportBackgroundTintMode(@p0 PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.d0
    public void setSupportImageTintList(@p0 ColorStateList colorStateList) {
        if (this.f54240e != colorStateList) {
            this.f54240e = colorStateList;
            t();
        }
    }

    @Override // androidx.core.widget.d0
    public void setSupportImageTintMode(@p0 PorterDuff.Mode mode) {
        if (this.f54241f != mode) {
            this.f54241f = mode;
            t();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f54248m != z10) {
            this.f54248m = z10;
            getImpl().C();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void u(@n0 Animator.AnimatorListener animatorListener) {
        getImpl().K(animatorListener);
    }

    public void v(@n0 Animator.AnimatorListener animatorListener) {
        getImpl().L(animatorListener);
    }

    public void w(@n0 l<? extends FloatingActionButton> lVar) {
        getImpl().M(new e(lVar));
    }

    public boolean x() {
        return getImpl().o();
    }

    public void y() {
        z(null);
    }

    public void z(@p0 b bVar) {
        A(bVar, true);
    }
}
