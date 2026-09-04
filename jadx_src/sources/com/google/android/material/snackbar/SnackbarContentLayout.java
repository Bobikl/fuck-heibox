package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.color.m;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f55401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Button f55402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f55403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55404e;

    public SnackbarContentLayout(@n0 Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55403d = i9.a.g(context, R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.f52897b);
    }

    private static void d(@n0 View view, int i10, int i11) {
        if (j1.Y0(view)) {
            j1.d2(view, j1.k0(view), i10, j1.j0(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f55401b.getPaddingTop() == i11 && this.f55401b.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f55401b, i11, i12);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i10, int i11) {
        this.f55401b.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f55401b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f55403d).setStartDelay(j11).start();
        if (this.f55402c.getVisibility() == 0) {
            this.f55402c.setAlpha(0.0f);
            this.f55402c.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f55403d).setStartDelay(j11).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i10, int i11) {
        this.f55401b.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f55401b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f55403d).setStartDelay(j11).start();
        if (this.f55402c.getVisibility() == 0) {
            this.f55402c.setAlpha(1.0f);
            this.f55402c.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f55403d).setStartDelay(j11).start();
        }
    }

    void c(float f10) {
        if (f10 != 1.0f) {
            this.f55402c.setTextColor(m.o(m.d(this, R.attr.colorSurface), this.f55402c.getCurrentTextColor(), f10));
        }
    }

    public Button getActionView() {
        return this.f55402c;
    }

    public TextView getMessageView() {
        return this.f55401b;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f55401b = (TextView) findViewById(R.id.snackbar_text);
        this.f55402c = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean z10 = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f55401b.getLayout();
        boolean z11 = layout != null && layout.getLineCount() > 1;
        if (!z11 || this.f55404e <= 0 || this.f55402c.getMeasuredWidth() <= this.f55404e) {
            if (!z11) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                z10 = false;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            z10 = false;
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f55404e = i10;
    }
}
