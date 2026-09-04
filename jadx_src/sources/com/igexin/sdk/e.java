package com.igexin.sdk;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f64094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ PushManager f64095b;

    e(PushManager pushManager, Context context) {
        this.f64095b = pushManager;
        this.f64094a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Application applicationD = this.f64095b.d(this.f64094a);
            if (applicationD == null) {
                return;
            }
            applicationD.unregisterActivityLifecycleCallbacks(this.f64095b.f64080i);
            this.f64095b.f64080i = null;
        } catch (Throwable unused) {
        }
    }
}
