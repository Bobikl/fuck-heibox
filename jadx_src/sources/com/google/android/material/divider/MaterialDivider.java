package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.core.content.d;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.resources.c;
import com.google.android.material.shape.k;
import j9.a;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f54179g = R.style.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final k f54180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    private int f54182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54184f;

    public MaterialDivider(@n0 Context context) {
        this(context, null);
    }

    public MaterialDivider(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f54179g;
        super(a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f54180b = new k();
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.C0, i10, i11, new int[0]);
        this.f54181c = typedArrayK.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f54183e = typedArrayK.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.f54184f = typedArrayK.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(c.a(context2, typedArrayK, R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayK.recycle();
    }

    public int getDividerColor() {
        return this.f54182d;
    }

    @t0
    public int getDividerInsetEnd() {
        return this.f54184f;
    }

    @t0
    public int getDividerInsetStart() {
        return this.f54183e;
    }

    public int getDividerThickness() {
        return this.f54181c;
    }

    @Override // android.view.View
    protected void onDraw(@n0 Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = j1.Z(this) == 1;
        int i11 = z10 ? this.f54184f : this.f54183e;
        if (z10) {
            width = getWidth();
            i10 = this.f54183e;
        } else {
            width = getWidth();
            i10 = this.f54184f;
        }
        this.f54180b.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f54180b.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f54181c;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@l int i10) {
        if (this.f54182d != i10) {
            this.f54182d = i10;
            this.f54180b.o0(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(@n int i10) {
        setDividerColor(d.f(getContext(), i10));
    }

    public void setDividerInsetEnd(@t0 int i10) {
        this.f54184f = i10;
    }

    public void setDividerInsetEndResource(@q int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(@t0 int i10) {
        this.f54183e = i10;
    }

    public void setDividerInsetStartResource(@q int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(@t0 int i10) {
        if (this.f54181c != i10) {
            this.f54181c = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@q int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }
}
