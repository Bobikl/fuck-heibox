package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;

/* JADX INFO: loaded from: classes7.dex */
public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements c {

    @n0
    private final b G;

    public CircularRevealCoordinatorLayout(@n0 Context context) {
        this(context, null);
    }

    public CircularRevealCoordinatorLayout(@n0 Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = new b(this);
    }

    @Override // com.google.android.material.circularreveal.c
    public void a() {
        this.G.b();
    }

    @Override // com.google.android.material.circularreveal.b.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.b.a
    public boolean c() {
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void d() {
        this.G.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public void draw(Canvas canvas) {
        b bVar = this.G;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.c
    @p0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.G.g();
    }

    @Override // com.google.android.material.circularreveal.c
    public int getCircularRevealScrimColor() {
        return this.G.h();
    }

    @Override // com.google.android.material.circularreveal.c
    @p0
    public c.e getRevealInfo() {
        return this.G.j();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public boolean isOpaque() {
        b bVar = this.G;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealOverlayDrawable(@p0 Drawable drawable) {
        this.G.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealScrimColor(@l int i10) {
        this.G.n(i10);
    }

    @Override // com.google.android.material.circularreveal.c
    public void setRevealInfo(@p0 c.e eVar) {
        this.G.o(eVar);
    }
}
