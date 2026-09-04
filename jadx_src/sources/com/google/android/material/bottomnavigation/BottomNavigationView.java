package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.x0;
import androidx.core.content.d;
import androidx.core.view.j1;
import androidx.core.view.n3;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

/* JADX INFO: loaded from: classes7.dex */
public class BottomNavigationView extends NavigationBarView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f53237m = 5;

    public class a implements j0.e {
        a() {
        }

        @Override // com.google.android.material.internal.j0.e
        @n0
        public n3 a(View view, @n0 n3 n3Var, @n0 j0.f fVar) {
            fVar.f54524d += n3Var.o();
            boolean z10 = j1.Z(view) == 1;
            int iP = n3Var.p();
            int iQ = n3Var.q();
            fVar.f54521a += z10 ? iQ : iP;
            int i10 = fVar.f54523c;
            if (!z10) {
                iP = iQ;
            }
            fVar.f54523c = i10 + iP;
            fVar.a(view);
            return n3Var;
        }
    }

    @Deprecated
    public interface b extends NavigationBarView.c {
    }

    @Deprecated
    public interface c extends NavigationBarView.d {
    }

    public BottomNavigationView(@n0 Context context) {
        this(context, null);
    }

    public BottomNavigationView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@n0 Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Context context2 = getContext();
        x0 x0VarL = c0.l(context2, attributeSet, R.styleable.f52884w, i10, i11, new int[0]);
        setItemHorizontalTranslationEnabled(x0VarL.a(R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int i12 = R.styleable.BottomNavigationView_android_minHeight;
        if (x0VarL.C(i12)) {
            setMinimumHeight(x0VarL.g(i12, 0));
        }
        if (x0VarL.a(R.styleable.BottomNavigationView_compatShadowEnabled, true) && n()) {
            j(context2);
        }
        x0VarL.I();
        k();
    }

    private void j(@n0 Context context) {
        View view = new View(context);
        view.setBackgroundColor(d.f(context, R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void k() {
        j0.f(this, new a());
    }

    private int m(int i10) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i10) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    private boolean n() {
        return false;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected NavigationBarMenuView d(@n0 Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    public boolean l() {
        return ((BottomNavigationMenuView) getMenuView()).t();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, m(i11));
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.t() != z10) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z10);
            getPresenter().e(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@p0 b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@p0 c cVar) {
        setOnItemSelectedListener(cVar);
    }
}
