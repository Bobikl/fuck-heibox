package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f2462e = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2465d;

    public ButtonBarLayout(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2465d = -1;
        int[] iArr = R.styleable.f1581n;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        j1.z1(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f2463b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ButtonBarLayout_allowStacking, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f2463b);
        }
    }

    private int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private boolean b() {
        return this.f2464c;
    }

    private void setStacked(boolean z10) {
        if (this.f2464c != z10) {
            if (!z10 || this.f2463b) {
                this.f2464c = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? androidx.core.view.n.f21702c : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int paddingBottom = 0;
        if (this.f2463b) {
            if (size > this.f2465d && b()) {
                setStacked(false);
            }
            this.f2465d = size;
        }
        if (b() || View.MeasureSpec.getMode(i10) != 1073741824) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f2463b && !b()) {
            if ((getMeasuredWidthAndState() & j1.f21601t) == 16777216) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (j1.e0(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f2463b != z10) {
            this.f2463b = z10;
            if (!z10 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
