package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import com.google.android.material.R;
import com.google.android.material.color.m;
import com.google.android.material.internal.c0;

/* JADX INFO: compiled from: BaseProgressIndicatorSpec.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @t0
    public int f54740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @t0
    public int f54741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public int[] f54742c = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.l
    public int f54743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54745f;

    protected b(@n0 Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @e1 int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray typedArrayK = c0.k(context, attributeSet, R.styleable.f52878u, i10, i11, new int[0]);
        this.f54740a = com.google.android.material.resources.c.d(context, typedArrayK, R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f54741b = Math.min(com.google.android.material.resources.c.d(context, typedArrayK, R.styleable.BaseProgressIndicator_trackCornerRadius, 0), this.f54740a / 2);
        this.f54744e = typedArrayK.getInt(R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f54745f = typedArrayK.getInt(R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        c(context, typedArrayK);
        d(context, typedArrayK);
        typedArrayK.recycle();
    }

    private void c(@n0 Context context, @n0 TypedArray typedArray) {
        int i10 = R.styleable.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i10)) {
            this.f54742c = new int[]{m.b(context, R.attr.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(i10).type != 1) {
            this.f54742c = new int[]{typedArray.getColor(i10, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i10, -1));
        this.f54742c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(@n0 Context context, @n0 TypedArray typedArray) {
        int i10 = R.styleable.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i10)) {
            this.f54743d = typedArray.getColor(i10, -1);
            return;
        }
        this.f54743d = this.f54742c[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
        float f10 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f54743d = m.a(this.f54743d, (int) (f10 * 255.0f));
    }

    public boolean a() {
        return this.f54745f != 0;
    }

    public boolean b() {
        return this.f54744e != 0;
    }

    abstract void e();
}
