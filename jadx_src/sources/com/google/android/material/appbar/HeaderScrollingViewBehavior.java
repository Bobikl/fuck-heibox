package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j1;
import androidx.core.view.n;
import androidx.core.view.n3;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Rect f53035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Rect f53036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f53037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f53038l;

    public HeaderScrollingViewBehavior() {
        this.f53035i = new Rect();
        this.f53036j = new Rect();
        this.f53037k = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53035i = new Rect();
        this.f53036j = new Rect();
        this.f53037k = 0;
    }

    private static int Y(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    protected void N(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, int i10) {
        View viewS = S(coordinatorLayout.s(view));
        if (viewS == null) {
            super.N(coordinatorLayout, view, i10);
            this.f53037k = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f53035i;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewS.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewS.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        n3 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && j1.U(coordinatorLayout) && !j1.U(view)) {
            rect.left += lastWindowInsets.p();
            rect.right -= lastWindowInsets.q();
        }
        Rect rect2 = this.f53036j;
        n.b(Y(fVar.f19803c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int iT = T(viewS);
        view.layout(rect2.left, rect2.top - iT, rect2.right, rect2.bottom - iT);
        this.f53037k = rect2.top - viewS.getBottom();
    }

    @p0
    abstract View S(List<View> list);

    final int T(View view) {
        if (this.f53038l == 0) {
            return 0;
        }
        float fU = U(view);
        int i10 = this.f53038l;
        return a2.a.e((int) (fU * i10), 0, i10);
    }

    float U(View view) {
        return 1.0f;
    }

    public final int V() {
        return this.f53038l;
    }

    int W(@n0 View view) {
        return view.getMeasuredHeight();
    }

    final int X() {
        return this.f53037k;
    }

    public final void Z(int i10) {
        this.f53038l = i10;
    }

    protected boolean a0() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean q(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, int i10, int i11, int i12, int i13) {
        View viewS;
        n3 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewS = S(coordinatorLayout.s(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (j1.U(viewS) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.r() + lastWindowInsets.o();
        }
        int iW = size + W(viewS);
        int measuredHeight = viewS.getMeasuredHeight();
        if (a0()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iW -= measuredHeight;
        }
        coordinatorLayout.L(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iW, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }
}
