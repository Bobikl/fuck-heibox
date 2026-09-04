package com.alipay.apmobilesecuritysdk.f;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f38192a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f38193b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedList<Runnable> f38194c = new LinkedList<>();

    public static b a() {
        return f38192a;
    }

    public static /* synthetic */ Thread b(b bVar) {
        bVar.f38193b = null;
        return null;
    }

    public final synchronized void a(Runnable runnable) {
        this.f38194c.add(runnable);
        if (this.f38193b == null) {
            Thread thread = new Thread(new c(this));
            this.f38193b = thread;
            thread.start();
        }
    }
}
