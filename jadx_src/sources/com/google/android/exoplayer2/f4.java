package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: WakeLockManager.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f46224e = "WakeLockManager";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f46225f = "ExoPlayer:WakeLockManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final PowerManager f46226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private PowerManager.WakeLock f46227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f46229d;

    public f4(Context context) {
        this.f46226a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private void c() {
        PowerManager.WakeLock wakeLock = this.f46227b;
        if (wakeLock == null) {
            return;
        }
        if (this.f46228c && this.f46229d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f46227b == null) {
            PowerManager powerManager = this.f46226a;
            if (powerManager == null) {
                com.google.android.exoplayer2.util.u.m(f46224e, "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, f46225f);
                this.f46227b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f46228c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f46229d = z10;
        c();
    }
}
