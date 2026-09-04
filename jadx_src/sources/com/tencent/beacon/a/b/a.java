package com.tencent.beacon.a.b;

import android.os.Handler;
import androidx.annotation.n0;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: AbsAsyncTask.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static volatile a f98741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f98742b = true;

    /* JADX INFO: renamed from: com.tencent.beacon.a.b.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbsAsyncTask.java */
    public static class C0948a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f98743a = new i();
    }

    public static synchronized a a() {
        if (f98741a == null) {
            f98741a = new i();
        }
        return f98741a;
    }

    public static synchronized void a(@n0 ScheduledExecutorService scheduledExecutorService) {
        if (f98741a == null) {
            f98741a = new i(scheduledExecutorService);
        }
    }

    public static a b() {
        return C0948a.f98743a;
    }

    public abstract Handler a(int i10);

    public abstract void a(int i10, long j10, long j11, @n0 Runnable runnable);

    public abstract void a(int i10, boolean z10);

    public abstract void a(long j10, @n0 Runnable runnable);

    public abstract void a(@n0 Runnable runnable);

    public abstract void a(boolean z10);

    public abstract void b(int i10);

    public void b(boolean z10) {
        this.f98742b = z10;
    }

    public boolean c() {
        return this.f98742b;
    }

    public abstract void d();
}
