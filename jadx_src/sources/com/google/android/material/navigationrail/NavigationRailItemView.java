package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.q;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationRailItemView extends NavigationBarItemView {
    public NavigationRailItemView(@n0 Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @q
    protected int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @i0
    protected int getItemLayoutResId() {
        return R.layout.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i11) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i11)));
        }
    }
}
