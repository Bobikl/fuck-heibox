package com.donkingliang.consecutivescroller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.j1;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ConsecutiveViewPager extends ViewPager implements c {

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private int f42353a4;

    public ConsecutiveViewPager(@n0 Context context) {
        super(context);
    }

    public ConsecutiveViewPager(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void Y(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        view.setOverScrollMode(2);
        j1.Y1(view, false);
    }

    private boolean Z() {
        ViewParent parent = getParent();
        if (!(parent instanceof ConsecutiveScrollerLayout)) {
            return false;
        }
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) parent;
        return consecutiveScrollerLayout.indexOfChild(this) == consecutiveScrollerLayout.getChildCount() - 1;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (f.t(this)) {
            Y(view);
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setClipToPadding(false);
            }
        }
    }

    public int getAdjustHeight() {
        return this.f42353a4;
    }

    @Override // com.donkingliang.consecutivescroller.c
    public View getCurrentScrollerView() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getX() == getScrollX() + getPaddingLeft()) {
                return childAt;
            }
        }
        return this;
    }

    @Override // com.donkingliang.consecutivescroller.c
    public List<View> getScrolledViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                arrayList.add(getChildAt(i10));
            }
        }
        return arrayList;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!Z() || this.f42353a4 <= 0) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.getDefaultSize(0, i11) - this.f42353a4, View.MeasureSpec.getMode(i11)));
        }
    }

    public void setAdjustHeight(int i10) {
        if (this.f42353a4 != i10) {
            this.f42353a4 = i10;
            requestLayout();
        }
    }
}
