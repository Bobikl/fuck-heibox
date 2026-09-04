package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: OpenDeviceId.java */
/* JADX INFO: loaded from: classes4.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static z f104390a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f104391b = false;

    public static synchronized String a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            b(context);
            z zVar = f104390a;
            if (zVar != null) {
                try {
                    return zVar.a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void b(Context context) {
        if (f104390a != null || f104391b) {
            return;
        }
        synchronized (aa.class) {
            if (f104390a == null && !f104391b) {
                f104390a = ac.a(context);
                f104391b = true;
            }
        }
    }
}
