package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.t0;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationRailMenuView extends NavigationBarMenuView {

    @t0
    private int I;
    private final FrameLayout.LayoutParams J;

    public NavigationRailMenuView(@n0 Context context) {
        super(context);
        this.I = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.J = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int u(int i10, int i11, int i12) {
        int iMax = i11 / Math.max(1, i12);
        int size = this.I;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i10);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
    }

    private int v(View view, int i10, int i11) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i10, i11);
        return view.getMeasuredHeight();
    }

    private int w(int i10, int i11, int i12, View view) {
        int iU = view == null ? u(i10, i11, i12) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int iV = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != view) {
                iV += v(childAt, i10, iU);
            }
        }
        return iV;
    }

    private int x(int i10, int i11, int i12) {
        int iV;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            iV = v(childAt, i10, u(i10, i11, i12));
            i11 -= iV;
            i12--;
        } else {
            iV = 0;
        }
        return iV + w(i10, i11, i12, childAt);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @n0
    protected NavigationBarItemView g(@n0 Context context) {
        return new NavigationRailItemView(context);
    }

    @t0
    public int getItemMinimumHeight() {
        return this.I;
    }

    int getMenuGravity() {
        return this.J.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                childAt.layout(0, i15, i14, measuredHeight);
                i15 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = getMenu().H().size();
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.resolveSizeAndState((size2 <= 1 || !l(getLabelVisibilityMode(), size2)) ? w(i10, size, size2, null) : x(i10, size, size2), i11, 0));
    }

    public void setItemMinimumHeight(@t0 int i10) {
        if (this.I != i10) {
            this.I = i10;
            requestLayout();
        }
    }

    void setMenuGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = this.J;
        if (layoutParams.gravity != i10) {
            layoutParams.gravity = i10;
            setLayoutParams(layoutParams);
        }
    }

    boolean t() {
        return (this.J.gravity & 112) == 48;
    }
}
