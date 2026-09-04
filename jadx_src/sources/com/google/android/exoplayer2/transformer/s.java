package com.google.android.exoplayer2.transformer;

import android.util.SparseLongArray;
import androidx.annotation.w0;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: TransformerMediaClock.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public final class s implements com.google.android.exoplayer2.util.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseLongArray f50334b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50335c;

    public void a(int i10, long j10) {
        long j11 = this.f50334b.get(i10, com.google.android.exoplayer2.j.f46377b);
        if (j11 == com.google.android.exoplayer2.j.f46377b || j10 > j11) {
            this.f50334b.put(i10, j10);
            if (j11 == com.google.android.exoplayer2.j.f46377b || j11 == this.f50335c) {
                this.f50335c = u0.S0(this.f50334b);
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.w
    public void e(b3 b3Var) {
    }

    @Override // com.google.android.exoplayer2.util.w
    public b3 g() {
        return b3.f44367e;
    }

    @Override // com.google.android.exoplayer2.util.w
    public long s() {
        return this.f50335c;
    }
}
