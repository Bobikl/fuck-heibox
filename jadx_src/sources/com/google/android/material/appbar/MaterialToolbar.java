package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.d0;
import com.google.android.material.shape.k;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f53039b0 = R.style.Widget_MaterialComponents_Toolbar;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f53040c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    @p0
    private Integer T;
    private boolean U;
    private boolean V;

    @p0
    private ImageView.ScaleType W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @p0
    private Boolean f53041a0;

    public MaterialToolbar(@n0 Context context) {
        this(context, null);
    }

    public MaterialToolbar(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f53039b0;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.J0, i10, i11, new int[0]);
        int i12 = R.styleable.MaterialToolbar_navigationIconTint;
        if (typedArrayK.hasValue(i12)) {
            setNavigationIconTint(typedArrayK.getColor(i12, -1));
        }
        this.U = typedArrayK.getBoolean(R.styleable.MaterialToolbar_titleCentered, false);
        this.V = typedArrayK.getBoolean(R.styleable.MaterialToolbar_subtitleCentered, false);
        int i13 = typedArrayK.getInt(R.styleable.MaterialToolbar_logoScaleType, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f53040c0;
            if (i13 < scaleTypeArr.length) {
                this.W = scaleTypeArr[i13];
            }
        }
        int i14 = R.styleable.MaterialToolbar_logoAdjustViewBounds;
        if (typedArrayK.hasValue(i14)) {
            this.f53041a0 = Boolean.valueOf(typedArrayK.getBoolean(i14, false));
        }
        typedArrayK.recycle();
        Q(context2);
    }

    private Pair<Integer, Integer> O(@p0 TextView textView, @p0 TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void Q(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            k kVar = new k();
            kVar.o0(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            kVar.Z(context);
            kVar.n0(j1.R(this));
            j1.I1(this, kVar);
        }
    }

    private void U(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void V() {
        if (this.U || this.V) {
            TextView textViewI = d0.i(this);
            TextView textViewG = d0.g(this);
            if (textViewI == null && textViewG == null) {
                return;
            }
            Pair<Integer, Integer> pairO = O(textViewI, textViewG);
            if (this.U && textViewI != null) {
                U(textViewI, pairO);
            }
            if (!this.V || textViewG == null) {
                return;
            }
            U(textViewG, pairO);
        }
    }

    @p0
    private Drawable W(@p0 Drawable drawable) {
        if (drawable == null || this.T == null) {
            return drawable;
        }
        Drawable drawableR = androidx.core.graphics.drawable.d.r(drawable.mutate());
        androidx.core.graphics.drawable.d.n(drawableR, this.T.intValue());
        return drawableR;
    }

    private void X() {
        ImageView imageViewD = d0.d(this);
        if (imageViewD != null) {
            Boolean bool = this.f53041a0;
            if (bool != null) {
                imageViewD.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.W;
            if (scaleType != null) {
                imageViewD.setScaleType(scaleType);
            }
        }
    }

    public void P() {
        this.T = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            androidx.core.graphics.drawable.d.o(androidx.core.graphics.drawable.d.r(navigationIcon.mutate()), null);
            setNavigationIcon(navigationIcon);
        }
    }

    public boolean R() {
        Boolean bool = this.f53041a0;
        return bool != null && bool.booleanValue();
    }

    public boolean S() {
        return this.V;
    }

    public boolean T() {
        return this.U;
    }

    @p0
    public ImageView.ScaleType getLogoScaleType() {
        return this.W;
    }

    @l
    @p0
    public Integer getNavigationIconTint() {
        return this.T;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        V();
        X();
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.shape.l.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f53041a0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f53041a0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(@n0 ImageView.ScaleType scaleType) {
        if (this.W != scaleType) {
            this.W = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@p0 Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(@l int i10) {
        this.T = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void z(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof androidx.appcompat.view.menu.g;
        if (z10) {
            ((androidx.appcompat.view.menu.g) menu).m0();
        }
        super.z(i10);
        if (z10) {
            ((androidx.appcompat.view.menu.g) menu).l0();
        }
    }
}
