package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.j1;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f54378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54379e;

    public FlowLayout(@n0 Context context) {
        this(context, null);
    }

    public FlowLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f54378d = false;
        d(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f54378d = false;
        d(context, attributeSet);
    }

    private static int a(int i10, int i11, int i12) {
        if (i11 != Integer.MIN_VALUE) {
            return i11 != 1073741824 ? i12 : i10;
        }
        return Math.min(i12, i10);
    }

    private void d(@n0 Context context, @p0 AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.Y, 0, 0);
        this.f54376b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
        this.f54377c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_itemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int b(@n0 View view) {
        Object tag = view.getTag(R.id.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f54378d;
    }

    protected int getItemSpacing() {
        return this.f54377c;
    }

    protected int getLineSpacing() {
        return this.f54376b;
    }

    protected int getRowCount() {
        return this.f54379e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iB;
        int iC;
        if (getChildCount() == 0) {
            this.f54379e = 0;
            return;
        }
        this.f54379e = 1;
        boolean z11 = j1.Z(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i14 = (i12 - i10) - paddingLeft;
        int measuredWidth = paddingRight;
        int i15 = paddingTop;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iC = androidx.core.view.s.c(marginLayoutParams);
                    iB = androidx.core.view.s.b(marginLayoutParams);
                } else {
                    iB = 0;
                    iC = 0;
                }
                int measuredWidth2 = measuredWidth + iC + childAt.getMeasuredWidth();
                if (!this.f54378d && measuredWidth2 > i14) {
                    i15 = this.f54376b + paddingTop;
                    this.f54379e++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f54379e - 1));
                int i17 = measuredWidth + iC;
                int measuredWidth3 = childAt.getMeasuredWidth() + i17;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z11) {
                    childAt.layout(i14 - measuredWidth3, i15, (i14 - measuredWidth) - iC, measuredHeight);
                } else {
                    childAt.layout(i17, i15, measuredWidth3, measuredHeight);
                }
                measuredWidth += iC + iB + childAt.getMeasuredWidth() + this.f54377c;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin + 0;
                    i13 = marginLayoutParams.rightMargin + 0;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i18 = paddingLeft2;
                if (paddingLeft2 + i12 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = i18;
                } else {
                    paddingLeft = getPaddingLeft();
                    i15 = this.f54376b + paddingTop;
                }
                int measuredWidth = paddingLeft + i12 + childAt.getMeasuredWidth();
                int measuredHeight = i15 + childAt.getMeasuredHeight();
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i12 + i13 + childAt.getMeasuredWidth() + this.f54377c;
                if (i17 == getChildCount() - 1) {
                    i16 += i13;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i16 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i10) {
        this.f54377c = i10;
    }

    protected void setLineSpacing(int i10) {
        this.f54376b = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f54378d = z10;
    }
}
