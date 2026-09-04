package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.n0;
import androidx.annotation.x;
import com.google.android.material.progressindicator.b;

/* JADX INFO: compiled from: DrawingDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g<S extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    S f54801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected f f54802b;

    public g(S s10) {
        this.f54801a = s10;
    }

    abstract void a(@n0 Canvas canvas, @n0 Rect rect, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10);

    abstract void b(@n0 Canvas canvas, @n0 Paint paint, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11, @androidx.annotation.l int i10);

    abstract void c(@n0 Canvas canvas, @n0 Paint paint);

    abstract int d();

    abstract int e();

    protected void f(@n0 f fVar) {
        this.f54802b = fVar;
    }

    void g(@n0 Canvas canvas, @n0 Rect rect, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f54801a.e();
        a(canvas, rect, f10);
    }
}
