package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: compiled from: WifiLockManager.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f46232e = "WifiLockManager";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f46233f = "ExoPlayer:WifiLockManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final WifiManager f46234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private WifiManager.WifiLock f46235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f46237d;

    public g4(Context context) {
        this.f46234a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f46235b;
        if (wifiLock == null) {
            return;
        }
        if (this.f46236c && this.f46237d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f46235b == null) {
            WifiManager wifiManager = this.f46234a;
            if (wifiManager == null) {
                com.google.android.exoplayer2.util.u.m(f46232e, "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, f46233f);
                this.f46235b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f46236c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f46237d = z10;
        c();
    }
}
