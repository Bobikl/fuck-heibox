package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.x0;
import androidx.core.graphics.drawable.d;
import androidx.core.graphics.f0;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import j9.a;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialSwitch extends SwitchCompat {
    private static final int P3 = R.style.Widget_Material3_CompoundButton_MaterialSwitch;
    private static final int[] Q3 = {R.attr.state_with_icon};

    @p0
    private Drawable G2;

    @p0
    private ColorStateList G3;

    @n0
    private PorterDuff.Mode J3;

    @p0
    private ColorStateList K3;

    @p0
    private ColorStateList L3;

    @n0
    private PorterDuff.Mode M3;
    private int[] N3;
    private int[] O3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @p0
    private Drawable f54592p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @p0
    private ColorStateList f54593p3;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @p0
    private Drawable f54594x2;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @p0
    private Drawable f54595y2;

    public MaterialSwitch(@n0 Context context) {
        this(context, null);
    }

    public MaterialSwitch(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = P3;
        super(a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f54592p2 = super.getThumbDrawable();
        this.f54593p3 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f54595y2 = super.getTrackDrawable();
        this.K3 = super.getTrackTintList();
        super.setTrackTintList(null);
        x0 x0VarL = c0.l(context2, attributeSet, R.styleable.F0, i10, i11, new int[0]);
        this.f54594x2 = x0VarL.h(R.styleable.MaterialSwitch_thumbIcon);
        this.G3 = x0VarL.d(R.styleable.MaterialSwitch_thumbIconTint);
        this.J3 = j0.r(x0VarL.o(R.styleable.MaterialSwitch_thumbIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.G2 = x0VarL.h(R.styleable.MaterialSwitch_trackDecoration);
        this.L3 = x0VarL.d(R.styleable.MaterialSwitch_trackDecorationTint);
        this.M3 = j0.r(x0VarL.o(R.styleable.MaterialSwitch_trackDecorationTintMode, -1), PorterDuff.Mode.SRC_IN);
        x0VarL.I();
        setEnforceSwitchWidth(false);
        p();
        q();
    }

    private void p() {
        this.f54592p2 = e9.a.b(this.f54592p2, this.f54593p3, getThumbTintMode());
        this.f54594x2 = e9.a.b(this.f54594x2, this.G3, this.J3);
        s();
        super.setThumbDrawable(e9.a.a(this.f54592p2, this.f54594x2));
        refreshDrawableState();
    }

    private void q() {
        this.f54595y2 = e9.a.b(this.f54595y2, this.K3, getTrackTintMode());
        this.G2 = e9.a.b(this.G2, this.L3, this.M3);
        s();
        Drawable layerDrawable = this.f54595y2;
        if (layerDrawable != null && this.G2 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f54595y2, this.G2});
        } else if (layerDrawable == null) {
            layerDrawable = this.G2;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    private static void r(@p0 Drawable drawable, @p0 ColorStateList colorStateList, @n0 int[] iArr, @n0 int[] iArr2, float f10) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        d.n(drawable, f0.i(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f10));
    }

    private void s() {
        if (this.f54593p3 == null && this.G3 == null && this.K3 == null && this.L3 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f54593p3;
        if (colorStateList != null) {
            r(this.f54592p2, colorStateList, this.N3, this.O3, thumbPosition);
        }
        ColorStateList colorStateList2 = this.G3;
        if (colorStateList2 != null) {
            r(this.f54594x2, colorStateList2, this.N3, this.O3, thumbPosition);
        }
        ColorStateList colorStateList3 = this.K3;
        if (colorStateList3 != null) {
            r(this.f54595y2, colorStateList3, this.N3, this.O3, thumbPosition);
        }
        ColorStateList colorStateList4 = this.L3;
        if (colorStateList4 != null) {
            r(this.G2, colorStateList4, this.N3, this.O3, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @p0
    public Drawable getThumbDrawable() {
        return this.f54592p2;
    }

    @p0
    public Drawable getThumbIconDrawable() {
        return this.f54594x2;
    }

    @p0
    public ColorStateList getThumbIconTintList() {
        return this.G3;
    }

    @n0
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.J3;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @p0
    public ColorStateList getThumbTintList() {
        return this.f54593p3;
    }

    @p0
    public Drawable getTrackDecorationDrawable() {
        return this.G2;
    }

    @p0
    public ColorStateList getTrackDecorationTintList() {
        return this.L3;
    }

    @n0
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.M3;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @p0
    public Drawable getTrackDrawable() {
        return this.f54595y2;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @p0
    public ColorStateList getTrackTintList() {
        return this.K3;
    }

    @Override // android.view.View
    public void invalidate() {
        s();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.f54594x2 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, Q3);
        }
        this.N3 = e9.a.f(iArrOnCreateDrawableState);
        this.O3 = e9.a.e(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@p0 Drawable drawable) {
        this.f54592p2 = drawable;
        p();
    }

    public void setThumbIconDrawable(@p0 Drawable drawable) {
        this.f54594x2 = drawable;
        p();
    }

    public void setThumbIconResource(@v int i10) {
        setThumbIconDrawable(b0.a.b(getContext(), i10));
    }

    public void setThumbIconTintList(@p0 ColorStateList colorStateList) {
        this.G3 = colorStateList;
        p();
    }

    public void setThumbIconTintMode(@n0 PorterDuff.Mode mode) {
        this.J3 = mode;
        p();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@p0 ColorStateList colorStateList) {
        this.f54593p3 = colorStateList;
        p();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@p0 PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        p();
    }

    public void setTrackDecorationDrawable(@p0 Drawable drawable) {
        this.G2 = drawable;
        q();
    }

    public void setTrackDecorationResource(@v int i10) {
        setTrackDecorationDrawable(b0.a.b(getContext(), i10));
    }

    public void setTrackDecorationTintList(@p0 ColorStateList colorStateList) {
        this.L3 = colorStateList;
        q();
    }

    public void setTrackDecorationTintMode(@n0 PorterDuff.Mode mode) {
        this.M3 = mode;
        q();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@p0 Drawable drawable) {
        this.f54595y2 = drawable;
        q();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@p0 ColorStateList colorStateList) {
        this.K3 = colorStateList;
        q();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@p0 PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        q();
    }
}
