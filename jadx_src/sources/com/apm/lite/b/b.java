package com.apm.lite.b;

import android.os.SystemClock;
import com.apm.lite.runtime.m;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f39864d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.apm.lite.b.a f39865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39866b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f39867c;

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (b.this.f39866b) {
                return;
            }
            b.this.f39865a.s();
            long unused = b.f39864d = SystemClock.uptimeMillis();
            m.b().f(b.this.f39867c, 500L);
            com.apm.lite.runtime.b.c(b.f39864d);
        }
    }

    b(com.apm.lite.b.a aVar) {
        a aVar2 = new a();
        this.f39867c = aVar2;
        this.f39865a = aVar;
        m.b().f(aVar2, 5000L);
    }

    public void b() {
        if (this.f39866b) {
            return;
        }
        m.b().f(this.f39867c, 5000L);
    }
}
