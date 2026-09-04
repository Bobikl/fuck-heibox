package com.huawei.hms.scankit.p;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: Particle.java */
/* JADX INFO: loaded from: classes7.dex */
public class w5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f62519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f62520c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f62525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f62526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f62527j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f62529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f62530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f62531n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f62532o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f62533p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private f4 f62535r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f62518a = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62521d = 255;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f62522e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f62523f = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f62534q = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f62528k = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f62524g = 255;

    public w5(Bitmap bitmap) {
        if (bitmap != null) {
            this.f62531n = bitmap.getWidth() / 2;
            this.f62532o = bitmap.getHeight() / 2;
        }
    }

    public int a() {
        return this.f62524g;
    }

    public void a(float f10) {
        this.f62518a = f10;
    }

    public void a(int i10) {
        this.f62524g = i10;
    }

    public void a(long j10, float f10, float f11, long j11, @androidx.annotation.n0 f4 f4Var) {
        float f12 = f10 - this.f62531n;
        this.f62529l = f12;
        float f13 = f11 - this.f62532o;
        this.f62530m = f13;
        this.f62526i = f12;
        this.f62527j = f13;
        this.f62533p = j10;
        this.f62525h = j11;
        this.f62535r = f4Var;
    }

    public boolean a(long j10) {
        long j11 = j10 - this.f62525h;
        if (j11 > this.f62533p) {
            return false;
        }
        float f10 = j11;
        float f11 = j11 * j11;
        this.f62526i = this.f62529l + (this.f62522e * f10) + (this.f62519b * f11);
        this.f62527j = this.f62530m + (this.f62523f * f10) + (this.f62520c * f11);
        this.f62535r.a(this, j11);
        return true;
    }

    public int b() {
        return this.f62534q;
    }

    public void b(float f10) {
        this.f62528k = f10;
    }

    public void b(int i10) {
        this.f62534q = i10;
    }

    public float c() {
        return this.f62526i;
    }

    public float d() {
        return this.f62527j;
    }

    public int e() {
        return this.f62521d;
    }

    public float f() {
        return this.f62528k;
    }
}
