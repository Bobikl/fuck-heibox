package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;
import com.google.android.material.internal.c0;

/* JADX INFO: loaded from: classes7.dex */
public final class LinearProgressIndicatorSpec extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f54738i;

    public LinearProgressIndicatorSpec(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicatorSpec(@n0 Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        this(context, attributeSet, i10, LinearProgressIndicator.f54735z);
    }

    public LinearProgressIndicatorSpec(@n0 Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @e1 int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayK = c0.k(context, attributeSet, R.styleable.f52867q0, R.attr.linearProgressIndicatorStyle, LinearProgressIndicator.f54735z, new int[0]);
        this.f54736g = typedArrayK.getInt(R.styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f54737h = typedArrayK.getInt(R.styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        typedArrayK.recycle();
        e();
        this.f54738i = this.f54737h == 1;
    }

    @Override // com.google.android.material.progressindicator.b
    void e() {
        if (this.f54736g == 0) {
            if (this.f54741b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.f54742c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
