package com.max.hbcommon.component.ezcalendarview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class DayPickerViewPager extends ViewPager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private final ArrayList<View> f67599a4;

    public DayPickerViewPager(Context context) {
        this(context, null);
    }

    public DayPickerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67599a4 = new ArrayList<>(1);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.d.Xp, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        boolean z10 = (View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == 1073741824) ? false : true;
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                if (z10 && (((ViewGroup.LayoutParams) layoutParams).width == -1 || ((ViewGroup.LayoutParams) layoutParams).height == -1)) {
                    this.f67599a4.add(childAt);
                }
            }
        }
        int paddingLeft = iMax + getPaddingLeft() + getPaddingRight();
        int iMax3 = Math.max(iMax2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight());
        int iMax4 = Math.max(paddingLeft, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            iMax3 = Math.max(iMax3, foreground.getMinimumHeight());
            iMax4 = Math.max(iMax4, foreground.getMinimumWidth());
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax4, i10, iCombineMeasuredStates), View.resolveSizeAndState(iMax3, i11, iCombineMeasuredStates << 16));
        int size = this.f67599a4.size();
        if (size > 1) {
            for (int i13 = 0; i13 < size; i13++) {
                View view = this.f67599a4.get(i13);
                ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams) view.getLayoutParams();
                view.measure(((ViewGroup.LayoutParams) layoutParams2).width == -1 ? View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824) : ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), ((ViewGroup.LayoutParams) layoutParams2).width), ((ViewGroup.LayoutParams) layoutParams2).height == -1 ? View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824) : ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), ((ViewGroup.LayoutParams) layoutParams2).height));
            }
        }
        this.f67599a4.clear();
    }
}
