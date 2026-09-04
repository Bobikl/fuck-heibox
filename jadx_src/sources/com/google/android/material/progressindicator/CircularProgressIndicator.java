package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int A = 0;
    public static final int B = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f54731z = R.style.Widget_MaterialComponents_CircularProgressIndicator;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    public CircularProgressIndicator(@n0 Context context) {
        this(context, null);
    }

    public CircularProgressIndicator(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@n0 Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        super(context, attributeSet, i10, f54731z);
        t();
    }

    private void t() {
        setIndeterminateDrawable(i.x(getContext(), (CircularProgressIndicatorSpec) this.f54713b));
        setProgressDrawable(e.A(getContext(), (CircularProgressIndicatorSpec) this.f54713b));
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f54713b).f54734i;
    }

    @t0
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f54713b).f54733h;
    }

    @t0
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f54713b).f54732g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public CircularProgressIndicatorSpec i(@n0 Context context, @n0 AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndicatorDirection(int i10) {
        ((CircularProgressIndicatorSpec) this.f54713b).f54734i = i10;
        invalidate();
    }

    public void setIndicatorInset(@t0 int i10) {
        S s10 = this.f54713b;
        if (((CircularProgressIndicatorSpec) s10).f54733h != i10) {
            ((CircularProgressIndicatorSpec) s10).f54733h = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(@t0 int i10) {
        int iMax = Math.max(i10, getTrackThickness() * 2);
        S s10 = this.f54713b;
        if (((CircularProgressIndicatorSpec) s10).f54732g != iMax) {
            ((CircularProgressIndicatorSpec) s10).f54732g = iMax;
            ((CircularProgressIndicatorSpec) s10).e();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((CircularProgressIndicatorSpec) this.f54713b).e();
    }
}
