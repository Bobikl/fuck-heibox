package com.tencent.liteav.base.b;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f99568a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f99569b;

    public a(long j10) {
        this.f99569b = j10;
    }

    public final boolean a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f99568a;
        if (j10 != 0 && jElapsedRealtime - j10 <= this.f99569b) {
            return false;
        }
        this.f99568a = SystemClock.elapsedRealtime();
        return true;
    }
}
