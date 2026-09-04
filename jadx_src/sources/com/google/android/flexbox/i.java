package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: compiled from: FlexboxItemDecoration.java */
/* JADX INFO: loaded from: classes7.dex */
public class i extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f52266d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f52267e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f52268f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f52269g = {android.R.attr.listDivider};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f52270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52271c;

    public i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f52269g);
        this.f52270b = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(3);
    }

    private void a(Canvas canvas, RecyclerView recyclerView) {
        int top;
        int intrinsicHeight;
        int left;
        int right;
        int i10;
        int iMin;
        int left2;
        if (d()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            int left3 = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int right2 = recyclerView.getRight() + recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (flexDirection == 3) {
                    intrinsicHeight = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    top = this.f52270b.getIntrinsicHeight() + intrinsicHeight;
                } else {
                    top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    intrinsicHeight = top - this.f52270b.getIntrinsicHeight();
                }
                if (flexboxLayoutManager.k()) {
                    if (flexboxLayoutManager.K()) {
                        iMin = Math.min(childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + this.f52270b.getIntrinsicWidth(), right2);
                        left2 = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    } else {
                        left = Math.max((childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f52270b.getIntrinsicWidth(), left3);
                        right = childAt.getRight();
                        i10 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    }
                    this.f52270b.setBounds(left2, intrinsicHeight, iMin, top);
                    this.f52270b.draw(canvas);
                } else {
                    left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    right = childAt.getRight();
                    i10 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }
                int i12 = left;
                iMin = right + i10;
                left2 = i12;
                this.f52270b.setBounds(left2, intrinsicHeight, iMin, top);
                this.f52270b.draw(canvas);
            }
        }
    }

    private void b(Canvas canvas, RecyclerView recyclerView) {
        int left;
        int intrinsicWidth;
        int iMax;
        int bottom;
        int i10;
        int i11;
        if (e()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top = recyclerView.getTop() - recyclerView.getPaddingTop();
            int bottom2 = recyclerView.getBottom() + recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = recyclerView.getChildAt(i12);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (flexboxLayoutManager.K()) {
                    intrinsicWidth = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    left = this.f52270b.getIntrinsicWidth() + intrinsicWidth;
                } else {
                    left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    intrinsicWidth = left - this.f52270b.getIntrinsicWidth();
                }
                if (flexboxLayoutManager.k()) {
                    iMax = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    bottom = childAt.getBottom();
                    i10 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                } else {
                    if (flexDirection == 3) {
                        int iMin = Math.min(childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + this.f52270b.getIntrinsicHeight(), bottom2);
                        iMax = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        i11 = iMin;
                    } else {
                        iMax = Math.max((childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f52270b.getIntrinsicHeight(), top);
                        bottom = childAt.getBottom();
                        i10 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    this.f52270b.setBounds(intrinsicWidth, iMax, left, i11);
                    this.f52270b.draw(canvas);
                }
                i11 = bottom + i10;
                this.f52270b.setBounds(intrinsicWidth, iMax, left, i11);
                this.f52270b.draw(canvas);
            }
        }
    }

    private boolean c(int i10, List<f> list, FlexboxLayoutManager flexboxLayoutManager) {
        int iH = flexboxLayoutManager.H(i10);
        if ((iH == -1 || iH >= flexboxLayoutManager.getFlexLinesInternal().size() || flexboxLayoutManager.getFlexLinesInternal().get(iH).f52247o != i10) && i10 != 0) {
            return list.size() != 0 && list.get(list.size() - 1).f52248p == i10 - 1;
        }
        return true;
    }

    private boolean d() {
        return (this.f52271c & 1) > 0;
    }

    private boolean e() {
        return (this.f52271c & 2) > 0;
    }

    private void f(Rect rect, int i10, FlexboxLayoutManager flexboxLayoutManager, List<f> list) {
        if (list.size() == 0 || flexboxLayoutManager.H(i10) == 0) {
            return;
        }
        if (flexboxLayoutManager.k()) {
            if (d()) {
                rect.top = this.f52270b.getIntrinsicHeight();
                rect.bottom = 0;
                return;
            } else {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
        }
        if (e()) {
            if (flexboxLayoutManager.K()) {
                rect.right = this.f52270b.getIntrinsicWidth();
                rect.left = 0;
            } else {
                rect.left = this.f52270b.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }

    private void g(Rect rect, int i10, FlexboxLayoutManager flexboxLayoutManager, List<f> list, int i11) {
        if (c(i10, list, flexboxLayoutManager)) {
            return;
        }
        if (flexboxLayoutManager.k()) {
            if (!e()) {
                rect.left = 0;
                rect.right = 0;
                return;
            } else if (flexboxLayoutManager.K()) {
                rect.right = this.f52270b.getIntrinsicWidth();
                rect.left = 0;
                return;
            } else {
                rect.left = this.f52270b.getIntrinsicWidth();
                rect.right = 0;
                return;
            }
        }
        if (!d()) {
            rect.top = 0;
            rect.bottom = 0;
        } else if (i11 == 3) {
            rect.bottom = this.f52270b.getIntrinsicHeight();
            rect.top = 0;
        } else {
            rect.top = this.f52270b.getIntrinsicHeight();
            rect.bottom = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            return;
        }
        if (!d() && !e()) {
            rect.set(0, 0, 0, 0);
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        List<f> flexLines = flexboxLayoutManager.getFlexLines();
        g(rect, childAdapterPosition, flexboxLayoutManager, flexLines, flexboxLayoutManager.getFlexDirection());
        f(rect, childAdapterPosition, flexboxLayoutManager, flexLines);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        a(canvas, recyclerView);
        b(canvas, recyclerView);
    }

    public void setDrawable(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f52270b = drawable;
    }

    public void setOrientation(int i10) {
        this.f52271c = i10;
    }
}
