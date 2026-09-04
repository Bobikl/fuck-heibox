package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.x;
import com.google.android.material.internal.j0;

/* JADX INFO: compiled from: TabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @r(unit = 0)
    private static final int f55501a = 24;

    c() {
    }

    static RectF a(TabLayout tabLayout, @p0 View view) {
        if (view == null) {
            return new RectF();
        }
        return (tabLayout.H() || !(view instanceof TabLayout.TabView)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.TabView) view, 24);
    }

    static RectF b(@n0 TabLayout.TabView tabView, @r(unit = 0) int i10) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int iG = (int) j0.g(tabView.getContext(), i10);
        if (contentWidth < iG) {
            contentWidth = iG;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i11 = contentWidth / 2;
        return new RectF(left - i11, top - (contentHeight / 2), i11 + left, top + (left / 2));
    }

    void c(TabLayout tabLayout, View view, @n0 Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
    }

    void d(TabLayout tabLayout, View view, View view2, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @n0 Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(com.google.android.material.animation.b.c((int) rectFA.left, (int) rectFA2.left, f10), drawable.getBounds().top, com.google.android.material.animation.b.c((int) rectFA.right, (int) rectFA2.right, f10), drawable.getBounds().bottom);
    }
}
