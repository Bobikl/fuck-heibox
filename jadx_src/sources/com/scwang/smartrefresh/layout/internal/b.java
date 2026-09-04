package com.scwang.smartrefresh.layout.internal;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PaintDrawable.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Paint f96786b;

    protected b() {
        Paint paint = new Paint();
        this.f96786b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f96786b.setAntiAlias(true);
        this.f96786b.setColor(-5592406);
    }

    public void a(int i10) {
        this.f96786b.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f96786b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f96786b.setColorFilter(colorFilter);
    }
}
