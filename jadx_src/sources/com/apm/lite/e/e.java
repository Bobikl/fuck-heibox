package com.apm.lite.e;

import com.apm.lite.k.r;

/* JADX INFO: loaded from: classes6.dex */
public class e {
    public static boolean a(long j10) {
        if (r.c(2)) {
            return true;
        }
        if (r.c(1024)) {
            return false;
        }
        return (com.apm.lite.runtime.a.b.s() == -1 || j10 - com.apm.lite.runtime.a.b.s() <= com.apm.lite.e.o().getLaunchCrashInterval()) && !(com.apm.lite.e.s() && com.apm.lite.e.v() == 0);
    }
}
