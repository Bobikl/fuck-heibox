package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.e1;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.x0;
import androidx.core.content.d;
import androidx.core.view.j1;
import androidx.core.view.n;
import androidx.core.view.n3;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.k0;
import com.google.android.material.internal.s;
import com.google.android.material.internal.t;
import com.google.android.material.shape.k;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;

/* JADX INFO: loaded from: classes7.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int[] f54674v = {R.attr.state_checked};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f54675w = {-16842910};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f54676x = com.google.android.material.R.style.Widget_Design_NavigationView;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f54677y = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    private final s f54678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t f54679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    c f54680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f54681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int[] f54682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MenuInflater f54683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f54684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f54685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f54686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f54687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @t0
    private int f54688s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private Path f54689t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f54690u;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public Bundle f54691b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @p0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @n0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@n0 Parcel parcel, @p0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f54691b = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@n0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f54691b);
        }
    }

    public class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            c cVar = NavigationView.this.f54680k;
            return cVar != null && cVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f54682m);
            boolean z10 = true;
            boolean z11 = NavigationView.this.f54682m[1] == 0;
            NavigationView.this.f54679j.F(z11);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z11 && navigationView2.m());
            NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.f54682m[0] == 0 || NavigationView.this.f54682m[0] + NavigationView.this.getWidth() == 0);
            Activity activityA = com.google.android.material.internal.c.a(NavigationView.this.getContext());
            if (activityA != null) {
                Rect rectB = k0.b(activityA);
                boolean z12 = rectB.height() - NavigationView.this.getHeight() == NavigationView.this.f54682m[1];
                boolean z13 = Color.alpha(activityA.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground(z12 && z13 && navigationView3.l());
                if (rectB.width() != NavigationView.this.f54682m[0] && rectB.width() - NavigationView.this.getWidth() != NavigationView.this.f54682m[0]) {
                    z10 = false;
                }
                NavigationView.this.setDrawRightInsetForeground(z10);
            }
        }
    }

    public interface c {
        boolean a(@n0 MenuItem menuItem);
    }

    public NavigationView(@n0 Context context) {
        this(context, null);
    }

    public NavigationView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f54676x;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        t tVar = new t();
        this.f54679j = tVar;
        this.f54682m = new int[2];
        this.f54685p = true;
        this.f54686q = true;
        this.f54687r = 0;
        this.f54688s = 0;
        this.f54690u = new RectF();
        Context context2 = getContext();
        s sVar = new s(context2);
        this.f54678i = sVar;
        x0 x0VarL = c0.l(context2, attributeSet, com.google.android.material.R.styleable.W0, i10, i11, new int[0]);
        int i12 = com.google.android.material.R.styleable.NavigationView_android_background;
        if (x0VarL.C(i12)) {
            j1.I1(this, x0VarL.h(i12));
        }
        this.f54688s = x0VarL.g(com.google.android.material.R.styleable.NavigationView_drawerLayoutCornerSize, 0);
        this.f54687r = x0VarL.o(com.google.android.material.R.styleable.NavigationView_android_layout_gravity, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            p pVarM = p.e(context2, attributeSet, i10, i11).m();
            Drawable background = getBackground();
            k kVar = new k(pVarM);
            if (background instanceof ColorDrawable) {
                kVar.o0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            kVar.Z(context2);
            j1.I1(this, kVar);
        }
        int i13 = com.google.android.material.R.styleable.NavigationView_elevation;
        if (x0VarL.C(i13)) {
            setElevation(x0VarL.g(i13, 0));
        }
        setFitsSystemWindows(x0VarL.a(com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.f54681l = x0VarL.g(com.google.android.material.R.styleable.NavigationView_android_maxWidth, 0);
        int i14 = com.google.android.material.R.styleable.NavigationView_subheaderColor;
        ColorStateList colorStateListD = x0VarL.C(i14) ? x0VarL.d(i14) : null;
        int i15 = com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance;
        int iU = x0VarL.C(i15) ? x0VarL.u(i15, 0) : 0;
        if (iU == 0 && colorStateListD == null) {
            colorStateListD = e(R.attr.textColorSecondary);
        }
        int i16 = com.google.android.material.R.styleable.NavigationView_itemIconTint;
        ColorStateList colorStateListD2 = x0VarL.C(i16) ? x0VarL.d(i16) : e(R.attr.textColorSecondary);
        int i17 = com.google.android.material.R.styleable.NavigationView_itemTextAppearance;
        int iU2 = x0VarL.C(i17) ? x0VarL.u(i17, 0) : 0;
        int i18 = com.google.android.material.R.styleable.NavigationView_itemIconSize;
        if (x0VarL.C(i18)) {
            setItemIconSize(x0VarL.g(i18, 0));
        }
        int i19 = com.google.android.material.R.styleable.NavigationView_itemTextColor;
        ColorStateList colorStateListD3 = x0VarL.C(i19) ? x0VarL.d(i19) : null;
        if (iU2 == 0 && colorStateListD3 == null) {
            colorStateListD3 = e(R.attr.textColorPrimary);
        }
        Drawable drawableH = x0VarL.h(com.google.android.material.R.styleable.NavigationView_itemBackground);
        if (drawableH == null && i(x0VarL)) {
            drawableH = f(x0VarL);
            ColorStateList colorStateListB = com.google.android.material.resources.c.b(context2, x0VarL, com.google.android.material.R.styleable.NavigationView_itemRippleColor);
            if (colorStateListB != null) {
                tVar.L(new RippleDrawable(com.google.android.material.ripple.b.e(colorStateListB), null, g(x0VarL, null)));
            }
        }
        int i20 = com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding;
        if (x0VarL.C(i20)) {
            setItemHorizontalPadding(x0VarL.g(i20, 0));
        }
        int i21 = com.google.android.material.R.styleable.NavigationView_itemVerticalPadding;
        if (x0VarL.C(i21)) {
            setItemVerticalPadding(x0VarL.g(i21, 0));
        }
        setDividerInsetStart(x0VarL.g(com.google.android.material.R.styleable.NavigationView_dividerInsetStart, 0));
        setDividerInsetEnd(x0VarL.g(com.google.android.material.R.styleable.NavigationView_dividerInsetEnd, 0));
        setSubheaderInsetStart(x0VarL.g(com.google.android.material.R.styleable.NavigationView_subheaderInsetStart, 0));
        setSubheaderInsetEnd(x0VarL.g(com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd, 0));
        setTopInsetScrimEnabled(x0VarL.a(com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled, this.f54685p));
        setBottomInsetScrimEnabled(x0VarL.a(com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled, this.f54686q));
        int iG = x0VarL.g(com.google.android.material.R.styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(x0VarL.o(com.google.android.material.R.styleable.NavigationView_itemMaxLines, 1));
        sVar.X(new a());
        tVar.J(1);
        tVar.h(context2, sVar);
        if (iU != 0) {
            tVar.Y(iU);
        }
        tVar.V(colorStateListD);
        tVar.P(colorStateListD2);
        tVar.U(getOverScrollMode());
        if (iU2 != 0) {
            tVar.R(iU2);
        }
        tVar.S(colorStateListD3);
        tVar.K(drawableH);
        tVar.N(iG);
        sVar.b(tVar);
        addView((View) tVar.m(this));
        int i22 = com.google.android.material.R.styleable.NavigationView_menu;
        if (x0VarL.C(i22)) {
            k(x0VarL.u(i22, 0));
        }
        int i23 = com.google.android.material.R.styleable.NavigationView_headerLayout;
        if (x0VarL.C(i23)) {
            j(x0VarL.u(i23, 0));
        }
        x0VarL.I();
        p();
    }

    @p0
    private ColorStateList e(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = b0.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = f54675w;
        return new ColorStateList(new int[][]{iArr, f54674v, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    @n0
    private Drawable f(@n0 x0 x0Var) {
        return g(x0Var, com.google.android.material.resources.c.b(getContext(), x0Var, com.google.android.material.R.styleable.NavigationView_itemShapeFillColor));
    }

    @n0
    private Drawable g(@n0 x0 x0Var, @p0 ColorStateList colorStateList) {
        k kVar = new k(p.b(getContext(), x0Var.u(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance, 0), x0Var.u(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).m());
        kVar.o0(colorStateList);
        return new InsetDrawable((Drawable) kVar, x0Var.g(com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart, 0), x0Var.g(com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop, 0), x0Var.g(com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd, 0), x0Var.g(com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.f54683n == null) {
            this.f54683n = new androidx.appcompat.view.g(getContext());
        }
        return this.f54683n;
    }

    private boolean i(@n0 x0 x0Var) {
        return x0Var.C(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance) || x0Var.C(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    private void n(@t0 int i10, @t0 int i11) {
        if (!(getParent() instanceof DrawerLayout) || this.f54688s <= 0 || !(getBackground() instanceof k)) {
            this.f54689t = null;
            this.f54690u.setEmpty();
            return;
        }
        k kVar = (k) getBackground();
        p.b bVarV = kVar.getShapeAppearanceModel().v();
        if (n.d(this.f54687r, j1.Z(this)) == 3) {
            bVarV.P(this.f54688s);
            bVarV.C(this.f54688s);
        } else {
            bVarV.K(this.f54688s);
            bVarV.x(this.f54688s);
        }
        kVar.setShapeAppearanceModel(bVarV.m());
        if (this.f54689t == null) {
            this.f54689t = new Path();
        }
        this.f54689t.reset();
        this.f54690u.set(0.0f, 0.0f, i10, i11);
        q.k().d(kVar.getShapeAppearanceModel(), kVar.z(), this.f54690u, this.f54689t);
        invalidate();
    }

    private void p() {
        this.f54684o = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f54684o);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected void a(@n0 n3 n3Var) {
        this.f54679j.n(n3Var);
    }

    public void d(@n0 View view) {
        this.f54679j.j(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@n0 Canvas canvas) {
        if (this.f54689t == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f54689t);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @p0
    public MenuItem getCheckedItem() {
        return this.f54679j.o();
    }

    @t0
    public int getDividerInsetEnd() {
        return this.f54679j.p();
    }

    @t0
    public int getDividerInsetStart() {
        return this.f54679j.q();
    }

    public int getHeaderCount() {
        return this.f54679j.r();
    }

    @p0
    public Drawable getItemBackground() {
        return this.f54679j.t();
    }

    @r
    public int getItemHorizontalPadding() {
        return this.f54679j.u();
    }

    @r
    public int getItemIconPadding() {
        return this.f54679j.v();
    }

    @p0
    public ColorStateList getItemIconTintList() {
        return this.f54679j.y();
    }

    public int getItemMaxLines() {
        return this.f54679j.w();
    }

    @p0
    public ColorStateList getItemTextColor() {
        return this.f54679j.x();
    }

    @t0
    public int getItemVerticalPadding() {
        return this.f54679j.z();
    }

    @n0
    public Menu getMenu() {
        return this.f54678i;
    }

    @t0
    public int getSubheaderInsetEnd() {
        return this.f54679j.A();
    }

    @t0
    public int getSubheaderInsetStart() {
        return this.f54679j.B();
    }

    public View h(int i10) {
        return this.f54679j.s(i10);
    }

    public View j(@i0 int i10) {
        return this.f54679j.C(i10);
    }

    public void k(int i10) {
        this.f54679j.Z(true);
        getMenuInflater().inflate(i10, this.f54678i);
        this.f54679j.Z(false);
        this.f54679j.e(false);
    }

    public boolean l() {
        return this.f54686q;
    }

    public boolean m() {
        return this.f54685p;
    }

    public void o(@n0 View view) {
        this.f54679j.E(view);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f54684o);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f54681l), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f54681l, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f54678i.U(savedState.f54691b);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f54691b = bundle;
        this.f54678i.W(bundle);
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        n(i10, i11);
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f54686q = z10;
    }

    public void setCheckedItem(@d0 int i10) {
        MenuItem menuItemFindItem = this.f54678i.findItem(i10);
        if (menuItemFindItem != null) {
            this.f54679j.G((j) menuItemFindItem);
        }
    }

    public void setCheckedItem(@n0 MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f54678i.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.f54679j.G((j) menuItemFindItem);
    }

    public void setDividerInsetEnd(@t0 int i10) {
        this.f54679j.H(i10);
    }

    public void setDividerInsetStart(@t0 int i10) {
        this.f54679j.I(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        l.d(this, f10);
    }

    public void setItemBackground(@p0 Drawable drawable) {
        this.f54679j.K(drawable);
    }

    public void setItemBackgroundResource(@v int i10) {
        setItemBackground(d.i(getContext(), i10));
    }

    public void setItemHorizontalPadding(@r int i10) {
        this.f54679j.M(i10);
    }

    public void setItemHorizontalPaddingResource(@androidx.annotation.q int i10) {
        this.f54679j.M(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconPadding(@r int i10) {
        this.f54679j.N(i10);
    }

    public void setItemIconPaddingResource(int i10) {
        this.f54679j.N(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(@r int i10) {
        this.f54679j.O(i10);
    }

    public void setItemIconTintList(@p0 ColorStateList colorStateList) {
        this.f54679j.P(colorStateList);
    }

    public void setItemMaxLines(int i10) {
        this.f54679j.Q(i10);
    }

    public void setItemTextAppearance(@e1 int i10) {
        this.f54679j.R(i10);
    }

    public void setItemTextColor(@p0 ColorStateList colorStateList) {
        this.f54679j.S(colorStateList);
    }

    public void setItemVerticalPadding(@t0 int i10) {
        this.f54679j.T(i10);
    }

    public void setItemVerticalPaddingResource(@androidx.annotation.q int i10) {
        this.f54679j.T(getResources().getDimensionPixelSize(i10));
    }

    public void setNavigationItemSelectedListener(@p0 c cVar) {
        this.f54680k = cVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        t tVar = this.f54679j;
        if (tVar != null) {
            tVar.U(i10);
        }
    }

    public void setSubheaderInsetEnd(@t0 int i10) {
        this.f54679j.W(i10);
    }

    public void setSubheaderInsetStart(@t0 int i10) {
        this.f54679j.X(i10);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f54685p = z10;
    }
}
