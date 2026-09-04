package com.huawei.hms.scankit.p;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: OpacityAnimator.java */
/* JADX INFO: loaded from: classes7.dex */
public class j5 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f61999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f62000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f62001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f62002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Interpolator f62003f;

    public j5(int i10, int i11, long j10, long j11, @androidx.annotation.n0 Interpolator interpolator) {
        this.f61998a = i10;
        this.f61999b = i11;
        this.f62000c = j10;
        this.f62001d = j11;
        this.f62002e = j11 - j10;
        this.f62003f = interpolator;
    }

    private int a(@androidx.annotation.n0 w5 w5Var) {
        int i10 = this.f61999b;
        return i10 == -1 ? w5Var.e() : i10;
    }

    private int b(@androidx.annotation.n0 w5 w5Var) {
        int i10 = this.f61998a;
        return i10 == -1 ? w5Var.a() : i10;
    }

    private int c(@androidx.annotation.n0 w5 w5Var) {
        return a(w5Var) - b(w5Var);
    }

    @Override // com.huawei.hms.scankit.p.f4
    public void a(@androidx.annotation.n0 w5 w5Var, long j10) {
        if (j10 < this.f62000c || j10 > this.f62001d || Float.compare(this.f62002e, 0.0f) == 0) {
            return;
        }
        w5Var.a((int) (b(w5Var) + (c(w5Var) * this.f62003f.getInterpolation((j10 - this.f62000c) / this.f62002e))));
    }
}
