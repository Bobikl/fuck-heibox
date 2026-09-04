package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: WrappedDrawableApi14.java */
/* JADX INFO: loaded from: classes.dex */
public class r extends Drawable implements Drawable.Callback, q, p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final PorterDuff.Mode f20694h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f20696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    t f20698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f20700g;

    r(@p0 Drawable drawable) {
        this.f20698e = d();
        a(drawable);
    }

    r(@n0 t tVar, @p0 Resources resources) {
        this.f20698e = tVar;
        e(resources);
    }

    @n0
    private t d() {
        return new t(this.f20698e);
    }

    private void e(@p0 Resources resources) {
        Drawable.ConstantState constantState;
        t tVar = this.f20698e;
        if (tVar == null || (constantState = tVar.f20704b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        t tVar = this.f20698e;
        ColorStateList colorStateList = tVar.f20705c;
        PorterDuff.Mode mode = tVar.f20706d;
        if (colorStateList == null || mode == null) {
            this.f20697d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f20697d || colorForState != this.f20695b || mode != this.f20696c) {
                setColorFilter(colorForState, mode);
                this.f20695b = colorForState;
                this.f20696c = mode;
                this.f20697d = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.q
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f20700g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f20700g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            t tVar = this.f20698e;
            if (tVar != null) {
                tVar.f20704b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.q
    public final Drawable b() {
        return this.f20700g;
    }

    protected boolean c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        this.f20700g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        t tVar = this.f20698e;
        return changingConfigurations | (tVar != null ? tVar.getChangingConfigurations() : 0) | this.f20700g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @p0
    public Drawable.ConstantState getConstantState() {
        t tVar = this.f20698e;
        if (tVar == null || !tVar.a()) {
            return null;
        }
        this.f20698e.f20703a = getChangingConfigurations();
        return this.f20698e;
    }

    @Override // android.graphics.drawable.Drawable
    @n0
    public Drawable getCurrent() {
        return this.f20700g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f20700g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f20700g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @w0(23)
    public int getLayoutDirection() {
        return d.f(this.f20700g);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f20700g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f20700g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f20700g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@n0 Rect rect) {
        return this.f20700g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @n0
    public int[] getState() {
        return this.f20700g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f20700g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@n0 Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @w0(19)
    public boolean isAutoMirrored() {
        return d.h(this.f20700g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        t tVar;
        ColorStateList colorStateList = (!c() || (tVar = this.f20698e) == null) ? null : tVar.f20705c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f20700g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f20700g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @n0
    public Drawable mutate() {
        if (!this.f20699f && super.mutate() == this) {
            this.f20698e = d();
            Drawable drawable = this.f20700g;
            if (drawable != null) {
                drawable.mutate();
            }
            t tVar = this.f20698e;
            if (tVar != null) {
                Drawable drawable2 = this.f20700g;
                tVar.f20704b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f20699f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f20700g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @w0(23)
    public boolean onLayoutDirectionChanged(int i10) {
        return d.m(this.f20700g, i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        return this.f20700g.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f20700g.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    @w0(19)
    public void setAutoMirrored(boolean z10) {
        d.j(this.f20700g, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f20700g.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20700g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f20700g.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f20700g.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@n0 int[] iArr) {
        return f(iArr) || this.f20700g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(ColorStateList colorStateList) {
        this.f20698e.f20705c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(@n0 PorterDuff.Mode mode) {
        this.f20698e.f20706d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f20700g.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
