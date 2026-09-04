package com.huawei.hms.scankit.p;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: ParticleEffect.java */
/* JADX INFO: loaded from: classes7.dex */
public class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f62593a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f62594b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f62598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f62599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b6 f62600h;

    public y5(@androidx.annotation.n0 b6 b6Var, Rect rect, int i10, float f10, int[] iArr) {
        this.f62595c = 0;
        this.f62596d = 0;
        this.f62600h = b6Var;
        this.f62599g = rect;
        this.f62597e = i10;
        if (iArr != null && iArr.length >= 2) {
            this.f62595c = iArr[0];
            this.f62596d = iArr[1];
        }
        this.f62598f = f10;
        c();
    }

    private void a() {
        b6 b6Var = this.f62600h;
        if (b6Var != null) {
            b6Var.a();
        }
    }

    private void a(Canvas canvas, Rect rect, List<w5> list) {
        for (w5 w5Var : list) {
            Paint paint = new Paint();
            if (w5Var.b() == 0) {
                w5Var.b(b());
            }
            paint.setColor(w5Var.b());
            boolean z10 = w5Var.d() > ((float) Math.max(rect.top, rect.bottom)) || w5Var.d() < ((float) Math.min(rect.top, rect.bottom));
            float fD = 0.0f;
            if (rect.height() != 0 && rect.width() != 0 && !z10) {
                fD = (rect.bottom - w5Var.d()) / rect.height();
            }
            int iA = (int) (w5Var.a() * Math.abs(fD));
            if (iA > 0) {
                paint.setAlpha(iA);
                canvas.drawCircle(w5Var.c(), w5Var.d(), w5Var.f() * this.f62598f, paint);
            }
        }
    }

    private int b() {
        float fA = n6.a(1.0f);
        int iRed = Color.red(this.f62595c);
        int iBlue = Color.blue(this.f62595c);
        int iGreen = Color.green(this.f62595c);
        return Color.rgb((int) (iRed + ((Color.red(this.f62596d) - iRed) * fA) + 0.5f), (int) (iGreen + ((Color.green(this.f62596d) - iGreen) * fA) + 0.5f), (int) (iBlue + ((Color.blue(this.f62596d) - iBlue) * fA) + 0.5f));
    }

    private void c() {
        Rect rect;
        a();
        this.f62594b = 0L;
        this.f62593a = System.currentTimeMillis();
        b6 b6Var = this.f62600h;
        if (b6Var == null || (rect = this.f62599g) == null) {
            return;
        }
        b6Var.a(rect, this.f62597e);
    }

    public void a(@androidx.annotation.n0 Canvas canvas, @androidx.annotation.n0 Rect rect) {
        if (this.f62600h == null || canvas == null || rect == null) {
            return;
        }
        long jCurrentTimeMillis = this.f62594b + (System.currentTimeMillis() - this.f62593a);
        this.f62594b = jCurrentTimeMillis;
        this.f62600h.b(jCurrentTimeMillis);
        List<w5> listC = this.f62600h.c();
        if (listC == null || listC.isEmpty()) {
            return;
        }
        a(canvas, rect, listC);
        this.f62593a = System.currentTimeMillis();
    }
}
