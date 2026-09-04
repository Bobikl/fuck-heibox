package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: FixedSizeDrawable.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f41907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f41908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f41909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f41910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f41911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41912f;

    /* JADX INFO: compiled from: FixedSizeDrawable.java */
    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f41913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f41914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f41915c;

        a(Drawable.ConstantState constantState, int i10, int i11) {
            this.f41913a = constantState;
            this.f41914b = i10;
            this.f41915c = i11;
        }

        a(a aVar) {
            this(aVar.f41913a, aVar.f41914b, aVar.f41915c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable() {
            return new i(this, this.f41913a.newDrawable());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable(Resources resources) {
            return new i(this, this.f41913a.newDrawable(resources));
        }
    }

    public i(Drawable drawable, int i10, int i11) {
        this(new a(drawable.getConstantState(), i10, i11), drawable);
    }

    i(a aVar, Drawable drawable) {
        this.f41911e = (a) com.bumptech.glide.util.m.e(aVar);
        this.f41910d = (Drawable) com.bumptech.glide.util.m.e(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f41907a = new Matrix();
        this.f41908b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f41909c = new RectF();
    }

    private void a() {
        this.f41907a.setRectToRect(this.f41908b, this.f41909c, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f41910d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        canvas.save();
        canvas.concat(this.f41907a);
        this.f41910d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @w0(19)
    public int getAlpha() {
        return this.f41910d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.f41910d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f41910d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f41911e;
    }

    @Override // android.graphics.drawable.Drawable
    @n0
    public Drawable getCurrent() {
        return this.f41910d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f41911e.f41915c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f41911e.f41914b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f41910d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f41910d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f41910d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@n0 Rect rect) {
        return this.f41910d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f41910d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @n0
    public Drawable mutate() {
        if (!this.f41912f && super.mutate() == this) {
            this.f41910d = this.f41910d.mutate();
            this.f41911e = new a(this.f41911e);
            this.f41912f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@n0 Runnable runnable, long j10) {
        super.scheduleSelf(runnable, j10);
        this.f41910d.scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f41910d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f41909c.set(i10, i11, i12, i13);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@n0 Rect rect) {
        super.setBounds(rect);
        this.f41909c.set(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f41910d.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, @n0 PorterDuff.Mode mode) {
        this.f41910d.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f41910d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z10) {
        this.f41910d.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f41910d.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return this.f41910d.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@n0 Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f41910d.unscheduleSelf(runnable);
    }
}
