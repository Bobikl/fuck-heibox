package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.appcompat.view.menu.g;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private final int I;
    private final int J;
    private final int K;
    private final int L;
    private boolean M;
    private final List<Integer> N;

    public BottomNavigationMenuView(@n0 Context context) {
        super(context);
        this.N = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.I = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.J = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.K = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.L = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @n0
    protected NavigationBarItemView g(@n0 Context context) {
        return new BottomNavigationItemView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                if (j1.Z(this) == 1) {
                    int i17 = i14 - measuredWidth;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i15);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i15);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        g menu = getMenu();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = menu.H().size();
        int childCount = getChildCount();
        this.N.clear();
        int size3 = View.MeasureSpec.getSize(i11);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (l(getLabelVisibilityMode(), size2) && t()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int iMax = this.L;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.K, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i14 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.J * i14), Math.min(iMax, this.K));
            int i15 = size - iMin;
            int iMin2 = Math.min(i15 / (i14 != 0 ? i14 : 1), this.I);
            int i16 = i15 - (i14 * iMin2);
            int i17 = 0;
            while (i17 < childCount) {
                if (getChildAt(i17).getVisibility() != 8) {
                    i13 = i17 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i16 > 0) {
                        i13++;
                        i16--;
                    }
                } else {
                    i13 = 0;
                }
                this.N.add(Integer.valueOf(i13));
                i17++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), this.K);
            int i18 = size - (size2 * iMin3);
            for (int i19 = 0; i19 < childCount; i19++) {
                if (getChildAt(i19).getVisibility() == 8) {
                    i12 = 0;
                } else if (i18 > 0) {
                    i12 = iMin3 + 1;
                    i18--;
                } else {
                    i12 = iMin3;
                }
                this.N.add(Integer.valueOf(i12));
            }
        }
        int measuredWidth = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.N.get(i20).intValue(), 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.M = z10;
    }

    public boolean t() {
        return this.M;
    }
}
