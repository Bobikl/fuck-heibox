package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;

/* JADX INFO: loaded from: classes7.dex */
public class CircularRevealCardView extends MaterialCardView implements c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @n0
    private final b f53643z;

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53643z = new b(this);
    }

    @Override // com.google.android.material.circularreveal.c
    public void a() {
        this.f53643z.b();
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
        this.f53643z.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public void draw(Canvas canvas) {
        b bVar = this.f53643z;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.c
    @p0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f53643z.g();
    }

    @Override // com.google.android.material.circularreveal.c
    public int getCircularRevealScrimColor() {
        return this.f53643z.h();
    }

    @Override // com.google.android.material.circularreveal.c
    @p0
    public c.e getRevealInfo() {
        return this.f53643z.j();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public boolean isOpaque() {
        b bVar = this.f53643z;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealOverlayDrawable(@p0 Drawable drawable) {
        this.f53643z.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealScrimColor(@l int i10) {
        this.f53643z.n(i10);
    }

    @Override // com.google.android.material.circularreveal.c
    public void setRevealInfo(@p0 c.e eVar) {
        this.f53643z.o(eVar);
    }
}
