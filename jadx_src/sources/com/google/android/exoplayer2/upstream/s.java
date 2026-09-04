package com.google.android.exoplayer2.upstream;

import java.util.Arrays;

/* JADX INFO: compiled from: DefaultAllocator.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s implements b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f51219i = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f51220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final byte[] f51222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a[] f51223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f51226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a[] f51227h;

    public s(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public s(boolean z10, int i10, int i11) {
        com.google.android.exoplayer2.util.a.a(i10 > 0);
        com.google.android.exoplayer2.util.a.a(i11 >= 0);
        this.f51220a = z10;
        this.f51221b = i10;
        this.f51226g = i11;
        this.f51227h = new a[i11 + 100];
        if (i11 > 0) {
            this.f51222c = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f51227h[i12] = new a(this.f51222c, i12 * i10);
            }
        } else {
            this.f51222c = null;
        }
        this.f51223d = new a[1];
    }

    @Override // com.google.android.exoplayer2.upstream.b
    public synchronized int a() {
        return this.f51225f * this.f51221b;
    }

    @Override // com.google.android.exoplayer2.upstream.b
    public synchronized void b(a aVar) {
        a[] aVarArr = this.f51223d;
        aVarArr[0] = aVar;
        e(aVarArr);
    }

    @Override // com.google.android.exoplayer2.upstream.b
    public synchronized void c() {
        int i10 = 0;
        int iMax = Math.max(0, com.google.android.exoplayer2.util.u0.m(this.f51224e, this.f51221b) - this.f51225f);
        int i11 = this.f51226g;
        if (iMax >= i11) {
            return;
        }
        if (this.f51222c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a aVar = (a) com.google.android.exoplayer2.util.a.g(this.f51227h[i10]);
                if (aVar.f50928a == this.f51222c) {
                    i10++;
                } else {
                    a aVar2 = (a) com.google.android.exoplayer2.util.a.g(this.f51227h[i12]);
                    if (aVar2.f50928a != this.f51222c) {
                        i12--;
                    } else {
                        a[] aVarArr = this.f51227h;
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            iMax = Math.max(iMax, i10);
            if (iMax >= this.f51226g) {
                return;
            }
        }
        Arrays.fill(this.f51227h, iMax, this.f51226g, (Object) null);
        this.f51226g = iMax;
    }

    @Override // com.google.android.exoplayer2.upstream.b
    public synchronized a d() {
        a aVar;
        this.f51225f++;
        int i10 = this.f51226g;
        if (i10 > 0) {
            a[] aVarArr = this.f51227h;
            int i11 = i10 - 1;
            this.f51226g = i11;
            aVar = (a) com.google.android.exoplayer2.util.a.g(aVarArr[i11]);
            this.f51227h[this.f51226g] = null;
        } else {
            aVar = new a(new byte[this.f51221b], 0);
        }
        return aVar;
    }

    @Override // com.google.android.exoplayer2.upstream.b
    public synchronized void e(a[] aVarArr) {
        int i10 = this.f51226g;
        int length = aVarArr.length + i10;
        a[] aVarArr2 = this.f51227h;
        if (length >= aVarArr2.length) {
            this.f51227h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            a[] aVarArr3 = this.f51227h;
            int i11 = this.f51226g;
            this.f51226g = i11 + 1;
            aVarArr3[i11] = aVar;
        }
        this.f51225f -= aVarArr.length;
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.b
    public int f() {
        return this.f51221b;
    }

    public synchronized void g() {
        if (this.f51220a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f51224e;
        this.f51224e = i10;
        if (z10) {
            c();
        }
    }
}
