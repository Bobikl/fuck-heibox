package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.appcompat.widget.x0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import com.google.android.material.navigation.NavigationBarView;

/* JADX INFO: loaded from: classes7.dex */
public class NavigationRailView extends NavigationBarView {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f54694q = 49;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f54695r = 7;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f54696s = 49;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f54697t = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f54698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private View f54699n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private Boolean f54700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private Boolean f54701p;

    public class a implements j0.e {
        a() {
        }

        @Override // com.google.android.material.internal.j0.e
        @n0
        public n3 a(View view, @n0 n3 n3Var, @n0 j0.f fVar) {
            NavigationRailView navigationRailView = NavigationRailView.this;
            if (navigationRailView.t(navigationRailView.f54700o)) {
                fVar.f54522b += n3Var.f(n3.m.i()).f20743b;
            }
            NavigationRailView navigationRailView2 = NavigationRailView.this;
            if (navigationRailView2.t(navigationRailView2.f54701p)) {
                fVar.f54524d += n3Var.f(n3.m.i()).f20745d;
            }
            boolean z10 = j1.Z(view) == 1;
            int iP = n3Var.p();
            int iQ = n3Var.q();
            int i10 = fVar.f54521a;
            if (z10) {
                iP = iQ;
            }
            fVar.f54521a = i10 + iP;
            fVar.a(view);
            return n3Var;
        }
    }

    public NavigationRailView(@n0 Context context) {
        this(context, null);
    }

    public NavigationRailView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@n0 Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f54700o = null;
        this.f54701p = null;
        this.f54698m = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        x0 x0VarL = c0.l(getContext(), attributeSet, R.styleable.V0, i10, i11, new int[0]);
        int iU = x0VarL.u(R.styleable.NavigationRailView_headerLayout, 0);
        if (iU != 0) {
            m(iU);
        }
        setMenuGravity(x0VarL.o(R.styleable.NavigationRailView_menuGravity, 49));
        int i12 = R.styleable.NavigationRailView_itemMinHeight;
        if (x0VarL.C(i12)) {
            setItemMinimumHeight(x0VarL.g(i12, -1));
        }
        int i13 = R.styleable.NavigationRailView_paddingTopSystemWindowInsets;
        if (x0VarL.C(i13)) {
            this.f54700o = Boolean.valueOf(x0VarL.a(i13, false));
        }
        int i14 = R.styleable.NavigationRailView_paddingBottomSystemWindowInsets;
        if (x0VarL.C(i14)) {
            this.f54701p = Boolean.valueOf(x0VarL.a(i14, false));
        }
        x0VarL.I();
        o();
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private void o() {
        j0.f(this, new a());
    }

    private boolean q() {
        View view = this.f54699n;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    private int r(int i10) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i10) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(Boolean bool) {
        return bool != null ? bool.booleanValue() : j1.U(this);
    }

    @p0
    public View getHeaderView() {
        return this.f54699n;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public void m(@i0 int i10) {
        n(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this, false));
    }

    public void n(@n0 View view) {
        s();
        this.f54699n = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f54698m;
        addView(view, 0, layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i14 = 0;
        if (q()) {
            int bottom = this.f54699n.getBottom() + this.f54698m;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i14 = bottom - top;
            }
        } else if (navigationRailMenuView.t()) {
            i14 = this.f54698m;
        }
        if (i14 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i14, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i14);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iR = r(i10);
        super.onMeasure(iR, i11);
        if (q()) {
            measureChild(getNavigationRailMenuView(), iR, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f54699n.getMeasuredHeight()) - this.f54698m, Integer.MIN_VALUE));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.navigation.NavigationBarView
    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public NavigationRailMenuView d(@n0 Context context) {
        return new NavigationRailMenuView(context);
    }

    public void s() {
        View view = this.f54699n;
        if (view != null) {
            removeView(view);
            this.f54699n = null;
        }
    }

    public void setItemMinimumHeight(@t0 int i10) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i10);
    }

    public void setMenuGravity(int i10) {
        getNavigationRailMenuView().setMenuGravity(i10);
    }
}
