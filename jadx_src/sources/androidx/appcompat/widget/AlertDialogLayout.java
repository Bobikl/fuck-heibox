package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(@androidx.annotation.p0 Context context) {
        super(context);
    }

    public AlertDialogLayout(@androidx.annotation.p0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void B(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    private static int C(View view) {
        int iE0 = j1.e0(view);
        if (iE0 > 0) {
            return iE0;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return C(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private boolean D(int i10, int i11) {
        int iCombineMeasuredStates;
        int iC;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == R.id.topPanel) {
                    view = childAt;
                } else if (id2 == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id2 != R.id.contentPanel && id2 != R.id.customPanel) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i10, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            iC = C(view2);
            measuredHeight = view2.getMeasuredHeight() - iC;
            paddingTop += iC;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iC = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i13 = size - paddingTop;
        if (view2 != null) {
            int i14 = paddingTop - iC;
            int iMin = Math.min(i13, measuredHeight);
            if (iMin > 0) {
                i13 -= iMin;
                iC += iMin;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(iC, 1073741824));
            paddingTop = i14 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i13 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i13, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i10, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i11, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        k(childCount, i11);
        return true;
    }

    private void k(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i13;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i18 = gravity & 112;
        int i19 = gravity & androidx.core.view.n.f21703d;
        int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - measuredHeight : getPaddingTop() + (((i13 - i11) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                int i21 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i21 < 0) {
                    i21 = i19;
                }
                int iD = androidx.core.view.n.d(i21, j1.Z(this)) & 7;
                if (iD != 1) {
                    if (iD != 5) {
                        i16 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    if (s(i20)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i22 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    B(childAt, i16, i22, measuredWidth, measuredHeight2);
                    paddingTop = i22 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                } else {
                    i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    i15 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                }
                i16 = i14 - i15;
                if (s(i20)) {
                    paddingTop += intrinsicHeight;
                }
                int i23 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                B(childAt, i16, i23, measuredWidth, measuredHeight2);
                paddingTop = i23 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (D(i10, i11)) {
            return;
        }
        super.onMeasure(i10, i11);
    }
}
