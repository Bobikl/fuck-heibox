package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: FadeThroughDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class i extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f54506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f54507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f54508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f54509d;

    public i(@n0 Drawable drawable, @n0 Drawable drawable2) {
        this.f54506a = drawable.getConstantState().newDrawable().mutate();
        Drawable drawableMutate = drawable2.getConstantState().newDrawable().mutate();
        this.f54507b = drawableMutate;
        drawableMutate.setAlpha(0);
        this.f54508c = new float[2];
    }

    public void a(@androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        if (this.f54509d != f10) {
            this.f54509d = f10;
            k.a(f10, this.f54508c);
            this.f54506a.setAlpha((int) (this.f54508c[0] * 255.0f));
            this.f54507b.setAlpha((int) (this.f54508c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        this.f54506a.draw(canvas);
        this.f54507b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f54506a.getIntrinsicHeight(), this.f54507b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f54506a.getIntrinsicWidth(), this.f54507b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f54506a.getMinimumHeight(), this.f54507b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f54506a.getMinimumWidth(), this.f54507b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f54506a.isStateful() || this.f54507b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f54509d <= 0.5f) {
            this.f54506a.setAlpha(i10);
            this.f54507b.setAlpha(0);
        } else {
            this.f54506a.setAlpha(0);
            this.f54507b.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f54506a.setBounds(i10, i11, i12, i13);
        this.f54507b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        this.f54506a.setColorFilter(colorFilter);
        this.f54507b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f54506a.setState(iArr) || this.f54507b.setState(iArr);
    }
}
