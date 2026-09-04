package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import com.google.android.material.R;
import com.google.android.material.internal.c0;

/* JADX INFO: loaded from: classes7.dex */
public final class CircularProgressIndicatorSpec extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @t0
    public int f54732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @t0
    public int f54733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54734i;

    public CircularProgressIndicatorSpec(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(@n0 Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.f54731z);
    }

    public CircularProgressIndicatorSpec(@n0 Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @e1 int i11) {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayK = c0.k(context, attributeSet, R.styleable.E, i10, i11, new int[0]);
        this.f54732g = Math.max(com.google.android.material.resources.c.d(context, typedArrayK, R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f54740a * 2);
        this.f54733h = com.google.android.material.resources.c.d(context, typedArrayK, R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f54734i = typedArrayK.getInt(R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArrayK.recycle();
        e();
    }

    @Override // com.google.android.material.progressindicator.b
    void e() {
    }
}
