package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {

    @p0
    private Drawable C;
    private final Rect D;
    private final Rect E;
    private int F;
    protected boolean G;
    boolean H;

    public ForegroundLinearLayout(@n0 Context context) {
        this(context, null);
    }

    public ForegroundLinearLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.D = new Rect();
        this.E = new Rect();
        this.F = 119;
        this.G = true;
        this.H = false;
        TypedArray typedArrayK = c0.k(context, attributeSet, R.styleable.f52822b0, i10, 0, new int[0]);
        this.F = typedArrayK.getInt(R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.F);
        Drawable drawable = typedArrayK.getDrawable(R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.G = typedArrayK.getBoolean(R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayK.recycle();
    }

    @Override // android.view.View
    public void draw(@n0 Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.C;
        if (drawable != null) {
            if (this.H) {
                this.H = false;
                Rect rect = this.D;
                Rect rect2 = this.E;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.G) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.F, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @w0(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.C;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.C.setState(getDrawableState());
    }

    @Override // android.view.View
    @p0
    public Drawable getForeground() {
        return this.C;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.H = z10 | this.H;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.H = true;
    }

    @Override // android.view.View
    public void setForeground(@p0 Drawable drawable) {
        Drawable drawable2 = this.C;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.C);
            }
            this.C = drawable;
            this.H = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.F == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.F != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= androidx.core.view.n.f21701b;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.F = i10;
            if (i10 == 119 && this.C != null) {
                this.C.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.C;
    }
}
