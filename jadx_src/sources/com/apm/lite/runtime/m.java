package com.apm.lite.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile r f40201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f40202b;

    public static HandlerThread a() {
        if (f40201a == null) {
            synchronized (m.class) {
                if (f40201a == null) {
                    f40201a = new r("default_npth_thread");
                    f40201a.i();
                }
            }
        }
        return f40201a.l();
    }

    public static r b() {
        if (f40201a == null) {
            a();
        }
        return f40201a;
    }
}
