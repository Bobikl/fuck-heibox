package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    Drawable f54381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Rect f54382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f54383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f54384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f54385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f54386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f54387h;

    public class a implements z0 {
        a() {
        }

        @Override // androidx.core.view.z0
        public n3 a(View view, @n0 n3 n3Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f54382c == null) {
                scrimInsetsFrameLayout.f54382c = new Rect();
            }
            ScrimInsetsFrameLayout.this.f54382c.set(n3Var.p(), n3Var.r(), n3Var.q(), n3Var.o());
            ScrimInsetsFrameLayout.this.a(n3Var);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!n3Var.w() || ScrimInsetsFrameLayout.this.f54381b == null);
            j1.n1(ScrimInsetsFrameLayout.this);
            return n3Var.c();
        }
    }

    public ScrimInsetsFrameLayout(@n0 Context context) {
        this(context, null);
    }

    public ScrimInsetsFrameLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f54383d = new Rect();
        this.f54384e = true;
        this.f54385f = true;
        this.f54386g = true;
        this.f54387h = true;
        TypedArray typedArrayK = c0.k(context, attributeSet, R.styleable.f52838g1, i10, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f54381b = typedArrayK.getDrawable(R.styleable.ScrimInsetsFrameLayout_insetForeground);
        typedArrayK.recycle();
        setWillNotDraw(true);
        j1.a2(this, new a());
    }

    protected void a(n3 n3Var) {
    }

    @Override // android.view.View
    public void draw(@n0 Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f54382c == null || this.f54381b == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f54384e) {
            this.f54383d.set(0, 0, width, this.f54382c.top);
            this.f54381b.setBounds(this.f54383d);
            this.f54381b.draw(canvas);
        }
        if (this.f54385f) {
            this.f54383d.set(0, height - this.f54382c.bottom, width, height);
            this.f54381b.setBounds(this.f54383d);
            this.f54381b.draw(canvas);
        }
        if (this.f54386g) {
            Rect rect = this.f54383d;
            Rect rect2 = this.f54382c;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f54381b.setBounds(this.f54383d);
            this.f54381b.draw(canvas);
        }
        if (this.f54387h) {
            Rect rect3 = this.f54383d;
            Rect rect4 = this.f54382c;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f54381b.setBounds(this.f54383d);
            this.f54381b.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f54381b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f54381b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f54385f = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f54386g = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f54387h = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f54384e = z10;
    }

    public void setScrimInsetForeground(@p0 Drawable drawable) {
        this.f54381b = drawable;
    }
}
