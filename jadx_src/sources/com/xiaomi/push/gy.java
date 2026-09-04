package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class gy extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gx f107238a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gy(gx gxVar, String str) {
        super(str);
        this.f107238a = gxVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f107238a.f107237a.m427a();
        } catch (Exception e10) {
            this.f107238a.c(9, e10);
        }
    }
}
