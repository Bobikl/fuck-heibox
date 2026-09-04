package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.d;
import com.google.android.material.R;
import com.google.android.material.color.m;
import com.google.android.material.internal.c0;
import com.google.android.material.resources.c;
import j9.a;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f54836h = R.style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[][] f54837i = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private ColorStateList f54838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f54839g;

    public MaterialRadioButton(@n0 Context context) {
        this(context, null);
    }

    public MaterialRadioButton(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f54836h;
        super(a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.D0, i10, i11, new int[0]);
        int i12 = R.styleable.MaterialRadioButton_buttonTint;
        if (typedArrayK.hasValue(i12)) {
            d.d(this, c.a(context2, typedArrayK, i12));
        }
        this.f54839g = typedArrayK.getBoolean(R.styleable.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayK.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f54838f == null) {
            int iD = m.d(this, R.attr.colorControlActivated);
            int iD2 = m.d(this, R.attr.colorOnSurface);
            int iD3 = m.d(this, R.attr.colorSurface);
            int[][] iArr = f54837i;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = m.o(iD3, iD, 1.0f);
            iArr2[1] = m.o(iD3, iD2, 0.54f);
            iArr2[2] = m.o(iD3, iD2, 0.38f);
            iArr2[3] = m.o(iD3, iD2, 0.38f);
            this.f54838f = new ColorStateList(iArr, iArr2);
        }
        return this.f54838f;
    }

    public boolean a() {
        return this.f54839g;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f54839g && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f54839g = z10;
        if (z10) {
            d.d(this, getMaterialThemeColorsTintList());
        } else {
            d.d(this, null);
        }
    }
}
