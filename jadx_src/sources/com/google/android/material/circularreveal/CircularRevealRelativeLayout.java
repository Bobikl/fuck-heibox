package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes7.dex */
public class CircularRevealRelativeLayout extends RelativeLayout implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final b f53618b;

    public CircularRevealRelativeLayout(Context context) {
        this(context, null);
    }

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53618b = new b(this);
    }

    @Override // com.google.android.material.circularreveal.c
    public void a() {
        this.f53618b.b();
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
        this.f53618b.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public void draw(@n0 Canvas canvas) {
        b bVar = this.f53618b;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.c
    @p0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f53618b.g();
    }

    @Override // com.google.android.material.circularreveal.c
    public int getCircularRevealScrimColor() {
        return this.f53618b.h();
    }

    @Override // com.google.android.material.circularreveal.c
    @p0
    public c.e getRevealInfo() {
        return this.f53618b.j();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public boolean isOpaque() {
        b bVar = this.f53618b;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealOverlayDrawable(@p0 Drawable drawable) {
        this.f53618b.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealScrimColor(@l int i10) {
        this.f53618b.n(i10);
    }

    @Override // com.google.android.material.circularreveal.c
    public void setRevealInfo(@p0 c.e eVar) {
        this.f53618b.o(eVar);
    }
}
