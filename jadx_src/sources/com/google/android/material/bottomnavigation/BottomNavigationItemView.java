package com.google.android.material.bottomnavigation;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.q;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationItemView extends NavigationBarItemView {
    public BottomNavigationItemView(@n0 Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @q
    protected int getItemDefaultMarginResId() {
        return R.dimen.design_bottom_navigation_margin;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @i0
    protected int getItemLayoutResId() {
        return R.layout.design_bottom_navigation_item;
    }
}
