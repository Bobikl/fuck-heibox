package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class t0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ q0 f52797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Callable f52798c;

    t0(q0 q0Var, Callable callable) {
        this.f52797b = q0Var;
        this.f52798c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f52797b.z(this.f52798c.call());
        } catch (Exception e10) {
            this.f52797b.y(e10);
        } catch (Throwable th2) {
            this.f52797b.y(new RuntimeException(th2));
        }
    }
}
