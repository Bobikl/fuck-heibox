package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.j1;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f54735z = R.style.Widget_MaterialComponents_LinearProgressIndicator;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface b {
    }

    public LinearProgressIndicator(@n0 Context context) {
        this(context, null);
    }

    public LinearProgressIndicator(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@n0 Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        super(context, attributeSet, i10, f54735z);
        t();
    }

    private void t() {
        setIndeterminateDrawable(i.y(getContext(), (LinearProgressIndicatorSpec) this.f54713b));
        setProgressDrawable(e.B(getContext(), (LinearProgressIndicatorSpec) this.f54713b));
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f54713b).f54736g;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f54713b).f54737h;
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S s10 = this.f54713b;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s10;
        boolean z11 = true;
        if (((LinearProgressIndicatorSpec) s10).f54737h != 1 && ((j1.Z(this) != 1 || ((LinearProgressIndicatorSpec) this.f54713b).f54737h != 2) && (j1.Z(this) != 0 || ((LinearProgressIndicatorSpec) this.f54713b).f54737h != 3))) {
            z11 = false;
        }
        linearProgressIndicatorSpec.f54738i = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingLeft = i10 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i11 - (getPaddingTop() + getPaddingBottom());
        i<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        e<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public LinearProgressIndicatorSpec i(@n0 Context context, @n0 AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i10) {
        if (((LinearProgressIndicatorSpec) this.f54713b).f54736g == i10) {
            return;
        }
        if (r() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s10 = this.f54713b;
        ((LinearProgressIndicatorSpec) s10).f54736g = i10;
        ((LinearProgressIndicatorSpec) s10).e();
        if (i10 == 0) {
            getIndeterminateDrawable().B(new k((LinearProgressIndicatorSpec) this.f54713b));
        } else {
            getIndeterminateDrawable().B(new l(getContext(), (LinearProgressIndicatorSpec) this.f54713b));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@n0 int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f54713b).e();
    }

    public void setIndicatorDirection(int i10) {
        S s10 = this.f54713b;
        ((LinearProgressIndicatorSpec) s10).f54737h = i10;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s10;
        boolean z10 = true;
        if (i10 != 1 && ((j1.Z(this) != 1 || ((LinearProgressIndicatorSpec) this.f54713b).f54737h != 2) && (j1.Z(this) != 0 || i10 != 3))) {
            z10 = false;
        }
        linearProgressIndicatorSpec.f54738i = z10;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i10, boolean z10) {
        S s10 = this.f54713b;
        if (s10 != 0 && ((LinearProgressIndicatorSpec) s10).f54736g == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i10, z10);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((LinearProgressIndicatorSpec) this.f54713b).e();
        invalidate();
    }
}
