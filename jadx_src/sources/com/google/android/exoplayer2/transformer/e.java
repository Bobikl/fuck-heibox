package com.google.android.exoplayer2.transformer;

import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: MuxerWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public final class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f50216k = u0.U0(500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f50217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.a f50218b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f50221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f50224h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f50226j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseIntArray f50219c = new SparseIntArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseLongArray f50220d = new SparseLongArray();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50225i = -2;

    public e(d dVar, d.a aVar, String str) {
        this.f50217a = dVar;
        this.f50218b = aVar;
        this.f50221e = str;
    }

    private boolean b(int i10) {
        long j10 = this.f50220d.get(i10, com.google.android.exoplayer2.j.f46377b);
        com.google.android.exoplayer2.util.a.i(j10 != com.google.android.exoplayer2.j.f46377b);
        if (!this.f50224h) {
            return false;
        }
        if (this.f50220d.size() == 1) {
            return true;
        }
        if (i10 != this.f50225i) {
            this.f50226j = u0.S0(this.f50220d);
        }
        return j10 - this.f50226j <= f50216k;
    }

    public void a(a2 a2Var) {
        com.google.android.exoplayer2.util.a.j(this.f50222f > 0, "All tracks should be registered before the formats are added.");
        com.google.android.exoplayer2.util.a.j(this.f50223g < this.f50222f, "All track formats have already been added.");
        String str = a2Var.f43593m;
        boolean z10 = y.p(str) || y.t(str);
        String strValueOf = String.valueOf(str);
        com.google.android.exoplayer2.util.a.j(z10, strValueOf.length() != 0 ? "Unsupported track format: ".concat(strValueOf) : new String("Unsupported track format: "));
        int iL = y.l(str);
        boolean z11 = this.f50219c.get(iL, -1) == -1;
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("There is already a track of type ");
        sb2.append(iL);
        com.google.android.exoplayer2.util.a.j(z11, sb2.toString());
        this.f50219c.put(iL, this.f50217a.c(a2Var));
        this.f50220d.put(iL, 0L);
        int i10 = this.f50223g + 1;
        this.f50223g = i10;
        if (i10 == this.f50222f) {
            this.f50224h = true;
        }
    }

    public void c(int i10) {
        this.f50219c.delete(i10);
        this.f50220d.delete(i10);
    }

    public int d() {
        return this.f50222f;
    }

    public void e() {
        com.google.android.exoplayer2.util.a.j(this.f50223g == 0, "Tracks cannot be registered after track formats have been added.");
        this.f50222f++;
    }

    public void f(boolean z10) {
        this.f50224h = false;
        this.f50217a.a(z10);
    }

    public boolean g(@p0 String str) {
        return this.f50218b.c(str, this.f50221e);
    }

    public boolean h(int i10, @p0 ByteBuffer byteBuffer, boolean z10, long j10) {
        int i11 = this.f50219c.get(i10, -1);
        boolean z11 = i11 != -1;
        StringBuilder sb2 = new StringBuilder(68);
        sb2.append("Could not write sample because there is no track of type ");
        sb2.append(i10);
        com.google.android.exoplayer2.util.a.j(z11, sb2.toString());
        if (!b(i10)) {
            return false;
        }
        if (byteBuffer == null) {
            return true;
        }
        this.f50217a.b(i11, byteBuffer, z10, j10);
        this.f50220d.put(i10, j10);
        this.f50225i = i10;
        return true;
    }
}
