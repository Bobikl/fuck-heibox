package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R;
import com.google.android.material.color.m;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import f9.a;

/* JADX INFO: loaded from: classes7.dex */
public class SwitchMaterial extends SwitchCompat {
    private boolean G2;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @n0
    private final a f55421p2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @p0
    private ColorStateList f55422x2;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @p0
    private ColorStateList f55423y2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f55420p3 = R.style.Widget_MaterialComponents_CompoundButton_Switch;
    private static final int[][] G3 = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    public SwitchMaterial(@n0 Context context) {
        this(context, null);
    }

    public SwitchMaterial(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f55420p3;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f55421p2 = new a(context2);
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.f52886w1, i10, i11, new int[0]);
        this.G2 = typedArrayK.getBoolean(R.styleable.SwitchMaterial_useMaterialThemeColors, false);
        typedArrayK.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f55422x2 == null) {
            int iD = m.d(this, R.attr.colorSurface);
            int iD2 = m.d(this, R.attr.colorControlActivated);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            if (this.f55421p2.l()) {
                dimension += j0.n(this);
            }
            int iE = this.f55421p2.e(iD, dimension);
            int[][] iArr = G3;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = m.o(iD, iD2, 1.0f);
            iArr2[1] = iE;
            iArr2[2] = m.o(iD, iD2, 0.38f);
            iArr2[3] = iE;
            this.f55422x2 = new ColorStateList(iArr, iArr2);
        }
        return this.f55422x2;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f55423y2 == null) {
            int[][] iArr = G3;
            int[] iArr2 = new int[iArr.length];
            int iD = m.d(this, R.attr.colorSurface);
            int iD2 = m.d(this, R.attr.colorControlActivated);
            int iD3 = m.d(this, R.attr.colorOnSurface);
            iArr2[0] = m.o(iD, iD2, 0.54f);
            iArr2[1] = m.o(iD, iD3, 0.32f);
            iArr2[2] = m.o(iD, iD2, 0.12f);
            iArr2[3] = m.o(iD, iD3, 0.12f);
            this.f55423y2 = new ColorStateList(iArr, iArr2);
        }
        return this.f55423y2;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.G2 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.G2 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public boolean p() {
        return this.G2;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.G2 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
