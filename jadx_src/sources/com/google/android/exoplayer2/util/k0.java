package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: SystemClock.java */
/* JADX INFO: loaded from: classes7.dex */
public class k0 implements e {
    protected k0() {
    }

    @Override // com.google.android.exoplayer2.util.e
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.exoplayer2.util.e
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.exoplayer2.util.e
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.google.android.exoplayer2.util.e
    public void d() {
    }

    @Override // com.google.android.exoplayer2.util.e
    public p e(Looper looper, @androidx.annotation.p0 Handler.Callback callback) {
        return new l0(new Handler(looper, callback));
    }
}
