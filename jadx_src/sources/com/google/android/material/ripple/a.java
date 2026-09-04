package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.graphics.drawable.p;
import com.google.android.material.shape.k;
import com.google.android.material.shape.t;

/* JADX INFO: compiled from: RippleDrawableCompat.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a extends Drawable implements t, p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f54873b;

    /* JADX INFO: compiled from: RippleDrawableCompat.java */
    public static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        k f54874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f54875b;

        public b(@n0 b bVar) {
            this.f54874a = (k) bVar.f54874a.getConstantState().newDrawable();
            this.f54875b = bVar.f54875b;
        }

        public b(k kVar) {
            this.f54874a = kVar;
            this.f54875b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    private a(b bVar) {
        this.f54873b = bVar;
    }

    public a(com.google.android.material.shape.p pVar) {
        this(new b(new k(pVar)));
    }

    @Override // android.graphics.drawable.Drawable
    @n0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f54873b = new b(this.f54873b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f54873b;
        if (bVar.f54875b) {
            bVar.f54874a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @p0
    public Drawable.ConstantState getConstantState() {
        return this.f54873b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f54873b.f54874a.getOpacity();
    }

    @Override // com.google.android.material.shape.t
    @n0
    public com.google.android.material.shape.p getShapeAppearanceModel() {
        return this.f54873b.f54874a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@n0 Rect rect) {
        super.onBoundsChange(rect);
        this.f54873b.f54874a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@n0 int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f54873b.f54874a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zF = com.google.android.material.ripple.b.f(iArr);
        b bVar = this.f54873b;
        if (bVar.f54875b == zF) {
            return zOnStateChange;
        }
        bVar.f54875b = zF;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f54873b.f54874a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        this.f54873b.f54874a.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@n0 com.google.android.material.shape.p pVar) {
        this.f54873b.f54874a.setShapeAppearanceModel(pVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(@l int i10) {
        this.f54873b.f54874a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(@p0 ColorStateList colorStateList) {
        this.f54873b.f54874a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(@p0 PorterDuff.Mode mode) {
        this.f54873b.f54874a.setTintMode(mode);
    }
}
