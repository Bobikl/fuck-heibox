package com.apm.lite.k;

import android.annotation.TargetApi;
import android.os.Debug;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final b f40052a = new C0311c();

    public static class b {
        private b() {
        }

        public int a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: com.apm.lite.k.c$c, reason: collision with other inner class name */
    @TargetApi(19)
    public static class C0311c extends b {
        private C0311c() {
            super();
        }

        @Override // com.apm.lite.k.c.b
        public int a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.apm.lite.k.c.b
        public int b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.apm.lite.k.c.b
        public int c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    public static int a(Debug.MemoryInfo memoryInfo) {
        return f40052a.a(memoryInfo);
    }

    public static int b(Debug.MemoryInfo memoryInfo) {
        return f40052a.b(memoryInfo);
    }

    public static int c(Debug.MemoryInfo memoryInfo) {
        return f40052a.c(memoryInfo);
    }
}
