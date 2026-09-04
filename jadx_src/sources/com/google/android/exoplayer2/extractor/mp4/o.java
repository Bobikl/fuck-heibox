package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Track.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f45550l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f45551m = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2 f45557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    public final long[] f45559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    public final long[] f45560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f45561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private final p[] f45562k;

    /* JADX INFO: compiled from: Track.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public o(int i10, int i11, long j10, long j11, long j12, a2 a2Var, int i12, @p0 p[] pVarArr, int i13, @p0 long[] jArr, @p0 long[] jArr2) {
        this.f45552a = i10;
        this.f45553b = i11;
        this.f45554c = j10;
        this.f45555d = j11;
        this.f45556e = j12;
        this.f45557f = a2Var;
        this.f45558g = i12;
        this.f45562k = pVarArr;
        this.f45561j = i13;
        this.f45559h = jArr;
        this.f45560i = jArr2;
    }

    public o a(a2 a2Var) {
        return new o(this.f45552a, this.f45553b, this.f45554c, this.f45555d, this.f45556e, a2Var, this.f45558g, this.f45562k, this.f45561j, this.f45559h, this.f45560i);
    }

    @p0
    public p b(int i10) {
        p[] pVarArr = this.f45562k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i10];
    }
}
