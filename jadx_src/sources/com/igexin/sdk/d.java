package com.igexin.sdk;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f64092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ PushManager f64093b;

    d(PushManager pushManager, Context context) {
        this.f64093b = pushManager;
        this.f64092a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r3 = this;
            com.igexin.sdk.PushManager r0 = r3.f64093b     // Catch: java.lang.Throwable -> L2c
            android.content.Context r1 = r3.f64092a     // Catch: java.lang.Throwable -> L2c
            android.app.Application r0 = com.igexin.sdk.PushManager.a(r0, r1)     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto Lb
            return
        Lb:
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L2c
            com.igexin.sdk.PushManager r1 = r3.f64093b     // Catch: java.lang.Throwable -> L29
            com.igexin.push.core.g r1 = com.igexin.sdk.PushManager.a(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L27
            com.igexin.sdk.PushManager r1 = r3.f64093b     // Catch: java.lang.Throwable -> L29
            com.igexin.push.core.g r2 = new com.igexin.push.core.g     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            com.igexin.sdk.PushManager.a(r1, r2)     // Catch: java.lang.Throwable -> L29
            com.igexin.sdk.PushManager r1 = r3.f64093b     // Catch: java.lang.Throwable -> L29
            com.igexin.push.core.g r1 = com.igexin.sdk.PushManager.a(r1)     // Catch: java.lang.Throwable -> L29
            r0.registerActivityLifecycleCallbacks(r1)     // Catch: java.lang.Throwable -> L29
        L27:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            goto L2c
        L29:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.sdk.d.run():void");
    }
}
