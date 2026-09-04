package com.max.hbcustomview.tickerview;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TickerColumn.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b[] f69640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f69641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private char f69642c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private char f69643d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private char[] f69644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f69648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f69649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f69650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f69651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f69652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f69653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f69654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f69655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f69656q;

    c(b[] bVarArr, e eVar) {
        this.f69640a = bVarArr;
        this.f69641b = eVar;
    }

    private void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.iu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        float fC = this.f69641b.c(this.f69643d);
        float f10 = this.f69651l;
        float f11 = this.f69652m;
        if (f10 != f11 || f11 == fC) {
            return;
        }
        this.f69652m = fC;
        this.f69651l = fC;
        this.f69653n = fC;
    }

    private boolean c(Canvas canvas, Paint paint, char[] cArr, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{canvas, paint, cArr, new Integer(i10), new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.lu, new Class[]{Canvas.class, Paint.class, char[].class, Integer.TYPE, Float.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (i10 < 0 || i10 >= cArr.length) {
            return false;
        }
        canvas.drawText(cArr, i10, 1, 0.0f, f10, paint);
        return true;
    }

    private void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.gu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69644e = null;
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f69640a;
            if (i10 >= bVarArr.length) {
                break;
            }
            b.C0563b c0563bA = bVarArr[i10].a(this.f69642c, this.f69643d, this.f69641b.d());
            if (c0563bA != null) {
                this.f69644e = this.f69640a[i10].b();
                this.f69645f = c0563bA.f69637a;
                this.f69646g = c0563bA.f69638b;
            }
            i10++;
        }
        if (this.f69644e == null) {
            char c10 = this.f69642c;
            char c11 = this.f69643d;
            if (c10 == c11) {
                this.f69644e = new char[]{c10};
                this.f69646g = 0;
                this.f69645f = 0;
            } else {
                this.f69644e = new char[]{c10, c11};
                this.f69645f = 0;
                this.f69646g = 1;
            }
        }
    }

    void b(Canvas canvas, Paint paint) {
        if (PatchProxy.proxy(new Object[]{canvas, paint}, this, changeQuickRedirect, false, bb.c.f.ku, new Class[]{Canvas.class, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        if (c(canvas, paint, this.f69644e, this.f69647h, this.f69648i)) {
            int i10 = this.f69647h;
            if (i10 >= 0) {
                this.f69642c = this.f69644e[i10];
            }
            this.f69654o = this.f69648i;
        }
        c(canvas, paint, this.f69644e, this.f69647h + 1, this.f69648i - this.f69649j);
        c(canvas, paint, this.f69644e, this.f69647h - 1, this.f69648i + this.f69649j);
    }

    char d() {
        return this.f69642c;
    }

    float e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.eu, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        a();
        return this.f69651l;
    }

    float f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.fu, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        a();
        return this.f69653n;
    }

    char g() {
        return this.f69643d;
    }

    void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.hu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a();
        this.f69653n = this.f69651l;
    }

    void i(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.ju, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 == 1.0f) {
            this.f69642c = this.f69643d;
            this.f69654o = 0.0f;
            this.f69655p = 0.0f;
        }
        float fB = this.f69641b.b();
        float fAbs = ((Math.abs(this.f69646g - this.f69645f) * fB) * f10) / fB;
        int i10 = (int) fAbs;
        float f11 = this.f69655p * (1.0f - f10);
        int i11 = this.f69656q;
        this.f69648i = ((fAbs - i10) * fB * i11) + f11;
        this.f69647h = this.f69645f + (i10 * i11);
        this.f69649j = fB;
        float f12 = this.f69650k;
        this.f69651l = f12 + ((this.f69652m - f12) * f10);
    }

    void k(b[] bVarArr) {
        this.f69640a = bVarArr;
    }

    void l(char c10) {
        if (PatchProxy.proxy(new Object[]{new Character(c10)}, this, changeQuickRedirect, false, 6008, new Class[]{Character.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69643d = c10;
        this.f69650k = this.f69651l;
        float fC = this.f69641b.c(c10);
        this.f69652m = fC;
        this.f69653n = Math.max(this.f69650k, fC);
        j();
        this.f69656q = this.f69646g >= this.f69645f ? 1 : -1;
        this.f69655p = this.f69654o;
        this.f69654o = 0.0f;
    }
}
