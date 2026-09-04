package com.huawei.hms.scankit.p;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ParticleSystem.java */
/* JADX INFO: loaded from: classes7.dex */
public class b6 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f61569r = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f61572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f61573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f61574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f61575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f61576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f61577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f61578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f61579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f61580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f61581l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Path f61583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private PathMeasure f61584o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<w5> f61570a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<w5> f61571b = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f61582m = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private x5 f61585p = new x5();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private z5 f61586q = new z5();

    public b6(int i10, long j10) {
        a(i10, j10);
        a((Bitmap) null);
    }

    private int a(int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        return i10 < i11 ? n6.a(i11 - i10) + i10 : n6.a(i10 - i11) + i11;
    }

    private void a(int i10) {
        synchronized (f61569r) {
            this.f61577h = 0;
        }
        this.f61575f = i10 / 1000.0f;
        this.f61574e = true;
    }

    private void a(int i10, long j10) {
        this.f61576g = new int[2];
        this.f61572c = i10;
        this.f61573d = j10;
    }

    private void a(long j10) {
        PathMeasure pathMeasure;
        w5 w5VarRemove = this.f61570a.remove(0);
        this.f61586q.a(w5VarRemove);
        if (!this.f61582m || (pathMeasure = this.f61584o) == null) {
            w5VarRemove.a(this.f61573d, a(this.f61579j, this.f61578i), a(this.f61581l, this.f61580k), j10, this.f61585p);
        } else {
            float[] fArrA = a(0.0f, pathMeasure.getLength());
            w5VarRemove.a(this.f61573d, (int) fArrA[0], (int) fArrA[1], j10, this.f61585p);
        }
        synchronized (f61569r) {
            this.f61571b.add(w5VarRemove);
            this.f61577h++;
        }
    }

    private void a(Bitmap bitmap) {
        for (int i10 = 0; i10 < this.f61572c; i10++) {
            this.f61570a.add(new w5(bitmap));
        }
    }

    private void a(@androidx.annotation.n0 Rect rect) {
        int i10 = rect.left - this.f61576g[0];
        this.f61579j = i10;
        this.f61578i = i10 + rect.width();
        int i11 = rect.top - this.f61576g[1];
        this.f61581l = i11;
        this.f61580k = i11 + rect.height();
    }

    private void a(@androidx.annotation.n0 f4 f4Var) {
        if (this.f61585p == null) {
            this.f61585p = new x5();
        }
        this.f61585p.a(f4Var);
    }

    private void a(@androidx.annotation.n0 g4 g4Var) {
        if (this.f61586q == null) {
            this.f61586q = new z5();
        }
        this.f61586q.a(g4Var);
    }

    private float[] a(float f10, float f11) {
        float fA = Float.compare(f10, f11) <= 0 ? n6.a(f11 - f10) + f10 : f11 + n6.a(f10 - f11);
        if (this.f61584o == null) {
            this.f61584o = new PathMeasure(this.f61583n, true);
        }
        float[] fArr = new float[2];
        this.f61584o.getPosTan(fA, fArr, null);
        float f12 = fArr[0];
        int[] iArr = this.f61576g;
        fArr[0] = f12 - iArr[0];
        fArr[1] = fArr[1] - iArr[1];
        return fArr;
    }

    private void b() {
        ArrayList arrayList;
        synchronized (f61569r) {
            arrayList = new ArrayList(this.f61571b);
        }
        this.f61570a.addAll(arrayList);
    }

    public b6 a(int i10, int i11, long j10, long j11, @androidx.annotation.n0 Interpolator interpolator) {
        a(new j5(i10, i11, j10, j11, interpolator));
        return this;
    }

    public void a() {
        b();
    }

    public void a(@androidx.annotation.n0 Rect rect, int i10) {
        a(rect);
        a(i10);
    }

    public b6 b(float f10, float f11) {
        a(new a6(f10, f11));
        return this;
    }

    public void b(long j10) {
        boolean z10 = this.f61574e;
        float f10 = this.f61575f * j10;
        ArrayList arrayList = new ArrayList();
        synchronized (f61569r) {
            while (z10) {
                if (this.f61570a.isEmpty() || this.f61577h >= f10) {
                    break;
                } else {
                    a(j10);
                }
            }
            Iterator<w5> it = this.f61571b.iterator();
            while (it.hasNext()) {
                w5 next = it.next();
                if (!next.a(j10)) {
                    it.remove();
                    arrayList.add(next);
                }
            }
        }
        this.f61570a.addAll(arrayList);
    }

    public List<w5> c() {
        List<w5> listUnmodifiableList;
        synchronized (f61569r) {
            listUnmodifiableList = Collections.unmodifiableList(this.f61571b);
        }
        return listUnmodifiableList;
    }
}
