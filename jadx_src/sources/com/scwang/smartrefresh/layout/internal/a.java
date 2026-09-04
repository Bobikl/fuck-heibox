package com.scwang.smartrefresh.layout.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.annotation.n0;

/* JADX INFO: compiled from: ArrowDrawable.java */
/* JADX INFO: loaded from: classes8.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f96783c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96784d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Path f96785e = new Path();

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (this.f96783c != iWidth || this.f96784d != iHeight) {
            int i10 = (iWidth * 30) / bb.c.b.f30897r1;
            this.f96785e.reset();
            float f10 = i10;
            float f11 = f10 * 0.70710677f;
            float f12 = f10 / 0.70710677f;
            float f13 = iWidth;
            float f14 = f13 / 2.0f;
            float f15 = iHeight;
            this.f96785e.moveTo(f14, f15);
            float f16 = f15 / 2.0f;
            this.f96785e.lineTo(0.0f, f16);
            float f17 = f16 - f11;
            this.f96785e.lineTo(f11, f17);
            float f18 = f10 / 2.0f;
            float f19 = f14 - f18;
            float f20 = (f15 - f12) - f18;
            this.f96785e.lineTo(f19, f20);
            this.f96785e.lineTo(f19, 0.0f);
            float f21 = f14 + f18;
            this.f96785e.lineTo(f21, 0.0f);
            this.f96785e.lineTo(f21, f20);
            this.f96785e.lineTo(f13 - f11, f17);
            this.f96785e.lineTo(f13, f16);
            this.f96785e.close();
            this.f96783c = iWidth;
            this.f96784d = iHeight;
        }
        canvas.drawPath(this.f96785e, this.f96786b);
    }
}
