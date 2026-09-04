package com.apm.lite.k;

import android.annotation.TargetApi;
import android.app.ActivityManager;

/* JADX INFO: loaded from: classes6.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final b f40070a = new c();

    public static class b {
        private b() {
        }

        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }
    }

    @TargetApi(16)
    public static class c extends b {
        private c() {
            super();
        }

        @Override // com.apm.lite.k.n.b
        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    public static long a(ActivityManager.MemoryInfo memoryInfo) {
        return f40070a.a(memoryInfo);
    }
}
