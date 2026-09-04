package com.tencent.thumbplayer.tcmedia.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f103143b;

    public void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f103142a = jElapsedRealtime;
        this.f103143b = jElapsedRealtime;
    }

    public void b() {
        this.f103143b = SystemClock.elapsedRealtime();
    }

    public long c() {
        return SystemClock.elapsedRealtime() - this.f103143b;
    }

    public long d() {
        return SystemClock.elapsedRealtime() - this.f103142a;
    }

    public long e() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f103143b;
        this.f103143b = jElapsedRealtime;
        return j10;
    }
}
