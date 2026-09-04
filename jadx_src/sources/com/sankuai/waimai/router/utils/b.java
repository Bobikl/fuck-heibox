package com.sankuai.waimai.router.utils;

import android.os.SystemClock;

/* JADX INFO: compiled from: LazyInitHelper.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f96560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f96561b = false;

    public b(String str) {
        this.f96560a = str;
    }

    private void d() {
        if (this.f96561b) {
            return;
        }
        synchronized (this) {
            if (!this.f96561b) {
                boolean zH = com.sankuai.waimai.router.core.c.h();
                long jUptimeMillis = zH ? SystemClock.uptimeMillis() : 0L;
                try {
                    a();
                    this.f96561b = true;
                } catch (Throwable th2) {
                    com.sankuai.waimai.router.core.c.e(th2);
                }
                if (zH) {
                    com.sankuai.waimai.router.core.c.f("%s init cost %s ms", this.f96560a, Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                }
            }
        }
    }

    protected abstract void a();

    public void b() {
        d();
    }

    public void c() {
        d();
    }
}
