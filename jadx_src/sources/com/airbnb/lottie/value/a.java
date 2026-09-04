package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.p0;
import androidx.annotation.x;

/* JADX INFO: compiled from: Keyframe.java */
/* JADX INFO: loaded from: classes6.dex */
public class a<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f37851q = -3987645.8f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f37852r = 784923401;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.g f37853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final T f37854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public T f37855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final Interpolator f37856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final Interpolator f37857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final Interpolator f37858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f37859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    public Float f37860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f37861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f37862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f37863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f37864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f37865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f37866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f37867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f37868p;

    public a(com.airbnb.lottie.g gVar, @p0 T t10, @p0 T t11, @p0 Interpolator interpolator, float f10, @p0 Float f11) {
        this.f37861i = f37851q;
        this.f37862j = f37851q;
        this.f37863k = f37852r;
        this.f37864l = f37852r;
        this.f37865m = Float.MIN_VALUE;
        this.f37866n = Float.MIN_VALUE;
        this.f37867o = null;
        this.f37868p = null;
        this.f37853a = gVar;
        this.f37854b = t10;
        this.f37855c = t11;
        this.f37856d = interpolator;
        this.f37857e = null;
        this.f37858f = null;
        this.f37859g = f10;
        this.f37860h = f11;
    }

    public a(com.airbnb.lottie.g gVar, @p0 T t10, @p0 T t11, @p0 Interpolator interpolator, @p0 Interpolator interpolator2, float f10, @p0 Float f11) {
        this.f37861i = f37851q;
        this.f37862j = f37851q;
        this.f37863k = f37852r;
        this.f37864l = f37852r;
        this.f37865m = Float.MIN_VALUE;
        this.f37866n = Float.MIN_VALUE;
        this.f37867o = null;
        this.f37868p = null;
        this.f37853a = gVar;
        this.f37854b = t10;
        this.f37855c = t11;
        this.f37856d = null;
        this.f37857e = interpolator;
        this.f37858f = interpolator2;
        this.f37859g = f10;
        this.f37860h = f11;
    }

    protected a(com.airbnb.lottie.g gVar, @p0 T t10, @p0 T t11, @p0 Interpolator interpolator, @p0 Interpolator interpolator2, @p0 Interpolator interpolator3, float f10, @p0 Float f11) {
        this.f37861i = f37851q;
        this.f37862j = f37851q;
        this.f37863k = f37852r;
        this.f37864l = f37852r;
        this.f37865m = Float.MIN_VALUE;
        this.f37866n = Float.MIN_VALUE;
        this.f37867o = null;
        this.f37868p = null;
        this.f37853a = gVar;
        this.f37854b = t10;
        this.f37855c = t11;
        this.f37856d = interpolator;
        this.f37857e = interpolator2;
        this.f37858f = interpolator3;
        this.f37859g = f10;
        this.f37860h = f11;
    }

    public a(T t10) {
        this.f37861i = f37851q;
        this.f37862j = f37851q;
        this.f37863k = f37852r;
        this.f37864l = f37852r;
        this.f37865m = Float.MIN_VALUE;
        this.f37866n = Float.MIN_VALUE;
        this.f37867o = null;
        this.f37868p = null;
        this.f37853a = null;
        this.f37854b = t10;
        this.f37855c = t10;
        this.f37856d = null;
        this.f37857e = null;
        this.f37858f = null;
        this.f37859g = Float.MIN_VALUE;
        this.f37860h = Float.valueOf(Float.MAX_VALUE);
    }

    public boolean a(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        return f10 >= e() && f10 < b();
    }

    public float b() {
        if (this.f37853a == null) {
            return 1.0f;
        }
        if (this.f37866n == Float.MIN_VALUE) {
            if (this.f37860h == null) {
                this.f37866n = 1.0f;
            } else {
                this.f37866n = e() + ((this.f37860h.floatValue() - this.f37859g) / this.f37853a.e());
            }
        }
        return this.f37866n;
    }

    public float c() {
        if (this.f37862j == f37851q) {
            this.f37862j = ((Float) this.f37855c).floatValue();
        }
        return this.f37862j;
    }

    public int d() {
        if (this.f37864l == f37852r) {
            this.f37864l = ((Integer) this.f37855c).intValue();
        }
        return this.f37864l;
    }

    public float e() {
        com.airbnb.lottie.g gVar = this.f37853a;
        if (gVar == null) {
            return 0.0f;
        }
        if (this.f37865m == Float.MIN_VALUE) {
            this.f37865m = (this.f37859g - gVar.r()) / this.f37853a.e();
        }
        return this.f37865m;
    }

    public float f() {
        if (this.f37861i == f37851q) {
            this.f37861i = ((Float) this.f37854b).floatValue();
        }
        return this.f37861i;
    }

    public int g() {
        if (this.f37863k == f37852r) {
            this.f37863k = ((Integer) this.f37854b).intValue();
        }
        return this.f37863k;
    }

    public boolean h() {
        return this.f37856d == null && this.f37857e == null && this.f37858f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f37854b + ", endValue=" + this.f37855c + ", startFrame=" + this.f37859g + ", endFrame=" + this.f37860h + ", interpolator=" + this.f37856d + '}';
    }
}
