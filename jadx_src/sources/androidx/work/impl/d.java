package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;

/* JADX INFO: compiled from: DefaultRunnableScheduler.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class d implements androidx.work.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f28948a;

    public d() {
        this.f28948a = androidx.core.os.l.a(Looper.getMainLooper());
    }

    @j1
    public d(@androidx.annotation.n0 Handler handler) {
        this.f28948a = handler;
    }

    @Override // androidx.work.v
    public void a(@androidx.annotation.n0 Runnable runnable) {
        this.f28948a.removeCallbacks(runnable);
    }

    @Override // androidx.work.v
    public void b(long j10, @androidx.annotation.n0 Runnable runnable) {
        this.f28948a.postDelayed(runnable, j10);
    }

    @androidx.annotation.n0
    public Handler c() {
        return this.f28948a;
    }
}
