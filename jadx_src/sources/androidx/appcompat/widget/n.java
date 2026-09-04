package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R;
import androidx.core.view.j1;

/* JADX INFO: compiled from: AppCompatSeekBarHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class n extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f2853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f2854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f2855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f2856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2858i;

    n(SeekBar seekBar) {
        super(seekBar);
        this.f2855f = null;
        this.f2856g = null;
        this.f2857h = false;
        this.f2858i = false;
        this.f2853d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f2854e;
        if (drawable != null) {
            if (this.f2857h || this.f2858i) {
                Drawable drawableR = androidx.core.graphics.drawable.d.r(drawable.mutate());
                this.f2854e = drawableR;
                if (this.f2857h) {
                    androidx.core.graphics.drawable.d.o(drawableR, this.f2855f);
                }
                if (this.f2858i) {
                    androidx.core.graphics.drawable.d.p(this.f2854e, this.f2856g);
                }
                if (this.f2854e.isStateful()) {
                    this.f2854e.setState(this.f2853d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.k
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f2853d.getContext();
        int[] iArr = R.styleable.f1577j;
        x0 x0VarG = x0.G(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f2853d;
        j1.z1(seekBar, seekBar.getContext(), iArr, attributeSet, x0VarG.B(), i10, 0);
        Drawable drawableI = x0VarG.i(R.styleable.AppCompatSeekBar_android_thumb);
        if (drawableI != null) {
            this.f2853d.setThumb(drawableI);
        }
        m(x0VarG.h(R.styleable.AppCompatSeekBar_tickMark));
        int i11 = R.styleable.AppCompatSeekBar_tickMarkTintMode;
        if (x0VarG.C(i11)) {
            this.f2856g = b0.e(x0VarG.o(i11, -1), this.f2856g);
            this.f2858i = true;
        }
        int i12 = R.styleable.AppCompatSeekBar_tickMarkTint;
        if (x0VarG.C(i12)) {
            this.f2855f = x0VarG.d(i12);
            this.f2857h = true;
        }
        x0VarG.I();
        f();
    }

    void g(Canvas canvas) {
        if (this.f2854e != null) {
            int max = this.f2853d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2854e.getIntrinsicWidth();
                int intrinsicHeight = this.f2854e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2854e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f2853d.getWidth() - this.f2853d.getPaddingLeft()) - this.f2853d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f2853d.getPaddingLeft(), this.f2853d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f2854e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f2854e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f2853d.getDrawableState())) {
            this.f2853d.invalidateDrawable(drawable);
        }
    }

    @androidx.annotation.p0
    Drawable i() {
        return this.f2854e;
    }

    @androidx.annotation.p0
    ColorStateList j() {
        return this.f2855f;
    }

    @androidx.annotation.p0
    PorterDuff.Mode k() {
        return this.f2856g;
    }

    void l() {
        Drawable drawable = this.f2854e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void m(@androidx.annotation.p0 Drawable drawable) {
        Drawable drawable2 = this.f2854e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2854e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f2853d);
            androidx.core.graphics.drawable.d.m(drawable, j1.Z(this.f2853d));
            if (drawable.isStateful()) {
                drawable.setState(this.f2853d.getDrawableState());
            }
            f();
        }
        this.f2853d.invalidate();
    }

    void n(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f2855f = colorStateList;
        this.f2857h = true;
        f();
    }

    void o(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f2856g = mode;
        this.f2858i = true;
        f();
    }
}
